//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.TextView
//import com.example.family.R
//
//class HomeActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
//
//        // Get references to the UI components
//        val timeTextView = findViewById<TextView>(R.id.timeTextView)
//        val dateTextView = findViewById<TextView>(R.id.dateTextView)
//        val locationTextView = findViewById<TextView>(R.id.locationTextView)
//        val weatherImageView = findViewById<ImageView>(R.id.weatherImageView)
//        val temperatureTextView = findViewById<TextView>(R.id.temperatureTextView)
//        val deviceStatusTextView = findViewById<TextView>(R.id.deviceStatusTextView)
//
//        // Set initial values for the UI components
//        timeTextView.text = "09:41"
//        dateTextView.text = "Home"
//        locationTextView.text = "Family Members"
//        weatherImageView.setImageResource(R.drawable.ic_partly_cloudy)
//        temperatureTextView.text = "3°C"
//        deviceStatusTextView.text = "4 devices ON"
//
//        // Set an OnClickListener for the button
//        val button = findViewById<Button>(R.id.button)
//        button.setOnClickListener(View.OnClickListener {
//            // Add code here to perform the desired action when the button is clicked
//        })
//    }
//}