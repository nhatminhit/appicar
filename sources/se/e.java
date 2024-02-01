package se;

import fh.g;
import fh.h;
import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import xe.l0;
import xe.w;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f22969a;

    /* renamed from: b  reason: collision with root package name */
    public int f22970b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final List<Exception> f22971c;
    @h

    /* renamed from: d  reason: collision with root package name */
    public Path f22972d;

    public e() {
        this(0, 1, (w) null);
    }

    public e(int i10) {
        this.f22969a = i10;
        this.f22971c = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11, w wVar) {
        this((i11 & 1) != 0 ? 64 : i10);
    }

    public final void a(@g Exception exc) {
        l0.p(exc, "exception");
        boolean z10 = true;
        this.f22970b++;
        if (this.f22971c.size() >= this.f22969a) {
            z10 = false;
        }
        if (z10) {
            if (this.f22972d != null) {
                Throwable initCause = new FileSystemException(String.valueOf(this.f22972d)).initCause(exc);
                l0.n(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exc = (FileSystemException) initCause;
            }
            this.f22971c.add(exc);
        }
    }

    public final void b(@g Path path) {
        l0.p(path, "name");
        Path path2 = this.f22972d;
        this.f22972d = path2 != null ? path2.resolve(path) : null;
    }

    public final void c(@g Path path) {
        l0.p(path, "name");
        Path path2 = this.f22972d;
        Path path3 = null;
        if (l0.g(path, path2 != null ? path2.getFileName() : null)) {
            Path path4 = this.f22972d;
            if (path4 != null) {
                path3 = path4.getParent();
            }
            this.f22972d = path3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @g
    public final List<Exception> d() {
        return this.f22971c;
    }

    @h
    public final Path e() {
        return this.f22972d;
    }

    public final int f() {
        return this.f22970b;
    }

    public final void g(@h Path path) {
        this.f22972d = path;
    }
}
