package androidx.databinding;

import android.view.View;
import d.x0;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

@x0({x0.a.O})
public class MergedDataBinderMapper extends k {

    /* renamed from: d  reason: collision with root package name */
    public static final String f2322d = "MergedDataBinderMapper";

    /* renamed from: a  reason: collision with root package name */
    public Set<Class<? extends k>> f2323a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public List<k> f2324b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<String> f2325c = new CopyOnWriteArrayList();

    public String b(int i10) {
        for (k b10 : this.f2324b) {
            String b11 = b10.b(i10);
            if (b11 != null) {
                return b11;
            }
        }
        if (h()) {
            return b(i10);
        }
        return null;
    }

    public ViewDataBinding c(l lVar, View view, int i10) {
        for (k c10 : this.f2324b) {
            ViewDataBinding c11 = c10.c(lVar, view, i10);
            if (c11 != null) {
                return c11;
            }
        }
        if (h()) {
            return c(lVar, view, i10);
        }
        return null;
    }

    public ViewDataBinding d(l lVar, View[] viewArr, int i10) {
        for (k d10 : this.f2324b) {
            ViewDataBinding d11 = d10.d(lVar, viewArr, i10);
            if (d11 != null) {
                return d11;
            }
        }
        if (h()) {
            return d(lVar, viewArr, i10);
        }
        return null;
    }

    public int e(String str) {
        for (k e10 : this.f2324b) {
            int e11 = e10.e(str);
            if (e11 != 0) {
                return e11;
            }
        }
        if (h()) {
            return e(str);
        }
        return 0;
    }

    public void f(k kVar) {
        if (this.f2323a.add(kVar.getClass())) {
            this.f2324b.add(kVar);
            for (k f10 : kVar.a()) {
                f(f10);
            }
        }
    }

    public void g(String str) {
        List<String> list = this.f2325c;
        list.add(str + ".DataBinderMapperImpl");
    }

    public final boolean h() {
        StringBuilder sb2;
        boolean z10 = false;
        for (String next : this.f2325c) {
            try {
                Class<?> cls = Class.forName(next);
                if (k.class.isAssignableFrom(cls)) {
                    f((k) cls.newInstance());
                    this.f2325c.remove(next);
                    z10 = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException unused2) {
                sb2 = new StringBuilder();
                sb2.append("unable to add feature mapper for ");
                sb2.append(next);
            } catch (InstantiationException unused3) {
                sb2 = new StringBuilder();
                sb2.append("unable to add feature mapper for ");
                sb2.append(next);
            }
        }
        return z10;
    }
}
