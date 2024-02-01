package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.a0;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import androidx.lifecycle.g0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.r0;
import androidx.lifecycle.u;
import androidx.lifecycle.x0;
import androidx.lifecycle.y;
import d.a1;
import d.f1;
import d.h0;
import d.j0;
import d.m0;
import d.o0;
import d.x0;
import f1.m;
import h0.z2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import y3.q;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, y, b1, o, y2.e, androidx.activity.result.b {
    public static final Object O0 = new Object();
    public static final int P0 = -1;
    public static final int Q0 = 0;
    public static final int R0 = 1;
    public static final int S0 = 2;
    public static final int T0 = 3;
    public static final int U0 = 4;
    public static final int V0 = 5;
    public static final int W0 = 6;
    public static final int X0 = 7;
    public boolean A0;
    public boolean B0;
    public float C0;
    public LayoutInflater D0;
    public boolean E0;
    public p.b F0;
    public a0 G0;
    @o0
    public y H0;
    public g0<y> I0;
    public x0.b J0;
    public y2.d K0;
    @h0
    public int L0;
    public final AtomicInteger M0;
    public final ArrayList<k> N0;
    public int O;
    public Bundle P;
    public SparseArray<Parcelable> Q;
    public Bundle R;
    @o0
    public Boolean S;
    @m0
    public String T;
    public Bundle U;
    public Fragment V;
    public String W;
    public int X;
    public Boolean Y;
    public boolean Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f2440a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2441b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2442c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2443d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2444e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2445f0;

    /* renamed from: g0  reason: collision with root package name */
    public FragmentManager f2446g0;

    /* renamed from: h0  reason: collision with root package name */
    public g<?> f2447h0;
    @m0

    /* renamed from: i0  reason: collision with root package name */
    public FragmentManager f2448i0;

    /* renamed from: j0  reason: collision with root package name */
    public Fragment f2449j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2450k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2451l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f2452m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f2453n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f2454o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f2455p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f2456q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2457r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f2458s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2459t0;

    /* renamed from: u0  reason: collision with root package name */
    public ViewGroup f2460u0;

    /* renamed from: v0  reason: collision with root package name */
    public View f2461v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f2462w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f2463x0;

    /* renamed from: y0  reason: collision with root package name */
    public i f2464y0;

    /* renamed from: z0  reason: collision with root package name */
    public Runnable f2465z0;

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        @m0
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final Bundle O;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Bundle bundle) {
            this.O = bundle;
        }

        public SavedState(@m0 Parcel parcel, @o0 ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.O = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            parcel.writeBundle(this.O);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Fragment.this.u(false);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ a0 O;

        public c(a0 a0Var) {
            this.O = a0Var;
        }

        public void run() {
            this.O.g();
        }
    }

    public class d extends d {
        public d() {
        }

        @o0
        public View c(int i10) {
            View view = Fragment.this.f2461v0;
            if (view != null) {
                return view.findViewById(i10);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        public boolean d() {
            return Fragment.this.f2461v0 != null;
        }
    }

    public class e implements p.a<Void, ActivityResultRegistry> {
        public e() {
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            Fragment fragment = Fragment.this;
            g<?> gVar = fragment.f2447h0;
            return gVar instanceof androidx.activity.result.d ? ((androidx.activity.result.d) gVar).u() : fragment.requireActivity().u();
        }
    }

    public class f implements p.a<Void, ActivityResultRegistry> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityResultRegistry f2467a;

        public f(ActivityResultRegistry activityResultRegistry) {
            this.f2467a = activityResultRegistry;
        }

        /* renamed from: a */
        public ActivityResultRegistry apply(Void voidR) {
            return this.f2467a;
        }
    }

    public class g extends k {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p.a f2469a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2470b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c.a f2471c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.a f2472d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p.a aVar, AtomicReference atomicReference, c.a aVar2, androidx.activity.result.a aVar3) {
            super((a) null);
            this.f2469a = aVar;
            this.f2470b = atomicReference;
            this.f2471c = aVar2;
            this.f2472d = aVar3;
        }

        public void a() {
            this.f2470b.set(((ActivityResultRegistry) this.f2469a.apply(null)).i(Fragment.this.y(), Fragment.this, this.f2471c, this.f2472d));
        }
    }

    public class h extends androidx.activity.result.c<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AtomicReference f2474a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c.a f2475b;

        public h(AtomicReference atomicReference, c.a aVar) {
            this.f2474a = atomicReference;
            this.f2475b = aVar;
        }

        @m0
        public c.a<I, ?> a() {
            return this.f2475b;
        }

        public void c(I i10, @o0 h0.g gVar) {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2474a.get();
            if (cVar != null) {
                cVar.c(i10, gVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        public void d() {
            androidx.activity.result.c cVar = (androidx.activity.result.c) this.f2474a.getAndSet((Object) null);
            if (cVar != null) {
                cVar.d();
            }
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public View f2477a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f2478b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2479c;

        /* renamed from: d  reason: collision with root package name */
        public int f2480d;

        /* renamed from: e  reason: collision with root package name */
        public int f2481e;

        /* renamed from: f  reason: collision with root package name */
        public int f2482f;

        /* renamed from: g  reason: collision with root package name */
        public int f2483g;

        /* renamed from: h  reason: collision with root package name */
        public int f2484h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f2485i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<String> f2486j;

        /* renamed from: k  reason: collision with root package name */
        public Object f2487k = null;

        /* renamed from: l  reason: collision with root package name */
        public Object f2488l;

        /* renamed from: m  reason: collision with root package name */
        public Object f2489m;

        /* renamed from: n  reason: collision with root package name */
        public Object f2490n;

        /* renamed from: o  reason: collision with root package name */
        public Object f2491o;

        /* renamed from: p  reason: collision with root package name */
        public Object f2492p;

        /* renamed from: q  reason: collision with root package name */
        public Boolean f2493q;

        /* renamed from: r  reason: collision with root package name */
        public Boolean f2494r;

        /* renamed from: s  reason: collision with root package name */
        public z2 f2495s;

        /* renamed from: t  reason: collision with root package name */
        public z2 f2496t;

        /* renamed from: u  reason: collision with root package name */
        public float f2497u;

        /* renamed from: v  reason: collision with root package name */
        public View f2498v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2499w;

        /* renamed from: x  reason: collision with root package name */
        public l f2500x;

        /* renamed from: y  reason: collision with root package name */
        public boolean f2501y;

        public i() {
            Object obj = Fragment.O0;
            this.f2488l = obj;
            this.f2489m = null;
            this.f2490n = obj;
            this.f2491o = null;
            this.f2492p = obj;
            this.f2495s = null;
            this.f2496t = null;
            this.f2497u = 1.0f;
            this.f2498v = null;
        }
    }

    public static class j extends RuntimeException {
        public j(@m0 String str, @o0 Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class k {
        public k() {
        }

        public /* synthetic */ k(a aVar) {
            this();
        }

        public abstract void a();
    }

    public interface l {
        void a();

        void b();
    }

    public Fragment() {
        this.O = -1;
        this.T = UUID.randomUUID().toString();
        this.W = null;
        this.Y = null;
        this.f2448i0 = new j();
        this.f2458s0 = true;
        this.f2463x0 = true;
        this.f2465z0 = new a();
        this.F0 = p.b.RESUMED;
        this.I0 = new g0<>();
        this.M0 = new AtomicInteger();
        this.N0 = new ArrayList<>();
        P();
    }

    @d.o
    public Fragment(@h0 int i10) {
        this();
        this.L0 = i10;
    }

    @Deprecated
    @m0
    public static Fragment instantiate(@m0 Context context, @m0 String str) {
        return instantiate(context, str, (Bundle) null);
    }

    @Deprecated
    @m0
    public static Fragment instantiate(@m0 Context context, @m0 String str, @o0 Bundle bundle) {
        try {
            Fragment fragment = (Fragment) f.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (InstantiationException e10) {
            throw new j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e10);
        } catch (IllegalAccessException e11) {
            throw new j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (NoSuchMethodException e12) {
            throw new j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e12);
        } catch (InvocationTargetException e13) {
            throw new j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e13);
        }
    }

    public Animator A() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2478b;
    }

    public void A0(int i10, int i11, int i12, int i13) {
        if (this.f2464y0 != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            w().f2480d = i10;
            w().f2481e = i11;
            w().f2482f = i12;
            w().f2483g = i13;
        }
    }

    public int B() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2480d;
    }

    public void B0(Animator animator) {
        w().f2478b = animator;
    }

    public z2 C() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2495s;
    }

    public void C0(View view) {
        w().f2498v = view;
    }

    public int D() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2481e;
    }

    public void D0(boolean z10) {
        w().f2501y = z10;
    }

    public z2 E() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2496t;
    }

    public void E0(int i10) {
        if (this.f2464y0 != null || i10 != 0) {
            w();
            this.f2464y0.f2484h = i10;
        }
    }

    public void F0(l lVar) {
        w();
        i iVar = this.f2464y0;
        l lVar2 = iVar.f2500x;
        if (lVar != lVar2) {
            if (lVar == null || lVar2 == null) {
                if (iVar.f2499w) {
                    iVar.f2500x = lVar;
                }
                if (lVar != null) {
                    lVar.a();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
    }

    public View G() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2498v;
    }

    public void G0(boolean z10) {
        if (this.f2464y0 != null) {
            w().f2479c = z10;
        }
    }

    public final int H() {
        p.b bVar = this.F0;
        return (bVar == p.b.INITIALIZED || this.f2449j0 == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f2449j0.H());
    }

    public void H0(float f10) {
        w().f2497u = f10;
    }

    public int I() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2484h;
    }

    public void I0(@o0 ArrayList<String> arrayList, @o0 ArrayList<String> arrayList2) {
        w();
        i iVar = this.f2464y0;
        iVar.f2485i = arrayList;
        iVar.f2486j = arrayList2;
    }

    public boolean J() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return false;
        }
        return iVar.f2479c;
    }

    public int K() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2482f;
    }

    public int L() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return 0;
        }
        return iVar.f2483g;
    }

    public float M() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f2497u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f2485i;
     */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> N() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.f2464y0
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f2485i
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.N():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.f2486j;
     */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.String> O() {
        /*
            r1 = this;
            androidx.fragment.app.Fragment$i r0 = r1.f2464y0
            if (r0 == 0) goto L_0x000a
            java.util.ArrayList<java.lang.String> r0 = r0.f2486j
            if (r0 != 0) goto L_0x0009
            goto L_0x000a
        L_0x0009:
            return r0
        L_0x000a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.O():java.util.ArrayList");
    }

    public final void P() {
        this.G0 = new a0(this);
        this.K0 = y2.d.a(this);
        this.J0 = null;
    }

    public void Q() {
        P();
        this.T = UUID.randomUUID().toString();
        this.Z = false;
        this.f2440a0 = false;
        this.f2441b0 = false;
        this.f2442c0 = false;
        this.f2443d0 = false;
        this.f2445f0 = 0;
        this.f2446g0 = null;
        this.f2448i0 = new j();
        this.f2447h0 = null;
        this.f2450k0 = 0;
        this.f2451l0 = 0;
        this.f2452m0 = null;
        this.f2453n0 = false;
        this.f2454o0 = false;
    }

    public boolean R() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return false;
        }
        return iVar.f2501y;
    }

    public final boolean S() {
        return this.f2445f0 > 0;
    }

    public boolean T() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return false;
        }
        return iVar.f2499w;
    }

    public final boolean U() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.U());
    }

    public void V() {
        this.f2448i0.h1();
    }

    public void W(Bundle bundle) {
        this.f2448i0.h1();
        this.O = 3;
        this.f2459t0 = false;
        onActivityCreated(bundle);
        if (this.f2459t0) {
            x0();
            this.f2448i0.D();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void X() {
        Iterator<k> it = this.N0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.N0.clear();
        this.f2448i0.p(this.f2447h0, v(), this);
        this.O = 0;
        this.f2459t0 = false;
        onAttach(this.f2447h0.f());
        if (this.f2459t0) {
            this.f2446g0.N(this);
            this.f2448i0.E();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void Y(@m0 Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f2448i0.F(configuration);
    }

    public boolean Z(@m0 MenuItem menuItem) {
        if (this.f2453n0) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.f2448i0.G(menuItem);
    }

    public void a0(Bundle bundle) {
        this.f2448i0.h1();
        this.O = 1;
        this.f2459t0 = false;
        this.G0.a(new u() {
            public void d(@m0 y yVar, @m0 p.a aVar) {
                View view;
                if (aVar == p.a.ON_STOP && (view = Fragment.this.f2461v0) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.K0.d(bundle);
        onCreate(bundle);
        this.E0 = true;
        if (this.f2459t0) {
            this.G0.l(p.a.ON_CREATE);
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean b0(@m0 Menu menu, @m0 MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.f2453n0) {
            return false;
        }
        if (this.f2457r0 && this.f2458s0) {
            z10 = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z10 | this.f2448i0.I(menu, menuInflater);
    }

    public void c0(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        this.f2448i0.h1();
        this.f2444e0 = true;
        this.H0 = new y(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.f2461v0 = onCreateView;
        if (onCreateView != null) {
            this.H0.b();
            c1.b(this.f2461v0, this.H0);
            e1.b(this.f2461v0, this.H0);
            y2.f.b(this.f2461v0, this.H0);
            this.I0.r(this.H0);
        } else if (!this.H0.c()) {
            this.H0 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void d0() {
        this.f2448i0.J();
        this.G0.l(p.a.ON_DESTROY);
        this.O = 0;
        this.f2459t0 = false;
        this.E0 = false;
        onDestroy();
        if (!this.f2459t0) {
            throw new c0("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void dump(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f2450k0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f2451l0));
        printWriter.print(" mTag=");
        printWriter.println(this.f2452m0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.O);
        printWriter.print(" mWho=");
        printWriter.print(this.T);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2445f0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.Z);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2440a0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2441b0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2442c0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f2453n0);
        printWriter.print(" mDetached=");
        printWriter.print(this.f2454o0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f2458s0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f2457r0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f2455p0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f2463x0);
        if (this.f2446g0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2446g0);
        }
        if (this.f2447h0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2447h0);
        }
        if (this.f2449j0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f2449j0);
        }
        if (this.U != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.U);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.P);
        }
        if (this.Q != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.Q);
        }
        if (this.R != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.R);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.X);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(J());
        if (B() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(B());
        }
        if (D() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(D());
        }
        if (K() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(K());
        }
        if (L() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(L());
        }
        if (this.f2460u0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f2460u0);
        }
        if (this.f2461v0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f2461v0);
        }
        if (z() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(z());
        }
        if (getContext() != null) {
            l2.a.d(this).b(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f2448i0 + ":");
        FragmentManager fragmentManager = this.f2448i0;
        fragmentManager.b0(str + q.a.R, fileDescriptor, printWriter, strArr);
    }

    public void e0() {
        this.f2448i0.K();
        if (this.f2461v0 != null && this.H0.getLifecycle().b().b(p.b.CREATED)) {
            this.H0.a(p.a.ON_DESTROY);
        }
        this.O = 1;
        this.f2459t0 = false;
        onDestroyView();
        if (this.f2459t0) {
            l2.a.d(this).h();
            this.f2444e0 = false;
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public final boolean equals(@o0 Object obj) {
        return super.equals(obj);
    }

    public void f0() {
        this.O = -1;
        this.f2459t0 = false;
        onDetach();
        this.D0 = null;
        if (!this.f2459t0) {
            throw new c0("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.f2448i0.S0()) {
            this.f2448i0.J();
            this.f2448i0 = new j();
        }
    }

    @m0
    public LayoutInflater g0(@o0 Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.D0 = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    @o0
    public final FragmentActivity getActivity() {
        g<?> gVar = this.f2447h0;
        if (gVar == null) {
            return null;
        }
        return (FragmentActivity) gVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.f2464y0;
        if (iVar == null || (bool = iVar.f2494r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.f2464y0;
        if (iVar == null || (bool = iVar.f2493q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    @o0
    public final Bundle getArguments() {
        return this.U;
    }

    @m0
    public final FragmentManager getChildFragmentManager() {
        if (this.f2447h0 != null) {
            return this.f2448i0;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @o0
    public Context getContext() {
        g<?> gVar = this.f2447h0;
        if (gVar == null) {
            return null;
        }
        return gVar.f();
    }

    @m0
    public x0.b getDefaultViewModelProviderFactory() {
        if (this.f2446g0 != null) {
            if (this.J0 == null) {
                Application application = null;
                Context context = requireContext().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.T0(3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not find Application instance from Context ");
                    sb2.append(requireContext().getApplicationContext());
                    sb2.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.J0 = new r0(application, this, getArguments());
            }
            return this.J0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @o0
    public Object getEnterTransition() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2487k;
    }

    @o0
    public Object getExitTransition() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2489m;
    }

    @o0
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.f2446g0;
    }

    @o0
    public final Object getHost() {
        g<?> gVar = this.f2447h0;
        if (gVar == null) {
            return null;
        }
        return gVar.j();
    }

    public final int getId() {
        return this.f2450k0;
    }

    @m0
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.D0;
        return layoutInflater == null ? g0((Bundle) null) : layoutInflater;
    }

    @d.x0({x0.a.Q})
    @Deprecated
    @m0
    public LayoutInflater getLayoutInflater(@o0 Bundle bundle) {
        g<?> gVar = this.f2447h0;
        if (gVar != null) {
            LayoutInflater k10 = gVar.k();
            m.d(k10, this.f2448i0.I0());
            return k10;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @m0
    public p getLifecycle() {
        return this.G0;
    }

    @Deprecated
    @m0
    public l2.a getLoaderManager() {
        return l2.a.d(this);
    }

    @o0
    public final Fragment getParentFragment() {
        return this.f2449j0;
    }

    @m0
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.f2446g0;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @o0
    public Object getReenterTransition() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f2490n;
        return obj == O0 ? getExitTransition() : obj;
    }

    @m0
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.f2455p0;
    }

    @o0
    public Object getReturnTransition() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f2488l;
        return obj == O0 ? getEnterTransition() : obj;
    }

    @m0
    public final y2.c getSavedStateRegistry() {
        return this.K0.b();
    }

    @o0
    public Object getSharedElementEnterTransition() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2491o;
    }

    @o0
    public Object getSharedElementReturnTransition() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f2492p;
        return obj == O0 ? getSharedElementEnterTransition() : obj;
    }

    @m0
    public final String getString(@a1 int i10) {
        return getResources().getString(i10);
    }

    @m0
    public final String getString(@a1 int i10, @o0 Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    @o0
    public final String getTag() {
        return this.f2452m0;
    }

    @o0
    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.V;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f2446g0;
        if (fragmentManager == null || (str = this.W) == null) {
            return null;
        }
        return fragmentManager.n0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.X;
    }

    @m0
    public final CharSequence getText(@a1 int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.f2463x0;
    }

    @o0
    public View getView() {
        return this.f2461v0;
    }

    @j0
    @m0
    public y getViewLifecycleOwner() {
        y yVar = this.H0;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @m0
    public LiveData<y> getViewLifecycleOwnerLiveData() {
        return this.I0;
    }

    @m0
    public androidx.lifecycle.a1 getViewModelStore() {
        if (this.f2446g0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (H() != p.b.INITIALIZED.ordinal()) {
            return this.f2446g0.O0(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void h0() {
        onLowMemory();
        this.f2448i0.L();
    }

    @d.x0({x0.a.Q})
    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.f2457r0;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i0(boolean z10) {
        onMultiWindowModeChanged(z10);
        this.f2448i0.M(z10);
    }

    public final boolean isAdded() {
        return this.f2447h0 != null && this.Z;
    }

    public final boolean isDetached() {
        return this.f2454o0;
    }

    public final boolean isHidden() {
        return this.f2453n0;
    }

    public final boolean isInLayout() {
        return this.f2442c0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f2446g0;
     */
    @d.x0({d.x0.a.Q})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isMenuVisible() {
        /*
            r2 = this;
            boolean r0 = r2.f2458s0
            if (r0 == 0) goto L_0x0012
            androidx.fragment.app.FragmentManager r0 = r2.f2446g0
            if (r0 == 0) goto L_0x0010
            androidx.fragment.app.Fragment r1 = r2.f2449j0
            boolean r0 = r0.V0(r1)
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isMenuVisible():boolean");
    }

    public final boolean isRemoving() {
        return this.f2440a0;
    }

    public final boolean isResumed() {
        return this.O >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.f2446g0;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.Y0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.f2461v0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isVisible() {
        /*
            r1 = this;
            boolean r0 = r1.isAdded()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.isHidden()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.f2461v0
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r0 = r1.f2461v0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.isVisible():boolean");
    }

    public boolean j0(@m0 MenuItem menuItem) {
        if (this.f2453n0) {
            return false;
        }
        if (!this.f2457r0 || !this.f2458s0 || !onOptionsItemSelected(menuItem)) {
            return this.f2448i0.O(menuItem);
        }
        return true;
    }

    public void k0(@m0 Menu menu) {
        if (!this.f2453n0) {
            if (this.f2457r0 && this.f2458s0) {
                onOptionsMenuClosed(menu);
            }
            this.f2448i0.P(menu);
        }
    }

    public void l0() {
        this.f2448i0.R();
        if (this.f2461v0 != null) {
            this.H0.a(p.a.ON_PAUSE);
        }
        this.G0.l(p.a.ON_PAUSE);
        this.O = 6;
        this.f2459t0 = false;
        onPause();
        if (!this.f2459t0) {
            throw new c0("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    public void m0(boolean z10) {
        onPictureInPictureModeChanged(z10);
        this.f2448i0.S(z10);
    }

    public boolean n0(@m0 Menu menu) {
        boolean z10 = false;
        if (this.f2453n0) {
            return false;
        }
        if (this.f2457r0 && this.f2458s0) {
            z10 = true;
            onPrepareOptionsMenu(menu);
        }
        return z10 | this.f2448i0.T(menu);
    }

    public void o0() {
        boolean W02 = this.f2446g0.W0(this);
        Boolean bool = this.Y;
        if (bool == null || bool.booleanValue() != W02) {
            this.Y = Boolean.valueOf(W02);
            onPrimaryNavigationFragmentChanged(W02);
            this.f2448i0.U();
        }
    }

    @d.i
    @j0
    @Deprecated
    public void onActivityCreated(@o0 Bundle bundle) {
        this.f2459t0 = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, @o0 Intent intent) {
        if (FragmentManager.T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment ");
            sb2.append(this);
            sb2.append(" received the following in onActivityResult(): requestCode: ");
            sb2.append(i10);
            sb2.append(" resultCode: ");
            sb2.append(i11);
            sb2.append(" data: ");
            sb2.append(intent);
        }
    }

    @d.i
    @j0
    @Deprecated
    public void onAttach(@m0 Activity activity) {
        this.f2459t0 = true;
    }

    @d.i
    @j0
    public void onAttach(@m0 Context context) {
        this.f2459t0 = true;
        g<?> gVar = this.f2447h0;
        Activity e10 = gVar == null ? null : gVar.e();
        if (e10 != null) {
            this.f2459t0 = false;
            onAttach(e10);
        }
    }

    @j0
    @Deprecated
    public void onAttachFragment(@m0 Fragment fragment) {
    }

    @d.i
    public void onConfigurationChanged(@m0 Configuration configuration) {
        this.f2459t0 = true;
    }

    @j0
    public boolean onContextItemSelected(@m0 MenuItem menuItem) {
        return false;
    }

    @d.i
    @j0
    public void onCreate(@o0 Bundle bundle) {
        this.f2459t0 = true;
        w0(bundle);
        if (!this.f2448i0.X0(1)) {
            this.f2448i0.H();
        }
    }

    @o0
    @j0
    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    @o0
    @j0
    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @j0
    public void onCreateContextMenu(@m0 ContextMenu contextMenu, @m0 View view, @o0 ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @j0
    public void onCreateOptionsMenu(@m0 Menu menu, @m0 MenuInflater menuInflater) {
    }

    @o0
    @j0
    public View onCreateView(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        int i10 = this.L0;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    @d.i
    @j0
    public void onDestroy() {
        this.f2459t0 = true;
    }

    @j0
    public void onDestroyOptionsMenu() {
    }

    @d.i
    @j0
    public void onDestroyView() {
        this.f2459t0 = true;
    }

    @d.i
    @j0
    public void onDetach() {
        this.f2459t0 = true;
    }

    @m0
    public LayoutInflater onGetLayoutInflater(@o0 Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @j0
    public void onHiddenChanged(boolean z10) {
    }

    @d.i
    @Deprecated
    @f1
    public void onInflate(@m0 Activity activity, @m0 AttributeSet attributeSet, @o0 Bundle bundle) {
        this.f2459t0 = true;
    }

    @d.i
    @f1
    public void onInflate(@m0 Context context, @m0 AttributeSet attributeSet, @o0 Bundle bundle) {
        this.f2459t0 = true;
        g<?> gVar = this.f2447h0;
        Activity e10 = gVar == null ? null : gVar.e();
        if (e10 != null) {
            this.f2459t0 = false;
            onInflate(e10, attributeSet, bundle);
        }
    }

    @d.i
    @j0
    public void onLowMemory() {
        this.f2459t0 = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @j0
    public boolean onOptionsItemSelected(@m0 MenuItem menuItem) {
        return false;
    }

    @j0
    public void onOptionsMenuClosed(@m0 Menu menu) {
    }

    @d.i
    @j0
    public void onPause() {
        this.f2459t0 = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @j0
    public void onPrepareOptionsMenu(@m0 Menu menu) {
    }

    @j0
    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr) {
    }

    @d.i
    @j0
    public void onResume() {
        this.f2459t0 = true;
    }

    @j0
    public void onSaveInstanceState(@m0 Bundle bundle) {
    }

    @d.i
    @j0
    public void onStart() {
        this.f2459t0 = true;
    }

    @d.i
    @j0
    public void onStop() {
        this.f2459t0 = true;
    }

    @j0
    public void onViewCreated(@m0 View view, @o0 Bundle bundle) {
    }

    @d.i
    @j0
    public void onViewStateRestored(@o0 Bundle bundle) {
        this.f2459t0 = true;
    }

    public void p0() {
        this.f2448i0.h1();
        this.f2448i0.h0(true);
        this.O = 7;
        this.f2459t0 = false;
        onResume();
        if (this.f2459t0) {
            a0 a0Var = this.G0;
            p.a aVar = p.a.ON_RESUME;
            a0Var.l(aVar);
            if (this.f2461v0 != null) {
                this.H0.a(aVar);
            }
            this.f2448i0.V();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onResume()");
    }

    public void postponeEnterTransition() {
        w().f2499w = true;
    }

    public final void postponeEnterTransition(long j10, @m0 TimeUnit timeUnit) {
        w().f2499w = true;
        FragmentManager fragmentManager = this.f2446g0;
        Handler g10 = fragmentManager != null ? fragmentManager.H0().g() : new Handler(Looper.getMainLooper());
        g10.removeCallbacks(this.f2465z0);
        g10.postDelayed(this.f2465z0, timeUnit.toMillis(j10));
    }

    public /* synthetic */ i2.a q() {
        return n.a(this);
    }

    public void q0(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.K0.e(bundle);
        Parcelable H1 = this.f2448i0.H1();
        if (H1 != null) {
            bundle.putParcelable(FragmentActivity.f2502e0, H1);
        }
    }

    public void r0() {
        this.f2448i0.h1();
        this.f2448i0.h0(true);
        this.O = 5;
        this.f2459t0 = false;
        onStart();
        if (this.f2459t0) {
            a0 a0Var = this.G0;
            p.a aVar = p.a.ON_START;
            a0Var.l(aVar);
            if (this.f2461v0 != null) {
                this.H0.a(aVar);
            }
            this.f2448i0.W();
            return;
        }
        throw new c0("Fragment " + this + " did not call through to super.onStart()");
    }

    @j0
    @m0
    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(@m0 c.a<I, O> aVar, @m0 ActivityResultRegistry activityResultRegistry, @m0 androidx.activity.result.a<O> aVar2) {
        return u0(aVar, new f(activityResultRegistry), aVar2);
    }

    @j0
    @m0
    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(@m0 c.a<I, O> aVar, @m0 androidx.activity.result.a<O> aVar2) {
        return u0(aVar, new e(), aVar2);
    }

    public void registerForContextMenu(@m0 View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@m0 String[] strArr, int i10) {
        if (this.f2447h0 != null) {
            getParentFragmentManager().Z0(this, strArr, i10);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @m0
    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @m0
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @m0
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    @m0
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @m0
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @m0
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @m0
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void s0() {
        this.f2448i0.Y();
        if (this.f2461v0 != null) {
            this.H0.a(p.a.ON_STOP);
        }
        this.G0.l(p.a.ON_STOP);
        this.O = 4;
        this.f2459t0 = false;
        onStop();
        if (!this.f2459t0) {
            throw new c0("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        w().f2494r = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        w().f2493q = Boolean.valueOf(z10);
    }

    public void setArguments(@o0 Bundle bundle) {
        if (this.f2446g0 == null || !isStateSaved()) {
            this.U = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public void setEnterSharedElementCallback(@o0 z2 z2Var) {
        w().f2495s = z2Var;
    }

    public void setEnterTransition(@o0 Object obj) {
        w().f2487k = obj;
    }

    public void setExitSharedElementCallback(@o0 z2 z2Var) {
        w().f2496t = z2Var;
    }

    public void setExitTransition(@o0 Object obj) {
        w().f2489m = obj;
    }

    public void setHasOptionsMenu(boolean z10) {
        if (this.f2457r0 != z10) {
            this.f2457r0 = z10;
            if (isAdded() && !isHidden()) {
                this.f2447h0.t();
            }
        }
    }

    public void setInitialSavedState(@o0 SavedState savedState) {
        Bundle bundle;
        if (this.f2446g0 == null) {
            if (savedState == null || (bundle = savedState.O) == null) {
                bundle = null;
            }
            this.P = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z10) {
        if (this.f2458s0 != z10) {
            this.f2458s0 = z10;
            if (this.f2457r0 && isAdded() && !isHidden()) {
                this.f2447h0.t();
            }
        }
    }

    public void setReenterTransition(@o0 Object obj) {
        w().f2490n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        this.f2455p0 = z10;
        FragmentManager fragmentManager = this.f2446g0;
        if (fragmentManager == null) {
            this.f2456q0 = true;
        } else if (z10) {
            fragmentManager.n(this);
        } else {
            fragmentManager.B1(this);
        }
    }

    public void setReturnTransition(@o0 Object obj) {
        w().f2488l = obj;
    }

    public void setSharedElementEnterTransition(@o0 Object obj) {
        w().f2491o = obj;
    }

    public void setSharedElementReturnTransition(@o0 Object obj) {
        w().f2492p = obj;
    }

    @Deprecated
    public void setTargetFragment(@o0 Fragment fragment, int i10) {
        FragmentManager fragmentManager = this.f2446g0;
        FragmentManager fragmentManager2 = fragment != null ? fragment.f2446g0 : null;
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            Fragment fragment2 = fragment;
            while (fragment2 != null) {
                if (!fragment2.equals(this)) {
                    fragment2 = fragment2.getTargetFragment();
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.W = null;
            } else if (this.f2446g0 == null || fragment.f2446g0 == null) {
                this.W = null;
                this.V = fragment;
                this.X = i10;
                return;
            } else {
                this.W = fragment.T;
            }
            this.V = null;
            this.X = i10;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        if (!this.f2463x0 && z10 && this.O < 5 && this.f2446g0 != null && isAdded() && this.E0) {
            FragmentManager fragmentManager = this.f2446g0;
            fragmentManager.k1(fragmentManager.A(this));
        }
        this.f2463x0 = z10;
        this.f2462w0 = this.O < 5 && !z10;
        if (this.P != null) {
            this.S = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@m0 String str) {
        g<?> gVar = this.f2447h0;
        if (gVar != null) {
            return gVar.p(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @o0 Bundle bundle) {
        g<?> gVar = this.f2447h0;
        if (gVar != null) {
            gVar.r(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityForResult(intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i10, @o0 Bundle bundle) {
        if (this.f2447h0 != null) {
            getParentFragmentManager().a1(this, intent, i10, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, @o0 Intent intent, int i11, int i12, int i13, @o0 Bundle bundle) throws IntentSender.SendIntentException {
        if (this.f2447h0 != null) {
            if (FragmentManager.T0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(this);
                sb2.append(" received the following in startIntentSenderForResult() requestCode: ");
                int i14 = i10;
                sb2.append(i10);
                sb2.append(" IntentSender: ");
                IntentSender intentSender2 = intentSender;
                sb2.append(intentSender);
                sb2.append(" fillInIntent: ");
                Intent intent2 = intent;
                sb2.append(intent);
                sb2.append(" options: ");
                sb2.append(bundle);
            } else {
                IntentSender intentSender3 = intentSender;
                int i15 = i10;
                Intent intent3 = intent;
                Bundle bundle2 = bundle;
            }
            getParentFragmentManager().b1(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.f2464y0 != null && w().f2499w) {
            if (this.f2447h0 == null) {
                w().f2499w = false;
            } else if (Looper.myLooper() != this.f2447h0.g().getLooper()) {
                this.f2447h0.g().postAtFrontOfQueue(new b());
            } else {
                u(true);
            }
        }
    }

    public void t0() {
        onViewCreated(this.f2461v0, this.P);
        this.f2448i0.Z();
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append(p7.a.f11638i);
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(p7.a.f11639j);
        sb2.append(" (");
        sb2.append(this.T);
        if (this.f2450k0 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2450k0));
        }
        if (this.f2452m0 != null) {
            sb2.append(" tag=");
            sb2.append(this.f2452m0);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void u(boolean z10) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.f2464y0;
        l lVar = null;
        if (iVar != null) {
            iVar.f2499w = false;
            l lVar2 = iVar.f2500x;
            iVar.f2500x = null;
            lVar = lVar2;
        }
        if (lVar != null) {
            lVar.b();
        } else if (FragmentManager.Q && this.f2461v0 != null && (viewGroup = this.f2460u0) != null && (fragmentManager = this.f2446g0) != null) {
            a0 n10 = a0.n(viewGroup, fragmentManager);
            n10.p();
            if (z10) {
                this.f2447h0.g().post(new c(n10));
            } else {
                n10.g();
            }
        }
    }

    @m0
    public final <I, O> androidx.activity.result.c<I> u0(@m0 c.a<I, O> aVar, @m0 p.a<Void, ActivityResultRegistry> aVar2, @m0 androidx.activity.result.a<O> aVar3) {
        if (this.O <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            v0(new g(aVar2, atomicReference, aVar, aVar3));
            return new h(atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public void unregisterForContextMenu(@m0 View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    @m0
    public d v() {
        return new d();
    }

    public final void v0(@m0 k kVar) {
        if (this.O >= 0) {
            kVar.a();
        } else {
            this.N0.add(kVar);
        }
    }

    public final i w() {
        if (this.f2464y0 == null) {
            this.f2464y0 = new i();
        }
        return this.f2464y0;
    }

    public void w0(@o0 Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable(FragmentActivity.f2502e0)) != null) {
            this.f2448i0.E1(parcelable);
            this.f2448i0.H();
        }
    }

    @o0
    public Fragment x(@m0 String str) {
        return str.equals(this.T) ? this : this.f2448i0.r0(str);
    }

    public final void x0() {
        if (FragmentManager.T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("moveto RESTORE_VIEW_STATE: ");
            sb2.append(this);
        }
        if (this.f2461v0 != null) {
            y0(this.P);
        }
        this.P = null;
    }

    @m0
    public String y() {
        return "fragment_" + this.T + "_rq#" + this.M0.getAndIncrement();
    }

    public final void y0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.Q;
        if (sparseArray != null) {
            this.f2461v0.restoreHierarchyState(sparseArray);
            this.Q = null;
        }
        if (this.f2461v0 != null) {
            this.H0.d(this.R);
            this.R = null;
        }
        this.f2459t0 = false;
        onViewStateRestored(bundle);
        if (!this.f2459t0) {
            throw new c0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.f2461v0 != null) {
            this.H0.a(p.a.ON_CREATE);
        }
    }

    public View z() {
        i iVar = this.f2464y0;
        if (iVar == null) {
            return null;
        }
        return iVar.f2477a;
    }

    public void z0(View view) {
        w().f2477a = view;
    }
}
