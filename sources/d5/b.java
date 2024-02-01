package d5;

import java.util.HashSet;
import w4.i;
import w4.j;
import w4.k;
import w4.l;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6100a;

    /* renamed from: b  reason: collision with root package name */
    public String f6101b;

    /* renamed from: c  reason: collision with root package name */
    public String f6102c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet<String> f6103d;

    public b(Object obj) {
        this.f6100a = obj;
    }

    public static b f(i iVar) {
        return new b(iVar);
    }

    public static b g(l lVar) {
        return new b(lVar);
    }

    public b a() {
        return new b(this.f6100a);
    }

    public j b() {
        Object obj = this.f6100a;
        if (obj instanceof l) {
            return ((l) obj).W0();
        }
        return null;
    }

    public Object c() {
        return this.f6100a;
    }

    public boolean d(String str) throws k {
        String str2 = this.f6101b;
        if (str2 == null) {
            this.f6101b = str;
            return false;
        } else if (str.equals(str2)) {
            return true;
        } else {
            String str3 = this.f6102c;
            if (str3 == null) {
                this.f6102c = str;
                return false;
            } else if (str.equals(str3)) {
                return true;
            } else {
                if (this.f6103d == null) {
                    HashSet<String> hashSet = new HashSet<>(16);
                    this.f6103d = hashSet;
                    hashSet.add(this.f6101b);
                    this.f6103d.add(this.f6102c);
                }
                return !this.f6103d.add(str);
            }
        }
    }

    public void e() {
        this.f6101b = null;
        this.f6102c = null;
        this.f6103d = null;
    }
}
