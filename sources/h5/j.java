package h5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import w4.l;
import w4.p;

public class j extends i {
    public final l[] V;
    public final boolean W;
    public int X;
    public boolean Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(boolean z10, l[] lVarArr) {
        super(lVarArr[0]);
        boolean z11 = false;
        this.W = z10;
        if (z10 && this.U.o2()) {
            z11 = true;
        }
        this.Y = z11;
        this.V = lVarArr;
        this.X = 1;
    }

    @Deprecated
    public j(l[] lVarArr) {
        this(false, lVarArr);
    }

    @Deprecated
    public static j d3(l lVar, l lVar2) {
        return e3(false, lVar, lVar2);
    }

    public static j e3(boolean z10, l lVar, l lVar2) {
        boolean z11 = lVar instanceof j;
        if (z11 || (lVar2 instanceof j)) {
            ArrayList arrayList = new ArrayList();
            if (z11) {
                ((j) lVar).b3(arrayList);
            } else {
                arrayList.add(lVar);
            }
            if (lVar2 instanceof j) {
                ((j) lVar2).b3(arrayList);
            } else {
                arrayList.add(lVar2);
            }
            return new j(z10, (l[]) arrayList.toArray(new l[arrayList.size()]));
        }
        return new j(z10, new l[]{lVar, lVar2});
    }

    public p D2() throws IOException {
        l lVar = this.U;
        if (lVar == null) {
            return null;
        }
        if (this.Y) {
            this.Y = false;
            return lVar.P();
        }
        p D2 = lVar.D2();
        return D2 == null ? f3() : D2;
    }

    public l Z2() throws IOException {
        if (this.U.P() != p.START_OBJECT && this.U.P() != p.START_ARRAY) {
            return this;
        }
        int i10 = 1;
        while (true) {
            p D2 = D2();
            if (D2 == null) {
                return this;
            }
            if (D2.m()) {
                i10++;
            } else if (D2.l() && i10 - 1 == 0) {
                return this;
            }
        }
    }

    public void b3(List<l> list) {
        int length = this.V.length;
        for (int i10 = this.X - 1; i10 < length; i10++) {
            l lVar = this.V[i10];
            if (lVar instanceof j) {
                ((j) lVar).b3(list);
            } else {
                list.add(lVar);
            }
        }
    }

    public int c3() {
        return this.V.length;
    }

    public void close() throws IOException {
        do {
            this.U.close();
        } while (g3());
    }

    public p f3() throws IOException {
        p D2;
        do {
            int i10 = this.X;
            l[] lVarArr = this.V;
            if (i10 >= lVarArr.length) {
                return null;
            }
            this.X = i10 + 1;
            l lVar = lVarArr[i10];
            this.U = lVar;
            if (this.W && lVar.o2()) {
                return this.U.Z0();
            }
            D2 = this.U.D2();
        } while (D2 == null);
        return D2;
    }

    public boolean g3() {
        int i10 = this.X;
        l[] lVarArr = this.V;
        if (i10 >= lVarArr.length) {
            return false;
        }
        this.X = i10 + 1;
        this.U = lVarArr[i10];
        return true;
    }
}
