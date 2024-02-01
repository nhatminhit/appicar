package qh;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import qh.c;
import zd.p2;

public class f implements Closeable, c {
    public final int O = 1179403647;
    public final FileChannel P;

    public f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.P = new FileInputStream(file).getChannel();
    }

    public final long c(c.b bVar, long j10, long j11) throws IOException {
        for (long j12 = 0; j12 < j10; j12++) {
            c.C0394c b10 = bVar.b(j12);
            if (b10.f22394a == 1) {
                long j13 = b10.f22396c;
                if (j13 <= j11 && j11 <= b10.f22397d + j13) {
                    return (j11 - j13) + b10.f22395b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public void close() throws IOException {
        this.P.close();
    }

    public c.b f() throws IOException {
        this.P.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (o(allocate, 0) == 1179403647) {
            short i10 = i(allocate, 4);
            boolean z10 = i(allocate, 5) == 2;
            if (i10 == 1) {
                return new d(z10, this);
            }
            if (i10 == 2) {
                return new e(z10, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public List<String> g() throws IOException {
        long j10;
        this.P.position(0);
        ArrayList arrayList = new ArrayList();
        c.b f10 = f();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(f10.f22383a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j11 = (long) f10.f22388f;
        int i10 = 0;
        if (j11 == bh.c.f16306s) {
            j11 = f10.c(0).f22398a;
        }
        long j12 = 0;
        while (true) {
            if (j12 >= j11) {
                j10 = 0;
                break;
            }
            c.C0394c b10 = f10.b(j12);
            if (b10.f22394a == 2) {
                j10 = b10.f22395b;
                break;
            }
            j12++;
        }
        if (j10 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long j13 = 0;
        while (true) {
            c.a a10 = f10.a(j10, i10);
            long j14 = a10.f22378a;
            if (j14 == 1) {
                arrayList2.add(Long.valueOf(a10.f22379b));
            } else if (j14 == 5) {
                j13 = a10.f22379b;
            }
            i10++;
            if (a10.f22378a == 0) {
                break;
            }
        }
        if (j13 != 0) {
            long c10 = c(f10, j11, j13);
            for (Long longValue : arrayList2) {
                arrayList.add(m(allocate, longValue.longValue() + c10));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public void h(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < ((long) i10)) {
            int read = this.P.read(byteBuffer, j10 + j11);
            if (read != -1) {
                j11 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    public short i(ByteBuffer byteBuffer, long j10) throws IOException {
        h(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int k(ByteBuffer byteBuffer, long j10) throws IOException {
        h(byteBuffer, j10, 2);
        return byteBuffer.getShort() & p2.R;
    }

    public long l(ByteBuffer byteBuffer, long j10) throws IOException {
        h(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    public String m(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short i10 = i(byteBuffer, j10);
            if (i10 == 0) {
                return sb2.toString();
            }
            sb2.append((char) i10);
            j10 = j11;
        }
    }

    public long o(ByteBuffer byteBuffer, long j10) throws IOException {
        h(byteBuffer, j10, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
