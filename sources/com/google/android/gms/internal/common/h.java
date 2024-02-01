package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import org.jspecify.nullness.NullMarked;

@NullMarked
public abstract class h extends d implements List, RandomAccess {
    public static final l P = new f(j.S, 0);

    public static h m(Object[] objArr, int i10) {
        return i10 == 0 ? j.S : new j(objArr, i10);
    }

    public static h n(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return j.S;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return q(next);
        }
        e eVar = new e(4);
        eVar.c(next);
        eVar.d(it);
        eVar.f5835c = true;
        return m(eVar.f5833a, eVar.f5834b);
    }

    public static h o(Collection collection) {
        if (collection instanceof d) {
            h f10 = ((d) collection).f();
            if (!f10.i()) {
                return f10;
            }
            Object[] array = f10.toArray();
            return m(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        i.a(array2, length);
        return m(array2, length);
    }

    public static h p() {
        return j.S;
    }

    public static h q(Object obj) {
        Object[] objArr = {obj};
        i.a(objArr, 1);
        return m(objArr, 1);
    }

    public static h r(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        i.a(objArr, 2);
        return m(objArr, 2);
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public int b(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (c0.a(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!c0.a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @InlineMe(replacement = "this")
    @Deprecated
    public final h f() {
        return this;
    }

    public final k h() {
        return listIterator(0);
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: l */
    public h subList(int i10, int i11) {
        d0.c(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? j.S : new g(this, i10, i12);
    }

    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: s */
    public final l listIterator(int i10) {
        d0.b(i10, size(), "index");
        return isEmpty() ? P : new f(this, i10);
    }

    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
