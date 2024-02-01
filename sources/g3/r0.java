package g3;

import android.view.View;
import d.m0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class r0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f7847a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f7848b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<j0> f7849c = new ArrayList<>();

    @Deprecated
    public r0() {
    }

    public r0(@m0 View view) {
        this.f7848b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f7848b == r0Var.f7848b && this.f7847a.equals(r0Var.f7847a);
    }

    public int hashCode() {
        return (this.f7848b.hashCode() * 31) + this.f7847a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f7848b + "\n") + "    values:";
        for (String next : this.f7847a.keySet()) {
            str = str + "    " + next + ": " + this.f7847a.get(next) + "\n";
        }
        return str;
    }
}
