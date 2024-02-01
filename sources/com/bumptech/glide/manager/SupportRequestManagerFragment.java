package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.b;
import com.bumptech.glide.l;
import d.g1;
import d.m0;
import d.o0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import m4.m;

public class SupportRequestManagerFragment extends Fragment {

    /* renamed from: e1  reason: collision with root package name */
    public static final String f5002e1 = "SupportRMFragment";
    public final m4.a Y0;
    public final m Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final Set<SupportRequestManagerFragment> f5003a1;
    @o0

    /* renamed from: b1  reason: collision with root package name */
    public SupportRequestManagerFragment f5004b1;
    @o0

    /* renamed from: c1  reason: collision with root package name */
    public l f5005c1;
    @o0

    /* renamed from: d1  reason: collision with root package name */
    public Fragment f5006d1;

    public class a implements m {
        public a() {
        }

        @m0
        public Set<l> a() {
            Set<SupportRequestManagerFragment> K0 = SupportRequestManagerFragment.this.K0();
            HashSet hashSet = new HashSet(K0.size());
            for (SupportRequestManagerFragment next : K0) {
                if (next.N0() != null) {
                    hashSet.add(next.N0());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + SupportRequestManagerFragment.this + p7.a.f11639j;
        }
    }

    public SupportRequestManagerFragment() {
        this(new m4.a());
    }

    @SuppressLint({"ValidFragment"})
    @g1
    public SupportRequestManagerFragment(@m0 m4.a aVar) {
        this.Z0 = new a();
        this.f5003a1 = new HashSet();
        this.Y0 = aVar;
    }

    @o0
    public static FragmentManager P0(@m0 Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    public final void J0(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f5003a1.add(supportRequestManagerFragment);
    }

    @m0
    public Set<SupportRequestManagerFragment> K0() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f5004b1;
        if (supportRequestManagerFragment == null) {
            return Collections.emptySet();
        }
        if (equals(supportRequestManagerFragment)) {
            return Collections.unmodifiableSet(this.f5003a1);
        }
        HashSet hashSet = new HashSet();
        for (SupportRequestManagerFragment next : this.f5004b1.K0()) {
            if (Q0(next.M0())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @m0
    public m4.a L0() {
        return this.Y0;
    }

    @o0
    public final Fragment M0() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f5006d1;
    }

    @o0
    public l N0() {
        return this.f5005c1;
    }

    @m0
    public m O0() {
        return this.Z0;
    }

    public final boolean Q0(@m0 Fragment fragment) {
        Fragment M0 = M0();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(M0)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    public final void R0(@m0 Context context, @m0 FragmentManager fragmentManager) {
        V0();
        SupportRequestManagerFragment r10 = b.d(context).n().r(context, fragmentManager);
        this.f5004b1 = r10;
        if (!equals(r10)) {
            this.f5004b1.J0(this);
        }
    }

    public final void S0(SupportRequestManagerFragment supportRequestManagerFragment) {
        this.f5003a1.remove(supportRequestManagerFragment);
    }

    public void T0(@o0 Fragment fragment) {
        FragmentManager P0;
        this.f5006d1 = fragment;
        if (fragment != null && fragment.getContext() != null && (P0 = P0(fragment)) != null) {
            R0(fragment.getContext(), P0);
        }
    }

    public void U0(@o0 l lVar) {
        this.f5005c1 = lVar;
    }

    public final void V0() {
        SupportRequestManagerFragment supportRequestManagerFragment = this.f5004b1;
        if (supportRequestManagerFragment != null) {
            supportRequestManagerFragment.S0(this);
            this.f5004b1 = null;
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager P0 = P0(this);
        if (P0 == null) {
            Log.isLoggable(f5002e1, 5);
            return;
        }
        try {
            R0(getContext(), P0);
        } catch (IllegalStateException unused) {
            Log.isLoggable(f5002e1, 5);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.Y0.c();
        V0();
    }

    public void onDetach() {
        super.onDetach();
        this.f5006d1 = null;
        V0();
    }

    public void onStart() {
        super.onStart();
        this.Y0.d();
    }

    public void onStop() {
        super.onStop();
        this.Y0.e();
    }

    public String toString() {
        return super.toString() + "{parent=" + M0() + p7.a.f11639j;
    }
}
