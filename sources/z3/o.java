package z3;

import android.graphics.Bitmap;
import android.os.Build;
import d.g1;
import d.o0;
import d.t0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import t4.m;

@t0(19)
public class o implements l {

    /* renamed from: d  reason: collision with root package name */
    public static final int f15834d = 8;

    /* renamed from: e  reason: collision with root package name */
    public static final Bitmap.Config[] f15835e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f15836f;

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f15837g = {Bitmap.Config.RGB_565};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f15838h = {Bitmap.Config.ARGB_4444};

    /* renamed from: i  reason: collision with root package name */
    public static final Bitmap.Config[] f15839i = {Bitmap.Config.ALPHA_8};

    /* renamed from: a  reason: collision with root package name */
    public final c f15840a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final h<b, Bitmap> f15841b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f15842c = new HashMap();

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15843a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15843a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f15843a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f15843a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f15843a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z3.o.a.<clinit>():void");
        }
    }

    @g1
    public static final class b implements m {

        /* renamed from: a  reason: collision with root package name */
        public final c f15844a;

        /* renamed from: b  reason: collision with root package name */
        public int f15845b;

        /* renamed from: c  reason: collision with root package name */
        public Bitmap.Config f15846c;

        public b(c cVar) {
            this.f15844a = cVar;
        }

        @g1
        public b(c cVar, int i10, Bitmap.Config config) {
            this(cVar);
            b(i10, config);
        }

        public void a() {
            this.f15844a.c(this);
        }

        public void b(int i10, Bitmap.Config config) {
            this.f15845b = i10;
            this.f15846c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15845b == bVar.f15845b && m.d(this.f15846c, bVar.f15846c);
        }

        public int hashCode() {
            int i10 = this.f15845b * 31;
            Bitmap.Config config = this.f15846c;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return o.h(this.f15845b, this.f15846c);
        }
    }

    @g1
    public static class c extends d<b> {
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i10, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i10, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f15835e = configArr;
        f15836f = configArr;
    }

    public static String h(int i10, Bitmap.Config config) {
        return "[" + i10 + "](" + config + ")";
    }

    public static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f15836f;
        }
        int i10 = a.f15843a[config.ordinal()];
        if (i10 == 1) {
            return f15835e;
        }
        if (i10 == 2) {
            return f15837g;
        }
        if (i10 == 3) {
            return f15838h;
        }
        if (i10 == 4) {
            return f15839i;
        }
        return new Bitmap.Config[]{config};
    }

    public String a(int i10, int i11, Bitmap.Config config) {
        return h(m.g(i10, i11, config), config);
    }

    public int b(Bitmap bitmap) {
        return m.h(bitmap);
    }

    public String c(Bitmap bitmap) {
        return h(m.h(bitmap), bitmap.getConfig());
    }

    public void d(Bitmap bitmap) {
        b e10 = this.f15840a.e(m.h(bitmap), bitmap.getConfig());
        this.f15841b.d(e10, bitmap);
        NavigableMap<Integer, Integer> j10 = j(bitmap.getConfig());
        Integer num = j10.get(Integer.valueOf(e10.f15845b));
        Integer valueOf = Integer.valueOf(e10.f15845b);
        int i10 = 1;
        if (num != null) {
            i10 = 1 + num.intValue();
        }
        j10.put(valueOf, Integer.valueOf(i10));
    }

    public final void e(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j10 = j(bitmap.getConfig());
        Integer num2 = j10.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            j10.remove(num);
        } else {
            j10.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @o0
    public Bitmap f(int i10, int i11, Bitmap.Config config) {
        b g10 = g(m.g(i10, i11, config), config);
        Bitmap a10 = this.f15841b.a(g10);
        if (a10 != null) {
            e(Integer.valueOf(g10.f15845b), a10);
            a10.reconfigure(i10, i11, config);
        }
        return a10;
    }

    public final b g(int i10, Bitmap.Config config) {
        b e10 = this.f15840a.e(i10, config);
        Bitmap.Config[] i11 = i(config);
        int length = i11.length;
        int i12 = 0;
        while (i12 < length) {
            Bitmap.Config config2 = i11[i12];
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i10));
            if (ceilingKey == null || ceilingKey.intValue() > i10 * 8) {
                i12++;
            } else {
                if (ceilingKey.intValue() == i10) {
                    if (config2 == null) {
                        if (config == null) {
                            return e10;
                        }
                    } else if (config2.equals(config)) {
                        return e10;
                    }
                }
                this.f15840a.c(e10);
                return this.f15840a.e(ceilingKey.intValue(), config2);
            }
        }
        return e10;
    }

    public final NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f15842c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f15842c.put(config, treeMap);
        return treeMap;
    }

    @o0
    public Bitmap removeLast() {
        Bitmap f10 = this.f15841b.f();
        if (f10 != null) {
            e(Integer.valueOf(m.h(f10)), f10);
        }
        return f10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f15841b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry next : this.f15842c.entrySet()) {
            sb2.append(next.getKey());
            sb2.append('[');
            sb2.append(next.getValue());
            sb2.append("], ");
        }
        if (!this.f15842c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
