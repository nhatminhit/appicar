package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.l;
import d.g1;
import d.m0;
import d.o0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m4.m;

@Deprecated
public class RequestManagerFragment extends Fragment {
    public static final String U = "RMFragment";
    public final m4.a O;
    public final m P;
    public final Set<RequestManagerFragment> Q;
    @o0
    public l R;
    @o0
    public RequestManagerFragment S;
    @o0
    public Fragment T;

    public class a implements m {
        public a() {
        }

        @m0
        public Set<l> a() {
            Set<RequestManagerFragment> b10 = RequestManagerFragment.this.b();
            HashSet hashSet = new HashSet(b10.size());
            for (RequestManagerFragment next : b10) {
                if (next.e() != null) {
                    hashSet.add(next.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + p7.a.f11639j;
        }
    }

    public RequestManagerFragment() {
        this(new m4.a());
    }

    @SuppressLint({"ValidFragment"})
    @g1
    public RequestManagerFragment(@m0 m4.a aVar) {
        this.P = new a();
        this.Q = new HashSet();
        this.O = aVar;
    }

    public final void a(RequestManagerFragment requestManagerFragment) {
        this.Q.add(requestManagerFragment);
    }

    @TargetApi(17)
    @m0
    public Set<RequestManagerFragment> b() {
        if (equals(this.S)) {
            return Collections.unmodifiableSet(this.Q);
        }
        if (this.S == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (RequestManagerFragment next : this.S.b()) {
            if (g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @m0
    public m4.a c() {
        return this.O;
    }

    @o0
    @TargetApi(17)
    public final Fragment d() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.T;
    }

    @o0
    public l e() {
        return this.R;
    }

    @m0
    public m f() {
        return this.P;
    }

    @TargetApi(17)
    public final boolean g(@m0 Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public final void h(@m0 Activity activity) {
        l();
        RequestManagerFragment p10 = b.d(activity).n().p(activity);
        this.S = p10;
        if (!equals(p10)) {
            this.S.a(this);
        }
    }

    public final void i(RequestManagerFragment requestManagerFragment) {
        this.Q.remove(requestManagerFragment);
    }

    public void j(@o0 Fragment fragment) {
        this.T = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            h(fragment.getActivity());
        }
    }

    public void k(@o0 l lVar) {
        this.R = lVar;
    }

    public final void l() {
        RequestManagerFragment requestManagerFragment = this.S;
        if (requestManagerFragment != null) {
            requestManagerFragment.i(this);
            this.S = null;
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable(U, 5);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.O.c();
        l();
    }

    public void onDetach() {
        super.onDetach();
        l();
    }

    public void onStart() {
        super.onStart();
        this.O.d();
    }

    public void onStop() {
        super.onStop();
        this.O.e();
    }

    public String toString() {
        return super.toString() + "{parent=" + d() + p7.a.f11639j;
    }
}
