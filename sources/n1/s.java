package n1;

import android.widget.NumberPicker;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:format", method = "setFormatter", type = NumberPicker.class), @g(attribute = "android:onScrollStateChange", method = "setOnScrollListener", type = NumberPicker.class)})
@q({@p(attribute = "android:value", type = NumberPicker.class)})
public class s {

    public class a implements NumberPicker.OnValueChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NumberPicker.OnValueChangeListener f10782a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f10783b;

        public a(NumberPicker.OnValueChangeListener onValueChangeListener, o oVar) {
            this.f10782a = onValueChangeListener;
            this.f10783b = oVar;
        }

        public void onValueChange(NumberPicker numberPicker, int i10, int i11) {
            NumberPicker.OnValueChangeListener onValueChangeListener = this.f10782a;
            if (onValueChangeListener != null) {
                onValueChangeListener.onValueChange(numberPicker, i10, i11);
            }
            this.f10783b.a();
        }
    }

    @d(requireAll = false, value = {"android:onValueChange", "android:valueAttrChanged"})
    public static void a(NumberPicker numberPicker, NumberPicker.OnValueChangeListener onValueChangeListener, o oVar) {
        if (oVar == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new a(onValueChangeListener, oVar));
        }
    }

    @d({"android:value"})
    public static void b(NumberPicker numberPicker, int i10) {
        if (numberPicker.getValue() != i10) {
            numberPicker.setValue(i10);
        }
    }
}
