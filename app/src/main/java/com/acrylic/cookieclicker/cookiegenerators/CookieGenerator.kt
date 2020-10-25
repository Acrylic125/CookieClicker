package com.acrylic.cookieclicker.cookiegenerators

import com.acrylic.cookieclicker.images.DisplayIcon

interface CookieGenerator : DisplayIcon {

    val productionPerSecond: Double

}