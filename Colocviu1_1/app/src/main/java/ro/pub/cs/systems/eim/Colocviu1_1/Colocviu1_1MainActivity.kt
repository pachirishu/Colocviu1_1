package ro.pub.cs.systems.eim.Colocviu1_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import ro.pub.cs.systems.eim.Colocviu1_1.Constants.BUTOANE_APASATE

object Constants {
    const val BUTOANE_APASATE = "nrApasari"

}
class Colocviu1_1MainActivity : AppCompatActivity() {

    private lateinit var input: EditText
    private lateinit var nrApasari: EditText
    private lateinit var northButton: Button
    private lateinit var eastButton: Button
    private lateinit var westButton: Button
    private lateinit var southButton: Button
    private lateinit var secondActivityButton: Button

    private var coordonata = ""
    private var firstCoordonate = false

    private var butoane = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_colocviu1_1_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        northButton = findViewById(R.id.north_button)
        eastButton = findViewById(R.id.east_button)
        westButton = findViewById(R.id.west_button)
        southButton = findViewById(R.id.south_button)
        input = findViewById(R.id.coordonate)
        nrApasari = findViewById(R.id.apasari)

        northButton.setOnClickListener {
            if (firstCoordonate == false) {
                input.setText(input.text.toString() + "North")
                firstCoordonate = true
            } else {
                input.setText(input.text.toString() + ", North")
            }
            butoane++
            nrApasari.setText(butoane.toString())
        }
        eastButton.setOnClickListener {
            if (firstCoordonate == false) {
                input.setText(input.text.toString() + "East")
                firstCoordonate = true
            } else {
                input.setText(input.text.toString() + ", East")
            }
            butoane++
            nrApasari.setText(butoane.toString())
        }
        westButton.setOnClickListener {
            if (firstCoordonate == false) {
                input.setText(input.text.toString() + "West")
                firstCoordonate = true
            } else {
                input.setText(input.text.toString() + ", West")
            }
            butoane++
            nrApasari.setText(butoane.toString())
        }
        southButton.setOnClickListener {
            if (firstCoordonate == false) {
                input.setText(input.text.toString() + "South")
                firstCoordonate = true
            } else {
                input.setText(input.text.toString() + ", South")
            }
            butoane++
            nrApasari.setText(butoane.toString())
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(BUTOANE_APASATE, nrApasari.text.toString())
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState.containsKey(BUTOANE_APASATE)) {
            nrApasari.setText(savedInstanceState.getString(BUTOANE_APASATE))
        }
    }
}