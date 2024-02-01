package vn.icar.entertaiment.view.widget;

import ad.d;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.DisplayMetrics;
import ji.a;

public class BaseAppWidgetProvider extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23921a = "BaseAppWidgetProvider";

    /* renamed from: b  reason: collision with root package name */
    public static double f23922b;

    /* renamed from: c  reason: collision with root package name */
    public static double f23923c;

    public static Bitmap a(Bitmap bitmap) {
        return bitmap.getWidth() >= bitmap.getHeight() ? Bitmap.createBitmap(bitmap, (bitmap.getWidth() / 2) - (bitmap.getHeight() / 2), 0, bitmap.getHeight(), bitmap.getHeight()) : Bitmap.createBitmap(bitmap, 0, (bitmap.getHeight() / 2) - (bitmap.getWidth() / 2), bitmap.getWidth(), bitmap.getWidth());
    }

    public static int b() {
        return Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
    }

    public static Bitmap c(Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float min = ((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) / 2.0f;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, min, min, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static Bitmap d(Bitmap bitmap, int i10) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        float f10 = (float) i10;
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawRoundRect(rectF, f10, f10, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return createBitmap;
    }

    public static double e(Context context) {
        return (double) context.getResources().getDisplayMetrics().heightPixels;
    }

    public static double f(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return ((double) displayMetrics.widthPixels) / ((double) displayMetrics.heightPixels);
    }

    public static double g(Context context) {
        return (double) context.getResources().getDisplayMetrics().widthPixels;
    }

    public static void h(Context context) {
        f23922b = g(context);
        f23923c = e(context);
    }

    public static boolean i() {
        return f23922b == 1920.0d && f23923c == 1200.0d;
    }

    public void j(Context context) {
        d.c(f23921a, "sendUpdateWidget");
        context.sendBroadcast(new Intent(a.C0341a.f19973a));
    }

    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        j(context);
    }
}
