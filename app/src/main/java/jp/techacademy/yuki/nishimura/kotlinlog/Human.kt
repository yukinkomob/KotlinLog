package jp.techacademy.yuki.nishimura.kotlinlog

import android.util.Log

class Human(name: String, age: Int) : Animal(name, age), Thinkable {
    var hobby: String = ""

    constructor(name: String, age: Int, hobby: String) : this(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "私の名前は" + this.name + "です。年は" + this.age + "です。")
    }

    override fun think() {
        Log.d("kotlintest", "私は" + hobby + "について考える。")
    }
}
