package c1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.x0;
import e1.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f4792a = new String[0];

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<b> f4793b = new a();

    public class a implements Comparator<b> {
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            int i10;
            int i11;
            int i12 = bVar.f4796c;
            int i13 = bVar2.f4796c;
            if (i12 < i13) {
                return -1;
            }
            if (i12 <= i13 && (i10 = bVar.f4797d) >= (i11 = bVar2.f4797d)) {
                return i10 > i11 ? -1 : 0;
            }
            return 1;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public URLSpan f4794a;

        /* renamed from: b  reason: collision with root package name */
        public String f4795b;

        /* renamed from: c  reason: collision with root package name */
        public int f4796c;

        /* renamed from: d  reason: collision with root package name */
        public int f4797d;
    }

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public static void a(@m0 TextView textView) {
        if (!(textView.getMovementMethod() instanceof LinkMovementMethod) && textView.getLinksClickable()) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
    }

    public static void b(@m0 TextView textView, @m0 Pattern pattern, @o0 String str) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str);
        } else {
            d(textView, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
    }

    public static void c(@m0 TextView textView, @m0 Pattern pattern, @o0 String str, @o0 Linkify.MatchFilter matchFilter, @o0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
        } else {
            d(textView, pattern, str, (String[]) null, matchFilter, transformFilter);
        }
    }

    @SuppressLint({"NewApi"})
    public static void d(@m0 TextView textView, @m0 Pattern pattern, @o0 String str, @o0 String[] strArr, @o0 Linkify.MatchFilter matchFilter, @o0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
            return;
        }
        SpannableString valueOf = SpannableString.valueOf(textView.getText());
        if (h(valueOf, pattern, str, strArr, matchFilter, transformFilter)) {
            textView.setText(valueOf);
            a(textView);
        }
    }

    public static boolean e(@m0 Spannable spannable, int i10) {
        if (p()) {
            return Linkify.addLinks(spannable, i10);
        }
        if (i10 == 0) {
            return false;
        }
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
            spannable.removeSpan(uRLSpanArr[length]);
        }
        if ((i10 & 4) != 0) {
            Linkify.addLinks(spannable, 4);
        }
        ArrayList arrayList = new ArrayList();
        if ((i10 & 1) != 0) {
            l(arrayList, spannable, l.f6756w, new String[]{"http://", "https://", "rtsp://"}, Linkify.sUrlMatchFilter, (Linkify.TransformFilter) null);
        }
        if ((i10 & 2) != 0) {
            l(arrayList, spannable, l.A, new String[]{w0.d.f14357b}, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
        }
        if ((i10 & 8) != 0) {
            m(arrayList, spannable);
        }
        o(arrayList, spannable);
        if (arrayList.size() == 0) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f4794a == null) {
                j(bVar.f4795b, bVar.f4796c, bVar.f4797d, spannable);
            }
        }
        return true;
    }

    public static boolean f(@m0 Spannable spannable, @m0 Pattern pattern, @o0 String str) {
        return p() ? Linkify.addLinks(spannable, pattern, str) : h(spannable, pattern, str, (String[]) null, (Linkify.MatchFilter) null, (Linkify.TransformFilter) null);
    }

    public static boolean g(@m0 Spannable spannable, @m0 Pattern pattern, @o0 String str, @o0 Linkify.MatchFilter matchFilter, @o0 Linkify.TransformFilter transformFilter) {
        return p() ? Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter) : h(spannable, pattern, str, (String[]) null, matchFilter, transformFilter);
    }

    @SuppressLint({"NewApi"})
    public static boolean h(@m0 Spannable spannable, @m0 Pattern pattern, @o0 String str, @o0 String[] strArr, @o0 Linkify.MatchFilter matchFilter, @o0 Linkify.TransformFilter transformFilter) {
        if (p()) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }
        if (str == null) {
            str = "";
        }
        if (strArr == null || strArr.length < 1) {
            strArr = f4792a;
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = str.toLowerCase(Locale.ROOT);
        int i10 = 0;
        while (i10 < strArr.length) {
            String str2 = strArr[i10];
            i10++;
            strArr2[i10] = str2 == null ? "" : str2.toLowerCase(Locale.ROOT);
        }
        Matcher matcher = pattern.matcher(spannable);
        boolean z10 = false;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter != null ? matchFilter.acceptMatch(spannable, start, end) : true) {
                j(n(matcher.group(0), strArr2, matcher, transformFilter), start, end, spannable);
                z10 = true;
            }
        }
        return z10;
    }

    public static boolean i(@m0 TextView textView, int i10) {
        if (p()) {
            return Linkify.addLinks(textView, i10);
        }
        if (i10 == 0) {
            return false;
        }
        CharSequence text = textView.getText();
        if (!(text instanceof Spannable)) {
            SpannableString valueOf = SpannableString.valueOf(text);
            if (!e(valueOf, i10)) {
                return false;
            }
            a(textView);
            textView.setText(valueOf);
            return true;
        } else if (!e((Spannable) text, i10)) {
            return false;
        } else {
            a(textView);
            return true;
        }
    }

    public static void j(String str, int i10, int i11, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i10, i11, 33);
    }

    public static String k(String str) {
        return Build.VERSION.SDK_INT >= 28 ? WebView.findAddress(str) : a.c(str);
    }

    public static void l(ArrayList<b> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            if (matchFilter == null || matchFilter.acceptMatch(spannable, start, end)) {
                b bVar = new b();
                bVar.f4795b = n(matcher.group(0), strArr, matcher, transformFilter);
                bVar.f4796c = start;
                bVar.f4797d = end;
                arrayList.add(bVar);
            }
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0005 A[LOOP:0: B:1:0x0005->B:14:0x0005, LOOP_START, PHI: r0 r6 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:0:0x0000, B:14:0x0005] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m(java.util.ArrayList<c1.d.b> r5, android.text.Spannable r6) {
        /*
            java.lang.String r6 = r6.toString()
            r0 = 0
        L_0x0005:
            java.lang.String r1 = k(r6)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r1 == 0) goto L_0x0043
            int r2 = r6.indexOf(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            if (r2 >= 0) goto L_0x0012
            goto L_0x0043
        L_0x0012:
            c1.d$b r3 = new c1.d$b     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r1.length()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r4 = r4 + r2
            int r2 = r2 + r0
            r3.f4796c = r2     // Catch:{ UnsupportedOperationException -> 0x0043 }
            int r0 = r0 + r4
            r3.f4797d = r0     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r6 = r6.substring(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r2 = "UTF-8"
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r2)     // Catch:{ UnsupportedEncodingException -> 0x0005 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.<init>()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r4 = "geo:0,0?q="
            r2.append(r4)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r2.append(r1)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            java.lang.String r1 = r2.toString()     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r3.f4795b = r1     // Catch:{ UnsupportedOperationException -> 0x0043 }
            r5.add(r3)     // Catch:{ UnsupportedOperationException -> 0x0043 }
            goto L_0x0005
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.d.m(java.util.ArrayList, android.text.Spannable):void");
    }

    public static String n(@m0 String str, @m0 String[] strArr, Matcher matcher, @o0 Linkify.TransformFilter transformFilter) {
        boolean z10;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= strArr.length) {
                z10 = false;
                break;
            }
            String str2 = strArr[i10];
            if (str.regionMatches(true, 0, str2, 0, str2.length())) {
                String str3 = strArr[i10];
                if (!str.regionMatches(false, 0, str3, 0, str3.length())) {
                    str = strArr[i10] + str.substring(strArr[i10].length());
                }
            } else {
                i10++;
            }
        }
        if (z10 || strArr.length <= 0) {
            return str;
        }
        return strArr[0] + str;
    }

    public static void o(ArrayList<b> arrayList, Spannable spannable) {
        int i10;
        int i11 = 0;
        URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
        for (int i12 = 0; i12 < uRLSpanArr.length; i12++) {
            b bVar = new b();
            URLSpan uRLSpan = uRLSpanArr[i12];
            bVar.f4794a = uRLSpan;
            bVar.f4796c = spannable.getSpanStart(uRLSpan);
            bVar.f4797d = spannable.getSpanEnd(uRLSpanArr[i12]);
            arrayList.add(bVar);
        }
        Collections.sort(arrayList, f4793b);
        int size = arrayList.size();
        while (i11 < size - 1) {
            b bVar2 = arrayList.get(i11);
            int i13 = i11 + 1;
            b bVar3 = arrayList.get(i13);
            int i14 = bVar2.f4796c;
            int i15 = bVar3.f4796c;
            if (i14 <= i15 && (i10 = bVar2.f4797d) > i15) {
                int i16 = bVar3.f4797d;
                int i17 = (i16 > i10 && i10 - i14 <= i16 - i15) ? i10 - i14 < i16 - i15 ? i11 : -1 : i13;
                if (i17 != -1) {
                    URLSpan uRLSpan2 = arrayList.get(i17).f4794a;
                    if (uRLSpan2 != null) {
                        spannable.removeSpan(uRLSpan2);
                    }
                    arrayList.remove(i17);
                    size--;
                }
            }
            i11 = i13;
        }
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
