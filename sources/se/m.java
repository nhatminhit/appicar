package se;

import fh.g;
import java.nio.file.Path;
import java.nio.file.Paths;
import lf.b0;
import lf.e0;
import xe.l0;
import zb.r;

public final class m {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final m f22991a = new m();

    /* renamed from: b  reason: collision with root package name */
    public static final Path f22992b = Paths.get("", new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final Path f22993c = Paths.get("..", new String[0]);

    @g
    public final Path a(@g Path path, @g Path path2) {
        l0.p(path, "path");
        l0.p(path2, "base");
        Path normalize = path2.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        int i10 = 0;
        while (i10 < min) {
            Path name = normalize.getName(i10);
            Path path3 = f22993c;
            if (!l0.g(name, path3)) {
                break;
            } else if (l0.g(normalize2.getName(i10), path3)) {
                i10++;
            } else {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (l0.g(normalize2, normalize) || !l0.g(normalize, f22992b)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            l0.o(separator, "rn.fileSystem.separator");
            normalize2 = b0.K1(obj, separator, false, 2, (Object) null) ? relativize.getFileSystem().getPath(e0.D6(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        l0.o(normalize2, r.f25096b);
        return normalize2;
    }
}
