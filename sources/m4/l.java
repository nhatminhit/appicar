package m4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.manager.RequestManagerFragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import d.g1;
import d.m0;
import d.o0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import t4.k;
import t4.m;

public class l implements Handler.Callback {
    @g1
    public static final String W = "com.bumptech.glide.manager";
    public static final String X = "RMRetriever";
    public static final int Y = 1;
    public static final int Z = 2;

    /* renamed from: a0  reason: collision with root package name */
    public static final String f10351a0 = "key";

    /* renamed from: b0  reason: collision with root package name */
    public static final b f10352b0 = new a();
    public volatile com.bumptech.glide.l O;
    @g1
    public final Map<FragmentManager, RequestManagerFragment> P = new HashMap();
    @g1
    public final Map<androidx.fragment.app.FragmentManager, SupportRequestManagerFragment> Q = new HashMap();
    public final Handler R;
    public final b S;
    public final androidx.collection.a<View, Fragment> T = new androidx.collection.a<>();
    public final androidx.collection.a<View, android.app.Fragment> U = new androidx.collection.a<>();
    public final Bundle V = new Bundle();

    public class a implements b {
        @m0
        public com.bumptech.glide.l a(@m0 com.bumptech.glide.b bVar, @m0 h hVar, @m0 m mVar, @m0 Context context) {
            return new com.bumptech.glide.l(bVar, hVar, mVar, context);
        }
    }

    public interface b {
        @m0
        com.bumptech.glide.l a(@m0 com.bumptech.glide.b bVar, @m0 h hVar, @m0 m mVar, @m0 Context context);
    }

    public l(@o0 b bVar) {
        this.S = bVar == null ? f10352b0 : bVar;
        this.R = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    public static void a(@m0 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @o0
    public static Activity b(@m0 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void e(@o0 Collection<Fragment> collection, @m0 Map<View, Fragment> map) {
        if (collection != null) {
            for (Fragment next : collection) {
                if (!(next == null || next.getView() == null)) {
                    map.put(next.getView(), next);
                    e(next.getChildFragmentManager().G0(), map);
                }
            }
        }
    }

    public static boolean t(Context context) {
        Activity b10 = b(context);
        return b10 == null || !b10.isFinishing();
    }

    @TargetApi(26)
    @Deprecated
    public final void c(@m0 FragmentManager fragmentManager, @m0 androidx.collection.a<View, android.app.Fragment> aVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    c(fragment.getChildFragmentManager(), aVar);
                }
            }
            return;
        }
        d(fragmentManager, aVar);
    }

    @Deprecated
    public final void d(@m0 FragmentManager fragmentManager, @m0 androidx.collection.a<View, android.app.Fragment> aVar) {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            this.V.putInt("key", i10);
            android.app.Fragment fragment = null;
            try {
                fragment = fragmentManager.getFragment(this.V, "key");
            } catch (Exception unused) {
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    aVar.put(fragment.getView(), fragment);
                    c(fragment.getChildFragmentManager(), aVar);
                }
                i10 = i11;
            } else {
                return;
            }
        }
    }

    @o0
    @Deprecated
    public final android.app.Fragment f(@m0 View view, @m0 Activity activity) {
        this.U.clear();
        c(activity.getFragmentManager(), this.U);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.U.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.U.clear();
        return fragment;
    }

    @o0
    public final Fragment g(@m0 View view, @m0 FragmentActivity fragmentActivity) {
        this.T.clear();
        e(fragmentActivity.X().G0(), this.T);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.T.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.T.clear();
        return fragment;
    }

    @Deprecated
    @m0
    public final com.bumptech.glide.l h(@m0 Context context, @m0 FragmentManager fragmentManager, @o0 android.app.Fragment fragment, boolean z10) {
        RequestManagerFragment q10 = q(fragmentManager, fragment, z10);
        com.bumptech.glide.l e10 = q10.e();
        if (e10 != null) {
            return e10;
        }
        com.bumptech.glide.l a10 = this.S.a(com.bumptech.glide.b.d(context), q10.c(), q10.f(), context);
        q10.k(a10);
        return a10;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i10 = message.what;
        Object obj3 = null;
        boolean z10 = true;
        if (i10 == 1) {
            obj2 = (FragmentManager) message.obj;
            map = this.P;
        } else if (i10 != 2) {
            z10 = false;
            obj = null;
            if (z10 && obj3 == null && Log.isLoggable(X, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to remove expected request manager fragment, manager: ");
                sb2.append(obj);
            }
            return z10;
        } else {
            obj2 = (androidx.fragment.app.FragmentManager) message.obj;
            map = this.Q;
        }
        Object obj4 = obj2;
        obj3 = map.remove(obj2);
        obj = obj4;
        StringBuilder sb22 = new StringBuilder();
        sb22.append("Failed to remove expected request manager fragment, manager: ");
        sb22.append(obj);
        return z10;
    }

    @m0
    public com.bumptech.glide.l i(@m0 Activity activity) {
        if (m.s()) {
            return k(activity.getApplicationContext());
        }
        a(activity);
        return h(activity, activity.getFragmentManager(), (android.app.Fragment) null, t(activity));
    }

    @TargetApi(17)
    @Deprecated
    @m0
    public com.bumptech.glide.l j(@m0 android.app.Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (m.s()) {
            return k(fragment.getActivity().getApplicationContext());
        } else {
            return h(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    @m0
    public com.bumptech.glide.l k(@m0 Context context) {
        if (context != null) {
            if (m.t() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return n((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return i((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return k(contextWrapper.getBaseContext());
                    }
                }
            }
            return o(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @m0
    public com.bumptech.glide.l l(@m0 View view) {
        if (!m.s()) {
            k.d(view);
            k.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
            Activity b10 = b(view.getContext());
            if (b10 != null) {
                if (b10 instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) b10;
                    Fragment g10 = g(view, fragmentActivity);
                    return g10 != null ? m(g10) : n(fragmentActivity);
                }
                android.app.Fragment f10 = f(view, b10);
                return f10 == null ? i(b10) : j(f10);
            }
        }
        return k(view.getContext().getApplicationContext());
    }

    @m0
    public com.bumptech.glide.l m(@m0 Fragment fragment) {
        k.e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (m.s()) {
            return k(fragment.getContext().getApplicationContext());
        }
        return u(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
    }

    @m0
    public com.bumptech.glide.l n(@m0 FragmentActivity fragmentActivity) {
        if (m.s()) {
            return k(fragmentActivity.getApplicationContext());
        }
        a(fragmentActivity);
        return u(fragmentActivity, fragmentActivity.X(), (Fragment) null, t(fragmentActivity));
    }

    @m0
    public final com.bumptech.glide.l o(@m0 Context context) {
        if (this.O == null) {
            synchronized (this) {
                if (this.O == null) {
                    this.O = this.S.a(com.bumptech.glide.b.d(context.getApplicationContext()), new b(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.O;
    }

    @Deprecated
    @m0
    public RequestManagerFragment p(Activity activity) {
        return q(activity.getFragmentManager(), (android.app.Fragment) null, t(activity));
    }

    @m0
    public final RequestManagerFragment q(@m0 FragmentManager fragmentManager, @o0 android.app.Fragment fragment, boolean z10) {
        RequestManagerFragment requestManagerFragment = (RequestManagerFragment) fragmentManager.findFragmentByTag(W);
        if (requestManagerFragment == null && (requestManagerFragment = this.P.get(fragmentManager)) == null) {
            requestManagerFragment = new RequestManagerFragment();
            requestManagerFragment.j(fragment);
            if (z10) {
                requestManagerFragment.c().d();
            }
            this.P.put(fragmentManager, requestManagerFragment);
            fragmentManager.beginTransaction().add(requestManagerFragment, W).commitAllowingStateLoss();
            this.R.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return requestManagerFragment;
    }

    @m0
    public SupportRequestManagerFragment r(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return s(fragmentManager, (Fragment) null, t(context));
    }

    @m0
    public final SupportRequestManagerFragment s(@m0 androidx.fragment.app.FragmentManager fragmentManager, @o0 Fragment fragment, boolean z10) {
        SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) fragmentManager.q0(W);
        if (supportRequestManagerFragment == null && (supportRequestManagerFragment = this.Q.get(fragmentManager)) == null) {
            supportRequestManagerFragment = new SupportRequestManagerFragment();
            supportRequestManagerFragment.T0(fragment);
            if (z10) {
                supportRequestManagerFragment.L0().d();
            }
            this.Q.put(fragmentManager, supportRequestManagerFragment);
            fragmentManager.r().g(supportRequestManagerFragment, W).n();
            this.R.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return supportRequestManagerFragment;
    }

    @m0
    public final com.bumptech.glide.l u(@m0 Context context, @m0 androidx.fragment.app.FragmentManager fragmentManager, @o0 Fragment fragment, boolean z10) {
        SupportRequestManagerFragment s10 = s(fragmentManager, fragment, z10);
        com.bumptech.glide.l N0 = s10.N0();
        if (N0 != null) {
            return N0;
        }
        com.bumptech.glide.l a10 = this.S.a(com.bumptech.glide.b.d(context), s10.L0(), s10.O0(), context);
        s10.U0(a10);
        return a10;
    }
}
