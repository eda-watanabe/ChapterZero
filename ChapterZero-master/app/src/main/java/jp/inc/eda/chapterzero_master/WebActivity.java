package jp.inc.eda.chapterzero_master;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = (WebView) findViewById(R.id.my_web_view);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (isNetworkConnected()) {
            webView.loadUrl("http://www.eda-inc.jp/");
        } else {
            Toast.makeText(this, "デバイスがオフラインです", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = cm.getActiveNetworkInfo();
        if(networkInfo != null) {
            return cm.getActiveNetworkInfo().isConnected();
        }
        return false;
    }
}
