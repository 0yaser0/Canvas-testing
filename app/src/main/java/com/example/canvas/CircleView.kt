package com.example.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Color
import android.util.AttributeSet
import android.view.View

class CircleView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var xPosition = 500f
    private var yPosition = 500f
    private val radius = 100f
    private val paint = Paint()

    init {
        paint.color = Color.BLUE
        paint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawCircle(xPosition, yPosition, radius, paint)
    }

    fun moveUp() {
        yPosition -= 50f
        invalidate()
    }

    fun moveDown() {
        yPosition += 50f
        invalidate()
    }

    fun moveLeft() {
        xPosition -= 50f
        invalidate()
    }

    fun moveRight() {
        xPosition += 50f
        invalidate()
    }
}
