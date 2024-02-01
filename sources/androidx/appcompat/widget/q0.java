package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import f.a;
import i0.d;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import k1.c;
import t7.t;

public class q0 extends c implements View.OnClickListener {

    /* renamed from: q0  reason: collision with root package name */
    public static final boolean f1396q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public static final String f1397r0 = "SuggestionsAdapter";

    /* renamed from: s0  reason: collision with root package name */
    public static final int f1398s0 = 50;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f1399t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f1400u0 = 1;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f1401v0 = 2;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f1402w0 = -1;

    /* renamed from: c0  reason: collision with root package name */
    public final SearchView f1403c0;

    /* renamed from: d0  reason: collision with root package name */
    public final SearchableInfo f1404d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f1405e0;

    /* renamed from: f0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1406f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f1407g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1408h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public int f1409i0 = 1;

    /* renamed from: j0  reason: collision with root package name */
    public ColorStateList f1410j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1411k0 = -1;

    /* renamed from: l0  reason: collision with root package name */
    public int f1412l0 = -1;

    /* renamed from: m0  reason: collision with root package name */
    public int f1413m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public int f1414n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    public int f1415o0 = -1;

    /* renamed from: p0  reason: collision with root package name */
    public int f1416p0 = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f1417a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f1418b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f1419c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f1420d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f1421e;

        public a(View view) {
            this.f1417a = (TextView) view.findViewById(16908308);
            this.f1418b = (TextView) view.findViewById(16908309);
            this.f1419c = (ImageView) view.findViewById(16908295);
            this.f1420d = (ImageView) view.findViewById(16908296);
            this.f1421e = (ImageView) view.findViewById(a.h.edit_query);
        }
    }

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1403c0 = searchView;
        this.f1404d0 = searchableInfo;
        this.f1407g0 = searchView.getSuggestionCommitIconResId();
        this.f1405e0 = context;
        this.f1406f0 = weakHashMap;
    }

    public static String C(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String t(Cursor cursor, String str) {
        return C(cursor, cursor.getColumnIndex(str));
    }

    public int A() {
        return this.f1409i0;
    }

    public Cursor B(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme(t.f13205o).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1405e0.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public void D(int i10) {
        this.f1409i0 = i10;
    }

    public final void E(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    public final void F(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public final void G(String str, Drawable drawable) {
        if (drawable != null) {
            this.f1406f0.put(str, drawable.getConstantState());
        }
    }

    public final void H(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void a(Cursor cursor) {
        if (!this.f1408h0) {
            try {
                super.a(cursor);
                if (cursor != null) {
                    this.f1411k0 = cursor.getColumnIndex("suggest_text_1");
                    this.f1412l0 = cursor.getColumnIndex("suggest_text_2");
                    this.f1413m0 = cursor.getColumnIndex("suggest_text_2_url");
                    this.f1414n0 = cursor.getColumnIndex("suggest_icon_1");
                    this.f1415o0 = cursor.getColumnIndex("suggest_icon_2");
                    this.f1416p0 = cursor.getColumnIndex("suggest_flags");
                }
            } catch (Exception unused) {
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public Cursor c(CharSequence charSequence) {
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (this.f1403c0.getVisibility() == 0 && this.f1403c0.getWindowVisibility() == 0) {
            try {
                Cursor B = B(this.f1404d0, charSequence2, 50);
                if (B != null) {
                    B.getCount();
                    return B;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    public CharSequence convertToString(Cursor cursor) {
        String t10;
        String t11;
        if (cursor == null) {
            return null;
        }
        String t12 = t(cursor, "suggest_intent_query");
        if (t12 != null) {
            return t12;
        }
        if (this.f1404d0.shouldRewriteQueryFromData() && (t11 = t(cursor, "suggest_intent_data")) != null) {
            return t11;
        }
        if (!this.f1404d0.shouldRewriteQueryFromText() || (t10 = t(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return t10;
    }

    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f1416p0;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1417a != null) {
            F(aVar.f1417a, C(cursor, this.f1411k0));
        }
        if (aVar.f1418b != null) {
            String C = C(cursor, this.f1413m0);
            CharSequence q10 = C != null ? q(C) : C(cursor, this.f1412l0);
            if (TextUtils.isEmpty(q10)) {
                TextView textView = aVar.f1417a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f1417a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f1417a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f1417a.setMaxLines(1);
                }
            }
            F(aVar.f1418b, q10);
        }
        ImageView imageView = aVar.f1419c;
        if (imageView != null) {
            E(imageView, y(cursor), 4);
        }
        ImageView imageView2 = aVar.f1420d;
        if (imageView2 != null) {
            E(imageView2, z(cursor), 8);
        }
        int i12 = this.f1409i0;
        if (i12 == 2 || (i12 == 1 && (i11 & 1) != 0)) {
            aVar.f1421e.setVisibility(0);
            aVar.f1421e.setTag(aVar.f1417a.getText());
            aVar.f1421e.setOnClickListener(this);
            return;
        }
        aVar.f1421e.setVisibility(8);
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View h10 = h(this.f1405e0, b(), viewGroup);
            if (h10 != null) {
                ((a) h10.getTag()).f1417a.setText(e10.toString());
            }
            return h10;
        }
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View i11 = i(this.f1405e0, b(), viewGroup);
            if (i11 != null) {
                ((a) i11.getTag()).f1417a.setText(e10.toString());
            }
            return i11;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View i10 = super.i(context, cursor, viewGroup);
        i10.setTag(new a(i10));
        ((ImageView) i10.findViewById(a.h.edit_query)).setImageResource(this.f1407g0);
        return i10;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        H(b());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        H(b());
    }

    public final Drawable o(String str) {
        Drawable.ConstantState constantState = this.f1406f0.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1403c0.Z((CharSequence) tag);
        }
    }

    public void p() {
        a((Cursor) null);
        this.f1408h0 = true;
    }

    public final CharSequence q(CharSequence charSequence) {
        if (this.f1410j0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f1405e0.getTheme().resolveAttribute(a.c.textColorSearchUrl, typedValue, true);
            this.f1410j0 = this.f1405e0.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f1410j0, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    public final Drawable r(ComponentName componentName) {
        PackageManager packageManager = this.f1405e0.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid icon resource ");
            sb2.append(iconResource);
            sb2.append(" for ");
            sb2.append(componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            return null;
        }
    }

    public final Drawable s(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f1406f0.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f1406f0.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f1405e0.getResources());
        }
        Drawable r10 = r(componentName);
        if (r10 != null) {
            constantState = r10.getConstantState();
        }
        this.f1406f0.put(flattenToShortString, constantState);
        return r10;
    }

    public final Drawable u() {
        Drawable s10 = s(this.f1404d0.getSearchActivity());
        return s10 != null ? s10 : this.f1405e0.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|21|22|23|24) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:12|13|14|15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r5);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0014 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0050=Splitter:B:22:0x0050, B:4:0x000f=Splitter:B:4:0x000f, B:16:0x003f=Splitter:B:16:0x003f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable v(android.net.Uri r5) {
        /*
            r4 = this;
            java.lang.String r0 = "Error closing icon stream for "
            r1 = 0
            java.lang.String r2 = r5.getScheme()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x002b
            android.graphics.drawable.Drawable r5 = r4.w(r5)     // Catch:{ NotFoundException -> 0x0014 }
            return r5
        L_0x0014:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Resource does not exist: "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x002b:
            android.content.Context r2 = r4.f1405e0     // Catch:{ FileNotFoundException -> 0x0073 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.io.InputStream r2 = r2.openInputStream(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            if (r2 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r3 = android.graphics.drawable.Drawable.createFromStream(r2, r1)     // Catch:{ all -> 0x004b }
            r2.close()     // Catch:{ IOException -> 0x003f }
            goto L_0x004a
        L_0x003f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x004a:
            return r3
        L_0x004b:
            r3 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r0)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005b:
            throw r3     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x005c:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.<init>()     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r3 = "Failed to open "
            r2.append(r3)     // Catch:{ FileNotFoundException -> 0x0073 }
            r2.append(r5)     // Catch:{ FileNotFoundException -> 0x0073 }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x0073 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0073 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon not found: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = ", "
            r2.append(r5)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.v(android.net.Uri):android.graphics.drawable.Drawable");
    }

    public Drawable w(Uri uri) throws FileNotFoundException {
        int i10;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f1405e0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i10 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i10 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i10 != 0) {
                        return resourcesForApplication.getDrawable(i10);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    public final Drawable x(String str) {
        if (str == null || str.isEmpty() || "0".equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f1405e0.getPackageName() + "/" + parseInt;
            Drawable o10 = o(str2);
            if (o10 != null) {
                return o10;
            }
            Drawable i10 = d.i(this.f1405e0, parseInt);
            G(str2, i10);
            return i10;
        } catch (NumberFormatException unused) {
            Drawable o11 = o(str);
            if (o11 != null) {
                return o11;
            }
            Drawable v10 = v(Uri.parse(str));
            G(str, v10);
            return v10;
        } catch (Resources.NotFoundException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Icon resource not found: ");
            sb2.append(str);
            return null;
        }
    }

    public final Drawable y(Cursor cursor) {
        int i10 = this.f1414n0;
        if (i10 == -1) {
            return null;
        }
        Drawable x10 = x(cursor.getString(i10));
        return x10 != null ? x10 : u();
    }

    public final Drawable z(Cursor cursor) {
        int i10 = this.f1415o0;
        if (i10 == -1) {
            return null;
        }
        return x(cursor.getString(i10));
    }
}
