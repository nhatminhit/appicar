package d4;

import android.util.Log;
import com.bumptech.glide.h;
import d.m0;
import d4.n;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import s4.e;
import v3.i;
import w3.d;

public class d implements n<File, ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6015a = "ByteBufferFileLoader";

    public static final class a implements w3.d<ByteBuffer> {
        public final File O;

        public a(File file) {
            this.O = file;
        }

        @m0
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        @m0
        public v3.a d() {
            return v3.a.LOCAL;
        }

        public void f(@m0 h hVar, @m0 d.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(t4.a.a(this.O));
            } catch (IOException e10) {
                Log.isLoggable(d.f6015a, 3);
                aVar.c(e10);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        @m0
        public n<File, ByteBuffer> a(@m0 r rVar) {
            return new d();
        }

        public void b() {
        }
    }

    /* renamed from: c */
    public n.a<ByteBuffer> b(@m0 File file, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new e(file), new a(file));
    }

    /* renamed from: d */
    public boolean a(@m0 File file) {
        return true;
    }
}
