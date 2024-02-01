package a4;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import d.g1;
import t4.k;

public final class l {

    /* renamed from: e  reason: collision with root package name */
    public static final String f168e = "MemorySizeCalculator";
    @g1

    /* renamed from: f  reason: collision with root package name */
    public static final int f169f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f170g = 2;

    /* renamed from: a  reason: collision with root package name */
    public final int f171a;

    /* renamed from: b  reason: collision with root package name */
    public final int f172b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f173c;

    /* renamed from: d  reason: collision with root package name */
    public final int f174d;

    public static final class a {
        @g1

        /* renamed from: i  reason: collision with root package name */
        public static final int f175i = 2;

        /* renamed from: j  reason: collision with root package name */
        public static final int f176j = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: k  reason: collision with root package name */
        public static final float f177k = 0.4f;

        /* renamed from: l  reason: collision with root package name */
        public static final float f178l = 0.33f;

        /* renamed from: m  reason: collision with root package name */
        public static final int f179m = 4194304;

        /* renamed from: a  reason: collision with root package name */
        public final Context f180a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f181b;

        /* renamed from: c  reason: collision with root package name */
        public c f182c;

        /* renamed from: d  reason: collision with root package name */
        public float f183d = 2.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f184e = ((float) f176j);

        /* renamed from: f  reason: collision with root package name */
        public float f185f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        public float f186g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        public int f187h = 4194304;

        public a(Context context) {
            this.f180a = context;
            this.f181b = (ActivityManager) context.getSystemService(androidx.appcompat.widget.c.f1244r);
            this.f182c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && l.e(this.f181b)) {
                this.f184e = 0.0f;
            }
        }

        public l a() {
            return new l(this);
        }

        @g1
        public a b(ActivityManager activityManager) {
            this.f181b = activityManager;
            return this;
        }

        public a c(int i10) {
            this.f187h = i10;
            return this;
        }

        public a d(float f10) {
            k.a(f10 >= 0.0f, "Bitmap pool screens must be greater than or equal to 0");
            this.f184e = f10;
            return this;
        }

        public a e(float f10) {
            k.a(f10 >= 0.0f && f10 <= 1.0f, "Low memory max size multiplier must be between 0 and 1");
            this.f186g = f10;
            return this;
        }

        public a f(float f10) {
            k.a(f10 >= 0.0f && f10 <= 1.0f, "Size multiplier must be between 0 and 1");
            this.f185f = f10;
            return this;
        }

        public a g(float f10) {
            k.a(f10 >= 0.0f, "Memory cache screens must be greater than or equal to 0");
            this.f183d = f10;
            return this;
        }

        @g1
        public a h(c cVar) {
            this.f182c = cVar;
            return this;
        }
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final DisplayMetrics f188a;

        public b(DisplayMetrics displayMetrics) {
            this.f188a = displayMetrics;
        }

        public int a() {
            return this.f188a.heightPixels;
        }

        public int b() {
            return this.f188a.widthPixels;
        }
    }

    public interface c {
        int a();

        int b();
    }

    public l(a aVar) {
        this.f173c = aVar.f180a;
        int i10 = e(aVar.f181b) ? aVar.f187h / 2 : aVar.f187h;
        this.f174d = i10;
        int c10 = c(aVar.f181b, aVar.f185f, aVar.f186g);
        float b10 = (float) (aVar.f182c.b() * aVar.f182c.a() * 4);
        int round = Math.round(aVar.f184e * b10);
        int round2 = Math.round(b10 * aVar.f183d);
        int i11 = c10 - i10;
        int i12 = round2 + round;
        if (i12 <= i11) {
            this.f172b = round2;
            this.f171a = round;
        } else {
            float f10 = (float) i11;
            float f11 = aVar.f184e;
            float f12 = aVar.f183d;
            float f13 = f10 / (f11 + f12);
            this.f172b = Math.round(f12 * f13);
            this.f171a = Math.round(f13 * aVar.f184e);
        }
        if (Log.isLoggable(f168e, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f172b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f171a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > c10);
            sb2.append(", max size: ");
            sb2.append(f(c10));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f181b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f181b));
        }
    }

    public static int c(ActivityManager activityManager, float f10, float f11) {
        boolean e10 = e(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (e10) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    @TargetApi(19)
    public static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    public int a() {
        return this.f174d;
    }

    public int b() {
        return this.f171a;
    }

    public int d() {
        return this.f172b;
    }

    public final String f(int i10) {
        return Formatter.formatFileSize(this.f173c, (long) i10);
    }
}
