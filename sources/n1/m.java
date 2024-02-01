package n1;

import android.widget.DatePicker;
import androidx.databinding.d;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;
import p1.c;

@x0({x0.a.LIBRARY})
@q({@p(attribute = "android:year", type = DatePicker.class), @p(attribute = "android:month", type = DatePicker.class), @p(attribute = "android:day", method = "getDayOfMonth", type = DatePicker.class)})
public class m {

    public static class b implements DatePicker.OnDateChangedListener {
        public DatePicker.OnDateChangedListener O;
        public o P;
        public o Q;
        public o R;

        public b() {
        }

        public void a(DatePicker.OnDateChangedListener onDateChangedListener, o oVar, o oVar2, o oVar3) {
            this.O = onDateChangedListener;
            this.P = oVar;
            this.Q = oVar2;
            this.R = oVar3;
        }

        public void onDateChanged(DatePicker datePicker, int i10, int i11, int i12) {
            DatePicker.OnDateChangedListener onDateChangedListener = this.O;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i10, i11, i12);
            }
            o oVar = this.P;
            if (oVar != null) {
                oVar.a();
            }
            o oVar2 = this.Q;
            if (oVar2 != null) {
                oVar2.a();
            }
            o oVar3 = this.R;
            if (oVar3 != null) {
                oVar3.a();
            }
        }
    }

    @d(requireAll = false, value = {"android:year", "android:month", "android:day", "android:onDateChanged", "android:yearAttrChanged", "android:monthAttrChanged", "android:dayAttrChanged"})
    public static void a(DatePicker datePicker, int i10, int i11, int i12, DatePicker.OnDateChangedListener onDateChangedListener, o oVar, o oVar2, o oVar3) {
        if (i10 == 0) {
            i10 = datePicker.getYear();
        }
        if (i12 == 0) {
            i12 = datePicker.getDayOfMonth();
        }
        if (oVar == null && oVar2 == null && oVar3 == null) {
            datePicker.init(i10, i11, i12, onDateChangedListener);
            return;
        }
        int i13 = c.g.onDateChanged;
        b bVar = (b) r.a(datePicker, i13);
        if (bVar == null) {
            bVar = new b();
            r.b(datePicker, bVar, i13);
        }
        bVar.a(onDateChangedListener, oVar, oVar2, oVar3);
        datePicker.init(i10, i11, i12, bVar);
    }
}
