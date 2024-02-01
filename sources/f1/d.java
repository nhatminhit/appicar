package f1;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import d.m0;
import d.o0;
import d.t0;
import e1.n;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int f7055a = 3840;

    /* renamed from: b  reason: collision with root package name */
    public static final int f7056b = 2160;

    @t0(17)
    public static class a {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    @t0(23)
    public static class b {
        @m0
        public static c a(@m0 Context context, @m0 Display display) {
            Display.Mode mode = display.getMode();
            Point a10 = d.a(context, display);
            return (a10 == null || d(mode, a10)) ? new c(mode, true) : new c(mode, a10);
        }

        @SuppressLint({"ArrayReturn"})
        @m0
        public static c[] b(@m0 Context context, @m0 Display display) {
            Display.Mode[] supportedModes = display.getSupportedModes();
            c[] cVarArr = new c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a10 = d.a(context, display);
            if (a10 == null || d(mode, a10)) {
                for (int i10 = 0; i10 < supportedModes.length; i10++) {
                    cVarArr[i10] = new c(supportedModes[i10], e(supportedModes[i10], mode));
                }
            } else {
                for (int i11 = 0; i11 < supportedModes.length; i11++) {
                    cVarArr[i11] = e(supportedModes[i11], mode) ? new c(supportedModes[i11], a10) : new c(supportedModes[i11], false);
                }
            }
            return cVarArr;
        }

        public static boolean c(@m0 Display display) {
            Display.Mode mode = display.getMode();
            Display.Mode[] supportedModes = display.getSupportedModes();
            for (int i10 = 0; i10 < supportedModes.length; i10++) {
                if (mode.getPhysicalHeight() < supportedModes[i10].getPhysicalHeight() || mode.getPhysicalWidth() < supportedModes[i10].getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        public static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Display.Mode f7057a;

        /* renamed from: b  reason: collision with root package name */
        public final Point f7058b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f7059c;

        public c(@m0 Point point) {
            n.h(point, "physicalSize == null");
            this.f7058b = point;
            this.f7057a = null;
            this.f7059c = true;
        }

        @t0(23)
        public c(@m0 Display.Mode mode, @m0 Point point) {
            n.h(mode, "mode == null, can't wrap a null reference");
            n.h(point, "physicalSize == null");
            this.f7058b = point;
            this.f7057a = mode;
            this.f7059c = true;
        }

        @t0(23)
        public c(@m0 Display.Mode mode, boolean z10) {
            n.h(mode, "mode == null, can't wrap a null reference");
            this.f7058b = new Point(mode.getPhysicalWidth(), mode.getPhysicalHeight());
            this.f7057a = mode;
            this.f7059c = z10;
        }

        public int a() {
            return this.f7058b.y;
        }

        public int b() {
            return this.f7058b.x;
        }

        @Deprecated
        public boolean c() {
            return this.f7059c;
        }

        @t0(23)
        @o0
        public Display.Mode d() {
            return this.f7057a;
        }
    }

    public static Point a(@m0 Context context, @m0 Display display) {
        Point j10 = j(Build.VERSION.SDK_INT < 28 ? "sys.display-size" : "vendor.display-size", display);
        if (j10 != null) {
            return j10;
        }
        if (!g(context) || !f(display)) {
            return null;
        }
        return new Point(3840, f7056b);
    }

    @m0
    public static Point b(@m0 Context context, @m0 Display display) {
        Point a10 = a(context, display);
        if (a10 != null) {
            return a10;
        }
        Point point = new Point();
        a.a(display, point);
        return point;
    }

    @m0
    public static c c(@m0 Context context, @m0 Display display) {
        return b.a(context, display);
    }

    @SuppressLint({"ArrayReturn"})
    @m0
    public static c[] d(@m0 Context context, @m0 Display display) {
        return b.b(context, display);
    }

    @o0
    public static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(@m0 Display display) {
        return b.c(display);
    }

    public static boolean g(@m0 Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    public static boolean h(@m0 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static Point i(@m0 String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @o0
    public static Point j(@m0 String str, @m0 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e10 = e(str);
        if (TextUtils.isEmpty(e10)) {
            return null;
        }
        try {
            return i(e10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
