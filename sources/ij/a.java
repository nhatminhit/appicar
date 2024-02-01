package ij;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;

public class a {

    /* renamed from: f  reason: collision with root package name */
    public static a f19822f;

    /* renamed from: a  reason: collision with root package name */
    public MediaSessionCompat f19823a;

    /* renamed from: b  reason: collision with root package name */
    public Context f19824b;

    /* renamed from: c  reason: collision with root package name */
    public b f19825c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19826d = false;

    /* renamed from: e  reason: collision with root package name */
    public MediaSessionCompat.d f19827e = new C0330a();

    /* renamed from: ij.a$a  reason: collision with other inner class name */
    public class C0330a extends MediaSessionCompat.d {

        /* renamed from: ij.a$a$a  reason: collision with other inner class name */
        public class C0331a implements Runnable {
            public C0331a() {
            }

            public void run() {
                boolean unused = a.this.f19826d = false;
            }
        }

        public C0330a() {
        }

        public boolean l(Intent intent) {
            if (!a.this.f19826d) {
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (a.this.f19825c != null) {
                    a.this.f19825c.r(keyEvent.getKeyCode());
                }
                boolean unused = a.this.f19826d = true;
                new Handler().postDelayed(new C0331a(), 500);
            }
            return super.l(intent);
        }
    }

    public interface b {
        void r(int i10);
    }

    public a(Context context) {
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(context, context.getPackageName());
        this.f19823a = mediaSessionCompat;
        mediaSessionCompat.p(this.f19827e);
        this.f19823a.t(3);
    }

    public static a d(Context context) {
        if (f19822f == null) {
            f19822f = new a(context);
        }
        return f19822f;
    }

    public void e(b bVar) {
        this.f19825c = bVar;
    }
}
