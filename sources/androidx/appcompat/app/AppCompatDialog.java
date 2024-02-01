package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import d.b0;
import d.h0;
import d.o0;
import d.x0;
import f.a;
import f1.l;
import k.b;

public class AppCompatDialog extends Dialog implements d {
    public e O;
    public final l.a P;

    public class a implements l.a {
        public a() {
        }

        public boolean E(KeyEvent keyEvent) {
            return AppCompatDialog.this.d(keyEvent);
        }
    }

    public AppCompatDialog(Context context) {
        this(context, 0);
    }

    public AppCompatDialog(Context context, int i10) {
        super(context, c(context, i10));
        this.P = new a();
        e a10 = a();
        a10.R(c(context, i10));
        a10.z((Bundle) null);
    }

    public AppCompatDialog(Context context, boolean z10, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z10, onCancelListener);
        this.P = new a();
    }

    public static int c(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @o0
    public b H(b.a aVar) {
        return null;
    }

    public void M(b bVar) {
    }

    public e a() {
        if (this.O == null) {
            this.O = e.j(this, this);
        }
        return this.O;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().d(view, layoutParams);
    }

    public a b() {
        return a().s();
    }

    /* access modifiers changed from: package-private */
    public boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void dismiss() {
        super.dismiss();
        a().A();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return l.e(this.P, getWindow().getDecorView(), this, keyEvent);
    }

    public boolean e(int i10) {
        return a().I(i10);
    }

    @o0
    public <T extends View> T findViewById(@b0 int i10) {
        return a().n(i10);
    }

    @x0({x0.a.Q})
    public void invalidateOptionsMenu() {
        a().v();
    }

    public void j(b bVar) {
    }

    public void onCreate(Bundle bundle) {
        a().u();
        super.onCreate(bundle);
        a().z(bundle);
    }

    public void onStop() {
        super.onStop();
        a().F();
    }

    public void setContentView(@h0 int i10) {
        a().K(i10);
    }

    public void setContentView(View view) {
        a().L(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().M(view, layoutParams);
    }

    public void setTitle(int i10) {
        super.setTitle(i10);
        a().S(getContext().getString(i10));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().S(charSequence);
    }
}
