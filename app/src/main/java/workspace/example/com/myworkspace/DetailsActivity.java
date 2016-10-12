package workspace.example.com.myworkspace;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ShiLiang on 2016/10/12.
 */
public class DetailsActivity extends AppCompatActivity{
    private static final String TAG = "DetailsActivity";
    @BindView(R.id.activity_details_webview)
    WebView mWebView;
    @BindView(R.id.activity_details_pb)
    ProgressBar mProgressBar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        loadWebView();
    }

    private void loadWebView() {
        int id = getIntent().getIntExtra("girlId", 0);
        String url="http://www.tngou.net/tnfs/show/"+id;
        settingWebView();
        mWebView.loadUrl(url);
    }

    private void settingWebView() {
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDisplayZoomControls(true);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);


        initWebViewClient();
    }

    private void initWebViewClient() {
        mWebView.setWebViewClient(mWebViewClient);
        mWebView.setWebChromeClient(mChromeClient);
    }
    private WebChromeClient mChromeClient = new WebChromeClient(){
        @Override
        public void onProgressChanged(WebView view, int newProgress) {
            mProgressBar.setProgress(newProgress);
            if (newProgress==100){
                mProgressBar.setVisibility(View.GONE);
            }else{
//               mProgressBar.setVisibility(View.VISIBLE);
                mProgressBar.setVisibility(View.VISIBLE);
            }
        }
    };

    private WebViewClient mWebViewClient = new WebViewClient(){
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            Toast.makeText(DetailsActivity.this, "开始加载网页", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onPageFinished(WebView view, String url) {
            Toast.makeText(DetailsActivity.this, "网页加载完成", Toast.LENGTH_SHORT).show();
        }

    };
}
