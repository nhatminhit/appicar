package r4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import r4.f;

public abstract class a<R> implements g<R> {

    /* renamed from: a  reason: collision with root package name */
    public final g<Drawable> f12096a;

    /* renamed from: r4.a$a  reason: collision with other inner class name */
    public final class C0206a implements f<R> {

        /* renamed from: a  reason: collision with root package name */
        public final f<Drawable> f12097a;

        public C0206a(f<Drawable> fVar) {
            this.f12097a = fVar;
        }

        public boolean a(R r10, f.a aVar) {
            return this.f12097a.a(new BitmapDrawable(aVar.d().getResources(), a.this.b(r10)), aVar);
        }
    }

    public a(g<Drawable> gVar) {
        this.f12096a = gVar;
    }

    public f<R> a(v3.a aVar, boolean z10) {
        return new C0206a(this.f12096a.a(aVar, z10));
    }

    public abstract Bitmap b(R r10);
}
