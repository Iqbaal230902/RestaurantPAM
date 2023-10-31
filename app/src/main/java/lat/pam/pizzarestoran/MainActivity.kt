package lat.pam.pizzarestoran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner: Spinner = findViewById(R.id.store_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.store_location,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        val buttonFirst = findViewById<Button>(R.id.button_first)
        buttonFirst.setOnClickListener {
            val intent = Intent(this, page2::class.java)
            val selectedLocation = spinner.selectedItem.toString()
            val inputName = findViewById<EditText>(R.id.name_text).text.toString()

            intent.putExtra("LOCATION", selectedLocation)
            intent.putExtra("NAME", inputName)

            startActivity(intent)
        }

    }
}