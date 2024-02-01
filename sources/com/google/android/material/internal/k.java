package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import d.m0;
import d.o0;
import d.x0;
import java.lang.ref.WeakReference;
import w9.d;
import w9.f;

@x0({x0.a.LIBRARY_GROUP})
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f17247a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final f f17248b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f17249c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17250d = true;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f17251e = new WeakReference<>((Object) null);
    @o0

    /* renamed from: f  reason: collision with root package name */
    public d f17252f;

    public class a extends f {
        public a() {
        }

        public void a(int i10) {
            boolean unused = k.this.f17250d = true;
            b bVar = (b) k.this.f17251e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void b(@m0 Typeface typeface, boolean z10) {
            if (!z10) {
                boolean unused = k.this.f17250d = true;
                b bVar = (b) k.this.f17251e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        @m0
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public k(@o0 b bVar) {
        h(bVar);
    }

    public final float c(@o0 CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f17247a.measureText(charSequence, 0, charSequence.length());
    }

    @o0
    public d d() {
        return this.f17252f;
    }

    @m0
    public TextPaint e() {
        return this.f17247a;
    }

    public float f(String str) {
        if (!this.f17250d) {
            return this.f17249c;
        }
        float c10 = c(str);
        this.f17249c = c10;
        this.f17250d = false;
        return c10;
    }

    public boolean g() {
        return this.f17250d;
    }

    public void h(@o0 b bVar) {
        this.f17251e = new WeakReference<>(bVar);
    }

    public void i(@o0 d dVar, Context context) {
        if (this.f17252f != dVar) {
            this.f17252f = dVar;
            if (dVar != null) {
                dVar.k(context, this.f17247a, this.f17248b);
                b bVar = this.f17251e.get();
                if (bVar != null) {
                    this.f17247a.drawableState = bVar.getState();
                }
                dVar.j(context, this.f17247a, this.f17248b);
                this.f17250d = true;
            }
            b bVar2 = this.f17251e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void j(boolean z10) {
        this.f17250d = z10;
    }

    public void k(Context context) {
        this.f17252f.j(context, this.f17247a, this.f17248b);
    }
}
