package com.acrylic.cookieclicker.credits

sealed class Credits {

    companion object Test : Credits() {

    }

    val credited = ArrayList<CreditedAuthor>()

    fun modifyCredit(creditAuthor: CreditedAuthor) {

    }

}