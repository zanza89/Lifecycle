package and02.kapitel3.lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textview = findViewById<TextView>(R.id.textview_secondactivity)
        textview.append("SecondActivity -- \"on Create\" durchlaufen\n")
    }

    override fun onStart() {
        super.onStart()
        val textView = findViewById<TextView>(R.id.textview_secondactivity)
        textView.append("SecondActivity -- \"on Start\" durchlaufen\n")
    }

    override fun onResume() {
        super.onResume()
        val textView = findViewById<TextView>(R.id.textview_secondactivity)
        textView.append("SecondActivity -- \"on Resume\" durchlaufen\n")
    }

    override fun onPause() {
        super.onPause()
        val textView = findViewById<TextView>(R.id.textview_secondactivity)
        textView.append("SecondActivity -- \"on Pause\" durchlaufen\n")
    }

    override fun onStop() {
        super.onStop()
        val textView = findViewById<TextView>(R.id.textview_secondactivity)
        textView.append("SecondActivity -- \"on Stop\" durchlaufen\n")
    }

    override fun onRestart() {
        super.onRestart()
        val textView = findViewById<TextView>(R.id.textview_secondactivity)
        textView.append("SecondActivity -- \"on Restart\" durchlaufen\n")
    }
    fun onButtonErsteActivityClick(view: View?) {
        val textView = findViewById<TextView>(R.id.textview_secondactivity)
        textView.append("SecondActivity -- Button \"zweite Activity\" geklickt\n")
        //aufruf zur ersten Activity
        startActivity(Intent(this, MainActivity::class.java))
    }
}