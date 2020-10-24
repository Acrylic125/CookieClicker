package com.acrylic.cookieclicker.users

import java.util.*

interface BaseUser {

    val id: UUID

    var username: String

    var lastLogged: Long

    fun join()

    fun quit()

}