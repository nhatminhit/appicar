package z3;

import android.graphics.Bitmap;
import d.g1;
import t4.m;

public class c implements l {

    /* renamed from: a  reason: collision with root package name */
    public final b f15793a = new b();

    /* renamed from: b  reason: collision with root package name */
    public final h<a, Bitmap> f15794b = new h<>();

    @g1
    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public final b f15795a;

        /* renamed from: b  reason: collision with root package name */
        public int f15796b;

        /* renamed from: c  reason: collision with root package name */
        public int f15797c;

        /* renamed from: d  reason: collision with root package name */
        public Bitmap.Config f15798d;

        public a(b bVar) {
            this.f15795a = bVar;
        }

        public void a() {
            this.f15795a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f15796b = i10;
            this.f15797c = i11;
            this.f15798d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f15796b == aVar.f15796b && this.f15797c == aVar.f15797c && this.f15798d == aVar.f15798d;
        }

        public int hashCode() {
            int i10 = ((this.f15796b * 31) + this.f15797c) * 31;
            Bitmap.Config config = this.f15798d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.e(this.f15796b, this.f15797c, this.f15798d);
        }
    }

    @g1
    public static class b extends d<a> {
        /* renamed from: d */
        public a a() {
            return new a(this);
        }

        public a e(int i10, int i11, Bitmap.Config config) {
            a aVar = (a) b();
            aVar.b(i10, i11, config);
            return aVar;
        }
    }

    public static String e(int i10, int i11, Bitmap.Config config) {
        return "[" + i10 + "x" + i11 + "], " + config;
    }

    public static String g(Bitmap bitmap) {
        return e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public String a(int i10, int i11, Bitmap.Config config) {
        return e(i10, i11, config);
    }

    public int b(Bitmap bitmap) {
        return m.h(bitmap);
    }

    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    public void d(Bitmap bitmap) {
        this.f15794b.d(this.f15793a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        return this.f15794b.a(this.f15793a.e(i10, i11, config));
    }

    public Bitmap removeLast() {
        return this.f15794b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f15794b;
    }
}
