package zb;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import pf.y0;

public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final String f25021i = "a";

    /* renamed from: j  reason: collision with root package name */
    public static final long f25022j = 2000;

    /* renamed from: k  reason: collision with root package name */
    public static final Collection<String> f25023k;

    /* renamed from: a  reason: collision with root package name */
    public boolean f25024a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f25025b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f25026c;

    /* renamed from: d  reason: collision with root package name */
    public final Camera f25027d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f25028e;

    /* renamed from: f  reason: collision with root package name */
    public int f25029f = 1;

    /* renamed from: g  reason: collision with root package name */
    public final Handler.Callback f25030g;

    /* renamed from: h  reason: collision with root package name */
    public final Camera.AutoFocusCallback f25031h;

    /* renamed from: zb.a$a  reason: collision with other inner class name */
    public class C0496a implements Handler.Callback {
        public C0496a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != a.this.f25029f) {
                return false;
            }
            a.this.h();
            return true;
        }
    }

    public class b implements Camera.AutoFocusCallback {
        public b() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b() {
            boolean unused = a.this.f25025b = false;
            a.this.f();
        }

        public void onAutoFocus(boolean z10, Camera camera) {
            a.this.f25028e.post(new b(this));
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        f25023k = arrayList;
        arrayList.add(y0.f22055c);
        arrayList.add("macro");
    }

    public a(Camera camera, k kVar) {
        boolean z10 = true;
        C0496a aVar = new C0496a();
        this.f25030g = aVar;
        this.f25031h = new b();
        this.f25028e = new Handler(aVar);
        this.f25027d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        z10 = (!kVar.c() || !f25023k.contains(focusMode)) ? false : z10;
        this.f25026c = z10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Current focus mode '");
        sb2.append(focusMode);
        sb2.append("'; use auto focus? ");
        sb2.append(z10);
        i();
    }

    public final synchronized void f() {
        if (!this.f25024a && !this.f25028e.hasMessages(this.f25029f)) {
            Handler handler = this.f25028e;
            handler.sendMessageDelayed(handler.obtainMessage(this.f25029f), 2000);
        }
    }

    public final void g() {
        this.f25028e.removeMessages(this.f25029f);
    }

    public final void h() {
        if (this.f25026c && !this.f25024a && !this.f25025b) {
            try {
                this.f25027d.autoFocus(this.f25031h);
                this.f25025b = true;
            } catch (RuntimeException unused) {
                f();
            }
        }
    }

    public void i() {
        this.f25024a = false;
        h();
    }

    public void j() {
        this.f25024a = true;
        this.f25025b = false;
        g();
        if (this.f25026c) {
            try {
                this.f25027d.cancelAutoFocus();
            } catch (RuntimeException unused) {
            }
        }
    }
}
