package lat.pam.pizzarestoran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class page4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)

        val userId = intent.getStringExtra("USER_ID")
        val storeLocation = intent.getStringExtra("STORE_LOCATION")
        val order = intent.getStringExtra("FOOD_NAME")

        val orderNow = findViewById<Button>(R.id.order_id_button)
        orderNow.setOnClickListener {
            val intent = Intent(this, page8::class.java)
            intent.putExtra("USER_ID",userId)
            intent.putExtra("STORE_LOCATION",storeLocation)
            intent.putExtra("FOOD_NAME", order)
            startActivity(intent)
        }

        val backButton = findViewById<Button>(R.id.back_id_button)
        backButton.setOnClickListener {
            val intent = Intent(this, page3::class.java)
            intent.putExtra("USER_ID",userId)
            intent.putExtra("STORE_LOCATION",storeLocation)
            startActivity(intent)
        }
    }
}