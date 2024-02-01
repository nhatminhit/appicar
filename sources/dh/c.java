package dh;

import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final List<c> f18375d = new ArrayList();

    /* renamed from: a  reason: collision with root package name */
    public Object f18376a;

    /* renamed from: b  reason: collision with root package name */
    public g f18377b;

    /* renamed from: c  reason: collision with root package name */
    public c f18378c;

    public c(Object obj, g gVar) {
        this.f18376a = obj;
        this.f18377b = gVar;
    }

    public static c a(g gVar, Object obj) {
        List<c> list = f18375d;
        synchronized (list) {
            int size = list.size();
            if (size <= 0) {
                return new c(obj, gVar);
            }
            c remove = list.remove(size - 1);
            remove.f18376a = obj;
            remove.f18377b = gVar;
            remove.f18378c = null;
            return remove;
        }
    }

    public static void b(c cVar) {
        cVar.f18376a = null;
        cVar.f18377b = null;
        cVar.f18378c = null;
        List<c> list = f18375d;
        synchronized (list) {
            if (list.size() < 10000) {
                list.add(cVar);
            }
        }
    }
}
