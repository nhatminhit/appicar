package xe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class s1 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<Object> f24564a;

    public s1(int i10) {
        this.f24564a = new ArrayList<>(i10);
    }

    public void a(Object obj) {
        this.f24564a.add(obj);
    }

    public void b(Object obj) {
        if (obj != null) {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr.length > 0) {
                    ArrayList<Object> arrayList = this.f24564a;
                    arrayList.ensureCapacity(arrayList.size() + objArr.length);
                    Collections.addAll(this.f24564a, objArr);
                }
            } else if (obj instanceof Collection) {
                this.f24564a.addAll((Collection) obj);
            } else if (obj instanceof Iterable) {
                for (Object add : (Iterable) obj) {
                    this.f24564a.add(add);
                }
            } else if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                while (it.hasNext()) {
                    this.f24564a.add(it.next());
                }
            } else {
                throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
            }
        }
    }

    public int c() {
        return this.f24564a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f24564a.toArray(objArr);
    }
}
