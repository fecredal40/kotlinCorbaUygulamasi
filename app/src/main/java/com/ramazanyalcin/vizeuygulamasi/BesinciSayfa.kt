package com.ramazanyalcin.vizeuygulamasi

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_besinci_sayfa.*
import kotlinx.android.synthetic.main.activity_dorduncu_sayfa.*

class BesinciSayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_besinci_sayfa)
        val intent = intent
        val corba = intent.getStringExtra("corbaadi2")
        val tuzorani = intent.getStringExtra("tuzorani")
        val aciorani = intent.getStringExtra("aciorani")
        val yazi = intent.getStringExtra("yazi")
        val yazi1 = findViewById<TextView>(R.id.textView25)
        yazi1.visibility = View.INVISIBLE
        var corba1 = findViewById<TextView>(R.id.textView18)
        val icindekiler1 = intent.getStringExtra("Sarimsak")
        val icindekiler2 = intent.getStringExtra("Nane")
        val icindekiler3= intent.getStringExtra("Dil")
        val icindekiler4 = intent.getStringExtra("Terbiye")
        val icindekiler5 = intent.getStringExtra("Beyin")
        val icindekiler6 = intent.getStringExtra("Sirke")
        val icindekiler7 = intent.getStringExtra("Krema")
        val icindekiler8 = intent.getStringExtra("Yağ")
        val icindekiler9 = intent.getStringExtra("Kaşar")
        val icindekiler10 = intent.getStringExtra("Kıtır")
        val icindekiler11 = intent.getStringExtra("Limon")
        val icindekiler12 = intent.getStringExtra("Toz Biber")


        val sayici = object : CountDownTimer(100000,500){
           override fun onTick(p0: Long) {
                if(textView9.visibility == View.VISIBLE){
                    textView9.visibility = View.INVISIBLE
                }
                else{
                    textView9.visibility = View.VISIBLE

                }
            }

            override fun onFinish() {
                return
            }
        }
        sayici.start()

            if(icindekiler1==""){
                if (icindekiler2==""){
                    if (icindekiler3==""){
                        if (icindekiler4==""){
                            if(icindekiler5==""){
                                if (icindekiler6==""){
                                    if (icindekiler7==""){
                                        if(icindekiler8==""){
                                            if (icindekiler9==""){
                                                if (icindekiler10==""){
                                                    if (icindekiler11==""){
                                                        if (icindekiler12==""){

                                                            textView19.visibility=View.INVISIBLE
                                                            textView23.visibility=View.INVISIBLE
                                                            textView24.visibility=View.INVISIBLE

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (corba == "Ezogelin") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler2} ${icindekiler8} ${icindekiler10} ${icindekiler11} ${icindekiler12}"
            }
            if (corba == "Düğün") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler2} ${icindekiler8} ${icindekiler10} ${icindekiler11} ${icindekiler12}"
            }
            if (corba == "Mercimek") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler2} ${icindekiler8} ${icindekiler10} ${icindekiler11} ${icindekiler12}"
            }
            if (corba == "Brokoli") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler7} "

            }
            if (corba == "Kelle-Paça") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler1} ${icindekiler3} ${icindekiler5} ${icindekiler6} ${icindekiler8} ${icindekiler11}"
            }
            if (corba == "Yayla") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler2} ${icindekiler8} ${icindekiler10} ${icindekiler12}"
            }
            if (corba == "Şehriye") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler2} ${icindekiler8} ${icindekiler11} ${icindekiler12}"
            }
            if (corba == "Domates") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler2} ${icindekiler4} ${icindekiler8} ${icindekiler9} ${icindekiler10} ${icindekiler11} ${icindekiler12}"
            }
            if (corba == "Tarhana") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler8} ${icindekiler12}"
            }
            if (corba == "Mantar") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler7}"
            }
            if (corba == "İşkembe") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler1} ${icindekiler6} ${icindekiler8} ${icindekiler11} ${icindekiler12}"
            }
            if (corba == "Tavuk") {
                corba1.text = "Bir ${corba} Çorbası Çeeek ${tuzorani} ve ${aciorani} Olsun "
                if (yazi !="") {
                    yazi1.text = "Ekstra İstek : ${yazi}"
                    yazi1.visibility = View.VISIBLE
                }
                textView23.text = "${icindekiler7} ${icindekiler8} ${icindekiler11}"
            }


        textView9.setOnClickListener {
            var gecis3 = Intent(this,MainActivity::class.java)
            startActivity(gecis3)
            finish()
        }
        imageView15.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
            val tekrardene = tasarim.findViewById<TextView>(R.id.textView7)
            var alertyazi = tasarim.findViewById<TextView>(R.id.textView6)
            var hayir = tasarim.findViewById<TextView>(R.id.textView2)
            var evet = tasarim.findViewById<TextView>(R.id.textView8)
            var logom = tasarim.findViewById<ImageView>(R.id.imageView12)
            var title = tasarim.findViewById<TextView>(R.id.textView5)
            logom.setImageResource(R.drawable.iptal)
            title.text = "Çıkış"

            tekrardene.visibility = View.INVISIBLE
            alertyazi.text = "Çıkmak İstediğinize Emin misiniz?"
            val ad = Dialog(this@BesinciSayfa)
            ad.setContentView(tasarim)
            ad.setCancelable(true)
            ad.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            ad.show()


            hayir.setOnClickListener {
                ad.dismiss()
            }
            evet.setOnClickListener {
                finish()

            }
        }

    }
}