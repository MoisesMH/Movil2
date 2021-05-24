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
    var m1 : Int = 0
    var m2 : Int = 0
    var m3 : Int = 0
    var m4 : Int = 0
    var j1 : Int = 0
    var j2 : Int = 0
    var j3 : Int = 0
    var j4 : Int = 0
    var m : Int = 0
    var j : Int = 0
    var turnom : Boolean = false
    var estadoj : Array<Boolean> = arrayOf(false, false)
    var estadom : Array<Boolean> = arrayOf(false, false)
    var gameover : Boolean = false
    var decisionMesa : Int = 0

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
        texto = findViewById<TextView>(R.id.texto)
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
        quedar!!.setOnClickListener(this)
        reiniciar!!.setOnClickListener(this)

        v11!!.setBackgroundColor(Color.rgb(255, 0, 255))
        v12!!.setBackgroundColor(Color.rgb(255, 0, 255))
        v21!!.setBackgroundColor(Color.rgb(255, 0, 255))
        v22!!.setBackgroundColor(Color.rgb(255, 0, 255))
//        v11!!.setImageDrawable(getDrawable(R.drawable.naruto))
        m1 = (1..13).random()
        m2 = (1..13).random()
        j1 = (1..13).random()
        j2 = (1..13).random()

        j = j1 + j2
        m = m1 + m2
    }

    override fun onClick(v: View?) {
        if (gameover){
//            mesacarta3()
            texto?.text = "Este juego se ha terminado"

            if(v!! == reiniciar){
                v13!!.setBackgroundColor(Color.rgb(255, 255, 255))
                v14!!.setBackgroundColor(Color.rgb(255, 255, 255))
                v23!!.setBackgroundColor(Color.rgb(255, 255, 255))
                v24!!.setBackgroundColor(Color.rgb(255, 255, 255))

                m1 = (1..13).random()
                m2 = (1..13).random()
                j1 = (1..13).random()
                j2 = (1..13).random()
                j3 = 0
                m3 = 0
                j4 = 0
                m4 = 0
                estadoj = arrayOf(false, false)

                j = j1 + j2
                m = m1 + m2

                texto!!.text = "Turno jugador"
                gameover = false
            }
        }
        else{
            if (v!! == v23){
                if(estadoj[0]){
                    texto?.text = "Ya se volteo esta carta"
                }
                else{
                    v23!!.setBackgroundColor(Color.rgb(255, 0, 255))
                    j3 = (1..13).random()
                    j += j3
                    if(j > 21){
                        texto?.text = "Perdio jugador con $j"
                        gameover = true
                    }
                    else if(j == 21){
                        texto?.text = "Gano jugador con $j"
                        gameover = true
                    }
                    else{
                        texto?.text = "Turno de mesa"
                        estadoj[0] = true
                        turnom = true
                        mesacarta3()
                    }
                }
            }

            if (v!! == v24){
                if (estadoj[1]){
                    texto?.text = "Ya se volteo esta carta"
                }
                else{
                    if(estadoj[0]){
                        v24!!.setBackgroundColor(Color.rgb(255, 0, 255))
                        j4 = (1..13).random()
                        j += j4
                        if(j > 21){
                            texto?.text = "Perdio jugador con $j"
                            gameover = true
                        }
                        else if(j == 21){
                            texto?.text = "Gano jugador con $j"
                            gameover = true
                        }
                        else{
                            texto?.text = "Turno de mesa"
                            estadoj[1] = true
                            turnom = true
                            mesacarta4()
                        }
                    }
                    else{
                        texto?.text = "Primero selecciona tarjeta 3"
                    }
                }
            }

            if(v!! == quedar){
//                texto?.text = "Funciona?"
//                mesacarta3()
//                mesacarta4()
                quedarJugador()
            }

            if(v!! == reiniciar){
                v13!!.setBackgroundColor(Color.rgb(255, 255, 255))
                v14!!.setBackgroundColor(Color.rgb(255, 255, 255))
                v23!!.setBackgroundColor(Color.rgb(255, 255, 255))
                v24!!.setBackgroundColor(Color.rgb(255, 255, 255))

                m1 = (1..13).random()
                m2 = (1..13).random()
                j1 = (1..13).random()
                j2 = (1..13).random()
                j3 = 0
                m3 = 0
                j4 = 0
                m4 = 0

                j = j1 + j2
                m = m1 + m2

                texto!!.text = "Turno jugador"
                gameover = false
            }

        }

    }

//    fun acumMesa(a: Int) {
////        for (i in 1..a){
////
////        }
//
//    }

    fun quedarJugador(){

        v13!!.setBackgroundColor(Color.rgb(255, 0, 255))
        m3 = (1..13).random()
        m += m3
        if (m > 21){
            texto?.text = "Perdio mesa 3 con $m"
            gameover = true
        }
        else if(m == 21){
            texto?.text = "Gano mesa 3 con $m"
            gameover = true
        }
        else{
            texto?.text = "Turno de jugador"
            mesacarta4()
        }
    }

    fun mesacarta3(){
        v13!!.setBackgroundColor(Color.rgb(255, 0, 255))
        m3 = (1..13).random()
        m += m3
        if (m > 21){
            texto?.text = "Perdio mesa 3 con $m"
            gameover = true
        }
        else if(m == 21){
            texto?.text = "Gano mesa 3 con $m"
            gameover = true
        }
        else{
            texto?.text = "Turno de jugador"
        }

//        estadom[0] = true
//        turnom = false
    }

    fun mesacarta4(){
        v14!!.setBackgroundColor(Color.rgb(255, 0, 255))
        m4 = (1..13).random()
        m += m4
        if (m > 21){
            texto?.text = "Perdio mesa 4 con $m"
            gameover = true
        }
        else if(m == 21){
            texto?.text = "Gano mesa 4 con $m"
            gameover = true
        }
        else{
            if (j>m){
                texto?.text = "Gano jugador con $m"
                gameover = true
            }
            else if (j == m){
                texto?.text = "Empate con $m"
                gameover = true
            }
            else{
                texto?.text = "Gano mesa con $m"
                gameover = true
            }
        }

//        estadom[1] = true
//        turnom = false
    }

}