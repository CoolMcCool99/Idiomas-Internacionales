package com.idiomasinternacionales.utils;

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
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\r\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/idiomasinternacionales/utils/SecurityUtils;", "", "()V", "ANDROID_KEYSTORE", "", "KEY_ALIAS", "TRANSFORMATION", "decrypt", "", "encryptedData", "iv", "encrypt", "Lkotlin/Pair;", "data", "generateKey", "", "getSecretKey", "Ljavax/crypto/SecretKey;", "app_release"})
public final class SecurityUtils {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String ANDROID_KEYSTORE = "AndroidKeyStore";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_ALIAS = "IdiomasKey";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TRANSFORMATION = "AES/GCM/NoPadding";
    @org.jetbrains.annotations.NotNull()
    public static final com.idiomasinternacionales.utils.SecurityUtils INSTANCE = null;
    
    private SecurityUtils() {
        super();
    }
    
    /**
     * Genera una clave AES segura en el Keystore si no existe.
     */
    public final void generateKey() {
    }
    
    /**
     * Obtiene la clave secreta almacenada en el Keystore.
     */
    @org.jetbrains.annotations.NotNull()
    public final javax.crypto.SecretKey getSecretKey() {
        return null;
    }
    
    /**
     * Cifra datos usando AES/GCM/NoPadding.
     * @param data Datos a cifrar.
     * @return Par de datos cifrados y vector de inicialización (IV).
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<byte[], byte[]> encrypt(@org.jetbrains.annotations.NotNull()
    byte[] data) {
        return null;
    }
    
    /**
     * Descifra datos usando AES/GCM/NoPadding.
     * @param encryptedData Datos cifrados.
     * @param iv Vector de inicialización usado en el cifrado.
     * @return Datos descifrados.
     */
    @org.jetbrains.annotations.NotNull()
    public final byte[] decrypt(@org.jetbrains.annotations.NotNull()
    byte[] encryptedData, @org.jetbrains.annotations.NotNull()
    byte[] iv) {
        return null;
    }
}