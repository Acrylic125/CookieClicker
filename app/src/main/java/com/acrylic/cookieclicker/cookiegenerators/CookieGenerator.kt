package com.acrylic.cookieclicker.cookiegenerators

import com.acrylic.cookieclicker.users.CookieUser

interface CookieGenerator {

    var quantity: Long

    var production: Double

    fun produce(user: CookieUser) {
        user.cookies += (quantity * production)
    }

}