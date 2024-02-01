package j0;

import android.annotation.SuppressLint;
import android.app.Person;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import d.g1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import h0.l2;
import i0.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import w0.i;

public class o {
    public static final String A = "extraPersonCount";
    public static final String B = "extraPerson_";
    public static final String C = "extraLocusId";
    public static final String D = "extraLongLived";
    public static final String E = "extraSliceUri";

    /* renamed from: a  reason: collision with root package name */
    public Context f9327a;

    /* renamed from: b  reason: collision with root package name */
    public String f9328b;

    /* renamed from: c  reason: collision with root package name */
    public String f9329c;

    /* renamed from: d  reason: collision with root package name */
    public Intent[] f9330d;

    /* renamed from: e  reason: collision with root package name */
    public ComponentName f9331e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f9332f;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f9333g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f9334h;

    /* renamed from: i  reason: collision with root package name */
    public IconCompat f9335i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9336j;

    /* renamed from: k  reason: collision with root package name */
    public l2[] f9337k;

    /* renamed from: l  reason: collision with root package name */
    public Set<String> f9338l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public m f9339m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f9340n;

    /* renamed from: o  reason: collision with root package name */
    public int f9341o;

    /* renamed from: p  reason: collision with root package name */
    public PersistableBundle f9342p;

    /* renamed from: q  reason: collision with root package name */
    public long f9343q;

    /* renamed from: r  reason: collision with root package name */
    public UserHandle f9344r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9345s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9346t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9347u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9348v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9349w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f9350x = true;

    /* renamed from: y  reason: collision with root package name */
    public boolean f9351y;

    /* renamed from: z  reason: collision with root package name */
    public int f9352z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final o f9353a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9354b;

        /* renamed from: c  reason: collision with root package name */
        public Set<String> f9355c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, Map<String, List<String>>> f9356d;

        /* renamed from: e  reason: collision with root package name */
        public Uri f9357e;

        @t0(25)
        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public a(@m0 Context context, @m0 ShortcutInfo shortcutInfo) {
            o oVar = new o();
            this.f9353a = oVar;
            oVar.f9327a = context;
            oVar.f9328b = shortcutInfo.getId();
            oVar.f9329c = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            oVar.f9330d = (Intent[]) Arrays.copyOf(intents, intents.length);
            oVar.f9331e = shortcutInfo.getActivity();
            oVar.f9332f = shortcutInfo.getShortLabel();
            oVar.f9333g = shortcutInfo.getLongLabel();
            oVar.f9334h = shortcutInfo.getDisabledMessage();
            int i10 = Build.VERSION.SDK_INT;
            oVar.f9352z = i10 >= 28 ? shortcutInfo.getDisabledReason() : shortcutInfo.isEnabled() ? 0 : 3;
            oVar.f9338l = shortcutInfo.getCategories();
            oVar.f9337k = o.t(shortcutInfo.getExtras());
            oVar.f9344r = shortcutInfo.getUserHandle();
            oVar.f9343q = shortcutInfo.getLastChangedTimestamp();
            if (i10 >= 30) {
                oVar.f9345s = shortcutInfo.isCached();
            }
            oVar.f9346t = shortcutInfo.isDynamic();
            oVar.f9347u = shortcutInfo.isPinned();
            oVar.f9348v = shortcutInfo.isDeclaredInManifest();
            oVar.f9349w = shortcutInfo.isImmutable();
            oVar.f9350x = shortcutInfo.isEnabled();
            oVar.f9351y = shortcutInfo.hasKeyFieldsOnly();
            oVar.f9339m = o.o(shortcutInfo);
            oVar.f9341o = shortcutInfo.getRank();
            oVar.f9342p = shortcutInfo.getExtras();
        }

        public a(@m0 Context context, @m0 String str) {
            o oVar = new o();
            this.f9353a = oVar;
            oVar.f9327a = context;
            oVar.f9328b = str;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public a(@m0 o oVar) {
            o oVar2 = new o();
            this.f9353a = oVar2;
            oVar2.f9327a = oVar.f9327a;
            oVar2.f9328b = oVar.f9328b;
            oVar2.f9329c = oVar.f9329c;
            Intent[] intentArr = oVar.f9330d;
            oVar2.f9330d = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            oVar2.f9331e = oVar.f9331e;
            oVar2.f9332f = oVar.f9332f;
            oVar2.f9333g = oVar.f9333g;
            oVar2.f9334h = oVar.f9334h;
            oVar2.f9352z = oVar.f9352z;
            oVar2.f9335i = oVar.f9335i;
            oVar2.f9336j = oVar.f9336j;
            oVar2.f9344r = oVar.f9344r;
            oVar2.f9343q = oVar.f9343q;
            oVar2.f9345s = oVar.f9345s;
            oVar2.f9346t = oVar.f9346t;
            oVar2.f9347u = oVar.f9347u;
            oVar2.f9348v = oVar.f9348v;
            oVar2.f9349w = oVar.f9349w;
            oVar2.f9350x = oVar.f9350x;
            oVar2.f9339m = oVar.f9339m;
            oVar2.f9340n = oVar.f9340n;
            oVar2.f9351y = oVar.f9351y;
            oVar2.f9341o = oVar.f9341o;
            l2[] l2VarArr = oVar.f9337k;
            if (l2VarArr != null) {
                oVar2.f9337k = (l2[]) Arrays.copyOf(l2VarArr, l2VarArr.length);
            }
            if (oVar.f9338l != null) {
                oVar2.f9338l = new HashSet(oVar.f9338l);
            }
            PersistableBundle persistableBundle = oVar.f9342p;
            if (persistableBundle != null) {
                oVar2.f9342p = persistableBundle;
            }
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @m0
        public a a(@m0 String str) {
            if (this.f9355c == null) {
                this.f9355c = new HashSet();
            }
            this.f9355c.add(str);
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @m0
        public a b(@m0 String str, @m0 String str2, @m0 List<String> list) {
            a(str);
            if (!list.isEmpty()) {
                if (this.f9356d == null) {
                    this.f9356d = new HashMap();
                }
                if (this.f9356d.get(str) == null) {
                    this.f9356d.put(str, new HashMap());
                }
                this.f9356d.get(str).put(str2, list);
            }
            return this;
        }

        @SuppressLint({"UnsafeNewApiCall"})
        @m0
        public o c() {
            if (!TextUtils.isEmpty(this.f9353a.f9332f)) {
                o oVar = this.f9353a;
                Intent[] intentArr = oVar.f9330d;
                if (intentArr == null || intentArr.length == 0) {
                    throw new IllegalArgumentException("Shortcut must have an intent");
                }
                if (this.f9354b) {
                    if (oVar.f9339m == null) {
                        oVar.f9339m = new m(oVar.f9328b);
                    }
                    this.f9353a.f9340n = true;
                }
                if (this.f9355c != null) {
                    o oVar2 = this.f9353a;
                    if (oVar2.f9338l == null) {
                        oVar2.f9338l = new HashSet();
                    }
                    this.f9353a.f9338l.addAll(this.f9355c);
                }
                if (this.f9356d != null) {
                    o oVar3 = this.f9353a;
                    if (oVar3.f9342p == null) {
                        oVar3.f9342p = new PersistableBundle();
                    }
                    for (String next : this.f9356d.keySet()) {
                        Map map = this.f9356d.get(next);
                        this.f9353a.f9342p.putStringArray(next, (String[]) map.keySet().toArray(new String[0]));
                        for (String str : map.keySet()) {
                            List list = (List) map.get(str);
                            PersistableBundle persistableBundle = this.f9353a.f9342p;
                            persistableBundle.putStringArray(next + "/" + str, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                        }
                    }
                }
                if (this.f9357e != null) {
                    o oVar4 = this.f9353a;
                    if (oVar4.f9342p == null) {
                        oVar4.f9342p = new PersistableBundle();
                    }
                    this.f9353a.f9342p.putString(o.E, i.a(this.f9357e));
                }
                return this.f9353a;
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        @m0
        public a d(@m0 ComponentName componentName) {
            this.f9353a.f9331e = componentName;
            return this;
        }

        @m0
        public a e() {
            this.f9353a.f9336j = true;
            return this;
        }

        @m0
        public a f(@m0 Set<String> set) {
            this.f9353a.f9338l = set;
            return this;
        }

        @m0
        public a g(@m0 CharSequence charSequence) {
            this.f9353a.f9334h = charSequence;
            return this;
        }

        @m0
        public a h(@m0 PersistableBundle persistableBundle) {
            this.f9353a.f9342p = persistableBundle;
            return this;
        }

        @m0
        public a i(IconCompat iconCompat) {
            this.f9353a.f9335i = iconCompat;
            return this;
        }

        @m0
        public a j(@m0 Intent intent) {
            return k(new Intent[]{intent});
        }

        @m0
        public a k(@m0 Intent[] intentArr) {
            this.f9353a.f9330d = intentArr;
            return this;
        }

        @m0
        public a l() {
            this.f9354b = true;
            return this;
        }

        @m0
        public a m(@o0 m mVar) {
            this.f9353a.f9339m = mVar;
            return this;
        }

        @m0
        public a n(@m0 CharSequence charSequence) {
            this.f9353a.f9333g = charSequence;
            return this;
        }

        @Deprecated
        @m0
        public a o() {
            this.f9353a.f9340n = true;
            return this;
        }

        @m0
        public a p(boolean z10) {
            this.f9353a.f9340n = z10;
            return this;
        }

        @m0
        public a q(@m0 l2 l2Var) {
            return r(new l2[]{l2Var});
        }

        @m0
        public a r(@m0 l2[] l2VarArr) {
            this.f9353a.f9337k = l2VarArr;
            return this;
        }

        @m0
        public a s(int i10) {
            this.f9353a.f9341o = i10;
            return this;
        }

        @m0
        public a t(@m0 CharSequence charSequence) {
            this.f9353a.f9332f = charSequence;
            return this;
        }

        @SuppressLint({"MissingGetterMatchingBuilder"})
        @m0
        public a u(@m0 Uri uri) {
            this.f9357e = uri;
            return this;
        }
    }

    @t0(25)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static List<o> c(@m0 Context context, @m0 List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfo aVar : list) {
            arrayList.add(new a(context, aVar).c());
        }
        return arrayList;
    }

    @t0(25)
    @o0
    public static m o(@m0 ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT < 29) {
            return p(shortcutInfo.getExtras());
        }
        if (shortcutInfo.getLocusId() == null) {
            return null;
        }
        return m.d(shortcutInfo.getLocusId());
    }

    @t0(25)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static m p(@o0 PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(C)) == null) {
            return null;
        }
        return new m(string);
    }

    @t0(25)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @g1
    public static boolean r(@o0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(D)) {
            return false;
        }
        return persistableBundle.getBoolean(D);
    }

    @t0(25)
    @g1
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static l2[] t(@m0 PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(A)) {
            return null;
        }
        int i10 = persistableBundle.getInt(A);
        l2[] l2VarArr = new l2[i10];
        int i11 = 0;
        while (i11 < i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(B);
            int i12 = i11 + 1;
            sb2.append(i12);
            l2VarArr[i11] = l2.c(persistableBundle.getPersistableBundle(sb2.toString()));
            i11 = i12;
        }
        return l2VarArr;
    }

    public boolean A() {
        return this.f9346t;
    }

    public boolean B() {
        return this.f9350x;
    }

    public boolean C() {
        return this.f9349w;
    }

    public boolean D() {
        return this.f9347u;
    }

    @t0(25)
    public ShortcutInfo E() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.f9327a, this.f9328b).setShortLabel(this.f9332f).setIntents(this.f9330d);
        IconCompat iconCompat = this.f9335i;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.R(this.f9327a));
        }
        if (!TextUtils.isEmpty(this.f9333g)) {
            intents.setLongLabel(this.f9333g);
        }
        if (!TextUtils.isEmpty(this.f9334h)) {
            intents.setDisabledMessage(this.f9334h);
        }
        ComponentName componentName = this.f9331e;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.f9338l;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.f9341o);
        PersistableBundle persistableBundle = this.f9342p;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            l2[] l2VarArr = this.f9337k;
            if (l2VarArr != null && l2VarArr.length > 0) {
                int length = l2VarArr.length;
                Person[] personArr = new Person[length];
                for (int i10 = 0; i10 < length; i10++) {
                    personArr[i10] = this.f9337k[i10].k();
                }
                ShortcutInfo.Builder unused = intents.setPersons(personArr);
            }
            m mVar = this.f9339m;
            if (mVar != null) {
                ShortcutInfo.Builder unused2 = intents.setLocusId(mVar.c());
            }
            ShortcutInfo.Builder unused3 = intents.setLongLived(this.f9340n);
        } else {
            intents.setExtras(b());
        }
        return intents.build();
    }

    public Intent a(Intent intent) {
        Intent[] intentArr = this.f9330d;
        intent.putExtra("android.intent.extra.shortcut.INTENT", intentArr[intentArr.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.f9332f.toString());
        if (this.f9335i != null) {
            Drawable drawable = null;
            if (this.f9336j) {
                PackageManager packageManager = this.f9327a.getPackageManager();
                ComponentName componentName = this.f9331e;
                if (componentName != null) {
                    try {
                        drawable = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (drawable == null) {
                    drawable = this.f9327a.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.f9335i.d(intent, drawable, this.f9327a);
        }
        return intent;
    }

    @t0(22)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public final PersistableBundle b() {
        if (this.f9342p == null) {
            this.f9342p = new PersistableBundle();
        }
        l2[] l2VarArr = this.f9337k;
        if (l2VarArr != null && l2VarArr.length > 0) {
            this.f9342p.putInt(A, l2VarArr.length);
            int i10 = 0;
            while (i10 < this.f9337k.length) {
                PersistableBundle persistableBundle = this.f9342p;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(B);
                int i11 = i10 + 1;
                sb2.append(i11);
                persistableBundle.putPersistableBundle(sb2.toString(), this.f9337k[i10].n());
                i10 = i11;
            }
        }
        m mVar = this.f9339m;
        if (mVar != null) {
            this.f9342p.putString(C, mVar.a());
        }
        this.f9342p.putBoolean(D, this.f9340n);
        return this.f9342p;
    }

    @o0
    public ComponentName d() {
        return this.f9331e;
    }

    @o0
    public Set<String> e() {
        return this.f9338l;
    }

    @o0
    public CharSequence f() {
        return this.f9334h;
    }

    public int g() {
        return this.f9352z;
    }

    @o0
    public PersistableBundle h() {
        return this.f9342p;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public IconCompat i() {
        return this.f9335i;
    }

    @m0
    public String j() {
        return this.f9328b;
    }

    @m0
    public Intent k() {
        Intent[] intentArr = this.f9330d;
        return intentArr[intentArr.length - 1];
    }

    @m0
    public Intent[] l() {
        Intent[] intentArr = this.f9330d;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    public long m() {
        return this.f9343q;
    }

    @o0
    public m n() {
        return this.f9339m;
    }

    @o0
    public CharSequence q() {
        return this.f9333g;
    }

    @m0
    public String s() {
        return this.f9329c;
    }

    public int u() {
        return this.f9341o;
    }

    @m0
    public CharSequence v() {
        return this.f9332f;
    }

    @o0
    public UserHandle w() {
        return this.f9344r;
    }

    public boolean x() {
        return this.f9351y;
    }

    public boolean y() {
        return this.f9345s;
    }

    public boolean z() {
        return this.f9348v;
    }
}
