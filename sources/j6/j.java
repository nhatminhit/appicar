package j6;

import java.io.IOException;

public interface j {
    boolean a(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException;

    boolean b(int i10, boolean z10) throws IOException, InterruptedException;

    boolean c(byte[] bArr, int i10, int i11, boolean z10) throws IOException, InterruptedException;

    long d();

    void e(int i10) throws IOException, InterruptedException;

    int f(int i10) throws IOException, InterruptedException;

    <E extends Throwable> void g(long j10, E e10) throws Throwable;

    long getLength();

    long getPosition();

    void h();

    void i(int i10) throws IOException, InterruptedException;

    boolean j(int i10, boolean z10) throws IOException, InterruptedException;

    void k(byte[] bArr, int i10, int i11) throws IOException, InterruptedException;

    int read(byte[] bArr, int i10, int i11) throws IOException, InterruptedException;

    void readFully(byte[] bArr, int i10, int i11) throws IOException, InterruptedException;
}
