package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.d;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.a0;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import androidx.lifecycle.u;
import androidx.lifecycle.x0;
import androidx.lifecycle.y;
import c.a;
import c.b;
import d.h0;
import d.i;
import d.j0;
import d.m0;
import d.o0;
import h0.g;
import java.util.concurrent.atomic.AtomicInteger;
import y2.e;
import y2.f;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements b.a, y, b1, o, e, c, d, androidx.activity.result.b {
    public final b.b Q;
    public final a0 R;
    public final y2.d S;
    public a1 T;
    public x0.b U;
    public final OnBackPressedDispatcher V;
    @h0
    public int W;
    public final AtomicInteger X;
    public final ActivityResultRegistry Y;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    public class b extends ActivityResultRegistry {

        public class a implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ a.C0070a P;

            public a(int i10, a.C0070a aVar) {
                this.O = i10;
                this.P = aVar;
            }

            public void run() {
                b.this.c(this.O, this.P.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b  reason: collision with other inner class name */
        public class C0017b implements Runnable {
            public final /* synthetic */ int O;
            public final /* synthetic */ IntentSender.SendIntentException P;

            public C0017b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.O = i10;
                this.P = sendIntentException;
            }

            public void run() {
                b.this.b(this.O, 0, new Intent().setAction(b.k.f4764a).putExtra(b.k.f4766c, this.P));
            }
        }

        public b() {
        }

        public <I, O> void f(int i10, @m0 c.a<I, O> aVar, I i11, @o0 g gVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0070a<O> b10 = aVar.b(componentActivity, i11);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i10, b10));
                return;
            }
            Intent a10 = aVar.a(componentActivity, i11);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a10.hasExtra(b.j.f4763a)) {
                bundle = a10.getBundleExtra(b.j.f4763a);
                a10.removeExtra(b.j.f4763a);
            } else if (gVar != null) {
                bundle = gVar.l();
            }
            Bundle bundle2 = bundle;
            if (b.h.f4760a.equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra(b.h.f4761b);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                h0.b.D(componentActivity, stringArrayExtra, i10);
            } else if (b.k.f4764a.equals(a10.getAction())) {
                IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a10.getParcelableExtra(b.k.f4765b);
                try {
                    h0.b.L(componentActivity, intentSenderRequest.d(), i10, intentSenderRequest.a(), intentSenderRequest.b(), intentSenderRequest.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e10) {
                    new Handler(Looper.getMainLooper()).post(new C0017b(i10, e10));
                }
            } else {
                h0.b.K(componentActivity, a10, i10, bundle2);
            }
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public Object f621a;

        /* renamed from: b  reason: collision with root package name */
        public a1 f622b;
    }

    public ComponentActivity() {
        this.Q = new b.b();
        this.R = new a0(this);
        this.S = y2.d.a(this);
        this.V = new OnBackPressedDispatcher(new a());
        this.X = new AtomicInteger();
        this.Y = new b();
        if (getLifecycle() != null) {
            int i10 = Build.VERSION.SDK_INT;
            getLifecycle().a(new u() {
                public void d(@m0 y yVar, @m0 p.a aVar) {
                    if (aVar == p.a.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View peekDecorView = window != null ? window.peekDecorView() : null;
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            getLifecycle().a(new u() {
                public void d(@m0 y yVar, @m0 p.a aVar) {
                    if (aVar == p.a.ON_DESTROY) {
                        ComponentActivity.this.Q.b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().a();
                        }
                    }
                }
            });
            getLifecycle().a(new u() {
                public void d(@m0 y yVar, @m0 p.a aVar) {
                    ComponentActivity.this.S();
                    ComponentActivity.this.getLifecycle().d(this);
                }
            });
            if (i10 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    @d.o
    public ComponentActivity(@h0 int i10) {
        this();
        this.W = i10;
    }

    public final void C(@m0 b.c cVar) {
        this.Q.a(cVar);
    }

    public final void L(@m0 b.c cVar) {
        this.Q.e(cVar);
    }

    public void S() {
        if (this.T == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.T = cVar.f622b;
            }
            if (this.T == null) {
                this.T = new a1();
            }
        }
    }

    @o0
    @Deprecated
    public Object T() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.f621a;
        }
        return null;
    }

    public final void U() {
        c1.b(getWindow().getDecorView(), this);
        e1.b(getWindow().getDecorView(), this);
        f.b(getWindow().getDecorView(), this);
    }

    @o0
    @Deprecated
    public Object V() {
        return null;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        U();
        super.addContentView(view, layoutParams);
    }

    @m0
    public x0.b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.U == null) {
                this.U = new r0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.U;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @m0
    public p getLifecycle() {
        return this.R;
    }

    @m0
    public final y2.c getSavedStateRegistry() {
        return this.S.b();
    }

    @m0
    public a1 getViewModelStore() {
        if (getApplication() != null) {
            S();
            return this.T;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @m0
    public final OnBackPressedDispatcher h() {
        return this.V;
    }

    @i
    @Deprecated
    public void onActivityResult(int i10, int i11, @o0 Intent intent) {
        if (!this.Y.b(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @j0
    public void onBackPressed() {
        this.V.e();
    }

    public void onCreate(@o0 Bundle bundle) {
        this.S.d(bundle);
        this.Q.c(this);
        super.onCreate(bundle);
        this.Y.g(bundle);
        ReportFragment.g(this);
        int i10 = this.W;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @i
    @Deprecated
    public void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr) {
        if (!this.Y.b(i10, -1, new Intent().putExtra(b.h.f4761b, strArr).putExtra(b.h.f4762c, iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @o0
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object V2 = V();
        a1 a1Var = this.T;
        if (a1Var == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            a1Var = cVar.f622b;
        }
        if (a1Var == null && V2 == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.f621a = V2;
        cVar2.f622b = a1Var;
        return cVar2;
    }

    @i
    public void onSaveInstanceState(@m0 Bundle bundle) {
        p lifecycle = getLifecycle();
        if (lifecycle instanceof a0) {
            ((a0) lifecycle).s(p.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.S.e(bundle);
        this.Y.h(bundle);
    }

    public /* synthetic */ i2.a q() {
        return n.a(this);
    }

    @m0
    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(@m0 c.a<I, O> aVar, @m0 ActivityResultRegistry activityResultRegistry, @m0 androidx.activity.result.a<O> aVar2) {
        return activityResultRegistry.i("activity_rq#" + this.X.getAndIncrement(), this, aVar, aVar2);
    }

    @m0
    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(@m0 c.a<I, O> aVar, @m0 androidx.activity.result.a<O> aVar2) {
        return registerForActivityResult(aVar, this.Y, aVar2);
    }

    public void reportFullyDrawn() {
        try {
            if (f3.b.h()) {
                f3.b.c("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            f3.b.f();
        }
    }

    @o0
    public Context s() {
        return this.Q.d();
    }

    public void setContentView(@h0 int i10) {
        U();
        super.setContentView(i10);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        U();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        U();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, @o0 Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, @o0 Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, @o0 Intent intent, int i11, int i12, int i13, @o0 Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @m0
    public final ActivityResultRegistry u() {
        return this.Y;
    }
}
