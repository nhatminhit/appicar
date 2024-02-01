package b1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import d.e0;
import d.f1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import d.z;
import e1.i;
import e1.n;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import x0.b0;

public class l implements Spannable {
    public static final char S = '\n';
    public static final Object T = new Object();
    @z("sLock")
    @m0
    public static Executor U;
    @m0
    public final Spannable O;
    @m0
    public final a P;
    @m0
    public final int[] Q;
    @o0
    public final PrecomputedText R;

    public static final class a {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f4078a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final TextDirectionHeuristic f4079b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4080c;

        /* renamed from: d  reason: collision with root package name */
        public final int f4081d;

        /* renamed from: e  reason: collision with root package name */
        public final PrecomputedText.Params f4082e;

        /* renamed from: b1.l$a$a  reason: collision with other inner class name */
        public static class C0058a {
            @m0

            /* renamed from: a  reason: collision with root package name */
            public final TextPaint f4083a;

            /* renamed from: b  reason: collision with root package name */
            public TextDirectionHeuristic f4084b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            /* renamed from: c  reason: collision with root package name */
            public int f4085c = 1;

            /* renamed from: d  reason: collision with root package name */
            public int f4086d = 1;

            public C0058a(@m0 TextPaint textPaint) {
                this.f4083a = textPaint;
            }

            @m0
            public a a() {
                return new a(this.f4083a, this.f4084b, this.f4085c, this.f4086d);
            }

            @t0(23)
            public C0058a b(int i10) {
                this.f4085c = i10;
                return this;
            }

            @t0(23)
            public C0058a c(int i10) {
                this.f4086d = i10;
                return this;
            }

            @t0(18)
            public C0058a d(@m0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f4084b = textDirectionHeuristic;
                return this;
            }
        }

        @t0(28)
        public a(@m0 PrecomputedText.Params params) {
            this.f4078a = params.getTextPaint();
            this.f4079b = params.getTextDirection();
            this.f4080c = params.getBreakStrategy();
            this.f4081d = params.getHyphenationFrequency();
            this.f4082e = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        @SuppressLint({"NewApi"})
        public a(@m0 TextPaint textPaint, @m0 TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
            this.f4082e = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i10).setHyphenationFrequency(i11).setTextDirection(textDirectionHeuristic).build() : null;
            this.f4078a = textPaint;
            this.f4079b = textDirectionHeuristic;
            this.f4080c = i10;
            this.f4081d = i11;
        }

        @x0({x0.a.Q})
        public boolean a(@m0 a aVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (this.f4080c != aVar.b() || this.f4081d != aVar.c() || this.f4078a.getTextSize() != aVar.e().getTextSize() || this.f4078a.getTextScaleX() != aVar.e().getTextScaleX() || this.f4078a.getTextSkewX() != aVar.e().getTextSkewX() || this.f4078a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.f4078a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) || this.f4078a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i10 >= 24) {
                if (!this.f4078a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (!this.f4078a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.f4078a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f4078a.getTypeface().equals(aVar.e().getTypeface());
        }

        @t0(23)
        public int b() {
            return this.f4080c;
        }

        @t0(23)
        public int c() {
            return this.f4081d;
        }

        @t0(18)
        @o0
        public TextDirectionHeuristic d() {
            return this.f4079b;
        }

        @m0
        public TextPaint e() {
            return this.f4078a;
        }

        public boolean equals(@o0 Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f4079b == aVar.d();
        }

        public int hashCode() {
            if (Build.VERSION.SDK_INT >= 24) {
                return i.b(Float.valueOf(this.f4078a.getTextSize()), Float.valueOf(this.f4078a.getTextScaleX()), Float.valueOf(this.f4078a.getTextSkewX()), Float.valueOf(this.f4078a.getLetterSpacing()), Integer.valueOf(this.f4078a.getFlags()), this.f4078a.getTextLocales(), this.f4078a.getTypeface(), Boolean.valueOf(this.f4078a.isElegantTextHeight()), this.f4079b, Integer.valueOf(this.f4080c), Integer.valueOf(this.f4081d));
            }
            return i.b(Float.valueOf(this.f4078a.getTextSize()), Float.valueOf(this.f4078a.getTextScaleX()), Float.valueOf(this.f4078a.getTextSkewX()), Float.valueOf(this.f4078a.getLetterSpacing()), Integer.valueOf(this.f4078a.getFlags()), this.f4078a.getTextLocale(), this.f4078a.getTypeface(), Boolean.valueOf(this.f4078a.isElegantTextHeight()), this.f4079b, Integer.valueOf(this.f4080c), Integer.valueOf(this.f4081d));
        }

        public String toString() {
            StringBuilder sb2;
            Object textLocale;
            StringBuilder sb3 = new StringBuilder(p7.a.f11638i);
            sb3.append("textSize=" + this.f4078a.getTextSize());
            sb3.append(", textScaleX=" + this.f4078a.getTextScaleX());
            sb3.append(", textSkewX=" + this.f4078a.getTextSkewX());
            int i10 = Build.VERSION.SDK_INT;
            sb3.append(", letterSpacing=" + this.f4078a.getLetterSpacing());
            sb3.append(", elegantTextHeight=" + this.f4078a.isElegantTextHeight());
            if (i10 >= 24) {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocale = this.f4078a.getTextLocales();
            } else {
                sb2 = new StringBuilder();
                sb2.append(", textLocale=");
                textLocale = this.f4078a.getTextLocale();
            }
            sb2.append(textLocale);
            sb3.append(sb2.toString());
            sb3.append(", typeface=" + this.f4078a.getTypeface());
            if (i10 >= 26) {
                sb3.append(", variationSettings=" + this.f4078a.getFontVariationSettings());
            }
            sb3.append(", textDir=" + this.f4079b);
            sb3.append(", breakStrategy=" + this.f4080c);
            sb3.append(", hyphenationFrequency=" + this.f4081d);
            sb3.append(p7.a.f11639j);
            return sb3.toString();
        }
    }

    public static class b extends FutureTask<l> {

        public static class a implements Callable<l> {

            /* renamed from: a  reason: collision with root package name */
            public a f4087a;

            /* renamed from: b  reason: collision with root package name */
            public CharSequence f4088b;

            public a(@m0 a aVar, @m0 CharSequence charSequence) {
                this.f4087a = aVar;
                this.f4088b = charSequence;
            }

            /* renamed from: a */
            public l call() throws Exception {
                return l.a(this.f4088b, this.f4087a);
            }
        }

        public b(@m0 a aVar, @m0 CharSequence charSequence) {
            super(new a(aVar, charSequence));
        }
    }

    @t0(28)
    public l(@m0 PrecomputedText precomputedText, @m0 a aVar) {
        this.O = precomputedText;
        this.P = aVar;
        this.Q = null;
        this.R = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public l(@m0 CharSequence charSequence, @m0 a aVar, @m0 int[] iArr) {
        this.O = new SpannableString(charSequence);
        this.P = aVar;
        this.Q = iArr;
        this.R = null;
    }

    @SuppressLint({"NewApi"})
    public static l a(@m0 CharSequence charSequence, @m0 a aVar) {
        PrecomputedText.Params params;
        n.g(charSequence);
        n.g(aVar);
        try {
            b0.b("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = aVar.f4082e) != null) {
                return new l(PrecomputedText.create(charSequence, params), aVar);
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i10 = 0;
            while (i10 < length) {
                int indexOf = TextUtils.indexOf(charSequence, 10, i10, length);
                i10 = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i10));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = ((Integer) arrayList.get(i11)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), aVar.e(), Integer.MAX_VALUE).setBreakStrategy(aVar.b()).setHyphenationFrequency(aVar.c()).setTextDirection(aVar.d()).build();
            l lVar = new l(charSequence, aVar, iArr);
            b0.d();
            return lVar;
        } finally {
            b0.d();
        }
    }

    @f1
    public static Future<l> g(@m0 CharSequence charSequence, @m0 a aVar, @o0 Executor executor) {
        b bVar = new b(aVar, charSequence);
        if (executor == null) {
            synchronized (T) {
                if (U == null) {
                    U = Executors.newFixedThreadPool(1);
                }
                executor = U;
            }
        }
        executor.execute(bVar);
        return bVar;
    }

    @SuppressLint({"NewApi"})
    @e0(from = 0)
    public int b() {
        return Build.VERSION.SDK_INT >= 29 ? this.R.getParagraphCount() : this.Q.length;
    }

    @SuppressLint({"NewApi"})
    @e0(from = 0)
    public int c(@e0(from = 0) int i10) {
        n.c(i10, 0, b(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.R.getParagraphEnd(i10) : this.Q[i10];
    }

    public char charAt(int i10) {
        return this.O.charAt(i10);
    }

    @SuppressLint({"NewApi"})
    @e0(from = 0)
    public int d(@e0(from = 0) int i10) {
        n.c(i10, 0, b(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.R.getParagraphStart(i10);
        }
        if (i10 == 0) {
            return 0;
        }
        return this.Q[i10 - 1];
    }

    @m0
    public a e() {
        return this.P;
    }

    @t0(28)
    @x0({x0.a.Q})
    @o0
    public PrecomputedText f() {
        Spannable spannable = this.O;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public int getSpanEnd(Object obj) {
        return this.O.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.O.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.O.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.R.getSpans(i10, i11, cls) : this.O.getSpans(i10, i11, cls);
    }

    public int length() {
        return this.O.length();
    }

    public int nextSpanTransition(int i10, int i11, Class cls) {
        return this.O.nextSpanTransition(i10, i11, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.R.removeSpan(obj);
        } else {
            this.O.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i10, int i11, int i12) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.R.setSpan(obj, i10, i11, i12);
        } else {
            this.O.setSpan(obj, i10, i11, i12);
        }
    }

    public CharSequence subSequence(int i10, int i11) {
        return this.O.subSequence(i10, i11);
    }

    @m0
    public String toString() {
        return this.O.toString();
    }
}
