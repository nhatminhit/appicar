package j8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zax;
import z8.f;
import z8.h;

public final class b1 extends h {

    /* renamed from: c  reason: collision with root package name */
    public static final b1 f9698c = new b1();

    public b1() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) throws h.a {
        b1 b1Var = f9698c;
        try {
            zax zax = new zax(1, i10, i11, (Scope[]) null);
            return (View) f.J(((r0) b1Var.b(context)).Y1(f.b0(context), zax));
        } catch (Exception e10) {
            throw new h.a("Could not get button with size " + i10 + " and color " + i11, e10);
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof r0 ? (r0) queryLocalInterface : new r0(iBinder);
    }
}
