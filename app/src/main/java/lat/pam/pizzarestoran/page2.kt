package lat.pam.pizzarestoran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val userId = intent.getStringExtra("NAME")
        val storeLocation = intent.getStringExtra("LOCATION")

        val userIdTextView = findViewById<TextView>(R.id.user_id)
        val locationTextView = findViewById<TextView>(R.id.store_location)

        userIdTextView.text = "Hello, $userId"
        locationTextView.text = storeLocation

        val btnSeeMenus = findViewById<Button>(R.id.see_menus_button)
        btnSeeMenus?.setOnClickListener{
            val intent = Intent(this, page3::class.java)
            intent.putExtra("USER_ID", userId)
            intent.putExtra("STORE_LOCATION", storeLocation)
            startActivity(intent)
        }
    }
}