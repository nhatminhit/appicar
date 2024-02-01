package fb;

import android.content.Intent;
import l7.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f18879a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18880b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f18881c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f18882d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18883e;

    /* renamed from: f  reason: collision with root package name */
    public final String f18884f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f18885g;

    public b() {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, (Intent) null);
    }

    public b(Intent intent) {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
    }

    public b(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f18879a = str;
        this.f18880b = str2;
        this.f18881c = bArr;
        this.f18882d = num;
        this.f18883e = str3;
        this.f18884f = str4;
        this.f18885g = intent;
    }

    public String a() {
        return this.f18884f;
    }

    public String b() {
        return this.f18879a;
    }

    public String c() {
        return this.f18883e;
    }

    public String d() {
        return this.f18880b;
    }

    public Integer e() {
        return this.f18882d;
    }

    public Intent f() {
        return this.f18885g;
    }

    public byte[] g() {
        return this.f18881c;
    }

    public String toString() {
        byte[] bArr = this.f18881c;
        int length = bArr == null ? 0 : bArr.length;
        return a.f10256v + this.f18880b + 10 + "Contents: " + this.f18879a + 10 + "Raw bytes: (" + length + " bytes)\nOrientation: " + this.f18882d + 10 + "EC level: " + this.f18883e + 10 + "Barcode image: " + this.f18884f + 10 + "Original intent: " + this.f18885g + 10;
    }
}
