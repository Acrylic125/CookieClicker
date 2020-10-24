package com.acrylic.cookieclicker.users

import com.acrylic.cookieclicker.FilePath
import files.FileFactory
import files.editor.FileEditor
import java.util.function.Consumer

interface PersistentUser : BaseUser {

    fun saveUser()

    fun editUser(fileAction: Consumer<FileEditor>, shouldSave: Boolean) {
        val file = FileFactory.getAbstractFile("${FilePath.USER_DIRECTORY.path}${id}.json")
        val editor = file.fileEditor
        fileAction.accept(editor)
        if (shouldSave) file.saveFile()
    }

    fun loadUser(fileSaveAction: Consumer<FileEditor>) {
        editUser(fileSaveAction,false)
    }

    fun saveUser(fileSaveAction: Consumer<FileEditor>) {
        editUser(fileSaveAction,true)
    }

}