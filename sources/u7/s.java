package u7;

import d.o0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class s implements q {

    /* renamed from: f  reason: collision with root package name */
    public static final s f13880f = new s(Collections.emptyMap());

    /* renamed from: d  reason: collision with root package name */
    public int f13881d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, byte[]> f13882e;

    public s() {
        this(Collections.emptyMap());
    }

    public s(Map<String, byte[]> map) {
        this.f13882e = Collections.unmodifiableMap(map);
    }

    public static void d(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (String next : map.keySet()) {
            hashMap.put(next, h(map.get(next)));
        }
    }

    public static Map<String, byte[]> e(Map<String, byte[]> map, r rVar) {
        HashMap hashMap = new HashMap(map);
        j(hashMap, rVar.c());
        d(hashMap, rVar.b());
        return hashMap;
    }

    public static byte[] h(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(Charset.forName("UTF-8"));
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean i(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (!Arrays.equals((byte[]) next.getValue(), map2.get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void j(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            hashMap.remove(list.get(i10));
        }
    }

    @o0
    public final String a(String str, @o0 String str2) {
        return this.f13882e.containsKey(str) ? new String(this.f13882e.get(str), Charset.forName("UTF-8")) : str2;
    }

    public final long b(String str, long j10) {
        return this.f13882e.containsKey(str) ? ByteBuffer.wrap(this.f13882e.get(str)).getLong() : j10;
    }

    @o0
    public final byte[] c(String str, @o0 byte[] bArr) {
        if (!this.f13882e.containsKey(str)) {
            return bArr;
        }
        byte[] bArr2 = this.f13882e.get(str);
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean contains(String str) {
        return this.f13882e.containsKey(str);
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return i(this.f13882e, ((s) obj).f13882e);
    }

    public s f(r rVar) {
        Map<String, byte[]> e10 = e(this.f13882e, rVar);
        return i(this.f13882e, e10) ? this : new s(e10);
    }

    public Set<Map.Entry<String, byte[]>> g() {
        return this.f13882e.entrySet();
    }

    public int hashCode() {
        if (this.f13881d == 0) {
            int i10 = 0;
            for (Map.Entry next : this.f13882e.entrySet()) {
                i10 += Arrays.hashCode((byte[]) next.getValue()) ^ ((String) next.getKey()).hashCode();
            }
            this.f13881d = i10;
        }
        return this.f13881d;
    }
}
