package re;

import be.e0;
import fh.g;
import fh.h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lf.b0;
import lf.c0;
import u3.f;
import va.e;
import we.l;
import we.p;
import xe.l0;
import xe.n0;
import zd.k;
import zd.u2;

public class q extends p {

    public static final class a extends n0 implements p {
        public static final a P = new a();

        public a() {
            super(2);
        }

        @g
        /* renamed from: c */
        public final Void g0(@g File file, @g IOException iOException) {
            l0.p(file, "<anonymous parameter 0>");
            l0.p(iOException, "exception");
            throw iOException;
        }
    }

    public static final class b extends n0 implements p<File, IOException, u2> {
        public final /* synthetic */ p<File, IOException, u> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(p<? super File, ? super IOException, ? extends u> pVar) {
            super(2);
            this.P = pVar;
        }

        public final void c(@g File file, @g IOException iOException) {
            l0.p(file, f.A);
            l0.p(iOException, e.f23523d);
            if (this.P.g0(file, iOException) == u.TERMINATE) {
                throw new x(file);
            }
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            c((File) obj, (IOException) obj2);
            return u2.f25116a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c A[Catch:{ x -> 0x00dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean N(@fh.g java.io.File r11, @fh.g java.io.File r12, boolean r13, @fh.g we.p<? super java.io.File, ? super java.io.IOException, ? extends re.u> r14) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r11, r0)
            java.lang.String r0 = "target"
            xe.l0.p(r12, r0)
            java.lang.String r0 = "onError"
            xe.l0.p(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002e
            re.t r12 = new re.t
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.g0(r11, r12)
            re.u r12 = re.u.TERMINATE
            if (r11 == r12) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            return r1
        L_0x002e:
            re.k r0 = re.p.M(r11)     // Catch:{ x -> 0x00dc }
            re.q$b r3 = new re.q$b     // Catch:{ x -> 0x00dc }
            r3.<init>(r14)     // Catch:{ x -> 0x00dc }
            re.k r0 = r0.k(r3)     // Catch:{ x -> 0x00dc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ x -> 0x00dc }
        L_0x003f:
            boolean r3 = r0.hasNext()     // Catch:{ x -> 0x00dc }
            if (r3 == 0) goto L_0x00db
            java.lang.Object r3 = r0.next()     // Catch:{ x -> 0x00dc }
            java.io.File r3 = (java.io.File) r3     // Catch:{ x -> 0x00dc }
            boolean r4 = r3.exists()     // Catch:{ x -> 0x00dc }
            if (r4 != 0) goto L_0x0066
            re.t r10 = new re.t     // Catch:{ x -> 0x00dc }
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ x -> 0x00dc }
            java.lang.Object r3 = r14.g0(r3, r10)     // Catch:{ x -> 0x00dc }
            re.u r4 = re.u.TERMINATE     // Catch:{ x -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x0066:
            java.lang.String r4 = n0(r3, r11)     // Catch:{ x -> 0x00dc }
            java.io.File r5 = new java.io.File     // Catch:{ x -> 0x00dc }
            r5.<init>(r12, r4)     // Catch:{ x -> 0x00dc }
            boolean r4 = r5.exists()     // Catch:{ x -> 0x00dc }
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r3.isDirectory()     // Catch:{ x -> 0x00dc }
            if (r4 == 0) goto L_0x0081
            boolean r4 = r5.isDirectory()     // Catch:{ x -> 0x00dc }
            if (r4 != 0) goto L_0x00ac
        L_0x0081:
            if (r13 != 0) goto L_0x0085
        L_0x0083:
            r4 = r1
            goto L_0x009a
        L_0x0085:
            boolean r4 = r5.isDirectory()     // Catch:{ x -> 0x00dc }
            if (r4 == 0) goto L_0x0092
            boolean r4 = V(r5)     // Catch:{ x -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0092:
            boolean r4 = r5.delete()     // Catch:{ x -> 0x00dc }
            if (r4 != 0) goto L_0x0099
            goto L_0x0083
        L_0x0099:
            r4 = r2
        L_0x009a:
            if (r4 == 0) goto L_0x00ac
            re.h r4 = new re.h     // Catch:{ x -> 0x00dc }
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch:{ x -> 0x00dc }
            java.lang.Object r3 = r14.g0(r5, r4)     // Catch:{ x -> 0x00dc }
            re.u r4 = re.u.TERMINATE     // Catch:{ x -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00ac:
            boolean r4 = r3.isDirectory()     // Catch:{ x -> 0x00dc }
            if (r4 == 0) goto L_0x00b6
            r5.mkdirs()     // Catch:{ x -> 0x00dc }
            goto L_0x003f
        L_0x00b6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = Q(r4, r5, r6, r7, r8, r9)     // Catch:{ x -> 0x00dc }
            long r4 = r4.length()     // Catch:{ x -> 0x00dc }
            long r6 = r3.length()     // Catch:{ x -> 0x00dc }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x003f
            java.io.IOException r4 = new java.io.IOException     // Catch:{ x -> 0x00dc }
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch:{ x -> 0x00dc }
            java.lang.Object r3 = r14.g0(r3, r4)     // Catch:{ x -> 0x00dc }
            re.u r4 = re.u.TERMINATE     // Catch:{ x -> 0x00dc }
            if (r3 != r4) goto L_0x003f
            return r2
        L_0x00db:
            return r1
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: re.q.N(java.io.File, java.io.File, boolean, we.p):boolean");
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z10, p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            pVar = a.P;
        }
        return N(file, file2, z10, pVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0064, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        re.c.a(r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006b, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006c, code lost:
        re.c.a(r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
        throw r7;
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.File P(@fh.g java.io.File r6, @fh.g java.io.File r7, boolean r8, int r9) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r6, r0)
            java.lang.String r0 = "target"
            xe.l0.p(r7, r0)
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0070
            boolean r0 = r7.exists()
            if (r0 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x0027
            boolean r8 = r7.delete()
            if (r8 == 0) goto L_0x001f
            goto L_0x002f
        L_0x001f:
            re.h r8 = new re.h
            java.lang.String r9 = "Tried to overwrite the destination, but failed to delete it."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0027:
            re.h r8 = new re.h
            java.lang.String r9 = "The destination file already exists."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x002f:
            boolean r8 = r6.isDirectory()
            if (r8 == 0) goto L_0x0044
            boolean r8 = r7.mkdirs()
            if (r8 == 0) goto L_0x003c
            goto L_0x0061
        L_0x003c:
            re.j r8 = new re.j
            java.lang.String r9 = "Failed to create target directory."
            r8.<init>(r6, r7, r9)
            throw r8
        L_0x0044:
            java.io.File r8 = r7.getParentFile()
            if (r8 == 0) goto L_0x004d
            r8.mkdirs()
        L_0x004d:
            java.io.FileInputStream r8 = new java.io.FileInputStream
            r8.<init>(r6)
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ all -> 0x0069 }
            r6.<init>(r7)     // Catch:{ all -> 0x0069 }
            re.b.k(r8, r6, r9)     // Catch:{ all -> 0x0062 }
            r9 = 0
            re.c.a(r6, r9)     // Catch:{ all -> 0x0069 }
            re.c.a(r8, r9)
        L_0x0061:
            return r7
        L_0x0062:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r9 = move-exception
            re.c.a(r6, r7)     // Catch:{ all -> 0x0069 }
            throw r9     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x006b }
        L_0x006b:
            r7 = move-exception
            re.c.a(r8, r6)
            throw r7
        L_0x0070:
            re.t r7 = new re.t
            r2 = 0
            r4 = 2
            r5 = 0
            java.lang.String r3 = "The source file doesn't exist."
            r0 = r7
            r1 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: re.q.P(java.io.File, java.io.File, boolean, int):java.io.File");
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return P(file, file2, z10, i10);
    }

    @g
    @k(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File R(@g String str, @h String str2, @h File file) {
        l0.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        createTempFile.delete();
        if (createTempFile.mkdir()) {
            l0.o(createTempFile, "dir");
            return createTempFile;
        }
        throw new IOException("Unable to create temporary directory " + createTempFile + '.');
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @g
    @k(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File T(@g String str, @h String str2, @h File file) {
        l0.p(str, "prefix");
        File createTempFile = File.createTempFile(str, str2, file);
        l0.o(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static final boolean V(@g File file) {
        l0.p(file, "<this>");
        Iterator it = p.L(file).iterator();
        while (true) {
            boolean z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                File file2 = (File) it.next();
                if (file2.delete() || !file2.exists()) {
                    if (z10) {
                    }
                }
                z10 = false;
            }
        }
    }

    public static final boolean W(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "other");
        i f10 = n.f(file);
        i f11 = n.f(file2);
        if (f11.i()) {
            return l0.g(file, file2);
        }
        int h10 = f10.h() - f11.h();
        if (h10 < 0) {
            return false;
        }
        return f10.g().subList(h10, f10.h()).equals(f11.g());
    }

    public static final boolean X(@g File file, @g String str) {
        l0.p(file, "<this>");
        l0.p(str, "other");
        return W(file, new File(str));
    }

    @g
    public static final String Y(@g File file) {
        l0.p(file, "<this>");
        String name = file.getName();
        l0.o(name, "name");
        return c0.r5(name, '.', "");
    }

    @g
    public static final String Z(@g File file) {
        l0.p(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            l0.o(path, "path");
            return b0.k2(path, File.separatorChar, '/', false, 4, (Object) null);
        }
        String path2 = file.getPath();
        l0.o(path2, "path");
        return path2;
    }

    @g
    public static final String a0(@g File file) {
        l0.p(file, "<this>");
        String name = file.getName();
        l0.o(name, "name");
        return c0.C5(name, ".", (String) null, 2, (Object) null);
    }

    @g
    public static final File b0(@g File file) {
        l0.p(file, "<this>");
        i f10 = n.f(file);
        File e10 = f10.e();
        List<File> c02 = c0(f10.g());
        String str = File.separator;
        l0.o(str, "separator");
        return i0(e10, e0.h3(c02, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
    }

    public static final List<File> c0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!l0.g(name, ".")) {
                if (!l0.g(name, "..") || arrayList.isEmpty() || l0.g(((File) e0.k3(arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    public static final i d0(i iVar) {
        return new i(iVar.e(), c0(iVar.g()));
    }

    @g
    public static final File e0(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        return new File(n0(file, file2));
    }

    @h
    public static final File f0(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        String o02 = o0(file, file2);
        if (o02 != null) {
            return new File(o02);
        }
        return null;
    }

    @g
    public static final File g0(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        String o02 = o0(file, file2);
        return o02 != null ? new File(o02) : file;
    }

    @g
    public static final File h0(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "relative");
        if (n.d(file2)) {
            return file2;
        }
        String file3 = file.toString();
        l0.o(file3, "this.toString()");
        if ((file3.length() == 0) || c0.b3(file3, File.separatorChar, false, 2, (Object) null)) {
            return new File(file3 + file2);
        }
        return new File(file3 + File.separatorChar + file2);
    }

    @g
    public static final File i0(@g File file, @g String str) {
        l0.p(file, "<this>");
        l0.p(str, "relative");
        return h0(file, new File(str));
    }

    @g
    public static final File j0(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "relative");
        i f10 = n.f(file);
        return h0(h0(f10.e(), f10.h() == 0 ? new File("..") : f10.j(0, f10.h() - 1)), file2);
    }

    @g
    public static final File k0(@g File file, @g String str) {
        l0.p(file, "<this>");
        l0.p(str, "relative");
        return j0(file, new File(str));
    }

    public static final boolean l0(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "other");
        i f10 = n.f(file);
        i f11 = n.f(file2);
        if (l0.g(f10.e(), f11.e()) && f10.h() >= f11.h()) {
            return f10.g().subList(0, f11.h()).equals(f11.g());
        }
        return false;
    }

    public static final boolean m0(@g File file, @g String str) {
        l0.p(file, "<this>");
        l0.p(str, "other");
        return l0(file, new File(str));
    }

    @g
    public static final String n0(@g File file, @g File file2) {
        l0.p(file, "<this>");
        l0.p(file2, "base");
        String o02 = o0(file, file2);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + file2 + '.');
    }

    public static final String o0(File file, File file2) {
        i d02 = d0(n.f(file));
        i d03 = d0(n.f(file2));
        if (!l0.g(d02.e(), d03.e())) {
            return null;
        }
        int h10 = d03.h();
        int h11 = d02.h();
        int i10 = 0;
        int min = Math.min(h11, h10);
        while (i10 < min && l0.g(d02.g().get(i10), d03.g().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = h10 - 1;
        if (i10 <= i11) {
            while (!l0.g(d03.g().get(i11).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < h11) {
            if (i10 < h10) {
                sb2.append(File.separatorChar);
            }
            List<T> X1 = e0.X1(d02.g(), i10);
            String str = File.separator;
            l0.o(str, "separator");
            e0.f3(X1, sb2, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 124, (Object) null);
        }
        return sb2.toString();
    }
}
