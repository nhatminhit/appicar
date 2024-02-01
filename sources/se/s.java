package se;

import fh.g;
import fh.h;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.SecureDirectoryStream;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.List;
import we.l;
import we.p;
import we.q;
import xe.h0;
import xe.l0;
import xe.n0;
import xe.s1;
import zd.h1;
import zd.j0;
import zd.u2;

public class s extends r {

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22996a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f22997b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|5|6|(2:7|8)|9|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        static {
            /*
                se.b[] r0 = se.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                se.b r2 = se.b.CONTINUE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                se.b r3 = se.b.TERMINATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                se.b r3 = se.b.SKIP_SUBTREE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f22996a = r0
                se.k[] r0 = se.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                se.k r3 = se.k.TERMINATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                se.k r1 = se.k.SKIP_SUBTREE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f22997b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: se.s.a.<clinit>():void");
        }
    }

    public static final class b extends n0 implements q {
        public static final b P = new b();

        public b() {
            super(3);
        }

        @g
        /* renamed from: c */
        public final Void y(@g Path path, @g Path path2, @g Exception exc) {
            l0.p(path, "<anonymous parameter 0>");
            l0.p(path2, "<anonymous parameter 1>");
            l0.p(exc, "exception");
            throw exc;
        }
    }

    public static final class c extends n0 implements q<a, Path, Path, b> {
        public final /* synthetic */ boolean P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z10) {
            super(3);
            this.P = z10;
        }

        @g
        /* renamed from: c */
        public final b y(@g a aVar, @g Path path, @g Path path2) {
            l0.p(aVar, "$this$copyToRecursively");
            l0.p(path, "src");
            l0.p(path2, "dst");
            LinkOption[] a10 = j.f22982a.a(this.P);
            boolean isDirectory = Files.isDirectory(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1));
            LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a10, a10.length);
            if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !isDirectory) {
                if (isDirectory) {
                    s.R(path2);
                }
                s1 s1Var = new s1(2);
                s1Var.b(a10);
                s1Var.a(StandardCopyOption.REPLACE_EXISTING);
                CopyOption[] copyOptionArr = (CopyOption[]) s1Var.d(new CopyOption[s1Var.c()]);
                l0.o(Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
            }
            return b.CONTINUE;
        }
    }

    public static final class d extends n0 implements q {
        public static final d P = new d();

        public d() {
            super(3);
        }

        @g
        /* renamed from: c */
        public final Void y(@g Path path, @g Path path2, @g Exception exc) {
            l0.p(path, "<anonymous parameter 0>");
            l0.p(path2, "<anonymous parameter 1>");
            l0.p(exc, "exception");
            throw exc;
        }
    }

    public static final class e extends n0 implements q<a, Path, Path, b> {
        public final /* synthetic */ boolean P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(boolean z10) {
            super(3);
            this.P = z10;
        }

        @g
        /* renamed from: c */
        public final b y(@g a aVar, @g Path path, @g Path path2) {
            l0.p(aVar, "$this$null");
            l0.p(path, "src");
            l0.p(path2, "dst");
            return aVar.a(path, path2, this.P);
        }
    }

    public static final class f extends n0 implements l<g, u2> {
        public final /* synthetic */ q<a, Path, Path, b> P;
        public final /* synthetic */ Path Q;
        public final /* synthetic */ Path R;
        public final /* synthetic */ q<Path, Path, Exception, k> S;

        public /* synthetic */ class a extends h0 implements p<Path, BasicFileAttributes, FileVisitResult> {
            public final /* synthetic */ q<a, Path, Path, b> X;
            public final /* synthetic */ Path Y;
            public final /* synthetic */ Path Z;

            /* renamed from: a0  reason: collision with root package name */
            public final /* synthetic */ q<Path, Path, Exception, k> f22998a0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(q<? super a, ? super Path, ? super Path, ? extends b> qVar, Path path, Path path2, q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2) {
                super(2, l0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.X = qVar;
                this.Y = path;
                this.Z = path2;
                this.f22998a0 = qVar2;
            }

            @g
            /* renamed from: z0 */
            public final FileVisitResult g0(@g Path path, @g BasicFileAttributes basicFileAttributes) {
                l0.p(path, "p0");
                l0.p(basicFileAttributes, "p1");
                return s.M(this.X, this.Y, this.Z, this.f22998a0, path, basicFileAttributes);
            }
        }

        public /* synthetic */ class b extends h0 implements p<Path, BasicFileAttributes, FileVisitResult> {
            public final /* synthetic */ q<a, Path, Path, b> X;
            public final /* synthetic */ Path Y;
            public final /* synthetic */ Path Z;

            /* renamed from: a0  reason: collision with root package name */
            public final /* synthetic */ q<Path, Path, Exception, k> f22999a0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(q<? super a, ? super Path, ? super Path, ? extends b> qVar, Path path, Path path2, q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2) {
                super(2, l0.a.class, "copy", "copyToRecursively$copy$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/attribute/BasicFileAttributes;)Ljava/nio/file/FileVisitResult;", 0);
                this.X = qVar;
                this.Y = path;
                this.Z = path2;
                this.f22999a0 = qVar2;
            }

            @g
            /* renamed from: z0 */
            public final FileVisitResult g0(@g Path path, @g BasicFileAttributes basicFileAttributes) {
                l0.p(path, "p0");
                l0.p(basicFileAttributes, "p1");
                return s.M(this.X, this.Y, this.Z, this.f22999a0, path, basicFileAttributes);
            }
        }

        public /* synthetic */ class c extends h0 implements p<Path, Exception, FileVisitResult> {
            public final /* synthetic */ q<Path, Path, Exception, k> X;
            public final /* synthetic */ Path Y;
            public final /* synthetic */ Path Z;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, Path path, Path path2) {
                super(2, l0.a.class, "error", "copyToRecursively$error$PathsKt__PathRecursiveFunctionsKt(Lkotlin/jvm/functions/Function3;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/nio/file/Path;Ljava/lang/Exception;)Ljava/nio/file/FileVisitResult;", 0);
                this.X = qVar;
                this.Y = path;
                this.Z = path2;
            }

            @g
            /* renamed from: z0 */
            public final FileVisitResult g0(@g Path path, @g Exception exc) {
                l0.p(path, "p0");
                l0.p(exc, "p1");
                return s.Q(this.X, this.Y, this.Z, path, exc);
            }
        }

        public static final class d extends n0 implements p<Path, IOException, FileVisitResult> {
            public final /* synthetic */ q<Path, Path, Exception, k> P;
            public final /* synthetic */ Path Q;
            public final /* synthetic */ Path R;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, Path path, Path path2) {
                super(2);
                this.P = qVar;
                this.Q = path;
                this.R = path2;
            }

            @g
            /* renamed from: c */
            public final FileVisitResult g0(@g Path path, @h IOException iOException) {
                l0.p(path, "directory");
                return iOException == null ? FileVisitResult.CONTINUE : s.Q(this.P, this.Q, this.R, path, iOException);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(q<? super a, ? super Path, ? super Path, ? extends b> qVar, Path path, Path path2, q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2) {
            super(1);
            this.P = qVar;
            this.Q = path;
            this.R = path2;
            this.S = qVar2;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((g) obj);
            return u2.f25116a;
        }

        public final void c(@g g gVar) {
            l0.p(gVar, "$this$visitFileTree");
            gVar.d(new a(this.P, this.Q, this.R, this.S));
            gVar.b(new b(this.P, this.Q, this.R, this.S));
            gVar.a(new c(this.S, this.Q, this.R));
            gVar.c(new d(this.S, this.Q, this.R));
        }
    }

    public static final void J(e eVar, we.a<u2> aVar) {
        try {
            aVar.n();
        } catch (Exception e10) {
            eVar.a(e10);
        }
    }

    @h1(version = "1.8")
    @g
    @f
    public static final Path K(@g Path path, @g Path path2, @g q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, boolean z10, @g q<? super a, ? super Path, ? super Path, ? extends b> qVar2) {
        l0.p(path, "<this>");
        l0.p(path2, j3.c.Y);
        l0.p(qVar, "onError");
        l0.p(qVar2, "copyAction");
        LinkOption[] a10 = j.f22982a.a(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(a10, a10.length);
        if (Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            boolean z11 = false;
            if (Files.exists(path, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && (z10 || !Files.isSymbolicLink(path))) {
                boolean z12 = Files.exists(path2, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && !Files.isSymbolicLink(path2);
                if (!z12 || !Files.isSameFile(path, path2)) {
                    Path realPath = path.toRealPath(new LinkOption[0]);
                    if (z12) {
                        z11 = path2.toRealPath(new LinkOption[0]).startsWith(realPath);
                    } else {
                        Path parent = path2.getParent();
                        if (parent != null && Files.exists(parent, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0)) && parent.toRealPath(new LinkOption[0]).startsWith(realPath)) {
                            z11 = true;
                        }
                    }
                    if (z11) {
                        throw new FileSystemException(path.toString(), path2.toString(), "Recursively copying a directory into its subdirectory is prohibited.");
                    }
                }
            }
            t.B1(path, 0, z10, new f(qVar2, path, path2, qVar), 1, (Object) null);
            return path2;
        }
        throw new NoSuchFileException(path.toString(), path2.toString(), "The source file doesn't exist.");
    }

    @h1(version = "1.8")
    @g
    @f
    public static final Path L(@g Path path, @g Path path2, @g q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, boolean z10, boolean z11) {
        l0.p(path, "<this>");
        l0.p(path2, j3.c.Y);
        l0.p(qVar, "onError");
        return z11 ? K(path, path2, qVar, z10, new c(z10)) : N(path, path2, qVar, z10, (q) null, 8, (Object) null);
    }

    public static final FileVisitResult M(q<? super a, ? super Path, ? super Path, ? extends b> qVar, Path path, Path path2, q<? super Path, ? super Path, ? super Exception, ? extends k> qVar2, Path path3, BasicFileAttributes basicFileAttributes) {
        try {
            return Y((b) qVar.y(c.f22965a, path3, P(path, path2, path3)));
        } catch (Exception e10) {
            return Q(qVar2, path, path2, path3, e10);
        }
    }

    public static /* synthetic */ Path N(Path path, Path path2, q qVar, boolean z10, q qVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = d.P;
        }
        if ((i10 & 8) != 0) {
            qVar2 = new e(z10);
        }
        return K(path, path2, qVar, z10, qVar2);
    }

    public static /* synthetic */ Path O(Path path, Path path2, q qVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            qVar = b.P;
        }
        return L(path, path2, qVar, z10, z11);
    }

    public static final Path P(Path path, Path path2, Path path3) {
        Path resolve = path2.resolve(t.p1(path3, path));
        l0.o(resolve, "target.resolve(relativePath)");
        return resolve;
    }

    public static final FileVisitResult Q(q<? super Path, ? super Path, ? super Exception, ? extends k> qVar, Path path, Path path2, Path path3, Exception exc) {
        return Z((k) qVar.y(path3, P(path, path2, path3), exc));
    }

    @h1(version = "1.8")
    @f
    public static final void R(@g Path path) {
        l0.p(path, "<this>");
        List<Exception> S = S(path);
        if (!S.isEmpty()) {
            FileSystemException fileSystemException = new FileSystemException("Failed to delete one or more files. See suppressed exceptions for details.");
            for (Exception a10 : S) {
                zd.p.a(fileSystemException, a10);
            }
            throw fileSystemException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        re.c.a(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.Exception> S(java.nio.file.Path r7) {
        /*
            se.e r0 = new se.e
            r1 = 0
            r2 = 1
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.nio.file.Path r4 = r7.getParent()
            if (r4 == 0) goto L_0x003c
            java.nio.file.DirectoryStream r5 = java.nio.file.Files.newDirectoryStream(r4)     // Catch:{ all -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r5 = r3
        L_0x0014:
            if (r5 == 0) goto L_0x003c
            boolean r6 = r5 instanceof java.nio.file.SecureDirectoryStream     // Catch:{ all -> 0x0035 }
            if (r6 == 0) goto L_0x002d
            r0.g(r4)     // Catch:{ all -> 0x0035 }
            r2 = r5
            java.nio.file.SecureDirectoryStream r2 = (java.nio.file.SecureDirectoryStream) r2     // Catch:{ all -> 0x0035 }
            java.nio.file.Path r4 = r7.getFileName()     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = "this.fileName"
            xe.l0.o(r4, r6)     // Catch:{ all -> 0x0035 }
            U(r2, r4, r0)     // Catch:{ all -> 0x0035 }
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            zd.u2 r2 = zd.u2.f25116a     // Catch:{ all -> 0x0035 }
            re.c.a(r5, r3)
            r2 = r1
            goto L_0x003c
        L_0x0035:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            re.c.a(r5, r7)
            throw r0
        L_0x003c:
            if (r2 == 0) goto L_0x0041
            W(r7, r0)
        L_0x0041:
            java.util.List r7 = r0.d()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: se.s.S(java.nio.file.Path):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        re.c.a(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void T(java.nio.file.SecureDirectoryStream<java.nio.file.Path> r4, java.nio.file.Path r5, se.e r6) {
        /*
            r0 = 1
            r1 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]     // Catch:{ NoSuchFileException -> 0x0010 }
            r2 = 0
            java.nio.file.LinkOption r3 = java.nio.file.LinkOption.NOFOLLOW_LINKS     // Catch:{ NoSuchFileException -> 0x0010 }
            r0[r2] = r3     // Catch:{ NoSuchFileException -> 0x0010 }
            java.nio.file.SecureDirectoryStream r4 = r4.newDirectoryStream(r5, r0)     // Catch:{ NoSuchFileException -> 0x0010 }
            goto L_0x0011
        L_0x000e:
            r4 = move-exception
            goto L_0x003d
        L_0x0010:
            r4 = r1
        L_0x0011:
            if (r4 == 0) goto L_0x0040
            java.util.Iterator r5 = r4.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0017:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0036 }
            java.nio.file.Path r0 = (java.nio.file.Path) r0     // Catch:{ all -> 0x0036 }
            java.nio.file.Path r0 = r0.getFileName()     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "entry.fileName"
            xe.l0.o(r0, r2)     // Catch:{ all -> 0x0036 }
            U(r4, r0, r6)     // Catch:{ all -> 0x0036 }
            goto L_0x0017
        L_0x0030:
            zd.u2 r5 = zd.u2.f25116a     // Catch:{ all -> 0x0036 }
            re.c.a(r4, r1)     // Catch:{ Exception -> 0x000e }
            goto L_0x0040
        L_0x0036:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            re.c.a(r4, r5)     // Catch:{ Exception -> 0x000e }
            throw r0     // Catch:{ Exception -> 0x000e }
        L_0x003d:
            r6.a(r4)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: se.s.T(java.nio.file.SecureDirectoryStream, java.nio.file.Path, se.e):void");
    }

    public static final void U(SecureDirectoryStream<Path> secureDirectoryStream, Path path, e eVar) {
        eVar.b(path);
        try {
            if (X(secureDirectoryStream, path, LinkOption.NOFOLLOW_LINKS)) {
                int f10 = eVar.f();
                T(secureDirectoryStream, path, eVar);
                if (f10 == eVar.f()) {
                    try {
                        secureDirectoryStream.deleteDirectory(path);
                    } catch (NoSuchFileException unused) {
                    }
                }
                eVar.c(path);
            }
            secureDirectoryStream.deleteFile(path);
            u2 u2Var = u2.f25116a;
        } catch (Exception e10) {
            eVar.a(e10);
        }
        eVar.c(path);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        re.c.a(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void V(java.nio.file.Path r4, se.e r5) {
        /*
            r0 = 0
            java.nio.file.DirectoryStream r4 = java.nio.file.Files.newDirectoryStream(r4)     // Catch:{ NoSuchFileException -> 0x0008 }
            goto L_0x0009
        L_0x0006:
            r4 = move-exception
            goto L_0x0031
        L_0x0008:
            r4 = r0
        L_0x0009:
            if (r4 == 0) goto L_0x0034
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x002a }
        L_0x000f:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x002a }
            java.nio.file.Path r2 = (java.nio.file.Path) r2     // Catch:{ all -> 0x002a }
            java.lang.String r3 = "entry"
            xe.l0.o(r2, r3)     // Catch:{ all -> 0x002a }
            W(r2, r5)     // Catch:{ all -> 0x002a }
            goto L_0x000f
        L_0x0024:
            zd.u2 r1 = zd.u2.f25116a     // Catch:{ all -> 0x002a }
            re.c.a(r4, r0)     // Catch:{ Exception -> 0x0006 }
            goto L_0x0034
        L_0x002a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002c }
        L_0x002c:
            r1 = move-exception
            re.c.a(r4, r0)     // Catch:{ Exception -> 0x0006 }
            throw r1     // Catch:{ Exception -> 0x0006 }
        L_0x0031:
            r5.a(r4)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: se.s.V(java.nio.file.Path, se.e):void");
    }

    public static final void W(Path path, e eVar) {
        try {
            if (Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
                int f10 = eVar.f();
                V(path, eVar);
                if (f10 != eVar.f()) {
                    return;
                }
            }
            Files.deleteIfExists(path);
        } catch (Exception e10) {
            eVar.a(e10);
        }
    }

    public static final boolean X(SecureDirectoryStream<Path> secureDirectoryStream, Path path, LinkOption... linkOptionArr) {
        Boolean bool;
        try {
            bool = Boolean.valueOf(((BasicFileAttributeView) secureDirectoryStream.getFileAttributeView(path, BasicFileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))).readAttributes().isDirectory());
        } catch (NoSuchFileException unused) {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @f
    public static final FileVisitResult Y(b bVar) {
        int i10 = a.f22996a[bVar.ordinal()];
        if (i10 == 1) {
            return FileVisitResult.CONTINUE;
        }
        if (i10 == 2) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 3) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new j0();
    }

    @f
    public static final FileVisitResult Z(k kVar) {
        int i10 = a.f22997b[kVar.ordinal()];
        if (i10 == 1) {
            return FileVisitResult.TERMINATE;
        }
        if (i10 == 2) {
            return FileVisitResult.SKIP_SUBTREE;
        }
        throw new j0();
    }

    public static final <R> R a0(we.a<? extends R> aVar) {
        try {
            return aVar.n();
        } catch (NoSuchFileException unused) {
            return null;
        }
    }
}
