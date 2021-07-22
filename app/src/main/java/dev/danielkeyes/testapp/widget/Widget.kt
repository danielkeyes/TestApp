package dev.danielkeyes.testapp.widget

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import dev.danielkeyes.testapp.ui.theme.TestAppTheme

@Composable
fun WidgetSettingsPage() {
    TestAppTheme() {
        Text(text = "Widget")
    }
}
