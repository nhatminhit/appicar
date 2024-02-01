package se;

import be.k1;
import be.l1;
import fh.g;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;

public final class j {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final j f22982a = new j();
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final LinkOption[] f22983b = {LinkOption.NOFOLLOW_LINKS};
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final LinkOption[] f22984c = new LinkOption[0];
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final Set<FileVisitOption> f22985d = l1.k();
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final Set<FileVisitOption> f22986e = k1.f(FileVisitOption.FOLLOW_LINKS);

    @g
    public final LinkOption[] a(boolean z10) {
        return z10 ? f22984c : f22983b;
    }

    @g
    public final Set<FileVisitOption> b(boolean z10) {
        return z10 ? f22986e : f22985d;
    }
}
