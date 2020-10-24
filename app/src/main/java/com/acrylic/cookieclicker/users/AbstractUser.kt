package com.acrylic.cookieclicker.users

import java.util.*

abstract class AbstractUser(override val id: UUID, override var username: String) : CookieUser {

    override var lastLogged: Long = 0
    override var lastClicked: Long = 0

    override var cookies: Double = 0.0
    override var cookiesPerSecond: Double = 0.0
    override var cookiesPerClick: Double = 0.0
        set(value) {
            field = 0.0.coerceAtLeast(value)
        }

    override fun click() {
        cookies += cookiesPerClick
    }

    override fun join() {
        TODO("Not yet implemented")
    }

    override fun quit() {

    }
}