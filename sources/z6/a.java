package z6;

import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.b;
import d.o0;
import java.io.File;
import java.io.IOException;

public final class a {

    /* renamed from: z6.a$a  reason: collision with other inner class name */
    public interface C0252a {
        String a(DownloadRequest downloadRequest);
    }

    public static void a(DownloadRequest downloadRequest, b bVar, boolean z10, long j10) throws IOException {
        d dVar;
        b bVar2 = bVar;
        d f10 = bVar.f(downloadRequest.O);
        if (f10 != null) {
            dVar = b.q(f10, downloadRequest, f10.f15949f, j10);
        } else {
            long j11 = j10;
            dVar = new d(downloadRequest, z10 ? 3 : 0, j10, j10, -1, 0, 0);
        }
        bVar.a(dVar);
    }

    public static void b(File file, @o0 C0252a aVar, b bVar, boolean z10, boolean z11) throws IOException {
        com.google.android.exoplayer2.offline.a aVar2 = new com.google.android.exoplayer2.offline.a(file);
        if (aVar2.b()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (DownloadRequest downloadRequest : aVar2.d()) {
                    if (aVar != null) {
                        downloadRequest = downloadRequest.a(aVar.a(downloadRequest));
                    }
                    a(downloadRequest, bVar, z11, currentTimeMillis);
                }
                aVar2.a();
            } catch (Throwable th2) {
                if (z10) {
                    aVar2.a();
                }
                throw th2;
            }
        }
    }
}
