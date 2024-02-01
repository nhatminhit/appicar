package ch;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public interface e extends a0, ReadableByteChannel {
    f B(long j10) throws IOException;

    void B1(c cVar, long j10) throws IOException;

    void E1(long j10) throws IOException;

    boolean H1(long j10, f fVar) throws IOException;

    String I0(Charset charset) throws IOException;

    long K1(byte b10) throws IOException;

    long M(z zVar) throws IOException;

    long M1() throws IOException;

    int N0() throws IOException;

    f Q0() throws IOException;

    byte[] S() throws IOException;

    long U(f fVar) throws IOException;

    boolean U0(long j10) throws IOException;

    c V();

    boolean X() throws IOException;

    int Z(q qVar) throws IOException;

    String b1() throws IOException;

    int e1() throws IOException;

    long f0(byte b10, long j10) throws IOException;

    long g0(byte b10, long j10, long j11) throws IOException;

    @Nullable
    String h0() throws IOException;

    @Deprecated
    c j();

    long j0() throws IOException;

    byte[] k1(long j10) throws IOException;

    long l1(f fVar, long j10) throws IOException;

    InputStream n();

    String o0(long j10) throws IOException;

    String o1() throws IOException;

    long p0(f fVar, long j10) throws IOException;

    e peek();

    String q1(long j10, Charset charset) throws IOException;

    boolean r(long j10, f fVar, int i10, int i11) throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i10, int i11) throws IOException;

    byte readByte() throws IOException;

    void readFully(byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    void skip(long j10) throws IOException;

    short t1() throws IOException;

    String u(long j10) throws IOException;

    long v1() throws IOException;

    long y1(f fVar) throws IOException;
}
