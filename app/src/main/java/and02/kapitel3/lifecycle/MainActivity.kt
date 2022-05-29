package and02.kapitel3.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.textview_mainactivity)
        textview.append("MainActivity -- \"on Create\" Durchlaufen\n")
    }

    override fun onStart() {
        super.onStart()
        val textView = findViewById<TextView>(R.id.textview_mainactivity)
        textView.append("MainActivity -- \"on Start\" Durchlaufen\n")
    }

    override fun onResume() {
        super.onResume()
        val textView = findViewById<TextView>(R.id.textview_mainactivity)
        textView.append("MainActivity -- \"on Resume\" Durchlaufen\n")
    }

    override fun onPause() {
        super.onPause()
        val textView = findViewById<TextView>(R.id.textview_mainactivity)
        textView.append("MainActivity -- \"on Pause\" Durchlaufen\n")
    }

    override fun onStop() {
        super.onStop()
        val textView = findViewById<TextView>(R.id.textview_mainactivity)
        textView.append("MainActivity -- \"on Stop\" Durchlaufen\n")
    }

    override fun onRestart() {
        super.onRestart()
        val textView = findViewById<TextView>(R.id.textview_mainactivity)
        textView.append("MainActivity -- \"on Restart\" Durchlaufen\n")
    }
    fun onButtonZweiteActivityClick(view: View?){
        val textView = findViewById<TextView>(R.id.textview_mainactivity)
        textView.append("MainActivity -- Button \"zweite Activity\" geklickt\n")

        //aufruf zur zweiten Activity
        //kurze Variante
        startActivity(Intent(this, SecondActivity::class.java))
        //lange Variante
        //val intent = Intent(this, SecondActivity::class.java)
        //startActivity(intent)


    }
}