package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.internal.common.t;
import d.m0;
import d.o0;
import g8.d3;
import g8.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzd extends Fragment implements h {

    /* renamed from: b1  reason: collision with root package name */
    public static final WeakHashMap f5742b1 = new WeakHashMap();
    public final Map Y0 = Collections.synchronizedMap(new a());
    public int Z0 = 0;
    @o0

    /* renamed from: a1  reason: collision with root package name */
    public Bundle f5743a1;

    public static zzd L0(FragmentActivity fragmentActivity) {
        zzd zzd;
        WeakHashMap weakHashMap = f5742b1;
        WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
        if (weakReference != null && (zzd = (zzd) weakReference.get()) != null) {
            return zzd;
        }
        try {
            zzd zzd2 = (zzd) fragmentActivity.X().q0("SupportLifecycleFragmentImpl");
            if (zzd2 == null || zzd2.isRemoving()) {
                zzd2 = new zzd();
                fragmentActivity.X().r().g(zzd2, "SupportLifecycleFragmentImpl").n();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(zzd2));
            return zzd2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public final void dump(String str, @o0 FileDescriptor fileDescriptor, PrintWriter printWriter, @o0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a10 : this.Y0.values()) {
            a10.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean f() {
        return this.Z0 > 0;
    }

    public final void i(String str, @m0 LifecycleCallback lifecycleCallback) {
        if (!this.Y0.containsKey(str)) {
            this.Y0.put(str, lifecycleCallback);
            if (this.Z0 > 0) {
                new t(Looper.getMainLooper()).post(new d3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @o0
    public final <T extends LifecycleCallback> T o(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.Y0.get(str));
    }

    public final void onActivityResult(int i10, int i11, @o0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback f10 : this.Y0.values()) {
            f10.f(i10, i11, intent);
        }
    }

    public final void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.Z0 = 1;
        this.f5743a1 = bundle;
        for (Map.Entry entry : this.Y0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).g(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.Z0 = 5;
        for (LifecycleCallback h10 : this.Y0.values()) {
            h10.h();
        }
    }

    public final void onResume() {
        super.onResume();
        this.Z0 = 3;
        for (LifecycleCallback i10 : this.Y0.values()) {
            i10.i();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.Y0.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).j(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.Z0 = 2;
        for (LifecycleCallback k10 : this.Y0.values()) {
            k10.k();
        }
    }

    public final void onStop() {
        super.onStop();
        this.Z0 = 4;
        for (LifecycleCallback l10 : this.Y0.values()) {
            l10.l();
        }
    }

    @o0
    public final /* synthetic */ Activity p() {
        return getActivity();
    }

    public final boolean s() {
        return this.Z0 >= 2;
    }
}
