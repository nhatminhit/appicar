package n1;

import android.widget.CalendarView;
import androidx.databinding.d;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;

@x0({x0.a.LIBRARY})
@q({@p(attribute = "android:date", type = CalendarView.class)})
public class g {

    public class a implements CalendarView.OnDateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CalendarView.OnDateChangeListener f10768a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f10769b;

        public a(CalendarView.OnDateChangeListener onDateChangeListener, o oVar) {
            this.f10768a = onDateChangeListener;
            this.f10769b = oVar;
        }

        public void onSelectedDayChange(CalendarView calendarView, int i10, int i11, int i12) {
            CalendarView.OnDateChangeListener onDateChangeListener = this.f10768a;
            if (onDateChangeListener != null) {
                onDateChangeListener.onSelectedDayChange(calendarView, i10, i11, i12);
            }
            this.f10769b.a();
        }
    }

    @d({"android:date"})
    public static void a(CalendarView calendarView, long j10) {
        if (calendarView.getDate() != j10) {
            calendarView.setDate(j10);
        }
    }

    @d(requireAll = false, value = {"android:onSelectedDayChange", "android:dateAttrChanged"})
    public static void b(CalendarView calendarView, CalendarView.OnDateChangeListener onDateChangeListener, o oVar) {
        if (oVar == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new a(onDateChangeListener, oVar));
        }
    }
}
