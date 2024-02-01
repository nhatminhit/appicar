package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.offline.c;
import d.m0;
import d.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.o;
import u7.d;
import u7.i;
import u7.l;
import w7.q0;
import w7.z;
import z6.u;
import z6.w;

public abstract class e<M extends w<M>> implements c {

    /* renamed from: i  reason: collision with root package name */
    public static final int f5264i = 131072;

    /* renamed from: a  reason: collision with root package name */
    public final o f5265a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.a f5266b;

    /* renamed from: c  reason: collision with root package name */
    public final d f5267c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5268d;

    /* renamed from: e  reason: collision with root package name */
    public final i f5269e;

    /* renamed from: f  reason: collision with root package name */
    public final z f5270f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList<StreamKey> f5271g;

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f5272h = new AtomicBoolean();

    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f5273a;

        /* renamed from: b  reason: collision with root package name */
        public final long f5274b;

        /* renamed from: c  reason: collision with root package name */
        public final int f5275c;

        /* renamed from: d  reason: collision with root package name */
        public long f5276d;

        /* renamed from: e  reason: collision with root package name */
        public int f5277e;

        public a(c.a aVar, long j10, int i10, long j11, int i11) {
            this.f5273a = aVar;
            this.f5274b = j10;
            this.f5275c = i10;
            this.f5276d = j11;
            this.f5277e = i11;
        }

        public void a(long j10, long j11, long j12) {
            long j13 = this.f5276d + j12;
            this.f5276d = j13;
            this.f5273a.a(this.f5274b, j13, b());
        }

        public final float b() {
            long j10 = this.f5274b;
            if (j10 != -1 && j10 != 0) {
                return (((float) this.f5276d) * 100.0f) / ((float) j10);
            }
            int i10 = this.f5275c;
            if (i10 != 0) {
                return (((float) this.f5277e) * 100.0f) / ((float) i10);
            }
            return -1.0f;
        }

        public void c() {
            this.f5277e++;
            this.f5273a.a(this.f5274b, this.f5276d, b());
        }
    }

    public static class b implements Comparable<b> {
        public final long O;
        public final o P;

        public b(long j10, o oVar) {
            this.O = j10;
            this.P = oVar;
        }

        /* renamed from: a */
        public int compareTo(@m0 b bVar) {
            return q0.s(this.O, bVar.O);
        }
    }

    public e(Uri uri, List<StreamKey> list, u uVar) {
        this.f5265a = b(uri);
        this.f5271g = new ArrayList<>(list);
        this.f5266b = uVar.c();
        this.f5267c = uVar.a();
        this.f5268d = uVar.b();
        this.f5269e = uVar.d();
        this.f5270f = uVar.e();
    }

    public static o b(Uri uri) {
        return new o(uri, 0, -1, (String) null, 1);
    }

    public final void a(@o0 c.a aVar) throws IOException, InterruptedException {
        this.f5270f.a(-1000);
        try {
            w c10 = c(this.f5267c, this.f5265a);
            if (!this.f5271g.isEmpty()) {
                c10 = (w) c10.a(this.f5271g);
            }
            List<b> d10 = d(this.f5267c, c10, false);
            int size = d10.size();
            int i10 = 0;
            long j10 = 0;
            long j11 = 0;
            for (int size2 = d10.size() - 1; size2 >= 0; size2--) {
                Pair<Long, Long> f10 = l.f(d10.get(size2).P, this.f5266b, this.f5269e);
                long longValue = ((Long) f10.first).longValue();
                long longValue2 = ((Long) f10.second).longValue();
                j11 += longValue2;
                if (longValue != -1) {
                    if (longValue == longValue2) {
                        i10++;
                        d10.remove(size2);
                    }
                    if (j10 != -1) {
                        j10 += longValue;
                    }
                } else {
                    j10 = -1;
                }
            }
            Collections.sort(d10);
            a aVar2 = null;
            if (aVar != null) {
                aVar2 = new a(aVar, j10, size, j11, i10);
            }
            byte[] bArr = new byte[131072];
            for (int i11 = 0; i11 < d10.size(); i11++) {
                l.d(d10.get(i11).P, this.f5266b, this.f5269e, this.f5267c, bArr, this.f5270f, -1000, aVar2, this.f5272h, true);
                if (aVar2 != null) {
                    aVar2.c();
                }
            }
        } finally {
            this.f5270f.e(-1000);
        }
    }

    public abstract M c(t7.l lVar, o oVar) throws IOException;

    public void cancel() {
        this.f5272h.set(true);
    }

    public abstract List<b> d(t7.l lVar, M m10, boolean z10) throws InterruptedException, IOException;

    public final void e(o oVar) {
        l.k(oVar, this.f5266b, this.f5269e);
    }

    public final void remove() throws InterruptedException {
        try {
            List<b> d10 = d(this.f5268d, c(this.f5268d, this.f5265a), true);
            for (int i10 = 0; i10 < d10.size(); i10++) {
                e(d10.get(i10).P);
            }
        } catch (IOException unused) {
        } catch (Throwable th2) {
            e(this.f5265a);
            throw th2;
        }
        e(this.f5265a);
    }
}
