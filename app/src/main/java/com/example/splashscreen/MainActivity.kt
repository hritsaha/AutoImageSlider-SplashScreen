package com.example.splashscreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_SplashScreen)
        setContentView(R.layout.activity_main)

        val imageSlider : ImageSlider = findViewById(R.id.imageslider)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://images.unsplash.com/photo-1633443732847-a7ef42868dfc?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1170&q=80","Mustang"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1633427370898-c40eceefb26c?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=880&q=80","Mazda"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1626413715168-04a49227fe92?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=761&q=80","Lambo"))
        imageList.add(SlideModel("https://images.unsplash.com/photo-1633421878789-30435a5f7ea8?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=880&q=80","Ferrari"))

        imageSlider.setImageList(imageList,ScaleTypes.FIT)
    }
}