package be;

import fh.g;
import fh.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p7.f;
import xe.l0;
import xe.w;
import zd.h1;

@h1(version = "1.1")
public abstract class i<E> extends a<E> implements Set<E>, ye.a {
    @g
    public static final a O = new a((w) null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final boolean a(@g Set<?> set, @g Set<?> set2) {
            l0.p(set, f.f11706q);
            l0.p(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(@g Collection<?> collection) {
            l0.p(collection, f.f11706q);
            Iterator<?> it = collection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i10 += next != null ? next.hashCode() : 0;
            }
            return i10;
        }
    }

    public boolean equals(@h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return O.a(this, (Set) obj);
    }

    public int hashCode() {
        return O.b(this);
    }

    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
