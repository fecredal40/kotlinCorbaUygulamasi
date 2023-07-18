package com.ramazanyalcin.vizeuygulamasi

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log.d
import android.view.Gravity
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.alert_tasarim.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        RadioGroup.visibility = View.INVISIBLE
        button.visibility = View.INVISIBLE
        checkBox.setOnClickListener {
            RadioGroup.visibility = View.VISIBLE
            button.visibility = View.VISIBLE
            var x = 0

            RadioGroup.setOnCheckedChangeListener { rg, i ->
                x++
                if (R.id.radioButton1 == i) {

                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)
                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Ezogelin"
                        toastyazi.text = "Ezogelin Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton1.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton2 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Düğün"
                        toastyazi.text = "Düğün Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton2.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton3 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Mercimek"
                        toastyazi.text = "Mercimek Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton3.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton4 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Brokoli"
                        toastyazi.text = "Brokoli Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton4.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton5 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Kelle Paça"
                        toastyazi.text = "Kelle-Paça Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton5.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton6 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Yayla"
                        toastyazi.text = "Yayla Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton6.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton7 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Şehriye"
                        toastyazi.text = "Şehriye Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton7.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton8 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Domates"
                        toastyazi.text = "Domates Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton8.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton9 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Tarhana"
                        toastyazi.text = "Tarhana Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton9.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton10 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Mantar"
                        toastyazi.text = "Mantar Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton10.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                } else if (R.id.radioButton11 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "İşkembe"
                        toastyazi.text = "İşkembe Çorbası \n Güzel Seçim\n" +
                                " Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton11.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                }else if (R.id.radioButton12 == i) {
                    button.setOnClickListener {

                        var tasarim = layoutInflater.inflate(R.layout.ozeltoast, null)

                        var toastozel = Toast(this)
                        var toastyazi = tasarim.findViewById<TextView>(R.id.textView3)
                        var isim = "Tavuk"
                        toastyazi.text = "Tavuk Çorbası \n Güzel Seçim\n Lütfen Bekleyiniz"
                        toastozel.view = tasarim
                        toastozel.setGravity(Gravity.BOTTOM, 0, 0)
                        toastozel.duration = Toast.LENGTH_SHORT
                        toastozel.show()

                        Handler().postDelayed({
                            var gecis3 = Intent(this, DorduncuSayfa::class.java)
                            gecis3.putExtra("corbaadi",radioButton12.text.toString())
                            startActivity(gecis3)
                            finish()
                        }, 5000)

                    }
                }
            }
            if (x==0){

                button.setOnClickListener {

                    val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
                    val tekrardene = tasarim.findViewById<TextView>(R.id.textView7)
                    val ad = Dialog(this)
                    var hayir = tasarim.findViewById<TextView>(R.id.textView2)
                    var evet = tasarim.findViewById<TextView>(R.id.textView8)
                    hayir.visibility = View.INVISIBLE
                    evet.visibility = View.INVISIBLE
                    ad.setContentView(tasarim)
                    ad.setCancelable(true)
                    ad.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    ad.show()


                    tekrardene.setOnClickListener {
                      ad.dismiss()
                    }



                }

            }

        }
        button.setOnClickListener {
            Handler().postDelayed({
                var gecis3 = Intent(this,DorduncuSayfa::class.java)
                startActivity(gecis3)
                finish()


            },5000)
        }
    }
}