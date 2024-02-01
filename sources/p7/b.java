package p7;

import h7.c;
import h7.g;
import java.util.ArrayList;
import java.util.Collections;
import p7.e;
import w7.q0;
import w7.w;

public final class b extends c {

    /* renamed from: q  reason: collision with root package name */
    public static final int f11645q = 8;

    /* renamed from: r  reason: collision with root package name */
    public static final int f11646r = q0.T("payl");

    /* renamed from: s  reason: collision with root package name */
    public static final int f11647s = q0.T("sttg");

    /* renamed from: t  reason: collision with root package name */
    public static final int f11648t = q0.T("vttc");

    /* renamed from: o  reason: collision with root package name */
    public final w f11649o = new w();

    /* renamed from: p  reason: collision with root package name */
    public final e.b f11650p = new e.b();

    public b() {
        super("Mp4WebvttDecoder");
    }

    public static h7.b D(w wVar, e.b bVar, int i10) throws g {
        bVar.c();
        while (i10 > 0) {
            if (i10 >= 8) {
                int l10 = wVar.l();
                int l11 = wVar.l();
                int i11 = l10 - 8;
                String G = q0.G(wVar.f14880a, wVar.c(), i11);
                wVar.R(i11);
                i10 = (i10 - 8) - i11;
                if (l11 == f11647s) {
                    f.j(G, bVar);
                } else if (l11 == f11646r) {
                    f.k((String) null, G.trim(), bVar, Collections.emptyList());
                }
            } else {
                throw new g("Incomplete vtt cue box header found.");
            }
        }
        return bVar.a();
    }

    /* renamed from: C */
    public c z(byte[] bArr, int i10, boolean z10) throws g {
        this.f11649o.O(bArr, i10);
        ArrayList arrayList = new ArrayList();
        while (this.f11649o.a() > 0) {
            if (this.f11649o.a() >= 8) {
                int l10 = this.f11649o.l();
                if (this.f11649o.l() == f11648t) {
                    arrayList.add(D(this.f11649o, this.f11650p, l10 - 8));
                } else {
                    this.f11649o.R(l10 - 8);
                }
            } else {
                throw new g("Incomplete Mp4Webvtt Top Level box header found.");
            }
        }
        return new c(arrayList);
    }
}
