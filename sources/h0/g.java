package h0;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import d.m0;
import d.o0;
import d.t0;
import e1.j;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8383a = "android.activity.usage_time";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8384b = "android.usage_time_packages";

    @t0(16)
    public static class a extends g {

        /* renamed from: c  reason: collision with root package name */
        public final ActivityOptions f8385c;

        public a(ActivityOptions activityOptions) {
            this.f8385c = activityOptions;
        }

        public Rect a() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return this.f8385c.getLaunchBounds();
        }

        public void j(@m0 PendingIntent pendingIntent) {
            this.f8385c.requestUsageTimeReport(pendingIntent);
        }

        @m0
        public g k(@o0 Rect rect) {
            return Build.VERSION.SDK_INT < 24 ? this : new a(this.f8385c.setLaunchBounds(rect));
        }

        public Bundle l() {
            return this.f8385c.toBundle();
        }

        public void m(@m0 g gVar) {
            if (gVar instanceof a) {
                this.f8385c.update(((a) gVar).f8385c);
            }
        }
    }

    @m0
    public static g b() {
        return new a(ActivityOptions.makeBasic());
    }

    @m0
    public static g c(@m0 View view, int i10, int i11, int i12, int i13) {
        return new a(ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13));
    }

    @m0
    public static g d(@m0 Context context, int i10, int i11) {
        return new a(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    @m0
    public static g e(@m0 View view, int i10, int i11, int i12, int i13) {
        return new a(ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13));
    }

    @m0
    public static g f(@m0 Activity activity, @m0 View view, @m0 String str) {
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    @m0
    public static g g(@m0 Activity activity, j<View, String>... jVarArr) {
        Pair[] pairArr = null;
        if (jVarArr != null) {
            pairArr = new Pair[jVarArr.length];
            for (int i10 = 0; i10 < jVarArr.length; i10++) {
                j<View, String> jVar = jVarArr[i10];
                pairArr[i10] = Pair.create((View) jVar.f6732a, (String) jVar.f6733b);
            }
        }
        return new a(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    @m0
    public static g h() {
        return new a(ActivityOptions.makeTaskLaunchBehind());
    }

    @m0
    public static g i(@m0 View view, @m0 Bitmap bitmap, int i10, int i11) {
        return new a(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11));
    }

    @o0
    public Rect a() {
        return null;
    }

    public void j(@m0 PendingIntent pendingIntent) {
    }

    @m0
    public g k(@o0 Rect rect) {
        return this;
    }

    @o0
    public Bundle l() {
        return null;
    }

    public void m(@m0 g gVar) {
    }
}
