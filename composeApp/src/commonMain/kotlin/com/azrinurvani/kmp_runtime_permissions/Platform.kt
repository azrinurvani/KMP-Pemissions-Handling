package com.azrinurvani.kmp_runtime_permissions

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform