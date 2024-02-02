package com.example.android_fixedgestures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    var gDetector: GestureDetectorCompat? = null

    lateinit var tappableText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.gDetector = GestureDetectorCompat(this, this)

        gDetector?.setOnDoubleTapListener(this)

        tappableText = findViewById(R.id.txtBox)
    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        tappableText.text = "The Text been Tapped"
        return true
    }

    override fun onShowPress(e: MotionEvent) {
        //TODO("Not yet implemented")
    }

    override fun onSingleTapUp(e: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        return true

    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        //TODO("Not yet implemented")
        tappableText.text = "scrollin"
        return true

    }

    override fun onLongPress(e: MotionEvent) {
        TODO("Not yet implemented")
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        //TODO("Not yet implemented")
        tappableText.text = "The Text been flinged away"

        return true

    }

    override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        return true

    }

    override fun onDoubleTap(e: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        tappableText.text = "Double Trouble"

        return true

    }

    override fun onDoubleTapEvent(e: MotionEvent): Boolean {
        //TODO("Not yet implemented")
        tappableText.text = "Double Trouble"

        return true

    }
}