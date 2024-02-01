package va;

import android.content.Intent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import qa.a;
import va.k;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f23532a = Pattern.compile(",");

    /* renamed from: b  reason: collision with root package name */
    public static final Set<a> f23533b;

    /* renamed from: c  reason: collision with root package name */
    public static final Set<a> f23534c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set<a> f23535d;

    /* renamed from: e  reason: collision with root package name */
    public static final Set<a> f23536e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set<a> f23537f;

    /* renamed from: g  reason: collision with root package name */
    public static final Set<a> f23538g;

    /* renamed from: h  reason: collision with root package name */
    public static final Set<a> f23539h;

    /* renamed from: i  reason: collision with root package name */
    public static final Map<String, Set<a>> f23540i;

    static {
        EnumSet of2 = EnumSet.of(a.QR_CODE);
        f23536e = of2;
        EnumSet of3 = EnumSet.of(a.DATA_MATRIX);
        f23537f = of3;
        EnumSet of4 = EnumSet.of(a.AZTEC);
        f23538g = of4;
        EnumSet of5 = EnumSet.of(a.PDF_417);
        f23539h = of5;
        EnumSet of6 = EnumSet.of(a.UPC_A, new a[]{a.UPC_E, a.EAN_13, a.EAN_8, a.RSS_14, a.RSS_EXPANDED});
        f23533b = of6;
        EnumSet of7 = EnumSet.of(a.CODE_39, a.CODE_93, a.CODE_128, a.ITF, a.CODABAR);
        f23534c = of7;
        EnumSet copyOf = EnumSet.copyOf(of6);
        f23535d = copyOf;
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f23540i = hashMap;
        hashMap.put(k.a.f23555d, copyOf);
        hashMap.put(k.a.f23554c, of6);
        hashMap.put(k.a.f23556e, of2);
        hashMap.put(k.a.f23557f, of3);
        hashMap.put(k.a.f23558g, of4);
        hashMap.put(k.a.f23559h, of5);
    }

    public static Set<a> a(Intent intent) {
        String stringExtra = intent.getStringExtra(k.a.f23560i);
        return b(stringExtra != null ? Arrays.asList(f23532a.split(stringExtra)) : null, intent.getStringExtra(k.a.f23553b));
    }

    public static Set<a> b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(a.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(a.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f23540i.get(str);
        }
        return null;
    }
}
