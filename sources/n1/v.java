package n1;

import android.widget.RadioGroup;
import androidx.databinding.d;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;

@x0({x0.a.LIBRARY})
@q({@p(attribute = "android:checkedButton", method = "getCheckedRadioButtonId", type = RadioGroup.class)})
public class v {

    public class a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RadioGroup.OnCheckedChangeListener f10785a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f10786b;

        public a(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, o oVar) {
            this.f10785a = onCheckedChangeListener;
            this.f10786b = oVar;
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i10) {
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f10785a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(radioGroup, i10);
            }
            this.f10786b.a();
        }
    }

    @d({"android:checkedButton"})
    public static void a(RadioGroup radioGroup, int i10) {
        if (i10 != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i10);
        }
    }

    @d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedButtonAttrChanged"})
    public static void b(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener, o oVar) {
        if (oVar == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
