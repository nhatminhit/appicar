package g8;

import androidx.collection.a;
import com.google.android.gms.common.ConnectionResult;
import d.o0;
import f8.c;
import f8.l;
import h9.m;
import h9.n;
import java.util.Iterator;
import java.util.Set;

public final class n2 {

    /* renamed from: a  reason: collision with root package name */
    public final a f8242a = new a();

    /* renamed from: b  reason: collision with root package name */
    public final a f8243b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final n f8244c = new n();

    /* renamed from: d  reason: collision with root package name */
    public int f8245d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8246e = false;

    public n2(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f8242a.put(((l) it.next()).G(), null);
        }
        this.f8245d = this.f8242a.keySet().size();
    }

    public final m a() {
        return this.f8244c.a();
    }

    public final Set b() {
        return this.f8242a.keySet();
    }

    public final void c(c cVar, ConnectionResult connectionResult, @o0 String str) {
        this.f8242a.put(cVar, connectionResult);
        this.f8243b.put(cVar, str);
        this.f8245d--;
        if (!connectionResult.h1()) {
            this.f8246e = true;
        }
        if (this.f8245d != 0) {
            return;
        }
        if (this.f8246e) {
            this.f8244c.b(new c(this.f8242a));
            return;
        }
        this.f8244c.c(this.f8243b);
    }
}
