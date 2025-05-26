package ar.com.jtsistemas.estadisticasnewcom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ar.com.jtsistemas.estadisticasnewcom.ui.components.views.MainScaffold
import ar.com.jtsistemas.estadisticasnewcom.ui.theme.EstadisticasNewcomTheme

// Agregue una linea en blanco

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstadisticasNewcomTheme {
                MainScaffold()

            }
        }
    }
}

