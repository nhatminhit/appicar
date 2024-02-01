package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import b1.l;
import d.b1;
import d.e0;
import d.m0;
import d.o0;
import d.r0;
import d.t0;
import d.u;
import d.x0;
import e1.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static final String f2303a = "TextViewCompat";

    /* renamed from: b  reason: collision with root package name */
    public static final int f2304b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f2305c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static Field f2306d = null;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f2307e = false;

    /* renamed from: f  reason: collision with root package name */
    public static Field f2308f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f2309g = false;

    /* renamed from: h  reason: collision with root package name */
    public static Field f2310h = null;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f2311i = false;

    /* renamed from: j  reason: collision with root package name */
    public static Field f2312j = null;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f2313k = false;

    /* renamed from: l  reason: collision with root package name */
    public static final int f2314l = 1;

    @x0({x0.a.Q})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @t0(26)
    public static class b implements ActionMode.Callback {

        /* renamed from: g  reason: collision with root package name */
        public static final int f2315g = 100;

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f2316a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f2317b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f2318c;

        /* renamed from: d  reason: collision with root package name */
        public Method f2319d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2320e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2321f = false;

        public b(ActionMode.Callback callback, TextView textView) {
            this.f2316a = callback;
            this.f2317b = textView;
        }

        public final Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(a(), 0)) {
                if (f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        @m0
        public ActionMode.Callback d() {
            return this.f2316a;
        }

        public final boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        public final void g(Menu menu) {
            Method method;
            Context context = this.f2317b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2321f) {
                this.f2321f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2318c = cls;
                    this.f2319d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f2320e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2318c = null;
                    this.f2319d = null;
                    this.f2320e = false;
                }
            }
            try {
                if (!this.f2320e || !this.f2318c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f2319d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List<ResolveInfo> c10 = c(context, packageManager);
                for (int i10 = 0; i10 < c10.size(); i10++) {
                    ResolveInfo resolveInfo = c10.get(i10);
                    menu.add(0, 0, i10 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f2317b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2316a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2316a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2316a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f2316a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static void A(@m0 TextView textView, @r0 @e0(from = 0) int i10) {
        n.d(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void B(@m0 TextView textView, @r0 @e0(from = 0) int i10) {
        n.d(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void C(@m0 TextView textView, @r0 @e0(from = 0) int i10) {
        n.d(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing((float) (i10 - fontMetricsInt), 1.0f);
        }
    }

    public static void D(@m0 TextView textView, @m0 l lVar) {
        Spanned spanned;
        if (Build.VERSION.SDK_INT >= 29) {
            spanned = lVar.f();
        } else {
            boolean a10 = o(textView).a(lVar.e());
            spanned = lVar;
            if (!a10) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(spanned);
    }

    public static void E(@m0 TextView textView, @b1 int i10) {
        textView.setTextAppearance(i10);
    }

    public static void F(@m0 TextView textView, @m0 l.a aVar) {
        textView.setTextDirection(m(aVar.d()));
        textView.getPaint().set(aVar.e());
        textView.setBreakStrategy(aVar.b());
        textView.setHyphenationFrequency(aVar.c());
    }

    @x0({x0.a.Q})
    @o0
    public static ActionMode.Callback G(@o0 ActionMode.Callback callback) {
        return (!(callback instanceof b) || Build.VERSION.SDK_INT < 26) ? callback : ((b) callback).d();
    }

    @x0({x0.a.Q})
    @o0
    public static ActionMode.Callback H(@m0 TextView textView, @o0 ActionMode.Callback callback) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof b) || callback == null) ? callback : new b(callback, textView);
    }

    public static int a(@m0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMaxTextSize();
        }
        if (textView instanceof b) {
            return ((b) textView).getAutoSizeMaxTextSize();
        }
        return -1;
    }

    public static int b(@m0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeMinTextSize();
        }
        if (textView instanceof b) {
            return ((b) textView).getAutoSizeMinTextSize();
        }
        return -1;
    }

    public static int c(@m0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeStepGranularity();
        }
        if (textView instanceof b) {
            return ((b) textView).getAutoSizeStepGranularity();
        }
        return -1;
    }

    @m0
    public static int[] d(@m0 TextView textView) {
        return Build.VERSION.SDK_INT >= 27 ? textView.getAutoSizeTextAvailableSizes() : textView instanceof b ? ((b) textView).getAutoSizeTextAvailableSizes() : new int[0];
    }

    public static int e(@m0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 27) {
            return textView.getAutoSizeTextType();
        }
        if (textView instanceof b) {
            return ((b) textView).getAutoSizeTextType();
        }
        return 0;
    }

    @o0
    public static ColorStateList f(@m0 TextView textView) {
        n.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintList();
        }
        if (textView instanceof d0) {
            return ((d0) textView).getSupportCompoundDrawablesTintList();
        }
        return null;
    }

    @o0
    public static PorterDuff.Mode g(@m0 TextView textView) {
        n.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            return textView.getCompoundDrawableTintMode();
        }
        if (textView instanceof d0) {
            return ((d0) textView).getSupportCompoundDrawablesTintMode();
        }
        return null;
    }

    @m0
    public static Drawable[] h(@m0 TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int i(@m0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int j(@m0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int k(@m0 TextView textView) {
        return textView.getMaxLines();
    }

    public static int l(@m0 TextView textView) {
        return textView.getMinLines();
    }

    @t0(18)
    public static int m(@m0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    @t0(18)
    public static TextDirectionHeuristic n(@m0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z10 = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    return z10 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
    }

    @m0
    public static l.a o(@m0 TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new l.a(textView.getTextMetricsParams());
        }
        l.a.C0058a aVar = new l.a.C0058a(new TextPaint(textView.getPaint()));
        aVar.b(textView.getBreakStrategy());
        aVar.c(textView.getHyphenationFrequency());
        aVar.d(n(textView));
        return aVar.a();
    }

    public static Field p(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not retrieve ");
            sb2.append(str);
            sb2.append(" field.");
            return field;
        }
    }

    public static int q(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not retrieve value of ");
            sb2.append(field.getName());
            sb2.append(" field.");
            return -1;
        }
    }

    public static void r(@m0 TextView textView, int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        } else if (textView instanceof b) {
            ((b) textView).setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }
    }

    public static void s(@m0 TextView textView, @m0 int[] iArr, int i10) throws IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        } else if (textView instanceof b) {
            ((b) textView).setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }
    }

    public static void t(@m0 TextView textView, int i10) {
        if (Build.VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeWithDefaults(i10);
        } else if (textView instanceof b) {
            ((b) textView).setAutoSizeTextTypeWithDefaults(i10);
        }
    }

    public static void u(@m0 TextView textView, @o0 ColorStateList colorStateList) {
        n.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof d0) {
            ((d0) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void v(@m0 TextView textView, @o0 PorterDuff.Mode mode) {
        n.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof d0) {
            ((d0) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void w(@m0 TextView textView, @o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void x(@m0 TextView textView, @u int i10, @u int i11, @u int i12, @u int i13) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i10, i11, i12, i13);
    }

    public static void y(@m0 TextView textView, @o0 Drawable drawable, @o0 Drawable drawable2, @o0 Drawable drawable3, @o0 Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void z(@m0 TextView textView, @m0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(H(textView, callback));
    }
}
