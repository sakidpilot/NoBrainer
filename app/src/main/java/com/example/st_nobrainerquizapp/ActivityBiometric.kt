package com.example.st_nobrainerquizapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.os.Build
import android.provider.Settings
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.biometric.BiometricManager
import androidx.biometric.BiometricManager.Authenticators.BIOMETRIC_STRONG
import androidx.biometric.BiometricManager.Authenticators.DEVICE_CREDENTIAL
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.st_nobrainerquizapp.BiometricManager.*
import com.example.st_nobrainerquizapp.ui.theme.BiometricAuthTheme

class ActivityBiometric : AppCompatActivity() {

    private val promptManager by lazy {
        BiometricManager(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BiometricAuthTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val biometricResult by promptManager.promptResults.collectAsState(
                        initial = null
                    )
                    val enrollLauncher = rememberLauncherForActivityResult(
                        contract = ActivityResultContracts.StartActivityForResult(),
                        onResult = {
                            println("Activity result: $it")
                        }
                    )
                    LaunchedEffect(biometricResult) {
                        if(biometricResult is BiometricResult.AuthenticationNotSet) {
                            if(Build.VERSION.SDK_INT >= 30) {
                                val enrollIntent = Intent(Settings.ACTION_BIOMETRIC_ENROLL).apply {
                                    putExtra(
                                        Settings.EXTRA_BIOMETRIC_AUTHENTICATORS_ALLOWED,
                                        BIOMETRIC_STRONG or DEVICE_CREDENTIAL
                                    )
                                }
                                enrollLauncher.launch(enrollIntent)
                            }
                        }

                        if(biometricResult is BiometricResult.AuthenticationSuccess){
                            startActivity(Intent(this@ActivityBiometric, ActivityUserProfile::class.java))
                            Toast.makeText(this@ActivityBiometric,"Biometric Auth successful. Welcome!", Toast.LENGTH_SHORT).show()
                            this@ActivityBiometric.finish()
                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Button(onClick = {
                            promptManager.showBiometricPrompt(
                                title = "Biometric Auth",
                                description = "Please use your fingerprint to authenticate yourself to continue using the No Brainer App"
                            )
                        }) {
                            Text(text = "Authenticate Yourself")
                        }
                        biometricResult?.let { result ->
                            Text(
                                text = when(result) {
                                    is BiometricResult.AuthenticationError -> {
                                        result.error
                                    }
                                    BiometricResult.AuthenticationFailed -> {
                                        "Authentication failed"
                                    }
                                    BiometricResult.AuthenticationNotSet -> {
                                        "Authentication not set"
                                    }
                                    BiometricResult.AuthenticationSuccess -> {
                                        "Authentication success"
                                    }
                                    BiometricResult.FeatureUnavailable -> {
                                        "Feature unavailable"
                                    }
                                    BiometricResult.HardwareUnavailable -> {
                                        "Hardware unavailable"
                                    }
                                }
                            )

                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BiometricAuthTheme {
        Greeting("Android")
    }
}