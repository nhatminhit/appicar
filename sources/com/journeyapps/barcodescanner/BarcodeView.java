package com.journeyapps.barcodescanner;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.List;
import qa.e;
import va.l;
import yb.d;
import yb.k;
import yb.l;
import yb.m;
import yb.n;
import yb.o;
import yb.z;

public class BarcodeView extends CameraPreview {

    /* renamed from: t0  reason: collision with root package name */
    public b f17697t0 = b.O;

    /* renamed from: u0  reason: collision with root package name */
    public yb.b f17698u0 = null;

    /* renamed from: v0  reason: collision with root package name */
    public n f17699v0;

    /* renamed from: w0  reason: collision with root package name */
    public l f17700w0;

    /* renamed from: x0  reason: collision with root package name */
    public Handler f17701x0;

    /* renamed from: y0  reason: collision with root package name */
    public final Handler.Callback f17702y0 = new a();

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == l.g.zxing_decode_succeeded) {
                d dVar = (d) message.obj;
                if (!(dVar == null || BarcodeView.this.f17698u0 == null || BarcodeView.this.f17697t0 == b.O)) {
                    BarcodeView.this.f17698u0.b(dVar);
                    if (BarcodeView.this.f17697t0 == b.SINGLE) {
                        BarcodeView.this.P();
                    }
                }
                return true;
            } else if (i10 == l.g.zxing_decode_failed) {
                return true;
            } else {
                if (i10 != l.g.zxing_possible_result_points) {
                    return false;
                }
                List list = (List) message.obj;
                if (!(BarcodeView.this.f17698u0 == null || BarcodeView.this.f17697t0 == b.O)) {
                    BarcodeView.this.f17698u0.a(list);
                }
                return true;
            }
        }
    }

    public enum b {
        O,
        SINGLE,
        CONTINUOUS
    }

    public BarcodeView(Context context) {
        super(context);
        M();
    }

    public BarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        M();
    }

    public BarcodeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        M();
    }

    public final k I() {
        if (this.f17700w0 == null) {
            this.f17700w0 = J();
        }
        m mVar = new m();
        HashMap hashMap = new HashMap();
        hashMap.put(e.NEED_RESULT_POINT_CALLBACK, mVar);
        k a10 = this.f17700w0.a(hashMap);
        mVar.c(a10);
        return a10;
    }

    public yb.l J() {
        return new o();
    }

    public void K(yb.b bVar) {
        this.f17697t0 = b.CONTINUOUS;
        this.f17698u0 = bVar;
        N();
    }

    public void L(yb.b bVar) {
        this.f17697t0 = b.SINGLE;
        this.f17698u0 = bVar;
        N();
    }

    public final void M() {
        this.f17700w0 = new o();
        this.f17701x0 = new Handler(this.f17702y0);
    }

    public final void N() {
        O();
        if (this.f17697t0 != b.O && u()) {
            n nVar = new n(getCameraInstance(), I(), this.f17701x0);
            this.f17699v0 = nVar;
            nVar.k(getPreviewFramingRect());
            this.f17699v0.m();
        }
    }

    public final void O() {
        n nVar = this.f17699v0;
        if (nVar != null) {
            nVar.n();
            this.f17699v0 = null;
        }
    }

    public void P() {
        this.f17697t0 = b.O;
        this.f17698u0 = null;
        O();
    }

    public yb.l getDecoderFactory() {
        return this.f17700w0;
    }

    public void setDecoderFactory(yb.l lVar) {
        z.a();
        this.f17700w0 = lVar;
        n nVar = this.f17699v0;
        if (nVar != null) {
            nVar.l(I());
        }
    }

    public void w() {
        O();
        super.w();
    }

    public void z() {
        super.z();
        N();
    }
}
