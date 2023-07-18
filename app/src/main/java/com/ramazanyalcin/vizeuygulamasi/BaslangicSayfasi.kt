package com.ramazanyalcin.vizeuygulamasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.util.TypedValue
import android.view.View
import androidx.core.widget.TextViewCompat
import kotlinx.android.synthetic.main.activity_baslangic_sayfasi.*

class BaslangicSayfasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baslangic_sayfasi)
        var boyut = 10f
        val sayici = object : CountDownTimer(2000,50){
            override fun onTick(p0: Long) {
                if(boyut!= 40f) {
                    textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, boyut)
                    boyut = boyut + 2f
                }
            }

            override fun onFinish() {
                Handler().postDelayed({
                    var gecis1 = Intent(applicationContext,ikinciSayfa::class.java)
                    startActivity(gecis1)
                    finish()
                },2000)
            }
        }
        sayici.start()


        

    
    }

}