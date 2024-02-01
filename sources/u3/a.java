package u3;

import android.graphics.Bitmap;
import d.m0;
import d.o0;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f13642a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f13643b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f13644c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f13645d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f13646e = 0;

    /* renamed from: u3.a$a  reason: collision with other inner class name */
    public interface C0227a {
        @m0
        Bitmap a(int i10, int i11, @m0 Bitmap.Config config);

        @m0
        int[] b(int i10);

        void c(@m0 Bitmap bitmap);

        void d(@m0 byte[] bArr);

        @m0
        byte[] e(int i10);

        void f(@m0 int[] iArr);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    int a();

    int b();

    @o0
    Bitmap c();

    void clear();

    void d();

    int e();

    int f();

    int g();

    @m0
    ByteBuffer getData();

    void h(@m0 Bitmap.Config config);

    int i(int i10);

    void j(@m0 c cVar, @m0 ByteBuffer byteBuffer, int i10);

    void k(@m0 c cVar, @m0 byte[] bArr);

    void l();

    int m();

    int n();

    int o(@o0 InputStream inputStream, int i10);

    int p();

    int q();

    void r(@m0 c cVar, @m0 ByteBuffer byteBuffer);

    int read(@o0 byte[] bArr);

    @Deprecated
    int s();
}
