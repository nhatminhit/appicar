package sd;

import java.util.HashMap;
import java.util.Map;
import p7.f;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int f22958a = 4;

    /* renamed from: b  reason: collision with root package name */
    public static final char f22959b = '\u001e';

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, Integer> f22960c;

    /* renamed from: d  reason: collision with root package name */
    public static final Map<Integer, String> f22961d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final b<String> f22962e = new b<>("error", "parser error");

    public static class a extends HashMap<String, Integer> {
        public a() {
            put("open", 0);
            put("close", 1);
            put("ping", 2);
            put("pong", 3);
            put("message", 4);
            put("upgrade", 5);
            put(b.f22954i, 6);
        }
    }

    public static class b implements d<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f22963a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f22964b;

        public b(StringBuilder sb2, boolean z10) {
            this.f22963a = sb2;
            this.f22964b = z10;
        }

        /* renamed from: b */
        public void a(String str) {
            this.f22963a.append(str);
            if (!this.f22964b) {
                this.f22963a.append(30);
            }
        }
    }

    /* renamed from: sd.c$c  reason: collision with other inner class name */
    public interface C0422c<T> {
        boolean a(b<T> bVar, int i10, int i11);
    }

    public interface d<T> {
        void a(T t10);
    }

    static {
        a aVar = new a();
        f22960c = aVar;
        for (Map.Entry entry : aVar.entrySet()) {
            f22961d.put(entry.getValue(), entry.getKey());
        }
    }

    public static b a(String str) {
        return str == null ? f22962e : str.charAt(0) == 'b' ? new b("message", a.a(str.substring(1), 0)) : b(str);
    }

    public static b<String> b(String str) {
        int i10;
        if (str == null) {
            return f22962e;
        }
        try {
            i10 = Character.getNumericValue(str.charAt(0));
        } catch (IndexOutOfBoundsException unused) {
            i10 = -1;
        }
        if (i10 >= 0) {
            Map<Integer, String> map = f22961d;
            if (i10 < map.size()) {
                return str.length() > 1 ? new b<>(map.get(Integer.valueOf(i10)), str.substring(1)) : new b<>(map.get(Integer.valueOf(i10)));
            }
        }
        return f22962e;
    }

    public static b<byte[]> c(byte[] bArr) {
        return new b<>("message", bArr);
    }

    public static void d(String str, C0422c<String> cVar) {
        if (str == null || str.length() == 0) {
            cVar.a(f22962e, 0, 1);
            return;
        }
        String[] split = str.split(String.valueOf(30));
        int length = split.length;
        int i10 = 0;
        while (i10 < length) {
            b a10 = a(split[i10]);
            b<String> bVar = f22962e;
            if (bVar.f22956a.equals(a10.f22956a) && ((String) bVar.f22957b).equals(a10.f22957b)) {
                cVar.a(bVar, 0, 1);
                return;
            } else if (cVar.a(a10, i10, length)) {
                i10++;
            } else {
                return;
            }
        }
    }

    public static void e(b bVar, d dVar) {
        T t10 = bVar.f22957b;
        if (t10 instanceof byte[]) {
            dVar.a(t10);
            return;
        }
        String valueOf = String.valueOf(f22960c.get(bVar.f22956a));
        T t11 = bVar.f22957b;
        String valueOf2 = t11 != null ? String.valueOf(t11) : "";
        dVar.a(valueOf + valueOf2);
    }

    public static void f(b bVar, d<String> dVar) {
        T t10 = bVar.f22957b;
        if (t10 instanceof byte[]) {
            dVar.a(f.f11703n + a.f((byte[]) t10, 0));
            return;
        }
        e(bVar, dVar);
    }

    public static void g(b[] bVarArr, d<String> dVar) {
        String sb2;
        if (bVarArr.length == 0) {
            sb2 = "0:";
        } else {
            StringBuilder sb3 = new StringBuilder();
            int length = bVarArr.length;
            int i10 = 0;
            while (i10 < length) {
                f(bVarArr[i10], new b(sb3, i10 == length + -1));
                i10++;
            }
            sb2 = sb3.toString();
        }
        dVar.a(sb2);
    }
}
