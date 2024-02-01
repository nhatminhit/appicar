package t4;

import d.m0;
import d.o0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public class d extends InputStream {
    public static final Queue<d> Q = m.f(0);
    public InputStream O;
    public IOException P;

    public static void c() {
        while (true) {
            Queue<d> queue = Q;
            if (!queue.isEmpty()) {
                queue.remove();
            } else {
                return;
            }
        }
    }

    @m0
    public static d g(@m0 InputStream inputStream) {
        d poll;
        Queue<d> queue = Q;
        synchronized (queue) {
            poll = queue.poll();
        }
        if (poll == null) {
            poll = new d();
        }
        poll.h(inputStream);
        return poll;
    }

    public void a() {
        this.P = null;
        this.O = null;
        Queue<d> queue = Q;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public int available() throws IOException {
        return this.O.available();
    }

    public void close() throws IOException {
        this.O.close();
    }

    @o0
    public IOException f() {
        return this.P;
    }

    public void h(@m0 InputStream inputStream) {
        this.O = inputStream;
    }

    public void mark(int i10) {
        this.O.mark(i10);
    }

    public boolean markSupported() {
        return this.O.markSupported();
    }

    public int read() {
        try {
            return this.O.read();
        } catch (IOException e10) {
            this.P = e10;
            return -1;
        }
    }

    public int read(byte[] bArr) {
        try {
            return this.O.read(bArr);
        } catch (IOException e10) {
            this.P = e10;
            return -1;
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        try {
            return this.O.read(bArr, i10, i11);
        } catch (IOException e10) {
            this.P = e10;
            return -1;
        }
    }

    public synchronized void reset() throws IOException {
        this.O.reset();
    }

    public long skip(long j10) {
        try {
            return this.O.skip(j10);
        } catch (IOException e10) {
            this.P = e10;
            return 0;
        }
    }
}
