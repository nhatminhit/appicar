package h0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import b6.c;
import d.m0;
import d.o0;
import i0.d;
import java.util.ArrayList;
import java.util.Iterator;

public final class a3 implements Iterable<Intent> {
    public static final String Q = "TaskStackBuilder";
    public final ArrayList<Intent> O = new ArrayList<>();
    public final Context P;

    public interface a {
        @o0
        Intent w();
    }

    public a3(Context context) {
        this.P = context;
    }

    @m0
    public static a3 i(@m0 Context context) {
        return new a3(context);
    }

    @Deprecated
    public static a3 l(Context context) {
        return i(context);
    }

    @m0
    public a3 b(@m0 Intent intent) {
        this.O.add(intent);
        return this;
    }

    @m0
    public a3 c(@m0 Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.P.getPackageManager());
        }
        if (component != null) {
            f(component);
        }
        b(intent);
        return this;
    }

    @m0
    public a3 e(@m0 Activity activity) {
        Intent w10 = activity instanceof a ? ((a) activity).w() : null;
        if (w10 == null) {
            w10 = v.a(activity);
        }
        if (w10 != null) {
            ComponentName component = w10.getComponent();
            if (component == null) {
                component = w10.resolveActivity(this.P.getPackageManager());
            }
            f(component);
            b(w10);
        }
        return this;
    }

    public a3 f(ComponentName componentName) {
        int size = this.O.size();
        try {
            Context context = this.P;
            while (true) {
                Intent b10 = v.b(context, componentName);
                if (b10 == null) {
                    return this;
                }
                this.O.add(size, b10);
                context = this.P;
                componentName = b10.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @m0
    public a3 h(@m0 Class<?> cls) {
        return f(new ComponentName(this.P, cls));
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.O.iterator();
    }

    @o0
    public Intent j(int i10) {
        return this.O.get(i10);
    }

    @Deprecated
    public Intent m(int i10) {
        return j(i10);
    }

    public int n() {
        return this.O.size();
    }

    @m0
    public Intent[] o() {
        int size = this.O.size();
        Intent[] intentArr = new Intent[size];
        if (size == 0) {
            return intentArr;
        }
        intentArr[0] = new Intent(this.O.get(0)).addFlags(268484608);
        for (int i10 = 1; i10 < size; i10++) {
            intentArr[i10] = new Intent(this.O.get(i10));
        }
        return intentArr;
    }

    @o0
    public PendingIntent p(int i10, int i11) {
        return q(i10, i11, (Bundle) null);
    }

    @o0
    public PendingIntent q(int i10, int i11, @o0 Bundle bundle) {
        if (!this.O.isEmpty()) {
            ArrayList<Intent> arrayList = this.O;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(this.P, i10, intentArr, i11, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public void r() {
        s((Bundle) null);
    }

    public void s(@o0 Bundle bundle) {
        if (!this.O.isEmpty()) {
            ArrayList<Intent> arrayList = this.O;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!d.s(this.P, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(c.A);
                this.P.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
