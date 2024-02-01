package fb;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
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

public class a {

    /* renamed from: h  reason: collision with root package name */
    public static final int f18854h = 49374;

    /* renamed from: i  reason: collision with root package name */
    public static final String f18855i = "a";

    /* renamed from: j  reason: collision with root package name */
    public static final String f18856j = "UPC_A";

    /* renamed from: k  reason: collision with root package name */
    public static final String f18857k = "UPC_E";

    /* renamed from: l  reason: collision with root package name */
    public static final String f18858l = "EAN_8";

    /* renamed from: m  reason: collision with root package name */
    public static final String f18859m = "EAN_13";

    /* renamed from: n  reason: collision with root package name */
    public static final String f18860n = "RSS_14";

    /* renamed from: o  reason: collision with root package name */
    public static final String f18861o = "CODE_39";

    /* renamed from: p  reason: collision with root package name */
    public static final String f18862p = "CODE_93";

    /* renamed from: q  reason: collision with root package name */
    public static final String f18863q = "CODE_128";

    /* renamed from: r  reason: collision with root package name */
    public static final String f18864r = "ITF";

    /* renamed from: s  reason: collision with root package name */
    public static final String f18865s = "RSS_EXPANDED";

    /* renamed from: t  reason: collision with root package name */
    public static final String f18866t = "QR_CODE";

    /* renamed from: u  reason: collision with root package name */
    public static final String f18867u = "DATA_MATRIX";

    /* renamed from: v  reason: collision with root package name */
    public static final String f18868v = "PDF_417";

    /* renamed from: w  reason: collision with root package name */
    public static final Collection<String> f18869w = k("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14");

    /* renamed from: x  reason: collision with root package name */
    public static final Collection<String> f18870x = k("UPC_A", "UPC_E", "EAN_8", "EAN_13", "RSS_14", "CODE_39", "CODE_93", "CODE_128", "ITF", "RSS_14", "RSS_EXPANDED");

    /* renamed from: y  reason: collision with root package name */
    public static final Collection<String> f18871y = null;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f18872a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f18873b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.fragment.app.Fragment f18874c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Object> f18875d = new HashMap(3);

    /* renamed from: e  reason: collision with root package name */
    public Collection<String> f18876e;

    /* renamed from: f  reason: collision with root package name */
    public Class<?> f18877f;

    /* renamed from: g  reason: collision with root package name */
    public int f18878g = f18854h;

    public a(Activity activity) {
        this.f18872a = activity;
    }

    @TargetApi(11)
    public static a d(Fragment fragment) {
        a aVar = new a(fragment.getActivity());
        aVar.f18873b = fragment;
        return aVar;
    }

    public static a e(androidx.fragment.app.Fragment fragment) {
        a aVar = new a(fragment.getActivity());
        aVar.f18874c = fragment;
        return aVar;
    }

    public static List<String> k(String... strArr) {
        return Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public static b l(int i10, int i11, Intent intent) {
        if (i10 == 49374) {
            return m(i11, intent);
        }
        return null;
    }

    public static b m(int i10, Intent intent) {
        if (i10 != -1) {
            return new b(intent);
        }
        String stringExtra = intent.getStringExtra(k.a.f23572u);
        String stringExtra2 = intent.getStringExtra(k.a.f23573v);
        byte[] byteArrayExtra = intent.getByteArrayExtra(k.a.f23575x);
        int intExtra = intent.getIntExtra(k.a.f23576y, Integer.MIN_VALUE);
        return new b(stringExtra, stringExtra2, byteArrayExtra, intExtra == Integer.MIN_VALUE ? null : Integer.valueOf(intExtra), intent.getStringExtra(k.a.f23577z), intent.getStringExtra(k.a.B), intent);
    }

    public final a a(String str, Object obj) {
        this.f18875d.put(str, obj);
        return this;
    }

    public final void b(Intent intent) {
        Serializable serializable;
        for (Map.Entry next : this.f18875d.entrySet()) {
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

    public Intent c() {
        Intent intent = new Intent(this.f18872a, f());
        intent.setAction(k.a.f23552a);
        if (this.f18876e != null) {
            StringBuilder sb2 = new StringBuilder();
            for (String next : this.f18876e) {
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

    public Class<?> f() {
        if (this.f18877f == null) {
            this.f18877f = g();
        }
        return this.f18877f;
    }

    public Class<?> g() {
        return CaptureActivity.class;
    }

    public Map<String, ?> h() {
        return this.f18875d;
    }

    public final void i() {
        z(c(), this.f18878g);
    }

    public final void j(Collection<String> collection) {
        r(collection);
        i();
    }

    public a n(boolean z10) {
        a(k.a.f23565n, Boolean.valueOf(z10));
        return this;
    }

    public a o(boolean z10) {
        a(k.a.f23564m, Boolean.valueOf(z10));
        return this;
    }

    public a p(int i10) {
        if (i10 >= 0) {
            a(k.a.f23561j, Integer.valueOf(i10));
        }
        return this;
    }

    public a q(Class<?> cls) {
        this.f18877f = cls;
        return this;
    }

    public a r(Collection<String> collection) {
        this.f18876e = collection;
        return this;
    }

    public a s(String... strArr) {
        this.f18876e = Arrays.asList(strArr);
        return this;
    }

    public a t(boolean z10) {
        a(k.a.f23570s, Boolean.valueOf(z10));
        return this;
    }

    public final a u(String str) {
        if (str != null) {
            a(k.a.f23571t, str);
        }
        return this;
    }

    public a v(int i10) {
        if (i10 <= 0 || i10 > 65535) {
            throw new IllegalArgumentException("requestCode out of range");
        }
        this.f18878g = i10;
        return this;
    }

    public a w(long j10) {
        a(k.a.f23566o, Long.valueOf(j10));
        return this;
    }

    public a x(boolean z10) {
        a(k.a.f23562k, Boolean.valueOf(z10));
        return this;
    }

    public void y(Intent intent) {
        Fragment fragment = this.f18873b;
        if (fragment != null) {
            fragment.startActivity(intent);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f18874c;
        if (fragment2 != null) {
            fragment2.startActivity(intent);
        } else {
            this.f18872a.startActivity(intent);
        }
    }

    public void z(Intent intent, int i10) {
        Fragment fragment = this.f18873b;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i10);
            return;
        }
        androidx.fragment.app.Fragment fragment2 = this.f18874c;
        if (fragment2 != null) {
            fragment2.startActivityForResult(intent, i10);
        } else {
            this.f18872a.startActivityForResult(intent, i10);
        }
    }
}
