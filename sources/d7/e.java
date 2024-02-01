package d7;

import android.util.SparseArray;
import b6.c;
import com.google.android.exoplayer2.Format;
import d.o0;
import j6.h;
import j6.i;
import j6.j;
import j6.k;
import j6.q;
import j6.s;
import java.io.IOException;
import w7.w;

public final class e implements k {
    public final i O;
    public final int P;
    public final Format Q;
    public final SparseArray<a> R = new SparseArray<>();
    public boolean S;
    public b T;
    public long U;
    public q V;
    public Format[] W;

    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        public final int f6523a;

        /* renamed from: b  reason: collision with root package name */
        public final int f6524b;

        /* renamed from: c  reason: collision with root package name */
        public final Format f6525c;

        /* renamed from: d  reason: collision with root package name */
        public final h f6526d = new h();

        /* renamed from: e  reason: collision with root package name */
        public Format f6527e;

        /* renamed from: f  reason: collision with root package name */
        public s f6528f;

        /* renamed from: g  reason: collision with root package name */
        public long f6529g;

        public a(int i10, int i11, Format format) {
            this.f6523a = i10;
            this.f6524b = i11;
            this.f6525c = format;
        }

        public void a(w wVar, int i10) {
            this.f6528f.a(wVar, i10);
        }

        public int b(j jVar, int i10, boolean z10) throws IOException, InterruptedException {
            return this.f6528f.b(jVar, i10, z10);
        }

        public void c(long j10, int i10, int i11, int i12, s.a aVar) {
            long j11 = this.f6529g;
            if (j11 != c.f4201b && j10 >= j11) {
                this.f6528f = this.f6526d;
            }
            this.f6528f.c(j10, i10, i11, i12, aVar);
        }

        public void d(Format format) {
            Format format2 = this.f6525c;
            if (format2 != null) {
                format = format.f(format2);
            }
            this.f6527e = format;
            this.f6528f.d(format);
        }

        public void e(b bVar, long j10) {
            if (bVar == null) {
                this.f6528f = this.f6526d;
                return;
            }
            this.f6529g = j10;
            s a10 = bVar.a(this.f6523a, this.f6524b);
            this.f6528f = a10;
            Format format = this.f6527e;
            if (format != null) {
                a10.d(format);
            }
        }
    }

    public interface b {
        s a(int i10, int i11);
    }

    public e(i iVar, int i10, Format format) {
        this.O = iVar;
        this.P = i10;
        this.Q = format;
    }

    public s a(int i10, int i11) {
        a aVar = this.R.get(i10);
        if (aVar == null) {
            w7.a.i(this.W == null);
            aVar = new a(i10, i11, i11 == this.P ? this.Q : null);
            aVar.e(this.T, this.U);
            this.R.put(i10, aVar);
        }
        return aVar;
    }

    public Format[] b() {
        return this.W;
    }

    public q c() {
        return this.V;
    }

    public void d(@o0 b bVar, long j10, long j11) {
        this.T = bVar;
        this.U = j11;
        if (!this.S) {
            this.O.g(this);
            if (j10 != c.f4201b) {
                this.O.h(0, j10);
            }
            this.S = true;
            return;
        }
        i iVar = this.O;
        if (j10 == c.f4201b) {
            j10 = 0;
        }
        iVar.h(0, j10);
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            this.R.valueAt(i10).e(bVar, j11);
        }
    }

    public void q(q qVar) {
        this.V = qVar;
    }

    public void r() {
        Format[] formatArr = new Format[this.R.size()];
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            formatArr[i10] = this.R.valueAt(i10).f6527e;
        }
        this.W = formatArr;
    }
}
