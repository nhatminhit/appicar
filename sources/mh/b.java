package mh;

import ih.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import jh.h;

public abstract class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<d> f21113a;

    /* renamed from: b  reason: collision with root package name */
    public int f21114b;

    public static final class a extends b {
        public a(Collection<d> collection) {
            super(collection);
        }

        public a(d... dVarArr) {
            this((Collection<d>) Arrays.asList(dVarArr));
        }

        public boolean a(h hVar, h hVar2) {
            for (int i10 = 0; i10 < this.f21114b; i10++) {
                if (!this.f21113a.get(i10).a(hVar, hVar2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return c.j(this.f21113a, " ");
        }
    }

    /* renamed from: mh.b$b  reason: collision with other inner class name */
    public static final class C0366b extends b {
        public C0366b() {
        }

        public C0366b(Collection<d> collection) {
            if (this.f21114b > 1) {
                this.f21113a.add(new a(collection));
            } else {
                this.f21113a.addAll(collection);
            }
            d();
        }

        public C0366b(d... dVarArr) {
            this((Collection<d>) Arrays.asList(dVarArr));
        }

        public boolean a(h hVar, h hVar2) {
            for (int i10 = 0; i10 < this.f21114b; i10++) {
                if (this.f21113a.get(i10).a(hVar, hVar2)) {
                    return true;
                }
            }
            return false;
        }

        public void e(d dVar) {
            this.f21113a.add(dVar);
            d();
        }

        public String toString() {
            return c.j(this.f21113a, ", ");
        }
    }

    public b() {
        this.f21114b = 0;
        this.f21113a = new ArrayList<>();
    }

    public b(Collection<d> collection) {
        this();
        this.f21113a.addAll(collection);
        d();
    }

    public void b(d dVar) {
        this.f21113a.set(this.f21114b - 1, dVar);
    }

    public d c() {
        int i10 = this.f21114b;
        if (i10 > 0) {
            return this.f21113a.get(i10 - 1);
        }
        return null;
    }

    public void d() {
        this.f21114b = this.f21113a.size();
    }
}
