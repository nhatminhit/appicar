package e7;

import android.net.Uri;
import android.text.TextUtils;
import b6.c;
import b6.v0;
import b7.i0;
import b7.s0;
import b7.w;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import e7.o;
import g7.e;
import g7.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import t7.b;
import t7.g0;
import t7.r0;
import w7.a;
import w7.q0;
import w7.s;

public final class j implements w, o.a, j.b {
    public final g O;
    public final g7.j P;
    public final f Q;
    @o0
    public final r0 R;
    public final g0 S;
    public final i0.a T;
    public final b U;
    public final IdentityHashMap<b7.r0, Integer> V = new IdentityHashMap<>();
    public final r W = new r();
    public final b7.j X;
    public final boolean Y;
    public final boolean Z;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public w.a f6938a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f6939b0;

    /* renamed from: c0  reason: collision with root package name */
    public TrackGroupArray f6940c0;

    /* renamed from: d0  reason: collision with root package name */
    public o[] f6941d0 = new o[0];

    /* renamed from: e0  reason: collision with root package name */
    public o[] f6942e0 = new o[0];

    /* renamed from: f0  reason: collision with root package name */
    public int[][] f6943f0 = new int[0][];

    /* renamed from: g0  reason: collision with root package name */
    public s0 f6944g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f6945h0;

    public j(g gVar, g7.j jVar, f fVar, @o0 r0 r0Var, g0 g0Var, i0.a aVar, b bVar, b7.j jVar2, boolean z10, boolean z11) {
        this.O = gVar;
        this.P = jVar;
        this.Q = fVar;
        this.R = r0Var;
        this.S = g0Var;
        this.T = aVar;
        this.U = bVar;
        this.X = jVar2;
        this.Y = z10;
        this.Z = z11;
        this.f6944g0 = jVar2.a(new s0[0]);
        aVar.I();
    }

    public static Format x(Format format, Format format2, boolean z10) {
        String str;
        int i10;
        int i11;
        int i12;
        String str2;
        String str3;
        Format format3 = format;
        Format format4 = format2;
        int i13 = -1;
        if (format4 != null) {
            String str4 = format4.T;
            int i14 = format4.f5077j0;
            int i15 = format4.Q;
            int i16 = format4.R;
            String str5 = format4.f5082o0;
            str3 = format4.P;
            str2 = str4;
            i12 = i14;
            i11 = i15;
            i10 = i16;
            str = str5;
        } else {
            String L = q0.L(format3.T, 1);
            if (z10) {
                int i17 = format3.f5077j0;
                int i18 = format3.Q;
                str2 = L;
                i11 = i18;
                i12 = i17;
                i10 = format3.R;
                str = format3.f5082o0;
                str3 = format3.P;
            } else {
                str2 = L;
                str3 = null;
                str = null;
                i11 = 0;
                i10 = 0;
                i12 = -1;
            }
        }
        String d10 = s.d(str2);
        if (z10) {
            i13 = format3.S;
        }
        return Format.o(format3.O, str3, format3.V, d10, str2, i13, i12, -1, (List<byte[]>) null, i11, i10, str);
    }

    public static Map<String, DrmInitData> y(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitData = list.get(i10);
            String str = drmInitData.Q;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData2 = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData2.Q, str)) {
                    drmInitData = drmInitData.g(drmInitData2);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            hashMap.put(str, drmInitData);
        }
        return hashMap;
    }

    public static Format z(Format format) {
        String L = q0.L(format.T, 2);
        return Format.F(format.O, format.P, format.V, s.d(L), L, format.S, format.f5069b0, format.f5070c0, format.f5071d0, (List<byte[]>) null, format.Q, format.R);
    }

    /* renamed from: A */
    public void k(o oVar) {
        this.f6938a0.k(this);
    }

    public void B() {
        this.P.n(this);
        for (o V2 : this.f6941d0) {
            V2.V();
        }
        this.f6938a0 = null;
        this.T.J();
    }

    public void a() {
        int i10 = this.f6939b0 - 1;
        this.f6939b0 = i10;
        if (i10 <= 0) {
            int i11 = 0;
            for (o t10 : this.f6941d0) {
                i11 += t10.t().O;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[i11];
            int i12 = 0;
            for (o oVar : this.f6941d0) {
                int i13 = oVar.t().O;
                int i14 = 0;
                while (i14 < i13) {
                    trackGroupArr[i12] = oVar.t().a(i14);
                    i14++;
                    i12++;
                }
            }
            this.f6940c0 = new TrackGroupArray(trackGroupArr);
            this.f6938a0.i(this);
        }
    }

    public long b() {
        return this.f6944g0.b();
    }

    public long c(long j10, v0 v0Var) {
        return j10;
    }

    public boolean d(long j10) {
        if (this.f6940c0 != null) {
            return this.f6944g0.d(j10);
        }
        for (o z10 : this.f6941d0) {
            z10.z();
        }
        return false;
    }

    public long e() {
        return this.f6944g0.e();
    }

    public void f(long j10) {
        this.f6944g0.f(j10);
    }

    public void g() {
        this.f6938a0.k(this);
    }

    public long h(f[] fVarArr, boolean[] zArr, b7.r0[] r0VarArr, boolean[] zArr2, long j10) {
        f[] fVarArr2 = fVarArr;
        b7.r0[] r0VarArr2 = r0VarArr;
        int[] iArr = new int[fVarArr2.length];
        int[] iArr2 = new int[fVarArr2.length];
        for (int i10 = 0; i10 < fVarArr2.length; i10++) {
            b7.r0 r0Var = r0VarArr2[i10];
            iArr[i10] = r0Var == null ? -1 : this.V.get(r0Var).intValue();
            iArr2[i10] = -1;
            f fVar = fVarArr2[i10];
            if (fVar != null) {
                TrackGroup a10 = fVar.a();
                int i11 = 0;
                while (true) {
                    o[] oVarArr = this.f6941d0;
                    if (i11 >= oVarArr.length) {
                        break;
                    } else if (oVarArr[i11].t().b(a10) != -1) {
                        iArr2[i10] = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.V.clear();
        int length = fVarArr2.length;
        b7.r0[] r0VarArr3 = new b7.r0[length];
        b7.r0[] r0VarArr4 = new b7.r0[fVarArr2.length];
        f[] fVarArr3 = new f[fVarArr2.length];
        o[] oVarArr2 = new o[this.f6941d0.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f6941d0.length) {
            for (int i14 = 0; i14 < fVarArr2.length; i14++) {
                f fVar2 = null;
                r0VarArr4[i14] = iArr[i14] == i13 ? r0VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    fVar2 = fVarArr2[i14];
                }
                fVarArr3[i14] = fVar2;
            }
            o oVar = this.f6941d0[i13];
            o oVar2 = oVar;
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            f[] fVarArr4 = fVarArr3;
            o[] oVarArr3 = oVarArr2;
            boolean Z2 = oVar.Z(fVarArr3, zArr, r0VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                boolean z12 = true;
                if (i18 >= fVarArr2.length) {
                    break;
                }
                if (iArr2[i18] == i17) {
                    a.i(r0VarArr4[i18] != null);
                    r0VarArr3[i18] = r0VarArr4[i18];
                    this.V.put(r0VarArr4[i18], Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    if (r0VarArr4[i18] != null) {
                        z12 = false;
                    }
                    a.i(z12);
                }
                i18++;
            }
            o[] oVarArr4 = oVarArr3;
            if (z11) {
                oVarArr4[i15] = oVar2;
                i12 = i15 + 1;
                if (i15 == 0) {
                    oVar2.a0(true);
                    if (!Z2) {
                        o[] oVarArr5 = this.f6942e0;
                        if (oVarArr5.length != 0) {
                            if (oVar2 == oVarArr5[0]) {
                            }
                            this.W.b();
                            z10 = true;
                        }
                    }
                    this.W.b();
                    z10 = true;
                } else {
                    oVar2.a0(false);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            r0VarArr2 = r0VarArr;
            oVarArr2 = oVarArr4;
            length = i16;
            fVarArr3 = fVarArr4;
        }
        System.arraycopy(r0VarArr3, 0, r0VarArr2, 0, length);
        o[] oVarArr6 = (o[]) Arrays.copyOf(oVarArr2, i12);
        this.f6942e0 = oVarArr6;
        this.f6944g0 = this.X.a(oVarArr6);
        return j10;
    }

    public boolean j(Uri uri, long j10) {
        boolean z10 = true;
        for (o R2 : this.f6941d0) {
            z10 &= R2.R(uri, j10);
        }
        this.f6938a0.k(this);
        return z10;
    }

    public void l(Uri uri) {
        this.P.l(uri);
    }

    public List<StreamKey> m(List<f> list) {
        TrackGroupArray trackGroupArray;
        int[] iArr;
        int i10;
        j jVar = this;
        e eVar = (e) a.g(jVar.P.h());
        boolean z10 = !eVar.f8094e.isEmpty();
        int length = jVar.f6941d0.length - eVar.f8097h.size();
        int i11 = 0;
        if (z10) {
            o oVar = jVar.f6941d0[0];
            iArr = jVar.f6943f0[0];
            trackGroupArray = oVar.t();
            i10 = oVar.F();
        } else {
            iArr = new int[0];
            trackGroupArray = TrackGroupArray.R;
            i10 = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        for (f next : list) {
            TrackGroup a10 = next.a();
            int b10 = trackGroupArray.b(a10);
            if (b10 == -1) {
                int i12 = z10;
                while (true) {
                    o[] oVarArr = jVar.f6941d0;
                    if (i12 >= oVarArr.length) {
                        break;
                    } else if (oVarArr[i12].t().b(a10) != -1) {
                        int i13 = i12 < length ? 1 : 2;
                        int[] iArr2 = jVar.f6943f0[i12];
                        int i14 = 0;
                        while (i14 < next.length()) {
                            arrayList.add(new StreamKey(i13, iArr2[next.h(i14)]));
                            i14++;
                        }
                    } else {
                        i12++;
                        jVar = this;
                    }
                }
            } else if (b10 == i10) {
                for (int i15 = i11; i15 < next.length(); i15++) {
                    arrayList.add(new StreamKey(i11, iArr[next.h(i15)]));
                }
                z12 = true;
            } else {
                z11 = true;
            }
            jVar = this;
            i11 = 0;
        }
        if (z11 && !z12) {
            int i16 = iArr[0];
            int i17 = eVar.f8094e.get(i16).f8108b.S;
            for (int i18 = 1; i18 < iArr.length; i18++) {
                int i19 = eVar.f8094e.get(iArr[i18]).f8108b.S;
                if (i19 < i17) {
                    i16 = iArr[i18];
                    i17 = i19;
                }
            }
            arrayList.add(new StreamKey(0, i16));
        }
        return arrayList;
    }

    public void n(w.a aVar, long j10) {
        this.f6938a0 = aVar;
        this.P.a(this);
        v(j10);
    }

    public void o() throws IOException {
        for (o o10 : this.f6941d0) {
            o10.o();
        }
    }

    public long p(long j10) {
        o[] oVarArr = this.f6942e0;
        if (oVarArr.length > 0) {
            boolean Y2 = oVarArr[0].Y(j10, false);
            int i10 = 1;
            while (true) {
                o[] oVarArr2 = this.f6942e0;
                if (i10 >= oVarArr2.length) {
                    break;
                }
                oVarArr2[i10].Y(j10, Y2);
                i10++;
            }
            if (Y2) {
                this.W.b();
            }
        }
        return j10;
    }

    public final void q(long j10, List<e.a> list, List<o> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        List<e.a> list4 = list;
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list4.get(i10).f8106d;
            if (!hashSet.add(str)) {
                List<o> list5 = list2;
                List<int[]> list6 = list3;
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (q0.e(str, list4.get(i11).f8106d)) {
                        e.a aVar = list4.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f8103a);
                        arrayList2.add(aVar.f8104b);
                        z10 &= aVar.f8104b.T != null;
                    }
                }
                o w10 = w(1, (Uri[]) arrayList.toArray(new Uri[0]), (Format[]) arrayList2.toArray(new Format[0]), (Format) null, Collections.emptyList(), map, j10);
                list3.add(q0.W0(arrayList3));
                list2.add(w10);
                if (this.Y && z10) {
                    w10.T(new TrackGroupArray(new TrackGroup((Format[]) arrayList2.toArray(new Format[0]))), 0, TrackGroupArray.R);
                }
            }
        }
    }

    public final void r(e eVar, long j10, List<o> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z10;
        boolean z11;
        e eVar2 = eVar;
        int size = eVar2.f8094e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < eVar2.f8094e.size(); i12++) {
            Format format = eVar2.f8094e.get(i12).f8108b;
            if (format.f5070c0 > 0 || q0.L(format.T, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (q0.L(format.T, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z11 = true;
            z10 = false;
        } else if (i11 < size) {
            size -= i11;
            z11 = false;
            z10 = true;
        } else {
            z11 = false;
            z10 = false;
        }
        Uri[] uriArr = new Uri[size];
        Format[] formatArr = new Format[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < eVar2.f8094e.size(); i14++) {
            if ((!z11 || iArr[i14] == 2) && (!z10 || iArr[i14] != 1)) {
                e.b bVar = eVar2.f8094e.get(i14);
                uriArr[i13] = bVar.f8107a;
                formatArr[i13] = bVar.f8108b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = formatArr[0].T;
        o w10 = w(0, uriArr, formatArr, eVar2.f8099j, eVar2.f8100k, map, j10);
        list.add(w10);
        list2.add(iArr2);
        if (this.Y && str != null) {
            boolean z12 = q0.L(str, 2) != null;
            boolean z13 = q0.L(str, 1) != null;
            ArrayList arrayList = new ArrayList();
            if (z12) {
                Format[] formatArr2 = new Format[size];
                for (int i15 = 0; i15 < size; i15++) {
                    formatArr2[i15] = z(formatArr[i15]);
                }
                arrayList.add(new TrackGroup(formatArr2));
                if (z13 && (eVar2.f8099j != null || eVar2.f8096g.isEmpty())) {
                    arrayList.add(new TrackGroup(x(formatArr[0], eVar2.f8099j, false)));
                }
                List<Format> list3 = eVar2.f8100k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new TrackGroup(list3.get(i16)));
                    }
                }
            } else if (z13) {
                Format[] formatArr3 = new Format[size];
                for (int i17 = 0; i17 < size; i17++) {
                    formatArr3[i17] = x(formatArr[i17], eVar2.f8099j, true);
                }
                arrayList.add(new TrackGroup(formatArr3));
            } else {
                throw new IllegalArgumentException("Unexpected codecs attribute: " + str);
            }
            TrackGroup trackGroup = new TrackGroup(Format.w("ID3", s.Z, (String) null, -1, (DrmInitData) null));
            arrayList.add(trackGroup);
            w10.T(new TrackGroupArray((TrackGroup[]) arrayList.toArray(new TrackGroup[0])), 0, new TrackGroupArray(trackGroup));
        }
    }

    public long s() {
        if (this.f6945h0) {
            return c.f4201b;
        }
        this.T.L();
        this.f6945h0 = true;
        return c.f4201b;
    }

    public TrackGroupArray t() {
        return this.f6940c0;
    }

    public void u(long j10, boolean z10) {
        for (o u10 : this.f6942e0) {
            u10.u(j10, z10);
        }
    }

    public final void v(long j10) {
        e eVar = (e) a.g(this.P.h());
        Map<String, DrmInitData> y10 = this.Z ? y(eVar.f8102m) : Collections.emptyMap();
        boolean z10 = !eVar.f8094e.isEmpty();
        List<e.a> list = eVar.f8096g;
        List<e.a> list2 = eVar.f8097h;
        this.f6939b0 = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            r(eVar, j10, arrayList, arrayList2, y10);
        }
        q(j10, list, arrayList, arrayList2, y10);
        int i10 = 0;
        while (i10 < list2.size()) {
            e.a aVar = list2.get(i10);
            int i11 = i10;
            o w10 = w(3, new Uri[]{aVar.f8103a}, new Format[]{aVar.f8104b}, (Format) null, Collections.emptyList(), y10, j10);
            arrayList2.add(new int[]{i11});
            arrayList.add(w10);
            w10.T(new TrackGroupArray(new TrackGroup(aVar.f8104b)), 0, TrackGroupArray.R);
            i10 = i11 + 1;
        }
        this.f6941d0 = (o[]) arrayList.toArray(new o[0]);
        this.f6943f0 = (int[][]) arrayList2.toArray(new int[0][]);
        o[] oVarArr = this.f6941d0;
        this.f6939b0 = oVarArr.length;
        oVarArr[0].a0(true);
        for (o z11 : this.f6941d0) {
            z11.z();
        }
        this.f6942e0 = this.f6941d0;
    }

    public final o w(int i10, Uri[] uriArr, Format[] formatArr, Format format, List<Format> list, Map<String, DrmInitData> map, long j10) {
        return new o(i10, this, new e(this.O, this.P, uriArr, formatArr, this.Q, this.R, this.W, list), map, this.U, j10, format, this.S, this.T);
    }
}
