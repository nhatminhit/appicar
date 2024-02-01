package re;

import fh.g;
import fh.h;
import java.io.File;
import xe.l0;
import xe.w;

public final class t extends j {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t(@g File file, @h File file2, @h String str) {
        super(file, file2, str);
        l0.p(file, "file");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(File file, File file2, String str, int i10, w wVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
