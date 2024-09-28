package ru.sug4chy.homework2109.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import ru.sug4chy.homework2109.R
import ru.sug4chy.homework2109.extensions.findButtonById
import ru.sug4chy.homework2109.model.Shape

class MainActivity : AppCompatActivity() {
    private val rockPaperScissorsVariantsTypedArray = Shape.entries.toTypedArray()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        create()
        setOnClickListeners()
    }

    private fun create() {
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun setOnClickListeners() {
        findButtonById(R.id.btn_rock).setOnClickListener {
            goToSecondActivity(Shape.ROCK)
        }

        findButtonById(R.id.btn_paper).setOnClickListener {
            goToSecondActivity(Shape.PAPER)
        }

        findButtonById(R.id.btn_scissors).setOnClickListener {
            goToSecondActivity(Shape.SCISSORS)
        }
    }

    private fun goToSecondActivity(variant: Shape) =
        with(Intent(this, SecondActivity::class.java)) {
            putExtra(SecondActivity.PLAYER_CHOSEN_VARIANT_KEY, variant.name)
            putExtra(
                SecondActivity.COMPUTER_CHOSEN_VARIANT_KEY,
                rockPaperScissorsVariantsTypedArray.random().name
            )

            startActivity(this)
        }
}