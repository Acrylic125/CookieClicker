package com.acrylic.cookieclicker.weblinks

abstract class AbstractLink(var link: String) {

    init {
        if (!link.startsWith("http://") && !link.startsWith("https://")) link = "http://$link"
    }

}

