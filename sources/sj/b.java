package sj;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;

public class b {
    public static void a(FragmentManager fragmentManager) {
        if (fragmentManager != null) {
            int i10 = 0;
            while (i10 < fragmentManager.z0()) {
                try {
                    fragmentManager.l1();
                    i10++;
                } catch (IllegalStateException e10) {
                    e10.printStackTrace();
                    return;
                }
            }
        }
    }

    public static Fragment b(FragmentActivity fragmentActivity) {
        Fragment d10;
        List<Fragment> G0;
        if (fragmentActivity != null && (d10 = d(fragmentActivity)) != null && (G0 = d10.getChildFragmentManager().G0()) != null) {
            int size = G0.size();
            while (true) {
                size--;
                if (size <= -1) {
                    break;
                }
                Fragment fragment = G0.get(size);
                if (fragment != null && fragment.isVisible()) {
                    return fragment;
                }
            }
        }
        return null;
    }

    public static List<Fragment> c(FragmentActivity fragmentActivity) {
        Fragment d10;
        if (fragmentActivity == null || (d10 = d(fragmentActivity)) == null) {
            return null;
        }
        List<Fragment> G0 = d10.getChildFragmentManager().G0();
        ArrayList arrayList = new ArrayList();
        if (G0 != null) {
            int size = G0.size();
            while (true) {
                size--;
                if (size <= -1) {
                    break;
                }
                Fragment fragment = G0.get(size);
                if (fragment != null && !fragment.getClass().getName().equals(d10.getClass().getName()) && fragment.isVisible()) {
                    arrayList.add(fragment);
                }
            }
        }
        if (!G0.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    public static Fragment d(FragmentActivity fragmentActivity) {
        List<Fragment> G0;
        if (fragmentActivity != null && (G0 = fragmentActivity.X().G0()) != null) {
            int size = G0.size();
            while (true) {
                size--;
                if (size <= -1) {
                    break;
                }
                Fragment fragment = G0.get(size);
                if (fragment != null && fragment.isVisible()) {
                    return fragment;
                }
            }
        }
        return null;
    }
}
