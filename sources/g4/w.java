package g4;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import d.g1;
import d.z;
import java.io.File;

public final class w {
    @g1

    /* renamed from: f  reason: collision with root package name */
    public static final int f8020f = 128;

    /* renamed from: g  reason: collision with root package name */
    public static final int f8021g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final File f8022h = new File("/proc/self/fd");

    /* renamed from: i  reason: collision with root package name */
    public static final int f8023i = 50;

    /* renamed from: j  reason: collision with root package name */
    public static final int f8024j = 700;

    /* renamed from: k  reason: collision with root package name */
    public static final int f8025k = 20000;

    /* renamed from: l  reason: collision with root package name */
    public static volatile w f8026l;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8027a = d();

    /* renamed from: b  reason: collision with root package name */
    public final int f8028b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8029c;
    @z("this")

    /* renamed from: d  reason: collision with root package name */
    public int f8030d;
    @z("this")

    /* renamed from: e  reason: collision with root package name */
    public boolean f8031e = true;

    @g1
    public w() {
        int i10;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f8028b = 20000;
            i10 = 0;
        } else {
            this.f8028b = f8024j;
            i10 = 128;
        }
        this.f8029c = i10;
    }

    public static w a() {
        if (f8026l == null) {
            synchronized (w.class) {
                if (f8026l == null) {
                    f8026l = new w();
                }
            }
        }
        return f8026l;
    }

    public static boolean d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String substring = str.substring(0, 7);
        substring.hashCode();
        char c10 = 65535;
        switch (substring.hashCode()) {
            case -1398613787:
                if (substring.equals("SM-A520")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1398431166:
                if (substring.equals("SM-G930")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1398431161:
                if (substring.equals("SM-G935")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1398431073:
                if (substring.equals("SM-G960")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1398431068:
                if (substring.equals("SM-G965")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1398343746:
                if (substring.equals("SM-J720")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1398222624:
                if (substring.equals("SM-N935")) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    public final synchronized boolean b() {
        boolean z10 = true;
        int i10 = this.f8030d + 1;
        this.f8030d = i10;
        if (i10 >= 50) {
            this.f8030d = 0;
            int length = f8022h.list().length;
            if (length >= this.f8028b) {
                z10 = false;
            }
            this.f8031e = z10;
            if (!z10 && Log.isLoggable(q.f7991f, 5)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb2.append(length);
                sb2.append(", limit ");
                sb2.append(this.f8028b);
            }
        }
        return this.f8031e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        r5 = r2.f8029c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(int r3, int r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r0 = 0
            if (r5 == 0) goto L_0x001d
            boolean r5 = r2.f8027a
            if (r5 == 0) goto L_0x001d
            int r5 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r5 < r1) goto L_0x001d
            if (r6 == 0) goto L_0x0010
            goto L_0x001d
        L_0x0010:
            int r5 = r2.f8029c
            if (r3 < r5) goto L_0x001d
            if (r4 < r5) goto L_0x001d
            boolean r3 = r2.b()
            if (r3 == 0) goto L_0x001d
            r0 = 1
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.w.c(int, int, boolean, boolean):boolean");
    }

    @TargetApi(26)
    public boolean e(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean c10 = c(i10, i11, z10, z11);
        if (c10) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return c10;
    }
}
