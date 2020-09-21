package nibir.ray.android_assignemnt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        var intent = intent
        val data = intent.getStringExtra("data")

        val resultView = findViewById<TextView>(R.id.resultView)
        resultView.text = data
    }
}