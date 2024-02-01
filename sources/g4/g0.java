package g4;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import d.g1;
import d.m0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import t4.k;
import z3.e;

public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7923a = "TransformationUtils";

    /* renamed from: b  reason: collision with root package name */
    public static final int f7924b = 6;

    /* renamed from: c  reason: collision with root package name */
    public static final Paint f7925c = new Paint(6);

    /* renamed from: d  reason: collision with root package name */
    public static final int f7926d = 7;

    /* renamed from: e  reason: collision with root package name */
    public static final Paint f7927e = new Paint(7);

    /* renamed from: f  reason: collision with root package name */
    public static final Paint f7928f;

    /* renamed from: g  reason: collision with root package name */
    public static final Set<String> f7929g;

    /* renamed from: h  reason: collision with root package name */
    public static final Lock f7930h;

    public class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7931a;

        public a(int i10) {
            this.f7931a = i10;
        }

        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f7931a;
            canvas.drawRoundRect(rectF, (float) i10, (float) i10, paint);
        }
    }

    public class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7932a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f7933b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f7934c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f7935d;

        public b(float f10, float f11, float f12, float f13) {
            this.f7932a = f10;
            this.f7933b = f11;
            this.f7934c = f12;
            this.f7935d = f13;
        }

        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f10 = this.f7932a;
            float f11 = this.f7933b;
            float f12 = this.f7934c;
            float f13 = this.f7935d;
            path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    public static final class d implements Lock {
        public void lock() {
        }

        public void lockInterruptibly() throws InterruptedException {
        }

        @m0
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        public boolean tryLock(long j10, @m0 TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"}));
        f7929g = hashSet;
        f7930h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f7928f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(@m0 Bitmap bitmap, @m0 Bitmap bitmap2, Matrix matrix) {
        Lock lock = f7930h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f7925c);
            e(canvas);
            lock.unlock();
        } catch (Throwable th2) {
            f7930h.unlock();
            throw th2;
        }
    }

    public static Bitmap b(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        float f10;
        float f11;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            f11 = ((float) i11) / ((float) bitmap.getHeight());
            f12 = (((float) i10) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i10) / ((float) bitmap.getWidth());
            f10 = (((float) i11) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        Bitmap f13 = eVar.f(i10, i11, k(bitmap));
        t(bitmap, f13);
        a(bitmap, f13, matrix);
        return f13;
    }

    public static Bitmap c(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            Log.isLoggable(f7923a, 2);
            return f(eVar, bitmap, i10, i11);
        }
        Log.isLoggable(f7923a, 2);
        return bitmap;
    }

    public static Bitmap d(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        int min = Math.min(i10, i11);
        float f10 = (float) min;
        float f11 = f10 / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f10 / width, f10 / height);
        float f12 = width * max;
        float f13 = max * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap g10 = g(eVar, bitmap);
        Bitmap f16 = eVar.f(min, min, h(bitmap));
        f16.setHasAlpha(true);
        Lock lock = f7930h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f16);
            canvas.drawCircle(f11, f11, f11, f7927e);
            canvas.drawBitmap(g10, (Rect) null, rectF, f7928f);
            e(canvas);
            lock.unlock();
            if (!g10.equals(bitmap)) {
                eVar.d(g10);
            }
            return f16;
        } catch (Throwable th2) {
            f7930h.unlock();
            throw th2;
        }
    }

    public static void e(Canvas canvas) {
        canvas.setBitmap((Bitmap) null);
    }

    public static Bitmap f(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            Log.isLoggable(f7923a, 2);
            return bitmap;
        }
        float min = Math.min(((float) i10) / ((float) bitmap.getWidth()), ((float) i11) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable(f7923a, 2);
            return bitmap;
        }
        Bitmap f10 = eVar.f((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), k(bitmap));
        t(bitmap, f10);
        if (Log.isLoggable(f7923a, 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("request: ");
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("toFit:   ");
            sb3.append(bitmap.getWidth());
            sb3.append("x");
            sb3.append(bitmap.getHeight());
            StringBuilder sb4 = new StringBuilder();
            sb4.append("toReuse: ");
            sb4.append(f10.getWidth());
            sb4.append("x");
            sb4.append(f10.getHeight());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("minPct:   ");
            sb5.append(min);
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, f10, matrix);
        return f10;
    }

    public static Bitmap g(@m0 e eVar, @m0 Bitmap bitmap) {
        Bitmap.Config h10 = h(bitmap);
        if (h10.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap f10 = eVar.f(bitmap.getWidth(), bitmap.getHeight(), h10);
        new Canvas(f10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return f10;
    }

    @m0
    public static Bitmap.Config h(@m0 Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public static Lock i() {
        return f7930h;
    }

    public static int j(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @m0
    public static Bitmap.Config k(@m0 Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @g1
    public static void l(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
        matrix.postScale(-1.0f, 1.0f);
    }

    public static boolean m(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@m0 Bitmap bitmap, int i10) {
        if (i10 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i10);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            Log.isLoggable(f7923a, 6);
            return bitmap;
        }
    }

    public static Bitmap o(@m0 e eVar, @m0 Bitmap bitmap, int i10) {
        if (!m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap f10 = eVar.f(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        f10.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, f10, matrix);
        return f10;
    }

    public static Bitmap p(@m0 e eVar, @m0 Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return s(eVar, bitmap, new b(f10, f11, f12, f13));
    }

    public static Bitmap q(@m0 e eVar, @m0 Bitmap bitmap, int i10) {
        k.a(i10 > 0, "roundingRadius must be greater than 0.");
        return s(eVar, bitmap, new a(i10));
    }

    @Deprecated
    public static Bitmap r(@m0 e eVar, @m0 Bitmap bitmap, int i10, int i11, int i12) {
        return q(eVar, bitmap, i12);
    }

    public static Bitmap s(@m0 e eVar, @m0 Bitmap bitmap, c cVar) {
        Bitmap.Config h10 = h(bitmap);
        Bitmap g10 = g(eVar, bitmap);
        Bitmap f10 = eVar.f(g10.getWidth(), g10.getHeight(), h10);
        f10.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g10, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) f10.getWidth(), (float) f10.getHeight());
        Lock lock = f7930h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f10);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!g10.equals(bitmap)) {
                eVar.d(g10);
            }
            return f10;
        } catch (Throwable th2) {
            f7930h.unlock();
            throw th2;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
