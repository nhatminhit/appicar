package o6;

import b6.c;
import d.o0;
import j6.s;
import w7.a;
import w7.p;

public final class m {

    /* renamed from: f  reason: collision with root package name */
    public static final String f11294f = "TrackEncryptionBox";

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11295a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final String f11296b;

    /* renamed from: c  reason: collision with root package name */
    public final s.a f11297c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11298d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f11299e;

    public m(boolean z10, @o0 String str, int i10, byte[] bArr, int i11, int i12, @o0 byte[] bArr2) {
        boolean z11 = true;
        a.a((bArr2 != null ? false : z11) ^ (i10 == 0));
        this.f11295a = z10;
        this.f11296b = str;
        this.f11298d = i10;
        this.f11299e = bArr2;
        this.f11297c = new s.a(a(str), bArr, i11, i12);
    }

    public static int a(@o0 String str) {
        if (str == null) {
            return 1;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(c.f4279u1)) {
                    c10 = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals(c.f4287w1)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals(c.f4283v1)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 1:
                return 2;
            case 2:
            case 3:
                break;
            default:
                p.l(f11294f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                break;
        }
        return 1;
    }
}
