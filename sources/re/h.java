package re;

import fh.g;
import java.io.File;
import xe.l0;
import xe.w;

public final class h extends j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(@g File file, @fh.h File file2, @fh.h String str) {
        super(file, file2, str);
        l0.p(file, "file");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(File file, File file2, String str, int i10, w wVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
