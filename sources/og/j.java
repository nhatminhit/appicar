package og;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f21621a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f21622b;

    public j(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (str2 != null) {
            this.f21621a = str;
            this.f21622b = Collections.singletonMap("realm", str2);
        } else {
            throw new NullPointerException("realm == null");
        }
    }

    public j(String str, Map<String, String> map) {
        if (str == null) {
            throw new NullPointerException("scheme == null");
        } else if (map != null) {
            this.f21621a = str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry next : map.entrySet()) {
                linkedHashMap.put(next.getKey() == null ? null : ((String) next.getKey()).toLowerCase(Locale.US), (String) next.getValue());
            }
            this.f21622b = Collections.unmodifiableMap(linkedHashMap);
        } else {
            throw new NullPointerException("authParams == null");
        }
    }

    public Map<String, String> a() {
        return this.f21622b;
    }

    public Charset b() {
        String str = this.f21622b.get("charset");
        if (str != null) {
            try {
                return Charset.forName(str);
            } catch (Exception unused) {
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    public String c() {
        return this.f21622b.get("realm");
    }

    public String d() {
        return this.f21621a;
    }

    public j e(Charset charset) {
        if (charset != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f21622b);
            linkedHashMap.put("charset", charset.name());
            return new j(this.f21621a, (Map<String, String>) linkedHashMap);
        }
        throw new NullPointerException("charset == null");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            return jVar.f21621a.equals(this.f21621a) && jVar.f21622b.equals(this.f21622b);
        }
    }

    public int hashCode() {
        return ((899 + this.f21621a.hashCode()) * 31) + this.f21622b.hashCode();
    }

    public String toString() {
        return this.f21621a + " authParams=" + this.f21622b;
    }
}
