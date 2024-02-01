package w8;

import com.google.android.gms.common.api.Scope;
import d.m0;
import e8.a;
import j8.s;
import java.util.Set;

@a
public final class z {
    @a
    @m0
    public static String[] a(@m0 Set<Scope> set) {
        s.m(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        s.m(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i10 = 0; i10 < scopeArr.length; i10++) {
            strArr[i10] = scopeArr[i10].X0();
        }
        return strArr;
    }
}
