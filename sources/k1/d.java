package k1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import d.x0;

public class d extends c {
    @x0({x0.a.LIBRARY_GROUP})

    /* renamed from: c0  reason: collision with root package name */
    public int[] f9927c0;
    @x0({x0.a.LIBRARY_GROUP})

    /* renamed from: d0  reason: collision with root package name */
    public int[] f9928d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f9929e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    public a f9930f0;

    /* renamed from: g0  reason: collision with root package name */
    public b f9931g0;

    /* renamed from: h0  reason: collision with root package name */
    public String[] f9932h0;

    public interface a {
        CharSequence convertToString(Cursor cursor);
    }

    public interface b {
        boolean setViewValue(View view, Cursor cursor, int i10);
    }

    @Deprecated
    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i10, cursor);
        this.f9928d0 = iArr;
        this.f9932h0 = strArr;
        p(cursor, strArr);
    }

    public d(Context context, int i10, Cursor cursor, String[] strArr, int[] iArr, int i11) {
        super(context, i10, cursor, i11);
        this.f9928d0 = iArr;
        this.f9932h0 = strArr;
        p(cursor, strArr);
    }

    public CharSequence convertToString(Cursor cursor) {
        a aVar = this.f9930f0;
        if (aVar != null) {
            return aVar.convertToString(cursor);
        }
        int i10 = this.f9929e0;
        return i10 > -1 ? cursor.getString(i10) : super.convertToString(cursor);
    }

    public void d(View view, Context context, Cursor cursor) {
        b bVar = this.f9931g0;
        int[] iArr = this.f9928d0;
        int length = iArr.length;
        int[] iArr2 = this.f9927c0;
        for (int i10 = 0; i10 < length; i10++) {
            View findViewById = view.findViewById(iArr[i10]);
            if (findViewById != null) {
                if (bVar != null ? bVar.setViewValue(findViewById, cursor, iArr2[i10]) : false) {
                    continue;
                } else {
                    String string = cursor.getString(iArr2[i10]);
                    if (string == null) {
                        string = "";
                    }
                    if (findViewById instanceof TextView) {
                        x((TextView) findViewById, string);
                    } else if (findViewById instanceof ImageView) {
                        w((ImageView) findViewById, string);
                    } else {
                        throw new IllegalStateException(findViewById.getClass().getName() + " is not a " + " view that can be bounds by this SimpleCursorAdapter");
                    }
                }
            }
        }
    }

    public Cursor l(Cursor cursor) {
        p(cursor, this.f9932h0);
        return super.l(cursor);
    }

    public void o(Cursor cursor, String[] strArr, int[] iArr) {
        this.f9932h0 = strArr;
        this.f9928d0 = iArr;
        p(cursor, strArr);
        super.a(cursor);
    }

    public final void p(Cursor cursor, String[] strArr) {
        if (cursor != null) {
            int length = strArr.length;
            int[] iArr = this.f9927c0;
            if (iArr == null || iArr.length != length) {
                this.f9927c0 = new int[length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f9927c0[i10] = cursor.getColumnIndexOrThrow(strArr[i10]);
            }
            return;
        }
        this.f9927c0 = null;
    }

    public a q() {
        return this.f9930f0;
    }

    public int r() {
        return this.f9929e0;
    }

    public b s() {
        return this.f9931g0;
    }

    public void t(a aVar) {
        this.f9930f0 = aVar;
    }

    public void u(int i10) {
        this.f9929e0 = i10;
    }

    public void v(b bVar) {
        this.f9931g0 = bVar;
    }

    public void w(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void x(TextView textView, String str) {
        textView.setText(str);
    }
}
