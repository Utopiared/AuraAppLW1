package mx.unam.tic.asistentemoda

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import mx.unam.tic.asistentemoda.databinding.ActivityLoginBinding


private const val VALID_EMAIL = "user@tic.unam.mx"
private const val VALID_PASSWORD = "d1pl0m0v1l35?"


const val EXTRA_EMAIL = "extra_email"


class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fieldWatcher = object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) = Unit
            override fun afterTextChanged(s: Editable?) = updateLoginButtonState()
        }
        binding.emailEditText.addTextChangedListener(fieldWatcher)
        binding.passwordEditText.addTextChangedListener(fieldWatcher)

        binding.loginButton.setOnClickListener {
            val email = binding.emailEditText.text?.toString().orEmpty()
            val password = binding.passwordEditText.text?.toString().orEmpty()
            handleLogin(email, password)
        }
    }

        private fun updateLoginButtonState() {
        val email = binding.emailEditText.text?.toString().orEmpty()
        val password = binding.passwordEditText.text?.toString().orEmpty()
        binding.loginButton.isEnabled = email.isNotBlank() && password.isNotBlank()
    }


    private fun handleLogin(email: String, password: String) {
        if (email.isBlank() || password.isBlank()) {
            showToast(R.string.error_empty_fields)
            return
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showToast(R.string.error_invalid_email)
            return
        }

        if (email == VALID_EMAIL && password == VALID_PASSWORD) {
            navigateToWelcome(email)
        } else {
            showToast(R.string.error_invalid_credentials)
        }
    }

    private fun showToast(messageResId: Int) {
        Toast.makeText(this, getString(messageResId), Toast.LENGTH_SHORT).show()
    }

    private fun navigateToWelcome(email: String) {
        val intent = Intent(this, WelcomeActivity::class.java).apply {
            putExtra(EXTRA_EMAIL, email)
        }
        startActivity(intent)
        @Suppress("DEPRECATION")
        overridePendingTransition(R.anim.enter_fade_slide_up, R.anim.exit_fade_slide_left)
    }
}
