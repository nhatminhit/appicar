package androidx.databinding;

import android.view.View;
import d.m0;
import d.x0;
import java.util.Collections;
import java.util.List;

@x0({x0.a.O})
public abstract class k {
    @m0
    public List<k> a() {
        return Collections.emptyList();
    }

    public abstract String b(int i10);

    public abstract ViewDataBinding c(l lVar, View view, int i10);

    public abstract ViewDataBinding d(l lVar, View[] viewArr, int i10);

    public abstract int e(String str);
}
