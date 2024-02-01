package re;

import be.e0;
import fh.g;
import fh.h;
import java.io.File;
import java.util.List;
import we.l;
import xe.l0;

public final class i {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final File f22486a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final List<File> f22487b;

    public i(@g File file, @g List<? extends File> list) {
        l0.p(file, "root");
        l0.p(list, "segments");
        this.f22486a = file;
        this.f22487b = list;
    }

    public static /* synthetic */ i d(i iVar, File file, List<File> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = iVar.f22486a;
        }
        if ((i10 & 2) != 0) {
            list = iVar.f22487b;
        }
        return iVar.c(file, list);
    }

    @g
    public final File a() {
        return this.f22486a;
    }

    @g
    public final List<File> b() {
        return this.f22487b;
    }

    @g
    public final i c(@g File file, @g List<? extends File> list) {
        l0.p(file, "root");
        l0.p(list, "segments");
        return new i(file, list);
    }

    @g
    public final File e() {
        return this.f22486a;
    }

    public boolean equals(@h Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return l0.g(this.f22486a, iVar.f22486a) && l0.g(this.f22487b, iVar.f22487b);
    }

    @g
    public final String f() {
        String path = this.f22486a.getPath();
        l0.o(path, "root.path");
        return path;
    }

    @g
    public final List<File> g() {
        return this.f22487b;
    }

    public final int h() {
        return this.f22487b.size();
    }

    public int hashCode() {
        return (this.f22486a.hashCode() * 31) + this.f22487b.hashCode();
    }

    public final boolean i() {
        String path = this.f22486a.getPath();
        l0.o(path, "root.path");
        return path.length() > 0;
    }

    @g
    public final File j(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > h()) {
            throw new IllegalArgumentException();
        }
        List<File> subList = this.f22487b.subList(i10, i11);
        String str = File.separator;
        l0.o(str, "separator");
        return new File(e0.h3(subList, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
    }

    @g
    public String toString() {
        return "FilePathComponents(root=" + this.f22486a + ", segments=" + this.f22487b + ')';
    }
}
