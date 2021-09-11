package jp.techacademy.yuki.nishimura.kotlinlog

import android.util.Log

class BigDog: Dog {
    constructor(name: String, age: Int): super(name, age) {

    }

    override fun say() {
        super.say()
        Log.d(MY_TAG, "大きな犬です。")
    }
}
