package com.example.lambdapractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.random.Random

data class Player(val name: String, val age: Int, val height: Double)


class MainActivity : AppCompatActivity() {

        // 1 -> display
        val fun1 = { print("Hello world!") }
        fun function1() {
            print("Hello world!")
        }

        // 2.1 -> greeting
        val fun21 = { name: String -> print("Hello $name") }
        fun function21(name: String) {
            print("Hello $name")
        }

        // 2.2 -> square the number
        val fun22 = { num: Float -> print("${num * num}") }
        fun function22(num: Float) {
            print("${num * num}")
        }

        // 3.1 -> is it even ?
        val fun41 = { num: Int -> num % 2 == 0 }
        fun function41(num: Int): Boolean {
            return num % 2 == 0
        }

        // 3.2 ->
        val fun42 = { str1: String, str2: String -> str1 == str2 }
        fun function42(str1: String, str2: String): Boolean {
            return str1 == str2
        }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            var randomage = Random.nextInt(18,80)
            var randomhight = Random.nextDouble(150.0,200.0)
            var players = listOf(
                Player("Najla", randomage,  randomhight),
                Player("Spongebob", randomage, randomhight),
                Player("Patrick star", randomage, randomhight),
                Player("Squidward", randomage, randomhight),
                Player("Sandy", randomage, randomhight),
                Player("Mr.Krabs", randomage, randomhight),
                Player("Pearl Krabs", randomage, randomhight),
                Player("Gary", 5, 50.0),
                Player("Mrs.puff", randomage, randomhight),
                Player("Karen", randomage, randomhight),
                Player("Larry", randomage, randomhight),
                Player("King Neptune", 100, randomhight),
                Player("Plankton", randomage, 10.0),
                Player("Squilliam fancyson", randomage, randomhight),
                Player("lady fish", randomage, randomhight),
                Player("Jelly star", randomage, randomhight),
                Player("Dutchman ghost", 200, randomhight),
                Player("Bubble bass", randomage, randomhight),
                Player("The Captain", randomage, randomhight),
                Player("Tom", randomage, randomhight),
            )

            val sort = { player: List<Player> ->
                player.sortedBy { p -> p.height }.filter { it.height < 150 || it.height > 160 }
            }
            players = sort(players)
            val display =
                { players.map { p -> Log.d("List", "${p.name} | ${p.age} | ${p.height}") } }
            display()
        }
}//end class