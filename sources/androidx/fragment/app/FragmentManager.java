package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.u;
import androidx.fragment.app.v;
import androidx.lifecycle.b1;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import c.b;
import d.a1;
import d.b0;
import d.j0;
import d.m0;
import d.o0;
import d.x0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import x1.a;
import y3.q;

public abstract class FragmentManager implements p {
    public static boolean O = false;
    public static final String P = "FragmentManager";
    public static boolean Q = true;
    public static final int R = 1;
    public static final String S = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    public androidx.activity.result.c<IntentSenderRequest> A;
    public androidx.activity.result.c<String[]> B;
    public ArrayDeque<LaunchedFragmentInfo> C = new ArrayDeque<>();
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public ArrayList<a> I;
    public ArrayList<Boolean> J;
    public ArrayList<Fragment> K;
    public ArrayList<r> L;
    public l M;
    public Runnable N = new g();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<p> f2509a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2510b;

    /* renamed from: c  reason: collision with root package name */
    public final t f2511c = new t();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f2512d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<Fragment> f2513e;

    /* renamed from: f  reason: collision with root package name */
    public final h f2514f = new h(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f2515g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.activity.b f2516h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f2517i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f2518j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, n> f2519k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<o> f2520l;

    /* renamed from: m  reason: collision with root package name */
    public Map<Fragment, HashSet<x0.c>> f2521m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n  reason: collision with root package name */
    public final v.g f2522n = new d();

    /* renamed from: o  reason: collision with root package name */
    public final i f2523o = new i(this);

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList<m> f2524p = new CopyOnWriteArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public int f2525q = -1;

    /* renamed from: r  reason: collision with root package name */
    public g<?> f2526r;

    /* renamed from: s  reason: collision with root package name */
    public d f2527s;

    /* renamed from: t  reason: collision with root package name */
    public Fragment f2528t;
    @o0

    /* renamed from: u  reason: collision with root package name */
    public Fragment f2529u;

    /* renamed from: v  reason: collision with root package name */
    public f f2530v = null;

    /* renamed from: w  reason: collision with root package name */
    public f f2531w = new e();

    /* renamed from: x  reason: collision with root package name */
    public b0 f2532x = null;

    /* renamed from: y  reason: collision with root package name */
    public b0 f2533y = new f();

    /* renamed from: z  reason: collision with root package name */
    public androidx.activity.result.c<Intent> f2534z;

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String O;
        public int P;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            /* renamed from: a */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            /* renamed from: b */
            public LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(@m0 Parcel parcel) {
            this.O = parcel.readString();
            this.P = parcel.readInt();
        }

        public LaunchedFragmentInfo(@m0 String str, int i10) {
            this.O = str;
            this.P = i10;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.O);
            parcel.writeInt(this.P);
        }
    }

    public class a implements androidx.activity.result.a<ActivityResult> {
        public a() {
        }

        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No IntentSenders were started for ");
                sb2.append(this);
                return;
            }
            String str = pollFirst.O;
            int i10 = pollFirst.P;
            Fragment i11 = FragmentManager.this.f2511c.i(str);
            if (i11 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Intent Sender result delivered for unknown Fragment ");
                sb3.append(str);
                return;
            }
            i11.onActivityResult(i10, activityResult.b(), activityResult.a());
        }
    }

    public class b implements androidx.activity.result.a<Map<String, Boolean>> {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public void a(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No permissions were requested for ");
                sb2.append(this);
                return;
            }
            String str = pollFirst.O;
            int i11 = pollFirst.P;
            Fragment i12 = FragmentManager.this.f2511c.i(str);
            if (i12 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Permission request result delivered for unknown Fragment ");
                sb3.append(str);
                return;
            }
            i12.onRequestPermissionsResult(i11, strArr, iArr);
        }
    }

    public class c extends androidx.activity.b {
        public c(boolean z10) {
            super(z10);
        }

        public void b() {
            FragmentManager.this.P0();
        }
    }

    public class d implements v.g {
        public d() {
        }

        public void a(@m0 Fragment fragment, @m0 x0.c cVar) {
            FragmentManager.this.j(fragment, cVar);
        }

        public void b(@m0 Fragment fragment, @m0 x0.c cVar) {
            if (!cVar.c()) {
                FragmentManager.this.w1(fragment, cVar);
            }
        }
    }

    public class e extends f {
        public e() {
        }

        @m0
        public Fragment a(@m0 ClassLoader classLoader, @m0 String str) {
            return FragmentManager.this.H0().b(FragmentManager.this.H0().f(), str, (Bundle) null);
        }
    }

    public class f implements b0 {
        public f() {
        }

        @m0
        public a0 a(@m0 ViewGroup viewGroup) {
            return new b(viewGroup);
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            FragmentManager.this.h0(true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f2541a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2542b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Fragment f2543c;

        public h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2541a = viewGroup;
            this.f2542b = view;
            this.f2543c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2541a.endViewTransition(this.f2542b);
            animator.removeListener(this);
            Fragment fragment = this.f2543c;
            View view = fragment.f2461v0;
            if (view != null && fragment.f2453n0) {
                view.setVisibility(8);
            }
        }
    }

    public class i implements m {
        public final /* synthetic */ Fragment O;

        public i(Fragment fragment) {
            this.O = fragment;
        }

        public void a(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
            this.O.onAttachFragment(fragment);
        }
    }

    public class j implements androidx.activity.result.a<ActivityResult> {
        public j() {
        }

        /* renamed from: b */
        public void a(ActivityResult activityResult) {
            LaunchedFragmentInfo pollFirst = FragmentManager.this.C.pollFirst();
            if (pollFirst == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No Activities were started for result for ");
                sb2.append(this);
                return;
            }
            String str = pollFirst.O;
            int i10 = pollFirst.P;
            Fragment i11 = FragmentManager.this.f2511c.i(str);
            if (i11 == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Activity result delivered for unknown Fragment ");
                sb3.append(str);
                return;
            }
            i11.onActivityResult(i10, activityResult.b(), activityResult.a());
        }
    }

    public interface k {
        @o0
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @a1
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @o0
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @a1
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @o0
        String getName();
    }

    public static class l extends c.a<IntentSenderRequest, ActivityResult> {
        @m0
        /* renamed from: d */
        public Intent a(@m0 Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(b.k.f4764a);
            Intent a10 = intentSenderRequest.a();
            if (!(a10 == null || (bundleExtra = a10.getBundleExtra(b.j.f4763a)) == null)) {
                intent.putExtra(b.j.f4763a, bundleExtra);
                a10.removeExtra(b.j.f4763a);
                if (a10.getBooleanExtra(FragmentManager.S, false)) {
                    intentSenderRequest = new IntentSenderRequest.b(intentSenderRequest.d()).b((Intent) null).c(intentSenderRequest.c(), intentSenderRequest.b()).a();
                }
            }
            intent.putExtra(b.k.f4765b, intentSenderRequest);
            if (FragmentManager.T0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CreateIntent created the following intent: ");
                sb2.append(intent);
            }
            return intent;
        }

        @m0
        /* renamed from: e */
        public ActivityResult c(int i10, @o0 Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void a(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @o0 Bundle bundle) {
        }

        public void b(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @m0 Context context) {
        }

        public void c(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @o0 Bundle bundle) {
        }

        public void d(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
        }

        public void e(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
        }

        public void f(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
        }

        public void g(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @m0 Context context) {
        }

        public void h(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @o0 Bundle bundle) {
        }

        public void i(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
        }

        public void j(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @m0 Bundle bundle) {
        }

        public void k(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
        }

        public void l(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
        }

        public void m(@m0 FragmentManager fragmentManager, @m0 Fragment fragment, @m0 View view, @o0 Bundle bundle) {
        }

        public void n(@m0 FragmentManager fragmentManager, @m0 Fragment fragment) {
        }
    }

    public static class n implements o {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.lifecycle.p f2546a;

        /* renamed from: b  reason: collision with root package name */
        public final o f2547b;

        /* renamed from: c  reason: collision with root package name */
        public final u f2548c;

        public n(@m0 androidx.lifecycle.p pVar, @m0 o oVar, @m0 u uVar) {
            this.f2546a = pVar;
            this.f2547b = oVar;
            this.f2548c = uVar;
        }

        public void a(@m0 String str, @m0 Bundle bundle) {
            this.f2547b.a(str, bundle);
        }

        public boolean b(p.b bVar) {
            return this.f2546a.b().b(bVar);
        }

        public void c() {
            this.f2546a.d(this.f2548c);
        }
    }

    public interface o {
        @j0
        void onBackStackChanged();
    }

    public interface p {
        boolean a(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2);
    }

    public class q implements p {

        /* renamed from: a  reason: collision with root package name */
        public final String f2549a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2550b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2551c;

        public q(@o0 String str, int i10, int i11) {
            this.f2549a = str;
            this.f2550b = i10;
            this.f2551c = i11;
        }

        public boolean a(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f2529u;
            if (fragment != null && this.f2550b < 0 && this.f2549a == null && fragment.getChildFragmentManager().o1()) {
                return false;
            }
            return FragmentManager.this.s1(arrayList, arrayList2, this.f2549a, this.f2550b, this.f2551c);
        }
    }

    public static class r implements Fragment.l {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f2553a;

        /* renamed from: b  reason: collision with root package name */
        public final a f2554b;

        /* renamed from: c  reason: collision with root package name */
        public int f2555c;

        public r(@m0 a aVar, boolean z10) {
            this.f2553a = z10;
            this.f2554b = aVar;
        }

        public void a() {
            this.f2555c++;
        }

        public void b() {
            int i10 = this.f2555c - 1;
            this.f2555c = i10;
            if (i10 == 0) {
                this.f2554b.L.J1();
            }
        }

        public void c() {
            a aVar = this.f2554b;
            aVar.L.y(aVar, this.f2553a, false, false);
        }

        public void d() {
            boolean z10 = this.f2555c > 0;
            for (Fragment next : this.f2554b.L.G0()) {
                next.F0((Fragment.l) null);
                if (z10 && next.T()) {
                    next.startPostponedEnterTransition();
                }
            }
            a aVar = this.f2554b;
            aVar.L.y(aVar, this.f2553a, !z10, true);
        }

        public boolean e() {
            return this.f2555c == 0;
        }
    }

    public static int G1(int i10) {
        if (i10 == 4097) {
            return 8194;
        }
        if (i10 == 4099) {
            return u.K;
        }
        if (i10 != 8194) {
            return 0;
        }
        return u.I;
    }

    @o0
    public static Fragment N0(@m0 View view) {
        Object tag = view.getTag(a.g.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    public static boolean T0(int i10) {
        return O || Log.isLoggable("FragmentManager", i10);
    }

    @Deprecated
    public static void c0(boolean z10) {
        O = z10;
    }

    @r
    public static void d0(boolean z10) {
        Q = z10;
    }

    public static void j0(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2, int i10, int i11) {
        while (i10 < i11) {
            a aVar = arrayList.get(i10);
            boolean z10 = true;
            if (arrayList2.get(i10).booleanValue()) {
                aVar.Q(-1);
                if (i10 != i11 - 1) {
                    z10 = false;
                }
                aVar.V(z10);
            } else {
                aVar.Q(1);
                aVar.U();
            }
            i10++;
        }
    }

    @m0
    public static <F extends Fragment> F o0(@m0 View view) {
        F t02 = t0(view);
        if (t02 != null) {
            return t02;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @m0
    public static FragmentManager s0(@m0 View view) {
        Fragment t02 = t0(view);
        if (t02 == null) {
            Context context = view.getContext();
            FragmentActivity fragmentActivity = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                return fragmentActivity.X();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (t02.isAdded()) {
            return t02.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + t02 + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    @o0
    public static Fragment t0(@m0 View view) {
        while (view != null) {
            Fragment N0 = N0(view);
            if (N0 != null) {
                return N0;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @m0
    public q A(@m0 Fragment fragment) {
        q n10 = this.f2511c.n(fragment.T);
        if (n10 != null) {
            return n10;
        }
        q qVar = new q(this.f2523o, this.f2511c, fragment);
        qVar.o(this.f2526r.f().getClassLoader());
        qVar.u(this.f2525q);
        return qVar;
    }

    @m0
    public final l A0(@m0 Fragment fragment) {
        return this.M.j(fragment);
    }

    public final void A1(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m0(arrayList, arrayList2);
                int size = arrayList.size();
                int i10 = 0;
                int i11 = 0;
                while (i10 < size) {
                    if (!arrayList.get(i10).f2705r) {
                        if (i11 != i10) {
                            k0(arrayList, arrayList2, i11, i10);
                        }
                        i11 = i10 + 1;
                        if (arrayList2.get(i10).booleanValue()) {
                            while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f2705r) {
                                i11++;
                            }
                        }
                        k0(arrayList, arrayList2, i10, i11);
                        i10 = i11 - 1;
                    }
                    i10++;
                }
                if (i11 != size) {
                    k0(arrayList, arrayList2, i11, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void B(@m0 Fragment fragment) {
        fragment.e0();
        this.f2523o.n(fragment, false);
        fragment.f2460u0 = null;
        fragment.f2461v0 = null;
        fragment.H0 = null;
        fragment.I0.r(null);
        fragment.f2442c0 = false;
    }

    @m0
    public d B0() {
        return this.f2527s;
    }

    public void B1(@m0 Fragment fragment) {
        this.M.p(fragment);
    }

    public void C(@m0 Fragment fragment) {
        if (T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("detach: ");
            sb2.append(fragment);
        }
        if (!fragment.f2454o0) {
            fragment.f2454o0 = true;
            if (fragment.Z) {
                if (T0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("remove from detach: ");
                    sb3.append(fragment);
                }
                this.f2511c.t(fragment);
                if (U0(fragment)) {
                    this.D = true;
                }
                P1(fragment);
            }
        }
    }

    @o0
    public Fragment C0(@m0 Bundle bundle, @m0 String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment n02 = n0(string);
        if (n02 == null) {
            S1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return n02;
    }

    public final void C1() {
        if (this.f2520l != null) {
            for (int i10 = 0; i10 < this.f2520l.size(); i10++) {
                this.f2520l.get(i10).onBackStackChanged();
            }
        }
    }

    public void D() {
        this.E = false;
        this.F = false;
        this.M.r(false);
        X(4);
    }

    public final ViewGroup D0(@m0 Fragment fragment) {
        ViewGroup viewGroup = fragment.f2460u0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f2451l0 > 0 && this.f2527s.d()) {
            View c10 = this.f2527s.c(fragment.f2451l0);
            if (c10 instanceof ViewGroup) {
                return (ViewGroup) c10;
            }
        }
        return null;
    }

    public void D1(@o0 Parcelable parcelable, @o0 k kVar) {
        if (this.f2526r instanceof b1) {
            S1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.M.q(kVar);
        E1(parcelable);
    }

    public void E() {
        this.E = false;
        this.F = false;
        this.M.r(false);
        X(0);
    }

    @m0
    public f E0() {
        f fVar = this.f2530v;
        if (fVar != null) {
            return fVar;
        }
        Fragment fragment = this.f2528t;
        return fragment != null ? fragment.f2446g0.E0() : this.f2531w;
    }

    public void E1(@o0 Parcelable parcelable) {
        q qVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.O != null) {
                this.f2511c.u();
                Iterator<FragmentState> it = fragmentManagerState.O.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment i10 = this.M.i(next.P);
                        if (i10 != null) {
                            if (T0(2)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("restoreSaveState: re-attaching retained ");
                                sb2.append(i10);
                            }
                            qVar = new q(this.f2523o, this.f2511c, i10, next);
                        } else {
                            qVar = new q(this.f2523o, this.f2511c, this.f2526r.f().getClassLoader(), E0(), next);
                        }
                        Fragment k10 = qVar.k();
                        k10.f2446g0 = this;
                        if (T0(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("restoreSaveState: active (");
                            sb3.append(k10.T);
                            sb3.append("): ");
                            sb3.append(k10);
                        }
                        qVar.o(this.f2526r.f().getClassLoader());
                        this.f2511c.q(qVar);
                        qVar.u(this.f2525q);
                    }
                }
                for (Fragment next2 : this.M.l()) {
                    if (!this.f2511c.c(next2.T)) {
                        if (T0(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("Discarding retained Fragment ");
                            sb4.append(next2);
                            sb4.append(" that was not found in the set of active Fragments ");
                            sb4.append(fragmentManagerState.O);
                        }
                        this.M.p(next2);
                        next2.f2446g0 = this;
                        q qVar2 = new q(this.f2523o, this.f2511c, next2);
                        qVar2.u(1);
                        qVar2.m();
                        next2.f2440a0 = true;
                        qVar2.m();
                    }
                }
                this.f2511c.v(fragmentManagerState.P);
                if (fragmentManagerState.Q != null) {
                    this.f2512d = new ArrayList<>(fragmentManagerState.Q.length);
                    int i11 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.Q;
                        if (i11 >= backStackStateArr.length) {
                            break;
                        }
                        a a10 = backStackStateArr[i11].a(this);
                        if (T0(2)) {
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("restoreAllState: back stack #");
                            sb5.append(i11);
                            sb5.append(" (index ");
                            sb5.append(a10.N);
                            sb5.append("): ");
                            sb5.append(a10);
                            PrintWriter printWriter = new PrintWriter(new z("FragmentManager"));
                            a10.T(q.a.R, printWriter, false);
                            printWriter.close();
                        }
                        this.f2512d.add(a10);
                        i11++;
                    }
                } else {
                    this.f2512d = null;
                }
                this.f2517i.set(fragmentManagerState.R);
                String str = fragmentManagerState.S;
                if (str != null) {
                    Fragment n02 = n0(str);
                    this.f2529u = n02;
                    Q(n02);
                }
                ArrayList<String> arrayList = fragmentManagerState.T;
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        Bundle bundle = fragmentManagerState.U.get(i12);
                        bundle.setClassLoader(this.f2526r.f().getClassLoader());
                        this.f2518j.put(arrayList.get(i12), bundle);
                    }
                }
                this.C = new ArrayDeque<>(fragmentManagerState.V);
            }
        }
    }

    public void F(@m0 Configuration configuration) {
        for (Fragment next : this.f2511c.o()) {
            if (next != null) {
                next.Y(configuration);
            }
        }
    }

    @m0
    public t F0() {
        return this.f2511c;
    }

    @Deprecated
    public k F1() {
        if (this.f2526r instanceof b1) {
            S1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.M.m();
    }

    public boolean G(@m0 MenuItem menuItem) {
        if (this.f2525q < 1) {
            return false;
        }
        for (Fragment next : this.f2511c.o()) {
            if (next != null && next.Z(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @m0
    public List<Fragment> G0() {
        return this.f2511c.o();
    }

    public void H() {
        this.E = false;
        this.F = false;
        this.M.r(false);
        X(1);
    }

    @m0
    public g<?> H0() {
        return this.f2526r;
    }

    public Parcelable H1() {
        int size;
        u0();
        e0();
        h0(true);
        this.E = true;
        this.M.r(true);
        ArrayList<FragmentState> w10 = this.f2511c.w();
        BackStackState[] backStackStateArr = null;
        if (w10.isEmpty()) {
            T0(2);
            return null;
        }
        ArrayList<String> x10 = this.f2511c.x();
        ArrayList<a> arrayList = this.f2512d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackStateArr[i10] = new BackStackState(this.f2512d.get(i10));
                if (T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("saveAllState: adding back stack #");
                    sb2.append(i10);
                    sb2.append(": ");
                    sb2.append(this.f2512d.get(i10));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.O = w10;
        fragmentManagerState.P = x10;
        fragmentManagerState.Q = backStackStateArr;
        fragmentManagerState.R = this.f2517i.get();
        Fragment fragment = this.f2529u;
        if (fragment != null) {
            fragmentManagerState.S = fragment.T;
        }
        fragmentManagerState.T.addAll(this.f2518j.keySet());
        fragmentManagerState.U.addAll(this.f2518j.values());
        fragmentManagerState.V = new ArrayList<>(this.C);
        return fragmentManagerState;
    }

    public boolean I(@m0 Menu menu, @m0 MenuInflater menuInflater) {
        if (this.f2525q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment next : this.f2511c.o()) {
            if (next != null && V0(next) && next.b0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z10 = true;
            }
        }
        if (this.f2513e != null) {
            for (int i10 = 0; i10 < this.f2513e.size(); i10++) {
                Fragment fragment = this.f2513e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.f2513e = arrayList;
        return z10;
    }

    @m0
    public LayoutInflater.Factory2 I0() {
        return this.f2514f;
    }

    @o0
    public Fragment.SavedState I1(@m0 Fragment fragment) {
        q n10 = this.f2511c.n(fragment.T);
        if (n10 == null || !n10.k().equals(fragment)) {
            S1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return n10.r();
    }

    public void J() {
        this.G = true;
        h0(true);
        e0();
        X(-1);
        this.f2526r = null;
        this.f2527s = null;
        this.f2528t = null;
        if (this.f2515g != null) {
            this.f2516h.d();
            this.f2515g = null;
        }
        androidx.activity.result.c<Intent> cVar = this.f2534z;
        if (cVar != null) {
            cVar.d();
            this.A.d();
            this.B.d();
        }
    }

    @m0
    public i J0() {
        return this.f2523o;
    }

    public void J1() {
        synchronized (this.f2509a) {
            ArrayList<r> arrayList = this.L;
            boolean z10 = false;
            boolean z11 = arrayList != null && !arrayList.isEmpty();
            if (this.f2509a.size() == 1) {
                z10 = true;
            }
            if (z11 || z10) {
                this.f2526r.g().removeCallbacks(this.N);
                this.f2526r.g().post(this.N);
                U1();
            }
        }
    }

    public void K() {
        X(1);
    }

    @o0
    public Fragment K0() {
        return this.f2528t;
    }

    public void K1(@m0 Fragment fragment, boolean z10) {
        ViewGroup D0 = D0(fragment);
        if (D0 != null && (D0 instanceof FragmentContainerView)) {
            ((FragmentContainerView) D0).setDrawDisappearingViewsLast(!z10);
        }
    }

    public void L() {
        for (Fragment next : this.f2511c.o()) {
            if (next != null) {
                next.h0();
            }
        }
    }

    @o0
    public Fragment L0() {
        return this.f2529u;
    }

    public void L1(@m0 f fVar) {
        this.f2530v = fVar;
    }

    public void M(boolean z10) {
        for (Fragment next : this.f2511c.o()) {
            if (next != null) {
                next.i0(z10);
            }
        }
    }

    @m0
    public b0 M0() {
        b0 b0Var = this.f2532x;
        if (b0Var != null) {
            return b0Var;
        }
        Fragment fragment = this.f2528t;
        return fragment != null ? fragment.f2446g0.M0() : this.f2533y;
    }

    public void M1(@m0 Fragment fragment, @m0 p.b bVar) {
        if (!fragment.equals(n0(fragment.T)) || !(fragment.f2447h0 == null || fragment.f2446g0 == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.F0 = bVar;
    }

    public void N(@m0 Fragment fragment) {
        Iterator<m> it = this.f2524p.iterator();
        while (it.hasNext()) {
            it.next().a(this, fragment);
        }
    }

    public void N1(@o0 Fragment fragment) {
        if (fragment == null || (fragment.equals(n0(fragment.T)) && (fragment.f2447h0 == null || fragment.f2446g0 == this))) {
            Fragment fragment2 = this.f2529u;
            this.f2529u = fragment;
            Q(fragment2);
            Q(this.f2529u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean O(@m0 MenuItem menuItem) {
        if (this.f2525q < 1) {
            return false;
        }
        for (Fragment next : this.f2511c.o()) {
            if (next != null && next.j0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @m0
    public androidx.lifecycle.a1 O0(@m0 Fragment fragment) {
        return this.M.n(fragment);
    }

    public void O1(@m0 b0 b0Var) {
        this.f2532x = b0Var;
    }

    public void P(@m0 Menu menu) {
        if (this.f2525q >= 1) {
            for (Fragment next : this.f2511c.o()) {
                if (next != null) {
                    next.k0(menu);
                }
            }
        }
    }

    public void P0() {
        h0(true);
        if (this.f2516h.c()) {
            o1();
        } else {
            this.f2515g.e();
        }
    }

    public final void P1(@m0 Fragment fragment) {
        ViewGroup D0 = D0(fragment);
        if (D0 != null && fragment.B() + fragment.D() + fragment.K() + fragment.L() > 0) {
            int i10 = a.g.visible_removing_fragment_view_tag;
            if (D0.getTag(i10) == null) {
                D0.setTag(i10, fragment);
            }
            ((Fragment) D0.getTag(i10)).G0(fragment.J());
        }
    }

    public final void Q(@o0 Fragment fragment) {
        if (fragment != null && fragment.equals(n0(fragment.T))) {
            fragment.o0();
        }
    }

    public void Q0(@m0 Fragment fragment) {
        if (T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("hide: ");
            sb2.append(fragment);
        }
        if (!fragment.f2453n0) {
            fragment.f2453n0 = true;
            fragment.B0 = true ^ fragment.B0;
            P1(fragment);
        }
    }

    public void Q1(@m0 Fragment fragment) {
        if (T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("show: ");
            sb2.append(fragment);
        }
        if (fragment.f2453n0) {
            fragment.f2453n0 = false;
            fragment.B0 = !fragment.B0;
        }
    }

    public void R() {
        X(5);
    }

    public void R0(@m0 Fragment fragment) {
        if (fragment.Z && U0(fragment)) {
            this.D = true;
        }
    }

    public final void R1() {
        for (q k12 : this.f2511c.l()) {
            k1(k12);
        }
    }

    public void S(boolean z10) {
        for (Fragment next : this.f2511c.o()) {
            if (next != null) {
                next.m0(z10);
            }
        }
    }

    public boolean S0() {
        return this.G;
    }

    public final void S1(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new z("FragmentManager"));
        g<?> gVar = this.f2526r;
        if (gVar != null) {
            try {
                gVar.i(q.a.R, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception unused) {
            }
        } else {
            b0(q.a.R, (FileDescriptor) null, printWriter, new String[0]);
        }
        throw runtimeException;
    }

    public boolean T(@m0 Menu menu) {
        boolean z10 = false;
        if (this.f2525q < 1) {
            return false;
        }
        for (Fragment next : this.f2511c.o()) {
            if (next != null && V0(next) && next.n0(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public void T1(@m0 m mVar) {
        this.f2523o.p(mVar);
    }

    public void U() {
        U1();
        Q(this.f2529u);
    }

    public final boolean U0(@m0 Fragment fragment) {
        return (fragment.f2457r0 && fragment.f2458s0) || fragment.f2448i0.t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (z0() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (W0(r3.f2528t) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.f(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f2516h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U1() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$p> r0 = r3.f2509a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$p> r1 = r3.f2509a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f2516h     // Catch:{ all -> 0x002a }
            r1.f(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f2516h
            int r1 = r3.z0()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f2528t
            boolean r1 = r3.W0(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.f(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.U1():void");
    }

    public void V() {
        this.E = false;
        this.F = false;
        this.M.r(false);
        X(7);
    }

    public boolean V0(@o0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void W() {
        this.E = false;
        this.F = false;
        this.M.r(false);
        X(5);
    }

    public boolean W0(@o0 Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f2446g0;
        return fragment.equals(fragmentManager.L0()) && W0(fragmentManager.f2528t);
    }

    /* JADX INFO: finally extract failed */
    public final void X(int i10) {
        try {
            this.f2510b = true;
            this.f2511c.d(i10);
            e1(i10, false);
            if (Q) {
                for (a0 j10 : w()) {
                    j10.j();
                }
            }
            this.f2510b = false;
            h0(true);
        } catch (Throwable th2) {
            this.f2510b = false;
            throw th2;
        }
    }

    public boolean X0(int i10) {
        return this.f2525q >= i10;
    }

    public void Y() {
        this.F = true;
        this.M.r(true);
        X(4);
    }

    public boolean Y0() {
        return this.E || this.F;
    }

    public void Z() {
        X(2);
    }

    public void Z0(@m0 Fragment fragment, @m0 String[] strArr, int i10) {
        if (this.B != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.T, i10));
            this.B.b(strArr);
            return;
        }
        this.f2526r.n(fragment, strArr, i10);
    }

    public final void a(@m0 String str, @m0 Bundle bundle) {
        n nVar = this.f2519k.get(str);
        if (nVar == null || !nVar.b(p.b.STARTED)) {
            this.f2518j.put(str, bundle);
        } else {
            nVar.a(str, bundle);
        }
    }

    public final void a0() {
        if (this.H) {
            this.H = false;
            R1();
        }
    }

    public void a1(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, @o0 Bundle bundle) {
        if (this.f2534z != null) {
            this.C.addLast(new LaunchedFragmentInfo(fragment.T, i10));
            if (!(intent == null || bundle == null)) {
                intent.putExtra(b.j.f4763a, bundle);
            }
            this.f2534z.b(intent);
            return;
        }
        this.f2526r.r(fragment, intent, i10, bundle);
    }

    @SuppressLint({"SyntheticAccessor"})
    public final void b(@m0 final String str, @m0 y yVar, @m0 final o oVar) {
        final androidx.lifecycle.p lifecycle = yVar.getLifecycle();
        if (lifecycle.b() != p.b.DESTROYED) {
            AnonymousClass6 r02 = new u() {
                public void d(@m0 y yVar, @m0 p.a aVar) {
                    Bundle bundle;
                    if (aVar == p.a.ON_START && (bundle = (Bundle) FragmentManager.this.f2518j.get(str)) != null) {
                        oVar.a(str, bundle);
                        FragmentManager.this.d(str);
                    }
                    if (aVar == p.a.ON_DESTROY) {
                        lifecycle.d(this);
                        FragmentManager.this.f2519k.remove(str);
                    }
                }
            };
            lifecycle.a(r02);
            n put = this.f2519k.put(str, new n(lifecycle, oVar, r02));
            if (put != null) {
                put.c();
            }
        }
    }

    public void b0(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2511c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f2513e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size2; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f2513e.get(i10).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f2512d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = this.f2512d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.S(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2517i.get());
        synchronized (this.f2509a) {
            int size3 = this.f2509a.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i12 = 0; i12 < size3; i12++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i12);
                    printWriter.print(": ");
                    printWriter.println(this.f2509a.get(i12));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2526r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2527s);
        if (this.f2528t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2528t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2525q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    public void b1(@m0 Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, @o0 Intent intent, int i11, int i12, int i13, @o0 Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        if (this.A != null) {
            if (bundle2 != null) {
                if (intent == null) {
                    intent2 = new Intent();
                    intent2.putExtra(S, true);
                } else {
                    intent2 = intent;
                }
                if (T0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ActivityOptions ");
                    sb2.append(bundle2);
                    sb2.append(" were added to fillInIntent ");
                    sb2.append(intent2);
                    sb2.append(" for fragment ");
                    sb2.append(fragment);
                }
                intent2.putExtra(b.j.f4763a, bundle2);
            } else {
                intent2 = intent;
            }
            IntentSender intentSender2 = intentSender;
            int i14 = i11;
            IntentSenderRequest a10 = new IntentSenderRequest.b(intentSender).b(intent2).c(i12, i11).a();
            int i15 = i10;
            this.C.addLast(new LaunchedFragmentInfo(fragment2.T, i10));
            if (T0(2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Fragment ");
                sb3.append(fragment);
                sb3.append("is launching an IntentSender for result ");
            }
            this.A.b(a10);
            return;
        }
        IntentSender intentSender3 = intentSender;
        int i16 = i10;
        this.f2526r.s(fragment, intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public final void c(@m0 String str) {
        n remove = this.f2519k.remove(str);
        if (remove != null) {
            remove.c();
        }
    }

    public final void c1(@m0 androidx.collection.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            Fragment n10 = bVar.n(i10);
            if (!n10.Z) {
                View requireView = n10.requireView();
                n10.C0 = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    public final void d(@m0 String str) {
        this.f2518j.remove(str);
    }

    public void d1(@m0 Fragment fragment) {
        if (this.f2511c.c(fragment.T)) {
            f1(fragment);
            View view = fragment.f2461v0;
            if (!(view == null || !fragment.A0 || fragment.f2460u0 == null)) {
                float f10 = fragment.C0;
                if (f10 > 0.0f) {
                    view.setAlpha(f10);
                }
                fragment.C0 = 0.0f;
                fragment.A0 = false;
                c.d c10 = c.c(this.f2526r.f(), fragment, true, fragment.J());
                if (c10 != null) {
                    Animation animation = c10.f2625a;
                    if (animation != null) {
                        fragment.f2461v0.startAnimation(animation);
                    } else {
                        c10.f2626b.setTarget(fragment.f2461v0);
                        c10.f2626b.start();
                    }
                }
            }
            if (fragment.B0) {
                z(fragment);
            }
        } else if (T0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Ignoring moving ");
            sb2.append(fragment);
            sb2.append(" to state ");
            sb2.append(this.f2525q);
            sb2.append("since it is not added to ");
            sb2.append(this);
        }
    }

    public final void e0() {
        if (Q) {
            for (a0 j10 : w()) {
                j10.j();
            }
        } else if (!this.f2521m.isEmpty()) {
            for (Fragment next : this.f2521m.keySet()) {
                s(next);
                f1(next);
            }
        }
    }

    public void e1(int i10, boolean z10) {
        g<?> gVar;
        if (this.f2526r == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z10 || i10 != this.f2525q) {
            this.f2525q = i10;
            if (Q) {
                this.f2511c.s();
            } else {
                for (Fragment d12 : this.f2511c.o()) {
                    d1(d12);
                }
                for (q next : this.f2511c.l()) {
                    Fragment k10 = next.k();
                    if (!k10.A0) {
                        d1(k10);
                    }
                    if (k10.f2440a0 && !k10.S()) {
                        this.f2511c.r(next);
                    }
                }
            }
            R1();
            if (this.D && (gVar = this.f2526r) != null && this.f2525q == 7) {
                gVar.t();
                this.D = false;
            }
        }
    }

    public void f0(@m0 p pVar, boolean z10) {
        if (!z10) {
            if (this.f2526r != null) {
                u();
            } else if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f2509a) {
            if (this.f2526r != null) {
                this.f2509a.add(pVar);
                J1();
            } else if (!z10) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void f1(@m0 Fragment fragment) {
        g1(fragment, this.f2525q);
    }

    public final void g0(boolean z10) {
        if (this.f2510b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f2526r == null) {
            if (this.G) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f2526r.g().getLooper()) {
            if (!z10) {
                u();
            }
            if (this.I == null) {
                this.I = new ArrayList<>();
                this.J = new ArrayList<>();
            }
            this.f2510b = true;
            try {
                m0((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f2510b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r2 != 5) goto L_0x0154;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g1(@d.m0 androidx.fragment.app.Fragment r10, int r11) {
        /*
            r9 = this;
            androidx.fragment.app.t r0 = r9.f2511c
            java.lang.String r1 = r10.T
            androidx.fragment.app.q r0 = r0.n(r1)
            r1 = 1
            if (r0 != 0) goto L_0x0017
            androidx.fragment.app.q r0 = new androidx.fragment.app.q
            androidx.fragment.app.i r2 = r9.f2523o
            androidx.fragment.app.t r3 = r9.f2511c
            r0.<init>(r2, r3, r10)
            r0.u(r1)
        L_0x0017:
            boolean r2 = r10.f2441b0
            r3 = 2
            if (r2 == 0) goto L_0x0028
            boolean r2 = r10.f2442c0
            if (r2 == 0) goto L_0x0028
            int r2 = r10.O
            if (r2 != r3) goto L_0x0028
            int r11 = java.lang.Math.max(r11, r3)
        L_0x0028:
            int r2 = r0.d()
            int r11 = java.lang.Math.min(r11, r2)
            int r2 = r10.O
            r4 = 3
            r5 = -1
            r6 = 5
            r7 = 4
            if (r2 > r11) goto L_0x007a
            if (r2 >= r11) goto L_0x0045
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<x0.c>> r2 = r9.f2521m
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0045
            r9.s(r10)
        L_0x0045:
            int r2 = r10.O
            if (r2 == r5) goto L_0x0055
            if (r2 == 0) goto L_0x005a
            if (r2 == r1) goto L_0x005f
            if (r2 == r3) goto L_0x0069
            if (r2 == r7) goto L_0x006e
            if (r2 == r6) goto L_0x0073
            goto L_0x0154
        L_0x0055:
            if (r11 <= r5) goto L_0x005a
            r0.c()
        L_0x005a:
            if (r11 <= 0) goto L_0x005f
            r0.e()
        L_0x005f:
            if (r11 <= r5) goto L_0x0064
            r0.j()
        L_0x0064:
            if (r11 <= r1) goto L_0x0069
            r0.f()
        L_0x0069:
            if (r11 <= r3) goto L_0x006e
            r0.a()
        L_0x006e:
            if (r11 <= r7) goto L_0x0073
            r0.v()
        L_0x0073:
            if (r11 <= r6) goto L_0x0154
            r0.p()
            goto L_0x0154
        L_0x007a:
            if (r2 <= r11) goto L_0x0154
            if (r2 == 0) goto L_0x014d
            if (r2 == r1) goto L_0x013f
            if (r2 == r3) goto L_0x00bd
            if (r2 == r7) goto L_0x0095
            if (r2 == r6) goto L_0x0090
            r8 = 7
            if (r2 == r8) goto L_0x008b
            goto L_0x0154
        L_0x008b:
            if (r11 >= r8) goto L_0x0090
            r0.n()
        L_0x0090:
            if (r11 >= r6) goto L_0x0095
            r0.w()
        L_0x0095:
            if (r11 >= r7) goto L_0x00bd
            boolean r2 = T0(r4)
            if (r2 == 0) goto L_0x00aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r2.append(r6)
            r2.append(r10)
        L_0x00aa:
            android.view.View r2 = r10.f2461v0
            if (r2 == 0) goto L_0x00bd
            androidx.fragment.app.g<?> r2 = r9.f2526r
            boolean r2 = r2.o(r10)
            if (r2 == 0) goto L_0x00bd
            android.util.SparseArray<android.os.Parcelable> r2 = r10.Q
            if (r2 != 0) goto L_0x00bd
            r0.t()
        L_0x00bd:
            if (r11 >= r3) goto L_0x013f
            r2 = 0
            android.view.View r6 = r10.f2461v0
            if (r6 == 0) goto L_0x0134
            android.view.ViewGroup r7 = r10.f2460u0
            if (r7 == 0) goto L_0x0134
            r7.endViewTransition(r6)
            android.view.View r6 = r10.f2461v0
            r6.clearAnimation()
            boolean r6 = r10.U()
            if (r6 != 0) goto L_0x0134
            int r6 = r9.f2525q
            r7 = 0
            if (r6 <= r5) goto L_0x00fc
            boolean r5 = r9.G
            if (r5 != 0) goto L_0x00fc
            android.view.View r5 = r10.f2461v0
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x00fc
            float r5 = r10.C0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x00fc
            androidx.fragment.app.g<?> r2 = r9.f2526r
            android.content.Context r2 = r2.f()
            r5 = 0
            boolean r6 = r10.J()
            androidx.fragment.app.c$d r2 = androidx.fragment.app.c.c(r2, r10, r5, r6)
        L_0x00fc:
            r10.C0 = r7
            android.view.ViewGroup r5 = r10.f2460u0
            android.view.View r6 = r10.f2461v0
            if (r2 == 0) goto L_0x0109
            androidx.fragment.app.v$g r7 = r9.f2522n
            androidx.fragment.app.c.a(r10, r2, r7)
        L_0x0109:
            r5.removeView(r6)
            boolean r2 = T0(r3)
            if (r2 == 0) goto L_0x012f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Removing view "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = " for fragment "
            r2.append(r3)
            r2.append(r10)
            java.lang.String r3 = " from container "
            r2.append(r3)
            r2.append(r5)
        L_0x012f:
            android.view.ViewGroup r2 = r10.f2460u0
            if (r5 == r2) goto L_0x0134
            return
        L_0x0134:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<x0.c>> r2 = r9.f2521m
            java.lang.Object r2 = r2.get(r10)
            if (r2 != 0) goto L_0x013f
            r0.h()
        L_0x013f:
            if (r11 >= r1) goto L_0x014d
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<x0.c>> r2 = r9.f2521m
            java.lang.Object r2 = r2.get(r10)
            if (r2 == 0) goto L_0x014a
            goto L_0x014e
        L_0x014a:
            r0.g()
        L_0x014d:
            r1 = r11
        L_0x014e:
            if (r1 >= 0) goto L_0x0153
            r0.i()
        L_0x0153:
            r11 = r1
        L_0x0154:
            int r0 = r10.O
            if (r0 == r11) goto L_0x017f
            boolean r0 = T0(r4)
            if (r0 == 0) goto L_0x017d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r10.O
            r0.append(r1)
        L_0x017d:
            r10.O = r11
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.g1(androidx.fragment.app.Fragment, int):void");
    }

    public final void h(@m0 androidx.collection.b<Fragment> bVar) {
        int i10 = this.f2525q;
        if (i10 >= 1) {
            int min = Math.min(i10, 5);
            for (Fragment next : this.f2511c.o()) {
                if (next.O < min) {
                    g1(next, min);
                    if (next.f2461v0 != null && !next.f2453n0 && next.A0) {
                        bVar.add(next);
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean h0(boolean z10) {
        g0(z10);
        boolean z11 = false;
        while (v0(this.I, this.J)) {
            this.f2510b = true;
            try {
                A1(this.I, this.J);
                v();
                z11 = true;
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
        U1();
        a0();
        this.f2511c.b();
        return z11;
    }

    public void h1() {
        if (this.f2526r != null) {
            this.E = false;
            this.F = false;
            this.M.r(false);
            for (Fragment next : this.f2511c.o()) {
                if (next != null) {
                    next.V();
                }
            }
        }
    }

    public void i(a aVar) {
        if (this.f2512d == null) {
            this.f2512d = new ArrayList<>();
        }
        this.f2512d.add(aVar);
    }

    public void i0(@m0 p pVar, boolean z10) {
        if (!z10 || (this.f2526r != null && !this.G)) {
            g0(z10);
            if (pVar.a(this.I, this.J)) {
                this.f2510b = true;
                try {
                    A1(this.I, this.J);
                } finally {
                    v();
                }
            }
            U1();
            a0();
            this.f2511c.b();
        }
    }

    public void i1(@m0 FragmentContainerView fragmentContainerView) {
        View view;
        for (q next : this.f2511c.l()) {
            Fragment k10 = next.k();
            if (k10.f2451l0 == fragmentContainerView.getId() && (view = k10.f2461v0) != null && view.getParent() == null) {
                k10.f2460u0 = fragmentContainerView;
                next.b();
            }
        }
    }

    public void j(@m0 Fragment fragment, @m0 x0.c cVar) {
        if (this.f2521m.get(fragment) == null) {
            this.f2521m.put(fragment, new HashSet());
        }
        this.f2521m.get(fragment).add(cVar);
    }

    @x0({x0.a.Q})
    @Deprecated
    @m0
    public u j1() {
        return r();
    }

    public q k(@m0 Fragment fragment) {
        if (T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("add: ");
            sb2.append(fragment);
        }
        q A2 = A(fragment);
        fragment.f2446g0 = this;
        this.f2511c.q(A2);
        if (!fragment.f2454o0) {
            this.f2511c.a(fragment);
            fragment.f2440a0 = false;
            if (fragment.f2461v0 == null) {
                fragment.B0 = false;
            }
            if (U0(fragment)) {
                this.D = true;
            }
        }
        return A2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k0(@d.m0 java.util.ArrayList<androidx.fragment.app.a> r18, @d.m0 java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r15 = r18
            r5 = r19
            r4 = r20
            r3 = r21
            java.lang.Object r0 = r15.get(r4)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            boolean r2 = r0.f2705r
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            if (r0 != 0) goto L_0x001e
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.K = r0
            goto L_0x0021
        L_0x001e:
            r0.clear()
        L_0x0021:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            androidx.fragment.app.t r1 = r6.f2511c
            java.util.List r1 = r1.o()
            r0.addAll(r1)
            androidx.fragment.app.Fragment r0 = r17.L0()
            r1 = 0
            r16 = r1
            r7 = r4
        L_0x0034:
            r14 = 1
            if (r7 >= r3) goto L_0x0065
            java.lang.Object r8 = r15.get(r7)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.lang.Object r9 = r5.get(r7)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0050
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.W(r9, r0)
            goto L_0x0056
        L_0x0050:
            java.util.ArrayList<androidx.fragment.app.Fragment> r9 = r6.K
            androidx.fragment.app.Fragment r0 = r8.d0(r9, r0)
        L_0x0056:
            if (r16 != 0) goto L_0x0060
            boolean r8 = r8.f2696i
            if (r8 == 0) goto L_0x005d
            goto L_0x0060
        L_0x005d:
            r16 = r1
            goto L_0x0062
        L_0x0060:
            r16 = r14
        L_0x0062:
            int r7 = r7 + 1
            goto L_0x0034
        L_0x0065:
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r6.K
            r0.clear()
            if (r2 != 0) goto L_0x00bd
            int r0 = r6.f2525q
            if (r0 < r14) goto L_0x00bd
            boolean r0 = Q
            if (r0 == 0) goto L_0x00a4
            r0 = r4
        L_0x0075:
            if (r0 >= r3) goto L_0x00bd
            java.lang.Object r1 = r15.get(r0)
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            java.util.ArrayList<androidx.fragment.app.u$a> r1 = r1.f2690c
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00a1
            java.lang.Object r7 = r1.next()
            androidx.fragment.app.u$a r7 = (androidx.fragment.app.u.a) r7
            androidx.fragment.app.Fragment r7 = r7.f2708b
            if (r7 == 0) goto L_0x0083
            androidx.fragment.app.FragmentManager r8 = r7.f2446g0
            if (r8 == 0) goto L_0x0083
            androidx.fragment.app.q r7 = r6.A(r7)
            androidx.fragment.app.t r8 = r6.f2511c
            r8.q(r7)
            goto L_0x0083
        L_0x00a1:
            int r0 = r0 + 1
            goto L_0x0075
        L_0x00a4:
            androidx.fragment.app.g<?> r0 = r6.f2526r
            android.content.Context r7 = r0.f()
            androidx.fragment.app.d r8 = r6.f2527s
            r13 = 0
            androidx.fragment.app.v$g r0 = r6.f2522n
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r21
            r1 = r14
            r14 = r0
            androidx.fragment.app.v.C(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x00be
        L_0x00bd:
            r1 = r14
        L_0x00be:
            j0(r18, r19, r20, r21)
            boolean r0 = Q
            if (r0 == 0) goto L_0x0143
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = r4
        L_0x00d2:
            if (r2 >= r3) goto L_0x011c
            java.lang.Object r7 = r15.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            if (r0 == 0) goto L_0x00fb
            java.util.ArrayList<androidx.fragment.app.u$a> r8 = r7.f2690c
            int r8 = r8.size()
            int r8 = r8 - r1
        L_0x00e3:
            if (r8 < 0) goto L_0x0119
            java.util.ArrayList<androidx.fragment.app.u$a> r9 = r7.f2690c
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.u$a r9 = (androidx.fragment.app.u.a) r9
            androidx.fragment.app.Fragment r9 = r9.f2708b
            if (r9 == 0) goto L_0x00f8
            androidx.fragment.app.q r9 = r6.A(r9)
            r9.m()
        L_0x00f8:
            int r8 = r8 + -1
            goto L_0x00e3
        L_0x00fb:
            java.util.ArrayList<androidx.fragment.app.u$a> r7 = r7.f2690c
            java.util.Iterator r7 = r7.iterator()
        L_0x0101:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0119
            java.lang.Object r8 = r7.next()
            androidx.fragment.app.u$a r8 = (androidx.fragment.app.u.a) r8
            androidx.fragment.app.Fragment r8 = r8.f2708b
            if (r8 == 0) goto L_0x0101
            androidx.fragment.app.q r8 = r6.A(r8)
            r8.m()
            goto L_0x0101
        L_0x0119:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x011c:
            int r2 = r6.f2525q
            r6.e1(r2, r1)
            java.util.Set r1 = r6.x(r15, r4, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0129:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x013f
            java.lang.Object r2 = r1.next()
            androidx.fragment.app.a0 r2 = (androidx.fragment.app.a0) r2
            r2.r(r0)
            r2.p()
            r2.g()
            goto L_0x0129
        L_0x013f:
            r0 = r3
            r3 = r5
            goto L_0x0199
        L_0x0143:
            if (r2 == 0) goto L_0x0165
            androidx.collection.b r7 = new androidx.collection.b
            r7.<init>()
            r6.h(r7)
            r0 = r17
            r14 = r1
            r1 = r18
            r8 = r2
            r2 = r19
            r13 = r3
            r3 = r20
            r12 = r4
            r4 = r21
            r11 = r5
            r5 = r7
            int r0 = r0.t1(r1, r2, r3, r4, r5)
            r6.c1(r7)
            goto L_0x016b
        L_0x0165:
            r14 = r1
            r8 = r2
            r13 = r3
            r12 = r4
            r11 = r5
            r0 = r13
        L_0x016b:
            if (r0 == r12) goto L_0x0197
            if (r8 == 0) goto L_0x0197
            int r1 = r6.f2525q
            if (r1 < r14) goto L_0x018e
            androidx.fragment.app.g<?> r1 = r6.f2526r
            android.content.Context r7 = r1.f()
            androidx.fragment.app.d r8 = r6.f2527s
            r1 = 1
            androidx.fragment.app.v$g r2 = r6.f2522n
            r9 = r18
            r10 = r19
            r3 = r11
            r11 = r20
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r2
            androidx.fragment.app.v.C(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0191
        L_0x018e:
            r3 = r11
            r0 = r13
            r1 = r14
        L_0x0191:
            int r2 = r6.f2525q
            r6.e1(r2, r1)
            goto L_0x0199
        L_0x0197:
            r3 = r11
            r0 = r13
        L_0x0199:
            r1 = r20
        L_0x019b:
            if (r1 >= r0) goto L_0x01bc
            java.lang.Object r2 = r15.get(r1)
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            java.lang.Object r4 = r3.get(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x01b6
            int r4 = r2.N
            if (r4 < 0) goto L_0x01b6
            r4 = -1
            r2.N = r4
        L_0x01b6:
            r2.b0()
            int r1 = r1 + 1
            goto L_0x019b
        L_0x01bc:
            if (r16 == 0) goto L_0x01c1
            r17.C1()
        L_0x01c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.k0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public void k1(@m0 q qVar) {
        Fragment k10 = qVar.k();
        if (!k10.f2462w0) {
            return;
        }
        if (this.f2510b) {
            this.H = true;
            return;
        }
        k10.f2462w0 = false;
        if (Q) {
            qVar.m();
        } else {
            f1(k10);
        }
    }

    public void l(@m0 m mVar) {
        this.f2524p.add(mVar);
    }

    public boolean l0() {
        boolean h02 = h0(true);
        u0();
        return h02;
    }

    public void l1() {
        f0(new q((String) null, -1, 0), false);
    }

    public void m(@m0 o oVar) {
        if (this.f2520l == null) {
            this.f2520l = new ArrayList<>();
        }
        this.f2520l.add(oVar);
    }

    public final void m0(@o0 ArrayList<a> arrayList, @o0 ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<r> arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i10 = 0;
        while (i10 < size) {
            r rVar = this.L.get(i10);
            if (arrayList == null || rVar.f2553a || (indexOf2 = arrayList.indexOf(rVar.f2554b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if (rVar.e() || (arrayList != null && rVar.f2554b.Y(arrayList, 0, arrayList.size()))) {
                    this.L.remove(i10);
                    i10--;
                    size--;
                    if (arrayList == null || rVar.f2553a || (indexOf = arrayList.indexOf(rVar.f2554b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        rVar.d();
                    }
                }
                i10++;
            } else {
                this.L.remove(i10);
                i10--;
                size--;
            }
            rVar.c();
            i10++;
        }
    }

    public void m1(int i10, int i11) {
        if (i10 >= 0) {
            f0(new q((String) null, i10, i11), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void n(@m0 Fragment fragment) {
        this.M.g(fragment);
    }

    @o0
    public Fragment n0(@m0 String str) {
        return this.f2511c.f(str);
    }

    public void n1(@o0 String str, int i10) {
        f0(new q(str, -1, i10), false);
    }

    public int o() {
        return this.f2517i.getAndIncrement();
    }

    public boolean o1() {
        return r1((String) null, -1, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void p(@d.m0 androidx.fragment.app.g<?> r3, @d.m0 androidx.fragment.app.d r4, @d.o0 androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.g<?> r0 = r2.f2526r
            if (r0 != 0) goto L_0x0103
            r2.f2526r = r3
            r2.f2527s = r4
            r2.f2528t = r5
            if (r5 == 0) goto L_0x0015
            androidx.fragment.app.FragmentManager$i r4 = new androidx.fragment.app.FragmentManager$i
            r4.<init>(r5)
        L_0x0011:
            r2.l(r4)
            goto L_0x001d
        L_0x0015:
            boolean r4 = r3 instanceof androidx.fragment.app.m
            if (r4 == 0) goto L_0x001d
            r4 = r3
            androidx.fragment.app.m r4 = (androidx.fragment.app.m) r4
            goto L_0x0011
        L_0x001d:
            androidx.fragment.app.Fragment r4 = r2.f2528t
            if (r4 == 0) goto L_0x0024
            r2.U1()
        L_0x0024:
            boolean r4 = r3 instanceof androidx.activity.c
            if (r4 == 0) goto L_0x0039
            r4 = r3
            androidx.activity.c r4 = (androidx.activity.c) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.h()
            r2.f2515g = r0
            if (r5 == 0) goto L_0x0034
            r4 = r5
        L_0x0034:
            androidx.activity.b r1 = r2.f2516h
            r0.b(r4, r1)
        L_0x0039:
            if (r5 == 0) goto L_0x0044
            androidx.fragment.app.FragmentManager r3 = r5.f2446g0
            androidx.fragment.app.l r3 = r3.A0(r5)
        L_0x0041:
            r2.M = r3
            goto L_0x005a
        L_0x0044:
            boolean r4 = r3 instanceof androidx.lifecycle.b1
            if (r4 == 0) goto L_0x0053
            androidx.lifecycle.b1 r3 = (androidx.lifecycle.b1) r3
            androidx.lifecycle.a1 r3 = r3.getViewModelStore()
            androidx.fragment.app.l r3 = androidx.fragment.app.l.k(r3)
            goto L_0x0041
        L_0x0053:
            androidx.fragment.app.l r3 = new androidx.fragment.app.l
            r4 = 0
            r3.<init>(r4)
            goto L_0x0041
        L_0x005a:
            androidx.fragment.app.l r3 = r2.M
            boolean r4 = r2.Y0()
            r3.r(r4)
            androidx.fragment.app.t r3 = r2.f2511c
            androidx.fragment.app.l r4 = r2.M
            r3.y(r4)
            androidx.fragment.app.g<?> r3 = r2.f2526r
            boolean r4 = r3 instanceof androidx.activity.result.d
            if (r4 == 0) goto L_0x0102
            androidx.activity.result.d r3 = (androidx.activity.result.d) r3
            androidx.activity.result.ActivityResultRegistry r3 = r3.u()
            if (r5 == 0) goto L_0x008c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r5.T
            r4.append(r5)
            java.lang.String r5 = ":"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x008e
        L_0x008c:
            java.lang.String r4 = ""
        L_0x008e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "FragmentManager:"
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartActivityForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            c.b$j r0 = new c.b$j
            r0.<init>()
            androidx.fragment.app.FragmentManager$j r1 = new androidx.fragment.app.FragmentManager$j
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.f2534z = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r0 = "StartIntentSenderForResult"
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            androidx.fragment.app.FragmentManager$l r0 = new androidx.fragment.app.FragmentManager$l
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            androidx.activity.result.c r5 = r3.j(r5, r0, r1)
            r2.A = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "RequestPermissions"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            c.b$h r5 = new c.b$h
            r5.<init>()
            androidx.fragment.app.FragmentManager$b r0 = new androidx.fragment.app.FragmentManager$b
            r0.<init>()
            androidx.activity.result.c r3 = r3.j(r4, r5, r0)
            r2.B = r3
        L_0x0102:
            return
        L_0x0103:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.p(androidx.fragment.app.g, androidx.fragment.app.d, androidx.fragment.app.Fragment):void");
    }

    @o0
    public Fragment p0(@b0 int i10) {
        return this.f2511c.g(i10);
    }

    public boolean p1(int i10, int i11) {
        if (i10 >= 0) {
            return r1((String) null, i10, i11);
        }
        throw new IllegalArgumentException("Bad id: " + i10);
    }

    public void q(@m0 Fragment fragment) {
        if (T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("attach: ");
            sb2.append(fragment);
        }
        if (fragment.f2454o0) {
            fragment.f2454o0 = false;
            if (!fragment.Z) {
                this.f2511c.a(fragment);
                if (T0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("add from attach: ");
                    sb3.append(fragment);
                }
                if (U0(fragment)) {
                    this.D = true;
                }
            }
        }
    }

    @o0
    public Fragment q0(@o0 String str) {
        return this.f2511c.h(str);
    }

    public boolean q1(@o0 String str, int i10) {
        return r1(str, -1, i10);
    }

    @m0
    public u r() {
        return new a(this);
    }

    public Fragment r0(@m0 String str) {
        return this.f2511c.i(str);
    }

    public final boolean r1(@o0 String str, int i10, int i11) {
        h0(false);
        g0(true);
        Fragment fragment = this.f2529u;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().o1()) {
            return true;
        }
        boolean s12 = s1(this.I, this.J, str, i10, i11);
        if (s12) {
            this.f2510b = true;
            try {
                A1(this.I, this.J);
            } finally {
                v();
            }
        }
        U1();
        a0();
        this.f2511c.b();
        return s12;
    }

    public final void s(@m0 Fragment fragment) {
        HashSet hashSet = this.f2521m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((x0.c) it.next()).a();
            }
            hashSet.clear();
            B(fragment);
            this.f2521m.remove(fragment);
        }
    }

    public boolean s1(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2, @o0 String str, int i10, int i11) {
        int i12;
        ArrayList<a> arrayList3 = this.f2512d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i10 < 0 && (i11 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2512d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i10 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f2512d.get(size2);
                    if ((str != null && str.equals(aVar.getName())) || (i10 >= 0 && i10 == aVar.N)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i11 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f2512d.get(size2);
                        if ((str == null || !str.equals(aVar2.getName())) && (i10 < 0 || i10 != aVar2.N)) {
                            break;
                        }
                    }
                }
                i12 = size2;
            } else {
                i12 = -1;
            }
            if (i12 == this.f2512d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2512d.size() - 1; size3 > i12; size3--) {
                arrayList.add(this.f2512d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public boolean t() {
        boolean z10 = false;
        for (Fragment next : this.f2511c.m()) {
            if (next != null) {
                z10 = U0(next);
                continue;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final int t1(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2, int i10, int i11, @m0 androidx.collection.b<Fragment> bVar) {
        int i12 = i11;
        for (int i13 = i11 - 1; i13 >= i10; i13--) {
            a aVar = arrayList.get(i13);
            boolean booleanValue = arrayList2.get(i13).booleanValue();
            if (aVar.a0() && !aVar.Y(arrayList, i13 + 1, i11)) {
                if (this.L == null) {
                    this.L = new ArrayList<>();
                }
                r rVar = new r(aVar, booleanValue);
                this.L.add(rVar);
                aVar.c0(rVar);
                if (booleanValue) {
                    aVar.U();
                } else {
                    aVar.V(false);
                }
                i12--;
                if (i13 != i12) {
                    arrayList.remove(i13);
                    arrayList.add(i12, aVar);
                }
                h(bVar);
            }
        }
        return i12;
    }

    @m0
    public String toString() {
        Object obj;
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Fragment fragment = this.f2528t;
        if (fragment != null) {
            sb2.append(fragment.getClass().getSimpleName());
            sb2.append(p7.a.f11638i);
            obj = this.f2528t;
        } else {
            g<?> gVar = this.f2526r;
            if (gVar != null) {
                sb2.append(gVar.getClass().getSimpleName());
                sb2.append(p7.a.f11638i);
                obj = this.f2526r;
            } else {
                sb2.append("null");
                sb2.append("}}");
                return sb2.toString();
            }
        }
        sb2.append(Integer.toHexString(System.identityHashCode(obj)));
        sb2.append(p7.a.f11639j);
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u() {
        if (Y0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void u0() {
        if (Q) {
            for (a0 k10 : w()) {
                k10.k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                this.L.remove(0).d();
            }
        }
    }

    public void u1(@m0 Bundle bundle, @m0 String str, @m0 Fragment fragment) {
        if (fragment.f2446g0 != this) {
            S1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.T);
    }

    public final void v() {
        this.f2510b = false;
        this.J.clear();
        this.I.clear();
    }

    public final boolean v0(@m0 ArrayList<a> arrayList, @m0 ArrayList<Boolean> arrayList2) {
        synchronized (this.f2509a) {
            if (this.f2509a.isEmpty()) {
                return false;
            }
            int size = this.f2509a.size();
            boolean z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= this.f2509a.get(i10).a(arrayList, arrayList2);
            }
            this.f2509a.clear();
            this.f2526r.g().removeCallbacks(this.N);
            return z10;
        }
    }

    public void v1(@m0 m mVar, boolean z10) {
        this.f2523o.o(mVar, z10);
    }

    public final Set<a0> w() {
        HashSet hashSet = new HashSet();
        for (q k10 : this.f2511c.l()) {
            ViewGroup viewGroup = k10.k().f2460u0;
            if (viewGroup != null) {
                hashSet.add(a0.o(viewGroup, M0()));
            }
        }
        return hashSet;
    }

    public int w0() {
        return this.f2511c.k();
    }

    public void w1(@m0 Fragment fragment, @m0 x0.c cVar) {
        HashSet hashSet = this.f2521m.get(fragment);
        if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
            this.f2521m.remove(fragment);
            if (fragment.O < 5) {
                B(fragment);
                f1(fragment);
            }
        }
    }

    public final Set<a0> x(@m0 ArrayList<a> arrayList, int i10, int i11) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i10 < i11) {
            Iterator<u.a> it = arrayList.get(i10).f2690c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f2708b;
                if (!(fragment == null || (viewGroup = fragment.f2460u0) == null)) {
                    hashSet.add(a0.n(viewGroup, this));
                }
            }
            i10++;
        }
        return hashSet;
    }

    @m0
    public List<Fragment> x0() {
        return this.f2511c.m();
    }

    public void x1(@m0 Fragment fragment) {
        if (T0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("remove: ");
            sb2.append(fragment);
            sb2.append(" nesting=");
            sb2.append(fragment.f2445f0);
        }
        boolean z10 = !fragment.S();
        if (!fragment.f2454o0 || z10) {
            this.f2511c.t(fragment);
            if (U0(fragment)) {
                this.D = true;
            }
            fragment.f2440a0 = true;
            P1(fragment);
        }
    }

    public void y(@m0 a aVar, boolean z10, boolean z11, boolean z12) {
        if (z10) {
            aVar.V(z12);
        } else {
            aVar.U();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z10));
        if (z11 && this.f2525q >= 1) {
            v.C(this.f2526r.f(), this.f2527s, arrayList, arrayList2, 0, 1, true, this.f2522n);
        }
        if (z12) {
            e1(this.f2525q, true);
        }
        for (Fragment next : this.f2511c.m()) {
            if (next != null && next.f2461v0 != null && next.A0 && aVar.X(next.f2451l0)) {
                float f10 = next.C0;
                if (f10 > 0.0f) {
                    next.f2461v0.setAlpha(f10);
                }
                if (z12) {
                    next.C0 = 0.0f;
                } else {
                    next.C0 = -1.0f;
                    next.A0 = false;
                }
            }
        }
    }

    @m0
    public k y0(int i10) {
        return this.f2512d.get(i10);
    }

    public void y1(@m0 m mVar) {
        this.f2524p.remove(mVar);
    }

    public final void z(@m0 Fragment fragment) {
        Animator animator;
        if (fragment.f2461v0 != null) {
            c.d c10 = c.c(this.f2526r.f(), fragment, !fragment.f2453n0, fragment.J());
            if (c10 == null || (animator = c10.f2626b) == null) {
                if (c10 != null) {
                    fragment.f2461v0.startAnimation(c10.f2625a);
                    c10.f2625a.start();
                }
                fragment.f2461v0.setVisibility((!fragment.f2453n0 || fragment.R()) ? 0 : 8);
                if (fragment.R()) {
                    fragment.D0(false);
                }
            } else {
                animator.setTarget(fragment.f2461v0);
                if (!fragment.f2453n0) {
                    fragment.f2461v0.setVisibility(0);
                } else if (fragment.R()) {
                    fragment.D0(false);
                } else {
                    ViewGroup viewGroup = fragment.f2460u0;
                    View view = fragment.f2461v0;
                    viewGroup.startViewTransition(view);
                    c10.f2626b.addListener(new h(viewGroup, view, fragment));
                }
                c10.f2626b.start();
            }
        }
        R0(fragment);
        fragment.B0 = false;
        fragment.onHiddenChanged(fragment.f2453n0);
    }

    public int z0() {
        ArrayList<a> arrayList = this.f2512d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void z1(@m0 o oVar) {
        ArrayList<o> arrayList = this.f2520l;
        if (arrayList != null) {
            arrayList.remove(oVar);
        }
    }
}
