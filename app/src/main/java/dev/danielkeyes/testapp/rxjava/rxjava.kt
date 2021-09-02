package dev.danielkeyes.testapp.rxjava

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.danielkeyes.testapp.api.RandomUser
import dev.danielkeyes.testapp.ui.theme.TestAppTheme

@Composable
fun RxJavaPage(randomUserViewModel: RandomUserViewModel) {

    val randomUser: RandomUser? by randomUserViewModel.randomUser.observeAsState()

    TestAppTheme() {
        Column() {
            Text(text = "RxJava", modifier = Modifier.padding(8.dp))
            Button(
                onClick = { randomUserViewModel.refreshRandomUser() },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "Refresh Data")
            }
            randomUserViewModel.randomUser?.value?.name?.first?.let {
                Text(text = it)
            }
        }
    }
}