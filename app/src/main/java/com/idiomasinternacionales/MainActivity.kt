package com.idiomasinternacionales

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< HEAD
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
=======
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.idiomasinternacionales.ui.navigation.MainNavHost
import com.idiomasinternacionales.ui.theme.IdiomasTheme

>>>>>>> d12947f (Limpieza de repositorios duplicados y configuración Gradle moderna)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
<<<<<<< HEAD
            AppTheme {
                Navigation()
=======
            IdiomasTheme(darkTheme = true) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MainNavHost()
                }
>>>>>>> d12947f (Limpieza de repositorios duplicados y configuración Gradle moderna)
            }
        }
    }
}
