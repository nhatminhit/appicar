package n1;

import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import androidx.databinding.d;
import androidx.databinding.g;
import androidx.databinding.h;
import androidx.databinding.o;
import d.x0;
import n1.e;

@x0({x0.a.LIBRARY})
@h({@g(attribute = "android:completionThreshold", method = "setThreshold", type = AutoCompleteTextView.class), @g(attribute = "android:popupBackground", method = "setDropDownBackgroundDrawable", type = AutoCompleteTextView.class), @g(attribute = "android:onDismiss", method = "setOnDismissListener", type = AutoCompleteTextView.class), @g(attribute = "android:onItemClick", method = "setOnItemClickListener", type = AutoCompleteTextView.class)})
public class f {

    public class a implements AutoCompleteTextView.Validator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f10762a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f10763b;

        public a(c cVar, b bVar) {
            this.f10762a = cVar;
            this.f10763b = bVar;
        }

        public CharSequence fixText(CharSequence charSequence) {
            b bVar = this.f10763b;
            return bVar != null ? bVar.fixText(charSequence) : charSequence;
        }

        public boolean isValid(CharSequence charSequence) {
            c cVar = this.f10762a;
            if (cVar != null) {
                return cVar.isValid(charSequence);
            }
            return true;
        }
    }

    public interface b {
        CharSequence fixText(CharSequence charSequence);
    }

    public interface c {
        boolean isValid(CharSequence charSequence);
    }

    @d(requireAll = false, value = {"android:onItemSelected", "android:onNothingSelected"})
    public static void a(AutoCompleteTextView autoCompleteTextView, e.a aVar, e.c cVar) {
        if (aVar == null && cVar == null) {
            autoCompleteTextView.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) null);
        } else {
            autoCompleteTextView.setOnItemSelectedListener(new e.b(aVar, cVar, (o) null));
        }
    }

    @d(requireAll = false, value = {"android:fixText", "android:isValid"})
    public static void b(AutoCompleteTextView autoCompleteTextView, b bVar, c cVar) {
        if (bVar == null && cVar == null) {
            autoCompleteTextView.setValidator((AutoCompleteTextView.Validator) null);
        } else {
            autoCompleteTextView.setValidator(new a(cVar, bVar));
        }
    }
}
