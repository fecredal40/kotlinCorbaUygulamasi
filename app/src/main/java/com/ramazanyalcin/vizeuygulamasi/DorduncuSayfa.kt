package com.ramazanyalcin.vizeuygulamasi

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_dorduncu_sayfa.*
import kotlinx.android.synthetic.main.alert_tasarim.*
import org.w3c.dom.Text

class DorduncuSayfa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dorduncu_sayfa)
        val intent = getIntent()
        val corba = intent.getStringExtra("corbaadi")
        var corba1 = findViewById<TextView>(R.id.textView4)
        var tuzorani = " "
        var aciorani = " "
        seekBar5.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if(p1 == 2){
                    val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
                    val tekrardene = tasarim.findViewById<TextView>(R.id.textView7)
                    var alertyazi = tasarim.findViewById<TextView>(R.id.textView6)
                    var hayir = tasarim.findViewById<TextView>(R.id.textView2)
                    var evet = tasarim.findViewById<TextView>(R.id.textView8)
                    var logom = tasarim.findViewById<ImageView>(R.id.imageView12)
                    logom.setImageResource(R.drawable.tuz)


                    tekrardene.visibility = View.INVISIBLE
                    alertyazi.text = "Bu kadar tuz istediğinize emin misiniz?"
                    val ad = Dialog(this@DorduncuSayfa)
                    ad.setContentView(tasarim)
                    ad.setCancelable(true)
                    ad.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    ad.show()


                    hayir.setOnClickListener {
                        seekBar5.progress = 1
                        ad.dismiss()
                    }
                    evet.setOnClickListener {
                        ad.dismiss()
                        Toast.makeText(this@DorduncuSayfa,"Bol Tuzlu Çorba",Toast.LENGTH_LONG).show()
                    }

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }


        })
        seekBar6.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if(p1 == 2){
                    val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
                    val tekrardene = tasarim.findViewById<TextView>(R.id.textView7)
                    var alertyazi = tasarim.findViewById<TextView>(R.id.textView6)
                    var hayir = tasarim.findViewById<TextView>(R.id.textView2)
                    var evet = tasarim.findViewById<TextView>(R.id.textView8)
                    var logom = tasarim.findViewById<ImageView>(R.id.imageView12)
                    logom.setImageResource(R.drawable.aci)

                    tekrardene.visibility = View.INVISIBLE
                    alertyazi.text = "Bu kadar acı istediğinize emin misiniz?"
                    val ad = Dialog(this@DorduncuSayfa)
                    ad.setContentView(tasarim)
                    ad.setCancelable(true)
                    ad.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    ad.show()


                    hayir.setOnClickListener {
                        seekBar6.progress = 1
                        ad.dismiss()
                    }
                    evet.setOnClickListener {
                        ad.dismiss()
                        Toast.makeText(this@DorduncuSayfa,"Bol Acılı Çorba",Toast.LENGTH_LONG).show()
                    }

                }
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }


        })

        var icindekiler1 = ""
        var icindekiler2 = ""
        var icindekiler3 = ""
        var icindekiler4 = ""
        var icindekiler5 = ""
        var icindekiler6 = ""
        var icindekiler7 = ""
        var icindekiler8 = ""
        var icindekiler9 = ""
        var icindekiler10 = ""
        var icindekiler11 = ""
        var icindekiler12 = ""
        switch1.setOnCheckedChangeListener { _, isChecked ->
            if (switch1.isChecked){
                icindekiler1= "Sarimsak,"
            }else{
                icindekiler1= ""
            }
        }
        switch2.setOnCheckedChangeListener { _, isChecked ->
            if (switch2.isChecked){
                icindekiler2= "Nane,"
            }else{
                icindekiler2=""
            }
        }
        switch3.setOnCheckedChangeListener { _, isChecked ->
            if (switch3.isChecked){
                icindekiler3= "Dil,"
            }else{
                icindekiler3=""
            }
        }
        switch4.setOnCheckedChangeListener { _, isChecked ->
            if (switch4.isChecked){
                icindekiler4= "Terbiye,"
            }else{
                icindekiler4=""
            }
        }
        switch5.setOnCheckedChangeListener { _, isChecked ->
            if (switch5.isChecked){
                icindekiler5= "Beyin,"
            }else{
                icindekiler5=""
            }
        }
        switch6.setOnCheckedChangeListener { _, isChecked ->
            if (switch6.isChecked){
                icindekiler6= "Sirke,"
            }else{
                icindekiler6 = ""
            }
        }
        switch7.setOnCheckedChangeListener { _, isChecked ->
            if (switch7.isChecked){
                icindekiler7= "Krema,"
            }else {
                icindekiler7 = ""
            }
        }
        switch8.setOnCheckedChangeListener { _, isChecked ->
            if (switch8.isChecked){
                icindekiler8= "Yağ,"
            }else{
                icindekiler8 = ""
            }
        }
        switch9.setOnCheckedChangeListener { _, isChecked ->
            if (switch9.isChecked){
                icindekiler9= "Kaşar,"
            }else{
                icindekiler9= ""
            }
        }
        switch10.setOnCheckedChangeListener { _, isChecked ->
            if (switch10.isChecked){
                icindekiler10= "Kıtır,"
            }else   {
                icindekiler10 = ""
            }
        }
        switch11.setOnCheckedChangeListener { _, isChecked ->
            if (switch11.isChecked){
                icindekiler11= "Limon,"
            }else {
                icindekiler11 = ""
            }
        }
        switch12.setOnCheckedChangeListener { _, isChecked ->
            if (switch12.isChecked){
                icindekiler12= "Toz Biber,"
            }
            else {
                icindekiler12 = ""
            }
        }

        imageView13.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
            val tekrardene = tasarim.findViewById<TextView>(R.id.textView7)
            val ad = Dialog(this@DorduncuSayfa)
            var hayir = tasarim.findViewById<TextView>(R.id.textView2)
            var evet = tasarim.findViewById<TextView>(R.id.textView8)
            var title = tasarim.findViewById<TextView>(R.id.textView5)
            var durum = tasarim.findViewById<TextView>(R.id.textView6)
            title.text = "Siparişinizin Durumu"
            durum.text = "Siparişiniz Hazırlanacak. Devam Etmek İstiyor musunuz?"
            tekrardene.text = "TEKRAR KONTROL ETMEK İSTİYORUM"
            hayir.visibility = View.INVISIBLE
            ad.setContentView(tasarim)
            ad.setCancelable(true)
            ad.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            ad.show()


            tekrardene.setOnClickListener {
                ad.dismiss()
            }
            evet.setOnClickListener {
                if(seekBar5.progress == 0) {
                    tuzorani = "Tuzsuz"

                }
                if(seekBar5.progress == 1) {
                    tuzorani = "Orta Tuzlu"

                }
                if (seekBar5.progress == 2){
                    tuzorani = "Bol Tuzlu"
                }

                //acı al
                if (seekBar6.progress == 0){
                    aciorani = "Acısız"
                }
                if (seekBar6.progress == 1){
                    aciorani = "Orta Acılı"
                }
                if (seekBar6.progress == 2){
                    aciorani = "Bol Acılı"
                }


                var gecis4 = Intent(this,BesinciSayfa::class.java)
                gecis4.putExtra("corbaadi2",corba.toString())
                gecis4.putExtra("tuzorani",tuzorani)
                gecis4.putExtra("aciorani",aciorani)
                gecis4.putExtra("yazi",editText.text.toString())

                gecis4.putExtra("Sarimsak",icindekiler1)
                gecis4.putExtra("Nane",icindekiler2)
                gecis4.putExtra("Dil",icindekiler3)
                gecis4.putExtra("Terbiye",icindekiler4)
                gecis4.putExtra("Beyin",icindekiler5)
                gecis4.putExtra("Sirke",icindekiler6)
                gecis4.putExtra("Krema",icindekiler7)
                gecis4.putExtra("Yağ",icindekiler8)
                gecis4.putExtra("Kaşar",icindekiler9)
                gecis4.putExtra("Kıtır",icindekiler10)
                gecis4.putExtra("Limon",icindekiler11)
                gecis4.putExtra("Toz Biber",icindekiler12)

                startActivity(gecis4)
                finish()
            }

        }

        switch1.visibility = View.INVISIBLE
        switch2.visibility = View.INVISIBLE
        switch3.visibility = View.INVISIBLE
        switch4.visibility = View.INVISIBLE
        switch5.visibility = View.INVISIBLE
        switch6.visibility = View.INVISIBLE
        switch7.visibility = View.INVISIBLE
        switch8.visibility = View.INVISIBLE
        switch9.visibility = View.INVISIBLE
        switch10.visibility = View.INVISIBLE
        switch11.visibility = View.INVISIBLE
        switch12.visibility = View.INVISIBLE
        if (corba == "Ezogelin"){
            corba1.text = "Ezogelin Çorbası"
            switch2.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch10.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE
        }
        if (corba == "Düğün"){
            corba1.text = "Düğün Çorbası"
            switch2.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch10.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE

        }
        if (corba == "Mercimek"){
            corba1.text = "Mercimek Çorbası"
            switch2.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch10.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE

        }
        if (corba == "Brokoli"){
            corba1.text = "Brokoli Çorbası"
            switch7.visibility = View.VISIBLE


        }
        if (corba == "Kelle-Paça"){
            corba1.text = "Kelle-Paça Çorbası"
            switch1.visibility = View.VISIBLE
            switch3.visibility = View.VISIBLE
            switch5.visibility = View.VISIBLE
            switch6.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE

        }
        if (corba == "Yayla"){
            corba1.text = "Yayla Çorbası"
            switch2.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch10.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE
        }
        if (corba == "Şehriye"){
            corba1.text = "Şehriye Çorbası"
            switch2.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE

        }
        if (corba == "Domates"){
            corba1.text = "Domates Çorbası"
            switch2.visibility = View.VISIBLE
            switch4.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch9.visibility = View.VISIBLE
            switch10.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE

        }
        if (corba == "Tarhana"){
            corba1.text = "Tarhana Çorbası"
            switch8.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE

        }
        if (corba == "Mantar"){
            corba1.text = "Mantar Çorbası"
            switch7.visibility = View.VISIBLE

        }
        if (corba == "İşkembe"){
            corba1.text = "İşkembe Çorbası"
            switch1.visibility = View.VISIBLE
            switch6.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE
            switch12.visibility = View.VISIBLE

        }
        if (corba == "Tavuk"){
            corba1.text = "Tavuk Çorbası"
            switch7.visibility = View.VISIBLE
            switch8.visibility = View.VISIBLE
            switch11.visibility = View.VISIBLE

        }

    }
}