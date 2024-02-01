package w9;

import android.graphics.Typeface;
import d.x0;

@x0({x0.a.LIBRARY_GROUP})
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f23966a;

    /* renamed from: b  reason: collision with root package name */
    public final C0476a f23967b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23968c;

    /* renamed from: w9.a$a  reason: collision with other inner class name */
    public interface C0476a {
        void a(Typeface typeface);
    }

    public a(C0476a aVar, Typeface typeface) {
        this.f23966a = typeface;
        this.f23967b = aVar;
    }

    public void a(int i10) {
        d(this.f23966a);
    }

    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f23968c = true;
    }

    public final void d(Typeface typeface) {
        if (!this.f23968c) {
            this.f23967b.a(typeface);
        }
    }
}
