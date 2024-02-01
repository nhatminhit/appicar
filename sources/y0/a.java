package y0;

import android.graphics.Typeface;
import android.os.Handler;
import d.m0;
import y0.e;
import y0.f;

public class a {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final f.d f15241a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15242b;

    /* renamed from: y0.a$a  reason: collision with other inner class name */
    public class C0241a implements Runnable {
        public final /* synthetic */ f.d O;
        public final /* synthetic */ Typeface P;

        public C0241a(f.d dVar, Typeface typeface) {
            this.O = dVar;
            this.P = typeface;
        }

        public void run() {
            this.O.b(this.P);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ f.d O;
        public final /* synthetic */ int P;

        public b(f.d dVar, int i10) {
            this.O = dVar;
            this.P = i10;
        }

        public void run() {
            this.O.a(this.P);
        }
    }

    public a(@m0 f.d dVar) {
        this.f15241a = dVar;
        this.f15242b = b.a();
    }

    public a(@m0 f.d dVar, @m0 Handler handler) {
        this.f15241a = dVar;
        this.f15242b = handler;
    }

    public final void a(int i10) {
        this.f15242b.post(new b(this.f15241a, i10));
    }

    public void b(@m0 e.C0242e eVar) {
        if (eVar.a()) {
            c(eVar.f15264a);
        } else {
            a(eVar.f15265b);
        }
    }

    public final void c(@m0 Typeface typeface) {
        this.f15242b.post(new C0241a(this.f15241a, typeface));
    }
}
