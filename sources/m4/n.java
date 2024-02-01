package m4;

import android.util.Log;
import d.g1;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p4.d;
import p7.a;
import t4.m;

public class n {

    /* renamed from: d  reason: collision with root package name */
    public static final String f10353d = "RequestTracker";

    /* renamed from: a  reason: collision with root package name */
    public final Set<d> f10354a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final List<d> f10355b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f10356c;

    @g1
    public void a(d dVar) {
        this.f10354a.add(dVar);
    }

    public boolean b(@o0 d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f10354a.remove(dVar);
        if (!this.f10355b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void c() {
        for (T b10 : m.k(this.f10354a)) {
            b(b10);
        }
        this.f10355b.clear();
    }

    public boolean d() {
        return this.f10356c;
    }

    public void e() {
        this.f10356c = true;
        for (T t10 : m.k(this.f10354a)) {
            if (t10.isRunning() || t10.i()) {
                t10.clear();
                this.f10355b.add(t10);
            }
        }
    }

    public void f() {
        this.f10356c = true;
        for (T t10 : m.k(this.f10354a)) {
            if (t10.isRunning()) {
                t10.pause();
                this.f10355b.add(t10);
            }
        }
    }

    public void g() {
        for (T t10 : m.k(this.f10354a)) {
            if (!t10.i() && !t10.g()) {
                t10.clear();
                if (!this.f10356c) {
                    t10.h();
                } else {
                    this.f10355b.add(t10);
                }
            }
        }
    }

    public void h() {
        this.f10356c = false;
        for (T t10 : m.k(this.f10354a)) {
            if (!t10.i() && !t10.isRunning()) {
                t10.h();
            }
        }
        this.f10355b.clear();
    }

    public void i(@m0 d dVar) {
        this.f10354a.add(dVar);
        if (!this.f10356c) {
            dVar.h();
            return;
        }
        dVar.clear();
        Log.isLoggable(f10353d, 2);
        this.f10355b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f10354a.size() + ", isPaused=" + this.f10356c + a.f11639j;
    }
}
