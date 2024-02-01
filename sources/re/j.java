package re;

import fh.g;
import fh.h;
import java.io.File;
import java.io.IOException;
import xe.l0;
import xe.w;

public class j extends IOException {
    @g
    public final File O;
    @h
    public final File P;
    @h
    public final String Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(@g File file, @h File file2, @h String str) {
        super(f.b(file, file2, str));
        l0.p(file, "file");
        this.O = file;
        this.P = file2;
        this.Q = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(File file, File file2, String str, int i10, w wVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }

    @g
    public final File a() {
        return this.O;
    }

    @h
    public final File b() {
        return this.P;
    }

    @h
    public final String c() {
        return this.Q;
    }
}
