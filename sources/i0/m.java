package i0;

import android.content.LocusId;
import android.os.Build;
import d.m0;
import d.o0;
import d.t0;
import e1.n;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f8977a;

    /* renamed from: b  reason: collision with root package name */
    public final LocusId f8978b;

    @t0(29)
    public static class a {
        @m0
        public static LocusId a(@m0 String str) {
            return new LocusId(str);
        }

        @m0
        public static String b(@m0 LocusId locusId) {
            return locusId.getId();
        }
    }

    public m(@m0 String str) {
        this.f8977a = (String) n.l(str, "id cannot be empty");
        this.f8978b = Build.VERSION.SDK_INT >= 29 ? a.a(str) : null;
    }

    @t0(29)
    @m0
    public static m d(@m0 LocusId locusId) {
        n.h(locusId, "locusId cannot be null");
        return new m((String) n.l(a.b(locusId), "id cannot be empty"));
    }

    @m0
    public String a() {
        return this.f8977a;
    }

    @m0
    public final String b() {
        int length = this.f8977a.length();
        return length + "_chars";
    }

    @t0(29)
    @m0
    public LocusId c() {
        return this.f8978b;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        String str = this.f8977a;
        String str2 = ((m) obj).f8977a;
        return str == null ? str2 == null : str.equals(str2);
    }

    public int hashCode() {
        String str = this.f8977a;
        return 31 + (str == null ? 0 : str.hashCode());
    }

    @m0
    public String toString() {
        return "LocusIdCompat[" + b() + "]";
    }
}
