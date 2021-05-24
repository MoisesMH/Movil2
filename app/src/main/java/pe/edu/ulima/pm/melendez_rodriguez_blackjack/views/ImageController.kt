package pe.edu.ulima.pm.melendez_rodriguez_blackjack.views

import android.content.Context
import android.graphics.*
import android.util.Log
import android.view.MotionEvent
import android.view.View
import pe.edu.ulima.pm.melendez_rodriguez_blackjack.R
import java.util.*

class Objects(context: Context?) : View(context) {
//    private val myPaint: Paint
//    val C_DIV = "DIV"
//    val C_TABLE = "Table"
//    val C_IFRAME = "iFrame"
//    val C_LIST = "List"
//    private val canvas: Canvas? = null
//    private val divimg = BitmapFactory.decodeResource(resources, R.drawable.div)
//    private val iframeimg = BitmapFactory.decodeResource(resources, R.drawable.iframe)
//    private val images: MutableList<Bitmap>
//    private val xs: MutableList<Float>
//    private val ys: MutableList<Float>
//    private val objectNames: MutableList<String>
//    fun HTMLObjects(`object`: String) {
//        Log.d(`object`, "see")
//        if (`object` == C_DIV) {
//            myPaint.color = Color.GREEN
//            images.add(Bitmap.createBitmap(divimg))
//            objectNames.add("DIV")
//            xs.add(0f)
//            ys.add(0f)
//        }
//        if (`object` == C_IFRAME) {
//            myPaint.color = Color.BLUE
//            images.add(Bitmap.createBitmap(iframeimg))
//            objectNames.add("iFrame")
//            xs.add(0f)
//            ys.add(0f)
//        }
//    }
//
//    override fun onTouchEvent(event: MotionEvent): Boolean {
//        val action = event.action
//        if (xs.isEmpty()) {
//            return true
//        }
//        val pos = xs.size - 1
//        when (action) {
//            MotionEvent.ACTION_DOWN -> {
//                xs[pos] = event.x
//                ys[pos] = event.y
//            }
//            MotionEvent.ACTION_MOVE, MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
//                xs[pos] = event.x
//                ys[pos] = event.y
//            }
//        }
//        return true
//    }
//
//    public override fun onDraw(canvas: Canvas) {
//        for (i in images.indices) {
//            val x = xs[i]
//            val y = ys[i]
//            canvas.drawBitmap(images[i], x - 50, y - 50, myPaint)
//            canvas.drawText(objectNames[i], x, y - 50, myPaint)
//        }
//        invalidate()
//    }
//
//    init {
//        myPaint = Paint()
//        images = ArrayList()
//        xs = ArrayList()
//        ys = ArrayList()
//        objectNames = ArrayList()
//    }
}