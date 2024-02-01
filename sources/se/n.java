package se;

import fh.g;
import fh.h;
import ie.d;
import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import le.f;
import le.k;
import p000if.m;
import p000if.o;
import p000if.q;
import we.l;
import we.p;
import xe.i0;
import xe.l0;
import zd.u2;

@f
public final class n implements m<Path> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Path f22994a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final p[] f22995b;

    @f(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, l = {184, 190}, m = "invokeSuspend", n = {"$this$iterator", "queue", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "queue", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    public static final class a extends k implements p<o<? super Path>, d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public int V;
        public /* synthetic */ Object W;
        public final /* synthetic */ n X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(n nVar, d<? super a> dVar) {
            super(2, dVar);
            this.X = nVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            a aVar = new a(this.X, dVar);
            aVar.W = obj;
            return aVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x012e A[SYNTHETIC] */
        @fh.h
        public final java.lang.Object K(@fh.g java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r14.V
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L_0x0046
                if (r1 == r4) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r1 = r14.R
                se.d r1 = (se.d) r1
                java.lang.Object r5 = r14.Q
                be.k r5 = (be.k) r5
                java.lang.Object r6 = r14.W
                if.o r6 = (p000if.o) r6
                zd.e1.n(r15)
                r15 = r14
                goto L_0x0080
            L_0x0020:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x0028:
                java.lang.Object r1 = r14.U
                java.nio.file.Path r1 = (java.nio.file.Path) r1
                java.lang.Object r5 = r14.T
                se.n r5 = (se.n) r5
                java.lang.Object r6 = r14.S
                se.l r6 = (se.l) r6
                java.lang.Object r7 = r14.R
                se.d r7 = (se.d) r7
                java.lang.Object r8 = r14.Q
                be.k r8 = (be.k) r8
                java.lang.Object r9 = r14.W
                if.o r9 = (p000if.o) r9
                zd.e1.n(r15)
                r15 = r14
                goto L_0x00d4
            L_0x0046:
                zd.e1.n(r15)
                java.lang.Object r15 = r14.W
                if.o r15 = (p000if.o) r15
                be.k r1 = new be.k
                r1.<init>()
                se.d r5 = new se.d
                se.n r6 = r14.X
                boolean r6 = r6.i()
                r5.<init>(r6)
                se.l r6 = new se.l
                se.n r7 = r14.X
                java.nio.file.Path r7 = r7.f22994a
                se.n r8 = r14.X
                java.nio.file.Path r8 = r8.f22994a
                se.n r9 = r14.X
                java.nio.file.LinkOption[] r9 = r9.k()
                java.lang.Object r8 = se.o.d(r8, r9)
                r6.<init>(r7, r8, r3)
                r1.addLast(r6)
                r6 = r15
                r15 = r14
                r12 = r5
                r5 = r1
                r1 = r12
            L_0x0080:
                boolean r7 = r5.isEmpty()
                r7 = r7 ^ r4
                if (r7 == 0) goto L_0x012e
                java.lang.Object r7 = r5.removeFirst()
                se.l r7 = (se.l) r7
                se.n r8 = r15.X
                java.nio.file.Path r9 = r7.d()
                java.nio.file.LinkOption[] r10 = r8.k()
                int r11 = r10.length
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
                java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
                int r11 = r10.length
                java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
                java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
                boolean r10 = java.nio.file.Files.isDirectory(r9, r10)
                if (r10 == 0) goto L_0x0106
                boolean r10 = se.o.c(r7)
                if (r10 != 0) goto L_0x00fc
                boolean r10 = r8.j()
                if (r10 == 0) goto L_0x00dc
                r15.W = r6
                r15.Q = r5
                r15.R = r1
                r15.S = r7
                r15.T = r8
                r15.U = r9
                r15.V = r4
                java.lang.Object r10 = r6.a(r9, r15)
                if (r10 != r0) goto L_0x00cc
                return r0
            L_0x00cc:
                r12 = r7
                r7 = r1
                r1 = r9
                r9 = r6
                r6 = r12
                r13 = r8
                r8 = r5
                r5 = r13
            L_0x00d4:
                r12 = r9
                r9 = r1
                r1 = r7
                r7 = r6
                r6 = r12
                r13 = r8
                r8 = r5
                r5 = r13
            L_0x00dc:
                java.nio.file.LinkOption[] r8 = r8.k()
                int r10 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                int r10 = r8.length
                java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
                java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
                boolean r8 = java.nio.file.Files.isDirectory(r9, r8)
                if (r8 == 0) goto L_0x0080
                java.util.List r7 = r1.c(r7)
                r5.addAll(r7)
                goto L_0x0080
            L_0x00fc:
                java.nio.file.FileSystemLoopException r15 = new java.nio.file.FileSystemLoopException
                java.lang.String r0 = r9.toString()
                r15.<init>(r0)
                throw r15
            L_0x0106:
                java.nio.file.LinkOption[] r7 = new java.nio.file.LinkOption[r4]
                r8 = 0
                java.nio.file.LinkOption r10 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r7[r8] = r10
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r4)
                java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
                boolean r7 = java.nio.file.Files.exists(r9, r7)
                if (r7 == 0) goto L_0x0080
                r15.W = r6
                r15.Q = r5
                r15.R = r1
                r15.S = r3
                r15.T = r3
                r15.U = r3
                r15.V = r2
                java.lang.Object r7 = r6.a(r9, r15)
                if (r7 != r0) goto L_0x0080
                return r0
            L_0x012e:
                zd.u2 r15 = zd.u2.f25116a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: se.n.a.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: N */
        public final Object g0(@g o<? super Path> oVar, @h d<? super u2> dVar) {
            return ((a) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    @f(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
    public static final class b extends k implements p<o<? super Path>, d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public int V;
        public /* synthetic */ Object W;
        public final /* synthetic */ n X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(n nVar, d<? super b> dVar) {
            super(2, dVar);
            this.X = nVar;
        }

        @g
        public final d<u2> H(@h Object obj, @g d<?> dVar) {
            b bVar = new b(this.X, dVar);
            bVar.W = obj;
            return bVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: if.o} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0147  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x01cf  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0215 A[SYNTHETIC] */
        @fh.h
        public final java.lang.Object K(@fh.g java.lang.Object r19) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.V
                r3 = 0
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 0
                r8 = 1
                if (r2 == 0) goto L_0x006f
                if (r2 == r8) goto L_0x0052
                if (r2 == r6) goto L_0x0018
                if (r2 == r5) goto L_0x0031
                if (r2 != r4) goto L_0x0029
            L_0x0018:
                java.lang.Object r2 = r0.R
                se.d r2 = (se.d) r2
                java.lang.Object r6 = r0.Q
                be.k r6 = (be.k) r6
                java.lang.Object r9 = r0.W
                if.o r9 = (p000if.o) r9
                zd.e1.n(r19)
                goto L_0x013f
            L_0x0029:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0031:
                java.lang.Object r2 = r0.U
                java.nio.file.Path r2 = (java.nio.file.Path) r2
                java.lang.Object r6 = r0.T
                se.n r6 = (se.n) r6
                java.lang.Object r9 = r0.S
                se.l r9 = (se.l) r9
                java.lang.Object r10 = r0.R
                se.d r10 = (se.d) r10
                java.lang.Object r11 = r0.Q
                be.k r11 = (be.k) r11
                java.lang.Object r12 = r0.W
                if.o r12 = (p000if.o) r12
                zd.e1.n(r19)
                r13 = r12
                r12 = r11
                r11 = r10
                r10 = r0
                goto L_0x01ab
            L_0x0052:
                java.lang.Object r2 = r0.U
                java.nio.file.Path r2 = (java.nio.file.Path) r2
                java.lang.Object r6 = r0.T
                se.n r6 = (se.n) r6
                java.lang.Object r9 = r0.S
                se.l r9 = (se.l) r9
                java.lang.Object r10 = r0.R
                se.d r10 = (se.d) r10
                java.lang.Object r11 = r0.Q
                be.k r11 = (be.k) r11
                java.lang.Object r12 = r0.W
                if.o r12 = (p000if.o) r12
                zd.e1.n(r19)
                goto L_0x00e6
            L_0x006f:
                zd.e1.n(r19)
                java.lang.Object r2 = r0.W
                r9 = r2
                if.o r9 = (p000if.o) r9
                be.k r2 = new be.k
                r2.<init>()
                se.d r10 = new se.d
                se.n r11 = r0.X
                boolean r11 = r11.i()
                r10.<init>(r11)
                se.l r11 = new se.l
                se.n r12 = r0.X
                java.nio.file.Path r12 = r12.f22994a
                se.n r13 = r0.X
                java.nio.file.Path r13 = r13.f22994a
                se.n r14 = r0.X
                java.nio.file.LinkOption[] r14 = r14.k()
                java.lang.Object r13 = se.o.d(r13, r14)
                r11.<init>(r12, r13, r7)
                se.n r12 = r0.X
                java.nio.file.Path r13 = r11.d()
                java.nio.file.LinkOption[] r14 = r12.k()
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                boolean r14 = java.nio.file.Files.isDirectory(r13, r14)
                if (r14 == 0) goto L_0x011c
                boolean r6 = se.o.c(r11)
                if (r6 != 0) goto L_0x0112
                boolean r6 = r12.j()
                if (r6 == 0) goto L_0x00eb
                r0.W = r9
                r0.Q = r2
                r0.R = r10
                r0.S = r11
                r0.T = r12
                r0.U = r13
                r0.V = r8
                java.lang.Object r6 = r9.a(r13, r0)
                if (r6 != r1) goto L_0x00e1
                return r1
            L_0x00e1:
                r6 = r12
                r12 = r9
                r9 = r11
                r11 = r2
                r2 = r13
            L_0x00e6:
                r13 = r2
                r2 = r11
                r11 = r9
                r9 = r12
                r12 = r6
            L_0x00eb:
                java.nio.file.LinkOption[] r6 = r12.k()
                int r12 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                int r12 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)
                java.nio.file.LinkOption[] r6 = (java.nio.file.LinkOption[]) r6
                boolean r6 = java.nio.file.Files.isDirectory(r13, r6)
                if (r6 == 0) goto L_0x013d
                java.util.List r6 = r10.c(r11)
                java.util.Iterator r6 = r6.iterator()
                r11.e(r6)
                r2.addLast(r11)
                goto L_0x013d
            L_0x0112:
                java.nio.file.FileSystemLoopException r1 = new java.nio.file.FileSystemLoopException
                java.lang.String r2 = r13.toString()
                r1.<init>(r2)
                throw r1
            L_0x011c:
                java.nio.file.LinkOption[] r11 = new java.nio.file.LinkOption[r8]
                java.nio.file.LinkOption r12 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r11[r3] = r12
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r8)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                boolean r11 = java.nio.file.Files.exists(r13, r11)
                if (r11 == 0) goto L_0x013d
                r0.W = r9
                r0.Q = r2
                r0.R = r10
                r0.V = r6
                java.lang.Object r6 = r9.a(r13, r0)
                if (r6 != r1) goto L_0x013d
                return r1
            L_0x013d:
                r6 = r2
                r2 = r10
            L_0x013f:
                r10 = r0
            L_0x0140:
                boolean r11 = r6.isEmpty()
                r11 = r11 ^ r8
                if (r11 == 0) goto L_0x0215
                java.lang.Object r11 = r6.last()
                se.l r11 = (se.l) r11
                java.util.Iterator r11 = r11.a()
                xe.l0.m(r11)
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L_0x0210
                java.lang.Object r11 = r11.next()
                se.l r11 = (se.l) r11
                se.n r12 = r10.X
                java.nio.file.Path r13 = r11.d()
                java.nio.file.LinkOption[] r14 = r12.k()
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                int r15 = r14.length
                java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r15)
                java.nio.file.LinkOption[] r14 = (java.nio.file.LinkOption[]) r14
                boolean r14 = java.nio.file.Files.isDirectory(r13, r14)
                if (r14 == 0) goto L_0x01e9
                boolean r14 = se.o.c(r11)
                if (r14 != 0) goto L_0x01df
                boolean r14 = r12.j()
                if (r14 == 0) goto L_0x01b7
                r10.W = r9
                r10.Q = r6
                r10.R = r2
                r10.S = r11
                r10.T = r12
                r10.U = r13
                r10.V = r5
                java.lang.Object r14 = r9.a(r13, r10)
                if (r14 != r1) goto L_0x019f
                return r1
            L_0x019f:
                r16 = r11
                r11 = r2
                r2 = r13
                r13 = r9
                r9 = r16
                r17 = r12
                r12 = r6
                r6 = r17
            L_0x01ab:
                r16 = r13
                r13 = r2
                r2 = r11
                r11 = r9
                r9 = r16
                r17 = r12
                r12 = r6
                r6 = r17
            L_0x01b7:
                java.nio.file.LinkOption[] r12 = r12.k()
                int r14 = r12.length
                java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r14)
                java.nio.file.LinkOption[] r12 = (java.nio.file.LinkOption[]) r12
                int r14 = r12.length
                java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r14)
                java.nio.file.LinkOption[] r12 = (java.nio.file.LinkOption[]) r12
                boolean r12 = java.nio.file.Files.isDirectory(r13, r12)
                if (r12 == 0) goto L_0x0140
                java.util.List r12 = r2.c(r11)
                java.util.Iterator r12 = r12.iterator()
                r11.e(r12)
                r6.addLast(r11)
                goto L_0x0140
            L_0x01df:
                java.nio.file.FileSystemLoopException r1 = new java.nio.file.FileSystemLoopException
                java.lang.String r2 = r13.toString()
                r1.<init>(r2)
                throw r1
            L_0x01e9:
                java.nio.file.LinkOption[] r11 = new java.nio.file.LinkOption[r8]
                java.nio.file.LinkOption r12 = java.nio.file.LinkOption.NOFOLLOW_LINKS
                r11[r3] = r12
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r8)
                java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
                boolean r11 = java.nio.file.Files.exists(r13, r11)
                if (r11 == 0) goto L_0x0140
                r10.W = r9
                r10.Q = r6
                r10.R = r2
                r10.S = r7
                r10.T = r7
                r10.U = r7
                r10.V = r4
                java.lang.Object r11 = r9.a(r13, r10)
                if (r11 != r1) goto L_0x0140
                return r1
            L_0x0210:
                r6.removeLast()
                goto L_0x0140
            L_0x0215:
                zd.u2 r1 = zd.u2.f25116a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: se.n.b.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: N */
        public final Object g0(@g o<? super Path> oVar, @h d<? super u2> dVar) {
            return ((b) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    public n(@g Path path, @g p[] pVarArr) {
        l0.p(path, n7.b.X);
        l0.p(pVarArr, "options");
        this.f22994a = path;
        this.f22995b = pVarArr;
    }

    public final Iterator<Path> g() {
        return q.a(new a(this, (d<? super a>) null));
    }

    public final Iterator<Path> h() {
        return q.a(new b(this, (d<? super b>) null));
    }

    public final boolean i() {
        return be.p.T8(this.f22995b, p.FOLLOW_LINKS);
    }

    @g
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }

    public final boolean j() {
        return be.p.T8(this.f22995b, p.INCLUDE_DIRECTORIES);
    }

    public final LinkOption[] k() {
        return j.f22982a.a(i());
    }

    public final boolean l() {
        return be.p.T8(this.f22995b, p.BREADTH_FIRST);
    }

    public final Object m(o<? super Path> oVar, l lVar, d dVar, l<? super List<l>, u2> lVar2, d<? super u2> dVar2) {
        Path d10 = lVar.d();
        LinkOption[] e10 = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(e10, e10.length);
        if (!Files.isDirectory(d10, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (Files.exists(d10, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                i0.e(0);
                oVar.a(d10, dVar2);
                i0.e(1);
                return u2.f25116a;
            }
        } else if (!o.c(lVar)) {
            if (j()) {
                i0.e(0);
                oVar.a(d10, dVar2);
                i0.e(1);
            }
            LinkOption[] e11 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(e11, e11.length);
            if (Files.isDirectory(d10, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                lVar2.A(dVar.c(lVar));
            }
        } else {
            throw new FileSystemLoopException(d10.toString());
        }
        return u2.f25116a;
    }
}
