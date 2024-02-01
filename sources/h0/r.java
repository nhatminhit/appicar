package h0;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import android.view.Window$OnFrameMetricsAvailableListener;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class r {

    /* renamed from: b  reason: collision with root package name */
    public static final int f8467b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f8468c = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final int f8469d = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final int f8470e = 3;

    /* renamed from: f  reason: collision with root package name */
    public static final int f8471f = 4;

    /* renamed from: g  reason: collision with root package name */
    public static final int f8472g = 5;

    /* renamed from: h  reason: collision with root package name */
    public static final int f8473h = 6;

    /* renamed from: i  reason: collision with root package name */
    public static final int f8474i = 7;

    /* renamed from: j  reason: collision with root package name */
    public static final int f8475j = 8;

    /* renamed from: k  reason: collision with root package name */
    public static final int f8476k = 8;

    /* renamed from: l  reason: collision with root package name */
    public static final int f8477l = 1;

    /* renamed from: m  reason: collision with root package name */
    public static final int f8478m = 2;

    /* renamed from: n  reason: collision with root package name */
    public static final int f8479n = 4;

    /* renamed from: o  reason: collision with root package name */
    public static final int f8480o = 8;

    /* renamed from: p  reason: collision with root package name */
    public static final int f8481p = 16;

    /* renamed from: q  reason: collision with root package name */
    public static final int f8482q = 32;

    /* renamed from: r  reason: collision with root package name */
    public static final int f8483r = 64;

    /* renamed from: s  reason: collision with root package name */
    public static final int f8484s = 128;

    /* renamed from: t  reason: collision with root package name */
    public static final int f8485t = 256;

    /* renamed from: u  reason: collision with root package name */
    public static final int f8486u = 511;

    /* renamed from: a  reason: collision with root package name */
    public b f8487a;

    @t0(24)
    public static class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public static final int f8488e = 1000000;

        /* renamed from: f  reason: collision with root package name */
        public static final int f8489f = 500000;

        /* renamed from: g  reason: collision with root package name */
        public static HandlerThread f8490g;

        /* renamed from: h  reason: collision with root package name */
        public static Handler f8491h;

        /* renamed from: a  reason: collision with root package name */
        public int f8492a;

        /* renamed from: b  reason: collision with root package name */
        public SparseIntArray[] f8493b = new SparseIntArray[9];

        /* renamed from: c  reason: collision with root package name */
        public ArrayList<WeakReference<Activity>> f8494c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public Window$OnFrameMetricsAvailableListener f8495d = new C0140a();

        /* renamed from: h0.r$a$a  reason: collision with other inner class name */
        public class C0140a implements Window$OnFrameMetricsAvailableListener {
            public C0140a() {
            }

            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i10) {
                a aVar = a.this;
                if ((aVar.f8492a & 1) != 0) {
                    aVar.f(aVar.f8493b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f8492a & 2) != 0) {
                    aVar2.f(aVar2.f8493b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f8492a & 4) != 0) {
                    aVar3.f(aVar3.f8493b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f8492a & 8) != 0) {
                    aVar4.f(aVar4.f8493b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f8492a & 16) != 0) {
                    aVar5.f(aVar5.f8493b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f8492a & 64) != 0) {
                    aVar6.f(aVar6.f8493b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f8492a & 32) != 0) {
                    aVar7.f(aVar7.f8493b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f8492a & 128) != 0) {
                    aVar8.f(aVar8.f8493b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f8492a & 256) != 0) {
                    aVar9.f(aVar9.f8493b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i10) {
            this.f8492a = i10;
        }

        public void a(Activity activity) {
            if (f8490g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f8490g = handlerThread;
                handlerThread.start();
                f8491h = new Handler(f8490g.getLooper());
            }
            for (int i10 = 0; i10 <= 8; i10++) {
                SparseIntArray[] sparseIntArrayArr = this.f8493b;
                if (sparseIntArrayArr[i10] == null && (this.f8492a & (1 << i10)) != 0) {
                    sparseIntArrayArr[i10] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f8495d, f8491h);
            this.f8494c.add(new WeakReference(activity));
        }

        public SparseIntArray[] b() {
            return this.f8493b;
        }

        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f8494c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference next = it.next();
                if (next.get() == activity) {
                    this.f8494c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f8495d);
            return this.f8493b;
        }

        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f8493b;
            this.f8493b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        public SparseIntArray[] e() {
            for (int size = this.f8494c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = this.f8494c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f8495d);
                    this.f8494c.remove(size);
                }
            }
            return this.f8493b;
        }

        public void f(SparseIntArray sparseIntArray, long j10) {
            if (sparseIntArray != null) {
                int i10 = (int) ((500000 + j10) / 1000000);
                if (j10 >= 0) {
                    sparseIntArray.put(i10, sparseIntArray.get(i10) + 1);
                }
            }
        }
    }

    public static class b {
        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public r() {
        this(1);
    }

    public r(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f8487a = new a(i10);
        } else {
            this.f8487a = new b();
        }
    }

    public void a(@m0 Activity activity) {
        this.f8487a.a(activity);
    }

    @o0
    public SparseIntArray[] b() {
        return this.f8487a.b();
    }

    @o0
    public SparseIntArray[] c(@m0 Activity activity) {
        return this.f8487a.c(activity);
    }

    @o0
    public SparseIntArray[] d() {
        return this.f8487a.d();
    }

    @o0
    public SparseIntArray[] e() {
        return this.f8487a.e();
    }
}
