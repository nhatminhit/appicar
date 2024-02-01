package n1;

import android.widget.TimePicker;
import androidx.databinding.d;
import androidx.databinding.n;
import androidx.databinding.o;
import d.x0;

@x0({x0.a.LIBRARY})
public class g0 {

    public class a implements TimePicker.OnTimeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TimePicker.OnTimeChangedListener f10770a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f10771b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ o f10772c;

        public a(TimePicker.OnTimeChangedListener onTimeChangedListener, o oVar, o oVar2) {
            this.f10770a = onTimeChangedListener;
            this.f10771b = oVar;
            this.f10772c = oVar2;
        }

        public void onTimeChanged(TimePicker timePicker, int i10, int i11) {
            TimePicker.OnTimeChangedListener onTimeChangedListener = this.f10770a;
            if (onTimeChangedListener != null) {
                onTimeChangedListener.onTimeChanged(timePicker, i10, i11);
            }
            o oVar = this.f10771b;
            if (oVar != null) {
                oVar.a();
            }
            o oVar2 = this.f10772c;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
    }

    @n(attribute = "android:hour")
    public static int a(TimePicker timePicker) {
        return timePicker.getHour();
    }

    @n(attribute = "android:minute")
    public static int b(TimePicker timePicker) {
        return timePicker.getMinute();
    }

    @d({"android:hour"})
    public static void c(TimePicker timePicker, int i10) {
        if (timePicker.getHour() != i10) {
            timePicker.setHour(i10);
        }
    }

    @d(requireAll = false, value = {"android:onTimeChanged", "android:hourAttrChanged", "android:minuteAttrChanged"})
    public static void d(TimePicker timePicker, TimePicker.OnTimeChangedListener onTimeChangedListener, o oVar, o oVar2) {
        if (oVar == null && oVar2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new a(onTimeChangedListener, oVar, oVar2));
        }
    }

    @d({"android:minute"})
    public static void e(TimePicker timePicker, int i10) {
        if (timePicker.getMinute() != i10) {
            timePicker.setMinute(i10);
        }
    }
}
