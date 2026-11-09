package br.unasp.meusgastos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import br.unasp.meusgastos.model.theme.MeusGastosTheme
import br.unasp.meusgastos.ui.TelaGastos

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeusGastosTheme(dynamicColor = false) {
                Surface(modifier = Modifier.fillMaxSize()) {
                    TelaGastos()
                }
            }
        }
    }
}
