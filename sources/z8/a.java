package z8;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.m0;
import d.o0;
import j8.h0;
import java.util.LinkedList;
import z8.e;

@e8.a
public abstract class a<T extends e> {

    /* renamed from: a  reason: collision with root package name */
    public e f16009a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public Bundle f16010b;

    /* renamed from: c  reason: collision with root package name */
    public LinkedList f16011c;

    /* renamed from: d  reason: collision with root package name */
    public final g f16012d = new j(this);

    @e8.a
    public static void o(@m0 FrameLayout frameLayout) {
        d8.e x10 = d8.e.x();
        Context context = frameLayout.getContext();
        int j10 = x10.j(context);
        String d10 = h0.d(context, j10);
        String c10 = h0.c(context, j10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(d10);
        linearLayout.addView(textView);
        Intent e10 = x10.e(context, j10, (String) null);
        if (e10 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(c10);
            linearLayout.addView(button);
            button.setOnClickListener(new n(context, e10));
        }
    }

    @e8.a
    public abstract void a(@m0 g<T> gVar);

    @e8.a
    @m0
    public T b() {
        return this.f16009a;
    }

    @e8.a
    public void c(@m0 FrameLayout frameLayout) {
        o(frameLayout);
    }

    @e8.a
    public void d(@o0 Bundle bundle) {
        u(bundle, new l(this, bundle));
    }

    @e8.a
    @m0
    public View e(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new m(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f16009a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    @e8.a
    public void f() {
        e eVar = this.f16009a;
        if (eVar != null) {
            eVar.onDestroy();
        } else {
            t(1);
        }
    }

    @e8.a
    public void g() {
        e eVar = this.f16009a;
        if (eVar != null) {
            eVar.h();
        } else {
            t(2);
        }
    }

    @e8.a
    public void h(@m0 Activity activity, @m0 Bundle bundle, @o0 Bundle bundle2) {
        u(bundle2, new k(this, activity, bundle, bundle2));
    }

    @e8.a
    public void i() {
        e eVar = this.f16009a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
    }

    @e8.a
    public void j() {
        e eVar = this.f16009a;
        if (eVar != null) {
            eVar.d();
        } else {
            t(5);
        }
    }

    @e8.a
    public void k() {
        u((Bundle) null, new p(this));
    }

    @e8.a
    public void l(@m0 Bundle bundle) {
        e eVar = this.f16009a;
        if (eVar != null) {
            eVar.g(bundle);
            return;
        }
        Bundle bundle2 = this.f16010b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @e8.a
    public void m() {
        u((Bundle) null, new o(this));
    }

    @e8.a
    public void n() {
        e eVar = this.f16009a;
        if (eVar != null) {
            eVar.a();
        } else {
            t(4);
        }
    }

    public final void t(int i10) {
        while (!this.f16011c.isEmpty() && ((q) this.f16011c.getLast()).c() >= i10) {
            this.f16011c.removeLast();
        }
    }

    public final void u(@o0 Bundle bundle, q qVar) {
        e eVar = this.f16009a;
        if (eVar != null) {
            qVar.a(eVar);
            return;
        }
        if (this.f16011c == null) {
            this.f16011c = new LinkedList();
        }
        this.f16011c.add(qVar);
        if (bundle != null) {
            Bundle bundle2 = this.f16010b;
            if (bundle2 == null) {
                this.f16010b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f16012d);
    }
}
