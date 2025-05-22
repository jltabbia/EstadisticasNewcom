package ar.com.jtsistemas.estadisticasnewcom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import ar.com.jtsistemas.estadisticasnewcom.ui.theme.EstadisticasNewcomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstadisticasNewcomTheme {
                EstadisticasNewcomTheme {
                    Text("Algo para mostrar")
                }
            }
        }
    }
}

