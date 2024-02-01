package e9;

import android.content.Context;
import android.os.AsyncTask;
import d8.g;
import d8.h;
import e9.a;

public final class b extends AsyncTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f6988a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a.C0114a f6989b;

    public b(Context context, a.C0114a aVar) {
        this.f6988a = context;
        this.f6989b = aVar;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        int i10;
        Void[] voidArr = (Void[]) objArr;
        try {
            a.a(this.f6988a);
            i10 = 0;
        } catch (h e10) {
            i10 = e10.b();
        } catch (g e11) {
            i10 = e11.O;
        }
        return Integer.valueOf(i10);
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.f6989b.a();
            return;
        }
        this.f6989b.b(num.intValue(), a.f6984b.e(this.f6988a, num.intValue(), "pi"));
    }
}
