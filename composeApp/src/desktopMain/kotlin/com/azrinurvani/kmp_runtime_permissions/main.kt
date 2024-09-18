package com.azrinurvani.kmp_runtime_permissions

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMP-Runtime-Permissions",
    ) {
        App()
    }
}