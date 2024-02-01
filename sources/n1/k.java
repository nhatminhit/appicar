package n1;

import android.widget.CompoundButton;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:buttonTint", method = "setButtonTintList", type = CompoundButton.class), @g(attribute = "android:onCheckedChanged", method = "setOnCheckedChangeListener", type = CompoundButton.class)})
@q({@p(attribute = "android:checked", type = CompoundButton.class)})
public class k {

    public class a implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CompoundButton.OnCheckedChangeListener f10776a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f10777b;

        public a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener, o oVar) {
            this.f10776a = onCheckedChangeListener;
            this.f10777b = oVar;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f10776a;
            if (onCheckedChangeListener != null) {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z10);
            }
            this.f10777b.a();
        }
    }

    @d({"android:checked"})
    public static void a(CompoundButton compoundButton, boolean z10) {
        if (compoundButton.isChecked() != z10) {
            compoundButton.setChecked(z10);
        }
    }

    @d(requireAll = false, value = {"android:onCheckedChanged", "android:checkedAttrChanged"})
    public static void b(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, o oVar) {
        if (oVar == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new a(onCheckedChangeListener, oVar));
        }
    }
}
