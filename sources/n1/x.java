package n1;

import android.annotation.TargetApi;
import android.widget.SearchView;
import androidx.databinding.g;
import androidx.databinding.h;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:onQueryTextFocusChange", method = "setOnQueryTextFocusChangeListener", type = SearchView.class), @g(attribute = "android:onSearchClick", method = "setOnSearchClickListener", type = SearchView.class), @g(attribute = "android:onClose", method = "setOnCloseListener", type = SearchView.class)})
public class x {

    public class a implements SearchView.OnQueryTextListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f10789a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f10790b;

        public a(d dVar, c cVar) {
            this.f10789a = dVar;
            this.f10790b = cVar;
        }

        public boolean onQueryTextChange(String str) {
            c cVar = this.f10790b;
            if (cVar != null) {
                return cVar.onQueryTextChange(str);
            }
            return false;
        }

        public boolean onQueryTextSubmit(String str) {
            d dVar = this.f10789a;
            if (dVar != null) {
                return dVar.onQueryTextSubmit(str);
            }
            return false;
        }
    }

    public class b implements SearchView.OnSuggestionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f f10791a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f10792b;

        public b(f fVar, e eVar) {
            this.f10791a = fVar;
            this.f10792b = eVar;
        }

        public boolean onSuggestionClick(int i10) {
            e eVar = this.f10792b;
            if (eVar != null) {
                return eVar.onSuggestionClick(i10);
            }
            return false;
        }

        public boolean onSuggestionSelect(int i10) {
            f fVar = this.f10791a;
            if (fVar != null) {
                return fVar.onSuggestionSelect(i10);
            }
            return false;
        }
    }

    @TargetApi(11)
    public interface c {
        boolean onQueryTextChange(String str);
    }

    @TargetApi(11)
    public interface d {
        boolean onQueryTextSubmit(String str);
    }

    @TargetApi(11)
    public interface e {
        boolean onSuggestionClick(int i10);
    }

    @TargetApi(11)
    public interface f {
        boolean onSuggestionSelect(int i10);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onQueryTextSubmit", "android:onQueryTextChange"})
    public static void a(SearchView searchView, d dVar, c cVar) {
        if (dVar == null && cVar == null) {
            searchView.setOnQueryTextListener((SearchView.OnQueryTextListener) null);
        } else {
            searchView.setOnQueryTextListener(new a(dVar, cVar));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onSuggestionSelect", "android:onSuggestionClick"})
    public static void b(SearchView searchView, f fVar, e eVar) {
        if (fVar == null && eVar == null) {
            searchView.setOnSuggestionListener((SearchView.OnSuggestionListener) null);
        } else {
            searchView.setOnSuggestionListener(new b(fVar, eVar));
        }
    }
}
