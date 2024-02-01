package n7;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import b6.c;
import d.o0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import w7.a;

public final class b {
    public static final String A = "information";
    public static final String B = "";
    public static final String C = "id";
    public static final String D = "origin";
    public static final String E = "extent";
    public static final String F = "displayAlign";
    public static final String G = "backgroundColor";
    public static final String H = "fontStyle";
    public static final String I = "fontSize";
    public static final String J = "fontFamily";
    public static final String K = "fontWeight";
    public static final String L = "color";
    public static final String M = "textDecoration";
    public static final String N = "textAlign";
    public static final String O = "linethrough";
    public static final String P = "nolinethrough";
    public static final String Q = "underline";
    public static final String R = "nounderline";
    public static final String S = "italic";
    public static final String T = "bold";
    public static final String U = "left";
    public static final String V = "center";
    public static final String W = "right";
    public static final String X = "start";
    public static final String Y = "end";

    /* renamed from: m  reason: collision with root package name */
    public static final String f10945m = "tt";

    /* renamed from: n  reason: collision with root package name */
    public static final String f10946n = "head";

    /* renamed from: o  reason: collision with root package name */
    public static final String f10947o = "body";

    /* renamed from: p  reason: collision with root package name */
    public static final String f10948p = "div";

    /* renamed from: q  reason: collision with root package name */
    public static final String f10949q = "p";

    /* renamed from: r  reason: collision with root package name */
    public static final String f10950r = "span";

    /* renamed from: s  reason: collision with root package name */
    public static final String f10951s = "br";

    /* renamed from: t  reason: collision with root package name */
    public static final String f10952t = "style";

    /* renamed from: u  reason: collision with root package name */
    public static final String f10953u = "styling";

    /* renamed from: v  reason: collision with root package name */
    public static final String f10954v = "layout";

    /* renamed from: w  reason: collision with root package name */
    public static final String f10955w = "region";

    /* renamed from: x  reason: collision with root package name */
    public static final String f10956x = "metadata";

    /* renamed from: y  reason: collision with root package name */
    public static final String f10957y = "image";

    /* renamed from: z  reason: collision with root package name */
    public static final String f10958z = "data";
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final String f10959a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final String f10960b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10961c;

    /* renamed from: d  reason: collision with root package name */
    public final long f10962d;

    /* renamed from: e  reason: collision with root package name */
    public final long f10963e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public final e f10964f;
    @o0

    /* renamed from: g  reason: collision with root package name */
    public final String[] f10965g;

    /* renamed from: h  reason: collision with root package name */
    public final String f10966h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public final String f10967i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<String, Integer> f10968j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap<String, Integer> f10969k;

    /* renamed from: l  reason: collision with root package name */
    public List<b> f10970l;

    public b(@o0 String str, @o0 String str2, long j10, long j11, @o0 e eVar, @o0 String[] strArr, String str3, @o0 String str4) {
        this.f10959a = str;
        this.f10960b = str2;
        this.f10967i = str4;
        this.f10964f = eVar;
        this.f10965g = strArr;
        this.f10961c = str2 != null;
        this.f10962d = j10;
        this.f10963e = j11;
        this.f10966h = (String) a.g(str3);
        this.f10968j = new HashMap<>();
        this.f10969k = new HashMap<>();
    }

    public static b c(@o0 String str, long j10, long j11, @o0 e eVar, @o0 String[] strArr, String str2, @o0 String str3) {
        return new b(str, (String) null, j10, j11, eVar, strArr, str2, str3);
    }

    public static b d(String str) {
        return new b((String) null, d.b(str), c.f4201b, c.f4201b, (e) null, (String[]) null, "", (String) null);
    }

    public static SpannableStringBuilder k(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    public void a(b bVar) {
        if (this.f10970l == null) {
            this.f10970l = new ArrayList();
        }
        this.f10970l.add(bVar);
    }

    public final void b(Map<String, e> map, SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
        e d10 = d.d(this.f10964f, this.f10965g, map);
        if (d10 != null) {
            d.a(spannableStringBuilder, i10, i11, d10);
        }
    }

    public final SpannableStringBuilder e(SpannableStringBuilder spannableStringBuilder) {
        int i10;
        int i11;
        int length = spannableStringBuilder.length();
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            if (spannableStringBuilder.charAt(i13) == ' ') {
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i15) == ' ') {
                    i15++;
                }
                int i16 = i15 - i14;
                if (i16 > 0) {
                    spannableStringBuilder.delete(i13, i13 + i16);
                    length -= i16;
                }
            }
        }
        if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
            length--;
        }
        int i17 = 0;
        while (true) {
            i10 = length - 1;
            if (i17 >= i10) {
                break;
            }
            if (spannableStringBuilder.charAt(i17) == 10) {
                int i18 = i17 + 1;
                if (spannableStringBuilder.charAt(i18) == ' ') {
                    spannableStringBuilder.delete(i18, i17 + 2);
                    length--;
                }
            }
            i17++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i10) == ' ') {
            spannableStringBuilder.delete(i10, length);
            length--;
        }
        while (true) {
            i11 = length - 1;
            if (i12 >= i11) {
                break;
            }
            if (spannableStringBuilder.charAt(i12) == ' ') {
                int i19 = i12 + 1;
                if (spannableStringBuilder.charAt(i19) == 10) {
                    spannableStringBuilder.delete(i12, i19);
                    length--;
                }
            }
            i12++;
        }
        if (length > 0 && spannableStringBuilder.charAt(i11) == 10) {
            spannableStringBuilder.delete(i11, length);
        }
        return spannableStringBuilder;
    }

    public b f(int i10) {
        List<b> list = this.f10970l;
        if (list != null) {
            return list.get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public int g() {
        List<b> list = this.f10970l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<h7.b> h(long j10, Map<String, e> map, Map<String, c> map2, Map<String, String> map3) {
        long j11 = j10;
        Map<String, c> map4 = map2;
        ArrayList<Pair> arrayList = new ArrayList<>();
        n(j11, this.f10966h, arrayList);
        TreeMap treeMap = new TreeMap();
        p(j10, false, this.f10966h, treeMap);
        o(j11, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                c cVar = map4.get(pair.first);
                arrayList2.add(new h7.b(decodeByteArray, cVar.f10972b, 0, cVar.f10973c, cVar.f10975e, cVar.f10976f, cVar.f10977g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            c cVar2 = map4.get(entry.getKey());
            arrayList2.add(new h7.b((CharSequence) e((SpannableStringBuilder) entry.getValue()), (Layout.Alignment) null, cVar2.f10973c, cVar2.f10974d, cVar2.f10975e, cVar2.f10972b, Integer.MIN_VALUE, cVar2.f10976f, cVar2.f10978h, cVar2.f10979i));
        }
        return arrayList2;
    }

    public final void i(TreeSet<Long> treeSet, boolean z10) {
        boolean equals = "p".equals(this.f10959a);
        boolean equals2 = f10948p.equals(this.f10959a);
        if (z10 || equals || (equals2 && this.f10967i != null)) {
            long j10 = this.f10962d;
            if (j10 != c.f4201b) {
                treeSet.add(Long.valueOf(j10));
            }
            long j11 = this.f10963e;
            if (j11 != c.f4201b) {
                treeSet.add(Long.valueOf(j11));
            }
        }
        if (this.f10970l != null) {
            for (int i10 = 0; i10 < this.f10970l.size(); i10++) {
                this.f10970l.get(i10).i(treeSet, z10 || equals);
            }
        }
    }

    public long[] j() {
        TreeSet treeSet = new TreeSet();
        int i10 = 0;
        i(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = ((Long) it.next()).longValue();
            i10++;
        }
        return jArr;
    }

    public String[] l() {
        return this.f10965g;
    }

    public boolean m(long j10) {
        long j11 = this.f10962d;
        return (j11 == c.f4201b && this.f10963e == c.f4201b) || (j11 <= j10 && this.f10963e == c.f4201b) || ((j11 == c.f4201b && j10 < this.f10963e) || (j11 <= j10 && j10 < this.f10963e));
    }

    public final void n(long j10, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f10966h)) {
            str = this.f10966h;
        }
        if (!m(j10) || !f10948p.equals(this.f10959a) || this.f10967i == null) {
            for (int i10 = 0; i10 < g(); i10++) {
                f(i10).n(j10, str, list);
            }
            return;
        }
        list.add(new Pair(str, this.f10967i));
    }

    public final void o(long j10, Map<String, e> map, Map<String, SpannableStringBuilder> map2) {
        int i10;
        if (m(j10)) {
            Iterator<Map.Entry<String, Integer>> it = this.f10969k.entrySet().iterator();
            while (true) {
                i10 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (this.f10968j.containsKey(str)) {
                    i10 = this.f10968j.get(str).intValue();
                }
                int intValue = ((Integer) next.getValue()).intValue();
                if (i10 != intValue) {
                    b(map, map2.get(str), i10, intValue);
                }
            }
            while (i10 < g()) {
                f(i10).o(j10, map, map2);
                i10++;
            }
        }
    }

    public final void p(long j10, boolean z10, String str, Map<String, SpannableStringBuilder> map) {
        this.f10968j.clear();
        this.f10969k.clear();
        if (!"metadata".equals(this.f10959a)) {
            if (!"".equals(this.f10966h)) {
                str = this.f10966h;
            }
            if (this.f10961c && z10) {
                k(str, map).append(this.f10960b);
            } else if (f10951s.equals(this.f10959a) && z10) {
                k(str, map).append(10);
            } else if (m(j10)) {
                for (Map.Entry next : map.entrySet()) {
                    this.f10968j.put(next.getKey(), Integer.valueOf(((SpannableStringBuilder) next.getValue()).length()));
                }
                boolean equals = "p".equals(this.f10959a);
                for (int i10 = 0; i10 < g(); i10++) {
                    f(i10).p(j10, z10 || equals, str, map);
                }
                if (equals) {
                    d.c(k(str, map));
                }
                for (Map.Entry next2 : map.entrySet()) {
                    this.f10969k.put(next2.getKey(), Integer.valueOf(((SpannableStringBuilder) next2.getValue()).length()));
                }
            }
        }
    }
}
