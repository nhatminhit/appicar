package re;

import fh.g;
import fh.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import p000if.m;
import we.l;
import we.p;
import xe.l0;
import xe.w;
import zd.j0;
import zd.u2;

public final class k implements m<File> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final File f22488a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final l f22489b;
    @h

    /* renamed from: c  reason: collision with root package name */
    public final l<File, Boolean> f22490c;
    @h

    /* renamed from: d  reason: collision with root package name */
    public final l<File, u2> f22491d;
    @h

    /* renamed from: e  reason: collision with root package name */
    public final p<File, IOException, u2> f22492e;

    /* renamed from: f  reason: collision with root package name */
    public final int f22493f;

    public static abstract class a extends c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(@g File file) {
            super(file);
            l0.p(file, "rootDir");
        }
    }

    public final class b extends be.b<File> {
        @g
        public final ArrayDeque<c> Q;

        public final class a extends a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f22494b;
            @h

            /* renamed from: c  reason: collision with root package name */
            public File[] f22495c;

            /* renamed from: d  reason: collision with root package name */
            public int f22496d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f22497e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ b f22498f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(@g b bVar, File file) {
                super(file);
                l0.p(file, "rootDir");
                this.f22498f = bVar;
            }

            @h
            public File b() {
                if (!this.f22497e && this.f22495c == null) {
                    l e10 = k.this.f22490c;
                    boolean z10 = false;
                    if (e10 != null && !((Boolean) e10.A(a())).booleanValue()) {
                        z10 = true;
                    }
                    if (z10) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.f22495c = listFiles;
                    if (listFiles == null) {
                        p f10 = k.this.f22492e;
                        if (f10 != null) {
                            f10.g0(a(), new a(a(), (File) null, "Cannot list files in a directory", 2, (w) null));
                        }
                        this.f22497e = true;
                    }
                }
                File[] fileArr = this.f22495c;
                if (fileArr != null) {
                    int i10 = this.f22496d;
                    l0.m(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f22495c;
                        l0.m(fileArr2);
                        int i11 = this.f22496d;
                        this.f22496d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f22494b) {
                    this.f22494b = true;
                    return a();
                }
                l g10 = k.this.f22491d;
                if (g10 != null) {
                    g10.A(a());
                }
                return null;
            }
        }

        /* renamed from: re.k$b$b  reason: collision with other inner class name */
        public final class C0405b extends c {

            /* renamed from: b  reason: collision with root package name */
            public boolean f22499b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ b f22500c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0405b(@g b bVar, File file) {
                super(file);
                l0.p(file, "rootFile");
                this.f22500c = bVar;
            }

            @h
            public File b() {
                if (this.f22499b) {
                    return null;
                }
                this.f22499b = true;
                return a();
            }
        }

        public final class c extends a {

            /* renamed from: b  reason: collision with root package name */
            public boolean f22501b;
            @h

            /* renamed from: c  reason: collision with root package name */
            public File[] f22502c;

            /* renamed from: d  reason: collision with root package name */
            public int f22503d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ b f22504e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(@g b bVar, File file) {
                super(file);
                l0.p(file, "rootDir");
                this.f22504e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0083, code lost:
                if (r0.length == 0) goto L_0x0085;
             */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.f22501b
                    r1 = 0
                    if (r0 != 0) goto L_0x002c
                    re.k$b r0 = r10.f22504e
                    re.k r0 = re.k.this
                    we.l r0 = r0.f22490c
                    r2 = 0
                    r3 = 1
                    if (r0 == 0) goto L_0x0022
                    java.io.File r4 = r10.a()
                    java.lang.Object r0 = r0.A(r4)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L_0x0022
                    r2 = r3
                L_0x0022:
                    if (r2 == 0) goto L_0x0025
                    return r1
                L_0x0025:
                    r10.f22501b = r3
                    java.io.File r0 = r10.a()
                    return r0
                L_0x002c:
                    java.io.File[] r0 = r10.f22502c
                    if (r0 == 0) goto L_0x004b
                    int r2 = r10.f22503d
                    xe.l0.m(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x0039
                    goto L_0x004b
                L_0x0039:
                    re.k$b r0 = r10.f22504e
                    re.k r0 = re.k.this
                    we.l r0 = r0.f22491d
                    if (r0 == 0) goto L_0x004a
                    java.io.File r2 = r10.a()
                    r0.A(r2)
                L_0x004a:
                    return r1
                L_0x004b:
                    java.io.File[] r0 = r10.f22502c
                    if (r0 != 0) goto L_0x0097
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f22502c = r0
                    if (r0 != 0) goto L_0x007b
                    re.k$b r0 = r10.f22504e
                    re.k r0 = re.k.this
                    we.p r0 = r0.f22492e
                    if (r0 == 0) goto L_0x007b
                    java.io.File r2 = r10.a()
                    re.a r9 = new re.a
                    java.io.File r4 = r10.a()
                    r5 = 0
                    r7 = 2
                    r8 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.g0(r2, r9)
                L_0x007b:
                    java.io.File[] r0 = r10.f22502c
                    if (r0 == 0) goto L_0x0085
                    xe.l0.m(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x0097
                L_0x0085:
                    re.k$b r0 = r10.f22504e
                    re.k r0 = re.k.this
                    we.l r0 = r0.f22491d
                    if (r0 == 0) goto L_0x0096
                    java.io.File r2 = r10.a()
                    r0.A(r2)
                L_0x0096:
                    return r1
                L_0x0097:
                    java.io.File[] r0 = r10.f22502c
                    xe.l0.m(r0)
                    int r1 = r10.f22503d
                    int r2 = r1 + 1
                    r10.f22503d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: re.k.b.c.b():java.io.File");
            }
        }

        public /* synthetic */ class d {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22505a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    re.l[] r0 = re.l.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    re.l r1 = re.l.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    re.l r1 = re.l.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f22505a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: re.k.b.d.<clinit>():void");
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.Q = arrayDeque;
            if (k.this.f22488a.isDirectory()) {
                arrayDeque.push(e(k.this.f22488a));
            } else if (k.this.f22488a.isFile()) {
                arrayDeque.push(new C0405b(this, k.this.f22488a));
            } else {
                b();
            }
        }

        public void a() {
            File f10 = f();
            if (f10 != null) {
                c(f10);
            } else {
                b();
            }
        }

        public final a e(File file) {
            int i10 = d.f22505a[k.this.f22489b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new j0();
        }

        public final File f() {
            File b10;
            while (true) {
                c peek = this.Q.peek();
                if (peek == null) {
                    return null;
                }
                b10 = peek.b();
                if (b10 == null) {
                    this.Q.pop();
                } else if (l0.g(b10, peek.a()) || !b10.isDirectory() || this.Q.size() >= k.this.f22493f) {
                    return b10;
                } else {
                    this.Q.push(e(b10));
                }
            }
            return b10;
        }
    }

    public static abstract class c {
        @g

        /* renamed from: a  reason: collision with root package name */
        public final File f22506a;

        public c(@g File file) {
            l0.p(file, "root");
            this.f22506a = file;
        }

        @g
        public final File a() {
            return this.f22506a;
        }

        @h
        public abstract File b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k(@g File file, @g l lVar) {
        this(file, lVar, (l) null, (l) null, (p) null, 0, 32, (w) null);
        l0.p(file, n7.b.X);
        l0.p(lVar, "direction");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(File file, l lVar, int i10, w wVar) {
        this(file, (i10 & 2) != 0 ? l.TOP_DOWN : lVar);
    }

    public k(File file, l lVar, l<? super File, Boolean> lVar2, l<? super File, u2> lVar3, p<? super File, ? super IOException, u2> pVar, int i10) {
        this.f22488a = file;
        this.f22489b = lVar;
        this.f22490c = lVar2;
        this.f22491d = lVar3;
        this.f22492e = pVar;
        this.f22493f = i10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(File file, l lVar, l lVar2, l lVar3, p pVar, int i10, int i11, w wVar) {
        this(file, (i11 & 2) != 0 ? l.TOP_DOWN : lVar, lVar2, lVar3, pVar, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    @g
    public final k i(int i10) {
        if (i10 > 0) {
            return new k(this.f22488a, this.f22489b, this.f22490c, this.f22491d, this.f22492e, i10);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i10 + '.');
    }

    @g
    public Iterator<File> iterator() {
        return new b();
    }

    @g
    public final k j(@g l<? super File, Boolean> lVar) {
        l0.p(lVar, "function");
        return new k(this.f22488a, this.f22489b, lVar, this.f22491d, this.f22492e, this.f22493f);
    }

    @g
    public final k k(@g p<? super File, ? super IOException, u2> pVar) {
        l0.p(pVar, "function");
        return new k(this.f22488a, this.f22489b, this.f22490c, this.f22491d, pVar, this.f22493f);
    }

    @g
    public final k l(@g l<? super File, u2> lVar) {
        l0.p(lVar, "function");
        return new k(this.f22488a, this.f22489b, this.f22490c, lVar, this.f22492e, this.f22493f);
    }
}
