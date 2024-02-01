package qa;

import java.util.EnumMap;
import java.util.Map;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f22189a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f22190b;

    /* renamed from: c  reason: collision with root package name */
    public final int f22191c;

    /* renamed from: d  reason: collision with root package name */
    public t[] f22192d;

    /* renamed from: e  reason: collision with root package name */
    public final a f22193e;

    /* renamed from: f  reason: collision with root package name */
    public Map<s, Object> f22194f;

    /* renamed from: g  reason: collision with root package name */
    public final long f22195g;

    public r(String str, byte[] bArr, int i10, t[] tVarArr, a aVar, long j10) {
        this.f22189a = str;
        this.f22190b = bArr;
        this.f22191c = i10;
        this.f22192d = tVarArr;
        this.f22193e = aVar;
        this.f22194f = null;
        this.f22195g = j10;
    }

    public r(String str, byte[] bArr, t[] tVarArr, a aVar) {
        this(str, bArr, tVarArr, aVar, System.currentTimeMillis());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public r(String str, byte[] bArr, t[] tVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, tVarArr, aVar, j10);
    }

    public void a(t[] tVarArr) {
        t[] tVarArr2 = this.f22192d;
        if (tVarArr2 == null) {
            this.f22192d = tVarArr;
        } else if (tVarArr != null && tVarArr.length > 0) {
            t[] tVarArr3 = new t[(tVarArr2.length + tVarArr.length)];
            System.arraycopy(tVarArr2, 0, tVarArr3, 0, tVarArr2.length);
            System.arraycopy(tVarArr, 0, tVarArr3, tVarArr2.length, tVarArr.length);
            this.f22192d = tVarArr3;
        }
    }

    public a b() {
        return this.f22193e;
    }

    public int c() {
        return this.f22191c;
    }

    public byte[] d() {
        return this.f22190b;
    }

    public Map<s, Object> e() {
        return this.f22194f;
    }

    public t[] f() {
        return this.f22192d;
    }

    public String g() {
        return this.f22189a;
    }

    public long h() {
        return this.f22195g;
    }

    public void i(Map<s, Object> map) {
        if (map != null) {
            Map<s, Object> map2 = this.f22194f;
            if (map2 == null) {
                this.f22194f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void j(s sVar, Object obj) {
        if (this.f22194f == null) {
            this.f22194f = new EnumMap(s.class);
        }
        this.f22194f.put(sVar, obj);
    }

    public String toString() {
        return this.f22189a;
    }
}
