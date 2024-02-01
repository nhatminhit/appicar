package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface l {

    public interface a {
        l a();
    }

    long a(o oVar) throws IOException;

    Map<String, List<String>> b();

    void close() throws IOException;

    void d(r0 r0Var);

    @o0
    Uri g();

    int read(byte[] bArr, int i10, int i11) throws IOException;
}
