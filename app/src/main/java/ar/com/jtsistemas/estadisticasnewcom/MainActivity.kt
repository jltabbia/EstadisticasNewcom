package ar.com.jtsistemas.estadisticasnewcom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import ar.com.jtsistemas.estadisticasnewcom.ui.components.MainScaffold
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

