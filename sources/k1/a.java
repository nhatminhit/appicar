package k1;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import d.x0;
import k1.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {
    @Deprecated
    public static final int X = 1;
    public static final int Y = 2;
    @x0({x0.a.LIBRARY_GROUP})
    public boolean O;
    @x0({x0.a.LIBRARY_GROUP})
    public boolean P;
    @x0({x0.a.LIBRARY_GROUP})
    public Cursor Q;
    @x0({x0.a.LIBRARY_GROUP})
    public Context R;
    @x0({x0.a.LIBRARY_GROUP})
    public int S;
    @x0({x0.a.LIBRARY_GROUP})
    public C0166a T;
    @x0({x0.a.LIBRARY_GROUP})
    public DataSetObserver U;
    @x0({x0.a.LIBRARY_GROUP})
    public b V;
    @x0({x0.a.LIBRARY_GROUP})
    public FilterQueryProvider W;

    /* renamed from: k1.a$a  reason: collision with other inner class name */
    public class C0166a extends ContentObserver {
        public C0166a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            a.this.j();
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.O = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.O = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public a(Context context, Cursor cursor) {
        f(context, cursor, 1);
    }

    public a(Context context, Cursor cursor, int i10) {
        f(context, cursor, i10);
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor l10 = l(cursor);
        if (l10 != null) {
            l10.close();
        }
    }

    public Cursor b() {
        return this.Q;
    }

    public Cursor c(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.W;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.Q;
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    public abstract void d(View view, Context context, Cursor cursor);

    public FilterQueryProvider e() {
        return this.W;
    }

    public void f(Context context, Cursor cursor, int i10) {
        b bVar;
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.P = true;
        } else {
            this.P = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.Q = cursor;
        this.O = z10;
        this.R = context;
        this.S = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.T = new C0166a();
            bVar = new b();
        } else {
            bVar = null;
            this.T = null;
        }
        this.U = bVar;
        if (z10) {
            C0166a aVar = this.T;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.U;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Deprecated
    public void g(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public int getCount() {
        Cursor cursor;
        if (!this.O || (cursor = this.Q) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.O) {
            return null;
        }
        this.Q.moveToPosition(i10);
        if (view == null) {
            view = h(this.R, this.Q, viewGroup);
        }
        d(view, this.R, this.Q);
        return view;
    }

    public Filter getFilter() {
        if (this.V == null) {
            this.V = new b(this);
        }
        return this.V;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.O || (cursor = this.Q) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.Q;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.O || (cursor = this.Q) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.Q.getLong(this.S);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.O) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.Q.moveToPosition(i10)) {
            if (view == null) {
                view = i(this.R, this.Q, viewGroup);
            }
            d(view, this.R, this.Q);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return i(context, cursor, viewGroup);
    }

    public boolean hasStableIds() {
        return true;
    }

    public abstract View i(Context context, Cursor cursor, ViewGroup viewGroup);

    public void j() {
        Cursor cursor;
        if (this.P && (cursor = this.Q) != null && !cursor.isClosed()) {
            this.O = this.Q.requery();
        }
    }

    public void k(FilterQueryProvider filterQueryProvider) {
        this.W = filterQueryProvider;
    }

    public Cursor l(Cursor cursor) {
        Cursor cursor2 = this.Q;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0166a aVar = this.T;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.U;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.Q = cursor;
        if (cursor != null) {
            C0166a aVar2 = this.T;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.U;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.S = cursor.getColumnIndexOrThrow("_id");
            this.O = true;
            notifyDataSetChanged();
        } else {
            this.S = -1;
            this.O = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
