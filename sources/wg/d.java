package wg;

import ch.a0;
import ch.c;
import ch.e;
import ch.f;
import ch.p;
import gc.t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xe.o;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f24160a = 15;

    /* renamed from: b  reason: collision with root package name */
    public static final int f24161b = 31;

    /* renamed from: c  reason: collision with root package name */
    public static final int f24162c = 63;

    /* renamed from: d  reason: collision with root package name */
    public static final int f24163d = 127;

    /* renamed from: e  reason: collision with root package name */
    public static final c[] f24164e;

    /* renamed from: f  reason: collision with root package name */
    public static final Map<f, Integer> f24165f = b();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<c> f24166a;

        /* renamed from: b  reason: collision with root package name */
        public final e f24167b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24168c;

        /* renamed from: d  reason: collision with root package name */
        public int f24169d;

        /* renamed from: e  reason: collision with root package name */
        public c[] f24170e;

        /* renamed from: f  reason: collision with root package name */
        public int f24171f;

        /* renamed from: g  reason: collision with root package name */
        public int f24172g;

        /* renamed from: h  reason: collision with root package name */
        public int f24173h;

        public a(int i10, int i11, a0 a0Var) {
            this.f24166a = new ArrayList();
            c[] cVarArr = new c[8];
            this.f24170e = cVarArr;
            this.f24171f = cVarArr.length - 1;
            this.f24172g = 0;
            this.f24173h = 0;
            this.f24168c = i10;
            this.f24169d = i11;
            this.f24167b = p.d(a0Var);
        }

        public a(int i10, a0 a0Var) {
            this(i10, i10, a0Var);
        }

        public final void a() {
            int i10 = this.f24169d;
            int i11 = this.f24173h;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                d(i11 - i10);
            }
        }

        public final void b() {
            Arrays.fill(this.f24170e, (Object) null);
            this.f24171f = this.f24170e.length - 1;
            this.f24172g = 0;
            this.f24173h = 0;
        }

        public final int c(int i10) {
            return this.f24171f + 1 + i10;
        }

        public final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f24170e.length;
                while (true) {
                    length--;
                    i11 = this.f24171f;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f24170e;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f24172g);
                        this.f24171f += i12;
                    } else {
                        int i13 = this.f24170e[length].f24159c;
                        i10 -= i13;
                        this.f24173h -= i13;
                        this.f24172g--;
                        i12++;
                    }
                }
                c[] cVarArr2 = this.f24170e;
                System.arraycopy(cVarArr2, i11 + 1, cVarArr2, i11 + 1 + i12, this.f24172g);
                this.f24171f += i12;
            }
            return i12;
        }

        public List<c> e() {
            ArrayList arrayList = new ArrayList(this.f24166a);
            this.f24166a.clear();
            return arrayList;
        }

        public final f f(int i10) throws IOException {
            c cVar;
            if (h(i10)) {
                cVar = d.f24164e[i10];
            } else {
                int c10 = c(i10 - d.f24164e.length);
                if (c10 >= 0) {
                    c[] cVarArr = this.f24170e;
                    if (c10 < cVarArr.length) {
                        cVar = cVarArr[c10];
                    }
                }
                throw new IOException("Header index too large " + (i10 + 1));
            }
            return cVar.f24157a;
        }

        public final void g(int i10, c cVar) {
            this.f24166a.add(cVar);
            int i11 = cVar.f24159c;
            if (i10 != -1) {
                i11 -= this.f24170e[c(i10)].f24159c;
            }
            int i12 = this.f24169d;
            if (i11 > i12) {
                b();
                return;
            }
            int d10 = d((this.f24173h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f24172g + 1;
                c[] cVarArr = this.f24170e;
                if (i13 > cVarArr.length) {
                    c[] cVarArr2 = new c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f24171f = this.f24170e.length - 1;
                    this.f24170e = cVarArr2;
                }
                int i14 = this.f24171f;
                this.f24171f = i14 - 1;
                this.f24170e[i14] = cVar;
                this.f24172g++;
            } else {
                this.f24170e[i10 + c(i10) + d10] = cVar;
            }
            this.f24173h += i11;
        }

        public final boolean h(int i10) {
            return i10 >= 0 && i10 <= d.f24164e.length - 1;
        }

        public int i() {
            return this.f24169d;
        }

        public final int j() throws IOException {
            return this.f24167b.readByte() & 255;
        }

        public f k() throws IOException {
            int j10 = j();
            boolean z10 = (j10 & 128) == 128;
            int n10 = n(j10, 127);
            return z10 ? f.I(k.f().c(this.f24167b.k1((long) n10))) : this.f24167b.B((long) n10);
        }

        public void l() throws IOException {
            while (!this.f24167b.X()) {
                byte readByte = this.f24167b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & o.f24535b) == 128) {
                    m(n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    p();
                } else if ((readByte & 64) == 64) {
                    o(n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n10 = n(readByte, 31);
                    this.f24169d = n10;
                    if (n10 < 0 || n10 > this.f24168c) {
                        throw new IOException("Invalid dynamic table size update " + this.f24169d);
                    }
                    a();
                } else if (readByte == 16 || readByte == 0) {
                    r();
                } else {
                    q(n(readByte, 15) - 1);
                }
            }
        }

        public final void m(int i10) throws IOException {
            if (h(i10)) {
                this.f24166a.add(d.f24164e[i10]);
                return;
            }
            int c10 = c(i10 - d.f24164e.length);
            if (c10 >= 0) {
                c[] cVarArr = this.f24170e;
                if (c10 < cVarArr.length) {
                    this.f24166a.add(cVarArr[c10]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public int n(int i10, int i11) throws IOException {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int j10 = j();
                if ((j10 & 128) == 0) {
                    return i11 + (j10 << i13);
                }
                i11 += (j10 & 127) << i13;
                i13 += 7;
            }
        }

        public final void o(int i10) throws IOException {
            g(-1, new c(f(i10), k()));
        }

        public final void p() throws IOException {
            g(-1, new c(d.a(k()), k()));
        }

        public final void q(int i10) throws IOException {
            this.f24166a.add(new c(f(i10), k()));
        }

        public final void r() throws IOException {
            this.f24166a.add(new c(d.a(k()), k()));
        }
    }

    public static final class b {

        /* renamed from: k  reason: collision with root package name */
        public static final int f24174k = 4096;

        /* renamed from: l  reason: collision with root package name */
        public static final int f24175l = 16384;

        /* renamed from: a  reason: collision with root package name */
        public final c f24176a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24177b;

        /* renamed from: c  reason: collision with root package name */
        public int f24178c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f24179d;

        /* renamed from: e  reason: collision with root package name */
        public int f24180e;

        /* renamed from: f  reason: collision with root package name */
        public int f24181f;

        /* renamed from: g  reason: collision with root package name */
        public c[] f24182g;

        /* renamed from: h  reason: collision with root package name */
        public int f24183h;

        /* renamed from: i  reason: collision with root package name */
        public int f24184i;

        /* renamed from: j  reason: collision with root package name */
        public int f24185j;

        public b(int i10, boolean z10, c cVar) {
            this.f24178c = Integer.MAX_VALUE;
            c[] cVarArr = new c[8];
            this.f24182g = cVarArr;
            this.f24183h = cVarArr.length - 1;
            this.f24184i = 0;
            this.f24185j = 0;
            this.f24180e = i10;
            this.f24181f = i10;
            this.f24177b = z10;
            this.f24176a = cVar;
        }

        public b(c cVar) {
            this(4096, true, cVar);
        }

        public final void a() {
            int i10 = this.f24181f;
            int i11 = this.f24185j;
            if (i10 >= i11) {
                return;
            }
            if (i10 == 0) {
                b();
            } else {
                c(i11 - i10);
            }
        }

        public final void b() {
            Arrays.fill(this.f24182g, (Object) null);
            this.f24183h = this.f24182g.length - 1;
            this.f24184i = 0;
            this.f24185j = 0;
        }

        public final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f24182g.length;
                while (true) {
                    length--;
                    i11 = this.f24183h;
                    if (length < i11 || i10 <= 0) {
                        c[] cVarArr = this.f24182g;
                        System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f24184i);
                        c[] cVarArr2 = this.f24182g;
                        int i13 = this.f24183h;
                        Arrays.fill(cVarArr2, i13 + 1, i13 + 1 + i12, (Object) null);
                        this.f24183h += i12;
                    } else {
                        int i14 = this.f24182g[length].f24159c;
                        i10 -= i14;
                        this.f24185j -= i14;
                        this.f24184i--;
                        i12++;
                    }
                }
                c[] cVarArr3 = this.f24182g;
                System.arraycopy(cVarArr3, i11 + 1, cVarArr3, i11 + 1 + i12, this.f24184i);
                c[] cVarArr22 = this.f24182g;
                int i132 = this.f24183h;
                Arrays.fill(cVarArr22, i132 + 1, i132 + 1 + i12, (Object) null);
                this.f24183h += i12;
            }
            return i12;
        }

        public final void d(c cVar) {
            int i10 = cVar.f24159c;
            int i11 = this.f24181f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f24185j + i10) - i11);
            int i12 = this.f24184i + 1;
            c[] cVarArr = this.f24182g;
            if (i12 > cVarArr.length) {
                c[] cVarArr2 = new c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f24183h = this.f24182g.length - 1;
                this.f24182g = cVarArr2;
            }
            int i13 = this.f24183h;
            this.f24183h = i13 - 1;
            this.f24182g[i13] = cVar;
            this.f24184i++;
            this.f24185j += i10;
        }

        public void e(int i10) {
            this.f24180e = i10;
            int min = Math.min(i10, 16384);
            int i11 = this.f24181f;
            if (i11 != min) {
                if (min < i11) {
                    this.f24178c = Math.min(this.f24178c, min);
                }
                this.f24179d = true;
                this.f24181f = min;
                a();
            }
        }

        public void f(f fVar) throws IOException {
            int i10;
            int i11;
            if (!this.f24177b || k.f().e(fVar) >= fVar.R()) {
                i11 = fVar.R();
                i10 = 0;
            } else {
                c cVar = new c();
                k.f().d(fVar, cVar);
                fVar = cVar.Q0();
                i11 = fVar.R();
                i10 = 128;
            }
            h(i11, 127, i10);
            this.f24176a.T(fVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a7  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00af  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(java.util.List<wg.c> r14) throws java.io.IOException {
            /*
                r13 = this;
                boolean r0 = r13.f24179d
                r1 = 0
                if (r0 == 0) goto L_0x001e
                int r0 = r13.f24178c
                int r2 = r13.f24181f
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L_0x0012
                r13.h(r0, r4, r3)
            L_0x0012:
                r13.f24179d = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.f24178c = r0
                int r0 = r13.f24181f
                r13.h(r0, r4, r3)
            L_0x001e:
                int r0 = r14.size()
                r2 = r1
            L_0x0023:
                if (r2 >= r0) goto L_0x00e5
                java.lang.Object r3 = r14.get(r2)
                wg.c r3 = (wg.c) r3
                ch.f r4 = r3.f24157a
                ch.f r4 = r4.X()
                ch.f r5 = r3.f24158b
                java.util.Map<ch.f, java.lang.Integer> r6 = wg.d.f24165f
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                r8 = 1
                if (r6 == 0) goto L_0x006c
                int r6 = r6.intValue()
                int r6 = r6 + r8
                if (r6 <= r8) goto L_0x0069
                r9 = 8
                if (r6 >= r9) goto L_0x0069
                wg.c[] r9 = wg.d.f24164e
                int r10 = r6 + -1
                r10 = r9[r10]
                ch.f r10 = r10.f24158b
                boolean r10 = java.util.Objects.equals(r10, r5)
                if (r10 == 0) goto L_0x0059
                goto L_0x006d
            L_0x0059:
                r9 = r9[r6]
                ch.f r9 = r9.f24158b
                boolean r9 = java.util.Objects.equals(r9, r5)
                if (r9 == 0) goto L_0x0069
                int r9 = r6 + 1
                r12 = r9
                r9 = r6
                r6 = r12
                goto L_0x006e
            L_0x0069:
                r9 = r6
                r6 = r7
                goto L_0x006e
            L_0x006c:
                r6 = r7
            L_0x006d:
                r9 = r6
            L_0x006e:
                if (r6 != r7) goto L_0x00a5
                int r10 = r13.f24183h
                int r10 = r10 + r8
                wg.c[] r8 = r13.f24182g
                int r8 = r8.length
            L_0x0076:
                if (r10 >= r8) goto L_0x00a5
                wg.c[] r11 = r13.f24182g
                r11 = r11[r10]
                ch.f r11 = r11.f24157a
                boolean r11 = java.util.Objects.equals(r11, r4)
                if (r11 == 0) goto L_0x00a2
                wg.c[] r11 = r13.f24182g
                r11 = r11[r10]
                ch.f r11 = r11.f24158b
                boolean r11 = java.util.Objects.equals(r11, r5)
                if (r11 == 0) goto L_0x0098
                int r6 = r13.f24183h
                int r10 = r10 - r6
                wg.c[] r6 = wg.d.f24164e
                int r6 = r6.length
                int r6 = r6 + r10
                goto L_0x00a5
            L_0x0098:
                if (r9 != r7) goto L_0x00a2
                int r9 = r13.f24183h
                int r9 = r10 - r9
                wg.c[] r11 = wg.d.f24164e
                int r11 = r11.length
                int r9 = r9 + r11
            L_0x00a2:
                int r10 = r10 + 1
                goto L_0x0076
            L_0x00a5:
                if (r6 == r7) goto L_0x00af
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.h(r6, r3, r4)
                goto L_0x00e1
            L_0x00af:
                r6 = 64
                if (r9 != r7) goto L_0x00c2
                ch.c r7 = r13.f24176a
                r7.writeByte(r6)
                r13.f(r4)
            L_0x00bb:
                r13.f(r5)
                r13.d(r3)
                goto L_0x00e1
            L_0x00c2:
                ch.f r7 = wg.c.f24146d
                boolean r7 = r4.S(r7)
                if (r7 == 0) goto L_0x00db
                ch.f r7 = wg.c.f24156n
                boolean r4 = r7.equals(r4)
                if (r4 != 0) goto L_0x00db
                r3 = 15
                r13.h(r9, r3, r1)
                r13.f(r5)
                goto L_0x00e1
            L_0x00db:
                r4 = 63
                r13.h(r9, r4, r6)
                goto L_0x00bb
            L_0x00e1:
                int r2 = r2 + 1
                goto L_0x0023
            L_0x00e5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wg.d.b.g(java.util.List):void");
        }

        public void h(int i10, int i11, int i12) {
            int i13;
            c cVar;
            if (i10 < i11) {
                cVar = this.f24176a;
                i13 = i10 | i12;
            } else {
                this.f24176a.writeByte(i12 | i11);
                i13 = i10 - i11;
                while (i13 >= 128) {
                    this.f24176a.writeByte(128 | (i13 & 127));
                    i13 >>>= 7;
                }
                cVar = this.f24176a;
            }
            cVar.writeByte(i13);
        }
    }

    static {
        f fVar = c.f24153k;
        f fVar2 = c.f24154l;
        f fVar3 = c.f24155m;
        f fVar4 = c.f24152j;
        f24164e = new c[]{new c(c.f24156n, ""), new c(fVar, "GET"), new c(fVar, "POST"), new c(fVar2, "/"), new c(fVar2, "/index.html"), new c(fVar3, (String) t.f19110d), new c(fVar3, (String) t.f19111e), new c(fVar4, "200"), new c(fVar4, "204"), new c(fVar4, "206"), new c(fVar4, "304"), new c(fVar4, "400"), new c(fVar4, "404"), new c(fVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c((String) g.f24239i, ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c((String) g.f24242l, ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
    }

    public static f a(f fVar) throws IOException {
        int R = fVar.R();
        int i10 = 0;
        while (i10 < R) {
            byte r10 = fVar.r(i10);
            if (r10 < 65 || r10 > 90) {
                i10++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.a0());
            }
        }
        return fVar;
    }

    public static Map<f, Integer> b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f24164e.length);
        int i10 = 0;
        while (true) {
            c[] cVarArr = f24164e;
            if (i10 >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i10].f24157a)) {
                linkedHashMap.put(cVarArr[i10].f24157a, Integer.valueOf(i10));
            }
            i10++;
        }
    }
}
