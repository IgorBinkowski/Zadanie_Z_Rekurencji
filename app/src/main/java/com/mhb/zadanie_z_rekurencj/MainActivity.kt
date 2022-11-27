
package com.mhb.zadanie_z_rekurencj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun silnia(s: Int): Int {
            if (s >= 1) {
                return s * silnia(s - 1)
            }

            return 1
        }
        var a = 1
        var liczba = 0
        var odpowiedź = findViewById<TextView>(R.id.textView2)
        var sprawdź = findViewById<Button>(R.id.button3)
        var Odjąć = findViewById<Button>(R.id.Odjąć)
        var Dodać = findViewById<Button>(R.id.dodać)
        var tekst = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.Button_lewo).setOnClickListener {
            if (a == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capybara3)
                a = 3
            } else {
                if (a == 2) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capybara1)
                    a = 1
                } else {
                    if (a == 3) {
                        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capybara2)
                        a = 2
                    }
                }
            }
        }
        findViewById<Button>(R.id.Button_prawo).setOnClickListener {
            if (a == 1) {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capybara2)
                a = 2
            } else {
                if (a == 2) {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capybara3)
                    a = 3
                } else {
                    if (a == 3) {
                        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capybara1)
                        a = 1
                    }
                }
            }

        }
        Odjąć.setOnClickListener {
            liczba -= 1

            if (liczba < 0)
            {
                liczba = 0
            }

            tekst.setText((liczba).toString())
        }

        Dodać.setOnClickListener {
            liczba += 1

            if (liczba > 10)
            {
                liczba = 10
            }

            tekst.setText((liczba).toString())
        }
        sprawdź.setOnClickListener {
           odpowiedź.setText("Silnia Wynosi: " + silnia(liczba).toString())
        }
    }
}