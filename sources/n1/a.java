package n1;

import android.widget.AbsListView;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:listSelector", method = "setSelector", type = AbsListView.class), @g(attribute = "android:scrollingCache", method = "setScrollingCacheEnabled", type = AbsListView.class), @g(attribute = "android:smoothScrollbar", method = "setSmoothScrollbarEnabled", type = AbsListView.class), @g(attribute = "android:onMovedToScrapHeap", method = "setRecyclerListener", type = AbsListView.class)})
public class a {

    /* renamed from: n1.a$a  reason: collision with other inner class name */
    public class C0185a implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f10758a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f10759b;

        public C0185a(c cVar, b bVar) {
            this.f10758a = cVar;
            this.f10759b = bVar;
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            b bVar = this.f10759b;
            if (bVar != null) {
                bVar.onScroll(absListView, i10, i11, i12);
            }
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
            c cVar = this.f10758a;
            if (cVar != null) {
                cVar.onScrollStateChanged(absListView, i10);
            }
        }
    }

    public interface b {
        void onScroll(AbsListView absListView, int i10, int i11, int i12);
    }

    public interface c {
        void onScrollStateChanged(AbsListView absListView, int i10);
    }

    @d(requireAll = false, value = {"android:onScroll", "android:onScrollStateChanged"})
    public static void a(AbsListView absListView, b bVar, c cVar) {
        absListView.setOnScrollListener(new C0185a(cVar, bVar));
    }
}
