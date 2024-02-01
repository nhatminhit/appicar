package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import d.m0;
import va.l;

public class CaptureActivity extends Activity {
    public a O;
    public DecoratedBarcodeView P;

    public DecoratedBarcodeView a() {
        setContentView(l.i.zxing_capture);
        return (DecoratedBarcodeView) findViewById(l.g.zxing_barcode_scanner);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.P = a();
        a aVar = new a(this, this.P);
        this.O = aVar;
        aVar.q(getIntent(), bundle);
        this.O.l();
    }

    public void onDestroy() {
        super.onDestroy();
        this.O.v();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return this.P.onKeyDown(i10, keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    public void onPause() {
        super.onPause();
        this.O.w();
    }

    public void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr) {
        this.O.x(i10, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.O.y();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.O.z(bundle);
    }
}
