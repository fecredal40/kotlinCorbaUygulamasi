package com.ramazanyalcin.vizeuygulamasi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_ikinci_sayfa.*

class ikinciSayfa : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_sayfa)
        imageView4.visibility = View.INVISIBLE
        imageView5.visibility = View.INVISIBLE
        imageView6.visibility = View.INVISIBLE
        imageView7.visibility = View.INVISIBLE
        imageView8.visibility = View.INVISIBLE
        imageView9.visibility = View.INVISIBLE
        imageView10.visibility = View.INVISIBLE
        progressBar2.visibility = View.INVISIBLE


        var i = 0
        if (i == 0) {
            textView10.setOnClickListener {
                imageView4.visibility = View.VISIBLE

                textView11.setOnClickListener {
                    imageView5.visibility = View.VISIBLE

                    textView12.setOnClickListener {
                        imageView6.visibility = View.VISIBLE

                        textView13.setOnClickListener {
                            imageView7.visibility = View.VISIBLE

                            textView14.setOnClickListener {
                                imageView8.visibility = View.VISIBLE

                                textView15.setOnClickListener {
                                    imageView9.visibility = View.VISIBLE

                                    textView16.setOnClickListener {
                                        imageView10.visibility = View.VISIBLE
                                        progressBar2.visibility = View.VISIBLE
                                        Handler().postDelayed({
                                            var gecis2 = Intent(this,MainActivity::class.java)
                                            startActivity(gecis2)
                                            finish()

                                        },5000)


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
