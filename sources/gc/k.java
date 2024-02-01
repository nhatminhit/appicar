package gc;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import gc.v;

public class k extends a<Object> {

    /* renamed from: m  reason: collision with root package name */
    public final Object f19098m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public e f19099n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(v vVar, z zVar, int i10, int i11, Object obj, String str, e eVar) {
        super(vVar, null, zVar, i10, i11, 0, (Drawable) null, str, obj, false);
        this.f19099n = eVar;
    }

    public void a() {
        super.a();
        this.f19099n = null;
    }

    public void b(Bitmap bitmap, v.e eVar) {
        e eVar2 = this.f19099n;
        if (eVar2 != null) {
            eVar2.onSuccess();
        }
    }

    public void c() {
        e eVar = this.f19099n;
        if (eVar != null) {
            eVar.a();
        }
    }

    public Object k() {
        return this.f19098m;
    }
}
