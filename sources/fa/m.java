package fa;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import d.m0;
import d.o0;
import d.t0;
import i9.a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import z9.o;
import z9.s;

@t0(21)
public class m extends SharedElementCallback {
    @o0

    /* renamed from: f  reason: collision with root package name */
    public static WeakReference<View> f18819f;

    /* renamed from: a  reason: collision with root package name */
    public boolean f18820a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18821b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18822c = false;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public Rect f18823d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public d f18824e = new e();

    public class a extends u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Window f18825a;

        public a(Window window) {
            this.f18825a = window;
        }

        public void onTransitionEnd(Transition transition) {
            m.i(this.f18825a);
        }

        public void onTransitionStart(Transition transition) {
            m.h(this.f18825a);
        }
    }

    public class b extends u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f18827a;

        public b(Activity activity) {
            this.f18827a = activity;
        }

        public void onTransitionEnd(Transition transition) {
            View view;
            if (!(m.f18819f == null || (view = (View) m.f18819f.get()) == null)) {
                view.setAlpha(1.0f);
                WeakReference unused = m.f18819f = null;
            }
            this.f18827a.finish();
            this.f18827a.overridePendingTransition(0, 0);
        }
    }

    public class c extends u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Window f18829a;

        public c(Window window) {
            this.f18829a = window;
        }

        public void onTransitionStart(Transition transition) {
            m.h(this.f18829a);
        }
    }

    public interface d {
        @o0
        o a(@m0 View view);
    }

    public static class e implements d {
        @o0
        public o a(@m0 View view) {
            if (view instanceof s) {
                return ((s) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    public static void h(Window window) {
        window.getDecorView().getBackground().mutate().setColorFilter(n0.d.a(0, n0.e.CLEAR));
    }

    public static void i(Window window) {
        window.getDecorView().getBackground().mutate().clearColorFilter();
    }

    public static void o(Window window, l lVar) {
        window.setTransitionBackgroundFadeDuration(lVar.getDuration());
    }

    @o0
    public d e() {
        return this.f18824e;
    }

    public boolean f() {
        return this.f18822c;
    }

    public boolean g() {
        return this.f18821b;
    }

    public void j(@o0 d dVar) {
        this.f18824e = dVar;
    }

    public void k(boolean z10) {
        this.f18822c = z10;
    }

    public void l(boolean z10) {
        this.f18821b = z10;
    }

    public final void m(Window window) {
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof l) {
            l lVar = (l) sharedElementEnterTransition;
            if (!this.f18822c) {
                window.setSharedElementReenterTransition((Transition) null);
            }
            if (this.f18821b) {
                o(window, lVar);
                lVar.addListener(new a(window));
            }
        }
    }

    public final void n(Activity activity, Window window) {
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof l) {
            l lVar = (l) sharedElementReturnTransition;
            lVar.b0(true);
            lVar.addListener(new b(activity));
            if (this.f18821b) {
                o(window, lVar);
                lVar.addListener(new c(window));
            }
        }
    }

    @o0
    public Parcelable onCaptureSharedElementSnapshot(@m0 View view, @m0 Matrix matrix, @m0 RectF rectF) {
        f18819f = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @o0
    public View onCreateSnapshotView(@m0 Context context, @o0 Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        o a10;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (!(onCreateSnapshotView == null || (weakReference = f18819f) == null || this.f18824e == null || (view = weakReference.get()) == null || (a10 = this.f18824e.a(view)) == null)) {
            onCreateSnapshotView.setTag(a.h.mtrl_motion_snapshot_view, a10);
        }
        return onCreateSnapshotView;
    }

    public void onMapSharedElements(@m0 List<String> list, @m0 Map<String, View> map) {
        View view;
        Activity a10;
        if (!list.isEmpty() && !map.isEmpty() && (view = map.get(list.get(0))) != null && (a10 = com.google.android.material.internal.b.a(view.getContext())) != null) {
            Window window = a10.getWindow();
            if (this.f18820a) {
                m(window);
            } else {
                n(a10, window);
            }
        }
    }

    public void onSharedElementEnd(@m0 List<String> list, @m0 List<View> list2, @m0 List<View> list3) {
        if (!list2.isEmpty()) {
            int i10 = a.h.mtrl_motion_snapshot_view;
            if (list2.get(0).getTag(i10) instanceof View) {
                list2.get(0).setTag(i10, (Object) null);
            }
        }
        if (!this.f18820a && !list2.isEmpty()) {
            this.f18823d = v.i(list2.get(0));
        }
        this.f18820a = false;
    }

    public void onSharedElementStart(@m0 List<String> list, @m0 List<View> list2, @m0 List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(a.h.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (!this.f18820a && !list2.isEmpty() && this.f18823d != null) {
            View view = list2.get(0);
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f18823d.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f18823d.height(), 1073741824));
            Rect rect = this.f18823d;
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }
}
