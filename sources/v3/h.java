package v3;

import d.m0;
import d.o0;
import java.security.MessageDigest;
import t4.k;

public final class h<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f14161e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f14162a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f14163b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14164c;

    /* renamed from: d  reason: collision with root package name */
    public volatile byte[] f14165d;

    public class a implements b<Object> {
        public void a(@m0 byte[] bArr, @m0 Object obj, @m0 MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(@m0 byte[] bArr, @m0 T t10, @m0 MessageDigest messageDigest);
    }

    public h(@m0 String str, @o0 T t10, @m0 b<T> bVar) {
        this.f14164c = k.b(str);
        this.f14162a = t10;
        this.f14163b = (b) k.d(bVar);
    }

    @m0
    public static <T> h<T> a(@m0 String str, @o0 T t10, @m0 b<T> bVar) {
        return new h<>(str, t10, bVar);
    }

    @m0
    public static <T> h<T> b(@m0 String str, @m0 b<T> bVar) {
        return new h<>(str, (Object) null, bVar);
    }

    @m0
    public static <T> b<T> c() {
        return f14161e;
    }

    @m0
    public static <T> h<T> f(@m0 String str) {
        return new h<>(str, (Object) null, c());
    }

    @m0
    public static <T> h<T> g(@m0 String str, @m0 T t10) {
        return new h<>(str, t10, c());
    }

    @o0
    public T d() {
        return this.f14162a;
    }

    @m0
    public final byte[] e() {
        if (this.f14165d == null) {
            this.f14165d = this.f14164c.getBytes(f.f14159b);
        }
        return this.f14165d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f14164c.equals(((h) obj).f14164c);
        }
        return false;
    }

    public void h(@m0 T t10, @m0 MessageDigest messageDigest) {
        this.f14163b.a(e(), t10, messageDigest);
    }

    public int hashCode() {
        return this.f14164c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f14164c + '\'' + '}';
    }
}
