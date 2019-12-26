package ship.mentorway.viewmodeloverview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.first_container, FirstFragment())
            .commit()

        val fragment = supportFragmentManager.findFragmentByTag("second")

        supportFragmentManager.beginTransaction()
            .replace(R.id.second_container, fragment ?: SecondFragment())
            .addToBackStack(null)
            .commit()
    }
}
