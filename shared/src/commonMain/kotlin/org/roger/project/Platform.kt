package org.roger.project

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform