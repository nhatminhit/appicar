package sg;

import ch.c;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final FileChannel f23003a;

    public a(FileChannel fileChannel) {
        this.f23003a = fileChannel;
    }

    public void a(long j10, c cVar, long j11) throws IOException {
        if (j11 >= 0) {
            while (j11 > 0) {
                long transferTo = this.f23003a.transferTo(j10, j11, cVar);
                j10 += transferTo;
                j11 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void b(long j10, c cVar, long j11) throws IOException {
        if (j11 < 0 || j11 > cVar.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long transferFrom = this.f23003a.transferFrom(cVar, j10, j11);
            j10 += transferFrom;
            j11 -= transferFrom;
        }
    }
}
