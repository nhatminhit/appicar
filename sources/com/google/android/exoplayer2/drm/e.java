package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.DrmInitData;
import d.o0;
import h6.m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface e<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    public static final int f5136a = 2;

    /* renamed from: b  reason: collision with root package name */
    public static final int f5137b = 3;

    /* renamed from: c  reason: collision with root package name */
    public static final int f5138c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f5139d = 1;

    /* renamed from: e  reason: collision with root package name */
    public static final int f5140e = 2;

    /* renamed from: f  reason: collision with root package name */
    public static final int f5141f = 3;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f5142a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5143b;

        public a(byte[] bArr, String str) {
            this.f5142a = bArr;
            this.f5143b = str;
        }

        public byte[] a() {
            return this.f5142a;
        }

        public String b() {
            return this.f5143b;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5144a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f5145b;

        public b(int i10, byte[] bArr) {
            this.f5144a = i10;
            this.f5145b = bArr;
        }

        public byte[] a() {
            return this.f5145b;
        }

        public int b() {
            return this.f5144a;
        }
    }

    public interface c<T extends m> {
        void a(e<? extends T> eVar, @o0 byte[] bArr, int i10, int i11, @o0 byte[] bArr2);
    }

    public interface d<T extends m> {
        void a(e<? extends T> eVar, byte[] bArr, List<b> list, boolean z10);
    }

    /* renamed from: com.google.android.exoplayer2.drm.e$e  reason: collision with other inner class name */
    public static final class C0086e {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f5146a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5147b;

        public C0086e(byte[] bArr, String str) {
            this.f5146a = bArr;
            this.f5147b = str;
        }

        public byte[] a() {
            return this.f5146a;
        }

        public String b() {
            return this.f5147b;
        }
    }

    void a();

    Map<String, String> b(byte[] bArr);

    void c(String str, byte[] bArr);

    String d(String str);

    T e(byte[] bArr) throws MediaCryptoException;

    C0086e f();

    byte[] g() throws MediaDrmException;

    void h(byte[] bArr, byte[] bArr2);

    void i(String str, String str2);

    void j(byte[] bArr);

    byte[] k(String str);

    void l(c<? super T> cVar);

    @o0
    byte[] m(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    void n(byte[] bArr) throws DeniedByServerException;

    a o(byte[] bArr, @o0 List<DrmInitData.SchemeData> list, int i10, @o0 HashMap<String, String> hashMap) throws NotProvisionedException;

    void p(d<? super T> dVar);
}
