package androidx.databinding;

import androidx.databinding.y;
import java.util.ArrayList;
import java.util.Collection;

public class v<T> extends ArrayList<T> implements y<T> {
    public transient s O = new s();

    public void N(y.a aVar) {
        if (this.O == null) {
            this.O = new s();
        }
        this.O.a(aVar);
    }

    public void add(int i10, T t10) {
        super.add(i10, t10);
        i(i10, 1);
    }

    public boolean add(T t10) {
        super.add(t10);
        i(size() - 1, 1);
        return true;
    }

    public boolean addAll(int i10, Collection<? extends T> collection) {
        boolean addAll = super.addAll(i10, collection);
        if (addAll) {
            i(i10, collection.size());
        }
        return addAll;
    }

    public boolean addAll(Collection<? extends T> collection) {
        int size = size();
        boolean addAll = super.addAll(collection);
        if (addAll) {
            i(size, size() - size);
        }
        return addAll;
    }

    public void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            j(0, size);
        }
    }

    public final void i(int i10, int i11) {
        s sVar = this.O;
        if (sVar != null) {
            sVar.A(this, i10, i11);
        }
    }

    public final void j(int i10, int i11) {
        s sVar = this.O;
        if (sVar != null) {
            sVar.C(this, i10, i11);
        }
    }

    public void k(y.a aVar) {
        s sVar = this.O;
        if (sVar != null) {
            sVar.t(aVar);
        }
    }

    public T remove(int i10) {
        T remove = super.remove(i10);
        j(i10, 1);
        return remove;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public void removeRange(int i10, int i11) {
        super.removeRange(i10, i11);
        j(i10, i11 - i10);
    }

    public T set(int i10, T t10) {
        T t11 = super.set(i10, t10);
        s sVar = this.O;
        if (sVar != null) {
            sVar.z(this, i10, 1);
        }
        return t11;
    }
}
