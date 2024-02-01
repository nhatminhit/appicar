package androidx.core.graphics.drawable;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import b6.c;
import d.b0;
import d.g1;
import d.l;
import d.m0;
import d.o0;
import d.t0;
import d.u;
import d.x0;
import e1.n;
import i0.d;
import i4.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import k0.g;
import t7.t;

public class IconCompat extends CustomVersionedParcelable {
    @g1
    public static final String A = "obj";
    @g1
    public static final String B = "int1";
    @g1
    public static final String C = "int2";
    @g1
    public static final String D = "tint_list";
    @g1
    public static final String E = "tint_mode";
    @g1
    public static final String F = "string1";
    public static final PorterDuff.Mode G = PorterDuff.Mode.SRC_IN;

    /* renamed from: k  reason: collision with root package name */
    public static final String f2202k = "IconCompat";

    /* renamed from: l  reason: collision with root package name */
    public static final int f2203l = -1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f2204m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f2205n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f2206o = 3;

    /* renamed from: p  reason: collision with root package name */
    public static final int f2207p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final int f2208q = 5;

    /* renamed from: r  reason: collision with root package name */
    public static final int f2209r = 6;

    /* renamed from: s  reason: collision with root package name */
    public static final float f2210s = 0.25f;

    /* renamed from: t  reason: collision with root package name */
    public static final float f2211t = 0.6666667f;

    /* renamed from: u  reason: collision with root package name */
    public static final float f2212u = 0.9166667f;

    /* renamed from: v  reason: collision with root package name */
    public static final float f2213v = 0.010416667f;

    /* renamed from: w  reason: collision with root package name */
    public static final float f2214w = 0.020833334f;

    /* renamed from: x  reason: collision with root package name */
    public static final int f2215x = 61;

    /* renamed from: y  reason: collision with root package name */
    public static final int f2216y = 30;
    @g1

    /* renamed from: z  reason: collision with root package name */
    public static final String f2217z = "type";
    @x0({x0.a.Q})

    /* renamed from: a  reason: collision with root package name */
    public int f2218a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2219b;
    @x0({x0.a.O})

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2220c;
    @x0({x0.a.O})

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2221d;
    @x0({x0.a.O})

    /* renamed from: e  reason: collision with root package name */
    public int f2222e;
    @x0({x0.a.O})

    /* renamed from: f  reason: collision with root package name */
    public int f2223f;
    @x0({x0.a.O})

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2224g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2225h;
    @x0({x0.a.O})

    /* renamed from: i  reason: collision with root package name */
    public String f2226i;
    @x0({x0.a.O})

    /* renamed from: j  reason: collision with root package name */
    public String f2227j;

    @x0({x0.a.O})
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    @x0({x0.a.O})
    public IconCompat() {
        this.f2218a = -1;
        this.f2220c = null;
        this.f2221d = null;
        this.f2222e = 0;
        this.f2223f = 0;
        this.f2224g = null;
        this.f2225h = G;
        this.f2226i = null;
    }

    public IconCompat(int i10) {
        this.f2220c = null;
        this.f2221d = null;
        this.f2222e = 0;
        this.f2223f = 0;
        this.f2224g = null;
        this.f2225h = G;
        this.f2226i = null;
        this.f2218a = i10;
    }

    @t0(23)
    @b0
    @u
    public static int C(@m0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    @t0(23)
    @o0
    public static String E(@m0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Resources F(Context context, String str) {
        if (e.f9023b.equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            String.format("Unable to find pkg=%s for icon", new Object[]{str});
            return null;
        }
    }

    @t0(23)
    public static int H(@m0 Icon icon) {
        StringBuilder sb2;
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            sb2 = new StringBuilder();
            sb2.append("Unable to get icon type ");
            sb2.append(icon);
            return -1;
        } catch (InvocationTargetException unused2) {
            sb2 = new StringBuilder();
            sb2.append("Unable to get icon type ");
            sb2.append(icon);
            return -1;
        } catch (NoSuchMethodException unused3) {
            sb2 = new StringBuilder();
            sb2.append("Unable to get icon type ");
            sb2.append(icon);
            return -1;
        }
    }

    @t0(23)
    @o0
    public static Uri J(@m0 Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static String S(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    @o0
    public static IconCompat m(@m0 Bundle bundle) {
        Object obj;
        int i10 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f2222e = bundle.getInt(B);
        iconCompat.f2223f = bundle.getInt(C);
        iconCompat.f2227j = bundle.getString(F);
        if (bundle.containsKey(D)) {
            iconCompat.f2224g = (ColorStateList) bundle.getParcelable(D);
        }
        if (bundle.containsKey(E)) {
            iconCompat.f2225h = PorterDuff.Mode.valueOf(bundle.getString(E));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                obj = bundle.getParcelable(A);
                break;
            case 2:
            case 4:
            case 6:
                obj = bundle.getString(A);
                break;
            case 3:
                iconCompat.f2219b = bundle.getByteArray(A);
                break;
            default:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown type ");
                sb2.append(i10);
                return null;
        }
        iconCompat.f2219b = obj;
        return iconCompat;
    }

    @t0(23)
    @o0
    public static IconCompat n(@m0 Context context, @m0 Icon icon) {
        n.g(icon);
        int H = H(icon);
        if (H == 2) {
            String E2 = E(icon);
            try {
                return z(F(context, E2), E2, C(icon));
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else if (H == 4) {
            return v(J(icon));
        } else {
            if (H == 6) {
                return s(J(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f2219b = icon;
            return iconCompat;
        }
    }

    @t0(23)
    @x0({x0.a.Q})
    @o0
    public static IconCompat o(@m0 Icon icon) {
        n.g(icon);
        int H = H(icon);
        if (H == 2) {
            return z((Resources) null, E(icon), C(icon));
        }
        if (H == 4) {
            return v(J(icon));
        }
        if (H == 6) {
            return s(J(icon));
        }
        IconCompat iconCompat = new IconCompat(-1);
        iconCompat.f2219b = icon;
        return iconCompat;
    }

    @t0(23)
    @x0({x0.a.Q})
    @o0
    public static IconCompat p(@m0 Icon icon) {
        if (H(icon) == 2 && C(icon) == 0) {
            return null;
        }
        return o(icon);
    }

    @g1
    public static Bitmap q(Bitmap bitmap, boolean z10) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = (float) min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, e3.a.R);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, e3.a.Q);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap((Bitmap) null);
        return createBitmap;
    }

    public static IconCompat r(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(5);
            iconCompat.f2219b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    @m0
    public static IconCompat s(@m0 Uri uri) {
        if (uri != null) {
            return t(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    @m0
    public static IconCompat t(@m0 String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(6);
            iconCompat.f2219b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat u(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f2219b = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    public static IconCompat v(Uri uri) {
        if (uri != null) {
            return w(uri.toString());
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat w(String str) {
        if (str != null) {
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.f2219b = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Uri must not be null.");
    }

    public static IconCompat x(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            IconCompat iconCompat = new IconCompat(3);
            iconCompat.f2219b = bArr;
            iconCompat.f2222e = i10;
            iconCompat.f2223f = i11;
            return iconCompat;
        }
        throw new IllegalArgumentException("Data must not be null.");
    }

    public static IconCompat y(Context context, @u int i10) {
        if (context != null) {
            return z(context.getResources(), context.getPackageName(), i10);
        }
        throw new IllegalArgumentException("Context must not be null.");
    }

    @x0({x0.a.Q})
    public static IconCompat z(Resources resources, String str, @u int i10) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f2222e = i10;
            if (resources != null) {
                try {
                    iconCompat.f2219b = resources.getResourceName(i10);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f2219b = str;
            }
            iconCompat.f2227j = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    @x0({x0.a.Q})
    @o0
    public Bitmap A() {
        int i10 = this.f2218a;
        if (i10 == -1) {
            Object obj = this.f2219b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i10 == 1) {
            return (Bitmap) this.f2219b;
        } else {
            if (i10 == 5) {
                return q((Bitmap) this.f2219b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    @b0
    public int B() {
        int i10 = this.f2218a;
        if (i10 == -1) {
            return C((Icon) this.f2219b);
        }
        if (i10 == 2) {
            return this.f2222e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @m0
    public String D() {
        int i10 = this.f2218a;
        if (i10 == -1) {
            return E((Icon) this.f2219b);
        }
        if (i10 == 2) {
            return TextUtils.isEmpty(this.f2227j) ? ((String) this.f2219b).split(":", -1)[0] : this.f2227j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int G() {
        int i10 = this.f2218a;
        return i10 == -1 ? H((Icon) this.f2219b) : i10;
    }

    @m0
    public Uri I() {
        int i10 = this.f2218a;
        if (i10 == -1) {
            return J((Icon) this.f2219b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f2219b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    @x0({x0.a.P})
    @o0
    public InputStream K(@m0 Context context) {
        StringBuilder sb2;
        String str;
        Uri I = I();
        String scheme = I.getScheme();
        if (t.f13205o.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(I);
            } catch (Exception unused) {
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
                sb2.append(str);
                sb2.append(I);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2219b));
            } catch (FileNotFoundException unused2) {
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
                sb2.append(str);
                sb2.append(I);
                return null;
            }
        }
    }

    @o0
    public Drawable L(@m0 Context context) {
        e(context);
        return R(context).loadDrawable(context);
    }

    public final Drawable M(Context context) {
        switch (this.f2218a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f2219b);
            case 2:
                String D2 = D();
                if (TextUtils.isEmpty(D2)) {
                    D2 = context.getPackageName();
                }
                try {
                    return g.f(F(context, D2), this.f2222e, context.getTheme());
                } catch (RuntimeException unused) {
                    String.format("Unable to load resource 0x%08x from pkg=%s", new Object[]{Integer.valueOf(this.f2222e), this.f2219b});
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f2219b, this.f2222e, this.f2223f));
            case 4:
                InputStream K = K(context);
                if (K != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(K));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), q((Bitmap) this.f2219b, false));
            case 6:
                InputStream K2 = K(context);
                if (K2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? new AdaptiveIconDrawable((Drawable) null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(K2))) : new BitmapDrawable(context.getResources(), q(BitmapFactory.decodeStream(K2), false));
                }
                break;
        }
        return null;
    }

    public IconCompat N(@l int i10) {
        return O(ColorStateList.valueOf(i10));
    }

    public IconCompat O(ColorStateList colorStateList) {
        this.f2224g = colorStateList;
        return this;
    }

    public IconCompat P(PorterDuff.Mode mode) {
        this.f2225h = mode;
        return this;
    }

    @t0(23)
    @Deprecated
    @m0
    public Icon Q() {
        return R((Context) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r5 = q(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r5 = android.graphics.drawable.Icon.createWithBitmap(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        r0 = r4.f2224g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ab, code lost:
        if (r0 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r5.setTintList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        r0 = r4.f2225h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b4, code lost:
        if (r0 == G) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b6, code lost:
        r5.setTintMode(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        return r5;
     */
    @d.t0(23)
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Icon R(@d.o0 android.content.Context r5) {
        /*
            r4 = this;
            int r0 = r4.f2218a
            r1 = 0
            r2 = 26
            switch(r0) {
                case -1: goto L_0x00ba;
                case 0: goto L_0x0008;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0096;
                case 3: goto L_0x0089;
                case 4: goto L_0x0080;
                case 5: goto L_0x006a;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unknown type"
            r5.<init>(r0)
            throw r5
        L_0x0010:
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r0 < r3) goto L_0x0020
            android.net.Uri r5 = r4.I()
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmapContentUri(r5)
            goto L_0x00a9
        L_0x0020:
            if (r5 == 0) goto L_0x004f
            java.io.InputStream r5 = r4.K(r5)
            if (r5 == 0) goto L_0x0034
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r0 < r2) goto L_0x007b
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L_0x00a9
        L_0x0034:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot load adaptive icon from uri: "
            r0.append(r1)
            android.net.Uri r1 = r4.I()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x004f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
            r0.append(r1)
            android.net.Uri r1 = r4.I()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x006a:
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r2) goto L_0x0077
            java.lang.Object r5 = r4.f2219b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r5)
            goto L_0x00a9
        L_0x0077:
            java.lang.Object r5 = r4.f2219b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x007b:
            android.graphics.Bitmap r5 = q(r5, r1)
            goto L_0x00a5
        L_0x0080:
            java.lang.Object r5 = r4.f2219b
            java.lang.String r5 = (java.lang.String) r5
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
            goto L_0x00a9
        L_0x0089:
            java.lang.Object r5 = r4.f2219b
            byte[] r5 = (byte[]) r5
            int r0 = r4.f2222e
            int r1 = r4.f2223f
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
            goto L_0x00a9
        L_0x0096:
            java.lang.String r5 = r4.D()
            int r0 = r4.f2222e
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
            goto L_0x00a9
        L_0x00a1:
            java.lang.Object r5 = r4.f2219b
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
        L_0x00a5:
            android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
        L_0x00a9:
            android.content.res.ColorStateList r0 = r4.f2224g
            if (r0 == 0) goto L_0x00b0
            r5.setTintList(r0)
        L_0x00b0:
            android.graphics.PorterDuff$Mode r0 = r4.f2225h
            android.graphics.PorterDuff$Mode r1 = G
            if (r0 == r1) goto L_0x00b9
            r5.setTintMode(r0)
        L_0x00b9:
            return r5
        L_0x00ba:
            java.lang.Object r5 = r4.f2219b
            android.graphics.drawable.Icon r5 = (android.graphics.drawable.Icon) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.R(android.content.Context):android.graphics.drawable.Icon");
    }

    @m0
    public Bundle a() {
        Parcelable parcelable;
        Bundle bundle = new Bundle();
        switch (this.f2218a) {
            case -1:
                parcelable = (Parcelable) this.f2219b;
                break;
            case 1:
            case 5:
                parcelable = (Bitmap) this.f2219b;
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString(A, (String) this.f2219b);
                break;
            case 3:
                bundle.putByteArray(A, (byte[]) this.f2219b);
                break;
            default:
                throw new IllegalArgumentException("Invalid icon");
        }
        bundle.putParcelable(A, parcelable);
        bundle.putInt("type", this.f2218a);
        bundle.putInt(B, this.f2222e);
        bundle.putInt(C, this.f2223f);
        bundle.putString(F, this.f2227j);
        ColorStateList colorStateList = this.f2224g;
        if (colorStateList != null) {
            bundle.putParcelable(D, colorStateList);
        }
        PorterDuff.Mode mode = this.f2225h;
        if (mode != G) {
            bundle.putString(E, mode.name());
        }
        return bundle;
    }

    public void b() {
        Parcelable parcelable;
        this.f2225h = PorterDuff.Mode.valueOf(this.f2226i);
        switch (this.f2218a) {
            case -1:
                parcelable = this.f2221d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 1:
            case 5:
                parcelable = this.f2221d;
                if (parcelable == null) {
                    byte[] bArr = this.f2220c;
                    this.f2219b = bArr;
                    this.f2218a = 3;
                    this.f2222e = 0;
                    this.f2223f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2220c, Charset.forName(c.f4245m));
                this.f2219b = str;
                if (this.f2218a == 2 && this.f2227j == null) {
                    this.f2227j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2219b = this.f2220c;
                return;
            default:
                return;
        }
        this.f2219b = parcelable;
    }

    public void c(boolean z10) {
        this.f2226i = this.f2225h.name();
        switch (this.f2218a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 1:
            case 5:
                if (z10) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.f2219b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2220c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2220c = ((String) this.f2219b).getBytes(Charset.forName(c.f4245m));
                return;
            case 3:
                this.f2220c = (byte[]) this.f2219b;
                return;
            case 4:
            case 6:
                this.f2220c = this.f2219b.toString().getBytes(Charset.forName(c.f4245m));
                return;
            default:
                return;
        }
        this.f2221d = (Parcelable) this.f2219b;
    }

    @x0({x0.a.Q})
    public void d(@m0 Intent intent, @o0 Drawable drawable, @m0 Context context) {
        Bitmap bitmap;
        e(context);
        int i10 = this.f2218a;
        if (i10 == 1) {
            bitmap = (Bitmap) this.f2219b;
            if (drawable != null) {
                bitmap = bitmap.copy(bitmap.getConfig(), true);
            }
        } else if (i10 == 2) {
            try {
                Context createPackageContext = context.createPackageContext(D(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(createPackageContext, this.f2222e));
                    return;
                }
                Drawable i11 = d.i(createPackageContext, this.f2222e);
                if (i11.getIntrinsicWidth() > 0) {
                    if (i11.getIntrinsicHeight() > 0) {
                        bitmap = Bitmap.createBitmap(i11.getIntrinsicWidth(), i11.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                        i11.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        i11.draw(new Canvas(bitmap));
                    }
                }
                int launcherLargeIconSize = ((ActivityManager) createPackageContext.getSystemService(androidx.appcompat.widget.c.f1244r)).getLauncherLargeIconSize();
                bitmap = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                i11.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
                i11.draw(new Canvas(bitmap));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new IllegalArgumentException("Can't find package " + this.f2219b, e10);
            }
        } else if (i10 == 5) {
            bitmap = q((Bitmap) this.f2219b, true);
        } else {
            throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
        }
        if (drawable != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmap));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmap);
    }

    @x0({x0.a.Q})
    public void e(@m0 Context context) {
        Object obj;
        if (this.f2218a == 2 && (obj = this.f2219b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String D2 = D();
                    int identifier = F(context, D2).getIdentifier(str4, str3, str5);
                    if (this.f2222e != identifier) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Id has changed for ");
                        sb2.append(D2);
                        sb2.append(" ");
                        sb2.append(str);
                        this.f2222e = identifier;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @d.m0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r4 = this;
            int r0 = r4.f2218a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r4.f2219b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Icon(typ="
            r0.<init>(r1)
            int r1 = r4.f2218a
            java.lang.String r1 = S(r1)
            r0.append(r1)
            int r1 = r4.f2218a
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x0043;
                case 3: goto L_0x002d;
                case 4: goto L_0x0022;
                case 5: goto L_0x006a;
                case 6: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x008a
        L_0x0022:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r4.f2219b
            r0.append(r1)
            goto L_0x008a
        L_0x002d:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r4.f2222e
            r0.append(r1)
            int r1 = r4.f2223f
            if (r1 == 0) goto L_0x008a
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r4.f2223f
            goto L_0x0087
        L_0x0043:
            java.lang.String r1 = " pkg="
            r0.append(r1)
            java.lang.String r1 = r4.f2227j
            r0.append(r1)
            java.lang.String r1 = " id="
            r0.append(r1)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            int r3 = r4.B()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            goto L_0x008a
        L_0x006a:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r4.f2219b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r4.f2219b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x0087:
            r0.append(r1)
        L_0x008a:
            android.content.res.ColorStateList r1 = r4.f2224g
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r4.f2224g
            r0.append(r1)
        L_0x0098:
            android.graphics.PorterDuff$Mode r1 = r4.f2225h
            android.graphics.PorterDuff$Mode r2 = G
            if (r1 == r2) goto L_0x00a8
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r4.f2225h
            r0.append(r1)
        L_0x00a8:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
