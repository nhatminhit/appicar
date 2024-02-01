package v3;

import android.content.Context;
import d.m0;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import y3.v;

public class g<T> implements m<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Collection<? extends m<T>> f14160c;

    public g(@m0 Collection<? extends m<T>> collection) {
        if (!collection.isEmpty()) {
            this.f14160c = collection;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    @SafeVarargs
    public g(@m0 m<T>... mVarArr) {
        if (mVarArr.length != 0) {
            this.f14160c = Arrays.asList(mVarArr);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }

    public void a(@m0 MessageDigest messageDigest) {
        for (m a10 : this.f14160c) {
            a10.a(messageDigest);
        }
    }

    @m0
    public v<T> b(@m0 Context context, @m0 v<T> vVar, int i10, int i11) {
        v<T> vVar2 = vVar;
        for (m b10 : this.f14160c) {
            v<T> b11 = b10.b(context, vVar2, i10, i11);
            if (vVar2 != null && !vVar2.equals(vVar) && !vVar2.equals(b11)) {
                vVar2.a();
            }
            vVar2 = b11;
        }
        return vVar2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f14160c.equals(((g) obj).f14160c);
        }
        return false;
    }

    public int hashCode() {
        return this.f14160c.hashCode();
    }
}
