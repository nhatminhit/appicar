package zb;

import android.graphics.Rect;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yb.x;

public class r extends t {

    /* renamed from: b  reason: collision with root package name */
    public static final String f25096b = "r";

    public class a implements Comparator<x> {
        public final /* synthetic */ x O;

        public a(x xVar) {
            this.O = xVar;
        }

        /* renamed from: a */
        public int compare(x xVar, x xVar2) {
            int i10 = r.e(xVar, this.O).O - xVar.O;
            int i11 = r.e(xVar2, this.O).O - xVar2.O;
            if (i10 == 0 && i11 == 0) {
                return xVar.compareTo(xVar2);
            }
            if (i10 == 0) {
                return -1;
            }
            if (i11 == 0) {
                return 1;
            }
            return (i10 >= 0 || i11 >= 0) ? (i10 <= 0 || i11 <= 0) ? i10 < 0 ? -1 : 1 : -xVar.compareTo(xVar2) : xVar.compareTo(xVar2);
        }
    }

    public static x e(x xVar, x xVar2) {
        x e10;
        if (!xVar2.b(xVar)) {
            do {
                x e11 = xVar.e(3, 2);
                xVar = xVar.e(2, 1);
                if (xVar2.b(e11)) {
                    return e11;
                }
            } while (!xVar2.b(xVar));
            return xVar;
        }
        while (true) {
            e10 = xVar.e(2, 3);
            x e12 = xVar.e(1, 2);
            if (!xVar2.b(e12)) {
                break;
            }
            xVar = e12;
        }
        return xVar2.b(e10) ? e10 : xVar;
    }

    public x b(List<x> list, x xVar) {
        if (xVar != null) {
            Collections.sort(list, new a(xVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Viewfinder size: ");
            sb2.append(xVar);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Preview in order of preference: ");
            sb3.append(list);
        }
        return list.get(0);
    }

    public Rect d(x xVar, x xVar2) {
        x e10 = e(xVar, xVar2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preview: ");
        sb2.append(xVar);
        sb2.append("; Scaled: ");
        sb2.append(e10);
        sb2.append("; Want: ");
        sb2.append(xVar2);
        int i10 = (e10.O - xVar2.O) / 2;
        int i11 = (e10.P - xVar2.P) / 2;
        return new Rect(-i10, -i11, e10.O - i10, e10.P - i11);
    }
}
