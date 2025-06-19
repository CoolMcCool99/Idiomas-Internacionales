package com.idiomasinternacionales.utils

import android.content.Context
import android.os.Build
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import java.security.KeyStore
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.spec.GCMParameterSpec

/**
 * Utilidad para operaciones de cifrado seguro usando Android Keystore.
 * Incluye generación de claves, cifrado y descifrado con AES/GCM/NoPadding.
 *
 * Ejemplo de uso:
 * ```kotlin
 * SecurityUtils.generateKey()
 * val (encrypted, iv) = SecurityUtils.encrypt(data)
 * val decrypted = SecurityUtils.decrypt(encrypted, iv)
 * ```
 */
object SecurityUtils {
    private const val ANDROID_KEYSTORE = "AndroidKeyStore"
    private const val KEY_ALIAS = "IdiomasKey"
    private const val TRANSFORMATION = "AES/GCM/NoPadding"

    /**
     * Genera una clave AES segura en el Keystore si no existe.
     */
    fun generateKey() {
        val keyGenerator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, ANDROID_KEYSTORE)
        val keyGenParameterSpec = KeyGenParameterSpec.Builder(
            KEY_ALIAS,
            KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT
        )
            .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
            .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
            .setUserAuthenticationRequired(false)
            .build()
        keyGenerator.init(keyGenParameterSpec)
        keyGenerator.generateKey()
    }

    /**
     * Obtiene la clave secreta almacenada en el Keystore.
     */
    fun getSecretKey(): SecretKey {
        val keyStore = KeyStore.getInstance(ANDROID_KEYSTORE)
        keyStore.load(null)
        return keyStore.getKey(KEY_ALIAS, null) as SecretKey
    }

    /**
     * Cifra datos usando AES/GCM/NoPadding.
     * @param data Datos a cifrar.
     * @return Par de datos cifrados y vector de inicialización (IV).
     */
    fun encrypt(data: ByteArray): Pair<ByteArray, ByteArray> {
        val cipher = Cipher.getInstance(TRANSFORMATION)
        cipher.init(Cipher.ENCRYPT_MODE, getSecretKey())
        val iv = cipher.iv
        val encrypted = cipher.doFinal(data)
        return Pair(encrypted, iv)
    }

    /**
     * Descifra datos usando AES/GCM/NoPadding.
     * @param encryptedData Datos cifrados.
     * @param iv Vector de inicialización usado en el cifrado.
     * @return Datos descifrados.
     */
    fun decrypt(encryptedData: ByteArray, iv: ByteArray): ByteArray {
        val cipher = Cipher.getInstance(TRANSFORMATION)
        val spec = GCMParameterSpec(128, iv)
        cipher.init(Cipher.DECRYPT_MODE, getSecretKey(), spec)
        return cipher.doFinal(encryptedData)
    }
}
