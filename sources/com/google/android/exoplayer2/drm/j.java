package com.google.android.exoplayer2.drm;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Pair;
import b6.c;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.c;
import d.o0;
import h6.i;
import h6.m;
import h6.n;
import h6.q;
import h6.r;
import h6.s;
import java.util.HashMap;
import java.util.UUID;
import t7.e0;

public final class j<T extends m> {

    /* renamed from: d  reason: collision with root package name */
    public static final DrmInitData f5161d = new DrmInitData(new DrmInitData.SchemeData[0]);

    /* renamed from: a  reason: collision with root package name */
    public final ConditionVariable f5162a = new ConditionVariable();

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f5163b;

    /* renamed from: c  reason: collision with root package name */
    public final HandlerThread f5164c;

    public class a implements h6.j {
        public a() {
        }

        public void L() {
            j.this.f5162a.open();
        }

        public /* synthetic */ void Q() {
            i.b(this);
        }

        public /* synthetic */ void R() {
            i.a(this);
        }

        public void l() {
            j.this.f5162a.open();
        }

        public void n(Exception exc) {
            j.this.f5162a.open();
        }

        public void x() {
            j.this.f5162a.open();
        }
    }

    public j(UUID uuid, e<T> eVar, i iVar, @o0 HashMap<String, String> hashMap) {
        HandlerThread handlerThread = new HandlerThread("OfflineLicenseHelper");
        this.f5164c = handlerThread;
        handlerThread.start();
        a aVar = new a();
        b<T> bVar = new b<>(uuid, eVar, iVar, hashMap);
        this.f5163b = bVar;
        bVar.i(new Handler(handlerThread.getLooper()), aVar);
    }

    public static j<n> g(String str, e0.b bVar) throws r {
        return i(str, false, bVar, (HashMap<String, String>) null);
    }

    public static j<n> h(String str, boolean z10, e0.b bVar) throws r {
        return i(str, z10, bVar, (HashMap<String, String>) null);
    }

    public static j<n> i(String str, boolean z10, e0.b bVar, @o0 HashMap<String, String> hashMap) throws r {
        UUID uuid = c.A1;
        return new j<>(uuid, f.D(uuid), new g(str, z10, bVar), hashMap);
    }

    public final byte[] b(int i10, @o0 byte[] bArr, DrmInitData drmInitData) throws c.a {
        c j10 = j(i10, bArr, drmInitData);
        c.a d10 = j10.d();
        byte[] c10 = j10.c();
        this.f5163b.f(j10);
        if (d10 == null) {
            return (byte[]) w7.a.g(c10);
        }
        throw d10;
    }

    public synchronized byte[] c(DrmInitData drmInitData) throws c.a {
        w7.a.a(drmInitData != null);
        return b(2, (byte[]) null, drmInitData);
    }

    public synchronized Pair<Long, Long> d(byte[] bArr) throws c.a {
        w7.a.g(bArr);
        c j10 = j(1, bArr, f5161d);
        c.a d10 = j10.d();
        Pair<Long, Long> b10 = s.b(j10);
        this.f5163b.f(j10);
        if (d10 == null) {
            return (Pair) w7.a.g(b10);
        } else if (d10.getCause() instanceof q) {
            return Pair.create(0L, 0L);
        } else {
            throw d10;
        }
    }

    public synchronized byte[] e(String str) {
        return this.f5163b.j(str);
    }

    public synchronized String f(String str) {
        return this.f5163b.k(str);
    }

    public final c<T> j(int i10, @o0 byte[] bArr, DrmInitData drmInitData) {
        this.f5163b.r(i10, bArr);
        this.f5162a.close();
        c<T> a10 = this.f5163b.a(this.f5164c.getLooper(), drmInitData);
        this.f5162a.block();
        return a10;
    }

    public void k() {
        this.f5164c.quit();
    }

    public synchronized void l(byte[] bArr) throws c.a {
        w7.a.g(bArr);
        b(3, bArr, f5161d);
    }

    public synchronized byte[] m(byte[] bArr) throws c.a {
        w7.a.g(bArr);
        return b(2, bArr, f5161d);
    }

    public synchronized void n(String str, byte[] bArr) {
        this.f5163b.s(str, bArr);
    }

    public synchronized void o(String str, String str2) {
        this.f5163b.t(str, str2);
    }
}
