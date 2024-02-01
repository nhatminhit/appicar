package w0;

import android.net.Uri;
import fh.g;
import java.io.File;
import kotlin.Metadata;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\b\u001a\n\u0010\u0005\u001a\u00020\u0003*\u00020\u0001¨\u0006\u0006"}, d2 = {"", "Landroid/net/Uri;", "c", "Ljava/io/File;", "b", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class j {
    @g
    public static final File a(@g Uri uri) {
        l0.p(uri, "<this>");
        if (l0.g(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(l0.C("Uri path is null: ", uri).toString());
        }
        throw new IllegalArgumentException(l0.C("Uri lacks 'file' scheme: ", uri).toString());
    }

    @g
    public static final Uri b(@g File file) {
        l0.p(file, "<this>");
        Uri fromFile = Uri.fromFile(file);
        l0.o(fromFile, "fromFile(this)");
        return fromFile;
    }

    @g
    public static final Uri c(@g String str) {
        l0.p(str, "<this>");
        Uri parse = Uri.parse(str);
        l0.o(parse, "parse(this)");
        return parse;
    }
}
