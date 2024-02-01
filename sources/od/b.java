package od;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import od.c;
import od.h;
import og.g;
import og.p0;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f21369a = Logger.getLogger(b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, c> f21370b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public static int f21371c = 5;

    public static class a extends c.k {
        public boolean B;
        public boolean C = true;

        public static g c() {
            return g.b();
        }
    }

    public static void a(g.a aVar) {
        c.F = aVar;
    }

    public static void b(p0.a aVar) {
        c.E = aVar;
    }

    public static e c(String str) throws URISyntaxException {
        return d(str, (a) null);
    }

    public static e d(String str, a aVar) throws URISyntaxException {
        return f(new URI(str), aVar);
    }

    public static e e(URI uri) {
        return f(uri, (a) null);
    }

    public static e f(URI uri, a aVar) {
        c cVar;
        String str;
        if (aVar == null) {
            aVar = new a();
        }
        h.a b10 = h.b(uri);
        URI uri2 = b10.f21451a;
        String str2 = b10.f21452b;
        ConcurrentHashMap<String, c> concurrentHashMap = f21370b;
        boolean z10 = aVar.B || !aVar.C || (concurrentHashMap.containsKey(str2) && concurrentHashMap.get(str2).f21396t.containsKey(uri2.getPath()));
        String query = uri2.getQuery();
        if (query != null && ((str = aVar.f22336q) == null || str.isEmpty())) {
            aVar.f22336q = query;
        }
        if (z10) {
            Logger logger = f21369a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(String.format("ignoring socket cache for %s", new Object[]{uri2}));
            }
            cVar = new c(uri2, aVar);
        } else {
            if (!concurrentHashMap.containsKey(str2)) {
                Logger logger2 = f21369a;
                if (logger2.isLoggable(Level.FINE)) {
                    logger2.fine(String.format("new io instance for %s", new Object[]{uri2}));
                }
                concurrentHashMap.putIfAbsent(str2, new c(uri2, aVar));
            }
            cVar = concurrentHashMap.get(str2);
        }
        return cVar.d0(uri2.getPath(), aVar);
    }
}
