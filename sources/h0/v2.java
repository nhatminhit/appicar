package h0;

import android.app.RemoteInput;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class v2 {

    /* renamed from: h  reason: collision with root package name */
    public static final String f8743h = "RemoteInput";

    /* renamed from: i  reason: collision with root package name */
    public static final String f8744i = "android.remoteinput.results";

    /* renamed from: j  reason: collision with root package name */
    public static final String f8745j = "android.remoteinput.resultsData";

    /* renamed from: k  reason: collision with root package name */
    public static final String f8746k = "android.remoteinput.dataTypeResultsData";

    /* renamed from: l  reason: collision with root package name */
    public static final String f8747l = "android.remoteinput.resultsSource";

    /* renamed from: m  reason: collision with root package name */
    public static final int f8748m = 0;

    /* renamed from: n  reason: collision with root package name */
    public static final int f8749n = 1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f8750o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f8751p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f8752q = 2;

    /* renamed from: a  reason: collision with root package name */
    public final String f8753a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f8754b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence[] f8755c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f8756d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8757e;

    /* renamed from: f  reason: collision with root package name */
    public final Bundle f8758f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<String> f8759g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f8760a;

        /* renamed from: b  reason: collision with root package name */
        public final Set<String> f8761b = new HashSet();

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f8762c = new Bundle();

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f8763d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence[] f8764e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8765f = true;

        /* renamed from: g  reason: collision with root package name */
        public int f8766g = 0;

        public a(@m0 String str) {
            if (str != null) {
                this.f8760a = str;
                return;
            }
            throw new IllegalArgumentException("Result key can't be null");
        }

        @m0
        public a a(@m0 Bundle bundle) {
            if (bundle != null) {
                this.f8762c.putAll(bundle);
            }
            return this;
        }

        @m0
        public v2 b() {
            return new v2(this.f8760a, this.f8763d, this.f8764e, this.f8765f, this.f8766g, this.f8762c, this.f8761b);
        }

        @m0
        public Bundle c() {
            return this.f8762c;
        }

        @m0
        public a d(@m0 String str, boolean z10) {
            if (z10) {
                this.f8761b.add(str);
            } else {
                this.f8761b.remove(str);
            }
            return this;
        }

        @m0
        public a e(boolean z10) {
            this.f8765f = z10;
            return this;
        }

        @m0
        public a f(@o0 CharSequence[] charSequenceArr) {
            this.f8764e = charSequenceArr;
            return this;
        }

        @m0
        public a g(int i10) {
            this.f8766g = i10;
            return this;
        }

        @m0
        public a h(@o0 CharSequence charSequence) {
            this.f8763d = charSequence;
            return this;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public v2(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z10, int i10, Bundle bundle, Set<String> set) {
        this.f8753a = str;
        this.f8754b = charSequence;
        this.f8755c = charSequenceArr;
        this.f8756d = z10;
        this.f8757e = i10;
        this.f8758f = bundle;
        this.f8759g = set;
        if (k() == 2 && !f()) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static void a(v2 v2Var, Intent intent, Map<String, Uri> map) {
        if (Build.VERSION.SDK_INT >= 26) {
            RemoteInput.addDataResultToIntent(c(v2Var), intent, map);
            return;
        }
        Intent i10 = i(intent);
        if (i10 == null) {
            i10 = new Intent();
        }
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Uri uri = (Uri) next.getValue();
            if (str != null) {
                Bundle bundleExtra = i10.getBundleExtra(l(str));
                if (bundleExtra == null) {
                    bundleExtra = new Bundle();
                }
                bundleExtra.putString(v2Var.o(), uri.toString());
                i10.putExtra(l(str), bundleExtra);
            }
        }
        intent.setClipData(ClipData.newIntent(f8744i, i10));
    }

    public static void b(v2[] v2VarArr, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            RemoteInput.addResultsToIntent(d(v2VarArr), intent, bundle);
            return;
        }
        Bundle p10 = p(intent);
        int q10 = q(intent);
        if (p10 != null) {
            p10.putAll(bundle);
            bundle = p10;
        }
        for (v2 v2Var : v2VarArr) {
            Map<String, Uri> j10 = j(intent, v2Var.o());
            RemoteInput.addResultsToIntent(d(new v2[]{v2Var}), intent, bundle);
            if (j10 != null) {
                a(v2Var, intent, j10);
            }
        }
        s(intent, q10);
    }

    @t0(20)
    public static RemoteInput c(v2 v2Var) {
        Set<String> g10;
        RemoteInput.Builder addExtras = new RemoteInput.Builder(v2Var.o()).setLabel(v2Var.n()).setChoices(v2Var.h()).setAllowFreeFormInput(v2Var.f()).addExtras(v2Var.m());
        if (Build.VERSION.SDK_INT >= 26 && (g10 = v2Var.g()) != null) {
            for (String a10 : g10) {
                RemoteInput.Builder unused = addExtras.setAllowDataType(a10, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RemoteInput.Builder unused2 = addExtras.setEditChoicesBeforeSending(v2Var.k());
        }
        return addExtras.build();
    }

    @t0(20)
    public static RemoteInput[] d(v2[] v2VarArr) {
        if (v2VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[v2VarArr.length];
        for (int i10 = 0; i10 < v2VarArr.length; i10++) {
            remoteInputArr[i10] = c(v2VarArr[i10]);
        }
        return remoteInputArr;
    }

    @t0(20)
    public static v2 e(RemoteInput remoteInput) {
        Set<String> a10;
        a a11 = new a(remoteInput.getResultKey()).h(remoteInput.getLabel()).f(remoteInput.getChoices()).e(remoteInput.getAllowFreeFormInput()).a(remoteInput.getExtras());
        if (Build.VERSION.SDK_INT >= 26 && (a10 = remoteInput.getAllowedDataTypes()) != null) {
            for (String d10 : a10) {
                a11.d(d10, true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            a11.g(remoteInput.getEditChoicesBeforeSending());
        }
        return a11.b();
    }

    @t0(16)
    public static Intent i(Intent intent) {
        ClipData clipData = intent.getClipData();
        if (clipData == null) {
            return null;
        }
        ClipDescription description = clipData.getDescription();
        if (description.hasMimeType("text/vnd.android.intent") && description.getLabel().toString().contentEquals(f8744i)) {
            return clipData.getItemAt(0).getIntent();
        }
        return null;
    }

    public static Map<String, Uri> j(Intent intent, String str) {
        String string;
        if (Build.VERSION.SDK_INT >= 26) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }
        Intent i10 = i(intent);
        if (i10 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : i10.getExtras().keySet()) {
            if (next.startsWith(f8746k)) {
                String substring = next.substring(39);
                if (!substring.isEmpty() && (string = i10.getBundleExtra(next).getString(str)) != null && !string.isEmpty()) {
                    hashMap.put(substring, Uri.parse(string));
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static String l(String str) {
        return f8746k + str;
    }

    public static Bundle p(Intent intent) {
        return RemoteInput.getResultsFromIntent(intent);
    }

    public static int q(@m0 Intent intent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return RemoteInput.getResultsSource(intent);
        }
        Intent i10 = i(intent);
        if (i10 == null) {
            return 0;
        }
        return i10.getExtras().getInt(f8747l, 0);
    }

    public static void s(@m0 Intent intent, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            RemoteInput.setResultsSource(intent, i10);
            return;
        }
        Intent i11 = i(intent);
        if (i11 == null) {
            i11 = new Intent();
        }
        i11.putExtra(f8747l, i10);
        intent.setClipData(ClipData.newIntent(f8744i, i11));
    }

    public boolean f() {
        return this.f8756d;
    }

    public Set<String> g() {
        return this.f8759g;
    }

    public CharSequence[] h() {
        return this.f8755c;
    }

    public int k() {
        return this.f8757e;
    }

    public Bundle m() {
        return this.f8758f;
    }

    public CharSequence n() {
        return this.f8754b;
    }

    public String o() {
        return this.f8753a;
    }

    public boolean r() {
        return !f() && (h() == null || h().length == 0) && g() != null && !g().isEmpty();
    }
}
