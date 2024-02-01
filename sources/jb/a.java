package jb;

import ib.c;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import qa.e;
import qa.m;
import qa.q;
import qa.r;
import qa.s;
import qa.t;
import vb.i;
import ya.g;

public final class a extends ub.a implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final r[] f19897c = new r[0];

    /* renamed from: d  reason: collision with root package name */
    public static final t[] f19898d = new t[0];

    public static final class b implements Serializable, Comparator<r> {
        public b() {
        }

        /* renamed from: a */
        public int compare(r rVar, r rVar2) {
            Map<s, Object> e10 = rVar.e();
            s sVar = s.STRUCTURED_APPEND_SEQUENCE;
            return Integer.compare(((Integer) e10.get(sVar)).intValue(), ((Integer) rVar2.e().get(sVar)).intValue());
        }
    }

    public static List<r> h(List<r> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList<r> arrayList2 = new ArrayList<>();
        for (r next : list) {
            if (next.e().containsKey(s.STRUCTURED_APPEND_SEQUENCE)) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return list;
        }
        Collections.sort(arrayList2, new b());
        StringBuilder sb2 = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        for (r rVar : arrayList2) {
            sb2.append(rVar.g());
            byte[] d10 = rVar.d();
            byteArrayOutputStream.write(d10, 0, d10.length);
            Iterable<byte[]> iterable = (Iterable) rVar.e().get(s.BYTE_SEGMENTS);
            if (iterable != null) {
                for (byte[] bArr : iterable) {
                    byteArrayOutputStream2.write(bArr, 0, bArr.length);
                }
            }
        }
        r rVar2 = new r(sb2.toString(), byteArrayOutputStream.toByteArray(), f19898d, qa.a.QR_CODE);
        if (byteArrayOutputStream2.size() > 0) {
            rVar2.j(s.BYTE_SEGMENTS, Collections.singletonList(byteArrayOutputStream2.toByteArray()));
        }
        arrayList.add(rVar2);
        return arrayList;
    }

    public r[] c(qa.c cVar, Map<e, ?> map) throws m {
        ArrayList arrayList = new ArrayList();
        for (g gVar : new kb.a(cVar.b()).n(map)) {
            try {
                ya.e d10 = f().d(gVar.a(), map);
                t[] b10 = gVar.b();
                if (d10.f() instanceof i) {
                    ((i) d10.f()).a(b10);
                }
                r rVar = new r(d10.j(), d10.g(), b10, qa.a.QR_CODE);
                List<byte[]> a10 = d10.a();
                if (a10 != null) {
                    rVar.j(s.BYTE_SEGMENTS, a10);
                }
                String b11 = d10.b();
                if (b11 != null) {
                    rVar.j(s.ERROR_CORRECTION_LEVEL, b11);
                }
                if (d10.k()) {
                    rVar.j(s.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(d10.i()));
                    rVar.j(s.STRUCTURED_APPEND_PARITY, Integer.valueOf(d10.h()));
                }
                arrayList.add(rVar);
            } catch (q unused) {
            }
        }
        return arrayList.isEmpty() ? f19897c : (r[]) h(arrayList).toArray(f19897c);
    }

    public r[] d(qa.c cVar) throws m {
        return c(cVar, (Map<e, ?>) null);
    }
}
