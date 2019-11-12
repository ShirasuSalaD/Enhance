package app.shirasusalad.enhance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment = PlayerFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.exo_controller, fragment)
//        transaction.add(R.id.container, fragment)
        transaction.commit()
    }
}
