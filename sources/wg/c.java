package wg;

import ch.f;
import pg.e;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final f f24146d = f.o(":");

    /* renamed from: e  reason: collision with root package name */
    public static final String f24147e = ":status";

    /* renamed from: f  reason: collision with root package name */
    public static final String f24148f = ":method";

    /* renamed from: g  reason: collision with root package name */
    public static final String f24149g = ":path";

    /* renamed from: h  reason: collision with root package name */
    public static final String f24150h = ":scheme";

    /* renamed from: i  reason: collision with root package name */
    public static final String f24151i = ":authority";

    /* renamed from: j  reason: collision with root package name */
    public static final f f24152j = f.o(f24147e);

    /* renamed from: k  reason: collision with root package name */
    public static final f f24153k = f.o(f24148f);

    /* renamed from: l  reason: collision with root package name */
    public static final f f24154l = f.o(f24149g);

    /* renamed from: m  reason: collision with root package name */
    public static final f f24155m = f.o(f24150h);

    /* renamed from: n  reason: collision with root package name */
    public static final f f24156n = f.o(f24151i);

    /* renamed from: a  reason: collision with root package name */
    public final f f24157a;

    /* renamed from: b  reason: collision with root package name */
    public final f f24158b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24159c;

    public c(f fVar, f fVar2) {
        this.f24157a = fVar;
        this.f24158b = fVar2;
        this.f24159c = fVar.R() + 32 + fVar2.R();
    }

    public c(f fVar, String str) {
        this(fVar, f.o(str));
    }

    public c(String str, String str2) {
        this(f.o(str), f.o(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f24157a.equals(cVar.f24157a) && this.f24158b.equals(cVar.f24158b);
    }

    public int hashCode() {
        return ((527 + this.f24157a.hashCode()) * 31) + this.f24158b.hashCode();
    }

    public String toString() {
        return e.r("%s: %s", this.f24157a.a0(), this.f24158b.a0());
    }
}
