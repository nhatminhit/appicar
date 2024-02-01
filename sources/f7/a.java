package f7;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.e;
import g7.f;
import g7.g;
import g7.h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t7.j0;
import t7.l;
import t7.o;
import w7.l0;
import z6.u;

public final class a extends e<g> {
    public a(Uri uri, List<StreamKey> list, u uVar) {
        super(uri, list, uVar);
    }

    public static g j(l lVar, o oVar) throws IOException {
        return (g) j0.h(lVar, new h(), oVar, 4);
    }

    public final void f(List<Uri> list, List<o> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list2.add(e.b(list.get(i10)));
        }
    }

    public final void g(f fVar, f.b bVar, HashSet<Uri> hashSet, ArrayList<e.b> arrayList) {
        String str = fVar.f8129a;
        long j10 = fVar.f8118f + bVar.T;
        String str2 = bVar.V;
        if (str2 != null) {
            Uri e10 = l0.e(str, str2);
            if (hashSet.add(e10)) {
                arrayList.add(new e.b(j10, e.b(e10)));
            }
        }
        arrayList.add(new e.b(j10, new o(l0.e(str, bVar.O), bVar.X, bVar.Y, (String) null)));
    }

    /* renamed from: h */
    public g c(l lVar, o oVar) throws IOException {
        return j(lVar, oVar);
    }

    /* renamed from: i */
    public List<e.b> d(l lVar, g gVar, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (gVar instanceof g7.e) {
            f(((g7.e) gVar).f8093d, arrayList);
        } else {
            arrayList.add(e.b(Uri.parse(gVar.f8129a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            arrayList2.add(new e.b(0, oVar));
            try {
                f fVar = (f) j(lVar, oVar);
                f.b bVar = null;
                List<f.b> list = fVar.f8127o;
                for (int i10 = 0; i10 < list.size(); i10++) {
                    f.b bVar2 = list.get(i10);
                    f.b bVar3 = bVar2.P;
                    if (!(bVar3 == null || bVar3 == bVar)) {
                        g(fVar, bVar3, hashSet, arrayList2);
                        bVar = bVar3;
                    }
                    g(fVar, bVar2, hashSet, arrayList2);
                }
            } catch (IOException e10) {
                if (!z10) {
                    throw e10;
                }
            }
        }
        return arrayList2;
    }
}
