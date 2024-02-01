package n1;

import android.util.SparseBooleanArray;
import android.widget.TableLayout;
import androidx.databinding.d;
import d.x0;
import java.util.regex.Pattern;

@x0({x0.a.LIBRARY})
public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static Pattern f10760a = Pattern.compile("\\s*,\\s*");

    /* renamed from: b  reason: collision with root package name */
    public static final int f10761b = 20;

    public static SparseBooleanArray a(CharSequence charSequence) {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        if (charSequence == null) {
            return sparseBooleanArray;
        }
        for (String parseInt : f10760a.split(charSequence)) {
            try {
                int parseInt2 = Integer.parseInt(parseInt);
                if (parseInt2 >= 0) {
                    sparseBooleanArray.put(parseInt2, true);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return sparseBooleanArray;
    }

    @d({"android:collapseColumns"})
    public static void b(TableLayout tableLayout, CharSequence charSequence) {
        SparseBooleanArray a10 = a(charSequence);
        for (int i10 = 0; i10 < 20; i10++) {
            boolean z10 = a10.get(i10, false);
            if (z10 != tableLayout.isColumnCollapsed(i10)) {
                tableLayout.setColumnCollapsed(i10, z10);
            }
        }
    }

    @d({"android:shrinkColumns"})
    public static void c(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setShrinkAllColumns(false);
            SparseBooleanArray a10 = a(charSequence);
            int size = a10.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = a10.keyAt(i10);
                boolean valueAt = a10.valueAt(i10);
                if (valueAt) {
                    tableLayout.setColumnShrinkable(keyAt, valueAt);
                }
            }
            return;
        }
        tableLayout.setShrinkAllColumns(true);
    }

    @d({"android:stretchColumns"})
    public static void d(TableLayout tableLayout, CharSequence charSequence) {
        if (charSequence == null || charSequence.length() <= 0 || charSequence.charAt(0) != '*') {
            tableLayout.setStretchAllColumns(false);
            SparseBooleanArray a10 = a(charSequence);
            int size = a10.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = a10.keyAt(i10);
                boolean valueAt = a10.valueAt(i10);
                if (valueAt) {
                    tableLayout.setColumnStretchable(keyAt, valueAt);
                }
            }
            return;
        }
        tableLayout.setStretchAllColumns(true);
    }
}
