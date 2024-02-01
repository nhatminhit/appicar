package vn.icar.entertaiment.service;

import ad.d;
import aj.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import com.tatv.baseapp.service.BaseService;
import d.o0;
import vn.icar.entertaiment.R;
import vn.icar.entertaiment.view.activity.HomeActivity;

public class MediaPlayerService extends BaseService {
    public static final String W = "MediaPlayerService";
    public static MediaPlayer X;
    public final IBinder U = new a();
    public Context V;

    public class a extends Binder {
        public a() {
        }

        public MediaPlayerService a() {
            return MediaPlayerService.this;
        }
    }

    public static void s(Context context) {
        Intent intent = new Intent(context, MediaPlayerService.class);
        if (Build.VERSION.SDK_INT < 26 || fd.a.g(context, MediaPlayerService.class)) {
            context.startService(intent);
        } else {
            ComponentName unused = context.startForegroundService(intent);
        }
    }

    public String[] i() {
        return new String[0];
    }

    public void n(Context context, Intent intent) {
    }

    @o0
    public IBinder onBind(Intent intent) {
        return this.U;
    }

    public void onCreate() {
        super.onCreate();
        X = new MediaPlayer();
        this.V = this;
        h(this, "icar_entertainment", "icar_entertainment", "Ứng dụng giải trí tổng hợp trên xe hơi", R.drawable.icon_icare, HomeActivity.class, MediaPlayerService.class, a.c.f16164b);
    }

    public void onDestroy() {
        if (X.isPlaying()) {
            X.stop();
        }
        X.release();
    }

    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    public MediaPlayer q() {
        return X;
    }

    public void r(Uri uri) {
        if (X == null) {
            X = new MediaPlayer();
        }
        X.reset();
        try {
            X.setDataSource(this.V, uri);
            X.prepare();
            X.start();
        } catch (Exception e10) {
            d.c(W, e10.getMessage());
        }
    }
}
