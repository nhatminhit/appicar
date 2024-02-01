package h4;

import d.m0;
import java.nio.ByteBuffer;
import w3.e;

public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f8821a;

    /* renamed from: h4.a$a  reason: collision with other inner class name */
    public static class C0145a implements e.a<ByteBuffer> {
        @m0
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @m0
        /* renamed from: c */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f8821a = byteBuffer;
    }

    public void b() {
    }

    @m0
    /* renamed from: c */
    public ByteBuffer a() {
        this.f8821a.position(0);
        return this.f8821a;
    }
}
