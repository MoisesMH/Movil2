package pe.edu.ulima.pm.melendez_rodriguez_blackjack

import android.app.Activity
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : Activity(), View.OnClickListener{
    var v11 : View? = null
    var v12 : View? = null
    var v13 : View? = null
    var v14 : View? = null
    var v21 : View? = null
    var v22 : View? = null
    var v23 : View? = null
    var v24 : View? = null
    var quedar : Button? = null
    var reiniciar : Button? = null
    var texto : TextView? = null

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.main_layout)

        v11 = findViewById<View>(R.id.v11)
        v12 = findViewById<View>(R.id.v12)
        v13 = findViewById<View>(R.id.v13)
        v14 = findViewById<View>(R.id.v14)
        v21 = findViewById<View>(R.id.v21)
        v22 = findViewById<View>(R.id.v22)
        v23 = findViewById<View>(R.id.v23)
        v24 = findViewById<View>(R.id.v24)
        quedar = findViewById<Button>(R.id.but1)
        reiniciar = findViewById<Button>(R.id.but2)

        v11!!.setOnClickListener(this)
        v12!!.setOnClickListener(this)
        v13!!.setOnClickListener(this)
        v14!!.setOnClickListener(this)
        v21!!.setOnClickListener(this)
        v22!!.setOnClickListener(this)
        v23!!.setOnClickListener(this)
        v24!!.setOnClickListener(this)

//        v11!!.setImageDrawable(getDrawable(R.drawable.naruto))

    }

    override fun onClick(v: View?) {
        if (v!! == v11){
            v11!!.setBackgroundColor(Color.rgb(255, 0, 255))
        }
    }


}