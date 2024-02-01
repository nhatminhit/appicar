package d4;

import com.bumptech.glide.h;
import d.m0;
import d4.n;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import s4.e;
import v3.i;
import w3.d;

public class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final C0102b<Data> f6011a;

    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: d4.b$a$a  reason: collision with other inner class name */
        public class C0101a implements C0102b<ByteBuffer> {
            public C0101a() {
            }

            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @m0
        public n<byte[], ByteBuffer> a(@m0 r rVar) {
            return new b(new C0101a());
        }

        public void b() {
        }
    }

    /* renamed from: d4.b$b  reason: collision with other inner class name */
    public interface C0102b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    public static class c<Data> implements w3.d<Data> {
        public final byte[] O;
        public final C0102b<Data> P;

        public c(byte[] bArr, C0102b<Data> bVar) {
            this.O = bArr;
            this.P = bVar;
        }

        @m0
        public Class<Data> a() {
            return this.P.a();
        }

        public void b() {
        }

        public void cancel() {
        }

        @m0
        public v3.a d() {
            return v3.a.LOCAL;
        }

        public void f(@m0 h hVar, @m0 d.a<? super Data> aVar) {
            aVar.e(this.P.b(this.O));
        }
    }

    public static class d implements o<byte[], InputStream> {

        public class a implements C0102b<InputStream> {
            public a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @m0
        public n<byte[], InputStream> a(@m0 r rVar) {
            return new b(new a());
        }

        public void b() {
        }
    }

    public b(C0102b<Data> bVar) {
        this.f6011a = bVar;
    }

    /* renamed from: c */
    public n.a<Data> b(@m0 byte[] bArr, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new e(bArr), new c(bArr, this.f6011a));
    }

    /* renamed from: d */
    public boolean a(@m0 byte[] bArr) {
        return true;
    }
}
