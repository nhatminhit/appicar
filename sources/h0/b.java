package h0;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.DragEvent;
import android.view.View;
import d.b0;
import d.e0;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import h0.z2;
import i0.m;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class b extends i0.d {

    /* renamed from: e  reason: collision with root package name */
    public static e f8357e;

    public class a implements Runnable {
        public final /* synthetic */ String[] O;
        public final /* synthetic */ Activity P;
        public final /* synthetic */ int Q;

        public a(String[] strArr, Activity activity, int i10) {
            this.O = strArr;
            this.P = activity;
            this.Q = i10;
        }

        public void run() {
            int[] iArr = new int[this.O.length];
            PackageManager packageManager = this.P.getPackageManager();
            String packageName = this.P.getPackageName();
            int length = this.O.length;
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = packageManager.checkPermission(this.O[i10], packageName);
            }
            ((d) this.P).onRequestPermissionsResult(this.Q, this.O, iArr);
        }
    }

    /* renamed from: h0.b$b  reason: collision with other inner class name */
    public class C0139b implements Runnable {
        public final /* synthetic */ Activity O;

        public C0139b(Activity activity) {
            this.O = activity;
        }

        public void run() {
            if (!this.O.isFinishing() && !h.i(this.O)) {
                this.O.recreate();
            }
        }
    }

    @t0(30)
    public static class c {
        public static void a(@m0 Activity activity, @o0 m mVar, @o0 Bundle bundle) {
            activity.setLocusContext(mVar == null ? null : mVar.c(), bundle);
        }
    }

    public interface d {
        void onRequestPermissionsResult(int i10, @m0 String[] strArr, @m0 int[] iArr);
    }

    public interface e {
        boolean a(@m0 Activity activity, @e0(from = 0) int i10, int i11, @o0 Intent intent);

        boolean b(@m0 Activity activity, @m0 String[] strArr, @e0(from = 0) int i10);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public interface f {
        void g(int i10);
    }

    @t0(21)
    public static class g extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        public final z2 f8358a;

        public class a implements z2.a {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f8359a;

            public a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.f8359a = onSharedElementsReadyListener;
            }

            public void onSharedElementsReady() {
                this.f8359a.onSharedElementsReady();
            }
        }

        public g(z2 z2Var) {
            this.f8358a = z2Var;
        }

        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f8358a.b(view, matrix, rectF);
        }

        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f8358a.c(context, parcelable);
        }

        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f8358a.d(list, map);
        }

        public void onRejectSharedElements(List<View> list) {
            this.f8358a.e(list);
        }

        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f8358a.f(list, list2, list3);
        }

        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f8358a.g(list, list2, list3);
        }

        @t0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f8358a.h(list, list2, new a(onSharedElementsReadyListener));
        }
    }

    public static void A(@m0 Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void B(@m0 Activity activity) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            if (i10 <= 23) {
                new Handler(activity.getMainLooper()).post(new C0139b(activity));
                return;
            } else if (h.i(activity)) {
                return;
            }
        }
        activity.recreate();
    }

    @o0
    public static f1.g C(Activity activity, DragEvent dragEvent) {
        return f1.g.b(activity, dragEvent);
    }

    public static void D(@m0 Activity activity, @m0 String[] strArr, @e0(from = 0) int i10) {
        e eVar = f8357e;
        if (eVar == null || !eVar.b(activity, strArr, i10)) {
            int length = strArr.length;
            int i11 = 0;
            while (i11 < length) {
                if (!TextUtils.isEmpty(strArr[i11])) {
                    i11++;
                } else {
                    throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(strArr) + " must not contain null or empty values");
                }
            }
            if (activity instanceof f) {
                ((f) activity).g(i10);
            }
            activity.requestPermissions(strArr, i10);
        }
    }

    @m0
    public static <T extends View> T E(@m0 Activity activity, @b0 int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return activity.requireViewById(i10);
        }
        T findViewById = activity.findViewById(i10);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void F(@m0 Activity activity, @o0 z2 z2Var) {
        activity.setEnterSharedElementCallback(z2Var != null ? new g(z2Var) : null);
    }

    public static void G(@m0 Activity activity, @o0 z2 z2Var) {
        activity.setExitSharedElementCallback(z2Var != null ? new g(z2Var) : null);
    }

    public static void H(@m0 Activity activity, @o0 m mVar, @o0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(activity, mVar, bundle);
        }
    }

    public static void I(@o0 e eVar) {
        f8357e = eVar;
    }

    public static boolean J(@m0 Activity activity, @m0 String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static void K(@m0 Activity activity, @m0 Intent intent, int i10, @o0 Bundle bundle) {
        activity.startActivityForResult(intent, i10, bundle);
    }

    public static void L(@m0 Activity activity, @m0 IntentSender intentSender, int i10, @o0 Intent intent, int i11, int i12, int i13, @o0 Bundle bundle) throws IntentSender.SendIntentException {
        activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public static void M(@m0 Activity activity) {
        activity.startPostponedEnterTransition();
    }

    public static void v(@m0 Activity activity) {
        activity.finishAffinity();
    }

    public static void w(@m0 Activity activity) {
        activity.finishAfterTransition();
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static e x() {
        return f8357e;
    }

    @o0
    public static Uri y(@m0 Activity activity) {
        return activity.getReferrer();
    }

    @Deprecated
    public static boolean z(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }
}
