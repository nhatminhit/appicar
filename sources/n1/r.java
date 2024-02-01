package n1;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray<WeakHashMap<View, WeakReference<?>>> f10781a = new SparseArray<>();

    public static <T> T a(View view, int i10) {
        return view.getTag(i10);
    }

    public static <T> T b(View view, T t10, int i10) {
        T tag = view.getTag(i10);
        view.setTag(i10, t10);
        return tag;
    }
}
