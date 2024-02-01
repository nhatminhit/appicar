package k4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import d.m0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import v3.i;
import v3.k;
import y3.v;
import z3.b;

public class j implements k<InputStream, c> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f10009d = "StreamGifDecoder";

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f10010a;

    /* renamed from: b  reason: collision with root package name */
    public final k<ByteBuffer, c> f10011b;

    /* renamed from: c  reason: collision with root package name */
    public final b f10012c;

    public j(List<ImageHeaderParser> list, k<ByteBuffer, c> kVar, b bVar) {
        this.f10010a = list;
        this.f10011b = kVar;
        this.f10012c = bVar;
    }

    public static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            Log.isLoggable(f10009d, 5);
            return null;
        }
    }

    /* renamed from: c */
    public v<c> a(@m0 InputStream inputStream, int i10, int i11, @m0 i iVar) throws IOException {
        byte[] e10 = e(inputStream);
        if (e10 == null) {
            return null;
        }
        return this.f10011b.a(ByteBuffer.wrap(e10), i10, i11, iVar);
    }

    /* renamed from: d */
    public boolean b(@m0 InputStream inputStream, @m0 i iVar) throws IOException {
        return !((Boolean) iVar.c(i.f10008b)).booleanValue() && a.d(this.f10010a, inputStream, this.f10012c) == ImageHeaderParser.ImageType.GIF;
    }
}
