package se;

import be.k1;
import be.l1;
import fh.g;
import fh.h;
import j3.c;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileStore;
import java.nio.file.FileVisitOption;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.UserPrincipal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import lf.b0;
import oe.f;
import p000if.m;
import w1.a;
import we.l;
import xe.l0;
import zd.a1;
import zd.b1;
import zd.h1;
import zd.k;
import zd.u2;
import zd.y;
import zd.y2;

public class t extends s {
    @g
    @a1
    public static final Void A0(@g Path path, @g Class<?> cls) {
        l0.p(path, "path");
        l0.p(cls, "attributeViewClass");
        throw new UnsupportedOperationException("The desired attribute view type " + cls + " is not available for the file " + path + '.');
    }

    @h1(version = "1.7")
    @f
    public static final void A1(@g Path path, @g FileVisitor<Path> fileVisitor, int i10, boolean z10) {
        l0.p(path, "<this>");
        l0.p(fileVisitor, "visitor");
        Files.walkFileTree(path, z10 ? k1.f(FileVisitOption.FOLLOW_LINKS) : l1.k(), i10, fileVisitor);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final /* synthetic */ <V extends FileAttributeView> V B0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        l0.y(4, a.R4);
        V fileAttributeView = Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        if (fileAttributeView != null) {
            return fileAttributeView;
        }
        l0.y(4, a.R4);
        A0(path, FileAttributeView.class);
        throw new y();
    }

    public static /* synthetic */ void B1(Path path, int i10, boolean z10, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        z1(path, i10, z10, lVar);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final /* synthetic */ <V extends FileAttributeView> V C0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        l0.y(4, a.R4);
        return Files.getFileAttributeView(path, FileAttributeView.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    public static /* synthetic */ void C1(Path path, FileVisitor fileVisitor, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        A1(path, fileVisitor, i10, z10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final long D0(Path path) throws IOException {
        l0.p(path, "<this>");
        return Files.size(path);
    }

    @h1(version = "1.7")
    @g
    @f
    public static final m<Path> D1(@g Path path, @g p... pVarArr) {
        l0.p(path, "<this>");
        l0.p(pVarArr, "options");
        return new n(path, pVarArr);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final FileStore E0(Path path) throws IOException {
        l0.p(path, "<this>");
        FileStore fileStore = Files.getFileStore(path);
        l0.o(fileStore, "getFileStore(this)");
        return fileStore;
    }

    @h1(version = "1.7")
    @g
    @f
    public static final FileVisitor<Path> F0(@g l<? super g, u2> lVar) {
        l0.p(lVar, "builderAction");
        h hVar = new h();
        lVar.A(hVar);
        return hVar.e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        xe.i0.d(1);
        re.c.a(r2, r4);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        throw r0;
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void G0(java.nio.file.Path r2, java.lang.String r3, we.l<? super java.nio.file.Path, zd.u2> r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "glob"
            xe.l0.p(r3, r0)
            java.lang.String r0 = "action"
            xe.l0.p(r4, r0)
            java.nio.file.DirectoryStream r2 = java.nio.file.Files.newDirectoryStream(r2, r3)
            r3 = 1
            java.lang.String r0 = "it"
            xe.l0.o(r2, r0)     // Catch:{ all -> 0x0038 }
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0038 }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0038 }
            r4.A(r1)     // Catch:{ all -> 0x0038 }
            goto L_0x001d
        L_0x002b:
            zd.u2 r4 = zd.u2.f25116a     // Catch:{ all -> 0x0038 }
            xe.i0.d(r3)
            r4 = 0
            re.c.a(r2, r4)
            xe.i0.c(r3)
            return
        L_0x0038:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            xe.i0.d(r3)
            re.c.a(r2, r4)
            xe.i0.c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t.G0(java.nio.file.Path, java.lang.String, we.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        xe.i0.d(1);
        re.c.a(r1, r2);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void H0(java.nio.file.Path r1, java.lang.String r2, we.l r3, int r4, java.lang.Object r5) throws java.io.IOException {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.lang.String r2 = "*"
        L_0x0006:
            java.lang.String r4 = "<this>"
            xe.l0.p(r1, r4)
            java.lang.String r4 = "glob"
            xe.l0.p(r2, r4)
            java.lang.String r4 = "action"
            xe.l0.p(r3, r4)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            r2 = 0
            java.lang.String r4 = "it"
            xe.l0.o(r1, r4)     // Catch:{ all -> 0x003d }
            java.util.Iterator r4 = r1.iterator()     // Catch:{ all -> 0x003d }
        L_0x0023:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x003d }
            r3.A(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0023
        L_0x0031:
            zd.u2 r3 = zd.u2.f25116a     // Catch:{ all -> 0x003d }
            xe.i0.d(r5)
            re.c.a(r1, r2)
            xe.i0.c(r5)
            return
        L_0x003d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x003f }
        L_0x003f:
            r3 = move-exception
            xe.i0.d(r5)
            re.c.a(r1, r2)
            xe.i0.c(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t.H0(java.nio.file.Path, java.lang.String, we.l, int, java.lang.Object):void");
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Object I0(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "attribute");
        l0.p(linkOptionArr, "options");
        return Files.getAttribute(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r2 = lf.c0.r5((r2 = r2.toString()), '.', "");
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String J0(@fh.g java.nio.file.Path r2) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r2, r0)
            java.nio.file.Path r2 = r2.getFileName()
            java.lang.String r0 = ""
            if (r2 == 0) goto L_0x001d
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x001d
            r1 = 46
            java.lang.String r2 = lf.c0.r5(r2, r1, r0)
            if (r2 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r0 = r2
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t.J0(java.nio.file.Path):java.lang.String");
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    public static /* synthetic */ void K0(Path path) {
    }

    public static final String L0(Path path) {
        l0.p(path, "<this>");
        return N0(path);
    }

    @h1(version = "1.4")
    @f
    @f
    @k(level = zd.m.P, message = "Use invariantSeparatorsPathString property instead.", replaceWith = @b1(expression = "invariantSeparatorsPathString", imports = {}))
    public static /* synthetic */ void M0(Path path) {
    }

    @g
    public static final String N0(@g Path path) {
        l0.p(path, "<this>");
        String separator = path.getFileSystem().getSeparator();
        if (l0.g(separator, "/")) {
            return path.toString();
        }
        String obj = path.toString();
        l0.o(separator, "separator");
        return b0.l2(obj, separator, "/", false, 4, (Object) null);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    public static /* synthetic */ void O0(Path path) {
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final FileTime P0(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        FileTime lastModifiedTime = Files.getLastModifiedTime(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(lastModifiedTime, "getLastModifiedTime(this, *options)");
        return lastModifiedTime;
    }

    @g
    public static final String Q0(@g Path path) {
        l0.p(path, "<this>");
        Path fileName = path.getFileName();
        String obj = fileName != null ? fileName.toString() : null;
        return obj == null ? "" : obj;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    public static /* synthetic */ void R0(Path path) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r3 = lf.c0.C5((r3 = r3.toString()), ".", (java.lang.String) null, 2, (java.lang.Object) null);
     */
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String S0(@fh.g java.nio.file.Path r3) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r3, r0)
            java.nio.file.Path r3 = r3.getFileName()
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x001b
            r0 = 2
            java.lang.String r1 = "."
            r2 = 0
            java.lang.String r3 = lf.c0.C5(r3, r1, r2, r0, r2)
            if (r3 != 0) goto L_0x001d
        L_0x001b:
            java.lang.String r3 = ""
        L_0x001d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t.S0(java.nio.file.Path):java.lang.String");
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    public static /* synthetic */ void T0(Path path) {
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final UserPrincipal U0(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.getOwner(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    public static final String V0(Path path) {
        l0.p(path, "<this>");
        return path.toString();
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static /* synthetic */ void W0(Path path) {
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Set<PosixFilePermission> X0(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        Set<PosixFilePermission> posixFilePermissions = Files.getPosixFilePermissions(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(posixFilePermissions, "getPosixFilePermissions(this, *options)");
        return posixFilePermissions;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean Y0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean Z0(Path path) {
        l0.p(path, "<this>");
        return Files.isExecutable(path);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean a1(Path path) throws IOException {
        l0.p(path, "<this>");
        return Files.isHidden(path);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path b0(String str) {
        l0.p(str, "path");
        Path path = Paths.get(str, new String[0]);
        l0.o(path, "get(path)");
        return path;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean b1(Path path) {
        l0.p(path, "<this>");
        return Files.isReadable(path);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path c0(String str, String... strArr) {
        l0.p(str, "base");
        l0.p(strArr, "subpaths");
        Path path = Paths.get(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        l0.o(path, "get(base, *subpaths)");
        return path;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean c1(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.isRegularFile(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path d0(Path path) {
        l0.p(path, "<this>");
        Path absolutePath = path.toAbsolutePath();
        l0.o(absolutePath, "toAbsolutePath()");
        return absolutePath;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean d1(Path path, Path path2) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, "other");
        return Files.isSameFile(path, path2);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final String e0(Path path) {
        l0.p(path, "<this>");
        return path.toAbsolutePath().toString();
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean e1(Path path) {
        l0.p(path, "<this>");
        return Files.isSymbolicLink(path);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path f0(Path path, Path path2, boolean z10) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean f1(Path path) {
        l0.p(path, "<this>");
        return Files.isWritable(path);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path g0(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        l0.p(copyOptionArr, "options");
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        re.c.a(r1, r2);
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    @fh.g
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.nio.file.Path> g1(@fh.g java.nio.file.Path r1, @fh.g java.lang.String r2) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "glob"
            xe.l0.p(r2, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            java.lang.String r2 = "it"
            xe.l0.o(r1, r2)     // Catch:{ all -> 0x001c }
            java.util.List r2 = be.e0.Q5(r1)     // Catch:{ all -> 0x001c }
            r0 = 0
            re.c.a(r1, r0)
            return r2
        L_0x001c:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            re.c.a(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t.g1(java.nio.file.Path, java.lang.String):java.util.List");
    }

    public static /* synthetic */ Path h0(Path path, Path path2, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path copy = Files.copy(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(copy, "copy(this, target, *options)");
        return copy;
    }

    public static /* synthetic */ List h1(Path path, String str, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = "*";
        }
        return g1(path, str);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path i0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileAttributeArr, "attributes");
        Path createDirectories = Files.createDirectories(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createDirectories, "createDirectories(this, *attributes)");
        return createDirectories;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path i1(Path path, Path path2, boolean z10) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(move, "move(this, target, *options)");
        return move;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path j0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileAttributeArr, "attributes");
        Path createDirectory = Files.createDirectory(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createDirectory, "createDirectory(this, *attributes)");
        return createDirectory;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path j1(Path path, Path path2, CopyOption... copyOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        l0.p(copyOptionArr, "options");
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(move, "move(this, target, *options)");
        return move;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path k0(Path path, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileAttributeArr, "attributes");
        Path createFile = Files.createFile(path, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createFile, "createFile(this, *attributes)");
        return createFile;
    }

    public static /* synthetic */ Path k1(Path path, Path path2, boolean z10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        CopyOption[] copyOptionArr = z10 ? new CopyOption[]{StandardCopyOption.REPLACE_EXISTING} : new CopyOption[0];
        Path move = Files.move(path, path2, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length));
        l0.o(move, "move(this, target, *options)");
        return move;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path l0(Path path, Path path2) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        Path createLink = Files.createLink(path, path2);
        l0.o(createLink, "createLink(this, target)");
        return createLink;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean l1(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.notExists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path m0(Path path, Path path2, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(path2, c.Y);
        l0.p(fileAttributeArr, "attributes");
        Path createSymbolicLink = Files.createSymbolicLink(path, path2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
        return createSymbolicLink;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final /* synthetic */ <A extends BasicFileAttributes> A m1(Path path, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        l0.y(4, a.Q4);
        A readAttributes = Files.readAttributes(path, BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(readAttributes, "readAttributes(this, A::class.java, *options)");
        return readAttributes;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path n0(String str, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Map<String, Object> n1(Path path, String str, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "attributes");
        l0.p(linkOptionArr, "options");
        Map<String, Object> readAttributes = Files.readAttributes(path, str, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(readAttributes, "readAttributes(this, attributes, *options)");
        return readAttributes;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @g
    public static final Path o0(@h Path path, @h String str, @g FileAttribute<?>... fileAttributeArr) throws IOException {
        String str2;
        Path path2;
        l0.p(fileAttributeArr, "attributes");
        if (path != null) {
            path2 = Files.createTempDirectory(path, str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str2 = "createTempDirectory(dire…ory, prefix, *attributes)";
        } else {
            path2 = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str2 = "createTempDirectory(prefix, *attributes)";
        }
        l0.o(path2, str2);
        return path2;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path o1(Path path) throws IOException {
        l0.p(path, "<this>");
        Path readSymbolicLink = Files.readSymbolicLink(path);
        l0.o(readSymbolicLink, "readSymbolicLink(this)");
        return readSymbolicLink;
    }

    public static /* synthetic */ Path p0(String str, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        l0.p(fileAttributeArr, "attributes");
        Path createTempDirectory = Files.createTempDirectory(str, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempDirectory, "createTempDirectory(prefix, *attributes)");
        return createTempDirectory;
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    public static final Path p1(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "base");
        try {
            return m.f22991a.a(path, path2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + "\nthis path: " + path + "\nbase path: " + path2, e10);
        }
    }

    public static /* synthetic */ Path q0(Path path, String str, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return o0(path, str, fileAttributeArr);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @h
    public static final Path q1(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "base");
        try {
            return m.f22991a.a(path, path2);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path r0(String str, String str2, FileAttribute<?>... fileAttributeArr) throws IOException {
        l0.p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @g
    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    public static final Path r1(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "base");
        Path q12 = q1(path, path2);
        return q12 == null ? path : q12;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @g
    public static final Path s0(@h Path path, @h String str, @h String str2, @g FileAttribute<?>... fileAttributeArr) throws IOException {
        String str3;
        Path path2;
        l0.p(fileAttributeArr, "attributes");
        if (path != null) {
            path2 = Files.createTempFile(path, str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str3 = "createTempFile(directory…fix, suffix, *attributes)";
        } else {
            path2 = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
            str3 = "createTempFile(prefix, suffix, *attributes)";
        }
        l0.o(path2, str3);
        return path2;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path s1(Path path, String str, Object obj, LinkOption... linkOptionArr) throws IOException {
        l0.p(path, "<this>");
        l0.p(str, "attribute");
        l0.p(linkOptionArr, "options");
        Path attribute = Files.setAttribute(path, str, obj, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
        l0.o(attribute, "setAttribute(this, attribute, value, *options)");
        return attribute;
    }

    public static /* synthetic */ Path t0(String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        l0.p(fileAttributeArr, "attributes");
        Path createTempFile = Files.createTempFile(str, str2, (FileAttribute[]) Arrays.copyOf(fileAttributeArr, fileAttributeArr.length));
        l0.o(createTempFile, "createTempFile(prefix, suffix, *attributes)");
        return createTempFile;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path t1(Path path, FileTime fileTime) throws IOException {
        l0.p(path, "<this>");
        l0.p(fileTime, "value");
        Path lastModifiedTime = Files.setLastModifiedTime(path, fileTime);
        l0.o(lastModifiedTime, "setLastModifiedTime(this, value)");
        return lastModifiedTime;
    }

    public static /* synthetic */ Path u0(Path path, String str, String str2, FileAttribute[] fileAttributeArr, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        return s0(path, str, str2, fileAttributeArr);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path u1(Path path, UserPrincipal userPrincipal) throws IOException {
        l0.p(path, "<this>");
        l0.p(userPrincipal, "value");
        Path owner = Files.setOwner(path, userPrincipal);
        l0.o(owner, "setOwner(this, value)");
        return owner;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final void v0(Path path) throws IOException {
        l0.p(path, "<this>");
        Files.delete(path);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path v1(Path path, Set<? extends PosixFilePermission> set) throws IOException {
        l0.p(path, "<this>");
        l0.p(set, "value");
        Path posixFilePermissions = Files.setPosixFilePermissions(path, set);
        l0.o(posixFilePermissions, "setPosixFilePermissions(this, value)");
        return posixFilePermissions;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean w0(Path path) throws IOException {
        l0.p(path, "<this>");
        return Files.deleteIfExists(path);
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path w1(URI uri) {
        l0.p(uri, "<this>");
        Path path = Paths.get(uri);
        l0.o(path, "get(this)");
        return path;
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path x0(Path path, String str) {
        l0.p(path, "<this>");
        l0.p(str, "other");
        Path resolve = path.resolve(str);
        l0.o(resolve, "this.resolve(other)");
        return resolve;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        xe.i0.d(1);
        re.c.a(r1, r3);
        xe.i0.c(1);
     */
    @zd.h1(version = "1.5")
    @zd.y2(markerClass = {se.f.class})
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T x1(java.nio.file.Path r1, java.lang.String r2, we.l<? super p000if.m<? extends java.nio.file.Path>, ? extends T> r3) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r1, r0)
            java.lang.String r0 = "glob"
            xe.l0.p(r2, r0)
            java.lang.String r0 = "block"
            xe.l0.p(r3, r0)
            java.nio.file.DirectoryStream r1 = java.nio.file.Files.newDirectoryStream(r1, r2)
            r2 = 1
            java.lang.String r0 = "it"
            xe.l0.o(r1, r0)     // Catch:{ all -> 0x002c }
            if.m r0 = be.e0.v1(r1)     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r3.A(r0)     // Catch:{ all -> 0x002c }
            xe.i0.d(r2)
            r0 = 0
            re.c.a(r1, r0)
            xe.i0.c(r2)
            return r3
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            xe.i0.d(r2)
            re.c.a(r1, r3)
            xe.i0.c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t.x1(java.nio.file.Path, java.lang.String, we.l):java.lang.Object");
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final Path y0(Path path, Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "other");
        Path resolve = path.resolve(path2);
        l0.o(resolve, "this.resolve(other)");
        return resolve;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        xe.i0.d(1);
        re.c.a(r0, r1);
        xe.i0.c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object y1(java.nio.file.Path r0, java.lang.String r1, we.l r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.lang.String r1 = "*"
        L_0x0006:
            java.lang.String r3 = "<this>"
            xe.l0.p(r0, r3)
            java.lang.String r3 = "glob"
            xe.l0.p(r1, r3)
            java.lang.String r3 = "block"
            xe.l0.p(r2, r3)
            java.nio.file.DirectoryStream r0 = java.nio.file.Files.newDirectoryStream(r0, r1)
            r1 = 0
            java.lang.String r3 = "it"
            xe.l0.o(r0, r3)     // Catch:{ all -> 0x0031 }
            if.m r3 = be.e0.v1(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object r2 = r2.A(r3)     // Catch:{ all -> 0x0031 }
            xe.i0.d(r4)
            re.c.a(r0, r1)
            xe.i0.c(r4)
            return r2
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            xe.i0.d(r4)
            re.c.a(r0, r1)
            xe.i0.c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: se.t.y1(java.nio.file.Path, java.lang.String, we.l, int, java.lang.Object):java.lang.Object");
    }

    @h1(version = "1.5")
    @y2(markerClass = {f.class})
    @f
    public static final boolean z0(Path path, LinkOption... linkOptionArr) {
        l0.p(path, "<this>");
        l0.p(linkOptionArr, "options");
        return Files.exists(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length));
    }

    @h1(version = "1.7")
    @f
    public static final void z1(@g Path path, int i10, boolean z10, @g l<? super g, u2> lVar) {
        l0.p(path, "<this>");
        l0.p(lVar, "builderAction");
        A1(path, F0(lVar), i10, z10);
    }
}
