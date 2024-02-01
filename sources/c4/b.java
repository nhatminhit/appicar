package c4;

import a4.j;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import c4.d;
import d.g1;
import java.util.HashMap;
import t4.m;
import z3.e;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final j f4808a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4809b;

    /* renamed from: c  reason: collision with root package name */
    public final v3.b f4810c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f4811d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public a f4812e;

    public b(j jVar, e eVar, v3.b bVar) {
        this.f4808a = jVar;
        this.f4809b = eVar;
        this.f4810c = bVar;
    }

    public static int b(d dVar) {
        return m.g(dVar.d(), dVar.b(), dVar.a());
    }

    @g1
    public c a(d... dVarArr) {
        long e10 = (this.f4808a.e() - this.f4808a.d()) + this.f4809b.e();
        int i10 = 0;
        for (d c10 : dVarArr) {
            i10 += c10.c();
        }
        float f10 = ((float) e10) / ((float) i10);
        HashMap hashMap = new HashMap();
        for (d dVar : dVarArr) {
            hashMap.put(dVar, Integer.valueOf(Math.round(((float) dVar.c()) * f10) / b(dVar)));
        }
        return new c(hashMap);
    }

    public void c(d.a... aVarArr) {
        a aVar = this.f4812e;
        if (aVar != null) {
            aVar.b();
        }
        d[] dVarArr = new d[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            d.a aVar2 = aVarArr[i10];
            if (aVar2.b() == null) {
                aVar2.c(this.f4810c == v3.b.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            dVarArr[i10] = aVar2.a();
        }
        a aVar3 = new a(this.f4809b, this.f4808a, a(dVarArr));
        this.f4812e = aVar3;
        this.f4811d.post(aVar3);
    }
}
