package zb;

import android.graphics.Rect;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yb.x;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25097a = "t";

    public class a implements Comparator<x> {
        public final /* synthetic */ x O;

        public a(x xVar) {
            this.O = xVar;
        }

        /* renamed from: a */
        public int compare(x xVar, x xVar2) {
            return Float.compare(t.this.c(xVar2, this.O), t.this.c(xVar, this.O));
        }
    }

    public List<x> a(List<x> list, x xVar) {
        if (xVar == null) {
            return list;
        }
        Collections.sort(list, new a(xVar));
        return list;
    }

    public x b(List<x> list, x xVar) {
        List<x> a10 = a(list, xVar);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Viewfinder size: ");
        sb2.append(xVar);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Preview in order of preference: ");
        sb3.append(a10);
        return a10.get(0);
    }

    public float c(x xVar, x xVar2) {
        return 0.5f;
    }

    public abstract Rect d(x xVar, x xVar2);
}
