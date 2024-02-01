package g4;

import d.g1;
import d.m0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import z3.b;

public class b0 extends FilterInputStream {
    public volatile byte[] O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public final b T;

    public static class a extends IOException {
        public static final long O = -4338378848813561757L;

        public a(String str) {
            super(str);
        }
    }

    public b0(@m0 InputStream inputStream, @m0 b bVar) {
        this(inputStream, bVar, 65536);
    }

    @g1
    public b0(@m0 InputStream inputStream, @m0 b bVar, int i10) {
        super(inputStream);
        this.R = -1;
        this.T = bVar;
        this.O = (byte[]) bVar.e(i10, byte[].class);
    }

    public static IOException g() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public synchronized void a() {
        if (this.O != null) {
            this.T.put(this.O);
            this.O = null;
        }
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.O == null || inputStream == null) {
            throw g();
        }
        return (this.P - this.S) + inputStream.available();
    }

    public final int c(InputStream inputStream, byte[] bArr) throws IOException {
        int i10;
        int i11 = this.R;
        if (i11 == -1 || this.S - i11 >= (i10 = this.Q)) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                this.R = -1;
                this.S = 0;
                this.P = read;
            }
            return read;
        }
        if (i11 == 0 && i10 > bArr.length && this.P == bArr.length) {
            int length = bArr.length * 2;
            if (length <= i10) {
                i10 = length;
            }
            byte[] bArr2 = (byte[]) this.T.e(i10, byte[].class);
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.O = bArr2;
            this.T.put(bArr);
            bArr = bArr2;
        } else if (i11 > 0) {
            System.arraycopy(bArr, i11, bArr, 0, bArr.length - i11);
        }
        int i12 = this.S - this.R;
        this.S = i12;
        this.R = 0;
        this.P = 0;
        int read2 = inputStream.read(bArr, i12, bArr.length - i12);
        int i13 = this.S;
        if (read2 > 0) {
            i13 += read2;
        }
        this.P = i13;
        return read2;
    }

    public void close() throws IOException {
        if (this.O != null) {
            this.T.put(this.O);
            this.O = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void f() {
        this.Q = this.O.length;
    }

    public synchronized void mark(int i10) {
        this.Q = Math.max(this.Q, i10);
        this.R = this.S;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0018=Splitter:B:11:0x0018, B:27:0x0039=Splitter:B:27:0x0039} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            byte[] r0 = r5.O     // Catch:{ all -> 0x003e }
            java.io.InputStream r1 = r5.in     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            int r2 = r5.S     // Catch:{ all -> 0x003e }
            int r3 = r5.P     // Catch:{ all -> 0x003e }
            r4 = -1
            if (r2 < r3) goto L_0x0018
            int r1 = r5.c(r1, r0)     // Catch:{ all -> 0x003e }
            if (r1 != r4) goto L_0x0018
            monitor-exit(r5)
            return r4
        L_0x0018:
            byte[] r1 = r5.O     // Catch:{ all -> 0x003e }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r5.O     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0021
            goto L_0x0026
        L_0x0021:
            java.io.IOException r0 = g()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x0026:
            int r1 = r5.P     // Catch:{ all -> 0x003e }
            int r2 = r5.S     // Catch:{ all -> 0x003e }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0037
            int r1 = r2 + 1
            r5.S = r1     // Catch:{ all -> 0x003e }
            byte r0 = r0[r2]     // Catch:{ all -> 0x003e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r5)
            return r0
        L_0x0037:
            monitor-exit(r5)
            return r4
        L_0x0039:
            java.io.IOException r0 = g()     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.b0.read():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0031, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(@d.m0 byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.O     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x000a
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000a:
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            int r2 = r6.S     // Catch:{ all -> 0x0090 }
            int r3 = r6.P     // Catch:{ all -> 0x0090 }
            if (r2 >= r3) goto L_0x0032
            int r4 = r3 - r2
            if (r4 < r9) goto L_0x001a
            r3 = r9
            goto L_0x001b
        L_0x001a:
            int r3 = r3 - r2
        L_0x001b:
            java.lang.System.arraycopy(r0, r2, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r2 = r6.S     // Catch:{ all -> 0x0090 }
            int r2 = r2 + r3
            r6.S = r2     // Catch:{ all -> 0x0090 }
            if (r3 == r9) goto L_0x0030
            int r2 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0030
        L_0x002c:
            int r8 = r8 + r3
            int r2 = r9 - r3
            goto L_0x0033
        L_0x0030:
            monitor-exit(r6)
            return r3
        L_0x0032:
            r2 = r9
        L_0x0033:
            int r3 = r6.R     // Catch:{ all -> 0x0090 }
            r4 = -1
            if (r3 != r4) goto L_0x0048
            int r3 = r0.length     // Catch:{ all -> 0x0090 }
            if (r2 < r3) goto L_0x0048
            int r3 = r1.read(r7, r8, r2)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0076
            if (r2 != r9) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            int r4 = r9 - r2
        L_0x0046:
            monitor-exit(r6)
            return r4
        L_0x0048:
            int r3 = r6.c(r1, r0)     // Catch:{ all -> 0x0090 }
            if (r3 != r4) goto L_0x0055
            if (r2 != r9) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            int r4 = r9 - r2
        L_0x0053:
            monitor-exit(r6)
            return r4
        L_0x0055:
            byte[] r3 = r6.O     // Catch:{ all -> 0x0090 }
            if (r0 == r3) goto L_0x0063
            byte[] r0 = r6.O     // Catch:{ all -> 0x0090 }
            if (r0 == 0) goto L_0x005e
            goto L_0x0063
        L_0x005e:
            java.io.IOException r7 = g()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0063:
            int r3 = r6.P     // Catch:{ all -> 0x0090 }
            int r4 = r6.S     // Catch:{ all -> 0x0090 }
            int r5 = r3 - r4
            if (r5 < r2) goto L_0x006d
            r3 = r2
            goto L_0x006e
        L_0x006d:
            int r3 = r3 - r4
        L_0x006e:
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x0090 }
            int r4 = r6.S     // Catch:{ all -> 0x0090 }
            int r4 = r4 + r3
            r6.S = r4     // Catch:{ all -> 0x0090 }
        L_0x0076:
            int r2 = r2 - r3
            if (r2 != 0) goto L_0x007b
            monitor-exit(r6)
            return r9
        L_0x007b:
            int r4 = r1.available()     // Catch:{ all -> 0x0090 }
            if (r4 != 0) goto L_0x0084
            int r9 = r9 - r2
            monitor-exit(r6)
            return r9
        L_0x0084:
            int r8 = r8 + r3
            goto L_0x0033
        L_0x0086:
            java.io.IOException r7 = g()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x008b:
            java.io.IOException r7 = g()     // Catch:{ all -> 0x0090 }
            throw r7     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.b0.read(byte[], int, int):int");
    }

    public synchronized void reset() throws IOException {
        if (this.O != null) {
            int i10 = this.R;
            if (-1 != i10) {
                this.S = i10;
            } else {
                throw new a("Mark has been invalidated, pos: " + this.S + " markLimit: " + this.Q);
            }
        } else {
            throw new IOException("Stream is closed");
        }
    }

    public synchronized long skip(long j10) throws IOException {
        if (j10 < 1) {
            return 0;
        }
        byte[] bArr = this.O;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream != null) {
                int i10 = this.P;
                int i11 = this.S;
                if (((long) (i10 - i11)) >= j10) {
                    this.S = (int) (((long) i11) + j10);
                    return j10;
                }
                long j11 = ((long) i10) - ((long) i11);
                this.S = i10;
                if (this.R == -1 || j10 > ((long) this.Q)) {
                    return j11 + inputStream.skip(j10 - j11);
                } else if (c(inputStream, bArr) == -1) {
                    return j11;
                } else {
                    int i12 = this.P;
                    int i13 = this.S;
                    if (((long) (i12 - i13)) >= j10 - j11) {
                        this.S = (int) ((((long) i13) + j10) - j11);
                        return j10;
                    }
                    long j12 = (j11 + ((long) i12)) - ((long) i13);
                    this.S = i12;
                    return j12;
                }
            } else {
                throw g();
            }
        } else {
            throw g();
        }
    }
}
