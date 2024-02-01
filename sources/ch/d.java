package ch;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

public interface d extends z, WritableByteChannel {
    d A0(int i10) throws IOException;

    d D0(String str) throws IOException;

    d D1(String str, int i10, int i11, Charset charset) throws IOException;

    d G1(long j10) throws IOException;

    d H() throws IOException;

    d J(int i10) throws IOException;

    OutputStream J1();

    d O(long j10) throws IOException;

    d O0(String str, int i10, int i11) throws IOException;

    d P0(long j10) throws IOException;

    d R0(String str, Charset charset) throws IOException;

    d T(f fVar) throws IOException;

    long V0(a0 a0Var) throws IOException;

    d W(int i10) throws IOException;

    void flush() throws IOException;

    d i0() throws IOException;

    c j();

    d t0(a0 a0Var, long j10) throws IOException;

    d write(byte[] bArr) throws IOException;

    d write(byte[] bArr, int i10, int i11) throws IOException;

    d writeByte(int i10) throws IOException;

    d writeInt(int i10) throws IOException;

    d writeLong(long j10) throws IOException;

    d writeShort(int i10) throws IOException;
}
