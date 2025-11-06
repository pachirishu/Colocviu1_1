package ro.pub.cs.systems.eim.Colocviu1_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button

class Colocviu1_1SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_colocviu1_1_secondary)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        val coordonateDisplay = findViewById<TextView>(R.id.afisare_coordonate)
        val input1 = intent.getStringExtra(Constants.BUTOANE_AFISATE)

        coordonateDisplay.text = input1.toString()

        val registerButton = findViewById<Button>(R.id.register_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        registerButton.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }

        cancelButton.setOnClickListener {
            setResult(RESULT_CANCELED)
            finish()
        }
    }
}