package com.example.app01

import android.os.Bundle
import android.view.CollapsibleActionView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var turno = true
    var fin_partida=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun gatoClick(view: View){

        val btn = view as Button
        if(fin_partida==false){
            if(turno){
                btn.text="x"
                btn.setBackgroundResource(R.color.colorPrimary)
                btn.isEnabled=false
                validBtn()
                turno=false
            }else{
                btn.text="o"
                btn.setBackgroundResource(R.color.colorSecund)
                btn.isEnabled=false
                validBtn()
                turno=true
            }
        }

        println(btn.id.toString())
        when(btn.id){
            btn1.id ->{}
            btn2.id ->{}
            btn3.id ->{}
            btn4.id ->{}
            btn5.id ->{}
            btn6.id ->{}
            btn7.id ->{}
            btn8.id ->{}
            btn9.id ->{}
        }

    }
    fun validBtn(){
        if(turno){
            if((btn1.text=="x")&&(btn2.text=="x")&&(btn3.text=="x")){
                btn1.setBackgroundResource(R.color.colorThird)
                btn2.setBackgroundResource(R.color.colorThird)
                btn3.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn4.text=="x")&&(btn5.text=="x")&&(btn6.text=="x")){
                btn4.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn6.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn7.text=="x")&&(btn8.text=="x")&&(btn9.text=="x")){
                btn7.setBackgroundResource(R.color.colorThird)
                btn8.setBackgroundResource(R.color.colorThird)
                btn9.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn1.text=="x")&&(btn4.text=="x")&&(btn7.text=="x")){
                btn1.setBackgroundResource(R.color.colorThird)
                btn4.setBackgroundResource(R.color.colorThird)
                btn7.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn2.text=="x")&&(btn5.text=="x")&&(btn8.text=="x")){
                btn2.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn8.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn9.text=="x")&&(btn6.text=="x")&&(btn3.text=="x")){
                btn9.setBackgroundResource(R.color.colorThird)
                btn6.setBackgroundResource(R.color.colorThird)
                btn3.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn1.text=="x")&&(btn5.text=="x")&&(btn9.text=="x")){
                btn1.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn9.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn7.text=="x")&&(btn5.text=="x")&&(btn3.text=="x")){
                btn7.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn3.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
        }else{
            if((btn1.text=="o")&&(btn2.text=="o")&&(btn3.text=="o")){
                btn1.setBackgroundResource(R.color.colorThird)
                btn2.setBackgroundResource(R.color.colorThird)
                btn3.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn4.text=="o")&&(btn5.text=="o")&&(btn6.text=="o")){
                btn4.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn6.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn7.text=="o")&&(btn8.text=="o")&&(btn9.text=="o")){
                btn7.setBackgroundResource(R.color.colorThird)
                btn8.setBackgroundResource(R.color.colorThird)
                btn9.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn1.text=="o")&&(btn4.text=="o")&&(btn7.text=="o")){
                btn1.setBackgroundResource(R.color.colorThird)
                btn4.setBackgroundResource(R.color.colorThird)
                btn7.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn2.text=="o")&&(btn5.text=="o")&&(btn8.text=="o")){
                btn2.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn8.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn9.text=="o")&&(btn6.text=="o")&&(btn3.text=="o")){
                btn9.setBackgroundResource(R.color.colorThird)
                btn6.setBackgroundResource(R.color.colorThird)
                btn3.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn1.text=="o")&&(btn5.text=="o")&&(btn9.text=="o")){
                btn1.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn9.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
            if((btn7.text=="o")&&(btn5.text=="o")&&(btn3.text=="o")){
                btn7.setBackgroundResource(R.color.colorThird)
                btn5.setBackgroundResource(R.color.colorThird)
                btn3.setBackgroundResource(R.color.colorThird)
                fin_partida=true
            }
        }

    }
}