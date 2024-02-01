package gd;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.tatv.baseapp.a;
import java.io.IOException;
import mc.a;

public class b {

    /* renamed from: g  reason: collision with root package name */
    public static final String f19195g = "AlertManager";

    /* renamed from: h  reason: collision with root package name */
    public static b f19196h;

    /* renamed from: a  reason: collision with root package name */
    public Context f19197a;

    /* renamed from: b  reason: collision with root package name */
    public f f19198b;

    /* renamed from: c  reason: collision with root package name */
    public a f19199c;

    /* renamed from: d  reason: collision with root package name */
    public MediaPlayer f19200d = null;

    /* renamed from: e  reason: collision with root package name */
    public Vibrator f19201e;

    /* renamed from: f  reason: collision with root package name */
    public double f19202f = 0.0d;

    public static b a() {
        if (f19196h == null) {
            f19196h = new b();
        }
        return f19196h;
    }

    public void b(Context context) {
        this.f19197a = context;
        this.f19201e = (Vibrator) context.getSystemService("vibrator");
        this.f19199c = new a(context);
        this.f19198b = new f(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r8.f19199c.s() != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        if (r8.f19199c.s() != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a1, code lost:
        if (r8.f19199c.s() != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d9, code lost:
        if (r8.f19199c.s() != false) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(gd.d r9) {
        /*
            r8 = this;
            mc.a r0 = r8.f19199c
            java.lang.String r0 = r0.c()
            java.lang.String r1 = "vi"
            boolean r0 = r0.equals(r1)
            r1 = 4661014508095930368(0x40af400000000000, double:4000.0)
            if (r0 == 0) goto L_0x00a4
            gd.f r0 = r8.f19198b
            float r3 = r9.b()
            boolean r0 = r0.g(r3)
            r3 = 1
            if (r0 == 0) goto L_0x0046
            long r4 = java.lang.System.currentTimeMillis()
            double r4 = (double) r4
            double r6 = r8.f19202f
            double r4 = r4 - r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e5
            mc.a r0 = r8.f19199c
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x003c
            int r9 = r9.a()
            int r9 = r9 + r3
            r8.e(r9, r3)
        L_0x003c:
            mc.a r9 = r8.f19199c
            boolean r9 = r9.s()
            if (r9 == 0) goto L_0x00de
            goto L_0x00db
        L_0x0046:
            gd.f r0 = r8.f19198b
            float r4 = r9.b()
            boolean r0 = r0.h(r4)
            if (r0 == 0) goto L_0x0078
            long r4 = java.lang.System.currentTimeMillis()
            double r4 = (double) r4
            double r6 = r8.f19202f
            double r4 = r4 - r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e5
            mc.a r0 = r8.f19199c
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x006f
            int r9 = r9.a()
            int r9 = r9 + r3
            r0 = -1
            r8.e(r9, r0)
        L_0x006f:
            mc.a r9 = r8.f19199c
            boolean r9 = r9.s()
            if (r9 == 0) goto L_0x00de
            goto L_0x00db
        L_0x0078:
            gd.f r0 = r8.f19198b
            int r9 = r9.d()
            boolean r9 = r0.j(r9)
            if (r9 == 0) goto L_0x00e5
            long r3 = java.lang.System.currentTimeMillis()
            double r3 = (double) r3
            double r5 = r8.f19202f
            double r3 = r3 - r5
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e5
            mc.a r9 = r8.f19199c
            boolean r9 = r9.l()
            if (r9 == 0) goto L_0x009b
            r8.d()
        L_0x009b:
            mc.a r9 = r8.f19199c
            boolean r9 = r9.s()
            if (r9 == 0) goto L_0x00de
            goto L_0x00db
        L_0x00a4:
            gd.f r0 = r8.f19198b
            float r3 = r9.b()
            boolean r0 = r0.i(r3)
            if (r0 != 0) goto L_0x00bc
            gd.f r0 = r8.f19198b
            int r9 = r9.d()
            boolean r9 = r0.j(r9)
            if (r9 == 0) goto L_0x00e5
        L_0x00bc:
            long r3 = java.lang.System.currentTimeMillis()
            double r3 = (double) r3
            double r5 = r8.f19202f
            double r3 = r3 - r5
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e5
            mc.a r9 = r8.f19199c
            boolean r9 = r9.l()
            if (r9 == 0) goto L_0x00d3
            r8.d()
        L_0x00d3:
            mc.a r9 = r8.f19199c
            boolean r9 = r9.s()
            if (r9 == 0) goto L_0x00de
        L_0x00db:
            r8.f()
        L_0x00de:
            long r0 = java.lang.System.currentTimeMillis()
            double r0 = (double) r0
            r8.f19202f = r0
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.b.c(gd.d):void");
    }

    public void d() {
        MediaPlayer mediaPlayer = this.f19200d;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer create = MediaPlayer.create(this.f19197a, a.n.didi);
        this.f19200d = create;
        create.start();
    }

    public void e(int i10, int i11) {
        MediaPlayer mediaPlayer;
        int i12;
        Context context;
        MediaPlayer mediaPlayer2 = this.f19200d;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        boolean z10 = false;
        if (i10 == 1) {
            context = this.f19197a;
            i12 = i11 == 1 ? a.n.left_front_tire_hight : a.n.left_front_tire_low;
        } else if (i10 == 2) {
            context = this.f19197a;
            i12 = i11 == 1 ? a.n.right_front_tire_hight : a.n.right_front_tire_low;
        } else if (i10 == 3) {
            context = this.f19197a;
            i12 = i11 == 1 ? a.n.left_back_tire_hight : a.n.left_back_tire_low;
        } else if (i10 != 4) {
            if (i10 == 5) {
                context = this.f19197a;
                i12 = i11 == 1 ? a.n.five_hight : a.n.five_low;
            }
            mediaPlayer = this.f19200d;
            if (mediaPlayer != null && z10) {
                mediaPlayer.start();
                return;
            }
        } else {
            context = this.f19197a;
            i12 = i11 == 1 ? a.n.right_back_tire_hight : a.n.right_back_tire_low;
        }
        this.f19200d = MediaPlayer.create(context, i12);
        z10 = true;
        mediaPlayer = this.f19200d;
        if (mediaPlayer != null) {
        }
    }

    public void f() {
        if (this.f19201e.hasVibrator()) {
            long[] jArr = {100, 100, 100, 1000, 100, 100, 100, 1000};
            if (Build.VERSION.SDK_INT >= 26) {
                this.f19201e.vibrate(VibrationEffect.createWaveform(jArr, -1));
            } else {
                this.f19201e.vibrate(jArr, -1);
            }
        }
    }

    public void g() {
        try {
            MediaPlayer mediaPlayer = this.f19200d;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                this.f19200d.stop();
                this.f19200d.prepare();
            }
        } catch (IOException e10) {
            e10.getMessage();
        }
    }

    public void h() {
        if (this.f19201e.hasVibrator()) {
            this.f19201e.cancel();
        }
    }
}
