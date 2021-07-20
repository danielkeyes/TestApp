package dev.danielkeyes.testapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.danielkeyes.testapp.rxjava.RxJavaPage
import dev.danielkeyes.testapp.ui.theme.TestAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            TestAppTheme {

                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "mainPage") {
                    composable("mainPage") { MainPage(navController) }
                    composable("rxJavaRoute") { RxJavaPage() }
                    composable("Unimplemented") { UnimplementedPage() }
                }
            }
        }
    }
}

@Composable
fun MainPage(navController: NavController) {
    TestAppTheme {
        Column {
            NavButton(navController = navController, route = "rxJavaRoute", "RxJava")
            NavButton(navController = navController, route = "Unimplemented", "Unimplemented")
            NavButton(navController = navController, route = "Unimplemented", "Unimplemented")
            NavButton(navController = navController, route = "Unimplemented", "Unimplemented")
            NavButton(navController = navController, route = "Unimplemented", "Unimplemented")
            NavButton(navController = navController, route = "Unimplemented", "Unimplemented")
        }
    }
}

@Composable
fun UnimplementedPage() {
    Text(text = "For Future Use")
}

@Composable
fun NavButton(navController: NavController, route: String, text: String) {
    Button(
        modifier = Modifier.padding(8.dp),
        onClick = { navController.navigate(route) }
    ) {
        Text(text = text, style = MaterialTheme.typography.button)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestAppTheme {
        MainPage(rememberNavController())
    }
}