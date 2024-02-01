package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.d;
import androidx.lifecycle.a0;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.p;
import d.h0;
import d.i;
import d.j0;
import d.m0;
import d.o;
import d.o0;
import d.x0;
import h0.b;
import h0.z2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import y2.c;
import y3.q;

public class FragmentActivity extends ComponentActivity implements b.d, b.f {

    /* renamed from: e0  reason: collision with root package name */
    public static final String f2502e0 = "android:support:fragments";
    public final e Z = e.b(new c());

    /* renamed from: a0  reason: collision with root package name */
    public final a0 f2503a0 = new a0(this);

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2504b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2505c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2506d0 = true;

    public class a implements c.C0245c {
        public a() {
        }

        @m0
        public Bundle a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.a0();
            FragmentActivity.this.f2503a0.l(p.a.ON_STOP);
            Parcelable P = FragmentActivity.this.Z.P();
            if (P != null) {
                bundle.putParcelable(FragmentActivity.f2502e0, P);
            }
            return bundle;
        }
    }

    public class b implements b.c {
        public b() {
        }

        public void a(@m0 Context context) {
            FragmentActivity.this.Z.a((Fragment) null);
            Bundle b10 = FragmentActivity.this.getSavedStateRegistry().b(FragmentActivity.f2502e0);
            if (b10 != null) {
                FragmentActivity.this.Z.L(b10.getParcelable(FragmentActivity.f2502e0));
            }
        }
    }

    public class c extends g<FragmentActivity> implements b1, androidx.activity.c, d, m {
        public c() {
            super(FragmentActivity.this);
        }

        public void a(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
            FragmentActivity.this.c0(fragment);
        }

        @o0
        public View c(int i10) {
            return FragmentActivity.this.findViewById(i10);
        }

        public boolean d() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @m0
        public p getLifecycle() {
            return FragmentActivity.this.f2503a0;
        }

        @m0
        public a1 getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @m0
        public OnBackPressedDispatcher h() {
            return FragmentActivity.this.h();
        }

        public void i(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @m0
        public LayoutInflater k() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        public int l() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        public boolean m() {
            return FragmentActivity.this.getWindow() != null;
        }

        public boolean o(@m0 Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        public boolean p(@m0 String str) {
            return h0.b.J(FragmentActivity.this, str);
        }

        public void t() {
            FragmentActivity.this.l0();
        }

        @m0
        public ActivityResultRegistry u() {
            return FragmentActivity.this.u();
        }

        /* renamed from: v */
        public FragmentActivity j() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        Z();
    }

    @o
    public FragmentActivity(@h0 int i10) {
        super(i10);
        Z();
    }

    private void Z() {
        getSavedStateRegistry().j(f2502e0, new a());
        C(new b());
    }

    public static boolean b0(FragmentManager fragmentManager, p.b bVar) {
        boolean z10 = false;
        for (Fragment next : fragmentManager.G0()) {
            if (next != null) {
                if (next.getHost() != null) {
                    z10 |= b0(next.getChildFragmentManager(), bVar);
                }
                y yVar = next.H0;
                if (yVar != null && yVar.getLifecycle().b().b(p.b.STARTED)) {
                    next.H0.f(bVar);
                    z10 = true;
                }
                if (next.G0.b().b(p.b.STARTED)) {
                    next.G0.s(bVar);
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @o0
    public final View W(@o0 View view, @m0 String str, @m0 Context context, @m0 AttributeSet attributeSet) {
        return this.Z.G(view, str, context, attributeSet);
    }

    @m0
    public FragmentManager X() {
        return this.Z.D();
    }

    @Deprecated
    @m0
    public l2.a Y() {
        return l2.a.d(this);
    }

    public void a0() {
        do {
        } while (b0(X(), p.b.CREATED));
    }

    @j0
    @Deprecated
    public void c0(@m0 Fragment fragment) {
    }

    @x0({x0.a.Q})
    @Deprecated
    public boolean d0(@o0 View view, @m0 Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void dump(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + q.a.R;
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f2504b0);
        printWriter.print(" mResumed=");
        printWriter.print(this.f2505c0);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2506d0);
        if (getApplication() != null) {
            l2.a.d(this).b(str2, fileDescriptor, printWriter, strArr);
        }
        this.Z.D().b0(str, fileDescriptor, printWriter, strArr);
    }

    public void e0() {
        this.f2503a0.l(p.a.ON_RESUME);
        this.Z.r();
    }

    public void f0(@o0 z2 z2Var) {
        h0.b.F(this, z2Var);
    }

    @Deprecated
    public final void g(int i10) {
    }

    public void g0(@o0 z2 z2Var) {
        h0.b.G(this, z2Var);
    }

    public void h0(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        i0(fragment, intent, i10, (Bundle) null);
    }

    public void i0(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, @o0 Bundle bundle) {
        if (i10 == -1) {
            h0.b.K(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i10, bundle);
        }
    }

    @Deprecated
    public void j0(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, @o0 Intent intent, int i11, int i12, int i13, @o0 Bundle bundle) throws IntentSender.SendIntentException {
        if (i10 == -1) {
            h0.b.L(this, intentSender, i10, intent, i11, i12, i13, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
        }
    }

    public void k0() {
        h0.b.w(this);
    }

    @Deprecated
    public void l0() {
        invalidateOptionsMenu();
    }

    public void m0() {
        h0.b.A(this);
    }

    public void n0() {
        h0.b.M(this);
    }

    @i
    public void onActivityResult(int i10, int i11, @o0 Intent intent) {
        this.Z.F();
        super.onActivityResult(i10, i11, intent);
    }

    public void onConfigurationChanged(@m0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.Z.F();
        this.Z.d(configuration);
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.f2503a0.l(p.a.ON_CREATE);
        this.Z.f();
    }

    public boolean onCreatePanelMenu(int i10, @m0 Menu menu) {
        return i10 == 0 ? super.onCreatePanelMenu(i10, menu) | this.Z.g(menu, getMenuInflater()) : super.onCreatePanelMenu(i10, menu);
    }

    @o0
    public View onCreateView(@o0 View view, @m0 String str, @m0 Context context, @m0 AttributeSet attributeSet) {
        View W = W(view, str, context, attributeSet);
        return W == null ? super.onCreateView(view, str, context, attributeSet) : W;
    }

    @o0
    public View onCreateView(@m0 String str, @m0 Context context, @m0 AttributeSet attributeSet) {
        View W = W((View) null, str, context, attributeSet);
        return W == null ? super.onCreateView(str, context, attributeSet) : W;
    }

    public void onDestroy() {
        super.onDestroy();
        this.Z.h();
        this.f2503a0.l(p.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.Z.j();
    }

    public boolean onMenuItemSelected(int i10, @m0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.Z.l(menuItem);
        }
        if (i10 != 6) {
            return false;
        }
        return this.Z.e(menuItem);
    }

    @i
    public void onMultiWindowModeChanged(boolean z10) {
        this.Z.k(z10);
    }

    @i
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.Z.F();
    }

    public void onPanelClosed(int i10, @m0 Menu menu) {
        if (i10 == 0) {
            this.Z.m(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    public void onPause() {
        super.onPause();
        this.f2505c0 = false;
        this.Z.n();
        this.f2503a0.l(p.a.ON_PAUSE);
    }

    @i
    public void onPictureInPictureModeChanged(boolean z10) {
        this.Z.o(z10);
    }

    public void onPostResume() {
        super.onPostResume();
        e0();
    }

    public boolean onPreparePanel(int i10, @o0 View view, @m0 Menu menu) {
        return i10 == 0 ? d0(view, menu) | this.Z.p(menu) : super.onPreparePanel(i10, view, menu);
    }

    @i
    public void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr) {
        this.Z.F();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    public void onResume() {
        super.onResume();
        this.f2505c0 = true;
        this.Z.F();
        this.Z.z();
    }

    public void onStart() {
        super.onStart();
        this.f2506d0 = false;
        if (!this.f2504b0) {
            this.f2504b0 = true;
            this.Z.c();
        }
        this.Z.F();
        this.Z.z();
        this.f2503a0.l(p.a.ON_START);
        this.Z.s();
    }

    public void onStateNotSaved() {
        this.Z.F();
    }

    public void onStop() {
        super.onStop();
        this.f2506d0 = true;
        a0();
        this.Z.t();
        this.f2503a0.l(p.a.ON_STOP);
    }
}
