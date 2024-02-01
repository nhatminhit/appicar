package se;

import fh.g;
import fh.h;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import we.p;
import xe.l0;

public final class i extends SimpleFileVisitor<Path> {
    @h

    /* renamed from: a  reason: collision with root package name */
    public final p<Path, BasicFileAttributes, FileVisitResult> f22978a;
    @h

    /* renamed from: b  reason: collision with root package name */
    public final p<Path, BasicFileAttributes, FileVisitResult> f22979b;
    @h

    /* renamed from: c  reason: collision with root package name */
    public final p<Path, IOException, FileVisitResult> f22980c;
    @h

    /* renamed from: d  reason: collision with root package name */
    public final p<Path, IOException, FileVisitResult> f22981d;

    public i(@h p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @h p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @h p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @h p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f22978a = pVar;
        this.f22979b = pVar2;
        this.f22980c = pVar3;
        this.f22981d = pVar4;
    }

    @g
    /* renamed from: a */
    public FileVisitResult postVisitDirectory(@g Path path, @h IOException iOException) {
        FileVisitResult g02;
        l0.p(path, "dir");
        p<Path, IOException, FileVisitResult> pVar = this.f22981d;
        if (pVar != null && (g02 = pVar.g0(path, iOException)) != null) {
            return g02;
        }
        FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
        l0.o(postVisitDirectory, "super.postVisitDirectory(dir, exc)");
        return postVisitDirectory;
    }

    @g
    /* renamed from: b */
    public FileVisitResult preVisitDirectory(@g Path path, @g BasicFileAttributes basicFileAttributes) {
        FileVisitResult g02;
        l0.p(path, "dir");
        l0.p(basicFileAttributes, "attrs");
        p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f22978a;
        if (pVar != null && (g02 = pVar.g0(path, basicFileAttributes)) != null) {
            return g02;
        }
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        l0.o(preVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return preVisitDirectory;
    }

    @g
    /* renamed from: c */
    public FileVisitResult visitFile(@g Path path, @g BasicFileAttributes basicFileAttributes) {
        FileVisitResult g02;
        l0.p(path, "file");
        l0.p(basicFileAttributes, "attrs");
        p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f22979b;
        if (pVar != null && (g02 = pVar.g0(path, basicFileAttributes)) != null) {
            return g02;
        }
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        l0.o(visitFile, "super.visitFile(file, attrs)");
        return visitFile;
    }

    @g
    /* renamed from: d */
    public FileVisitResult visitFileFailed(@g Path path, @g IOException iOException) {
        FileVisitResult g02;
        l0.p(path, "file");
        l0.p(iOException, "exc");
        p<Path, IOException, FileVisitResult> pVar = this.f22980c;
        if (pVar != null && (g02 = pVar.g0(path, iOException)) != null) {
            return g02;
        }
        FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
        l0.o(visitFileFailed, "super.visitFileFailed(file, exc)");
        return visitFileFailed;
    }
}
