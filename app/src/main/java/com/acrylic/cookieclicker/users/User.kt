package com.acrylic.cookieclicker.users

import java.util.*

data class User(override val id: UUID, override var username: String) : AbstractUser(id,username) {

    companion object Loader {

        fun load(id: String) {

        }

    }

}

