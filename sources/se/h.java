package se;

import fh.g;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import we.p;
import xe.l0;

@f
public final class h implements g {
    @fh.h

    /* renamed from: a  reason: collision with root package name */
    public p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f22973a;
    @fh.h

    /* renamed from: b  reason: collision with root package name */
    public p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f22974b;
    @fh.h

    /* renamed from: c  reason: collision with root package name */
    public p<? super Path, ? super IOException, ? extends FileVisitResult> f22975c;
    @fh.h

    /* renamed from: d  reason: collision with root package name */
    public p<? super Path, ? super IOException, ? extends FileVisitResult> f22976d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22977e;

    public void a(@g p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f22975c, "onVisitFileFailed");
        this.f22975c = pVar;
    }

    public void b(@g p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f22974b, "onVisitFile");
        this.f22974b = pVar;
    }

    public void c(@g p<? super Path, ? super IOException, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f22976d, "onPostVisitDirectory");
        this.f22976d = pVar;
    }

    public void d(@g p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar) {
        l0.p(pVar, "function");
        f();
        g(this.f22973a, "onPreVisitDirectory");
        this.f22973a = pVar;
    }

    @g
    public final FileVisitor<Path> e() {
        f();
        this.f22977e = true;
        return new i(this.f22973a, this.f22974b, this.f22975c, this.f22976d);
    }

    public final void f() {
        if (this.f22977e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    public final void g(Object obj, String str) {
        if (obj != null) {
            throw new IllegalStateException(str + " was already defined");
        }
    }
}
