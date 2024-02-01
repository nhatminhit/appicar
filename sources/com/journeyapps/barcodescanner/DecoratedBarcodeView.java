package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qa.e;
import qa.t;
import va.g;
import va.h;
import va.k;
import va.l;
import yb.d;
import yb.o;
import zb.j;
import zb.k;

public class DecoratedBarcodeView extends FrameLayout {
    public BarcodeView O;
    public ViewfinderView P;
    public TextView Q;
    public a R;

    public interface a {
        void a();

        void b();
    }

    public class b implements yb.b {

        /* renamed from: a  reason: collision with root package name */
        public yb.b f17724a;

        public b(yb.b bVar) {
            this.f17724a = bVar;
        }

        public void a(List<t> list) {
            for (t a10 : list) {
                DecoratedBarcodeView.this.P.a(a10);
            }
            this.f17724a.a(list);
        }

        public void b(d dVar) {
            this.f17724a.b(dVar);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        e();
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f(attributeSet);
    }

    public void b(j jVar) {
        this.O.m(jVar);
    }

    public void c(yb.b bVar) {
        this.O.K(new b(bVar));
    }

    public void d(yb.b bVar) {
        this.O.L(new b(bVar));
    }

    public final void e() {
        f((AttributeSet) null);
    }

    public final void f(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, l.m.zxing_view);
        int resourceId = obtainStyledAttributes.getResourceId(l.m.zxing_view_zxing_scanner_layout, l.i.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(l.g.zxing_barcode_surface);
        this.O = barcodeView;
        if (barcodeView != null) {
            barcodeView.r(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(l.g.zxing_viewfinder_view);
            this.P = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.O);
                this.Q = (TextView) findViewById(l.g.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    public void g(Intent intent) {
        int intExtra;
        Set<qa.a> a10 = g.a(intent);
        Map<e, Object> a11 = h.a(intent);
        k kVar = new k();
        if (intent.hasExtra(k.a.f23561j) && (intExtra = intent.getIntExtra(k.a.f23561j, -1)) >= 0) {
            kVar.q(intExtra);
        }
        if (intent.hasExtra(k.a.f23562k) && intent.getBooleanExtra(k.a.f23562k, false)) {
            l();
        }
        String stringExtra = intent.getStringExtra(k.a.f23571t);
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra(k.a.C, 0);
        String stringExtra2 = intent.getStringExtra(k.a.f23563l);
        new qa.k().e(a11);
        this.O.setCameraSettings(kVar);
        this.O.setDecoderFactory(new o(a10, a11, stringExtra2, intExtra2));
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(l.g.zxing_barcode_surface);
    }

    public zb.k getCameraSettings() {
        return this.O.getCameraSettings();
    }

    public yb.l getDecoderFactory() {
        return this.O.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.Q;
    }

    public ViewfinderView getViewFinder() {
        return this.P;
    }

    public void h() {
        this.O.w();
    }

    public void i() {
        this.O.x();
    }

    public void j() {
        this.O.A();
    }

    public void k() {
        this.O.setTorch(false);
        a aVar = this.R;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void l() {
        this.O.setTorch(true);
        a aVar = this.R;
        if (aVar != null) {
            aVar.b();
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 24) {
            l();
            return true;
        } else if (i10 == 25) {
            k();
            return true;
        } else if (i10 == 27 || i10 == 80) {
            return true;
        } else {
            return super.onKeyDown(i10, keyEvent);
        }
    }

    public void setCameraSettings(zb.k kVar) {
        this.O.setCameraSettings(kVar);
    }

    public void setDecoderFactory(yb.l lVar) {
        this.O.setDecoderFactory(lVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.Q;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
        this.R = aVar;
    }
}
