package com.acrylic.cookieclicker.images

import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

interface DisplayIcon {

    var imageViewId: Int

    fun getImage(appCompactActivity: AppCompatActivity) : ImageView? {
        return appCompactActivity.findViewById(imageViewId)
    }

    fun getNewImage(appCompactActivity: AppCompatActivity) : ImageView? {
        val iw = ImageView(appCompactActivity)
        iw.setImageResource(imageViewId)
        return iw
    }

    fun addNewImage(appCompactActivity: AppCompatActivity, layout: ViewGroup.LayoutParams) : ImageView? {
        val iw = getNewImage(appCompactActivity)
        appCompactActivity.addContentView(iw,layout)
        return iw
    }

}