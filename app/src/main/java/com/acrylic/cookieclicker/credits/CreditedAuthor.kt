package com.acrylic.cookieclicker.credits

import com.acrylic.cookieclicker.weblinks.AbstractLink

data class CreditedAuthor(val author: String) {

    private var credits: String = ""
    private var link: ArrayList<AbstractLink> = ArrayList()

    fun setCredits(credits: String) : CreditedAuthor {
        this.credits = credits
        return this
    }

    fun setLink(link: AbstractLink) : CreditedAuthor {
        this.link.add(link)
        return this
    }

}