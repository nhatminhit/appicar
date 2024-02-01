package com.google.android.exoplayer2.offline;

import android.net.Uri;
import com.google.android.exoplayer2.offline.c;
import d.o0;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import t7.o;
import u7.i;
import u7.l;
import w7.z;
import z6.u;

public final class d implements c {

    /* renamed from: g  reason: collision with root package name */
    public static final int f5256g = 131072;

    /* renamed from: a  reason: collision with root package name */
    public final o f5257a;

    /* renamed from: b  reason: collision with root package name */
    public final u7.a f5258b;

    /* renamed from: c  reason: collision with root package name */
    public final u7.d f5259c;

    /* renamed from: d  reason: collision with root package name */
    public final i f5260d;

    /* renamed from: e  reason: collision with root package name */
    public final z f5261e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f5262f = new AtomicBoolean();

    public static final class a implements l.a {

        /* renamed from: a  reason: collision with root package name */
        public final c.a f5263a;

        public a(c.a aVar) {
            this.f5263a = aVar;
        }

        public void a(long j10, long j11, long j12) {
            this.f5263a.a(j10, j11, (j10 == -1 || j10 == 0) ? -1.0f : (((float) j11) * 100.0f) / ((float) j10));
        }
    }

    public d(Uri uri, @o0 String str, u uVar) {
        this.f5257a = new o(uri, 0, -1, str, 16);
        this.f5258b = uVar.c();
        this.f5259c = uVar.a();
        this.f5260d = uVar.d();
        this.f5261e = uVar.e();
    }

    public void a(@o0 c.a aVar) throws InterruptedException, IOException {
        this.f5261e.a(-1000);
        try {
            l.d(this.f5257a, this.f5258b, this.f5260d, this.f5259c, new byte[131072], this.f5261e, -1000, aVar == null ? null : new a(aVar), this.f5262f, true);
        } finally {
            this.f5261e.e(-1000);
        }
    }

    public void cancel() {
        this.f5262f.set(true);
    }

    public void remove() {
        l.k(this.f5257a, this.f5258b, this.f5260d);
    }
}
