package smarteq.agency.btwpguide;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import java.util.ArrayList;

public class VideosActivity extends AppCompatActivity {
    private WebView webview;
    private ArrayList<String> link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
       getSupportActionBar().hide();

        webview = (WebView) findViewById(R.id.wv);
        Bundle extras = getIntent().getExtras();
        int value = extras.getInt("position",0);
        link=new ArrayList<>();

        link.add("https://www.youtube.com/watch?v=MjIUDRBFr1o");
        link.add("https://www.youtube.com/watch?v=P3mcGgI0Yfk");
        link.add("Https://www.youtube.com/watch?v=uKiEZ_yynAs");
        link.add("Https://www.youtube.com/watch?v=EcVoXP5tsfU");
        link.add("Https://www.youtube.com/watch?v=bgnKx-BZPZg");
        link.add("Https://www.youtube.com/watch?v=9Iy2gcpsPjI");
        link.add("Https://www.youtube.com/watch?v=ZQFBueQsd3Q");
        link.add("Https://www.youtube.com/watch?v=IJD4q6t_MFE");
        link.add("Https://www.youtube.com/watch?v=QHvMNhBOhJM");
        link.add("Https://www.youtube.com/watch?v=Vaw-EVQWnSk");
        link.add("Https://www.youtube.com/watch?v=TembcKINyWo");
        link.add("Https://www.youtube.com/watch?v=vP818pyyicE");
        link.add("Https://www.youtube.com/watch?v=cwEQREQAWLE");
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setInitialScale(1);
        webview.getSettings().setBuiltInZoomControls(true);
        webview.getSettings().setUseWideViewPort(true);
        switch (value){
            case 0:
                webview.loadUrl(link.get(0));
                break;
            case 1:
                webview.loadUrl(link.get(1));
                break;
            case 2:
                webview.loadUrl(link.get(2));
                break;
            case 3:
                webview.loadUrl(link.get(3));
                break;
            case 4:
                webview.loadUrl(link.get(4));
                break;
            case 5:
                webview.loadUrl(link.get(5));
                break;
            case 6:
                webview.loadUrl(link.get(6));
                break;
            case 7:
                webview.loadUrl(link.get(7));
                break;
            case 8:
                webview.loadUrl(link.get(8));
                break;
            case 9:
                webview.loadUrl(link.get(9));
                break;
            case 10:
                webview.loadUrl(link.get(10));
                break;
            case 11:
                webview.loadUrl(link.get(11));
                break;
            case 12:
                webview.loadUrl(link.get(12));
                break;
            case 13:
                webview.loadUrl(link.get(13));
                break;


            default:
                break;
        }


        final ProgressDialog progress = ProgressDialog.show(this, "Video", "Yükleniyor....", true);
        progress.show();
        webview.setWebViewClient(new WebViewClient() {

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progress.dismiss();
            }

            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                Toast.makeText(getApplicationContext(), "Bir hata oluştu", Toast.LENGTH_SHORT).show();
                progress.dismiss();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (webview.canGoBack()) {
                        webview.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }

        }
        return super.onKeyDown(keyCode, event);
    }
    }
