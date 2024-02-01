package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.a;
import com.google.android.gms.internal.common.t;
import d.m0;
import d.o0;
import g8.c3;
import g8.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzb extends Fragment implements h {
    public static final WeakHashMap R = new WeakHashMap();
    public final Map O = Collections.synchronizedMap(new a());
    public int P = 0;
    @o0
    public Bundle Q;

    public static zzb c(Activity activity) {
        zzb zzb;
        WeakHashMap weakHashMap = R;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (zzb = (zzb) weakReference.get()) != null) {
            return zzb;
        }
        try {
            zzb zzb2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzb2 == null || zzb2.isRemoving()) {
                zzb2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzb2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzb2));
            return zzb2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    public final void dump(String str, @o0 FileDescriptor fileDescriptor, PrintWriter printWriter, @o0 String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a10 : this.O.values()) {
            a10.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean f() {
        return this.P > 0;
    }

    public final void i(String str, @m0 LifecycleCallback lifecycleCallback) {
        if (!this.O.containsKey(str)) {
            this.O.put(str, lifecycleCallback);
            if (this.P > 0) {
                new t(Looper.getMainLooper()).post(new c3(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
    }

    @o0
    public final <T extends LifecycleCallback> T o(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.O.get(str));
    }

    public final void onActivityResult(int i10, int i11, @o0 Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback f10 : this.O.values()) {
            f10.f(i10, i11, intent);
        }
    }

    public final void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        this.P = 1;
        this.Q = bundle;
        for (Map.Entry entry : this.O.entrySet()) {
            ((LifecycleCallback) entry.getValue()).g(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.P = 5;
        for (LifecycleCallback h10 : this.O.values()) {
            h10.h();
        }
    }

    public final void onResume() {
        super.onResume();
        this.P = 3;
        for (LifecycleCallback i10 : this.O.values()) {
            i10.i();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.O.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).j(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.P = 2;
        for (LifecycleCallback k10 : this.O.values()) {
            k10.k();
        }
    }

    public final void onStop() {
        super.onStop();
        this.P = 4;
        for (LifecycleCallback l10 : this.O.values()) {
            l10.l();
        }
    }

    @o0
    public final Activity p() {
        return getActivity();
    }

    public final boolean s() {
        return this.P >= 2;
    }
}
