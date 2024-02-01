package u7;

import android.net.Uri;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w7.a;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f13878a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f13879b = new ArrayList();

    public static r h(r rVar, long j10) {
        return rVar.e(q.f13877c, j10);
    }

    public static r i(r rVar, @o0 Uri uri) {
        return uri == null ? rVar.d(q.f13876b) : rVar.f(q.f13876b, uri.toString());
    }

    public final r a(String str, Object obj) {
        this.f13878a.put(a.g(str), a.g(obj));
        this.f13879b.remove(str);
        return this;
    }

    public Map<String, Object> b() {
        HashMap hashMap = new HashMap(this.f13878a);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public List<String> c() {
        return Collections.unmodifiableList(new ArrayList(this.f13879b));
    }

    public r d(String str) {
        this.f13879b.add(str);
        this.f13878a.remove(str);
        return this;
    }

    public r e(String str, long j10) {
        return a(str, Long.valueOf(j10));
    }

    public r f(String str, String str2) {
        return a(str, str2);
    }

    public r g(String str, byte[] bArr) {
        return a(str, Arrays.copyOf(bArr, bArr.length));
    }
}
