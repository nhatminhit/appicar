package b7;

import b6.c;
import b6.v0;
import b7.w;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import w7.a;

public final class j0 implements w, w.a {
    public final w[] O;
    public final IdentityHashMap<r0, Integer> P;
    public final j Q;
    public final ArrayList<w> R = new ArrayList<>();
    public w.a S;
    public TrackGroupArray T;
    public w[] U;
    public s0 V;

    public j0(j jVar, w... wVarArr) {
        this.Q = jVar;
        this.O = wVarArr;
        this.V = jVar.a(new s0[0]);
        this.P = new IdentityHashMap<>();
    }

    public long b() {
        return this.V.b();
    }

    public long c(long j10, v0 v0Var) {
        return this.U[0].c(j10, v0Var);
    }

    public boolean d(long j10) {
        if (this.R.isEmpty()) {
            return this.V.d(j10);
        }
        int size = this.R.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.R.get(i10).d(j10);
        }
        return false;
    }

    public long e() {
        return this.V.e();
    }

    public void f(long j10) {
        this.V.f(j10);
    }

    /* renamed from: g */
    public void k(w wVar) {
        this.S.k(this);
    }

    public long h(f[] fVarArr, boolean[] zArr, r0[] r0VarArr, boolean[] zArr2, long j10) {
        f[] fVarArr2 = fVarArr;
        r0[] r0VarArr2 = r0VarArr;
        int[] iArr = new int[fVarArr2.length];
        int[] iArr2 = new int[fVarArr2.length];
        for (int i10 = 0; i10 < fVarArr2.length; i10++) {
            r0 r0Var = r0VarArr2[i10];
            iArr[i10] = r0Var == null ? -1 : this.P.get(r0Var).intValue();
            iArr2[i10] = -1;
            f fVar = fVarArr2[i10];
            if (fVar != null) {
                TrackGroup a10 = fVar.a();
                int i11 = 0;
                while (true) {
                    w[] wVarArr = this.O;
                    if (i11 >= wVarArr.length) {
                        break;
                    } else if (wVarArr[i11].t().b(a10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.P.clear();
        int length = fVarArr2.length;
        r0[] r0VarArr3 = new r0[length];
        r0[] r0VarArr4 = new r0[fVarArr2.length];
        f[] fVarArr3 = new f[fVarArr2.length];
        ArrayList arrayList = new ArrayList(this.O.length);
        long j11 = j10;
        int i12 = 0;
        while (i12 < this.O.length) {
            for (int i13 = 0; i13 < fVarArr2.length; i13++) {
                f fVar2 = null;
                r0VarArr4[i13] = iArr[i13] == i12 ? r0VarArr2[i13] : null;
                if (iArr2[i13] == i12) {
                    fVar2 = fVarArr2[i13];
                }
                fVarArr3[i13] = fVar2;
            }
            int i14 = i12;
            f[] fVarArr4 = fVarArr3;
            ArrayList arrayList2 = arrayList;
            long h10 = this.O[i12].h(fVarArr3, zArr, r0VarArr4, zArr2, j11);
            if (i14 == 0) {
                j11 = h10;
            } else if (h10 != j11) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z10 = false;
            for (int i15 = 0; i15 < fVarArr2.length; i15++) {
                boolean z11 = true;
                if (iArr2[i15] == i14) {
                    a.i(r0VarArr4[i15] != null);
                    r0VarArr3[i15] = r0VarArr4[i15];
                    this.P.put(r0VarArr4[i15], Integer.valueOf(i14));
                    z10 = true;
                } else if (iArr[i15] == i14) {
                    if (r0VarArr4[i15] != null) {
                        z11 = false;
                    }
                    a.i(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.O[i14]);
            }
            i12 = i14 + 1;
            arrayList = arrayList2;
            fVarArr3 = fVarArr4;
            r0VarArr2 = r0VarArr;
        }
        r0[] r0VarArr5 = r0VarArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(r0VarArr3, 0, r0VarArr5, 0, length);
        w[] wVarArr2 = new w[arrayList3.size()];
        this.U = wVarArr2;
        arrayList3.toArray(wVarArr2);
        this.V = this.Q.a(this.U);
        return j11;
    }

    public void i(w wVar) {
        this.R.remove(wVar);
        if (this.R.isEmpty()) {
            int i10 = 0;
            for (w t10 : this.O) {
                i10 += t10.t().O;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i10];
            int i11 = 0;
            for (w t11 : this.O) {
                TrackGroupArray t12 = t11.t();
                int i12 = t12.O;
                int i13 = 0;
                while (i13 < i12) {
                    trackGroupArr[i11] = t12.a(i13);
                    i13++;
                    i11++;
                }
            }
            this.T = new TrackGroupArray(trackGroupArr);
            this.S.i(this);
        }
    }

    public /* synthetic */ List m(List list) {
        return v.a(this, list);
    }

    public void n(w.a aVar, long j10) {
        this.S = aVar;
        Collections.addAll(this.R, this.O);
        for (w n10 : this.O) {
            n10.n(this, j10);
        }
    }

    public void o() throws IOException {
        for (w o10 : this.O) {
            o10.o();
        }
    }

    public long p(long j10) {
        long p10 = this.U[0].p(j10);
        int i10 = 1;
        while (true) {
            w[] wVarArr = this.U;
            if (i10 >= wVarArr.length) {
                return p10;
            }
            if (wVarArr[i10].p(p10) == p10) {
                i10++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public long s() {
        long s10 = this.O[0].s();
        int i10 = 1;
        while (true) {
            w[] wVarArr = this.O;
            if (i10 >= wVarArr.length) {
                if (s10 != c.f4201b) {
                    w[] wVarArr2 = this.U;
                    int length = wVarArr2.length;
                    int i11 = 0;
                    while (i11 < length) {
                        w wVar = wVarArr2[i11];
                        if (wVar == this.O[0] || wVar.p(s10) == s10) {
                            i11++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                }
                return s10;
            } else if (wVarArr[i10].s() == c.f4201b) {
                i10++;
            } else {
                throw new IllegalStateException("Child reported discontinuity.");
            }
        }
    }

    public TrackGroupArray t() {
        return this.T;
    }

    public void u(long j10, boolean z10) {
        for (w u10 : this.U) {
            u10.u(j10, z10);
        }
    }
}
