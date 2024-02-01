package fd;

import ad.d;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.c;
import d.m0;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18891a = "AppUtils";

    public static String a(Context context, String str) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "(unknown)");
    }

    public static Drawable b(Context context, Drawable drawable) {
        return i(context, drawable, 84);
    }

    @m0
    public static Bitmap c(@m0 Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Drawable d(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationIcon(str);
        } catch (PackageManager.NameNotFoundException e10) {
            d.c(f18891a, "getDrawableFromPackageName: " + e10.getMessage());
            return null;
        }
    }

    public static Drawable e(Context context, Drawable drawable) {
        return i(context, drawable, dg.a.lq);
    }

    public static Drawable f(Context context, Drawable drawable) {
        return i(context, drawable, 46);
    }

    public static boolean g(Context context, Class<?> cls) {
        for (ActivityManager.RunningServiceInfo runningServiceInfo : ((ActivityManager) context.getSystemService(c.f1244r)).getRunningServices(Integer.MAX_VALUE)) {
            if (cls.getName().equals(runningServiceInfo.service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
        r3 = c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        ad.d.c(f18891a, "resizeDrawable: " + r2.getMessage());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable i(android.content.Context r2, android.graphics.drawable.Drawable r3, int r4) {
        /*
            if (r3 == 0) goto L_0x003e
            r0 = r3
            android.graphics.drawable.StateListDrawable r0 = (android.graphics.drawable.StateListDrawable) r0     // Catch:{ Exception -> 0x0010 }
            android.graphics.drawable.Drawable r0 = r0.getCurrent()     // Catch:{ Exception -> 0x0010 }
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0     // Catch:{ Exception -> 0x0010 }
            android.graphics.Bitmap r3 = r0.getBitmap()     // Catch:{ Exception -> 0x0010 }
            goto L_0x0014
        L_0x0010:
            android.graphics.Bitmap r3 = c(r3)     // Catch:{ Exception -> 0x0023 }
        L_0x0014:
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable     // Catch:{ Exception -> 0x0023 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0023 }
            r1 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r4, r1)     // Catch:{ Exception -> 0x0023 }
            r0.<init>(r2, r3)     // Catch:{ Exception -> 0x0023 }
            return r0
        L_0x0023:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "resizeDrawable: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "AppUtils"
            ad.d.c(r3, r2)
        L_0x003e:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: fd.a.i(android.content.Context, android.graphics.drawable.Drawable, int):android.graphics.drawable.Drawable");
    }
}
