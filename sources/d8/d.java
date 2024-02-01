package d8;

import com.google.android.gms.internal.common.h;
import com.google.errorprone.annotations.RestrictedInheritance;
import e8.a;
import j8.w;
import java.util.HashMap;

@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@a
@w
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final y f6587a;

    /* renamed from: b  reason: collision with root package name */
    public static final y f6588b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f6589c = new HashMap();

    static {
        x0 x0Var = new x0();
        x0Var.d("com.google.android.gms");
        x0Var.a(204200000);
        m0 m0Var = o0.f6632d;
        x0Var.c(h.r(m0Var.b0(), o0.f6630b.b0()));
        m0 m0Var2 = o0.f6631c;
        x0Var.b(h.r(m0Var2.b0(), o0.f6629a.b0()));
        f6587a = x0Var.e();
        x0 x0Var2 = new x0();
        x0Var2.d("com.android.vending");
        x0Var2.a(82240000);
        x0Var2.c(h.q(m0Var.b0()));
        x0Var2.b(h.q(m0Var2.b0()));
        f6588b = x0Var2.e();
    }
}
