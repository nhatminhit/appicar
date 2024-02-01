package r6;

import android.util.SparseArray;
import j6.k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import w7.j0;
import w7.w;

public interface h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12254a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12255b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12256c = 4;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12257a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12258b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12259c;

        public a(String str, int i10, byte[] bArr) {
            this.f12257a = str;
            this.f12258b = i10;
            this.f12259c = bArr;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12260a;

        /* renamed from: b  reason: collision with root package name */
        public final String f12261b;

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f12262c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f12263d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f12260a = i10;
            this.f12261b = str;
            this.f12262c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f12263d = bArr;
        }
    }

    public interface c {
        SparseArray<h0> a();

        h0 b(int i10, b bVar);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    public static final class e {

        /* renamed from: f  reason: collision with root package name */
        public static final int f12264f = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public final String f12265a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12266b;

        /* renamed from: c  reason: collision with root package name */
        public final int f12267c;

        /* renamed from: d  reason: collision with root package name */
        public int f12268d;

        /* renamed from: e  reason: collision with root package name */
        public String f12269e;

        public e(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public e(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.f12265a = str;
            this.f12266b = i11;
            this.f12267c = i12;
            this.f12268d = Integer.MIN_VALUE;
        }

        public void a() {
            int i10 = this.f12268d;
            this.f12268d = i10 == Integer.MIN_VALUE ? this.f12266b : i10 + this.f12267c;
            this.f12269e = this.f12265a + this.f12268d;
        }

        public String b() {
            d();
            return this.f12269e;
        }

        public int c() {
            d();
            return this.f12268d;
        }

        public final void d() {
            if (this.f12268d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }
    }

    void a(j0 j0Var, k kVar, e eVar);

    void b(w wVar, int i10) throws b6.j0;

    void c();
}
