package com.example.module_privides_binding_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.module_privides_binding_compose.ui.theme.Module_Privides_binding_composeTheme
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var userResistaionService: UserResistaionService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Module_Privides_binding_composeTheme {
               Surface(
                   modifier = Modifier.fillMaxSize(),
                   color = Color.White
               ) {

                   val component = DaggerConsumerComponent.builder().build()
                   component.injectMainAC(this)
                   userResistaionService.resisterUser("","")

               }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Module_Privides_binding_composeTheme {

    }
}