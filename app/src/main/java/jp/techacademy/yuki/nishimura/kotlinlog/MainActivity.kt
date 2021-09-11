package jp.techacademy.yuki.nishimura.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val tag: String = "kotlintest"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("マイク", 21, "サイクリング")
        human1.say()
        human1.think()
        val human2 = Human("ケイト", 28, "キックボクシング")
        human2.say()
        human2.think()
    }
}

fun formatMyTag(): String {
    return "[" + MY_TAG + "]"
}

const val MY_TAG = "kotlintest"