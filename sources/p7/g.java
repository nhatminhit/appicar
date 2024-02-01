package p7;

import android.text.TextUtils;
import b6.j0;
import h7.c;
import java.util.ArrayList;
import java.util.List;
import p7.e;
import w7.w;

public final class g extends c {

    /* renamed from: t  reason: collision with root package name */
    public static final int f11718t = -1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f11719u = 0;

    /* renamed from: v  reason: collision with root package name */
    public static final int f11720v = 1;

    /* renamed from: w  reason: collision with root package name */
    public static final int f11721w = 2;

    /* renamed from: x  reason: collision with root package name */
    public static final int f11722x = 3;

    /* renamed from: y  reason: collision with root package name */
    public static final String f11723y = "NOTE";

    /* renamed from: z  reason: collision with root package name */
    public static final String f11724z = "STYLE";

    /* renamed from: o  reason: collision with root package name */
    public final f f11725o = new f();

    /* renamed from: p  reason: collision with root package name */
    public final w f11726p = new w();

    /* renamed from: q  reason: collision with root package name */
    public final e.b f11727q = new e.b();

    /* renamed from: r  reason: collision with root package name */
    public final a f11728r = new a();

    /* renamed from: s  reason: collision with root package name */
    public final List<d> f11729s = new ArrayList();

    public g() {
        super("WebvttDecoder");
    }

    public static int D(w wVar) {
        int i10 = 0;
        int i11 = -1;
        while (i11 == -1) {
            i10 = wVar.c();
            String n10 = wVar.n();
            i11 = n10 == null ? 0 : f11724z.equals(n10) ? 2 : n10.startsWith(f11723y) ? 1 : 3;
        }
        wVar.Q(i10);
        return i11;
    }

    public static void E(w wVar) {
        do {
        } while (!TextUtils.isEmpty(wVar.n()));
    }

    /* renamed from: C */
    public i z(byte[] bArr, int i10, boolean z10) throws h7.g {
        this.f11726p.O(bArr, i10);
        this.f11727q.c();
        this.f11729s.clear();
        try {
            h.e(this.f11726p);
            do {
            } while (!TextUtils.isEmpty(this.f11726p.n()));
            ArrayList arrayList = new ArrayList();
            while (true) {
                int D = D(this.f11726p);
                if (D == 0) {
                    return new i(arrayList);
                }
                if (D == 1) {
                    E(this.f11726p);
                } else if (D == 2) {
                    if (arrayList.isEmpty()) {
                        this.f11726p.n();
                        this.f11729s.addAll(this.f11728r.d(this.f11726p));
                    } else {
                        throw new h7.g("A style block was found after the first cue.");
                    }
                } else if (D == 3 && this.f11725o.i(this.f11726p, this.f11727q, this.f11729s)) {
                    arrayList.add(this.f11727q.a());
                    this.f11727q.c();
                }
            }
        } catch (j0 e10) {
            throw new h7.g((Exception) e10);
        }
    }
}
