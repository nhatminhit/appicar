package n1;

import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.databinding.d;
import d.x0;
import java.util.List;

@x0({x0.a.LIBRARY})
public class c {
    @d({"android:entries"})
    public static <T> void a(AbsSpinner absSpinner, List<T> list) {
        if (list != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            if (adapter instanceof t) {
                ((t) adapter).b(list);
            } else {
                absSpinner.setAdapter(new t(absSpinner.getContext(), list, 17367048, 17367049, 0));
            }
        } else {
            absSpinner.setAdapter((SpinnerAdapter) null);
        }
    }

    @d({"android:entries"})
    public static <T extends CharSequence> void b(AbsSpinner absSpinner, T[] tArr) {
        if (tArr != null) {
            SpinnerAdapter adapter = absSpinner.getAdapter();
            boolean z10 = false;
            if (adapter != null && adapter.getCount() == tArr.length) {
                int i10 = 0;
                while (true) {
                    if (i10 >= tArr.length) {
                        break;
                    } else if (!tArr[i10].equals(adapter.getItem(i10))) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            z10 = true;
            if (z10) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(absSpinner.getContext(), 17367048, tArr);
                arrayAdapter.setDropDownViewResource(17367049);
                absSpinner.setAdapter(arrayAdapter);
                return;
            }
            return;
        }
        absSpinner.setAdapter((SpinnerAdapter) null);
    }
}
