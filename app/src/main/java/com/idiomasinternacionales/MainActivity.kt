package com.idiomasinternacionales

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.idiomasinternacionales.ui.navigation.MainNavHost
import com.idiomasinternacionales.ui.theme.IdiomasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IdiomasTheme(darkTheme = true) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    MainNavHost()
                }
            }
        }
    }
}
