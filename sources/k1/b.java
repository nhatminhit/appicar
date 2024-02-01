package k1;

import android.database.Cursor;
import android.widget.Filter;

public class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    public a f9924a;

    public interface a {
        void a(Cursor cursor);

        Cursor b();

        Cursor c(CharSequence charSequence);

        CharSequence convertToString(Cursor cursor);
    }

    public b(a aVar) {
        this.f9924a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f9924a.convertToString((Cursor) obj);
    }

    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c10 = this.f9924a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c10 != null) {
            filterResults.count = c10.getCount();
        } else {
            filterResults.count = 0;
            c10 = null;
        }
        filterResults.values = c10;
        return filterResults;
    }

    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor b10 = this.f9924a.b();
        Object obj = filterResults.values;
        if (obj != null && obj != b10) {
            this.f9924a.a((Cursor) obj);
        }
    }
}
