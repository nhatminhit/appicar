package n1;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AdapterView.class), @g(attribute = "android:onItemLongClick", method = "setOnItemLongClickListener", type = AdapterView.class)})
@q({@p(attribute = "android:selectedItemPosition", type = AdapterView.class), @p(attribute = "android:selection", event = "android:selectedItemPositionAttrChanged", method = "getSelectedItemPosition", type = AdapterView.class)})
public class e {

    public interface a {
        void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10);
    }

    public static class b implements AdapterView.OnItemSelectedListener {
        public final a O;
        public final c P;
        public final o Q;

        public b(a aVar, c cVar, o oVar) {
            this.O = aVar;
            this.P = cVar;
            this.Q = oVar;
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            a aVar = this.O;
            if (aVar != null) {
                aVar.onItemSelected(adapterView, view, i10, j10);
            }
            o oVar = this.Q;
            if (oVar != null) {
                oVar.a();
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
            c cVar = this.P;
            if (cVar != null) {
                cVar.onNothingSelected(adapterView);
            }
            o oVar = this.Q;
            if (oVar != null) {
                oVar.a();
            }
        }
    }

    public interface c {
        void onNothingSelected(AdapterView<?> adapterView);
    }

    @d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected", "android:selectedItemPositionAttrChanged"})
    public static void a(AdapterView adapterView, a aVar, c cVar, o oVar) {
        if (aVar == null && cVar == null && oVar == null) {
            adapterView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        } else {
            adapterView.setOnItemSelectedListener(new b(aVar, cVar, oVar));
        }
    }

    @d({"android:selectedItemPosition"})
    public static void b(AdapterView adapterView, int i10) {
        if (adapterView.getSelectedItemPosition() != i10) {
            adapterView.setSelection(i10);
        }
    }

    @d({"android:selectedItemPosition", "android:adapter"})
    public static void c(AdapterView adapterView, int i10, Adapter adapter) {
        if (adapter != adapterView.getAdapter()) {
            adapterView.setAdapter(adapter);
        } else if (adapterView.getSelectedItemPosition() == i10) {
            return;
        }
        adapterView.setSelection(i10);
    }

    @d({"android:selection"})
    public static void d(AdapterView adapterView, int i10) {
        b(adapterView, i10);
    }

    @d({"android:selection", "android:adapter"})
    public static void e(AdapterView adapterView, int i10, Adapter adapter) {
        c(adapterView, i10, adapter);
    }
}
