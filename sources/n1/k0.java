package n1;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.databinding.h;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@androidx.databinding.g(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
public class k0 {

    public class a implements ViewGroup.OnHierarchyChangeListener {
        public final /* synthetic */ f O;
        public final /* synthetic */ g P;

        public a(f fVar, g gVar) {
            this.O = fVar;
            this.P = gVar;
        }

        public void onChildViewAdded(View view, View view2) {
            f fVar = this.O;
            if (fVar != null) {
                fVar.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            g gVar = this.P;
            if (gVar != null) {
                gVar.onChildViewRemoved(view, view2);
            }
        }
    }

    public class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ e f10778a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f10779b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ d f10780c;

        public b(e eVar, c cVar, d dVar) {
            this.f10778a = eVar;
            this.f10779b = cVar;
            this.f10780c = dVar;
        }

        public void onAnimationEnd(Animation animation) {
            c cVar = this.f10779b;
            if (cVar != null) {
                cVar.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            d dVar = this.f10780c;
            if (dVar != null) {
                dVar.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            e eVar = this.f10778a;
            if (eVar != null) {
                eVar.onAnimationStart(animation);
            }
        }
    }

    public interface c {
        void onAnimationEnd(Animation animation);
    }

    public interface d {
        void onAnimationRepeat(Animation animation);
    }

    public interface e {
        void onAnimationStart(Animation animation);
    }

    public interface f {
        void onChildViewAdded(View view, View view2);
    }

    public interface g {
        void onChildViewRemoved(View view, View view2);
    }

    @TargetApi(11)
    @androidx.databinding.d({"android:animateLayoutChanges"})
    public static void a(ViewGroup viewGroup, boolean z10) {
        viewGroup.setLayoutTransition(z10 ? new LayoutTransition() : null);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void b(ViewGroup viewGroup, e eVar, c cVar, d dVar) {
        if (eVar == null && cVar == null && dVar == null) {
            viewGroup.setLayoutAnimationListener((Animation.AnimationListener) null);
        } else {
            viewGroup.setLayoutAnimationListener(new b(eVar, cVar, dVar));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void c(ViewGroup viewGroup, f fVar, g gVar) {
        if (fVar == null && gVar == null) {
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new a(fVar, gVar));
        }
    }
}
