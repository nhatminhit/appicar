package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import d.m0;
import d.o0;
import e1.n;
import h0.b;
import i0.d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class g<E> extends d {
    @o0
    public final Activity O;
    @m0
    public final Context P;
    @m0
    public final Handler Q;
    public final int R;
    public final FragmentManager S;

    public g(@o0 Activity activity, @m0 Context context, @m0 Handler handler, int i10) {
        this.S = new j();
        this.O = activity;
        this.P = (Context) n.h(context, "context == null");
        this.Q = (Handler) n.h(handler, "handler == null");
        this.R = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public g(@m0 Context context, @m0 Handler handler, int i10) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i10);
    }

    public g(@m0 FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    @o0
    public View c(int i10) {
        return null;
    }

    public boolean d() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @o0
    public Activity e() {
        return this.O;
    }

    /* access modifiers changed from: package-private */
    @m0
    public Context f() {
        return this.P;
    }

    /* access modifiers changed from: package-private */
    @m0
    public Handler g() {
        return this.Q;
    }

    public void i(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
    }

    @o0
    public abstract E j();

    @m0
    public LayoutInflater k() {
        return LayoutInflater.from(this.P);
    }

    public int l() {
        return this.R;
    }

    public boolean m() {
        return true;
    }

    @Deprecated
    public void n(@m0 Fragment fragment, @m0 String[] strArr, int i10) {
    }

    public boolean o(@m0 Fragment fragment) {
        return true;
    }

    public boolean p(@m0 String str) {
        return false;
    }

    public void q(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        r(fragment, intent, i10, (Bundle) null);
    }

    public void r(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, @o0 Bundle bundle) {
        if (i10 == -1) {
            d.t(this.P, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void s(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, @o0 Intent intent, int i11, int i12, int i13, @o0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            b.L(this.O, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }

    public void t() {
    }
}
