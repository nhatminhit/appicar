package ld;

import fh.g;
import fh.h;
import java.util.Objects;

public class c {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final String f20581a;
    @h

    /* renamed from: b  reason: collision with root package name */
    public final String f20582b;

    /* renamed from: c  reason: collision with root package name */
    public int f20583c = 23;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20584a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                ld.x[] r0 = ld.x.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20584a = r0
                ld.x r1 = ld.x.WITH_RESPONSE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20584a     // Catch:{ NoSuchFieldError -> 0x001d }
                ld.x r1 = ld.x.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ld.c.a.<clinit>():void");
        }
    }

    public c(@g String str, @h String str2) {
        Objects.requireNonNull(str, j.f20660z);
        this.f20581a = str;
        this.f20582b = str2;
    }

    @g
    public String a() {
        return this.f20581a;
    }

    public int b() {
        return this.f20583c;
    }

    public int c(@g x xVar) {
        Objects.requireNonNull(xVar, "writetype is null");
        int i10 = a.f20584a[xVar.ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? this.f20583c - 3 : this.f20583c - 15;
        }
        return 512;
    }

    @g
    public String d() {
        String str = this.f20582b;
        return str == null ? "" : str;
    }

    public void e(int i10) {
        this.f20583c = i10;
    }
}
