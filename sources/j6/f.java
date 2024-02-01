package j6;

import java.lang.reflect.Constructor;
import l6.c;
import m6.e;
import o6.i;
import p6.d;
import r6.b;
import r6.g0;
import r6.h;
import r6.y;

public final class f implements l {

    /* renamed from: j  reason: collision with root package name */
    public static final Constructor<? extends i> f9576j;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9577a;

    /* renamed from: b  reason: collision with root package name */
    public int f9578b;

    /* renamed from: c  reason: collision with root package name */
    public int f9579c;

    /* renamed from: d  reason: collision with root package name */
    public int f9580d;

    /* renamed from: e  reason: collision with root package name */
    public int f9581e;

    /* renamed from: f  reason: collision with root package name */
    public int f9582f;

    /* renamed from: g  reason: collision with root package name */
    public int f9583g;

    /* renamed from: h  reason: collision with root package name */
    public int f9584h = 1;

    /* renamed from: i  reason: collision with root package name */
    public int f9585i;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(i.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e10) {
            throw new RuntimeException("Error instantiating FLAC extension", e10);
        }
        f9576j = constructor;
    }

    public synchronized i[] a() {
        i[] iVarArr;
        Constructor<? extends i> constructor = f9576j;
        iVarArr = new i[(constructor == null ? 13 : 14)];
        iVarArr[0] = new e(this.f9580d);
        int i10 = 1;
        iVarArr[1] = new o6.f(this.f9582f);
        iVarArr[2] = new i(this.f9581e);
        iVarArr[3] = new n6.e(this.f9583g | (this.f9577a ? 1 : 0));
        iVarArr[4] = new h(0, this.f9578b | (this.f9577a ? 1 : 0));
        iVarArr[5] = new b();
        iVarArr[6] = new g0(this.f9584h, this.f9585i);
        iVarArr[7] = new c();
        iVarArr[8] = new d();
        iVarArr[9] = new y();
        iVarArr[10] = new s6.b();
        int i11 = this.f9579c;
        if (!this.f9577a) {
            i10 = 0;
        }
        iVarArr[11] = new k6.b(i10 | i11);
        iVarArr[12] = new r6.e();
        if (constructor != null) {
            try {
                iVarArr[13] = (i) constructor.newInstance(new Object[0]);
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        }
        return iVarArr;
    }

    public synchronized f b(int i10) {
        this.f9578b = i10;
        return this;
    }

    public synchronized f c(int i10) {
        this.f9579c = i10;
        return this;
    }

    public synchronized f d(boolean z10) {
        this.f9577a = z10;
        return this;
    }

    public synchronized f e(int i10) {
        this.f9582f = i10;
        return this;
    }

    public synchronized f f(int i10) {
        this.f9580d = i10;
        return this;
    }

    public synchronized f g(int i10) {
        this.f9583g = i10;
        return this;
    }

    public synchronized f h(int i10) {
        this.f9581e = i10;
        return this;
    }

    public synchronized f i(int i10) {
        this.f9585i = i10;
        return this;
    }

    public synchronized f j(int i10) {
        this.f9584h = i10;
        return this;
    }
}
