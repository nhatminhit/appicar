package yb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import va.k;

public class w {

    /* renamed from: d  reason: collision with root package name */
    public static final String f24739d = "UPC_A";

    /* renamed from: e  reason: collision with root package name */
    public static final String f24740e = "UPC_E";

    /* renamed from: f  reason: collision with root package name */
    public static final String f24741f = "EAN_8";

    /* renamed from: g  reason: collision with root package name */
    public static final String f24742g = "EAN_13";

    /* renamed from: h  reason: collision with root package name */
    public static final String f24743h = "RSS_14";

    /* renamed from: i  reason: collision with root package name */
    public static final String f24744i = "CODE_39";

    /* renamed from: j  reason: collision with root package name */
    public static final String f24745j = "CODE_93";

    /* renamed from: k  reason: collision with root package name */
    public static final String f24746k = "CODE_128";

    /* renamed from: l  reason: collision with root package name */
    public static final String f24747l = "ITF";

    /* renamed from: m  reason: collision with root package name */
    public static final String f24748m = "RSS_EXPANDED";

    /* renamed from: n  reason: collision with root package name */
    public static final String f24749n = "QR_CODE";

    /* renamed from: o  reason: collision with root package name */
    public static final String f24750o = "DATA_MATRIX";

    /* renamed from: p  reason: collision with root package name */
    public static final String f24751p = "PDF_417";

    /* renamed from: q  reason: collision with root package name */
    public static final Collection<String> f24752q = g("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");

    /* renamed from: r  reason: collision with root package name */
    public static final Collection<String> f24753r = g("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");

    /* renamed from: s  reason: collision with root package name */
    public static final Collection<String> f24754s = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f24755a = new HashMap(3);

    /* renamed from: b  reason: collision with root package name */
    public Collection<String> f24756b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f24757c;

    public static List<String> g(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final w a(String str, Object obj) {
        this.f24755a.put(str, obj);
        return this;
    }

    public final void b(Intent intent) {
        Serializable serializable;
        for (Map.Entry next : this.f24755a.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Integer) {
                serializable = (Integer) value;
            } else if (value instanceof Long) {
                serializable = (Long) value;
            } else if (value instanceof Boolean) {
                serializable = (Boolean) value;
            } else if (value instanceof Double) {
                serializable = (Double) value;
            } else if (value instanceof Float) {
                serializable = (Float) value;
            } else if (value instanceof Bundle) {
                intent.putExtra(str, (Bundle) value);
            } else if (value instanceof int[]) {
                intent.putExtra(str, (int[]) value);
            } else if (value instanceof long[]) {
                intent.putExtra(str, (long[]) value);
            } else if (value instanceof boolean[]) {
                intent.putExtra(str, (boolean[]) value);
            } else if (value instanceof double[]) {
                intent.putExtra(str, (double[]) value);
            } else if (value instanceof float[]) {
                intent.putExtra(str, (float[]) value);
            } else if (value instanceof String[]) {
                intent.putExtra(str, (String[]) value);
            } else {
                intent.putExtra(str, value.toString());
            }
            intent.putExtra(str, serializable);
        }
    }

    public Intent c(Context context) {
        Intent intent = new Intent(context, d());
        intent.setAction(k.a.f23552a);
        if (this.f24756b != null) {
            StringBuilder sb2 = new StringBuilder();
            for (String next : this.f24756b) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(next);
            }
            intent.putExtra(k.a.f23560i, sb2.toString());
        }
        intent.addFlags(67108864);
        intent.addFlags(524288);
        b(intent);
        return intent;
    }

    public Class<?> d() {
        if (this.f24757c == null) {
            this.f24757c = e();
        }
        return this.f24757c;
    }

    public Class<?> e() {
        return CaptureActivity.class;
    }

    public Map<String, ?> f() {
        return this.f24755a;
    }

    public w h(boolean z10) {
        a(k.a.f23565n, Boolean.valueOf(z10));
        return this;
    }

    public w i(boolean z10) {
        a(k.a.f23564m, Boolean.valueOf(z10));
        return this;
    }

    public w j(int i10) {
        if (i10 >= 0) {
            a(k.a.f23561j, Integer.valueOf(i10));
        }
        return this;
    }

    public w k(Class<?> cls) {
        this.f24757c = cls;
        return this;
    }

    public w l(Collection<String> collection) {
        this.f24756b = collection;
        return this;
    }

    public w m(String... strArr) {
        this.f24756b = Arrays.asList(strArr);
        return this;
    }

    public w n(boolean z10) {
        a(k.a.f23570s, Boolean.valueOf(z10));
        return this;
    }

    public final w o(String str) {
        if (str != null) {
            a(k.a.f23571t, str);
        }
        return this;
    }

    public w p(long j10) {
        a(k.a.f23566o, Long.valueOf(j10));
        return this;
    }

    public w q(boolean z10) {
        a(k.a.f23562k, Boolean.valueOf(z10));
        return this;
    }
}
