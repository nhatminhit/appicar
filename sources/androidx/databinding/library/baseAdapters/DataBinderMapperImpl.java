package androidx.databinding.library.baseAdapters;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f2365a = new SparseIntArray(0);

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f2366a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f2366a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f2367a = new HashMap<>(0);
    }

    public List<k> a() {
        return new ArrayList(0);
    }

    public String b(int i10) {
        return a.f2366a.get(i10);
    }

    public ViewDataBinding c(l lVar, View view, int i10) {
        if (f2365a.get(i10) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public ViewDataBinding d(l lVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f2365a.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f2367a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
