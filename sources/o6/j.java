package o6;

import d.o0;
import java.nio.ByteBuffer;
import java.util.UUID;
import w7.p;
import w7.w;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final String f11275a = "PsshAtomUtil";

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final UUID f11276a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11277b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f11278c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f11276a = uuid;
            this.f11277b = i10;
            this.f11278c = bArr;
        }
    }

    public static byte[] a(UUID uuid, @o0 byte[] bArr) {
        return b(uuid, (UUID[]) null, bArr);
    }

    public static byte[] b(UUID uuid, @o0 UUID[] uuidArr, @o0 byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(a.f11109n0);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || bArr.length == 0)) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static boolean c(byte[] bArr) {
        return d(bArr) != null;
    }

    @o0
    public static a d(byte[] bArr) {
        w wVar = new w(bArr);
        if (wVar.d() < 32) {
            return null;
        }
        wVar.Q(0);
        if (wVar.l() != wVar.a() + 4 || wVar.l() != a.f11109n0) {
            return null;
        }
        int c10 = a.c(wVar.l());
        if (c10 > 1) {
            p.l(f11275a, "Unsupported pssh version: " + c10);
            return null;
        }
        UUID uuid = new UUID(wVar.w(), wVar.w());
        if (c10 == 1) {
            wVar.R(wVar.H() * 16);
        }
        int H = wVar.H();
        if (H != wVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[H];
        wVar.i(bArr2, 0, H);
        return new a(uuid, c10, bArr2);
    }

    @o0
    public static byte[] e(byte[] bArr, UUID uuid) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        if (uuid == null || uuid.equals(d10.f11276a)) {
            return d10.f11278c;
        }
        p.l(f11275a, "UUID mismatch. Expected: " + uuid + ", got: " + d10.f11276a + ".");
        return null;
    }

    @o0
    public static UUID f(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return null;
        }
        return d10.f11276a;
    }

    public static int g(byte[] bArr) {
        a d10 = d(bArr);
        if (d10 == null) {
            return -1;
        }
        return d10.f11277b;
    }
}
