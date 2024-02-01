package n0;

import android.graphics.Path;
import d.t0;
import fh.g;
import java.util.Collection;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\u0015\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\n\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\f¨\u0006\f"}, d2 = {"Landroid/graphics/Path;", "", "error", "", "Ln0/o0;", "b", "p", "f", "d", "e", "a", "g", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class m0 {
    @t0(19)
    @g
    public static final Path a(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "p");
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @t0(26)
    @g
    public static final Iterable<o0> b(@g Path path, float f10) {
        l0.p(path, "<this>");
        Collection<o0> b10 = q0.b(path, f10);
        l0.o(b10, "flatten(this, error)");
        return b10;
    }

    public static /* synthetic */ Iterable c(Path path, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.5f;
        }
        return b(path, f10);
    }

    @t0(19)
    @g
    public static final Path d(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @t0(19)
    @g
    public static final Path e(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @t0(19)
    @g
    public static final Path f(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @t0(19)
    @g
    public static final Path g(@g Path path, @g Path path2) {
        l0.p(path, "<this>");
        l0.p(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
