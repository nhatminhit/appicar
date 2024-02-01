package i4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d.m0;
import d.o0;
import d.u;
import java.util.List;
import v3.i;
import v3.k;
import y3.v;

public class e implements k<Uri, Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public static final String f9023b = "android";

    /* renamed from: c  reason: collision with root package name */
    public static final int f9024c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9025d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f9026e = 0;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9027f = 1;

    /* renamed from: g  reason: collision with root package name */
    public static final int f9028g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9029h = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9030a;

    public e(Context context) {
        this.f9030a = context.getApplicationContext();
    }

    @o0
    /* renamed from: c */
    public v<Drawable> a(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        Context d10 = d(uri, uri.getAuthority());
        return d.f(a.b(this.f9030a, d10, g(d10, uri)));
    }

    @m0
    public final Context d(Uri uri, String str) {
        if (str.equals(this.f9030a.getPackageName())) {
            return this.f9030a;
        }
        try {
            return this.f9030a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            if (str.contains(this.f9030a.getPackageName())) {
                return this.f9030a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e10);
        }
    }

    @u
    public final int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e10);
        }
    }

    @u
    public final int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, f9023b);
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    @u
    public final int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    /* renamed from: h */
    public boolean b(@m0 Uri uri, @m0 i iVar) {
        return uri.getScheme().equals("android.resource");
    }
}
