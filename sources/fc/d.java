package fc;

import android.webkit.WebView;
import java.util.List;

public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ WebView O;
    public final /* synthetic */ String P;
    public final /* synthetic */ List Q;

    public /* synthetic */ d(WebView webView, String str, List list) {
        this.O = webView;
        this.P = str;
        this.Q = list;
    }

    public final void run() {
        e.g(this.O, this.P, this.Q);
    }
}
