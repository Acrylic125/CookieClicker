package com.acrylic.cookieclicker.weblinks

import android.content.Intent
import android.net.Uri
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.acrylic.cookieclicker.images.DisplayIcon

abstract class AbstractPredefinedWebLink(link: String) : AbstractLink(link), DisplayIcon {

    companion object Retrieve {
        fun getLink(link: String) : AbstractPredefinedWebLink {
            val str = link.toLowerCase()
            return if (str.contains("youtube.com")) YoutubeLink(link)
            else if (str.contains("twitter.com")) TwitterLink(link)
            else if (str.contains("instagram.com")) InstagramLink(link)
            else EmptyLink(link)
        }
    }

    override fun addNewImage(appCompactActivity: AppCompatActivity, layout: ViewGroup.LayoutParams): ImageView? {
        val iw = super.addNewImage(appCompactActivity, layout)
        if (iw == null) return iw
        iw.setOnClickListener{
            val uri = Uri.parse(super.link)
            val intent = Intent(Intent.ACTION_VIEW, uri)
            appCompactActivity.startActivity(intent)
        }
        return iw
    }

}