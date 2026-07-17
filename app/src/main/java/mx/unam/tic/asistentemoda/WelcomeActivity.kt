package mx.unam.tic.asistentemoda

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import mx.unam.tic.asistentemoda.databinding.ActivityWelcomeBinding


class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val email = intent.getStringExtra(EXTRA_EMAIL).orEmpty()


        binding.welcomeMessage.text = getString(R.string.welcome_message_personalized, email)
    }

    override fun finish() {
        super.finish()
        @Suppress("DEPRECATION")
        overridePendingTransition(R.anim.pop_enter_fade_slide_right, R.anim.pop_exit_fade_slide_down)
    }
}
