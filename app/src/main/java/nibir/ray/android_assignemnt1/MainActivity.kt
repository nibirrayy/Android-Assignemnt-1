package nibir.ray.android_assignemnt1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<EditText>(R.id.textEntry)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            var data = text.text.toString()

            val intent = Intent(this@MainActivity, activity2::class.java)

            intent.putExtra("data",data)
            startActivity(intent)
        }
    }
}