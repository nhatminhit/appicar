package z;

import w.e;
import z.e;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15752a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f15753b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f15754c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f15755d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f15756e = 8;

    /* renamed from: f  reason: collision with root package name */
    public static final int f15757f = 16;

    /* renamed from: g  reason: collision with root package name */
    public static final int f15758g = 32;

    /* renamed from: h  reason: collision with root package name */
    public static final int f15759h = 64;

    /* renamed from: i  reason: collision with root package name */
    public static final int f15760i = 128;

    /* renamed from: j  reason: collision with root package name */
    public static final int f15761j = 256;

    /* renamed from: k  reason: collision with root package name */
    public static final int f15762k = 512;

    /* renamed from: l  reason: collision with root package name */
    public static final int f15763l = 1024;

    /* renamed from: m  reason: collision with root package name */
    public static final int f15764m = 257;

    /* renamed from: n  reason: collision with root package name */
    public static boolean[] f15765n = new boolean[3];

    /* renamed from: o  reason: collision with root package name */
    public static final int f15766o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f15767p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f15768q = 2;

    public static void a(f fVar, e eVar, e eVar2) {
        eVar2.f15668n = -1;
        eVar2.f15670o = -1;
        e.b bVar = fVar.U[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar2.U[0] == e.b.MATCH_PARENT) {
            int i10 = eVar2.J.f15624g;
            int j02 = fVar.j0() - eVar2.L.f15624g;
            d dVar = eVar2.J;
            dVar.f15626i = eVar.u(dVar);
            d dVar2 = eVar2.L;
            dVar2.f15626i = eVar.u(dVar2);
            eVar.f(eVar2.J.f15626i, i10);
            eVar.f(eVar2.L.f15626i, j02);
            eVar2.f15668n = 2;
            eVar2.h1(i10, j02);
        }
        if (fVar.U[1] != bVar2 && eVar2.U[1] == e.b.MATCH_PARENT) {
            int i11 = eVar2.K.f15624g;
            int D = fVar.D() - eVar2.M.f15624g;
            d dVar3 = eVar2.K;
            dVar3.f15626i = eVar.u(dVar3);
            d dVar4 = eVar2.M;
            dVar4.f15626i = eVar.u(dVar4);
            eVar.f(eVar2.K.f15626i, i11);
            eVar.f(eVar2.M.f15626i, D);
            if (eVar2.f15655g0 > 0 || eVar2.i0() == 8) {
                d dVar5 = eVar2.N;
                dVar5.f15626i = eVar.u(dVar5);
                eVar.f(eVar2.N.f15626i, eVar2.f15655g0 + i11);
            }
            eVar2.f15670o = 2;
            eVar2.C1(i11, D);
        }
    }

    public static final boolean b(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
