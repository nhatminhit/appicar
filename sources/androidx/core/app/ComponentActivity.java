package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.collection.i;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.p;
import androidx.lifecycle.y;
import d.m0;
import d.o0;
import d.x0;
import f1.l;

@x0({x0.a.Q})
public class ComponentActivity extends Activity implements y, l.a {
    public i<Class<? extends a>, a> O = new i<>();
    public a0 P = new a0(this);

    @x0({x0.a.Q})
    @Deprecated
    public static class a {
    }

    @x0({x0.a.Q})
    public boolean E(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @x0({x0.a.Q})
    @Deprecated
    public <T extends a> T P(Class<T> cls) {
        return (a) this.O.get(cls);
    }

    @x0({x0.a.Q})
    @Deprecated
    public void Q(a aVar) {
        this.O.put(aVar.getClass(), aVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !l.d(decorView, keyEvent)) {
            return l.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !l.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @m0
    public p getLifecycle() {
        return this.P;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        ReportFragment.g(this);
    }

    @d.i
    public void onSaveInstanceState(@m0 Bundle bundle) {
        this.P.n(p.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
