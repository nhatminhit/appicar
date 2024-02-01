package kh;

import java.util.ArrayList;
import jh.f;
import kh.i;

public enum c {
    Initial {
        public boolean n(i iVar, b bVar) {
            if (c.m(iVar)) {
                return true;
            }
            if (iVar.h()) {
                bVar.Q(iVar.b());
            } else if (iVar.i()) {
                i.e c10 = iVar.c();
                jh.g gVar = new jh.g(bVar.f20392h.c(c10.p()), c10.r(), c10.s());
                gVar.v0(c10.q());
                bVar.y().v0(gVar);
                if (c10.t()) {
                    bVar.y().N2(f.b.quirks);
                }
                bVar.D0(c.BeforeHtml);
            } else {
                bVar.D0(c.BeforeHtml);
                return bVar.g(iVar);
            }
            return true;
        }
    },
    BeforeHtml {
        public boolean n(i iVar, b bVar) {
            if (iVar.i()) {
                bVar.r(this);
                return false;
            } else if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (c.m(iVar)) {
                bVar.P(iVar.a());
                return true;
            } else if (iVar.l() && iVar.e().E().equals("html")) {
                bVar.N(iVar.e());
                bVar.D0(c.BeforeHead);
                return true;
            } else if (iVar.k() && ih.c.d(iVar.d().E(), y.f20268e)) {
                return o(iVar, bVar);
            } else {
                if (!iVar.k()) {
                    return o(iVar, bVar);
                }
                bVar.r(this);
                return false;
            }
        }

        public final boolean o(i iVar, b bVar) {
            bVar.X("html");
            bVar.D0(c.BeforeHead);
            return bVar.g(iVar);
        }
    },
    BeforeHead {
        public boolean n(i iVar, b bVar) {
            if (c.m(iVar)) {
                bVar.P(iVar.a());
                return true;
            } else if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar.r(this);
                return false;
            } else if (iVar.l() && iVar.e().E().equals("html")) {
                return c.InBody.n(iVar, bVar);
            } else {
                if (iVar.l() && iVar.e().E().equals(n7.b.f10946n)) {
                    bVar.B0(bVar.N(iVar.e()));
                    bVar.D0(c.InHead);
                    return true;
                } else if (iVar.k() && ih.c.d(iVar.d().E(), y.f20268e)) {
                    bVar.i(n7.b.f10946n);
                    return bVar.g(iVar);
                } else if (iVar.k()) {
                    bVar.r(this);
                    return false;
                } else {
                    bVar.i(n7.b.f10946n);
                    return bVar.g(iVar);
                }
            }
        }
    },
    InHead {
        public boolean n(i iVar, b bVar) {
            c cVar;
            if (c.m(iVar)) {
                bVar.P(iVar.a());
                return true;
            }
            int i10 = p.f20263a[iVar.f20304a.ordinal()];
            if (i10 == 1) {
                bVar.Q(iVar.b());
            } else if (i10 != 2) {
                if (i10 == 3) {
                    i.h e10 = iVar.e();
                    String E = e10.E();
                    if (E.equals("html")) {
                        return c.InBody.n(iVar, bVar);
                    }
                    if (ih.c.d(E, y.f20264a)) {
                        jh.h R = bVar.R(e10);
                        if (E.equals("base") && R.G("href")) {
                            bVar.g0(R);
                        }
                    } else if (E.equals("meta")) {
                        bVar.R(e10);
                    } else if (E.equals("title")) {
                        c.k(e10, bVar);
                    } else if (ih.c.d(E, y.f20265b)) {
                        c.j(e10, bVar);
                    } else if (E.equals("noscript")) {
                        bVar.N(e10);
                        cVar = c.InHeadNoscript;
                    } else if (E.equals("script")) {
                        bVar.f20387c.y(l.ScriptData);
                        bVar.f0();
                        bVar.D0(c.Text);
                        bVar.N(e10);
                    } else if (!E.equals(n7.b.f10946n)) {
                        return o(iVar, bVar);
                    } else {
                        bVar.r(this);
                        return false;
                    }
                } else if (i10 != 4) {
                    return o(iVar, bVar);
                } else {
                    String E2 = iVar.d().E();
                    if (E2.equals(n7.b.f10946n)) {
                        bVar.k0();
                        cVar = c.AfterHead;
                    } else if (ih.c.d(E2, y.f20266c)) {
                        return o(iVar, bVar);
                    } else {
                        bVar.r(this);
                        return false;
                    }
                }
                bVar.D0(cVar);
            } else {
                bVar.r(this);
                return false;
            }
            return true;
        }

        public final boolean o(i iVar, m mVar) {
            mVar.h(n7.b.f10946n);
            return mVar.g(iVar);
        }
    },
    InHeadNoscript {
        public boolean n(i iVar, b bVar) {
            if (iVar.i()) {
                bVar.r(this);
                return true;
            } else if (iVar.l() && iVar.e().E().equals("html")) {
                return bVar.o0(iVar, c.InBody);
            } else {
                if (iVar.k() && iVar.d().E().equals("noscript")) {
                    bVar.k0();
                    bVar.D0(c.InHead);
                    return true;
                } else if (c.m(iVar) || iVar.h() || (iVar.l() && ih.c.d(iVar.e().E(), y.f20269f))) {
                    return bVar.o0(iVar, c.InHead);
                } else {
                    if (iVar.k() && iVar.d().E().equals(n7.b.f10951s)) {
                        return o(iVar, bVar);
                    }
                    if ((!iVar.l() || !ih.c.d(iVar.e().E(), y.K)) && !iVar.k()) {
                        return o(iVar, bVar);
                    }
                    bVar.r(this);
                    return false;
                }
            }
        }

        public final boolean o(i iVar, b bVar) {
            bVar.r(this);
            bVar.P(new i.c().p(iVar.toString()));
            return true;
        }
    },
    AfterHead {
        public boolean n(i iVar, b bVar) {
            c cVar;
            if (c.m(iVar)) {
                bVar.P(iVar.a());
                return true;
            } else if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar.r(this);
                return true;
            } else {
                if (iVar.l()) {
                    i.h e10 = iVar.e();
                    String E = e10.E();
                    if (E.equals("html")) {
                        return bVar.o0(iVar, c.InBody);
                    }
                    if (E.equals("body")) {
                        bVar.N(e10);
                        bVar.s(false);
                        cVar = c.InBody;
                    } else if (E.equals("frameset")) {
                        bVar.N(e10);
                        cVar = c.InFrameset;
                    } else if (ih.c.d(E, y.f20270g)) {
                        bVar.r(this);
                        jh.h B = bVar.B();
                        bVar.p0(B);
                        bVar.o0(iVar, c.InHead);
                        bVar.t0(B);
                        return true;
                    } else if (E.equals(n7.b.f10946n)) {
                        bVar.r(this);
                        return false;
                    }
                    bVar.D0(cVar);
                    return true;
                } else if (iVar.k() && !ih.c.d(iVar.d().E(), y.f20267d)) {
                    bVar.r(this);
                    return false;
                }
                o(iVar, bVar);
                return true;
            }
        }

        public final boolean o(i iVar, b bVar) {
            bVar.i("body");
            bVar.s(true);
            return bVar.g(iVar);
        }
    },
    InBody {
        public boolean n(i iVar, b bVar) {
            int i10 = p.f20263a[iVar.f20304a.ordinal()];
            if (i10 == 1) {
                bVar.Q(iVar.b());
            } else if (i10 == 2) {
                bVar.r(this);
                return false;
            } else if (i10 == 3) {
                return r(iVar, bVar);
            } else {
                if (i10 == 4) {
                    return p(iVar, bVar);
                }
                if (i10 == 5) {
                    i.c a10 = iVar.a();
                    if (a10.q().equals(c.f20261l0)) {
                        bVar.r(this);
                        return false;
                    } else if (!bVar.t() || !c.m(a10)) {
                        bVar.r0();
                        bVar.P(a10);
                        bVar.s(false);
                    } else {
                        bVar.r0();
                        bVar.P(a10);
                    }
                }
            }
            return true;
        }

        public boolean o(i iVar, b bVar) {
            String str = iVar.d().f20315c;
            ArrayList<jh.h> D = bVar.D();
            int size = D.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                jh.h hVar = D.get(size);
                if (hVar.M1().equals(str)) {
                    bVar.v(str);
                    if (!str.equals(bVar.a().M1())) {
                        bVar.r(this);
                    }
                    bVar.m0(str);
                } else if (bVar.d0(hVar)) {
                    bVar.r(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x01b6, code lost:
            if (r10.a().M1().equals(r1) == false) goto L_0x01b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x01b8, code lost:
            r10.r(r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:105:0x01bb, code lost:
            r10.m0(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x01fc, code lost:
            if (r10.a().M1().equals(r1) == false) goto L_0x01b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0226, code lost:
            if (r10.a().M1().equals(r1) == false) goto L_0x01b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x0229, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x010f, code lost:
            if (r10.a().M1().equals(r1) == false) goto L_0x01b8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean p(kh.i r9, kh.b r10) {
            /*
                r8 = this;
                kh.i$g r0 = r9.d()
                java.lang.String r1 = r0.E()
                r1.hashCode()
                int r2 = r1.hashCode()
                r3 = 1
                java.lang.String r4 = "br"
                java.lang.String r5 = "body"
                r6 = 0
                r7 = -1
                switch(r2) {
                    case 112: goto L_0x00d4;
                    case 3152: goto L_0x00cb;
                    case 3200: goto L_0x00c0;
                    case 3216: goto L_0x00b5;
                    case 3273: goto L_0x00aa;
                    case 3274: goto L_0x009f;
                    case 3275: goto L_0x0094;
                    case 3276: goto L_0x0089;
                    case 3277: goto L_0x007b;
                    case 3278: goto L_0x006d;
                    case 3453: goto L_0x005f;
                    case 3029410: goto L_0x0053;
                    case 3148996: goto L_0x0045;
                    case 3213227: goto L_0x0037;
                    case 3536714: goto L_0x0029;
                    case 1869063452: goto L_0x001b;
                    default: goto L_0x0019;
                }
            L_0x0019:
                goto L_0x00de
            L_0x001b:
                java.lang.String r2 = "sarcasm"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0025
                goto L_0x00de
            L_0x0025:
                r7 = 15
                goto L_0x00de
            L_0x0029:
                java.lang.String r2 = "span"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0033
                goto L_0x00de
            L_0x0033:
                r7 = 14
                goto L_0x00de
            L_0x0037:
                java.lang.String r2 = "html"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0041
                goto L_0x00de
            L_0x0041:
                r7 = 13
                goto L_0x00de
            L_0x0045:
                java.lang.String r2 = "form"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x004f
                goto L_0x00de
            L_0x004f:
                r7 = 12
                goto L_0x00de
            L_0x0053:
                boolean r2 = r1.equals(r5)
                if (r2 != 0) goto L_0x005b
                goto L_0x00de
            L_0x005b:
                r7 = 11
                goto L_0x00de
            L_0x005f:
                java.lang.String r2 = "li"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0069
                goto L_0x00de
            L_0x0069:
                r7 = 10
                goto L_0x00de
            L_0x006d:
                java.lang.String r2 = "h6"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0077
                goto L_0x00de
            L_0x0077:
                r7 = 9
                goto L_0x00de
            L_0x007b:
                java.lang.String r2 = "h5"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0085
                goto L_0x00de
            L_0x0085:
                r7 = 8
                goto L_0x00de
            L_0x0089:
                java.lang.String r2 = "h4"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x0092
                goto L_0x00de
            L_0x0092:
                r7 = 7
                goto L_0x00de
            L_0x0094:
                java.lang.String r2 = "h3"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x009d
                goto L_0x00de
            L_0x009d:
                r7 = 6
                goto L_0x00de
            L_0x009f:
                java.lang.String r2 = "h2"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x00a8
                goto L_0x00de
            L_0x00a8:
                r7 = 5
                goto L_0x00de
            L_0x00aa:
                java.lang.String r2 = "h1"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x00b3
                goto L_0x00de
            L_0x00b3:
                r7 = 4
                goto L_0x00de
            L_0x00b5:
                java.lang.String r2 = "dt"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x00be
                goto L_0x00de
            L_0x00be:
                r7 = 3
                goto L_0x00de
            L_0x00c0:
                java.lang.String r2 = "dd"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x00c9
                goto L_0x00de
            L_0x00c9:
                r7 = 2
                goto L_0x00de
            L_0x00cb:
                boolean r2 = r1.equals(r4)
                if (r2 != 0) goto L_0x00d2
                goto L_0x00de
            L_0x00d2:
                r7 = r3
                goto L_0x00de
            L_0x00d4:
                java.lang.String r2 = "p"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x00dd
                goto L_0x00de
            L_0x00dd:
                r7 = r6
            L_0x00de:
                switch(r7) {
                    case 0: goto L_0x0206;
                    case 1: goto L_0x01ff;
                    case 2: goto L_0x01e3;
                    case 3: goto L_0x01e3;
                    case 4: goto L_0x01bf;
                    case 5: goto L_0x01bf;
                    case 6: goto L_0x01bf;
                    case 7: goto L_0x01bf;
                    case 8: goto L_0x01bf;
                    case 9: goto L_0x01bf;
                    case 10: goto L_0x019d;
                    case 11: goto L_0x018c;
                    case 12: goto L_0x015e;
                    case 13: goto L_0x0153;
                    case 14: goto L_0x014e;
                    case 15: goto L_0x014e;
                    default: goto L_0x00e1;
                }
            L_0x00e1:
                java.lang.String[] r0 = kh.c.y.f20282s
                boolean r0 = ih.c.d(r1, r0)
                if (r0 == 0) goto L_0x00ee
                boolean r9 = r8.q(r9, r10)
                return r9
            L_0x00ee:
                java.lang.String[] r0 = kh.c.y.f20281r
                boolean r0 = ih.c.d(r1, r0)
                if (r0 == 0) goto L_0x0113
                boolean r9 = r10.G(r1)
                if (r9 != 0) goto L_0x0100
                r10.r(r8)
                return r6
            L_0x0100:
                r10.u()
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x01bb
                goto L_0x01b8
            L_0x0113:
                java.lang.String[] r0 = kh.c.y.f20276m
                boolean r0 = ih.c.d(r1, r0)
                if (r0 == 0) goto L_0x0149
                java.lang.String r9 = "name"
                boolean r9 = r10.G(r9)
                if (r9 != 0) goto L_0x0229
                boolean r9 = r10.G(r1)
                if (r9 != 0) goto L_0x012d
                r10.r(r8)
                return r6
            L_0x012d:
                r10.u()
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x0141
                r10.r(r8)
            L_0x0141:
                r10.m0(r1)
                r10.m()
                goto L_0x0229
            L_0x0149:
                boolean r9 = r8.o(r9, r10)
                return r9
            L_0x014e:
                boolean r9 = r8.o(r9, r10)
                return r9
            L_0x0153:
                boolean r9 = r10.h(r5)
                if (r9 == 0) goto L_0x0229
                boolean r9 = r10.g(r0)
                return r9
            L_0x015e:
                jh.k r9 = r10.z()
                r0 = 0
                r10.z0(r0)
                if (r9 == 0) goto L_0x0188
                boolean r0 = r10.G(r1)
                if (r0 != 0) goto L_0x016f
                goto L_0x0188
            L_0x016f:
                r10.u()
                jh.h r0 = r10.a()
                java.lang.String r0 = r0.M1()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0183
                r10.r(r8)
            L_0x0183:
                r10.t0(r9)
                goto L_0x0229
            L_0x0188:
                r10.r(r8)
                return r6
            L_0x018c:
                boolean r9 = r10.G(r5)
                if (r9 != 0) goto L_0x0196
                r10.r(r8)
                return r6
            L_0x0196:
                kh.c r9 = kh.c.AfterBody
                r10.D0(r9)
                goto L_0x0229
            L_0x019d:
                boolean r9 = r10.F(r1)
                if (r9 != 0) goto L_0x01a7
                r10.r(r8)
                return r6
            L_0x01a7:
                r10.v(r1)
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x01bb
            L_0x01b8:
                r10.r(r8)
            L_0x01bb:
                r10.m0(r1)
                goto L_0x0229
            L_0x01bf:
                java.lang.String[] r9 = kh.c.y.f20272i
                boolean r0 = r10.I(r9)
                if (r0 != 0) goto L_0x01cb
                r10.r(r8)
                return r6
            L_0x01cb:
                r10.v(r1)
                jh.h r0 = r10.a()
                java.lang.String r0 = r0.M1()
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x01df
                r10.r(r8)
            L_0x01df:
                r10.n0(r9)
                goto L_0x0229
            L_0x01e3:
                boolean r9 = r10.G(r1)
                if (r9 != 0) goto L_0x01ed
                r10.r(r8)
                return r6
            L_0x01ed:
                r10.v(r1)
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x01bb
                goto L_0x01b8
            L_0x01ff:
                r10.r(r8)
                r10.i(r4)
                return r6
            L_0x0206:
                boolean r9 = r10.E(r1)
                if (r9 != 0) goto L_0x0217
                r10.r(r8)
                r10.i(r1)
                boolean r9 = r10.g(r0)
                return r9
            L_0x0217:
                r10.v(r1)
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x01bb
                goto L_0x01b8
            L_0x0229:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.c.v.p(kh.i, kh.b):boolean");
        }

        public final boolean q(i iVar, b bVar) {
            String E = iVar.d().E();
            ArrayList<jh.h> D = bVar.D();
            int i10 = 0;
            while (i10 < 8) {
                jh.h w10 = bVar.w(E);
                if (w10 == null) {
                    return o(iVar, bVar);
                }
                if (!bVar.i0(w10)) {
                    bVar.r(this);
                } else if (!bVar.G(w10.M1())) {
                    bVar.r(this);
                    return false;
                } else {
                    if (bVar.a() != w10) {
                        bVar.r(this);
                    }
                    int size = D.size();
                    jh.h hVar = null;
                    int i11 = 0;
                    boolean z10 = false;
                    jh.h hVar2 = null;
                    while (true) {
                        if (i11 >= size || i11 >= 64) {
                            break;
                        }
                        jh.h hVar3 = D.get(i11);
                        if (hVar3 != w10) {
                            if (z10 && bVar.d0(hVar3)) {
                                hVar = hVar3;
                                break;
                            }
                        } else {
                            hVar2 = D.get(i11 - 1);
                            z10 = true;
                        }
                        i11++;
                    }
                    if (hVar == null) {
                        bVar.m0(w10.M1());
                    } else {
                        jh.h hVar4 = hVar;
                        jh.h hVar5 = hVar4;
                        for (int i12 = 0; i12 < 3; i12++) {
                            if (bVar.i0(hVar4)) {
                                hVar4 = bVar.l(hVar4);
                            }
                            if (!bVar.b0(hVar4)) {
                                bVar.t0(hVar4);
                            } else if (hVar4 == w10) {
                                break;
                            } else {
                                jh.h hVar6 = new jh.h(h.x(hVar4.N(), f.f20293d), bVar.x());
                                bVar.v0(hVar4, hVar6);
                                bVar.x0(hVar4, hVar6);
                                if (hVar5.U() != null) {
                                    hVar5.Y();
                                }
                                hVar6.v0(hVar5);
                                hVar4 = hVar6;
                                hVar5 = hVar4;
                            }
                        }
                        if (ih.c.d(hVar2.M1(), y.f20283t)) {
                            if (hVar5.U() != null) {
                                hVar5.Y();
                            }
                            bVar.T(hVar5);
                        } else {
                            if (hVar5.U() != null) {
                                hVar5.Y();
                            }
                            hVar2.v0(hVar5);
                        }
                        jh.h hVar7 = new jh.h(w10.i2(), bVar.x());
                        hVar7.p().q(w10.p());
                        for (jh.m v02 : (jh.m[]) hVar.v().toArray(new jh.m[0])) {
                            hVar7.v0(v02);
                        }
                        hVar.v0(hVar7);
                        bVar.s0(w10);
                        bVar.t0(w10);
                        bVar.W(hVar, hVar7);
                        i10++;
                    }
                }
                bVar.s0(w10);
                return true;
            }
            return true;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x0360, code lost:
            if (r1.R(r2).m("type").equalsIgnoreCase("hidden") == false) goto L_0x0362;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x0362, code lost:
            r1.s(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x037a, code lost:
            r3 = r17;
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x037d, code lost:
            r19.r0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x04ce, code lost:
            if (r1.E("p") != false) goto L_0x04d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x04d0, code lost:
            r1.h("p");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:257:0x054f, code lost:
            if (r1.E("p") != false) goto L_0x04d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x056e, code lost:
            r19.r0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:264:0x0571, code lost:
            r1.q0(r1.N(r2));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:284:0x05f1, code lost:
            r1.s(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:285:0x05f4, code lost:
            kh.c.d(r2, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:333:?, code lost:
            return r15;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean r(kh.i r18, kh.b r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                kh.i$h r2 = r18.e()
                java.lang.String r3 = r2.E()
                r3.hashCode()
                int r4 = r3.hashCode()
                java.lang.String r5 = "isindex"
                java.lang.String r6 = "input"
                java.lang.String r7 = "svg"
                java.lang.String r8 = "nobr"
                java.lang.String r9 = "form"
                java.lang.String r10 = "body"
                java.lang.String r11 = "li"
                java.lang.String r12 = "hr"
                java.lang.String r13 = "option"
                java.lang.String r15 = "button"
                r16 = -1
                java.lang.String r14 = "a"
                r0 = 0
                switch(r4) {
                    case -1644953643: goto L_0x01f7;
                    case -1377687758: goto L_0x01ed;
                    case -1191214428: goto L_0x01e1;
                    case -1010136971: goto L_0x01d7;
                    case -1003243718: goto L_0x01cb;
                    case -906021636: goto L_0x01bf;
                    case -80773204: goto L_0x01b3;
                    case 97: goto L_0x01a9;
                    case 3200: goto L_0x019b;
                    case 3216: goto L_0x018d;
                    case 3273: goto L_0x017f;
                    case 3274: goto L_0x0171;
                    case 3275: goto L_0x0163;
                    case 3276: goto L_0x0155;
                    case 3277: goto L_0x0147;
                    case 3278: goto L_0x0139;
                    case 3338: goto L_0x012d;
                    case 3453: goto L_0x0121;
                    case 3646: goto L_0x0113;
                    case 3650: goto L_0x0105;
                    case 111267: goto L_0x00f7;
                    case 114276: goto L_0x00eb;
                    case 118811: goto L_0x00dd;
                    case 3029410: goto L_0x00d1;
                    case 3148996: goto L_0x00c5;
                    case 3213227: goto L_0x00b7;
                    case 3344136: goto L_0x00a9;
                    case 3386833: goto L_0x009d;
                    case 3536714: goto L_0x008f;
                    case 100313435: goto L_0x0081;
                    case 100358090: goto L_0x0075;
                    case 110115790: goto L_0x0067;
                    case 181975684: goto L_0x0059;
                    case 1973234167: goto L_0x004b;
                    case 2091304424: goto L_0x003f;
                    case 2115613112: goto L_0x0031;
                    default: goto L_0x002f;
                }
            L_0x002f:
                goto L_0x0202
            L_0x0031:
                java.lang.String r4 = "noembed"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x003b
                goto L_0x0202
            L_0x003b:
                r16 = 35
                goto L_0x0202
            L_0x003f:
                boolean r4 = r3.equals(r5)
                if (r4 != 0) goto L_0x0047
                goto L_0x0202
            L_0x0047:
                r16 = 34
                goto L_0x0202
            L_0x004b:
                java.lang.String r4 = "plaintext"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0055
                goto L_0x0202
            L_0x0055:
                r16 = 33
                goto L_0x0202
            L_0x0059:
                java.lang.String r4 = "listing"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0063
                goto L_0x0202
            L_0x0063:
                r16 = 32
                goto L_0x0202
            L_0x0067:
                java.lang.String r4 = "table"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0071
                goto L_0x0202
            L_0x0071:
                r16 = 31
                goto L_0x0202
            L_0x0075:
                boolean r4 = r3.equals(r6)
                if (r4 != 0) goto L_0x007d
                goto L_0x0202
            L_0x007d:
                r16 = 30
                goto L_0x0202
            L_0x0081:
                java.lang.String r4 = "image"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x008b
                goto L_0x0202
            L_0x008b:
                r16 = 29
                goto L_0x0202
            L_0x008f:
                java.lang.String r4 = "span"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0099
                goto L_0x0202
            L_0x0099:
                r16 = 28
                goto L_0x0202
            L_0x009d:
                boolean r4 = r3.equals(r8)
                if (r4 != 0) goto L_0x00a5
                goto L_0x0202
            L_0x00a5:
                r16 = 27
                goto L_0x0202
            L_0x00a9:
                java.lang.String r4 = "math"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x00b3
                goto L_0x0202
            L_0x00b3:
                r16 = 26
                goto L_0x0202
            L_0x00b7:
                java.lang.String r4 = "html"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x00c1
                goto L_0x0202
            L_0x00c1:
                r16 = 25
                goto L_0x0202
            L_0x00c5:
                boolean r4 = r3.equals(r9)
                if (r4 != 0) goto L_0x00cd
                goto L_0x0202
            L_0x00cd:
                r16 = 24
                goto L_0x0202
            L_0x00d1:
                boolean r4 = r3.equals(r10)
                if (r4 != 0) goto L_0x00d9
                goto L_0x0202
            L_0x00d9:
                r16 = 23
                goto L_0x0202
            L_0x00dd:
                java.lang.String r4 = "xmp"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x00e7
                goto L_0x0202
            L_0x00e7:
                r16 = 22
                goto L_0x0202
            L_0x00eb:
                boolean r4 = r3.equals(r7)
                if (r4 != 0) goto L_0x00f3
                goto L_0x0202
            L_0x00f3:
                r16 = 21
                goto L_0x0202
            L_0x00f7:
                java.lang.String r4 = "pre"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0101
                goto L_0x0202
            L_0x0101:
                r16 = 20
                goto L_0x0202
            L_0x0105:
                java.lang.String r4 = "rt"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x010f
                goto L_0x0202
            L_0x010f:
                r16 = 19
                goto L_0x0202
            L_0x0113:
                java.lang.String r4 = "rp"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x011d
                goto L_0x0202
            L_0x011d:
                r16 = 18
                goto L_0x0202
            L_0x0121:
                boolean r4 = r3.equals(r11)
                if (r4 != 0) goto L_0x0129
                goto L_0x0202
            L_0x0129:
                r16 = 17
                goto L_0x0202
            L_0x012d:
                boolean r4 = r3.equals(r12)
                if (r4 != 0) goto L_0x0135
                goto L_0x0202
            L_0x0135:
                r16 = 16
                goto L_0x0202
            L_0x0139:
                java.lang.String r4 = "h6"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0143
                goto L_0x0202
            L_0x0143:
                r16 = 15
                goto L_0x0202
            L_0x0147:
                java.lang.String r4 = "h5"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0151
                goto L_0x0202
            L_0x0151:
                r16 = 14
                goto L_0x0202
            L_0x0155:
                java.lang.String r4 = "h4"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x015f
                goto L_0x0202
            L_0x015f:
                r16 = 13
                goto L_0x0202
            L_0x0163:
                java.lang.String r4 = "h3"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x016d
                goto L_0x0202
            L_0x016d:
                r16 = 12
                goto L_0x0202
            L_0x0171:
                java.lang.String r4 = "h2"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x017b
                goto L_0x0202
            L_0x017b:
                r16 = 11
                goto L_0x0202
            L_0x017f:
                java.lang.String r4 = "h1"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0189
                goto L_0x0202
            L_0x0189:
                r16 = 10
                goto L_0x0202
            L_0x018d:
                java.lang.String r4 = "dt"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0197
                goto L_0x0202
            L_0x0197:
                r16 = 9
                goto L_0x0202
            L_0x019b:
                java.lang.String r4 = "dd"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01a5
                goto L_0x0202
            L_0x01a5:
                r16 = 8
                goto L_0x0202
            L_0x01a9:
                boolean r4 = r3.equals(r14)
                if (r4 != 0) goto L_0x01b0
                goto L_0x0202
            L_0x01b0:
                r16 = 7
                goto L_0x0202
            L_0x01b3:
                java.lang.String r4 = "optgroup"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01bc
                goto L_0x0202
            L_0x01bc:
                r16 = 6
                goto L_0x0202
            L_0x01bf:
                java.lang.String r4 = "select"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01c8
                goto L_0x0202
            L_0x01c8:
                r16 = 5
                goto L_0x0202
            L_0x01cb:
                java.lang.String r4 = "textarea"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01d4
                goto L_0x0202
            L_0x01d4:
                r16 = 4
                goto L_0x0202
            L_0x01d7:
                boolean r4 = r3.equals(r13)
                if (r4 != 0) goto L_0x01de
                goto L_0x0202
            L_0x01de:
                r16 = 3
                goto L_0x0202
            L_0x01e1:
                java.lang.String r4 = "iframe"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x01ea
                goto L_0x0202
            L_0x01ea:
                r16 = 2
                goto L_0x0202
            L_0x01ed:
                boolean r4 = r3.equals(r15)
                if (r4 != 0) goto L_0x01f4
                goto L_0x0202
            L_0x01f4:
                r16 = 1
                goto L_0x0202
            L_0x01f7:
                java.lang.String r4 = "frameset"
                boolean r4 = r3.equals(r4)
                if (r4 != 0) goto L_0x0200
                goto L_0x0202
            L_0x0200:
                r16 = r0
            L_0x0202:
                java.lang.String r4 = "p"
                switch(r16) {
                    case 0: goto L_0x0616;
                    case 1: goto L_0x05f9;
                    case 2: goto L_0x05ee;
                    case 3: goto L_0x05d8;
                    case 4: goto L_0x05bb;
                    case 5: goto L_0x057a;
                    case 6: goto L_0x05d8;
                    case 7: goto L_0x0553;
                    case 8: goto L_0x050a;
                    case 9: goto L_0x050a;
                    case 10: goto L_0x04e6;
                    case 11: goto L_0x04e6;
                    case 12: goto L_0x04e6;
                    case 13: goto L_0x04e6;
                    case 14: goto L_0x04e6;
                    case 15: goto L_0x04e6;
                    case 16: goto L_0x04d5;
                    case 17: goto L_0x048f;
                    case 18: goto L_0x046b;
                    case 19: goto L_0x046b;
                    case 20: goto L_0x0453;
                    case 21: goto L_0x037a;
                    case 22: goto L_0x0442;
                    case 23: goto L_0x03ea;
                    case 24: goto L_0x03d0;
                    case 25: goto L_0x039a;
                    case 26: goto L_0x037a;
                    case 27: goto L_0x0386;
                    case 28: goto L_0x037a;
                    case 29: goto L_0x0366;
                    case 30: goto L_0x034a;
                    case 31: goto L_0x0326;
                    case 32: goto L_0x0453;
                    case 33: goto L_0x030f;
                    case 34: goto L_0x0287;
                    case 35: goto L_0x0282;
                    default: goto L_0x0207;
                }
            L_0x0207:
                java.lang.String[] r5 = kh.c.y.f20277n
                boolean r5 = ih.c.d(r3, r5)
                if (r5 == 0) goto L_0x021d
                r19.r0()
                r1.R(r2)
            L_0x0215:
                r1.s(r0)
            L_0x0218:
                r3 = r17
                r4 = 1
                goto L_0x066b
            L_0x021d:
                java.lang.String[] r5 = kh.c.y.f20271h
                boolean r5 = ih.c.d(r3, r5)
                if (r5 == 0) goto L_0x0232
                boolean r0 = r1.E(r4)
                if (r0 == 0) goto L_0x022e
                r1.h(r4)
            L_0x022e:
                r1.N(r2)
                goto L_0x0218
            L_0x0232:
                java.lang.String[] r4 = kh.c.y.f20270g
                boolean r4 = ih.c.d(r3, r4)
                if (r4 == 0) goto L_0x0243
                kh.c r0 = kh.c.InHead
                r2 = r18
                boolean r0 = r1.o0(r2, r0)
                return r0
            L_0x0243:
                java.lang.String[] r4 = kh.c.y.f20275l
                boolean r4 = ih.c.d(r3, r4)
                if (r4 == 0) goto L_0x0256
                r19.r0()
                jh.h r0 = r1.N(r2)
                r1.q0(r0)
                goto L_0x0218
            L_0x0256:
                java.lang.String[] r4 = kh.c.y.f20276m
                boolean r4 = ih.c.d(r3, r4)
                if (r4 == 0) goto L_0x0268
                r19.r0()
                r1.N(r2)
                r19.U()
                goto L_0x0215
            L_0x0268:
                java.lang.String[] r4 = kh.c.y.f20278o
                boolean r4 = ih.c.d(r3, r4)
                if (r4 == 0) goto L_0x0274
                r1.R(r2)
                goto L_0x0218
            L_0x0274:
                java.lang.String[] r4 = kh.c.y.f20280q
                boolean r3 = ih.c.d(r3, r4)
                if (r3 == 0) goto L_0x037a
                r3 = r17
                r1.r(r3)
                return r0
            L_0x0282:
                r3 = r17
                r15 = 1
                goto L_0x05f4
            L_0x0287:
                r3 = r17
                r15 = 1
                r1.r(r3)
                jh.k r4 = r19.z()
                if (r4 == 0) goto L_0x0294
                return r0
            L_0x0294:
                r1.i(r9)
                jh.b r0 = r2.f20322j
                java.lang.String r4 = "action"
                boolean r0 = r0.D(r4)
                if (r0 == 0) goto L_0x02ae
                jh.k r0 = r19.z()
                jh.b r7 = r2.f20322j
                java.lang.String r7 = r7.z(r4)
                r0.n(r4, r7)
            L_0x02ae:
                r1.i(r12)
                java.lang.String r0 = "label"
                r1.i(r0)
                jh.b r4 = r2.f20322j
                java.lang.String r7 = "prompt"
                boolean r4 = r4.D(r7)
                if (r4 == 0) goto L_0x02c7
                jh.b r4 = r2.f20322j
                java.lang.String r4 = r4.z(r7)
                goto L_0x02c9
            L_0x02c7:
                java.lang.String r4 = "This is a searchable index. Enter search keywords: "
            L_0x02c9:
                kh.i$c r7 = new kh.i$c
                r7.<init>()
                kh.i$c r4 = r7.p(r4)
                r1.g(r4)
                jh.b r4 = new jh.b
                r4.<init>()
                jh.b r2 = r2.f20322j
                java.util.Iterator r2 = r2.iterator()
            L_0x02e0:
                boolean r7 = r2.hasNext()
                if (r7 == 0) goto L_0x02fc
                java.lang.Object r7 = r2.next()
                jh.a r7 = (jh.a) r7
                java.lang.String r8 = r7.getKey()
                java.lang.String[] r10 = kh.c.y.f20279p
                boolean r8 = ih.c.d(r8, r10)
                if (r8 != 0) goto L_0x02e0
                r4.P(r7)
                goto L_0x02e0
            L_0x02fc:
                java.lang.String r2 = "name"
                r4.M(r2, r5)
                r1.j(r6, r4)
                r1.h(r0)
                r1.i(r12)
                r1.h(r9)
                goto L_0x0383
            L_0x030f:
                r3 = r17
                r15 = 1
                boolean r0 = r1.E(r4)
                if (r0 == 0) goto L_0x031b
                r1.h(r4)
            L_0x031b:
                r1.N(r2)
                kh.k r0 = r1.f20387c
                kh.l r1 = kh.l.PLAINTEXT
                r0.y(r1)
                goto L_0x0383
            L_0x0326:
                r3 = r17
                r15 = 1
                jh.f r5 = r19.y()
                jh.f$b r5 = r5.M2()
                jh.f$b r6 = jh.f.b.quirks
                if (r5 == r6) goto L_0x033e
                boolean r5 = r1.E(r4)
                if (r5 == 0) goto L_0x033e
                r1.h(r4)
            L_0x033e:
                r1.N(r2)
                r1.s(r0)
                kh.c r0 = kh.c.InTable
            L_0x0346:
                r1.D0(r0)
                goto L_0x0383
            L_0x034a:
                r3 = r17
                r15 = 1
                r19.r0()
                jh.h r2 = r1.R(r2)
                java.lang.String r4 = "type"
                java.lang.String r2 = r2.m(r4)
                java.lang.String r4 = "hidden"
                boolean r2 = r2.equalsIgnoreCase(r4)
                if (r2 != 0) goto L_0x0383
            L_0x0362:
                r1.s(r0)
                goto L_0x0383
            L_0x0366:
                r3 = r17
                r15 = 1
                jh.h r0 = r1.A(r7)
                if (r0 != 0) goto L_0x0380
                java.lang.String r0 = "img"
                kh.i$i r0 = r2.C(r0)
                boolean r0 = r1.g(r0)
                return r0
            L_0x037a:
                r3 = r17
                r15 = 1
            L_0x037d:
                r19.r0()
            L_0x0380:
                r1.N(r2)
            L_0x0383:
                r4 = r15
                goto L_0x066b
            L_0x0386:
                r3 = r17
                r15 = 1
                r19.r0()
                boolean r0 = r1.G(r8)
                if (r0 == 0) goto L_0x0571
                r1.r(r3)
                r1.h(r8)
                goto L_0x056e
            L_0x039a:
                r3 = r17
                r15 = 1
                r1.r(r3)
                java.util.ArrayList r1 = r19.D()
                java.lang.Object r0 = r1.get(r0)
                jh.h r0 = (jh.h) r0
                jh.b r1 = r2.z()
                java.util.Iterator r1 = r1.iterator()
            L_0x03b2:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0383
                java.lang.Object r2 = r1.next()
                jh.a r2 = (jh.a) r2
                java.lang.String r4 = r2.getKey()
                boolean r4 = r0.G(r4)
                if (r4 != 0) goto L_0x03b2
                jh.b r4 = r0.p()
                r4.P(r2)
                goto L_0x03b2
            L_0x03d0:
                r3 = r17
                r15 = 1
                jh.k r5 = r19.z()
                if (r5 == 0) goto L_0x03dd
                r1.r(r3)
                return r0
            L_0x03dd:
                boolean r0 = r1.E(r4)
                if (r0 == 0) goto L_0x03e6
                r1.h(r4)
            L_0x03e6:
                r1.S(r2, r15)
                goto L_0x0383
            L_0x03ea:
                r3 = r17
                r15 = 1
                r1.r(r3)
                java.util.ArrayList r4 = r19.D()
                int r5 = r4.size()
                if (r5 == r15) goto L_0x0441
                int r5 = r4.size()
                r6 = 2
                if (r5 <= r6) goto L_0x0412
                java.lang.Object r5 = r4.get(r15)
                jh.h r5 = (jh.h) r5
                java.lang.String r5 = r5.M1()
                boolean r5 = r5.equals(r10)
                if (r5 != 0) goto L_0x0412
                goto L_0x0441
            L_0x0412:
                r1.s(r0)
                java.lang.Object r0 = r4.get(r15)
                jh.h r0 = (jh.h) r0
                jh.b r1 = r2.z()
                java.util.Iterator r1 = r1.iterator()
            L_0x0423:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0383
                java.lang.Object r2 = r1.next()
                jh.a r2 = (jh.a) r2
                java.lang.String r4 = r2.getKey()
                boolean r4 = r0.G(r4)
                if (r4 != 0) goto L_0x0423
                jh.b r4 = r0.p()
                r4.P(r2)
                goto L_0x0423
            L_0x0441:
                return r0
            L_0x0442:
                r3 = r17
                r15 = 1
                boolean r5 = r1.E(r4)
                if (r5 == 0) goto L_0x044e
                r1.h(r4)
            L_0x044e:
                r19.r0()
                goto L_0x05f1
            L_0x0453:
                r3 = r17
                r15 = 1
                boolean r5 = r1.E(r4)
                if (r5 == 0) goto L_0x045f
                r1.h(r4)
            L_0x045f:
                r1.N(r2)
                kh.a r2 = r1.f20386b
                java.lang.String r4 = "\n"
                r2.w(r4)
                goto L_0x0362
            L_0x046b:
                r3 = r17
                r15 = 1
                java.lang.String r0 = "ruby"
                boolean r4 = r1.G(r0)
                if (r4 == 0) goto L_0x0383
                r19.u()
                jh.h r4 = r19.a()
                java.lang.String r4 = r4.M1()
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0380
                r1.r(r3)
                r1.l0(r0)
                goto L_0x0380
            L_0x048f:
                r3 = r17
                r15 = 1
                r1.s(r0)
                java.util.ArrayList r0 = r19.D()
                int r5 = r0.size()
                int r5 = r5 - r15
            L_0x049e:
                if (r5 <= 0) goto L_0x04ca
                java.lang.Object r6 = r0.get(r5)
                jh.h r6 = (jh.h) r6
                java.lang.String r7 = r6.M1()
                boolean r7 = r7.equals(r11)
                if (r7 == 0) goto L_0x04b4
                r1.h(r11)
                goto L_0x04ca
            L_0x04b4:
                boolean r7 = r1.d0(r6)
                if (r7 == 0) goto L_0x04c7
                java.lang.String r6 = r6.M1()
                java.lang.String[] r7 = kh.c.y.f20273j
                boolean r6 = ih.c.d(r6, r7)
                if (r6 != 0) goto L_0x04c7
                goto L_0x04ca
            L_0x04c7:
                int r5 = r5 + -1
                goto L_0x049e
            L_0x04ca:
                boolean r0 = r1.E(r4)
                if (r0 == 0) goto L_0x0380
            L_0x04d0:
                r1.h(r4)
                goto L_0x0380
            L_0x04d5:
                r3 = r17
                r15 = 1
                boolean r5 = r1.E(r4)
                if (r5 == 0) goto L_0x04e1
                r1.h(r4)
            L_0x04e1:
                r1.R(r2)
                goto L_0x0362
            L_0x04e6:
                r3 = r17
                r15 = 1
                boolean r0 = r1.E(r4)
                if (r0 == 0) goto L_0x04f2
                r1.h(r4)
            L_0x04f2:
                jh.h r0 = r19.a()
                java.lang.String r0 = r0.M1()
                java.lang.String[] r4 = kh.c.y.f20272i
                boolean r0 = ih.c.d(r0, r4)
                if (r0 == 0) goto L_0x0380
                r1.r(r3)
                r19.k0()
                goto L_0x0380
            L_0x050a:
                r3 = r17
                r15 = 1
                r1.s(r0)
                java.util.ArrayList r0 = r19.D()
                int r5 = r0.size()
                int r5 = r5 - r15
            L_0x0519:
                if (r5 <= 0) goto L_0x054b
                java.lang.Object r6 = r0.get(r5)
                jh.h r6 = (jh.h) r6
                java.lang.String r7 = r6.M1()
                java.lang.String[] r8 = kh.c.y.f20274k
                boolean r7 = ih.c.d(r7, r8)
                if (r7 == 0) goto L_0x0535
                java.lang.String r0 = r6.M1()
                r1.h(r0)
                goto L_0x054b
            L_0x0535:
                boolean r7 = r1.d0(r6)
                if (r7 == 0) goto L_0x0548
                java.lang.String r6 = r6.M1()
                java.lang.String[] r7 = kh.c.y.f20273j
                boolean r6 = ih.c.d(r6, r7)
                if (r6 != 0) goto L_0x0548
                goto L_0x054b
            L_0x0548:
                int r5 = r5 + -1
                goto L_0x0519
            L_0x054b:
                boolean r0 = r1.E(r4)
                if (r0 == 0) goto L_0x0380
                goto L_0x04d0
            L_0x0553:
                r3 = r17
                r15 = 1
                jh.h r0 = r1.w(r14)
                if (r0 == 0) goto L_0x056e
                r1.r(r3)
                r1.h(r14)
                jh.h r0 = r1.A(r14)
                if (r0 == 0) goto L_0x056e
                r1.s0(r0)
                r1.t0(r0)
            L_0x056e:
                r19.r0()
            L_0x0571:
                jh.h r0 = r1.N(r2)
                r1.q0(r0)
                goto L_0x0383
            L_0x057a:
                r3 = r17
                r15 = 1
                r19.r0()
                r1.N(r2)
                r1.s(r0)
                kh.c r0 = r19.C0()
                kh.c r2 = kh.c.InTable
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x05b7
                kh.c r2 = kh.c.InCaption
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x05b7
                kh.c r2 = kh.c.InTableBody
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x05b7
                kh.c r2 = kh.c.InRow
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L_0x05b7
                kh.c r2 = kh.c.InCell
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x05b3
                goto L_0x05b7
            L_0x05b3:
                kh.c r0 = kh.c.InSelect
                goto L_0x0346
            L_0x05b7:
                kh.c r0 = kh.c.InSelectInTable
                goto L_0x0346
            L_0x05bb:
                r3 = r17
                r15 = 1
                r1.N(r2)
                boolean r2 = r2.A()
                if (r2 != 0) goto L_0x0383
                kh.k r2 = r1.f20387c
                kh.l r4 = kh.l.Rcdata
                r2.y(r4)
                r19.f0()
                r1.s(r0)
                kh.c r0 = kh.c.Text
                goto L_0x0346
            L_0x05d8:
                r3 = r17
                r15 = 1
                jh.h r0 = r19.a()
                java.lang.String r0 = r0.M1()
                boolean r0 = r0.equals(r13)
                if (r0 == 0) goto L_0x037d
                r1.h(r13)
                goto L_0x037d
            L_0x05ee:
                r3 = r17
                r15 = 1
            L_0x05f1:
                r1.s(r0)
            L_0x05f4:
                kh.c.j(r2, r1)
                goto L_0x0383
            L_0x05f9:
                r3 = r17
                r4 = 1
                boolean r5 = r1.E(r15)
                if (r5 == 0) goto L_0x060c
                r1.r(r3)
                r1.h(r15)
                r1.g(r2)
                goto L_0x066b
            L_0x060c:
                r19.r0()
                r1.N(r2)
                r1.s(r0)
                goto L_0x066b
            L_0x0616:
                r3 = r17
                r4 = 1
                r1.r(r3)
                java.util.ArrayList r5 = r19.D()
                int r6 = r5.size()
                if (r6 == r4) goto L_0x066c
                int r6 = r5.size()
                r7 = 2
                if (r6 <= r7) goto L_0x063e
                java.lang.Object r6 = r5.get(r4)
                jh.h r6 = (jh.h) r6
                java.lang.String r6 = r6.M1()
                boolean r6 = r6.equals(r10)
                if (r6 != 0) goto L_0x063e
                goto L_0x066c
            L_0x063e:
                boolean r6 = r19.t()
                if (r6 != 0) goto L_0x0645
                return r0
            L_0x0645:
                java.lang.Object r0 = r5.get(r4)
                jh.h r0 = (jh.h) r0
                jh.h r6 = r0.U()
                if (r6 == 0) goto L_0x0654
                r0.Y()
            L_0x0654:
                int r0 = r5.size()
                if (r0 <= r4) goto L_0x0663
                int r0 = r5.size()
                int r0 = r0 - r4
                r5.remove(r0)
                goto L_0x0654
            L_0x0663:
                r1.N(r2)
                kh.c r0 = kh.c.InFrameset
                r1.D0(r0)
            L_0x066b:
                return r4
            L_0x066c:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.c.v.r(kh.i, kh.b):boolean");
        }
    },
    Text {
        public boolean n(i iVar, b bVar) {
            if (iVar.g()) {
                bVar.P(iVar.a());
                return true;
            } else if (iVar.j()) {
                bVar.r(this);
                bVar.k0();
                bVar.D0(bVar.j0());
                return bVar.g(iVar);
            } else if (!iVar.k()) {
                return true;
            } else {
                bVar.k0();
                bVar.D0(bVar.j0());
                return true;
            }
        }
    },
    InTable {
        public boolean n(i iVar, b bVar) {
            c cVar;
            if (iVar.g()) {
                bVar.h0();
                bVar.f0();
                bVar.D0(c.InTableText);
                return bVar.g(iVar);
            } else if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar.r(this);
                return false;
            } else if (iVar.l()) {
                i.h e10 = iVar.e();
                String E = e10.E();
                if (E.equals("caption")) {
                    bVar.p();
                    bVar.U();
                    bVar.N(e10);
                    cVar = c.InCaption;
                } else if (E.equals("colgroup")) {
                    bVar.p();
                    bVar.N(e10);
                    cVar = c.InColumnGroup;
                } else if (E.equals("col")) {
                    bVar.i("colgroup");
                    return bVar.g(iVar);
                } else if (ih.c.d(E, y.f20284u)) {
                    bVar.p();
                    bVar.N(e10);
                    cVar = c.InTableBody;
                } else if (ih.c.d(E, y.f20285v)) {
                    bVar.i("tbody");
                    return bVar.g(iVar);
                } else {
                    if (E.equals("table")) {
                        bVar.r(this);
                        if (bVar.h("table")) {
                            return bVar.g(iVar);
                        }
                    } else if (ih.c.d(E, y.f20286w)) {
                        return bVar.o0(iVar, c.InHead);
                    } else {
                        if (E.equals("input")) {
                            if (!e10.f20322j.z("type").equalsIgnoreCase("hidden")) {
                                return o(iVar, bVar);
                            }
                            bVar.R(e10);
                        } else if (!E.equals("form")) {
                            return o(iVar, bVar);
                        } else {
                            bVar.r(this);
                            if (bVar.z() != null) {
                                return false;
                            }
                            bVar.S(e10, false);
                        }
                    }
                    return true;
                }
                bVar.D0(cVar);
                return true;
            } else if (iVar.k()) {
                String E2 = iVar.d().E();
                if (E2.equals("table")) {
                    if (!bVar.M(E2)) {
                        bVar.r(this);
                        return false;
                    }
                    bVar.m0("table");
                    bVar.y0();
                    return true;
                } else if (!ih.c.d(E2, y.B)) {
                    return o(iVar, bVar);
                } else {
                    bVar.r(this);
                    return false;
                }
            } else if (!iVar.j()) {
                return o(iVar, bVar);
            } else {
                if (bVar.a().M1().equals("html")) {
                    bVar.r(this);
                }
                return true;
            }
        }

        public boolean o(i iVar, b bVar) {
            bVar.r(this);
            if (!ih.c.d(bVar.a().M1(), y.C)) {
                return bVar.o0(iVar, c.InBody);
            }
            bVar.A0(true);
            boolean o02 = bVar.o0(iVar, c.InBody);
            bVar.A0(false);
            return o02;
        }
    },
    InTableText {
        public boolean n(i iVar, b bVar) {
            if (iVar.f20304a == i.j.Character) {
                i.c a10 = iVar.a();
                if (a10.q().equals(c.f20261l0)) {
                    bVar.r(this);
                    return false;
                }
                bVar.C().add(a10.q());
                return true;
            }
            if (bVar.C().size() > 0) {
                for (String next : bVar.C()) {
                    if (!c.l(next)) {
                        bVar.r(this);
                        if (ih.c.d(bVar.a().M1(), y.C)) {
                            bVar.A0(true);
                            bVar.o0(new i.c().p(next), c.InBody);
                            bVar.A0(false);
                        } else {
                            bVar.o0(new i.c().p(next), c.InBody);
                        }
                    } else {
                        bVar.P(new i.c().p(next));
                    }
                }
                bVar.h0();
            }
            bVar.D0(bVar.j0());
            return bVar.g(iVar);
        }
    },
    InCaption {
        public boolean n(i iVar, b bVar) {
            if (!iVar.k() || !iVar.d().E().equals("caption")) {
                if ((iVar.l() && ih.c.d(iVar.e().E(), y.A)) || (iVar.k() && iVar.d().E().equals("table"))) {
                    bVar.r(this);
                    if (bVar.h("caption")) {
                        return bVar.g(iVar);
                    }
                    return true;
                } else if (!iVar.k() || !ih.c.d(iVar.d().E(), y.L)) {
                    return bVar.o0(iVar, c.InBody);
                } else {
                    bVar.r(this);
                    return false;
                }
            } else if (!bVar.M(iVar.d().E())) {
                bVar.r(this);
                return false;
            } else {
                bVar.u();
                if (!bVar.a().M1().equals("caption")) {
                    bVar.r(this);
                }
                bVar.m0("caption");
                bVar.m();
                bVar.D0(c.InTable);
                return true;
            }
        }
    },
    InColumnGroup {
        public boolean n(i iVar, b bVar) {
            if (c.m(iVar)) {
                bVar.P(iVar.a());
                return true;
            }
            int i10 = p.f20263a[iVar.f20304a.ordinal()];
            if (i10 == 1) {
                bVar.Q(iVar.b());
            } else if (i10 == 2) {
                bVar.r(this);
            } else if (i10 == 3) {
                i.h e10 = iVar.e();
                String E = e10.E();
                E.hashCode();
                if (!E.equals("col")) {
                    return !E.equals("html") ? o(iVar, bVar) : bVar.o0(iVar, c.InBody);
                }
                bVar.R(e10);
            } else if (i10 != 4) {
                if (i10 != 6) {
                    return o(iVar, bVar);
                }
                if (bVar.a().M1().equals("html")) {
                    return true;
                }
                return o(iVar, bVar);
            } else if (!iVar.d().f20315c.equals("colgroup")) {
                return o(iVar, bVar);
            } else {
                if (bVar.a().M1().equals("html")) {
                    bVar.r(this);
                    return false;
                }
                bVar.k0();
                bVar.D0(c.InTable);
            }
            return true;
        }

        public final boolean o(i iVar, m mVar) {
            if (mVar.h("colgroup")) {
                return mVar.g(iVar);
            }
            return true;
        }
    },
    InTableBody {
        public boolean n(i iVar, b bVar) {
            c cVar;
            int i10 = p.f20263a[iVar.f20304a.ordinal()];
            if (i10 == 3) {
                i.h e10 = iVar.e();
                String E = e10.E();
                if (E.equals("template")) {
                    bVar.N(e10);
                    return true;
                } else if (E.equals("tr")) {
                    bVar.o();
                    bVar.N(e10);
                    cVar = c.InRow;
                } else if (!ih.c.d(E, y.f20287x)) {
                    return ih.c.d(E, y.D) ? p(iVar, bVar) : o(iVar, bVar);
                } else {
                    bVar.r(this);
                    bVar.i("tr");
                    return bVar.g(e10);
                }
            } else if (i10 != 4) {
                return o(iVar, bVar);
            } else {
                String E2 = iVar.d().E();
                if (ih.c.d(E2, y.J)) {
                    if (!bVar.M(E2)) {
                        bVar.r(this);
                        return false;
                    }
                    bVar.o();
                    bVar.k0();
                    cVar = c.InTable;
                } else if (E2.equals("table")) {
                    return p(iVar, bVar);
                } else {
                    if (!ih.c.d(E2, y.E)) {
                        return o(iVar, bVar);
                    }
                    bVar.r(this);
                    return false;
                }
            }
            bVar.D0(cVar);
            return true;
        }

        public final boolean o(i iVar, b bVar) {
            return bVar.o0(iVar, c.InTable);
        }

        public final boolean p(i iVar, b bVar) {
            if (bVar.M("tbody") || bVar.M("thead") || bVar.G("tfoot")) {
                bVar.o();
                bVar.h(bVar.a().M1());
                return bVar.g(iVar);
            }
            bVar.r(this);
            return false;
        }
    },
    InRow {
        public boolean n(i iVar, b bVar) {
            if (iVar.l()) {
                i.h e10 = iVar.e();
                String E = e10.E();
                if (E.equals("template")) {
                    bVar.N(e10);
                    return true;
                } else if (!ih.c.d(E, y.f20287x)) {
                    return ih.c.d(E, y.F) ? p(iVar, bVar) : o(iVar, bVar);
                } else {
                    bVar.q();
                    bVar.N(e10);
                    bVar.D0(c.InCell);
                    bVar.U();
                    return true;
                }
            } else if (!iVar.k()) {
                return o(iVar, bVar);
            } else {
                String E2 = iVar.d().E();
                if (E2.equals("tr")) {
                    if (!bVar.M(E2)) {
                        bVar.r(this);
                        return false;
                    }
                    bVar.q();
                    bVar.k0();
                    bVar.D0(c.InTableBody);
                    return true;
                } else if (E2.equals("table")) {
                    return p(iVar, bVar);
                } else {
                    if (ih.c.d(E2, y.f20284u)) {
                        if (!bVar.M(E2)) {
                            bVar.r(this);
                            return false;
                        }
                        bVar.h("tr");
                        return bVar.g(iVar);
                    } else if (!ih.c.d(E2, y.G)) {
                        return o(iVar, bVar);
                    } else {
                        bVar.r(this);
                        return false;
                    }
                }
            }
        }

        public final boolean o(i iVar, b bVar) {
            return bVar.o0(iVar, c.InTable);
        }

        public final boolean p(i iVar, m mVar) {
            if (mVar.h("tr")) {
                return mVar.g(iVar);
            }
            return false;
        }
    },
    InCell {
        public boolean n(i iVar, b bVar) {
            if (iVar.k()) {
                String E = iVar.d().E();
                if (ih.c.d(E, y.f20287x)) {
                    if (!bVar.M(E)) {
                        bVar.r(this);
                        bVar.D0(c.InRow);
                        return false;
                    }
                    bVar.u();
                    if (!bVar.a().M1().equals(E)) {
                        bVar.r(this);
                    }
                    bVar.m0(E);
                    bVar.m();
                    bVar.D0(c.InRow);
                    return true;
                } else if (ih.c.d(E, y.f20288y)) {
                    bVar.r(this);
                    return false;
                } else if (!ih.c.d(E, y.f20289z)) {
                    return o(iVar, bVar);
                } else {
                    if (!bVar.M(E)) {
                        bVar.r(this);
                        return false;
                    }
                }
            } else if (!iVar.l() || !ih.c.d(iVar.e().E(), y.A)) {
                return o(iVar, bVar);
            } else {
                if (!bVar.M("td") && !bVar.M("th")) {
                    bVar.r(this);
                    return false;
                }
            }
            p(bVar);
            return bVar.g(iVar);
        }

        public final boolean o(i iVar, b bVar) {
            return bVar.o0(iVar, c.InBody);
        }

        public final void p(b bVar) {
            String str = "td";
            if (!bVar.M(str)) {
                str = "th";
            }
            bVar.h(str);
        }
    },
    InSelect {
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b9, code lost:
            if (r10.a().M1().equals("optgroup") != false) goto L_0x00dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
            if (r10.a().M1().equals("option") != false) goto L_0x00dc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dc, code lost:
            r10.k0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
            if (r10.a().M1().equals("html") == false) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
            r10.r(r8);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean n(kh.i r9, kh.b r10) {
            /*
                r8 = this;
                int[] r0 = kh.c.p.f20263a
                kh.i$j r1 = r9.f20304a
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                java.lang.String r2 = "html"
                java.lang.String r3 = "select"
                r4 = 0
                java.lang.String r5 = "optgroup"
                java.lang.String r6 = "option"
                switch(r0) {
                    case 1: goto L_0x017a;
                    case 2: goto L_0x0176;
                    case 3: goto L_0x00e1;
                    case 4: goto L_0x004a;
                    case 5: goto L_0x002f;
                    case 6: goto L_0x001c;
                    default: goto L_0x0017;
                }
            L_0x0017:
                boolean r9 = r8.o(r9, r10)
                return r9
            L_0x001c:
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r2)
                if (r9 != 0) goto L_0x0181
            L_0x002a:
                r10.r(r8)
                goto L_0x0181
            L_0x002f:
                kh.i$c r9 = r9.a()
                java.lang.String r0 = r9.q()
                java.lang.String r2 = kh.c.f20261l0
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0045
                r10.r(r8)
                return r4
            L_0x0045:
                r10.P(r9)
                goto L_0x0181
            L_0x004a:
                kh.i$g r0 = r9.d()
                java.lang.String r0 = r0.E()
                r0.hashCode()
                r2 = -1
                int r7 = r0.hashCode()
                switch(r7) {
                    case -1010136971: goto L_0x0070;
                    case -906021636: goto L_0x0067;
                    case -80773204: goto L_0x005e;
                    default: goto L_0x005d;
                }
            L_0x005d:
                goto L_0x0078
            L_0x005e:
                boolean r3 = r0.equals(r5)
                if (r3 != 0) goto L_0x0065
                goto L_0x0078
            L_0x0065:
                r2 = 2
                goto L_0x0078
            L_0x0067:
                boolean r3 = r0.equals(r3)
                if (r3 != 0) goto L_0x006e
                goto L_0x0078
            L_0x006e:
                r2 = r1
                goto L_0x0078
            L_0x0070:
                boolean r3 = r0.equals(r6)
                if (r3 != 0) goto L_0x0077
                goto L_0x0078
            L_0x0077:
                r2 = r4
            L_0x0078:
                switch(r2) {
                    case 0: goto L_0x00ce;
                    case 1: goto L_0x00bc;
                    case 2: goto L_0x0080;
                    default: goto L_0x007b;
                }
            L_0x007b:
                boolean r9 = r8.o(r9, r10)
                return r9
            L_0x0080:
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r6)
                if (r9 == 0) goto L_0x00ad
                jh.h r9 = r10.a()
                jh.h r9 = r10.l(r9)
                if (r9 == 0) goto L_0x00ad
                jh.h r9 = r10.a()
                jh.h r9 = r10.l(r9)
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r5)
                if (r9 == 0) goto L_0x00ad
                r10.h(r6)
            L_0x00ad:
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r5)
                if (r9 == 0) goto L_0x002a
                goto L_0x00dc
            L_0x00bc:
                boolean r9 = r10.J(r0)
                if (r9 != 0) goto L_0x00c6
                r10.r(r8)
                return r4
            L_0x00c6:
                r10.m0(r0)
                r10.y0()
                goto L_0x0181
            L_0x00ce:
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r6)
                if (r9 == 0) goto L_0x002a
            L_0x00dc:
                r10.k0()
                goto L_0x0181
            L_0x00e1:
                kh.i$h r0 = r9.e()
                java.lang.String r7 = r0.E()
                boolean r2 = r7.equals(r2)
                if (r2 == 0) goto L_0x00f6
                kh.c r9 = kh.c.InBody
                boolean r9 = r10.o0(r0, r9)
                return r9
            L_0x00f6:
                boolean r2 = r7.equals(r6)
                if (r2 == 0) goto L_0x0111
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r6)
                if (r9 == 0) goto L_0x010d
                r10.h(r6)
            L_0x010d:
                r10.N(r0)
                goto L_0x0181
            L_0x0111:
                boolean r2 = r7.equals(r5)
                if (r2 == 0) goto L_0x013a
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r6)
                if (r9 == 0) goto L_0x0128
                r10.h(r6)
            L_0x0128:
                jh.h r9 = r10.a()
                java.lang.String r9 = r9.M1()
                boolean r9 = r9.equals(r5)
                if (r9 == 0) goto L_0x010d
                r10.h(r5)
                goto L_0x010d
            L_0x013a:
                boolean r1 = r7.equals(r3)
                if (r1 == 0) goto L_0x0148
                r10.r(r8)
                boolean r9 = r10.h(r3)
                return r9
            L_0x0148:
                java.lang.String[] r1 = kh.c.y.H
                boolean r1 = ih.c.d(r7, r1)
                if (r1 == 0) goto L_0x0162
                r10.r(r8)
                boolean r9 = r10.J(r3)
                if (r9 != 0) goto L_0x015a
                return r4
            L_0x015a:
                r10.h(r3)
                boolean r9 = r10.g(r0)
                return r9
            L_0x0162:
                java.lang.String r0 = "script"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0171
                kh.c r0 = kh.c.InHead
                boolean r9 = r10.o0(r9, r0)
                return r9
            L_0x0171:
                boolean r9 = r8.o(r9, r10)
                return r9
            L_0x0176:
                r10.r(r8)
                return r4
            L_0x017a:
                kh.i$d r9 = r9.b()
                r10.Q(r9)
            L_0x0181:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.c.g.n(kh.i, kh.b):boolean");
        }

        public final boolean o(i iVar, b bVar) {
            bVar.r(this);
            return false;
        }
    },
    InSelectInTable {
        public boolean n(i iVar, b bVar) {
            if (iVar.l() && ih.c.d(iVar.e().E(), y.I)) {
                bVar.r(this);
                bVar.h("select");
                return bVar.g(iVar);
            } else if (!iVar.k() || !ih.c.d(iVar.d().E(), y.I)) {
                return bVar.o0(iVar, c.InSelect);
            } else {
                bVar.r(this);
                if (!bVar.M(iVar.d().E())) {
                    return false;
                }
                bVar.h("select");
                return bVar.g(iVar);
            }
        }
    },
    AfterBody {
        public boolean n(i iVar, b bVar) {
            if (c.m(iVar)) {
                bVar.P(iVar.a());
                return true;
            } else if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar.r(this);
                return false;
            } else if (iVar.l() && iVar.e().E().equals("html")) {
                return bVar.o0(iVar, c.InBody);
            } else {
                if (!iVar.k() || !iVar.d().E().equals("html")) {
                    if (iVar.j()) {
                        return true;
                    }
                    bVar.r(this);
                    bVar.D0(c.InBody);
                    return bVar.g(iVar);
                } else if (bVar.a0()) {
                    bVar.r(this);
                    return false;
                } else {
                    bVar.D0(c.AfterAfterBody);
                    return true;
                }
            }
        }
    },
    InFrameset {
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x007c, code lost:
            return r9.o0(r8, r0);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean n(kh.i r8, kh.b r9) {
            /*
                r7 = this;
                boolean r0 = kh.c.m(r8)
                r1 = 1
                if (r0 == 0) goto L_0x0010
                kh.i$c r8 = r8.a()
                r9.P(r8)
                goto L_0x00e2
            L_0x0010:
                boolean r0 = r8.h()
                if (r0 == 0) goto L_0x001f
                kh.i$d r8 = r8.b()
                r9.Q(r8)
                goto L_0x00e2
            L_0x001f:
                boolean r0 = r8.i()
                r2 = 0
                if (r0 == 0) goto L_0x002a
                r9.r(r7)
                return r2
            L_0x002a:
                boolean r0 = r8.l()
                java.lang.String r3 = "html"
                java.lang.String r4 = "frameset"
                if (r0 == 0) goto L_0x0088
                kh.i$h r8 = r8.e()
                java.lang.String r0 = r8.E()
                r0.hashCode()
                r5 = -1
                int r6 = r0.hashCode()
                switch(r6) {
                    case -1644953643: goto L_0x0067;
                    case 3213227: goto L_0x005e;
                    case 97692013: goto L_0x0053;
                    case 1192721831: goto L_0x0048;
                    default: goto L_0x0047;
                }
            L_0x0047:
                goto L_0x006f
            L_0x0048:
                java.lang.String r3 = "noframes"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0051
                goto L_0x006f
            L_0x0051:
                r5 = 3
                goto L_0x006f
            L_0x0053:
                java.lang.String r3 = "frame"
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x005c
                goto L_0x006f
            L_0x005c:
                r5 = 2
                goto L_0x006f
            L_0x005e:
                boolean r0 = r0.equals(r3)
                if (r0 != 0) goto L_0x0065
                goto L_0x006f
            L_0x0065:
                r5 = r1
                goto L_0x006f
            L_0x0067:
                boolean r0 = r0.equals(r4)
                if (r0 != 0) goto L_0x006e
                goto L_0x006f
            L_0x006e:
                r5 = r2
            L_0x006f:
                switch(r5) {
                    case 0: goto L_0x0084;
                    case 1: goto L_0x0081;
                    case 2: goto L_0x007d;
                    case 3: goto L_0x0076;
                    default: goto L_0x0072;
                }
            L_0x0072:
                r9.r(r7)
                return r2
            L_0x0076:
                kh.c r0 = kh.c.InHead
            L_0x0078:
                boolean r8 = r9.o0(r8, r0)
                return r8
            L_0x007d:
                r9.R(r8)
                goto L_0x00e2
            L_0x0081:
                kh.c r0 = kh.c.InBody
                goto L_0x0078
            L_0x0084:
                r9.N(r8)
                goto L_0x00e2
            L_0x0088:
                boolean r0 = r8.k()
                if (r0 == 0) goto L_0x00cb
                kh.i$g r0 = r8.d()
                java.lang.String r0 = r0.E()
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x00cb
                jh.h r8 = r9.a()
                java.lang.String r8 = r8.M1()
                boolean r8 = r8.equals(r3)
                if (r8 == 0) goto L_0x00ae
                r9.r(r7)
                return r2
            L_0x00ae:
                r9.k0()
                boolean r8 = r9.a0()
                if (r8 != 0) goto L_0x00e2
                jh.h r8 = r9.a()
                java.lang.String r8 = r8.M1()
                boolean r8 = r8.equals(r4)
                if (r8 != 0) goto L_0x00e2
                kh.c r8 = kh.c.AfterFrameset
                r9.D0(r8)
                goto L_0x00e2
            L_0x00cb:
                boolean r8 = r8.j()
                if (r8 == 0) goto L_0x00e3
                jh.h r8 = r9.a()
                java.lang.String r8 = r8.M1()
                boolean r8 = r8.equals(r3)
                if (r8 != 0) goto L_0x00e2
                r9.r(r7)
            L_0x00e2:
                return r1
            L_0x00e3:
                r9.r(r7)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.c.j.n(kh.i, kh.b):boolean");
        }
    },
    AfterFrameset {
        public boolean n(i iVar, b bVar) {
            c cVar;
            if (c.m(iVar)) {
                bVar.P(iVar.a());
                return true;
            } else if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (iVar.i()) {
                bVar.r(this);
                return false;
            } else {
                if (iVar.l() && iVar.e().E().equals("html")) {
                    cVar = c.InBody;
                } else if (iVar.k() && iVar.d().E().equals("html")) {
                    bVar.D0(c.AfterAfterFrameset);
                    return true;
                } else if (iVar.l() && iVar.e().E().equals("noframes")) {
                    cVar = c.InHead;
                } else if (iVar.j()) {
                    return true;
                } else {
                    bVar.r(this);
                    return false;
                }
                return bVar.o0(iVar, cVar);
            }
        }
    },
    AfterAfterBody {
        public boolean n(i iVar, b bVar) {
            if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (iVar.i() || (iVar.l() && iVar.e().E().equals("html"))) {
                return bVar.o0(iVar, c.InBody);
            } else {
                if (c.m(iVar)) {
                    jh.h m02 = bVar.m0("html");
                    bVar.P(iVar.a());
                    bVar.f20389e.add(m02);
                    bVar.f20389e.add(m02.e2("body"));
                    return true;
                } else if (iVar.j()) {
                    return true;
                } else {
                    bVar.r(this);
                    bVar.D0(c.InBody);
                    return bVar.g(iVar);
                }
            }
        }
    },
    AfterAfterFrameset {
        public boolean n(i iVar, b bVar) {
            if (iVar.h()) {
                bVar.Q(iVar.b());
                return true;
            } else if (iVar.i() || c.m(iVar) || (iVar.l() && iVar.e().E().equals("html"))) {
                return bVar.o0(iVar, c.InBody);
            } else {
                if (iVar.j()) {
                    return true;
                }
                if (iVar.l() && iVar.e().E().equals("noframes")) {
                    return bVar.o0(iVar, c.InHead);
                }
                bVar.r(this);
                return false;
            }
        }
    },
    ForeignContent {
        public boolean n(i iVar, b bVar) {
            return true;
        }
    };
    

    /* renamed from: l0  reason: collision with root package name */
    public static final String f20261l0 = null;

    public static /* synthetic */ class p {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20263a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                kh.i$j[] r0 = kh.i.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20263a = r0
                kh.i$j r1 = kh.i.j.Comment     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20263a     // Catch:{ NoSuchFieldError -> 0x001d }
                kh.i$j r1 = kh.i.j.Doctype     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20263a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kh.i$j r1 = kh.i.j.StartTag     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20263a     // Catch:{ NoSuchFieldError -> 0x0033 }
                kh.i$j r1 = kh.i.j.EndTag     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20263a     // Catch:{ NoSuchFieldError -> 0x003e }
                kh.i$j r1 = kh.i.j.Character     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20263a     // Catch:{ NoSuchFieldError -> 0x0049 }
                kh.i$j r1 = kh.i.j.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.c.p.<clinit>():void");
        }
    }

    public static final class y {
        public static final String[] A = null;
        public static final String[] B = null;
        public static final String[] C = null;
        public static final String[] D = null;
        public static final String[] E = null;
        public static final String[] F = null;
        public static final String[] G = null;
        public static final String[] H = null;
        public static final String[] I = null;
        public static final String[] J = null;
        public static final String[] K = null;
        public static final String[] L = null;

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f20264a = null;

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f20265b = null;

        /* renamed from: c  reason: collision with root package name */
        public static final String[] f20266c = null;

        /* renamed from: d  reason: collision with root package name */
        public static final String[] f20267d = null;

        /* renamed from: e  reason: collision with root package name */
        public static final String[] f20268e = null;

        /* renamed from: f  reason: collision with root package name */
        public static final String[] f20269f = null;

        /* renamed from: g  reason: collision with root package name */
        public static final String[] f20270g = null;

        /* renamed from: h  reason: collision with root package name */
        public static final String[] f20271h = null;

        /* renamed from: i  reason: collision with root package name */
        public static final String[] f20272i = null;

        /* renamed from: j  reason: collision with root package name */
        public static final String[] f20273j = null;

        /* renamed from: k  reason: collision with root package name */
        public static final String[] f20274k = null;

        /* renamed from: l  reason: collision with root package name */
        public static final String[] f20275l = null;

        /* renamed from: m  reason: collision with root package name */
        public static final String[] f20276m = null;

        /* renamed from: n  reason: collision with root package name */
        public static final String[] f20277n = null;

        /* renamed from: o  reason: collision with root package name */
        public static final String[] f20278o = null;

        /* renamed from: p  reason: collision with root package name */
        public static final String[] f20279p = null;

        /* renamed from: q  reason: collision with root package name */
        public static final String[] f20280q = null;

        /* renamed from: r  reason: collision with root package name */
        public static final String[] f20281r = null;

        /* renamed from: s  reason: collision with root package name */
        public static final String[] f20282s = null;

        /* renamed from: t  reason: collision with root package name */
        public static final String[] f20283t = null;

        /* renamed from: u  reason: collision with root package name */
        public static final String[] f20284u = null;

        /* renamed from: v  reason: collision with root package name */
        public static final String[] f20285v = null;

        /* renamed from: w  reason: collision with root package name */
        public static final String[] f20286w = null;

        /* renamed from: x  reason: collision with root package name */
        public static final String[] f20287x = null;

        /* renamed from: y  reason: collision with root package name */
        public static final String[] f20288y = null;

        /* renamed from: z  reason: collision with root package name */
        public static final String[] f20289z = null;

        static {
            f20264a = new String[]{"base", "basefont", "bgsound", "command", "link"};
            f20265b = new String[]{"noframes", "style"};
            f20266c = new String[]{"body", n7.b.f10951s, "html"};
            f20267d = new String[]{"body", "html"};
            f20268e = new String[]{"body", n7.b.f10951s, n7.b.f10946n, "html"};
            f20269f = new String[]{"basefont", "bgsound", "link", "meta", "noframes", "style"};
            f20270g = new String[]{"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title"};
            f20271h = new String[]{"address", "article", "aside", "blockquote", n7.b.V, "details", "dir", n7.b.f10948p, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", k.g.f9834f, "nav", "ol", "p", "section", "summary", "ul"};
            f20272i = new String[]{"h1", "h2", "h3", "h4", "h5", "h6"};
            f20273j = new String[]{"address", n7.b.f10948p, "p"};
            f20274k = new String[]{"dd", "dt"};
            f20275l = new String[]{p7.f.f11703n, "big", "code", "em", "font", "i", "s", bc.p.f16191j, "strike", "strong", n7.b.f10945m, p7.f.f11705p};
            f20276m = new String[]{"applet", "marquee", "object"};
            f20277n = new String[]{"area", n7.b.f10951s, "embed", "img", "keygen", "wbr"};
            f20278o = new String[]{"param", b4.a.P, "track"};
            f20279p = new String[]{"action", "name", "prompt"};
            f20280q = new String[]{"caption", "col", "colgroup", "frame", n7.b.f10946n, "tbody", "td", "tfoot", "th", "thead", "tr"};
            f20281r = new String[]{"address", "article", "aside", "blockquote", "button", n7.b.V, "details", "dir", n7.b.f10948p, "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", k.g.f9834f, "nav", "ol", "pre", "section", "summary", "ul"};
            f20282s = new String[]{"a", p7.f.f11703n, "big", "code", "em", "font", "i", "nobr", "s", bc.p.f16191j, "strike", "strong", n7.b.f10945m, p7.f.f11705p};
            f20283t = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            f20284u = new String[]{"tbody", "tfoot", "thead"};
            f20285v = new String[]{"td", "th", "tr"};
            f20286w = new String[]{"script", "style"};
            f20287x = new String[]{"td", "th"};
            f20288y = new String[]{"body", "caption", "col", "colgroup", "html"};
            f20289z = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            A = new String[]{"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
            B = new String[]{"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
            C = new String[]{"table", "tbody", "tfoot", "thead", "tr"};
            D = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
            E = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
            F = new String[]{"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
            G = new String[]{"body", "caption", "col", "colgroup", "html", "td", "th"};
            H = new String[]{"input", "keygen", "textarea"};
            I = new String[]{"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
            J = new String[]{"tbody", "tfoot", "thead"};
            K = new String[]{n7.b.f10946n, "noscript"};
            L = new String[]{"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        }
    }

    /* access modifiers changed from: public */
    static {
        f20261l0 = String.valueOf(0);
    }

    public static void j(i.h hVar, b bVar) {
        bVar.f20387c.y(l.Rawtext);
        bVar.f0();
        bVar.D0(Text);
        bVar.N(hVar);
    }

    public static void k(i.h hVar, b bVar) {
        bVar.f20387c.y(l.Rcdata);
        bVar.f0();
        bVar.D0(Text);
        bVar.N(hVar);
    }

    public static boolean l(String str) {
        return ih.c.f(str);
    }

    public static boolean m(i iVar) {
        if (iVar.g()) {
            return ih.c.f(iVar.a().q());
        }
        return false;
    }

    public abstract boolean n(i iVar, b bVar);
}
