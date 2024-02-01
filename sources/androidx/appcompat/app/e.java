package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c1;
import androidx.collection.b;
import d.b0;
import d.b1;
import d.h0;
import d.i;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import k.b;

public abstract class e {
    public static final boolean O = false;
    public static final String P = "AppCompatDelegate";
    public static final int Q = -1;
    @Deprecated
    public static final int R = 0;
    @Deprecated
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = -100;
    public static int X = -100;
    public static final b<WeakReference<e>> Y = new b<>();
    public static final Object Z = new Object();

    /* renamed from: a0  reason: collision with root package name */
    public static final int f825a0 = 108;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f826b0 = 109;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f827c0 = 10;

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static void G(@m0 e eVar) {
        synchronized (Z) {
            H(eVar);
        }
    }

    public static void H(@m0 e eVar) {
        synchronized (Z) {
            Iterator<WeakReference<e>> it = Y.iterator();
            while (it.hasNext()) {
                e eVar2 = (e) it.next().get();
                if (eVar2 == eVar || eVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public static void J(boolean z10) {
        c1.b(z10);
    }

    public static void N(int i10) {
        if ((i10 == -1 || i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) && X != i10) {
            X = i10;
            f();
        }
    }

    public static void c(@m0 e eVar) {
        synchronized (Z) {
            H(eVar);
            Y.add(new WeakReference(eVar));
        }
    }

    public static void f() {
        synchronized (Z) {
            Iterator<WeakReference<e>> it = Y.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next().get();
                if (eVar != null) {
                    eVar.e();
                }
            }
        }
    }

    @m0
    public static e i(@m0 Activity activity, @o0 d dVar) {
        return new AppCompatDelegateImpl(activity, dVar);
    }

    @m0
    public static e j(@m0 Dialog dialog, @o0 d dVar) {
        return new AppCompatDelegateImpl(dialog, dVar);
    }

    @m0
    public static e k(@m0 Context context, @m0 Activity activity, @o0 d dVar) {
        return new AppCompatDelegateImpl(context, activity, dVar);
    }

    @m0
    public static e l(@m0 Context context, @m0 Window window, @o0 d dVar) {
        return new AppCompatDelegateImpl(context, window, dVar);
    }

    public static int o() {
        return X;
    }

    public static boolean w() {
        return c1.a();
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D(Bundle bundle);

    public abstract void E();

    public abstract void F();

    public abstract boolean I(int i10);

    public abstract void K(@h0 int i10);

    public abstract void L(View view);

    public abstract void M(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void O(boolean z10);

    @t0(17)
    public abstract void P(int i10);

    public abstract void Q(@o0 Toolbar toolbar);

    public void R(@b1 int i10) {
    }

    public abstract void S(@o0 CharSequence charSequence);

    @o0
    public abstract k.b T(@m0 b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    @Deprecated
    public void g(Context context) {
    }

    @i
    @m0
    public Context h(@m0 Context context) {
        g(context);
        return context;
    }

    public abstract View m(@o0 View view, String str, @m0 Context context, @m0 AttributeSet attributeSet);

    @o0
    public abstract <T extends View> T n(@b0 int i10);

    @o0
    public abstract b.C0020b p();

    public int q() {
        return -100;
    }

    public abstract MenuInflater r();

    @o0
    public abstract a s();

    public abstract boolean t(int i10);

    public abstract void u();

    public abstract void v();

    public abstract boolean x();

    public abstract void y(Configuration configuration);

    public abstract void z(Bundle bundle);
}
