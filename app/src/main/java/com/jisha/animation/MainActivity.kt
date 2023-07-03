package com.jisha.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.jisha.animation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        handleEvents()
    }

    private fun handleEvents(){
        binding?.fadeIn?.setOnClickListener {
            binding!!.textView.visibility = View.VISIBLE
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            binding!!.textView.startAnimation(animationFadeIn)
        }
        binding?.fadeOut?.setOnClickListener {
            binding!!.textView.visibility = View.VISIBLE
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            binding!!.textView.startAnimation(animationFadeOut)
        }
        binding?.zoomIn?.setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            binding!!.textView.startAnimation(animationZoomIn)
        }
        binding?.zoomOut?.setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            binding!!.textView.startAnimation(animationZoomOut)
        }
        binding?.slideDown?.setOnClickListener {
            val animationSlideDown = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            binding!!.textView.startAnimation(animationSlideDown)
        }
        binding?.slideUp?.setOnClickListener {
            val animationSlideUp = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            binding!!.textView.startAnimation(animationSlideUp)
        }
        binding?.bounce?.setOnClickListener {
            val animationBounce = AnimationUtils.loadAnimation(this, R.anim.bounce)
            binding!!.textView.startAnimation(animationBounce)
        }
        binding?.rotate?.setOnClickListener {
            val animationRotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
            binding!!.textView.startAnimation(animationRotate)
        }
    }
}