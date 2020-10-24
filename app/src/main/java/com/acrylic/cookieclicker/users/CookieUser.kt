package com.acrylic.cookieclicker.users

import files.editor.FileEditor
import java.util.function.Consumer

interface CookieUser : PersistentUser {

    /**
     * How much cookies the user have.
     */
    var cookies: Double

    var cookiesPerSecond: Double

    var cookiesPerClick: Double

    var lastClicked: Long

    fun click()

    override fun loadUser(fileSaveAction: Consumer<FileEditor>) {
        super.loadUser{ filedEditor ->
            val cookieUser = filedEditor.getFileEditor("cookieUser")
            //CookieUser
            cookies = cookieUser.getDouble("cookies")
            lastClicked = filedEditor.getLong("lastClicked")
            //File
            lastLogged = filedEditor.getLong("lastLogged")
        }
    }

    override fun saveUser() {
        saveUser{ filedEditor ->
            val cookieUser = HashMap<String,Any>()
            //CookieUser
            cookieUser["cookies"] = cookies
            cookieUser["lastClicked"] = lastClicked
            //File
            filedEditor["id"] = id
            filedEditor["username"] = username
            filedEditor["lastLogged"] = lastLogged
            filedEditor["cookieUser"] = cookieUser
        }
    }

}