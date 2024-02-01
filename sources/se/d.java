package se;

import be.k;
import fh.g;
import fh.h;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import xe.l0;

public final class d extends SimpleFileVisitor<Path> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22966a;
    @h

    /* renamed from: b  reason: collision with root package name */
    public l f22967b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public k<l> f22968c = new k<>();

    public d(boolean z10) {
        this.f22966a = z10;
    }

    public final boolean a() {
        return this.f22966a;
    }

    @g
    /* renamed from: b */
    public FileVisitResult preVisitDirectory(@g Path path, @g BasicFileAttributes basicFileAttributes) {
        l0.p(path, "dir");
        l0.p(basicFileAttributes, "attrs");
        this.f22968c.add(new l(path, basicFileAttributes.fileKey(), this.f22967b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        l0.o(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @g
    public final List<l> c(@g l lVar) {
        l0.p(lVar, "directoryNode");
        this.f22967b = lVar;
        Files.walkFileTree(lVar.d(), j.f22982a.b(this.f22966a), 1, this);
        this.f22968c.removeFirst();
        k<l> kVar = this.f22968c;
        this.f22968c = new k<>();
        return kVar;
    }

    @g
    /* renamed from: d */
    public FileVisitResult visitFile(@g Path path, @g BasicFileAttributes basicFileAttributes) {
        l0.p(path, "file");
        l0.p(basicFileAttributes, "attrs");
        this.f22968c.add(new l(path, (Object) null, this.f22967b));
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        l0.o(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }
}
