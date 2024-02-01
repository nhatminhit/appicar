package com.journeyapps.barcodescanner;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import com.journeyapps.barcodescanner.CameraPreview;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import qa.s;
import qa.t;
import va.e;
import va.i;
import va.k;
import va.l;
import yb.d;
import yb.f;
import yb.g;
import yb.h;
import yb.j;

public class a {

    /* renamed from: o  reason: collision with root package name */
    public static final String f17737o = "a";

    /* renamed from: p  reason: collision with root package name */
    public static int f17738p = 250;

    /* renamed from: q  reason: collision with root package name */
    public static final String f17739q = "SAVED_ORIENTATION_LOCK";

    /* renamed from: a  reason: collision with root package name */
    public Activity f17740a;

    /* renamed from: b  reason: collision with root package name */
    public DecoratedBarcodeView f17741b;

    /* renamed from: c  reason: collision with root package name */
    public int f17742c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17743d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17744e = true;

    /* renamed from: f  reason: collision with root package name */
    public String f17745f = "";

    /* renamed from: g  reason: collision with root package name */
    public boolean f17746g = false;

    /* renamed from: h  reason: collision with root package name */
    public i f17747h;

    /* renamed from: i  reason: collision with root package name */
    public e f17748i;

    /* renamed from: j  reason: collision with root package name */
    public Handler f17749j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f17750k = false;

    /* renamed from: l  reason: collision with root package name */
    public yb.b f17751l = new C0288a();

    /* renamed from: m  reason: collision with root package name */
    public final CameraPreview.f f17752m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f17753n;

    /* renamed from: com.journeyapps.barcodescanner.a$a  reason: collision with other inner class name */
    public class C0288a implements yb.b {
        public C0288a() {
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void d(d dVar) {
            a.this.C(dVar);
        }

        public void a(List<t> list) {
        }

        public void b(d dVar) {
            a.this.f17741b.h();
            a.this.f17748i.h();
            a.this.f17749j.post(new j(this, dVar));
        }
    }

    public class b implements CameraPreview.f {
        public b() {
        }

        public void a() {
        }

        public void b(Exception exc) {
            a aVar = a.this;
            aVar.m(aVar.f17740a.getString(l.k.zxing_msg_camera_framework_bug));
        }

        public void c() {
        }

        public void d() {
            if (a.this.f17750k) {
                String unused = a.f17737o;
                a.this.t();
            }
        }

        public void e() {
        }
    }

    public a(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f17752m = bVar;
        this.f17753n = false;
        this.f17740a = activity;
        this.f17741b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().i(bVar);
        this.f17749j = new Handler();
        this.f17747h = new i(activity, new f(this));
        this.f17748i = new e(activity);
    }

    public static Intent B(d dVar, String str) {
        Intent intent = new Intent(k.a.f23552a);
        intent.addFlags(524288);
        intent.putExtra(k.a.f23572u, dVar.toString());
        intent.putExtra(k.a.f23573v, dVar.b().toString());
        byte[] f10 = dVar.f();
        if (f10 != null && f10.length > 0) {
            intent.putExtra(k.a.f23575x, f10);
        }
        Map<s, Object> h10 = dVar.h();
        if (h10 != null) {
            s sVar = s.UPC_EAN_EXTENSION;
            if (h10.containsKey(sVar)) {
                intent.putExtra(k.a.f23574w, h10.get(sVar).toString());
            }
            Number number = (Number) h10.get(s.ORIENTATION);
            if (number != null) {
                intent.putExtra(k.a.f23576y, number.intValue());
            }
            String str2 = (String) h10.get(s.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra(k.a.f23577z, str2);
            }
            Iterable<byte[]> iterable = (Iterable) h10.get(s.BYTE_SEGMENTS);
            if (iterable != null) {
                int i10 = 0;
                for (byte[] putExtra : iterable) {
                    intent.putExtra(k.a.A + i10, putExtra);
                    i10++;
                }
            }
        }
        if (str != null) {
            intent.putExtra(k.a.B, str);
        }
        return intent;
    }

    public static void E(int i10) {
        f17738p = i10;
    }

    public static int p() {
        return f17738p;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(DialogInterface dialogInterface, int i10) {
        t();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s(DialogInterface dialogInterface) {
        t();
    }

    @TargetApi(23)
    public final void A() {
        if (i0.d.a(this.f17740a, "android.permission.CAMERA") == 0) {
            this.f17741b.j();
        } else if (!this.f17753n) {
            h0.b.D(this.f17740a, new String[]{"android.permission.CAMERA"}, f17738p);
            this.f17753n = true;
        }
    }

    public void C(d dVar) {
        this.f17740a.setResult(-1, B(dVar, o(dVar)));
        k();
    }

    public void D() {
        Intent intent = new Intent(k.a.f23552a);
        intent.putExtra(k.a.f23566o, true);
        this.f17740a.setResult(0, intent);
        k();
    }

    public final void F() {
        Intent intent = new Intent(k.a.f23552a);
        intent.putExtra(k.a.f23567p, true);
        this.f17740a.setResult(0, intent);
    }

    public void G(boolean z10) {
        H(z10, "");
    }

    public void H(boolean z10, String str) {
        this.f17744e = z10;
        if (str == null) {
            str = "";
        }
        this.f17745f = str;
    }

    public void k() {
        if (this.f17741b.getBarcodeView().t()) {
            t();
        } else {
            this.f17750k = true;
        }
        this.f17741b.h();
        this.f17747h.d();
    }

    public void l() {
        this.f17741b.d(this.f17751l);
    }

    public void m(String str) {
        if (!this.f17740a.isFinishing() && !this.f17746g && !this.f17750k) {
            if (str.isEmpty()) {
                str = this.f17740a.getString(l.k.zxing_msg_camera_framework_bug);
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f17740a);
            builder.setTitle(this.f17740a.getString(l.k.zxing_app_name));
            builder.setMessage(str);
            builder.setPositiveButton(l.k.zxing_button_ok, new g(this));
            builder.setOnCancelListener(new h(this));
            builder.show();
        }
    }

    /* renamed from: n */
    public final void t() {
        this.f17740a.finish();
    }

    public final String o(d dVar) {
        if (this.f17743d) {
            Bitmap c10 = dVar.c();
            try {
                File createTempFile = File.createTempFile("barcodeimage", ".jpg", this.f17740a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                c10.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return createTempFile.getAbsolutePath();
            } catch (IOException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unable to create temporary file and store bitmap! ");
                sb2.append(e10);
            }
        }
        return null;
    }

    public void q(Intent intent, Bundle bundle) {
        this.f17740a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f17742c = bundle.getInt(f17739q, -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra(k.a.f23570s, true)) {
                u();
            }
            if (k.a.f23552a.equals(intent.getAction())) {
                this.f17741b.g(intent);
            }
            if (!intent.getBooleanExtra(k.a.f23564m, true)) {
                this.f17748i.i(false);
            }
            if (intent.hasExtra(k.a.f23568q)) {
                H(intent.getBooleanExtra(k.a.f23568q, true), intent.getStringExtra(k.a.f23569r));
            }
            if (intent.hasExtra(k.a.f23566o)) {
                this.f17749j.postDelayed(new yb.i(this), intent.getLongExtra(k.a.f23566o, 0));
            }
            if (intent.getBooleanExtra(k.a.f23565n, false)) {
                this.f17743d = true;
            }
        }
    }

    public void u() {
        if (this.f17742c == -1) {
            int rotation = this.f17740a.getWindowManager().getDefaultDisplay().getRotation();
            int i10 = this.f17740a.getResources().getConfiguration().orientation;
            int i11 = 0;
            if (i10 == 2) {
                if (!(rotation == 0 || rotation == 1)) {
                    i11 = 8;
                }
            } else if (i10 == 1) {
                i11 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f17742c = i11;
        }
        this.f17740a.setRequestedOrientation(this.f17742c);
    }

    public void v() {
        this.f17746g = true;
        this.f17747h.d();
        this.f17749j.removeCallbacksAndMessages((Object) null);
    }

    public void w() {
        this.f17747h.d();
        this.f17741b.i();
    }

    public void x(int i10, String[] strArr, int[] iArr) {
        if (i10 != f17738p) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            F();
            if (this.f17744e) {
                m(this.f17745f);
            } else {
                k();
            }
        } else {
            this.f17741b.j();
        }
    }

    public void y() {
        A();
        this.f17747h.h();
    }

    public void z(Bundle bundle) {
        bundle.putInt(f17739q, this.f17742c);
    }
}
