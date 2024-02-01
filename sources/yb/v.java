package yb;

import android.content.Intent;
import l7.a;
import va.k;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final String f24732a;

    /* renamed from: b  reason: collision with root package name */
    public final String f24733b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f24734c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f24735d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24736e;

    /* renamed from: f  reason: collision with root package name */
    public final String f24737f;

    /* renamed from: g  reason: collision with root package name */
    public final Intent f24738g;

    public v() {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, (Intent) null);
    }

    public v(Intent intent) {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
    }

    public v(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f24732a = str;
        this.f24733b = str2;
        this.f24734c = bArr;
        this.f24735d = num;
        this.f24736e = str3;
        this.f24737f = str4;
        this.f24738g = intent;
    }

    public static v h(int i10, Intent intent) {
        if (i10 != -1) {
            return new v(intent);
        }
        String stringExtra = intent.getStringExtra(k.a.f23572u);
        String stringExtra2 = intent.getStringExtra(k.a.f23573v);
        byte[] byteArrayExtra = intent.getByteArrayExtra(k.a.f23575x);
        int intExtra = intent.getIntExtra(k.a.f23576y, Integer.MIN_VALUE);
        return new v(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra(k.a.f23577z), intent.getStringExtra(k.a.B), intent);
    }

    public String a() {
        return this.f24737f;
    }

    public String b() {
        return this.f24732a;
    }

    public String c() {
        return this.f24736e;
    }

    public String d() {
        return this.f24733b;
    }

    public Integer e() {
        return this.f24735d;
    }

    public Intent f() {
        return this.f24738g;
    }

    public byte[] g() {
        return this.f24734c;
    }

    public String toString() {
        byte[] bArr = this.f24734c;
        int length = bArr == null ? 0 : bArr.length;
        return a.f10256v + this.f24733b + 10 + "Contents: " + this.f24732a + 10 + "Raw bytes: (" + length + " bytes)\nOrientation: " + this.f24735d + 10 + "EC level: " + this.f24736e + 10 + "Barcode image: " + this.f24737f + 10 + "Original intent: " + this.f24738g + 10;
    }
}
