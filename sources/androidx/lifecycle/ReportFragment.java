package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.p;
import d.t0;
import d.x0;
import fh.g;
import fh.h;
import h0.u0;
import ve.m;
import xe.l0;
import xe.w;

@x0({x0.a.Q})
public class ReportFragment extends Fragment {
    @g
    public static final b P = new b((w) null);
    @g
    public static final String Q = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
    @h
    public a O;

    public interface a {
        void b();

        void c();

        void onCreate();
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @m
        public static /* synthetic */ void c(Activity activity) {
        }

        @m
        public final void a(@g Activity activity, @g p.a aVar) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            l0.p(aVar, u0.f8532r0);
            if (activity instanceof c0) {
                ((c0) activity).getLifecycle().l(aVar);
            } else if (activity instanceof y) {
                p lifecycle = ((y) activity).getLifecycle();
                if (lifecycle instanceof a0) {
                    ((a0) lifecycle).l(aVar);
                }
            }
        }

        @g
        @ve.h(name = "get")
        public final ReportFragment b(@g Activity activity) {
            l0.p(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag(ReportFragment.Q);
            l0.n(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (ReportFragment) findFragmentByTag;
        }

        @m
        public final void d(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag(ReportFragment.Q) == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), ReportFragment.Q).commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    @t0(29)
    public static final class c implements Application.ActivityLifecycleCallbacks {
        @g
        public static final a Companion = new a((w) null);

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(w wVar) {
                this();
            }

            @m
            public final void a(@g Activity activity) {
                l0.p(activity, androidx.appcompat.widget.c.f1244r);
                l0.a(activity, new c());
            }
        }

        @m
        public static final void registerIn(@g Activity activity) {
            Companion.a(activity);
        }

        public void onActivityCreated(@g Activity activity, @h Bundle bundle) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
        }

        public void onActivityDestroyed(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
        }

        public void onActivityPaused(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
        }

        public void onActivityPostCreated(@g Activity activity, @h Bundle bundle) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            ReportFragment.P.a(activity, p.a.ON_CREATE);
        }

        public void onActivityPostResumed(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            ReportFragment.P.a(activity, p.a.ON_RESUME);
        }

        public void onActivityPostStarted(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            ReportFragment.P.a(activity, p.a.ON_START);
        }

        public void onActivityPreDestroyed(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            ReportFragment.P.a(activity, p.a.ON_DESTROY);
        }

        public void onActivityPrePaused(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            ReportFragment.P.a(activity, p.a.ON_PAUSE);
        }

        public void onActivityPreStopped(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            ReportFragment.P.a(activity, p.a.ON_STOP);
        }

        public void onActivityResumed(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
        }

        public void onActivitySaveInstanceState(@g Activity activity, @g Bundle bundle) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
            l0.p(bundle, "bundle");
        }

        public void onActivityStarted(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
        }

        public void onActivityStopped(@g Activity activity) {
            l0.p(activity, androidx.appcompat.widget.c.f1244r);
        }
    }

    @m
    public static final void b(@g Activity activity, @g p.a aVar) {
        P.a(activity, aVar);
    }

    @g
    @ve.h(name = "get")
    public static final ReportFragment f(@g Activity activity) {
        return P.b(activity);
    }

    @m
    public static final void g(@g Activity activity) {
        P.d(activity);
    }

    public final void a(p.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = P;
            Activity activity = getActivity();
            l0.o(activity, androidx.appcompat.widget.c.f1244r);
            bVar.a(activity, aVar);
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.c();
        }
    }

    public final void e(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void h(@h a aVar) {
        this.O = aVar;
    }

    public void onActivityCreated(@h Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.O);
        a(p.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(p.a.ON_DESTROY);
        this.O = null;
    }

    public void onPause() {
        super.onPause();
        a(p.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        d(this.O);
        a(p.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        e(this.O);
        a(p.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(p.a.ON_STOP);
    }
}
