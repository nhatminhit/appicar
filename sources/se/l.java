package se;

import fh.g;
import fh.h;
import java.nio.file.Path;
import java.util.Iterator;
import xe.l0;

public final class l {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final Path f22987a;
    @h

    /* renamed from: b  reason: collision with root package name */
    public final Object f22988b;
    @h

    /* renamed from: c  reason: collision with root package name */
    public final l f22989c;
    @h

    /* renamed from: d  reason: collision with root package name */
    public Iterator<l> f22990d;

    public l(@g Path path, @h Object obj, @h l lVar) {
        l0.p(path, "path");
        this.f22987a = path;
        this.f22988b = obj;
        this.f22989c = lVar;
    }

    @h
    public final Iterator<l> a() {
        return this.f22990d;
    }

    @h
    public final Object b() {
        return this.f22988b;
    }

    @h
    public final l c() {
        return this.f22989c;
    }

    @g
    public final Path d() {
        return this.f22987a;
    }

    public final void e(@h Iterator<l> it) {
        this.f22990d = it;
    }
}
