package sv.edu.ufg.fis.amb.jaac_android_webview
import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var webView: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webview)
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true  // Habilita JavaScript
        webView.webViewClient = WebViewClient()

        // Cargar la URL de tu servidor local (cambia el puerto si es necesario)
        webView.loadUrl("http://10.0.2.2/Formulario/inicio.html")
    }
}
