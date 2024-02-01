package i8;

import com.google.android.gms.common.data.DataHolder;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import java.util.ArrayList;

@a
public abstract class h<T> extends a<T> {
    public boolean P = false;
    public ArrayList Q;

    @a
    public h(@m0 DataHolder dataHolder) {
        super(dataHolder);
    }

    @a
    @o0
    public String c() {
        return null;
    }

    @a
    @m0
    public abstract T f(int i10, int i11);

    @a
    @m0
    public final T get(int i10) {
        l();
        int i11 = i(i10);
        int i12 = 0;
        if (i10 >= 0 && i10 != this.Q.size()) {
            int count = (i10 == this.Q.size() + -1 ? ((DataHolder) s.l(this.O)).getCount() : ((Integer) this.Q.get(i10 + 1)).intValue()) - ((Integer) this.Q.get(i10)).intValue();
            if (count == 1) {
                int i13 = i(i10);
                int A1 = ((DataHolder) s.l(this.O)).A1(i13);
                String c10 = c();
                if (c10 == null || this.O.r1(c10, i13, A1) != null) {
                    i12 = 1;
                }
            } else {
                i12 = count;
            }
        }
        return f(i11, i12);
    }

    @a
    public int getCount() {
        l();
        return this.Q.size();
    }

    @a
    @m0
    public abstract String h();

    public final int i(int i10) {
        if (i10 >= 0 && i10 < this.Q.size()) {
            return ((Integer) this.Q.get(i10)).intValue();
        }
        throw new IllegalArgumentException("Position " + i10 + " is out of bounds for this buffer");
    }

    public final void l() {
        synchronized (this) {
            if (!this.P) {
                int count = ((DataHolder) s.l(this.O)).getCount();
                ArrayList arrayList = new ArrayList();
                this.Q = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String h10 = h();
                    String r12 = this.O.r1(h10, 0, this.O.A1(0));
                    int i10 = 1;
                    while (i10 < count) {
                        int A1 = this.O.A1(i10);
                        String r13 = this.O.r1(h10, i10, A1);
                        if (r13 != null) {
                            if (!r13.equals(r12)) {
                                this.Q.add(Integer.valueOf(i10));
                                r12 = r13;
                            }
                            i10++;
                        } else {
                            throw new NullPointerException("Missing value for markerColumn: " + h10 + ", at row: " + i10 + ", for window: " + A1);
                        }
                    }
                }
                this.P = true;
            }
        }
    }
}
