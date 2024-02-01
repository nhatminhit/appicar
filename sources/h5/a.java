package h5;

import java.util.concurrent.atomic.AtomicReferenceArray;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final int f8822c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f8823d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f8824e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f8825f = 3;

    /* renamed from: g  reason: collision with root package name */
    public static final int f8826g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f8827h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f8828i = 2;

    /* renamed from: j  reason: collision with root package name */
    public static final int f8829j = 3;

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f8830k = {8000, 8000, 2000, 2000};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f8831l = {4000, 4000, 200, 200};

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<byte[]> f8832a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceArray<char[]> f8833b;

    public a() {
        this(4, 4);
    }

    public a(int i10, int i11) {
        this.f8832a = new AtomicReferenceArray<>(i10);
        this.f8833b = new AtomicReferenceArray<>(i11);
    }

    public final byte[] a(int i10) {
        return b(i10, 0);
    }

    public byte[] b(int i10, int i11) {
        int f10 = f(i10);
        if (i11 < f10) {
            i11 = f10;
        }
        byte[] andSet = this.f8832a.getAndSet(i10, (Object) null);
        return (andSet == null || andSet.length < i11) ? e(i11) : andSet;
    }

    public final char[] c(int i10) {
        return d(i10, 0);
    }

    public char[] d(int i10, int i11) {
        int h10 = h(i10);
        if (i11 < h10) {
            i11 = h10;
        }
        char[] andSet = this.f8833b.getAndSet(i10, (Object) null);
        return (andSet == null || andSet.length < i11) ? g(i11) : andSet;
    }

    public byte[] e(int i10) {
        return new byte[i10];
    }

    public int f(int i10) {
        return f8830k[i10];
    }

    public char[] g(int i10) {
        return new char[i10];
    }

    public int h(int i10) {
        return f8831l[i10];
    }

    public void i(int i10, byte[] bArr) {
        this.f8832a.set(i10, bArr);
    }

    public void j(int i10, char[] cArr) {
        this.f8833b.set(i10, cArr);
    }
}
