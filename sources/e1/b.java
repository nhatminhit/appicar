package e1;

import android.util.AtomicFile;
import d.t0;
import fh.g;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import lf.f;
import we.l;
import xe.i0;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\b\u001a\u00020\u0006*\u00020\u00002!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\bø\u0001\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u001e\u0010\u0010\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u001a\r\u0010\u0011\u001a\u00020\t*\u00020\u0000H\b\u001a\u0016\u0010\u0012\u001a\u00020\f*\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0013"}, d2 = {"Landroid/util/AtomicFile;", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lzd/v0;", "name", "out", "Lzd/u2;", "block", "d", "", "array", "e", "", "text", "Ljava/nio/charset/Charset;", "charset", "f", "a", "b", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class b {
    @t0(17)
    @g
    public static final byte[] a(@g AtomicFile atomicFile) {
        l0.p(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        l0.o(readFully, "readFully()");
        return readFully;
    }

    @t0(17)
    @g
    public static final String b(@g AtomicFile atomicFile, @g Charset charset) {
        l0.p(atomicFile, "<this>");
        l0.p(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        l0.o(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = f.f20792b;
        }
        return b(atomicFile, charset);
    }

    @t0(17)
    public static final void d(@g AtomicFile atomicFile, @g l<? super FileOutputStream, u2> lVar) {
        l0.p(atomicFile, "<this>");
        l0.p(lVar, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            l0.o(startWrite, "stream");
            lVar.A(startWrite);
            i0.d(1);
            atomicFile.finishWrite(startWrite);
            i0.c(1);
        } catch (Throwable th2) {
            i0.d(1);
            atomicFile.failWrite(startWrite);
            i0.c(1);
            throw th2;
        }
    }

    @t0(17)
    public static final void e(@g AtomicFile atomicFile, @g byte[] bArr) {
        l0.p(atomicFile, "<this>");
        l0.p(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            l0.o(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th2) {
            atomicFile.failWrite(startWrite);
            throw th2;
        }
    }

    @t0(17)
    public static final void f(@g AtomicFile atomicFile, @g String str, @g Charset charset) {
        l0.p(atomicFile, "<this>");
        l0.p(str, "text");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "(this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            charset = f.f20792b;
        }
        f(atomicFile, str, charset);
    }
}
