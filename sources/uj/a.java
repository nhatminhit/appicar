package uj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import java.util.List;
import sj.b;
import vn.icar.entertaiment.view.activity.HomeActivity;

@SuppressLint({"DefaultLocale"})
public class a {

    /* renamed from: a  reason: collision with root package name */
    public HomeActivity f23424a;

    public a(HomeActivity homeActivity) {
        this.f23424a = homeActivity;
    }

    public void a(int i10, Class<? extends Fragment> cls, Bundle bundle, boolean z10, u uVar, String str) {
        try {
            Fragment fragment = (Fragment) cls.newInstance();
            if (bundle != null) {
                fragment.setArguments(bundle);
            }
            uVar.c(i10, fragment, str);
            if (z10) {
                uVar.k(str);
            }
        } catch (IllegalAccessException | InstantiationException e10) {
            e10.printStackTrace();
        }
    }

    public boolean b(Class<? extends Fragment> cls) {
        String name = cls.getName();
        Fragment d10 = b.d(this.f23424a);
        return d10 != null && d10.getTag().equals(name);
    }

    public boolean c(int i10, Class<? extends Fragment> cls, Bundle bundle, boolean z10, Context context) {
        FragmentManager X = this.f23424a.X();
        u r10 = X.r();
        String name = cls.getName();
        Fragment d10 = b.d(this.f23424a);
        if (d10 != null) {
            if (!d10.getTag().equals(name)) {
                r10.u(d10);
            }
            Fragment q02 = X.q0(name);
            if (q02 != null) {
                r10.P(q02);
                r10.n();
                return true;
            }
        }
        a(i10, cls, bundle, z10, r10, name);
        r10.n();
        return false;
    }

    public void d(Class<? extends Fragment> cls) {
        FragmentManager X = this.f23424a.X();
        u r10 = X.r();
        String name = cls.getName();
        Fragment q02 = X.q0(name);
        if (q02 != null) {
            r10.x(q02);
            X.d(name);
            r10.m();
        }
    }

    public final Boolean e(String str) {
        List<Fragment> G0 = this.f23424a.X().G0();
        if (G0 != null) {
            int size = G0.size();
            while (true) {
                size--;
                if (size <= -1) {
                    break;
                }
                Fragment fragment = G0.get(size);
                if (fragment != null && fragment.getClass().getName().equals(str) && !fragment.isRemoving()) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    public final void f(String str, u uVar) {
        List<Fragment> G0 = this.f23424a.X().G0();
        if (G0 != null) {
            for (Fragment next : G0) {
                if (next != null) {
                    if (next.getClass().getName().equals(str)) {
                        uVar.P(next);
                    } else {
                        uVar.u(next);
                    }
                }
            }
        }
        uVar.m();
    }
}
