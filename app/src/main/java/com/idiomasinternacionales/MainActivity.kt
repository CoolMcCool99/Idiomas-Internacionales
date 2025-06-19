package com.idiomasinternacionales

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< HEAD
=======
<<<<<<< HEAD
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
=======
>>>>>>> 314a47e
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.idiomasinternacionales.ui.navigation.MainNavHost
import com.idiomasinternacionales.ui.theme.IdiomasTheme

<<<<<<< HEAD
=======
>>>>>>> d12947f (Limpieza de repositorios duplicados y configuración Gradle moderna)
>>>>>>> 314a47e
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
<<<<<<< HEAD
=======
<<<<<<< HEAD
            AppTheme {
                Navigation()
=======
>>>>>>> 314a47e
            IdiomasTheme(darkTheme = true) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MainNavHost()
                }
<<<<<<< HEAD
=======
>>>>>>> d12947f (Limpieza de repositorios duplicados y configuración Gradle moderna)
>>>>>>> 314a47e
            }
        }
    }
}
