package e4;

import android.text.TextUtils;
import d.m0;
import d.o0;
import d4.g;
import d4.h;
import d4.m;
import d4.n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import v3.f;
import v3.i;

public abstract class a<Model> implements n<Model, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final n<g, InputStream> f6808a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final m<Model, g> f6809b;

    public a(n<g, InputStream> nVar) {
        this(nVar, (m) null);
    }

    public a(n<g, InputStream> nVar, @o0 m<Model, g> mVar) {
        this.f6808a = nVar;
        this.f6809b = mVar;
    }

    public static List<f> c(Collection<String> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (String gVar : collection) {
            arrayList.add(new g(gVar));
        }
        return arrayList;
    }

    @o0
    public n.a<InputStream> b(@m0 Model model, int i10, int i11, @m0 i iVar) {
        m<Model, g> mVar = this.f6809b;
        g b10 = mVar != null ? mVar.b(model, i10, i11) : null;
        if (b10 == null) {
            String f10 = f(model, i10, i11, iVar);
            if (TextUtils.isEmpty(f10)) {
                return null;
            }
            g gVar = new g(f10, e(model, i10, i11, iVar));
            m<Model, g> mVar2 = this.f6809b;
            if (mVar2 != null) {
                mVar2.c(model, i10, i11, gVar);
            }
            b10 = gVar;
        }
        List<String> d10 = d(model, i10, i11, iVar);
        n.a<InputStream> b11 = this.f6808a.b(b10, i10, i11, iVar);
        return (b11 == null || d10.isEmpty()) ? b11 : new n.a<>(b11.f6052a, c(d10), b11.f6054c);
    }

    public List<String> d(Model model, int i10, int i11, i iVar) {
        return Collections.emptyList();
    }

    @o0
    public h e(Model model, int i10, int i11, i iVar) {
        return h.f6033b;
    }

    public abstract String f(Model model, int i10, int i11, i iVar);
}
