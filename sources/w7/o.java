package w7;

import java.util.Arrays;

public final class o {

    /* renamed from: d  reason: collision with root package name */
    public static final String f14772d = "LibraryLoader";

    /* renamed from: a  reason: collision with root package name */
    public String[] f14773a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f14774b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14775c;

    public o(String... strArr) {
        this.f14773a = strArr;
    }

    public synchronized boolean a() {
        if (this.f14774b) {
            return this.f14775c;
        }
        this.f14774b = true;
        try {
            for (String loadLibrary : this.f14773a) {
                System.loadLibrary(loadLibrary);
            }
            this.f14775c = true;
        } catch (UnsatisfiedLinkError unused) {
            p.l(f14772d, "Failed to load " + Arrays.toString(this.f14773a));
        }
        return this.f14775c;
    }

    public synchronized void b(String... strArr) {
        a.j(!this.f14774b, "Cannot set libraries after loading");
        this.f14773a = strArr;
    }
}
