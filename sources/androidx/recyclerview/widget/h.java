package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import f1.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class h extends a0 {
    public static TimeInterpolator A = null;

    /* renamed from: z  reason: collision with root package name */
    public static final boolean f3473z = false;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3474o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3475p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<j> f3476q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<i> f3477r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.e0>> f3478s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<ArrayList<j>> f3479t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<ArrayList<i>> f3480u = new ArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3481v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3482w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3483x = new ArrayList<>();

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<RecyclerView.e0> f3484y = new ArrayList<>();

    public class a implements Runnable {
        public final /* synthetic */ ArrayList O;

        public a(ArrayList arrayList) {
            this.O = arrayList;
        }

        public void run() {
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                h.this.b0(jVar.f3513a, jVar.f3514b, jVar.f3515c, jVar.f3516d, jVar.f3517e);
            }
            this.O.clear();
            h.this.f3479t.remove(this.O);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ ArrayList O;

        public b(ArrayList arrayList) {
            this.O = arrayList;
        }

        public void run() {
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                h.this.a0((i) it.next());
            }
            this.O.clear();
            h.this.f3480u.remove(this.O);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ ArrayList O;

        public c(ArrayList arrayList) {
            this.O = arrayList;
        }

        public void run() {
            Iterator it = this.O.iterator();
            while (it.hasNext()) {
                h.this.Z((RecyclerView.e0) it.next());
            }
            this.O.clear();
            h.this.f3478s.remove(this.O);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3485a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3486b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3487c;

        public d(RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3485a = e0Var;
            this.f3486b = viewPropertyAnimator;
            this.f3487c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3486b.setListener((Animator.AnimatorListener) null);
            this.f3487c.setAlpha(1.0f);
            h.this.N(this.f3485a);
            h.this.f3483x.remove(this.f3485a);
            h.this.e0();
        }

        public void onAnimationStart(Animator animator) {
            h.this.O(this.f3485a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3489a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3490b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3491c;

        public e(RecyclerView.e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3489a = e0Var;
            this.f3490b = view;
            this.f3491c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3490b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3491c.setListener((Animator.AnimatorListener) null);
            h.this.H(this.f3489a);
            h.this.f3481v.remove(this.f3489a);
            h.this.e0();
        }

        public void onAnimationStart(Animator animator) {
            h.this.I(this.f3489a);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RecyclerView.e0 f3493a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f3494b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3495c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f3496d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3497e;

        public f(RecyclerView.e0 e0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3493a = e0Var;
            this.f3494b = i10;
            this.f3495c = view;
            this.f3496d = i11;
            this.f3497e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f3494b != 0) {
                this.f3495c.setTranslationX(0.0f);
            }
            if (this.f3496d != 0) {
                this.f3495c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f3497e.setListener((Animator.AnimatorListener) null);
            h.this.L(this.f3493a);
            h.this.f3482w.remove(this.f3493a);
            h.this.e0();
        }

        public void onAnimationStart(Animator animator) {
            h.this.M(this.f3493a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f3499a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3500b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3501c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3499a = iVar;
            this.f3500b = viewPropertyAnimator;
            this.f3501c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3500b.setListener((Animator.AnimatorListener) null);
            this.f3501c.setAlpha(1.0f);
            this.f3501c.setTranslationX(0.0f);
            this.f3501c.setTranslationY(0.0f);
            h.this.J(this.f3499a.f3507a, true);
            h.this.f3484y.remove(this.f3499a.f3507a);
            h.this.e0();
        }

        public void onAnimationStart(Animator animator) {
            h.this.K(this.f3499a.f3507a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h  reason: collision with other inner class name */
    public class C0048h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f3503a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f3504b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f3505c;

        public C0048h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3503a = iVar;
            this.f3504b = viewPropertyAnimator;
            this.f3505c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3504b.setListener((Animator.AnimatorListener) null);
            this.f3505c.setAlpha(1.0f);
            this.f3505c.setTranslationX(0.0f);
            this.f3505c.setTranslationY(0.0f);
            h.this.J(this.f3503a.f3508b, false);
            h.this.f3484y.remove(this.f3503a.f3508b);
            h.this.e0();
        }

        public void onAnimationStart(Animator animator) {
            h.this.K(this.f3503a.f3508b, false);
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f3507a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.e0 f3508b;

        /* renamed from: c  reason: collision with root package name */
        public int f3509c;

        /* renamed from: d  reason: collision with root package name */
        public int f3510d;

        /* renamed from: e  reason: collision with root package name */
        public int f3511e;

        /* renamed from: f  reason: collision with root package name */
        public int f3512f;

        public i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.f3507a = e0Var;
            this.f3508b = e0Var2;
        }

        public i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13) {
            this(e0Var, e0Var2);
            this.f3509c = i10;
            this.f3510d = i11;
            this.f3511e = i12;
            this.f3512f = i13;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3507a + ", newHolder=" + this.f3508b + ", fromX=" + this.f3509c + ", fromY=" + this.f3510d + ", toX=" + this.f3511e + ", toY=" + this.f3512f + '}';
        }
    }

    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.e0 f3513a;

        /* renamed from: b  reason: collision with root package name */
        public int f3514b;

        /* renamed from: c  reason: collision with root package name */
        public int f3515c;

        /* renamed from: d  reason: collision with root package name */
        public int f3516d;

        /* renamed from: e  reason: collision with root package name */
        public int f3517e;

        public j(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
            this.f3513a = e0Var;
            this.f3514b = i10;
            this.f3515c = i11;
            this.f3516d = i12;
            this.f3517e = i13;
        }
    }

    public boolean D(RecyclerView.e0 e0Var) {
        i0(e0Var);
        e0Var.f3220a.setAlpha(0.0f);
        this.f3475p.add(e0Var);
        return true;
    }

    public boolean E(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i10, int i11, int i12, int i13) {
        if (e0Var == e0Var2) {
            return F(e0Var, i10, i11, i12, i13);
        }
        float translationX = e0Var.f3220a.getTranslationX();
        float translationY = e0Var.f3220a.getTranslationY();
        float alpha = e0Var.f3220a.getAlpha();
        i0(e0Var);
        int i14 = (int) (((float) (i12 - i10)) - translationX);
        int i15 = (int) (((float) (i13 - i11)) - translationY);
        e0Var.f3220a.setTranslationX(translationX);
        e0Var.f3220a.setTranslationY(translationY);
        e0Var.f3220a.setAlpha(alpha);
        if (e0Var2 != null) {
            i0(e0Var2);
            e0Var2.f3220a.setTranslationX((float) (-i14));
            e0Var2.f3220a.setTranslationY((float) (-i15));
            e0Var2.f3220a.setAlpha(0.0f);
        }
        this.f3477r.add(new i(e0Var, e0Var2, i10, i11, i12, i13));
        return true;
    }

    public boolean F(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
        View view = e0Var.f3220a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) e0Var.f3220a.getTranslationY());
        i0(e0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            L(e0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX((float) (-i14));
        }
        if (i15 != 0) {
            view.setTranslationY((float) (-i15));
        }
        this.f3476q.add(new j(e0Var, translationX, translationY, i12, i13));
        return true;
    }

    public boolean G(RecyclerView.e0 e0Var) {
        i0(e0Var);
        this.f3474o.add(e0Var);
        return true;
    }

    public void Z(RecyclerView.e0 e0Var) {
        View view = e0Var.f3220a;
        ViewPropertyAnimator animate = view.animate();
        this.f3481v.add(e0Var);
        animate.alpha(1.0f).setDuration(m()).setListener(new e(e0Var, view, animate)).start();
    }

    public void a0(i iVar) {
        RecyclerView.e0 e0Var = iVar.f3507a;
        View view = null;
        View view2 = e0Var == null ? null : e0Var.f3220a;
        RecyclerView.e0 e0Var2 = iVar.f3508b;
        if (e0Var2 != null) {
            view = e0Var2.f3220a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(n());
            this.f3484y.add(iVar.f3507a);
            duration.translationX((float) (iVar.f3511e - iVar.f3509c));
            duration.translationY((float) (iVar.f3512f - iVar.f3510d));
            duration.alpha(0.0f).setListener(new g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f3484y.add(iVar.f3508b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(n()).alpha(1.0f).setListener(new C0048h(iVar, animate, view)).start();
        }
    }

    public void b0(RecyclerView.e0 e0Var, int i10, int i11, int i12, int i13) {
        View view = e0Var.f3220a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f3482w.add(e0Var);
        animate.setDuration(o()).setListener(new f(e0Var, i14, view, i15, animate)).start();
    }

    public final void c0(RecyclerView.e0 e0Var) {
        View view = e0Var.f3220a;
        ViewPropertyAnimator animate = view.animate();
        this.f3483x.add(e0Var);
        animate.setDuration(p()).alpha(0.0f).setListener(new d(e0Var, animate, view)).start();
    }

    public void d0(List<RecyclerView.e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f3220a.animate().cancel();
        }
    }

    public void e0() {
        if (!q()) {
            j();
        }
    }

    public final void f0(List<i> list, RecyclerView.e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (h0(iVar, e0Var) && iVar.f3507a == null && iVar.f3508b == null) {
                list.remove(iVar);
            }
        }
    }

    public boolean g(@m0 RecyclerView.e0 e0Var, @m0 List<Object> list) {
        return !list.isEmpty() || super.g(e0Var, list);
    }

    public final void g0(i iVar) {
        RecyclerView.e0 e0Var = iVar.f3507a;
        if (e0Var != null) {
            h0(iVar, e0Var);
        }
        RecyclerView.e0 e0Var2 = iVar.f3508b;
        if (e0Var2 != null) {
            h0(iVar, e0Var2);
        }
    }

    public final boolean h0(i iVar, RecyclerView.e0 e0Var) {
        boolean z10 = false;
        if (iVar.f3508b == e0Var) {
            iVar.f3508b = null;
        } else if (iVar.f3507a != e0Var) {
            return false;
        } else {
            iVar.f3507a = null;
            z10 = true;
        }
        e0Var.f3220a.setAlpha(1.0f);
        e0Var.f3220a.setTranslationX(0.0f);
        e0Var.f3220a.setTranslationY(0.0f);
        J(e0Var, z10);
        return true;
    }

    public final void i0(RecyclerView.e0 e0Var) {
        if (A == null) {
            A = new ValueAnimator().getInterpolator();
        }
        e0Var.f3220a.animate().setInterpolator(A);
        k(e0Var);
    }

    public void k(RecyclerView.e0 e0Var) {
        View view = e0Var.f3220a;
        view.animate().cancel();
        int size = this.f3476q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f3476q.get(size).f3513a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                L(e0Var);
                this.f3476q.remove(size);
            }
        }
        f0(this.f3477r, e0Var);
        if (this.f3474o.remove(e0Var)) {
            view.setAlpha(1.0f);
            N(e0Var);
        }
        if (this.f3475p.remove(e0Var)) {
            view.setAlpha(1.0f);
            H(e0Var);
        }
        for (int size2 = this.f3480u.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.f3480u.get(size2);
            f0(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.f3480u.remove(size2);
            }
        }
        for (int size3 = this.f3479t.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.f3479t.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((j) arrayList2.get(size4)).f3513a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    L(e0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3479t.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3478s.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.f3478s.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                H(e0Var);
                if (arrayList3.isEmpty()) {
                    this.f3478s.remove(size5);
                }
            }
        }
        this.f3483x.remove(e0Var);
        this.f3481v.remove(e0Var);
        this.f3484y.remove(e0Var);
        this.f3482w.remove(e0Var);
        e0();
    }

    public void l() {
        int size = this.f3476q.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.f3476q.get(size);
            View view = jVar.f3513a.f3220a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            L(jVar.f3513a);
            this.f3476q.remove(size);
        }
        for (int size2 = this.f3474o.size() - 1; size2 >= 0; size2--) {
            N(this.f3474o.get(size2));
            this.f3474o.remove(size2);
        }
        int size3 = this.f3475p.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = this.f3475p.get(size3);
            e0Var.f3220a.setAlpha(1.0f);
            H(e0Var);
            this.f3475p.remove(size3);
        }
        for (int size4 = this.f3477r.size() - 1; size4 >= 0; size4--) {
            g0(this.f3477r.get(size4));
        }
        this.f3477r.clear();
        if (q()) {
            for (int size5 = this.f3479t.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.f3479t.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f3513a.f3220a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    L(jVar2.f3513a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3479t.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3478s.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.f3478s.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var2 = (RecyclerView.e0) arrayList2.get(size8);
                    e0Var2.f3220a.setAlpha(1.0f);
                    H(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3478s.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3480u.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.f3480u.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    g0((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3480u.remove(arrayList3);
                    }
                }
            }
            d0(this.f3483x);
            d0(this.f3482w);
            d0(this.f3481v);
            d0(this.f3484y);
            j();
        }
    }

    public boolean q() {
        return !this.f3475p.isEmpty() || !this.f3477r.isEmpty() || !this.f3476q.isEmpty() || !this.f3474o.isEmpty() || !this.f3482w.isEmpty() || !this.f3483x.isEmpty() || !this.f3481v.isEmpty() || !this.f3484y.isEmpty() || !this.f3479t.isEmpty() || !this.f3478s.isEmpty() || !this.f3480u.isEmpty();
    }

    public void x() {
        boolean z10 = !this.f3474o.isEmpty();
        boolean z11 = !this.f3476q.isEmpty();
        boolean z12 = !this.f3477r.isEmpty();
        boolean z13 = !this.f3475p.isEmpty();
        if (z10 || z11 || z13 || z12) {
            Iterator<RecyclerView.e0> it = this.f3474o.iterator();
            while (it.hasNext()) {
                c0(it.next());
            }
            this.f3474o.clear();
            if (z11) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f3476q);
                this.f3479t.add(arrayList);
                this.f3476q.clear();
                a aVar = new a(arrayList);
                if (z10) {
                    w1.o1(((j) arrayList.get(0)).f3513a.f3220a, aVar, p());
                } else {
                    aVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f3477r);
                this.f3480u.add(arrayList2);
                this.f3477r.clear();
                b bVar = new b(arrayList2);
                if (z10) {
                    w1.o1(((i) arrayList2.get(0)).f3507a.f3220a, bVar, p());
                } else {
                    bVar.run();
                }
            }
            if (z13) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f3475p);
                this.f3478s.add(arrayList3);
                this.f3475p.clear();
                c cVar = new c(arrayList3);
                if (z10 || z11 || z12) {
                    long j10 = 0;
                    long p10 = z10 ? p() : 0;
                    long o10 = z11 ? o() : 0;
                    if (z12) {
                        j10 = n();
                    }
                    w1.o1(((RecyclerView.e0) arrayList3.get(0)).f3220a, cVar, p10 + Math.max(o10, j10));
                    return;
                }
                cVar.run();
            }
        }
    }
}
