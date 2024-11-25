package com.example.canvas

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class HeartView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private val paint: Paint = Paint().apply {
        color = Color.RED
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val heartPath = Path().apply {
            moveTo(300f, 400f)
            cubicTo(150f, 200f, 50f, 300f, 300f, 500f)
            cubicTo(550f, 300f, 450f, 200f, 300f, 400f)
        }

        canvas.drawPath(heartPath, paint)

        val spaceBetween = 50f

        paint.color = Color.BLUE
        canvas.drawCircle(300f, 200f, 100f, paint)

        paint.color = Color.RED
        val path = Path().apply {
            moveTo(300f, 400f)
            cubicTo(150f, 200f, 50f, 300f, 300f, 500f)
            cubicTo(550f, 300f, 450f, 200f, 300f, 400f)
        }

        canvas.drawPath(path, paint)

        val trianglePath = Path().apply {
            moveTo(150f, 500f + spaceBetween)
            lineTo(300f, 600f + spaceBetween)
            lineTo(450f, 500f + spaceBetween)
            close()
        }

        paint.color = Color.BLACK
        canvas.drawPath(trianglePath, paint)
    }
}
