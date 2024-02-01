package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.w0;
import androidx.appcompat.widget.y;
import androidx.lifecycle.p;
import d.b0;
import d.b1;
import d.g1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import f.a;
import f1.e3;
import f1.l;
import f1.p0;
import f1.s2;
import f1.t2;
import f1.u2;
import f1.w1;
import h0.v;
import java.lang.Thread;
import java.util.List;
import k.b;
import k.f;
import k0.g;

@x0({x0.a.O})
public class AppCompatDelegateImpl extends e implements e.a, LayoutInflater.Factory2 {

    /* renamed from: b1  reason: collision with root package name */
    public static final androidx.collection.i<String, Integer> f725b1 = new androidx.collection.i<>();

    /* renamed from: c1  reason: collision with root package name */
    public static final boolean f726c1 = false;

    /* renamed from: d1  reason: collision with root package name */
    public static final int[] f727d1 = {16842836};

    /* renamed from: e1  reason: collision with root package name */
    public static final boolean f728e1 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: f1  reason: collision with root package name */
    public static final boolean f729f1 = true;

    /* renamed from: g1  reason: collision with root package name */
    public static boolean f730g1 = false;

    /* renamed from: h1  reason: collision with root package name */
    public static final String f731h1 = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public PanelFeatureState[] G0;
    public PanelFeatureState H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public int N0;
    public int O0;
    public boolean P0;
    public boolean Q0;
    public q R0;
    public q S0;
    public boolean T0;
    public int U0;
    public final Runnable V0;
    public boolean W0;
    public Rect X0;
    public Rect Y0;
    public h Z0;

    /* renamed from: a1  reason: collision with root package name */
    public i f732a1;

    /* renamed from: d0  reason: collision with root package name */
    public final Object f733d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f734e0;

    /* renamed from: f0  reason: collision with root package name */
    public Window f735f0;

    /* renamed from: g0  reason: collision with root package name */
    public o f736g0;

    /* renamed from: h0  reason: collision with root package name */
    public final d f737h0;

    /* renamed from: i0  reason: collision with root package name */
    public a f738i0;

    /* renamed from: j0  reason: collision with root package name */
    public MenuInflater f739j0;

    /* renamed from: k0  reason: collision with root package name */
    public CharSequence f740k0;

    /* renamed from: l0  reason: collision with root package name */
    public y f741l0;

    /* renamed from: m0  reason: collision with root package name */
    public i f742m0;

    /* renamed from: n0  reason: collision with root package name */
    public u f743n0;

    /* renamed from: o0  reason: collision with root package name */
    public k.b f744o0;

    /* renamed from: p0  reason: collision with root package name */
    public ActionBarContextView f745p0;

    /* renamed from: q0  reason: collision with root package name */
    public PopupWindow f746q0;

    /* renamed from: r0  reason: collision with root package name */
    public Runnable f747r0;

    /* renamed from: s0  reason: collision with root package name */
    public s2 f748s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f749t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f750u0;

    /* renamed from: v0  reason: collision with root package name */
    public ViewGroup f751v0;

    /* renamed from: w0  reason: collision with root package name */
    public TextView f752w0;

    /* renamed from: x0  reason: collision with root package name */
    public View f753x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f754y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f755z0;

    public static final class PanelFeatureState {

        /* renamed from: a  reason: collision with root package name */
        public int f756a;

        /* renamed from: b  reason: collision with root package name */
        public int f757b;

        /* renamed from: c  reason: collision with root package name */
        public int f758c;

        /* renamed from: d  reason: collision with root package name */
        public int f759d;

        /* renamed from: e  reason: collision with root package name */
        public int f760e;

        /* renamed from: f  reason: collision with root package name */
        public int f761f;

        /* renamed from: g  reason: collision with root package name */
        public ViewGroup f762g;

        /* renamed from: h  reason: collision with root package name */
        public View f763h;

        /* renamed from: i  reason: collision with root package name */
        public View f764i;

        /* renamed from: j  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f765j;

        /* renamed from: k  reason: collision with root package name */
        public androidx.appcompat.view.menu.c f766k;

        /* renamed from: l  reason: collision with root package name */
        public Context f767l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f768m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f769n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f770o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f771p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f772q = false;

        /* renamed from: r  reason: collision with root package name */
        public boolean f773r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f774s;

        /* renamed from: t  reason: collision with root package name */
        public Bundle f775t;

        /* renamed from: u  reason: collision with root package name */
        public Bundle f776u;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new a();
            public int O;
            public boolean P;
            public Bundle Q;

            public class a implements Parcelable.ClassLoaderCreator<SavedState> {
                /* renamed from: a */
                public SavedState createFromParcel(Parcel parcel) {
                    return SavedState.a(parcel, (ClassLoader) null);
                }

                /* renamed from: b */
                public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.a(parcel, classLoader);
                }

                /* renamed from: c */
                public SavedState[] newArray(int i10) {
                    return new SavedState[i10];
                }
            }

            public static SavedState a(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.O = parcel.readInt();
                boolean z10 = true;
                if (parcel.readInt() != 1) {
                    z10 = false;
                }
                savedState.P = z10;
                if (z10) {
                    savedState.Q = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.O);
                parcel.writeInt(this.P ? 1 : 0);
                if (this.P) {
                    parcel.writeBundle(this.Q);
                }
            }
        }

        public PanelFeatureState(int i10) {
            this.f756a = i10;
        }

        public void a() {
            Bundle bundle;
            androidx.appcompat.view.menu.e eVar = this.f765j;
            if (eVar != null && (bundle = this.f775t) != null) {
                eVar.U(bundle);
                this.f775t = null;
            }
        }

        public void b() {
            androidx.appcompat.view.menu.e eVar = this.f765j;
            if (eVar != null) {
                eVar.S(this.f766k);
            }
            this.f766k = null;
        }

        public androidx.appcompat.view.menu.k c(j.a aVar) {
            if (this.f765j == null) {
                return null;
            }
            if (this.f766k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f767l, a.k.abc_list_menu_item_layout);
                this.f766k = cVar;
                cVar.h(aVar);
                this.f765j.b(this.f766k);
            }
            return this.f766k.m(this.f762g);
        }

        public boolean d() {
            if (this.f763h == null) {
                return false;
            }
            if (this.f764i != null) {
                return true;
            }
            return this.f766k.a().getCount() > 0;
        }

        public void e(Parcelable parcelable) {
            SavedState savedState = (SavedState) parcelable;
            this.f756a = savedState.O;
            this.f774s = savedState.P;
            this.f775t = savedState.Q;
            this.f763h = null;
            this.f762g = null;
        }

        public Parcelable f() {
            SavedState savedState = new SavedState();
            savedState.O = this.f756a;
            savedState.P = this.f770o;
            if (this.f765j != null) {
                Bundle bundle = new Bundle();
                savedState.Q = bundle;
                this.f765j.W(bundle);
            }
            return savedState;
        }

        public void g(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f765j;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.S(this.f766k);
                }
                this.f765j = eVar;
                if (eVar != null && (cVar = this.f766k) != null) {
                    eVar.b(cVar);
                }
            }
        }

        public void h(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(a.c.actionBarPopupTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                newTheme.applyStyle(i10, true);
            }
            newTheme.resolveAttribute(a.c.panelMenuListTheme, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 == 0) {
                i11 = a.m.Theme_AppCompat_CompactMenu;
            }
            newTheme.applyStyle(i11, true);
            k.d dVar = new k.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f767l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(a.n.AppCompatTheme);
            this.f757b = obtainStyledAttributes.getResourceId(a.n.AppCompatTheme_panelBackground, 0);
            this.f761f = obtainStyledAttributes.getResourceId(a.n.AppCompatTheme_android_windowAnimationStyle, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public class a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f777a;

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f777a = uncaughtExceptionHandler;
        }

        public final boolean a(Throwable th2) {
            String message;
            if (!(th2 instanceof Resources.NotFoundException) || (message = th2.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        public void uncaughtException(@m0 Thread thread, @m0 Throwable th2) {
            if (a(th2)) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException(th2.getMessage() + AppCompatDelegateImpl.f731h1);
                notFoundException.initCause(th2.getCause());
                notFoundException.setStackTrace(th2.getStackTrace());
                this.f777a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f777a.uncaughtException(thread, th2);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.U0 & 1) != 0) {
                appCompatDelegateImpl.h0(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.U0 & 4096) != 0) {
                appCompatDelegateImpl2.h0(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.T0 = false;
            appCompatDelegateImpl3.U0 = 0;
        }
    }

    public class c implements p0 {
        public c() {
        }

        public e3 a(View view, e3 e3Var) {
            int r10 = e3Var.r();
            int Y0 = AppCompatDelegateImpl.this.Y0(e3Var, (Rect) null);
            if (r10 != Y0) {
                e3Var = e3Var.D(e3Var.p(), Y0, e3Var.q(), e3Var.o());
            }
            return w1.e1(view, e3Var);
        }
    }

    public class d implements d0.a {
        public d() {
        }

        public void a(Rect rect) {
            rect.top = AppCompatDelegateImpl.this.Y0((e3) null, rect);
        }
    }

    public class e implements ContentFrameLayout.a {
        public e() {
        }

        public void a() {
        }

        public void onDetachedFromWindow() {
            AppCompatDelegateImpl.this.f0();
        }
    }

    public class f implements Runnable {

        public class a extends u2 {
            public a() {
            }

            public void b(View view) {
                AppCompatDelegateImpl.this.f745p0.setAlpha(1.0f);
                AppCompatDelegateImpl.this.f748s0.s((t2) null);
                AppCompatDelegateImpl.this.f748s0 = null;
            }

            public void c(View view) {
                AppCompatDelegateImpl.this.f745p0.setVisibility(0);
            }
        }

        public f() {
        }

        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.f746q0.showAtLocation(appCompatDelegateImpl.f745p0, 55, 0, 0);
            AppCompatDelegateImpl.this.i0();
            if (AppCompatDelegateImpl.this.R0()) {
                AppCompatDelegateImpl.this.f745p0.setAlpha(0.0f);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f748s0 = w1.f(appCompatDelegateImpl2.f745p0).a(1.0f);
                AppCompatDelegateImpl.this.f748s0.s(new a());
                return;
            }
            AppCompatDelegateImpl.this.f745p0.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f745p0.setVisibility(0);
        }
    }

    public class g extends u2 {
        public g() {
        }

        public void b(View view) {
            AppCompatDelegateImpl.this.f745p0.setAlpha(1.0f);
            AppCompatDelegateImpl.this.f748s0.s((t2) null);
            AppCompatDelegateImpl.this.f748s0 = null;
        }

        public void c(View view) {
            AppCompatDelegateImpl.this.f745p0.setVisibility(0);
            AppCompatDelegateImpl.this.f745p0.sendAccessibilityEvent(32);
            if (AppCompatDelegateImpl.this.f745p0.getParent() instanceof View) {
                w1.t1((View) AppCompatDelegateImpl.this.f745p0.getParent());
            }
        }
    }

    public class h implements b.C0020b {
        public h() {
        }

        public void a(Drawable drawable, int i10) {
            a s10 = AppCompatDelegateImpl.this.s();
            if (s10 != null) {
                s10.l0(drawable);
                s10.i0(i10);
            }
        }

        public Drawable b() {
            w0 F = w0.F(e(), (AttributeSet) null, new int[]{a.c.homeAsUpIndicator});
            Drawable h10 = F.h(0);
            F.I();
            return h10;
        }

        public void c(int i10) {
            a s10 = AppCompatDelegateImpl.this.s();
            if (s10 != null) {
                s10.i0(i10);
            }
        }

        public boolean d() {
            a s10 = AppCompatDelegateImpl.this.s();
            return (s10 == null || (s10.p() & 4) == 0) ? false : true;
        }

        public Context e() {
            return AppCompatDelegateImpl.this.n0();
        }
    }

    public final class i implements j.a {
        public i() {
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar, boolean z10) {
            AppCompatDelegateImpl.this.Z(eVar);
        }

        public boolean c(@m0 androidx.appcompat.view.menu.e eVar) {
            Window.Callback u02 = AppCompatDelegateImpl.this.u0();
            if (u02 == null) {
                return true;
            }
            u02.onMenuOpened(108, eVar);
            return true;
        }
    }

    public class j implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public b.a f784a;

        public class a extends u2 {
            public a() {
            }

            public void b(View view) {
                AppCompatDelegateImpl.this.f745p0.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f746q0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f745p0.getParent() instanceof View) {
                    w1.t1((View) AppCompatDelegateImpl.this.f745p0.getParent());
                }
                AppCompatDelegateImpl.this.f745p0.t();
                AppCompatDelegateImpl.this.f748s0.s((t2) null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f748s0 = null;
                w1.t1(appCompatDelegateImpl2.f751v0);
            }
        }

        public j(b.a aVar) {
            this.f784a = aVar;
        }

        public boolean a(k.b bVar, MenuItem menuItem) {
            return this.f784a.a(bVar, menuItem);
        }

        public boolean b(k.b bVar, Menu menu) {
            return this.f784a.b(bVar, menu);
        }

        public boolean c(k.b bVar, Menu menu) {
            w1.t1(AppCompatDelegateImpl.this.f751v0);
            return this.f784a.c(bVar, menu);
        }

        public void d(k.b bVar) {
            this.f784a.d(bVar);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f746q0 != null) {
                appCompatDelegateImpl.f735f0.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f747r0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f745p0 != null) {
                appCompatDelegateImpl2.i0();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl3.f748s0 = w1.f(appCompatDelegateImpl3.f745p0).a(0.0f);
                AppCompatDelegateImpl.this.f748s0.s(new a());
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            d dVar = appCompatDelegateImpl4.f737h0;
            if (dVar != null) {
                dVar.j(appCompatDelegateImpl4.f744o0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f744o0 = null;
            w1.t1(appCompatDelegateImpl5.f751v0);
        }
    }

    @t0(17)
    public static class k {
        public static Context a(@m0 Context context, @m0 Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(@m0 Configuration configuration, @m0 Configuration configuration2, @m0 Configuration configuration3) {
            int i10 = configuration.densityDpi;
            int i11 = configuration2.densityDpi;
            if (i10 != i11) {
                configuration3.densityDpi = i11;
            }
        }
    }

    @t0(21)
    public static class l {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    @t0(24)
    public static class m {
        public static void a(@m0 Configuration configuration, @m0 Configuration configuration2, @m0 Configuration configuration3) {
            LocaleList a10 = configuration.getLocales();
            LocaleList a11 = configuration2.getLocales();
            if (!a10.equals(a11)) {
                configuration3.setLocales(a11);
                configuration3.locale = configuration2.locale;
            }
        }
    }

    @t0(26)
    public static class n {
        public static void a(@m0 Configuration configuration, @m0 Configuration configuration2, @m0 Configuration configuration3) {
            int i10 = configuration.colorMode & 3;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 3)) {
                configuration3.colorMode |= i11 & 3;
            }
            int i12 = configuration.colorMode & 12;
            int i13 = configuration2.colorMode;
            if (i12 != (i13 & 12)) {
                configuration3.colorMode |= i13 & 12;
            }
        }
    }

    public class o extends k.k {
        public o(Window.Callback callback) {
            super(callback);
        }

        public final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(AppCompatDelegateImpl.this.f734e0, callback);
            k.b T = AppCompatDelegateImpl.this.T(aVar);
            if (T != null) {
                return aVar.e(T);
            }
            return null;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || AppCompatDelegateImpl.this.F0(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            AppCompatDelegateImpl.this.I0(i10);
            return true;
        }

        public void onPanelClosed(int i10, Menu menu) {
            super.onPanelClosed(i10, menu);
            AppCompatDelegateImpl.this.J0(i10);
        }

        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.i0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i10, view, menu);
            if (eVar != null) {
                eVar.i0(false);
            }
            return onPreparePanel;
        }

        @t0(24)
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            PanelFeatureState r02 = AppCompatDelegateImpl.this.r0(0, true);
            if (r02 == null || (eVar = r02.f765j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @t0(23)
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (!AppCompatDelegateImpl.this.x() || i10 != 0) ? super.onWindowStartingActionMode(callback, i10) : b(callback);
        }
    }

    public class p extends q {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f787c;

        public p(@m0 Context context) {
            super();
            this.f787c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return l.a(this.f787c) ? 2 : 1;
        }

        public void e() {
            AppCompatDelegateImpl.this.e();
        }
    }

    @g1
    @x0({x0.a.O})
    public abstract class q {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f789a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                q.this.e();
            }
        }

        public q() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f789a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f734e0.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f789a = null;
            }
        }

        @o0
        public abstract IntentFilter b();

        public abstract int c();

        public boolean d() {
            return this.f789a != null;
        }

        public abstract void e();

        public void f() {
            a();
            IntentFilter b10 = b();
            if (b10 != null && b10.countActions() != 0) {
                if (this.f789a == null) {
                    this.f789a = new a();
                }
                AppCompatDelegateImpl.this.f734e0.registerReceiver(this.f789a, b10);
            }
        }
    }

    public class r extends q {

        /* renamed from: c  reason: collision with root package name */
        public final n f792c;

        public r(@m0 n nVar) {
            super();
            this.f792c = nVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        public int c() {
            return this.f792c.d() ? 2 : 1;
        }

        public void e() {
            AppCompatDelegateImpl.this.e();
        }
    }

    @t0(17)
    public static class s {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    public class t extends ContentFrameLayout {
        public t(Context context) {
            super(context);
        }

        public final boolean c(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.g0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            AppCompatDelegateImpl.this.b0(0);
            return true;
        }

        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(g.a.d(getContext(), i10));
        }
    }

    public final class u implements j.a {
        public u() {
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e G = eVar.G();
            boolean z11 = G != eVar;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z11) {
                eVar = G;
            }
            PanelFeatureState l02 = appCompatDelegateImpl.l0(eVar);
            if (l02 == null) {
                return;
            }
            if (z11) {
                AppCompatDelegateImpl.this.Y(l02.f756a, l02, G);
                AppCompatDelegateImpl.this.c0(l02, true);
                return;
            }
            AppCompatDelegateImpl.this.c0(l02, z10);
        }

        public boolean c(@m0 androidx.appcompat.view.menu.e eVar) {
            Window.Callback u02;
            if (eVar != eVar.G()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.A0 || (u02 = appCompatDelegateImpl.u0()) == null || AppCompatDelegateImpl.this.M0) {
                return true;
            }
            u02.onMenuOpened(108, eVar);
            return true;
        }
    }

    public AppCompatDelegateImpl(Activity activity, d dVar) {
        this(activity, (Window) null, dVar, activity);
    }

    public AppCompatDelegateImpl(Dialog dialog, d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    public AppCompatDelegateImpl(Context context, Activity activity, d dVar) {
        this(context, (Window) null, dVar, activity);
    }

    public AppCompatDelegateImpl(Context context, Window window, d dVar) {
        this(context, window, dVar, context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r3 = f725b1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatDelegateImpl(android.content.Context r3, android.view.Window r4, androidx.appcompat.app.d r5, java.lang.Object r6) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f748s0 = r0
            r0 = 1
            r2.f749t0 = r0
            r0 = -100
            r2.N0 = r0
            androidx.appcompat.app.AppCompatDelegateImpl$b r1 = new androidx.appcompat.app.AppCompatDelegateImpl$b
            r1.<init>()
            r2.V0 = r1
            r2.f734e0 = r3
            r2.f737h0 = r5
            r2.f733d0 = r6
            int r3 = r2.N0
            if (r3 != r0) goto L_0x0032
            boolean r3 = r6 instanceof android.app.Dialog
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.AppCompatActivity r3 = r2.V0()
            if (r3 == 0) goto L_0x0032
            androidx.appcompat.app.e r3 = r3.o0()
            int r3 = r3.q()
            r2.N0 = r3
        L_0x0032:
            int r3 = r2.N0
            if (r3 != r0) goto L_0x0059
            androidx.collection.i<java.lang.String, java.lang.Integer> r3 = f725b1
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.Object r5 = r3.get(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L_0x0059
            int r5 = r5.intValue()
            r2.N0 = r5
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getName()
            r3.remove(r5)
        L_0x0059:
            if (r4 == 0) goto L_0x005e
            r2.W(r4)
        L_0x005e:
            androidx.appcompat.widget.f.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.<init>(android.content.Context, android.view.Window, androidx.appcompat.app.d, java.lang.Object):void");
    }

    @m0
    public static Configuration m0(@m0 Configuration configuration, @o0 Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (!(configuration2 == null || configuration.diff(configuration2) == 0)) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                m.a(configuration, configuration2, configuration3);
            } else if (!e1.i.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & 192;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 192)) {
                configuration3.screenLayout |= i30 & 192;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & r6.i.G;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & r6.i.G)) {
                configuration3.screenLayout |= i34 & r6.i.G;
            }
            if (i14 >= 26) {
                n.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            k.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f733d0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0009
            androidx.appcompat.app.e.G(r3)
        L_0x0009:
            boolean r0 = r3.T0
            if (r0 == 0) goto L_0x0018
            android.view.Window r0 = r3.f735f0
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.V0
            r0.removeCallbacks(r1)
        L_0x0018:
            r0 = 0
            r3.L0 = r0
            r0 = 1
            r3.M0 = r0
            int r0 = r3.N0
            r1 = -100
            if (r0 == r1) goto L_0x0048
            java.lang.Object r0 = r3.f733d0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0048
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x0048
            androidx.collection.i<java.lang.String, java.lang.Integer> r0 = f725b1
            java.lang.Object r1 = r3.f733d0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.N0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x0057
        L_0x0048:
            androidx.collection.i<java.lang.String, java.lang.Integer> r0 = f725b1
            java.lang.Object r1 = r3.f733d0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x0057:
            androidx.appcompat.app.a r0 = r3.f738i0
            if (r0 == 0) goto L_0x005e
            r0.J()
        L_0x005e:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.A():void");
    }

    public final boolean A0() {
        if (!this.Q0 && (this.f733d0 instanceof Activity)) {
            PackageManager packageManager = this.f734e0.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i10 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f734e0, this.f733d0.getClass()), i10 >= 29 ? 269221888 : i10 >= 24 ? 786432 : 0);
                this.P0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException unused) {
                this.P0 = false;
            }
        }
        this.Q0 = true;
        return this.P0;
    }

    public void B(Bundle bundle) {
        j0();
    }

    public int B0(@m0 Context context, int i10) {
        q q02;
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (!(i10 == 1 || i10 == 2)) {
                    if (i10 == 3) {
                        q02 = o0(context);
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                q02 = q0(context);
            }
            return q02.c();
        }
        return i10;
    }

    public void C() {
        a s10 = s();
        if (s10 != null) {
            s10.u0(true);
        }
    }

    public boolean C0() {
        k.b bVar = this.f744o0;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        a s10 = s();
        return s10 != null && s10.m();
    }

    public void D(Bundle bundle) {
    }

    public boolean D0(int i10, KeyEvent keyEvent) {
        boolean z10 = true;
        if (i10 == 4) {
            if ((keyEvent.getFlags() & 128) == 0) {
                z10 = false;
            }
            this.I0 = z10;
        } else if (i10 == 82) {
            E0(0, keyEvent);
            return true;
        }
        return false;
    }

    public void E() {
        this.L0 = true;
        e();
    }

    public final boolean E0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState r02 = r0(i10, true);
        if (!r02.f770o) {
            return O0(r02, keyEvent);
        }
        return false;
    }

    public void F() {
        this.L0 = false;
        a s10 = s();
        if (s10 != null) {
            s10.u0(false);
        }
    }

    public boolean F0(int i10, KeyEvent keyEvent) {
        a s10 = s();
        if (s10 != null && s10.K(i10, keyEvent)) {
            return true;
        }
        PanelFeatureState panelFeatureState = this.H0;
        if (panelFeatureState == null || !N0(panelFeatureState, keyEvent.getKeyCode(), keyEvent, 1)) {
            if (this.H0 == null) {
                PanelFeatureState r02 = r0(0, true);
                O0(r02, keyEvent);
                boolean N02 = N0(r02, keyEvent.getKeyCode(), keyEvent, 1);
                r02.f768m = false;
                if (N02) {
                    return true;
                }
            }
            return false;
        }
        PanelFeatureState panelFeatureState2 = this.H0;
        if (panelFeatureState2 != null) {
            panelFeatureState2.f769n = true;
        }
        return true;
    }

    public boolean G0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            boolean z10 = this.I0;
            this.I0 = false;
            PanelFeatureState r02 = r0(0, false);
            if (r02 != null && r02.f770o) {
                if (!z10) {
                    c0(r02, true);
                }
                return true;
            } else if (C0()) {
                return true;
            }
        } else if (i10 == 82) {
            H0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean H0(int i10, KeyEvent keyEvent) {
        AudioManager audioManager;
        boolean z10;
        y yVar;
        if (this.f744o0 != null) {
            return false;
        }
        boolean z11 = true;
        PanelFeatureState r02 = r0(i10, true);
        if (i10 != 0 || (yVar = this.f741l0) == null || !yVar.i() || ViewConfiguration.get(this.f734e0).hasPermanentMenuKey()) {
            boolean z12 = r02.f770o;
            if (z12 || r02.f769n) {
                c0(r02, true);
                z11 = z12;
                if (z11 && (audioManager = (AudioManager) this.f734e0.getApplicationContext().getSystemService(w7.s.f14801b)) != null) {
                    audioManager.playSoundEffect(0);
                }
                return z11;
            } else if (r02.f768m) {
                if (r02.f773r) {
                    r02.f768m = false;
                    z10 = O0(r02, keyEvent);
                } else {
                    z10 = true;
                }
                if (z10) {
                    L0(r02, keyEvent);
                    audioManager.playSoundEffect(0);
                    return z11;
                }
            }
        } else {
            if (this.f741l0.f()) {
                z11 = this.f741l0.l();
            } else if (!this.M0 && O0(r02, keyEvent)) {
                z11 = this.f741l0.m();
            }
            audioManager.playSoundEffect(0);
            return z11;
        }
        z11 = false;
        audioManager.playSoundEffect(0);
        return z11;
    }

    public boolean I(int i10) {
        int Q02 = Q0(i10);
        if (this.E0 && Q02 == 108) {
            return false;
        }
        if (this.A0 && Q02 == 1) {
            this.A0 = false;
        }
        if (Q02 == 1) {
            U0();
            this.E0 = true;
            return true;
        } else if (Q02 == 2) {
            U0();
            this.f754y0 = true;
            return true;
        } else if (Q02 == 5) {
            U0();
            this.f755z0 = true;
            return true;
        } else if (Q02 == 10) {
            U0();
            this.C0 = true;
            return true;
        } else if (Q02 == 108) {
            U0();
            this.A0 = true;
            return true;
        } else if (Q02 != 109) {
            return this.f735f0.requestFeature(Q02);
        } else {
            U0();
            this.B0 = true;
            return true;
        }
    }

    public void I0(int i10) {
        a s10;
        if (i10 == 108 && (s10 = s()) != null) {
            s10.n(true);
        }
    }

    public void J0(int i10) {
        if (i10 == 108) {
            a s10 = s();
            if (s10 != null) {
                s10.n(false);
            }
        } else if (i10 == 0) {
            PanelFeatureState r02 = r0(i10, true);
            if (r02.f770o) {
                c0(r02, false);
            }
        }
    }

    public void K(int i10) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.f751v0.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f734e0).inflate(i10, viewGroup);
        this.f736g0.a().onContentChanged();
    }

    public void K0(ViewGroup viewGroup) {
    }

    public void L(View view) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.f751v0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f736g0.a().onContentChanged();
    }

    public final void L0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        int i10;
        ViewGroup.LayoutParams layoutParams;
        if (!panelFeatureState.f770o && !this.M0) {
            if (panelFeatureState.f756a == 0) {
                if ((this.f734e0.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback u02 = u0();
            if (u02 == null || u02.onMenuOpened(panelFeatureState.f756a, panelFeatureState.f765j)) {
                WindowManager windowManager = (WindowManager) this.f734e0.getSystemService("window");
                if (windowManager != null && O0(panelFeatureState, keyEvent)) {
                    ViewGroup viewGroup = panelFeatureState.f762g;
                    if (viewGroup == null || panelFeatureState.f772q) {
                        if (viewGroup == null) {
                            if (!x0(panelFeatureState) || panelFeatureState.f762g == null) {
                                return;
                            }
                        } else if (panelFeatureState.f772q && viewGroup.getChildCount() > 0) {
                            panelFeatureState.f762g.removeAllViews();
                        }
                        if (!w0(panelFeatureState) || !panelFeatureState.d()) {
                            panelFeatureState.f772q = true;
                            return;
                        }
                        ViewGroup.LayoutParams layoutParams2 = panelFeatureState.f763h.getLayoutParams();
                        if (layoutParams2 == null) {
                            layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f762g.setBackgroundResource(panelFeatureState.f757b);
                        ViewParent parent = panelFeatureState.f763h.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f763h);
                        }
                        panelFeatureState.f762g.addView(panelFeatureState.f763h, layoutParams2);
                        if (!panelFeatureState.f763h.hasFocus()) {
                            panelFeatureState.f763h.requestFocus();
                        }
                    } else {
                        View view = panelFeatureState.f764i;
                        if (!(view == null || (layoutParams = view.getLayoutParams()) == null || layoutParams.width != -1)) {
                            i10 = -1;
                            panelFeatureState.f769n = false;
                            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f759d, panelFeatureState.f760e, 1002, 8519680, -3);
                            layoutParams3.gravity = panelFeatureState.f758c;
                            layoutParams3.windowAnimations = panelFeatureState.f761f;
                            windowManager.addView(panelFeatureState.f762g, layoutParams3);
                            panelFeatureState.f770o = true;
                            return;
                        }
                    }
                    i10 = -2;
                    panelFeatureState.f769n = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i10, -2, panelFeatureState.f759d, panelFeatureState.f760e, 1002, 8519680, -3);
                    layoutParams32.gravity = panelFeatureState.f758c;
                    layoutParams32.windowAnimations = panelFeatureState.f761f;
                    windowManager.addView(panelFeatureState.f762g, layoutParams32);
                    panelFeatureState.f770o = true;
                    return;
                }
                return;
            }
            c0(panelFeatureState, true);
        }
    }

    public void M(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ViewGroup viewGroup = (ViewGroup) this.f751v0.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f736g0.a().onContentChanged();
    }

    public final a M0() {
        return this.f738i0;
    }

    public final boolean N0(PanelFeatureState panelFeatureState, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean z10 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f768m || O0(panelFeatureState, keyEvent)) && (eVar = panelFeatureState.f765j) != null) {
            z10 = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (z10 && (i11 & 1) == 0 && this.f741l0 == null) {
            c0(panelFeatureState, true);
        }
        return z10;
    }

    public void O(boolean z10) {
        this.f749t0 = z10;
    }

    public final boolean O0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        y yVar;
        y yVar2;
        y yVar3;
        if (this.M0) {
            return false;
        }
        if (panelFeatureState.f768m) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.H0;
        if (!(panelFeatureState2 == null || panelFeatureState2 == panelFeatureState)) {
            c0(panelFeatureState2, false);
        }
        Window.Callback u02 = u0();
        if (u02 != null) {
            panelFeatureState.f764i = u02.onCreatePanelView(panelFeatureState.f756a);
        }
        int i10 = panelFeatureState.f756a;
        boolean z10 = i10 == 0 || i10 == 108;
        if (z10 && (yVar3 = this.f741l0) != null) {
            yVar3.g();
        }
        if (panelFeatureState.f764i == null && (!z10 || !(M0() instanceof l))) {
            androidx.appcompat.view.menu.e eVar = panelFeatureState.f765j;
            if (eVar == null || panelFeatureState.f773r) {
                if (eVar == null && (!y0(panelFeatureState) || panelFeatureState.f765j == null)) {
                    return false;
                }
                if (z10 && this.f741l0 != null) {
                    if (this.f742m0 == null) {
                        this.f742m0 = new i();
                    }
                    this.f741l0.c(panelFeatureState.f765j, this.f742m0);
                }
                panelFeatureState.f765j.m0();
                if (!u02.onCreatePanelMenu(panelFeatureState.f756a, panelFeatureState.f765j)) {
                    panelFeatureState.g((androidx.appcompat.view.menu.e) null);
                    if (z10 && (yVar2 = this.f741l0) != null) {
                        yVar2.c((Menu) null, this.f742m0);
                    }
                    return false;
                }
                panelFeatureState.f773r = false;
            }
            panelFeatureState.f765j.m0();
            Bundle bundle = panelFeatureState.f776u;
            if (bundle != null) {
                panelFeatureState.f765j.T(bundle);
                panelFeatureState.f776u = null;
            }
            if (!u02.onPreparePanel(0, panelFeatureState.f764i, panelFeatureState.f765j)) {
                if (z10 && (yVar = this.f741l0) != null) {
                    yVar.c((Menu) null, this.f742m0);
                }
                panelFeatureState.f765j.l0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            panelFeatureState.f771p = z11;
            panelFeatureState.f765j.setQwertyMode(z11);
            panelFeatureState.f765j.l0();
        }
        panelFeatureState.f768m = true;
        panelFeatureState.f769n = false;
        this.H0 = panelFeatureState;
        return true;
    }

    @t0(17)
    public void P(int i10) {
        if (this.N0 != i10) {
            this.N0 = i10;
            if (this.J0) {
                e();
            }
        }
    }

    public final void P0(boolean z10) {
        y yVar = this.f741l0;
        if (yVar == null || !yVar.i() || (ViewConfiguration.get(this.f734e0).hasPermanentMenuKey() && !this.f741l0.k())) {
            PanelFeatureState r02 = r0(0, true);
            r02.f772q = true;
            c0(r02, false);
            L0(r02, (KeyEvent) null);
            return;
        }
        Window.Callback u02 = u0();
        if (this.f741l0.f() && z10) {
            this.f741l0.l();
            if (!this.M0) {
                u02.onPanelClosed(108, r0(0, true).f765j);
            }
        } else if (u02 != null && !this.M0) {
            if (this.T0 && (this.U0 & 1) != 0) {
                this.f735f0.getDecorView().removeCallbacks(this.V0);
                this.V0.run();
            }
            PanelFeatureState r03 = r0(0, true);
            androidx.appcompat.view.menu.e eVar = r03.f765j;
            if (eVar != null && !r03.f773r && u02.onPreparePanel(0, r03.f764i, eVar)) {
                u02.onMenuOpened(108, r03.f765j);
                this.f741l0.m();
            }
        }
    }

    public void Q(Toolbar toolbar) {
        Window window;
        Window.Callback callback;
        if (this.f733d0 instanceof Activity) {
            a s10 = s();
            if (!(s10 instanceof o)) {
                this.f739j0 = null;
                if (s10 != null) {
                    s10.J();
                }
                if (toolbar != null) {
                    l lVar = new l(toolbar, t0(), this.f736g0);
                    this.f738i0 = lVar;
                    window = this.f735f0;
                    callback = lVar.F0();
                } else {
                    this.f738i0 = null;
                    window = this.f735f0;
                    callback = this.f736g0;
                }
                window.setCallback(callback);
                v();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final int Q0(int i10) {
        if (i10 == 8) {
            return 108;
        }
        if (i10 == 9) {
            return 109;
        }
        return i10;
    }

    public void R(@b1 int i10) {
        this.O0 = i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f751v0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean R0() {
        /*
            r1 = this;
            boolean r0 = r1.f750u0
            if (r0 == 0) goto L_0x0010
            android.view.ViewGroup r0 = r1.f751v0
            if (r0 == 0) goto L_0x0010
            boolean r0 = f1.w1.T0(r0)
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.R0():boolean");
    }

    public final void S(CharSequence charSequence) {
        this.f740k0 = charSequence;
        y yVar = this.f741l0;
        if (yVar != null) {
            yVar.setWindowTitle(charSequence);
        } else if (M0() != null) {
            M0().B0(charSequence);
        } else {
            TextView textView = this.f752w0;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    public final boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f735f0.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || w1.N0((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public k.b T(@m0 b.a aVar) {
        d dVar;
        if (aVar != null) {
            k.b bVar = this.f744o0;
            if (bVar != null) {
                bVar.c();
            }
            j jVar = new j(aVar);
            a s10 = s();
            if (s10 != null) {
                k.b D02 = s10.D0(jVar);
                this.f744o0 = D02;
                if (!(D02 == null || (dVar = this.f737h0) == null)) {
                    dVar.M(D02);
                }
            }
            if (this.f744o0 == null) {
                this.f744o0 = T0(jVar);
            }
            return this.f744o0;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k.b T0(@d.m0 k.b.a r8) {
        /*
            r7 = this;
            r7.i0()
            k.b r0 = r7.f744o0
            if (r0 == 0) goto L_0x000a
            r0.c()
        L_0x000a:
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatDelegateImpl.j
            if (r0 != 0) goto L_0x0014
            androidx.appcompat.app.AppCompatDelegateImpl$j r0 = new androidx.appcompat.app.AppCompatDelegateImpl$j
            r0.<init>(r8)
            r8 = r0
        L_0x0014:
            androidx.appcompat.app.d r0 = r7.f737h0
            r1 = 0
            if (r0 == 0) goto L_0x0022
            boolean r2 = r7.M0
            if (r2 != 0) goto L_0x0022
            k.b r0 = r0.H(r8)     // Catch:{ AbstractMethodError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r1
        L_0x0023:
            if (r0 == 0) goto L_0x0029
            r7.f744o0 = r0
            goto L_0x0162
        L_0x0029:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f745p0
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x00d4
            boolean r0 = r7.D0
            if (r0 == 0) goto L_0x00b5
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r4 = r7.f734e0
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r5 = f.a.c.actionBarTheme
            r4.resolveAttribute(r5, r0, r3)
            int r5 = r0.resourceId
            if (r5 == 0) goto L_0x0068
            android.content.Context r5 = r7.f734e0
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            r5.setTo(r4)
            int r4 = r0.resourceId
            r5.applyStyle(r4, r3)
            k.d r4 = new k.d
            android.content.Context r6 = r7.f734e0
            r4.<init>((android.content.Context) r6, (int) r2)
            android.content.res.Resources$Theme r6 = r4.getTheme()
            r6.setTo(r5)
            goto L_0x006a
        L_0x0068:
            android.content.Context r4 = r7.f734e0
        L_0x006a:
            androidx.appcompat.widget.ActionBarContextView r5 = new androidx.appcompat.widget.ActionBarContextView
            r5.<init>(r4)
            r7.f745p0 = r5
            android.widget.PopupWindow r5 = new android.widget.PopupWindow
            int r6 = f.a.c.actionModePopupWindowStyle
            r5.<init>(r4, r1, r6)
            r7.f746q0 = r5
            r6 = 2
            androidx.core.widget.o.d(r5, r6)
            android.widget.PopupWindow r5 = r7.f746q0
            androidx.appcompat.widget.ActionBarContextView r6 = r7.f745p0
            r5.setContentView(r6)
            android.widget.PopupWindow r5 = r7.f746q0
            r6 = -1
            r5.setWidth(r6)
            android.content.res.Resources$Theme r5 = r4.getTheme()
            int r6 = f.a.c.actionBarSize
            r5.resolveAttribute(r6, r0, r3)
            int r0 = r0.data
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            int r0 = android.util.TypedValue.complexToDimensionPixelSize(r0, r4)
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f745p0
            r4.setContentHeight(r0)
            android.widget.PopupWindow r0 = r7.f746q0
            r4 = -2
            r0.setHeight(r4)
            androidx.appcompat.app.AppCompatDelegateImpl$f r0 = new androidx.appcompat.app.AppCompatDelegateImpl$f
            r0.<init>()
            r7.f747r0 = r0
            goto L_0x00d4
        L_0x00b5:
            android.view.ViewGroup r0 = r7.f751v0
            int r4 = f.a.h.action_mode_bar_stub
            android.view.View r0 = r0.findViewById(r4)
            androidx.appcompat.widget.ViewStubCompat r0 = (androidx.appcompat.widget.ViewStubCompat) r0
            if (r0 == 0) goto L_0x00d4
            android.content.Context r4 = r7.n0()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0.setLayoutInflater(r4)
            android.view.View r0 = r0.a()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r7.f745p0 = r0
        L_0x00d4:
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f745p0
            if (r0 == 0) goto L_0x0162
            r7.i0()
            androidx.appcompat.widget.ActionBarContextView r0 = r7.f745p0
            r0.t()
            k.e r0 = new k.e
            androidx.appcompat.widget.ActionBarContextView r4 = r7.f745p0
            android.content.Context r4 = r4.getContext()
            androidx.appcompat.widget.ActionBarContextView r5 = r7.f745p0
            android.widget.PopupWindow r6 = r7.f746q0
            if (r6 != 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r3 = r2
        L_0x00f0:
            r0.<init>(r4, r5, r8, r3)
            android.view.Menu r3 = r0.e()
            boolean r8 = r8.b(r0, r3)
            if (r8 == 0) goto L_0x0160
            r0.k()
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            r8.q(r0)
            r7.f744o0 = r0
            boolean r8 = r7.R0()
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            r1 = 0
            r8.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            f1.s2 r8 = f1.w1.f(r8)
            f1.s2 r8 = r8.a(r0)
            r7.f748s0 = r8
            androidx.appcompat.app.AppCompatDelegateImpl$g r0 = new androidx.appcompat.app.AppCompatDelegateImpl$g
            r0.<init>()
            r8.s(r0)
            goto L_0x0150
        L_0x012a:
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            r8.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            r8.setVisibility(r2)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            r0 = 32
            r8.sendAccessibilityEvent(r0)
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            android.view.ViewParent r8 = r8.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x0150
            androidx.appcompat.widget.ActionBarContextView r8 = r7.f745p0
            android.view.ViewParent r8 = r8.getParent()
            android.view.View r8 = (android.view.View) r8
            f1.w1.t1(r8)
        L_0x0150:
            android.widget.PopupWindow r8 = r7.f746q0
            if (r8 == 0) goto L_0x0162
            android.view.Window r8 = r7.f735f0
            android.view.View r8 = r8.getDecorView()
            java.lang.Runnable r0 = r7.f747r0
            r8.post(r0)
            goto L_0x0162
        L_0x0160:
            r7.f744o0 = r1
        L_0x0162:
            k.b r8 = r7.f744o0
            if (r8 == 0) goto L_0x016d
            androidx.appcompat.app.d r0 = r7.f737h0
            if (r0 == 0) goto L_0x016d
            r0.M(r8)
        L_0x016d:
            k.b r8 = r7.f744o0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.T0(k.b$a):k.b");
    }

    public final boolean U(boolean z10) {
        if (this.M0) {
            return false;
        }
        int X = X();
        boolean W02 = W0(B0(this.f734e0, X), z10);
        if (X == 0) {
            q0(this.f734e0).f();
        } else {
            q qVar = this.R0;
            if (qVar != null) {
                qVar.a();
            }
        }
        if (X == 3) {
            o0(this.f734e0).f();
        } else {
            q qVar2 = this.S0;
            if (qVar2 != null) {
                qVar2.a();
            }
        }
        return W02;
    }

    public final void U0() {
        if (this.f750u0) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f751v0.findViewById(16908290);
        View decorView = this.f735f0.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f734e0.obtainStyledAttributes(a.n.AppCompatTheme);
        obtainStyledAttributes.getValue(a.n.AppCompatTheme_windowMinWidthMajor, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(a.n.AppCompatTheme_windowMinWidthMinor, contentFrameLayout.getMinWidthMinor());
        int i10 = a.n.AppCompatTheme_windowFixedWidthMajor;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedWidthMajor());
        }
        int i11 = a.n.AppCompatTheme_windowFixedWidthMinor;
        if (obtainStyledAttributes.hasValue(i11)) {
            obtainStyledAttributes.getValue(i11, contentFrameLayout.getFixedWidthMinor());
        }
        int i12 = a.n.AppCompatTheme_windowFixedHeightMajor;
        if (obtainStyledAttributes.hasValue(i12)) {
            obtainStyledAttributes.getValue(i12, contentFrameLayout.getFixedHeightMajor());
        }
        int i13 = a.n.AppCompatTheme_windowFixedHeightMinor;
        if (obtainStyledAttributes.hasValue(i13)) {
            obtainStyledAttributes.getValue(i13, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    @o0
    public final AppCompatActivity V0() {
        Context context = this.f734e0;
        while (context != null) {
            if (!(context instanceof AppCompatActivity)) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                return (AppCompatActivity) context;
            }
        }
        return null;
    }

    public final void W(@m0 Window window) {
        if (this.f735f0 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof o)) {
                o oVar = new o(callback);
                this.f736g0 = oVar;
                window.setCallback(oVar);
                w0 F = w0.F(this.f734e0, (AttributeSet) null, f727d1);
                Drawable i10 = F.i(0);
                if (i10 != null) {
                    window.setBackgroundDrawable(i10);
                }
                F.I();
                this.f735f0 = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean W0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f734e0
            r1 = 0
            android.content.res.Configuration r0 = r6.d0(r0, r7, r1)
            boolean r2 = r6.A0()
            android.content.Context r3 = r6.f734e0
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L_0x0047
            if (r8 == 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            boolean r8 = r6.J0
            if (r8 == 0) goto L_0x0047
            boolean r8 = f728e1
            if (r8 != 0) goto L_0x0030
            boolean r8 = r6.K0
            if (r8 == 0) goto L_0x0047
        L_0x0030:
            java.lang.Object r8 = r6.f733d0
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0047
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L_0x0047
            java.lang.Object r8 = r6.f733d0
            android.app.Activity r8 = (android.app.Activity) r8
            h0.b.B(r8)
            r8 = r4
            goto L_0x0048
        L_0x0047:
            r8 = 0
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            if (r3 == r0) goto L_0x0050
            r6.X0(r0, r2, r1)
            goto L_0x0051
        L_0x0050:
            r4 = r8
        L_0x0051:
            if (r4 == 0) goto L_0x005e
            java.lang.Object r8 = r6.f733d0
            boolean r0 = r8 instanceof androidx.appcompat.app.AppCompatActivity
            if (r0 == 0) goto L_0x005e
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8
            r8.s0(r7)
        L_0x005e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.W0(int, boolean):boolean");
    }

    public final int X() {
        int i10 = this.N0;
        return i10 != -100 ? i10 : e.o();
    }

    public final void X0(int i10, boolean z10, @o0 Configuration configuration) {
        Resources resources = this.f734e0.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & -49);
        resources.updateConfiguration(configuration2, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            k.a(resources);
        }
        int i11 = this.O0;
        if (i11 != 0) {
            this.f734e0.setTheme(i11);
            this.f734e0.getTheme().applyStyle(this.O0, true);
        }
        if (z10) {
            Object obj = this.f733d0;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.y) {
                    if (!((androidx.lifecycle.y) activity).getLifecycle().b().b(p.b.STARTED)) {
                        return;
                    }
                } else if (!this.L0) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    public void Y(int i10, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i10 >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.G0;
                if (i10 < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i10];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f765j;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f770o) && !this.M0) {
            this.f736g0.a().onPanelClosed(i10, menu);
        }
    }

    public final int Y0(@o0 e3 e3Var, @o0 Rect rect) {
        boolean z10;
        boolean z11;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i10;
        int i11 = 0;
        int r10 = e3Var != null ? e3Var.r() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f745p0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f745p0.getLayoutParams();
            boolean z12 = true;
            if (this.f745p0.isShown()) {
                if (this.X0 == null) {
                    this.X0 = new Rect();
                    this.Y0 = new Rect();
                }
                Rect rect2 = this.X0;
                Rect rect3 = this.Y0;
                if (e3Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(e3Var.p(), e3Var.r(), e3Var.q(), e3Var.o());
                }
                d1.a(this.f751v0, rect2, rect3);
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                e3 n02 = w1.n0(this.f751v0);
                int p10 = n02 == null ? 0 : n02.p();
                int q10 = n02 == null ? 0 : n02.q();
                if (marginLayoutParams2.topMargin == i12 && marginLayoutParams2.leftMargin == i13 && marginLayoutParams2.rightMargin == i14) {
                    z11 = false;
                } else {
                    marginLayoutParams2.topMargin = i12;
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.rightMargin = i14;
                    z11 = true;
                }
                if (i12 <= 0 || this.f753x0 != null) {
                    View view = this.f753x0;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i10 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == p10 && marginLayoutParams.rightMargin == q10))) {
                        marginLayoutParams.height = i10;
                        marginLayoutParams.leftMargin = p10;
                        marginLayoutParams.rightMargin = q10;
                        this.f753x0.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f734e0);
                    this.f753x0 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = p10;
                    layoutParams.rightMargin = q10;
                    this.f751v0.addView(this.f753x0, -1, layoutParams);
                }
                View view3 = this.f753x0;
                if (view3 == null) {
                    z12 = false;
                }
                if (z12 && view3.getVisibility() != 0) {
                    Z0(this.f753x0);
                }
                if (!this.C0 && z12) {
                    r10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                this.f745p0.setLayoutParams(marginLayoutParams2);
            }
        }
        View view4 = this.f753x0;
        if (view4 != null) {
            if (!z10) {
                i11 = 8;
            }
            view4.setVisibility(i11);
        }
        return r10;
    }

    public void Z(@m0 androidx.appcompat.view.menu.e eVar) {
        if (!this.F0) {
            this.F0 = true;
            this.f741l0.p();
            Window.Callback u02 = u0();
            if (u02 != null && !this.M0) {
                u02.onPanelClosed(108, eVar);
            }
            this.F0 = false;
        }
    }

    public final void Z0(View view) {
        int i10;
        Context context;
        if ((w1.B0(view) & 8192) != 0) {
            context = this.f734e0;
            i10 = a.e.abc_decor_view_status_guard_light;
        } else {
            context = this.f734e0;
            i10 = a.e.abc_decor_view_status_guard;
        }
        view.setBackgroundColor(i0.d.f(context, i10));
    }

    public boolean a(@m0 androidx.appcompat.view.menu.e eVar, @m0 MenuItem menuItem) {
        PanelFeatureState l02;
        Window.Callback u02 = u0();
        if (u02 == null || this.M0 || (l02 = l0(eVar.G())) == null) {
            return false;
        }
        return u02.onMenuItemSelected(l02.f756a, menuItem);
    }

    public final void a0() {
        q qVar = this.R0;
        if (qVar != null) {
            qVar.a();
        }
        q qVar2 = this.S0;
        if (qVar2 != null) {
            qVar2.a();
        }
    }

    public void b(@m0 androidx.appcompat.view.menu.e eVar) {
        P0(true);
    }

    public void b0(int i10) {
        c0(r0(i10, true), true);
    }

    public void c0(PanelFeatureState panelFeatureState, boolean z10) {
        ViewGroup viewGroup;
        y yVar;
        if (!z10 || panelFeatureState.f756a != 0 || (yVar = this.f741l0) == null || !yVar.f()) {
            WindowManager windowManager = (WindowManager) this.f734e0.getSystemService("window");
            if (!(windowManager == null || !panelFeatureState.f770o || (viewGroup = panelFeatureState.f762g) == null)) {
                windowManager.removeView(viewGroup);
                if (z10) {
                    Y(panelFeatureState.f756a, panelFeatureState, (Menu) null);
                }
            }
            panelFeatureState.f768m = false;
            panelFeatureState.f769n = false;
            panelFeatureState.f770o = false;
            panelFeatureState.f763h = null;
            panelFeatureState.f772q = true;
            if (this.H0 == panelFeatureState) {
                this.H0 = null;
                return;
            }
            return;
        }
        Z(panelFeatureState.f765j);
    }

    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        j0();
        ((ViewGroup) this.f751v0.findViewById(16908290)).addView(view, layoutParams);
        this.f736g0.a().onContentChanged();
    }

    @m0
    public final Configuration d0(@m0 Context context, int i10, @o0 Configuration configuration) {
        int i11 = i10 != 1 ? i10 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public boolean e() {
        return U(true);
    }

    public final ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f734e0.obtainStyledAttributes(a.n.AppCompatTheme);
        int i10 = a.n.AppCompatTheme_windowActionBar;
        if (obtainStyledAttributes.hasValue(i10)) {
            if (obtainStyledAttributes.getBoolean(a.n.AppCompatTheme_windowNoTitle, false)) {
                I(1);
            } else if (obtainStyledAttributes.getBoolean(i10, false)) {
                I(108);
            }
            if (obtainStyledAttributes.getBoolean(a.n.AppCompatTheme_windowActionBarOverlay, false)) {
                I(109);
            }
            if (obtainStyledAttributes.getBoolean(a.n.AppCompatTheme_windowActionModeOverlay, false)) {
                I(10);
            }
            this.D0 = obtainStyledAttributes.getBoolean(a.n.AppCompatTheme_android_windowIsFloating, false);
            obtainStyledAttributes.recycle();
            k0();
            this.f735f0.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f734e0);
            if (this.E0) {
                viewGroup = (ViewGroup) from.inflate(this.C0 ? a.k.abc_screen_simple_overlay_action_mode : a.k.abc_screen_simple, (ViewGroup) null);
            } else if (this.D0) {
                viewGroup = (ViewGroup) from.inflate(a.k.abc_dialog_title_material, (ViewGroup) null);
                this.B0 = false;
                this.A0 = false;
            } else if (this.A0) {
                TypedValue typedValue = new TypedValue();
                this.f734e0.getTheme().resolveAttribute(a.c.actionBarTheme, typedValue, true);
                viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.d(this.f734e0, typedValue.resourceId) : this.f734e0).inflate(a.k.abc_screen_toolbar, (ViewGroup) null);
                y yVar = (y) viewGroup.findViewById(a.h.decor_content_parent);
                this.f741l0 = yVar;
                yVar.setWindowCallback(u0());
                if (this.B0) {
                    this.f741l0.o(109);
                }
                if (this.f754y0) {
                    this.f741l0.o(2);
                }
                if (this.f755z0) {
                    this.f741l0.o(5);
                }
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                w1.Y1(viewGroup, new c());
                if (this.f741l0 == null) {
                    this.f752w0 = (TextView) viewGroup.findViewById(a.h.title);
                }
                d1.c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.h.action_bar_activity_content);
                ViewGroup viewGroup2 = (ViewGroup) this.f735f0.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                    }
                }
                this.f735f0.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new e());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.A0 + ", windowActionBarOverlay: " + this.B0 + ", android:windowIsFloating: " + this.D0 + ", windowActionModeOverlay: " + this.C0 + ", windowNoTitle: " + this.E0 + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    public void f0() {
        androidx.appcompat.view.menu.e eVar;
        y yVar = this.f741l0;
        if (yVar != null) {
            yVar.p();
        }
        if (this.f746q0 != null) {
            this.f735f0.getDecorView().removeCallbacks(this.f747r0);
            if (this.f746q0.isShowing()) {
                try {
                    this.f746q0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f746q0 = null;
        }
        i0();
        PanelFeatureState r02 = r0(0, false);
        if (r02 != null && (eVar = r02.f765j) != null) {
            eVar.close();
        }
    }

    public boolean g0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f733d0;
        boolean z10 = true;
        if (((obj instanceof l.a) || (obj instanceof AppCompatDialog)) && (decorView = this.f735f0.getDecorView()) != null && f1.l.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f736g0.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z10 = false;
        }
        return z10 ? D0(keyCode, keyEvent) : G0(keyCode, keyEvent);
    }

    @d.i
    @m0
    public Context h(@m0 Context context) {
        boolean z10 = true;
        this.J0 = true;
        int B02 = B0(context, X());
        Configuration configuration = null;
        if (f729f1 && (context instanceof ContextThemeWrapper)) {
            try {
                s.a((ContextThemeWrapper) context, d0(context, B02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof k.d) {
            try {
                ((k.d) context).a(d0(context, B02, (Configuration) null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f728e1) {
            return super.h(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = k.a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m0(configuration3, configuration4);
        }
        Configuration d02 = d0(context, B02, configuration);
        k.d dVar = new k.d(context, a.m.Theme_AppCompat_Empty);
        dVar.a(d02);
        boolean z11 = false;
        try {
            if (context.getTheme() == null) {
                z10 = false;
            }
            z11 = z10;
        } catch (NullPointerException unused3) {
        }
        if (z11) {
            g.e.a(dVar.getTheme());
        }
        return super.h(dVar);
    }

    public void h0(int i10) {
        PanelFeatureState r02;
        PanelFeatureState r03 = r0(i10, true);
        if (r03.f765j != null) {
            Bundle bundle = new Bundle();
            r03.f765j.V(bundle);
            if (bundle.size() > 0) {
                r03.f776u = bundle;
            }
            r03.f765j.m0();
            r03.f765j.clear();
        }
        r03.f773r = true;
        r03.f772q = true;
        if ((i10 == 108 || i10 == 0) && this.f741l0 != null && (r02 = r0(0, false)) != null) {
            r02.f768m = false;
            O0(r02, (KeyEvent) null);
        }
    }

    public void i0() {
        s2 s2Var = this.f748s0;
        if (s2Var != null) {
            s2Var.c();
        }
    }

    public final void j0() {
        if (!this.f750u0) {
            this.f751v0 = e0();
            CharSequence t02 = t0();
            if (!TextUtils.isEmpty(t02)) {
                y yVar = this.f741l0;
                if (yVar != null) {
                    yVar.setWindowTitle(t02);
                } else if (M0() != null) {
                    M0().B0(t02);
                } else {
                    TextView textView = this.f752w0;
                    if (textView != null) {
                        textView.setText(t02);
                    }
                }
            }
            V();
            K0(this.f751v0);
            this.f750u0 = true;
            PanelFeatureState r02 = r0(0, false);
            if (this.M0) {
                return;
            }
            if (r02 == null || r02.f765j == null) {
                z0(108);
            }
        }
    }

    public final void k0() {
        if (this.f735f0 == null) {
            Object obj = this.f733d0;
            if (obj instanceof Activity) {
                W(((Activity) obj).getWindow());
            }
        }
        if (this.f735f0 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public PanelFeatureState l0(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.G0;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
            if (panelFeatureState != null && panelFeatureState.f765j == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006f, code lost:
        if (((org.xmlpull.v1.XmlPullParser) r15).getDepth() > 1) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m(android.view.View r12, java.lang.String r13, @d.m0 android.content.Context r14, @d.m0 android.util.AttributeSet r15) {
        /*
            r11 = this;
            androidx.appcompat.app.h r0 = r11.Z0
            r1 = 0
            if (r0 != 0) goto L_0x004a
            android.content.Context r0 = r11.f734e0
            int[] r2 = f.a.n.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r2)
            int r2 = f.a.n.AppCompatTheme_viewInflaterClass
            java.lang.String r0 = r0.getString(r2)
            if (r0 != 0) goto L_0x001d
            androidx.appcompat.app.h r0 = new androidx.appcompat.app.h
            r0.<init>()
        L_0x001a:
            r11.Z0 = r0
            goto L_0x004a
        L_0x001d:
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x0032 }
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ all -> 0x0032 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0032 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ all -> 0x0032 }
            androidx.appcompat.app.h r2 = (androidx.appcompat.app.h) r2     // Catch:{ all -> 0x0032 }
            r11.Z0 = r2     // Catch:{ all -> 0x0032 }
            goto L_0x004a
        L_0x0032:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ". Falling back to default."
            r2.append(r0)
            androidx.appcompat.app.h r0 = new androidx.appcompat.app.h
            r0.<init>()
            goto L_0x001a
        L_0x004a:
            boolean r8 = f726c1
            r0 = 1
            if (r8 == 0) goto L_0x007a
            androidx.appcompat.app.i r2 = r11.f732a1
            if (r2 != 0) goto L_0x005a
            androidx.appcompat.app.i r2 = new androidx.appcompat.app.i
            r2.<init>()
            r11.f732a1 = r2
        L_0x005a:
            androidx.appcompat.app.i r2 = r11.f732a1
            boolean r2 = r2.a(r15)
            if (r2 == 0) goto L_0x0064
            r7 = r0
            goto L_0x007b
        L_0x0064:
            boolean r2 = r15 instanceof org.xmlpull.v1.XmlPullParser
            if (r2 == 0) goto L_0x0072
            r2 = r15
            org.xmlpull.v1.XmlPullParser r2 = (org.xmlpull.v1.XmlPullParser) r2
            int r2 = r2.getDepth()
            if (r2 <= r0) goto L_0x007a
            goto L_0x0079
        L_0x0072:
            r0 = r12
            android.view.ViewParent r0 = (android.view.ViewParent) r0
            boolean r0 = r11.S0(r0)
        L_0x0079:
            r1 = r0
        L_0x007a:
            r7 = r1
        L_0x007b:
            androidx.appcompat.app.h r2 = r11.Z0
            r9 = 1
            boolean r10 = androidx.appcompat.widget.c1.c()
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            android.view.View r12 = r2.q(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.m(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @o0
    public <T extends View> T n(@b0 int i10) {
        j0();
        return this.f735f0.findViewById(i10);
    }

    public final Context n0() {
        a s10 = s();
        Context A = s10 != null ? s10.A() : null;
        return A == null ? this.f734e0 : A;
    }

    public final q o0(@m0 Context context) {
        if (this.S0 == null) {
            this.S0 = new p(context);
        }
        return this.S0;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m(view, str, context, attributeSet);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public final b.C0020b p() {
        return new h();
    }

    @x0({x0.a.O})
    @g1
    @m0
    public final q p0() {
        return q0(this.f734e0);
    }

    public int q() {
        return this.N0;
    }

    public final q q0(@m0 Context context) {
        if (this.R0 == null) {
            this.R0 = new r(n.a(context));
        }
        return this.R0;
    }

    public MenuInflater r() {
        if (this.f739j0 == null) {
            v0();
            a aVar = this.f738i0;
            this.f739j0 = new k.g(aVar != null ? aVar.A() : this.f734e0);
        }
        return this.f739j0;
    }

    public PanelFeatureState r0(int i10, boolean z10) {
        PanelFeatureState[] panelFeatureStateArr = this.G0;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i10) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[(i10 + 1)];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.G0 = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i10];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i10);
        panelFeatureStateArr[i10] = panelFeatureState2;
        return panelFeatureState2;
    }

    public a s() {
        v0();
        return this.f738i0;
    }

    public ViewGroup s0() {
        return this.f751v0;
    }

    public boolean t(int i10) {
        int Q02 = Q0(i10);
        return (Q02 != 1 ? Q02 != 2 ? Q02 != 5 ? Q02 != 10 ? Q02 != 108 ? Q02 != 109 ? false : this.B0 : this.A0 : this.C0 : this.f755z0 : this.f754y0 : this.E0) || this.f735f0.hasFeature(i10);
    }

    public final CharSequence t0() {
        Object obj = this.f733d0;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f740k0;
    }

    public void u() {
        LayoutInflater from = LayoutInflater.from(this.f734e0);
        if (from.getFactory() == null) {
            f1.m.d(from, this);
        } else {
            boolean z10 = from.getFactory2() instanceof AppCompatDelegateImpl;
        }
    }

    public final Window.Callback u0() {
        return this.f735f0.getCallback();
    }

    public void v() {
        a s10 = s();
        if (s10 == null || !s10.D()) {
            z0(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v0() {
        /*
            r3 = this;
            r3.j0()
            boolean r0 = r3.A0
            if (r0 == 0) goto L_0x0037
            androidx.appcompat.app.a r0 = r3.f738i0
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f733d0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            androidx.appcompat.app.o r0 = new androidx.appcompat.app.o
            java.lang.Object r1 = r3.f733d0
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.B0
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f738i0 = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            androidx.appcompat.app.o r0 = new androidx.appcompat.app.o
            java.lang.Object r1 = r3.f733d0
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>((android.app.Dialog) r1)
            goto L_0x001d
        L_0x002e:
            androidx.appcompat.app.a r0 = r3.f738i0
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.W0
            r0.X(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.v0():void");
    }

    public final boolean w0(PanelFeatureState panelFeatureState) {
        View view = panelFeatureState.f764i;
        if (view != null) {
            panelFeatureState.f763h = view;
            return true;
        } else if (panelFeatureState.f765j == null) {
            return false;
        } else {
            if (this.f743n0 == null) {
                this.f743n0 = new u();
            }
            View view2 = (View) panelFeatureState.c(this.f743n0);
            panelFeatureState.f763h = view2;
            return view2 != null;
        }
    }

    public boolean x() {
        return this.f749t0;
    }

    public final boolean x0(PanelFeatureState panelFeatureState) {
        panelFeatureState.h(n0());
        panelFeatureState.f762g = new t(panelFeatureState.f767l);
        panelFeatureState.f758c = 81;
        return true;
    }

    public void y(Configuration configuration) {
        a s10;
        if (this.A0 && this.f750u0 && (s10 = s()) != null) {
            s10.I(configuration);
        }
        androidx.appcompat.widget.f.b().g(this.f734e0);
        U(false);
    }

    public final boolean y0(PanelFeatureState panelFeatureState) {
        Context context = this.f734e0;
        int i10 = panelFeatureState.f756a;
        if ((i10 == 0 || i10 == 108) && this.f741l0 != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.c.actionBarTheme, typedValue, true);
            Resources.Theme theme2 = null;
            if (typedValue.resourceId != 0) {
                theme2 = context.getResources().newTheme();
                theme2.setTo(theme);
                theme2.applyStyle(typedValue.resourceId, true);
                theme2.resolveAttribute(a.c.actionBarWidgetTheme, typedValue, true);
            } else {
                theme.resolveAttribute(a.c.actionBarWidgetTheme, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (theme2 == null) {
                    theme2 = context.getResources().newTheme();
                    theme2.setTo(theme);
                }
                theme2.applyStyle(typedValue.resourceId, true);
            }
            if (theme2 != null) {
                k.d dVar = new k.d(context, 0);
                dVar.getTheme().setTo(theme2);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.X(this);
        panelFeatureState.g(eVar);
        return true;
    }

    public void z(Bundle bundle) {
        this.J0 = true;
        U(false);
        k0();
        Object obj = this.f733d0;
        if (obj instanceof Activity) {
            String str = null;
            try {
                str = v.d((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a M02 = M0();
                if (M02 == null) {
                    this.W0 = true;
                } else {
                    M02.X(true);
                }
            }
            e.c(this);
        }
        this.K0 = true;
    }

    public final void z0(int i10) {
        this.U0 = (1 << i10) | this.U0;
        if (!this.T0) {
            w1.n1(this.f735f0.getDecorView(), this.V0);
            this.T0 = true;
        }
    }
}
