package g3;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.h0;
import d.m0;
import d.o0;
import g3.d0;

public class f0 {

    /* renamed from: a  reason: collision with root package name */
    public Context f7669a;

    /* renamed from: b  reason: collision with root package name */
    public int f7670b;

    /* renamed from: c  reason: collision with root package name */
    public ViewGroup f7671c;

    /* renamed from: d  reason: collision with root package name */
    public View f7672d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f7673e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f7674f;

    public f0(@m0 ViewGroup viewGroup) {
        this.f7670b = -1;
        this.f7671c = viewGroup;
    }

    public f0(ViewGroup viewGroup, int i10, Context context) {
        this.f7669a = context;
        this.f7671c = viewGroup;
        this.f7670b = i10;
    }

    public f0(@m0 ViewGroup viewGroup, @m0 View view) {
        this.f7670b = -1;
        this.f7671c = viewGroup;
        this.f7672d = view;
    }

    @o0
    public static f0 c(@m0 ViewGroup viewGroup) {
        return (f0) viewGroup.getTag(d0.e.transition_current_scene);
    }

    @m0
    public static f0 d(@m0 ViewGroup viewGroup, @h0 int i10, @m0 Context context) {
        int i11 = d0.e.transition_scene_layoutid_cache;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i11);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i11, sparseArray);
        }
        f0 f0Var = (f0) sparseArray.get(i10);
        if (f0Var != null) {
            return f0Var;
        }
        f0 f0Var2 = new f0(viewGroup, i10, context);
        sparseArray.put(i10, f0Var2);
        return f0Var2;
    }

    public static void g(@m0 ViewGroup viewGroup, @o0 f0 f0Var) {
        viewGroup.setTag(d0.e.transition_current_scene, f0Var);
    }

    public void a() {
        if (this.f7670b > 0 || this.f7672d != null) {
            e().removeAllViews();
            if (this.f7670b > 0) {
                LayoutInflater.from(this.f7669a).inflate(this.f7670b, this.f7671c);
            } else {
                this.f7671c.addView(this.f7672d);
            }
        }
        Runnable runnable = this.f7673e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f7671c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f7671c) == this && (runnable = this.f7674f) != null) {
            runnable.run();
        }
    }

    @m0
    public ViewGroup e() {
        return this.f7671c;
    }

    public boolean f() {
        return this.f7670b > 0;
    }

    public void h(@o0 Runnable runnable) {
        this.f7673e = runnable;
    }

    public void i(@o0 Runnable runnable) {
        this.f7674f = runnable;
    }
}
