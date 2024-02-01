package d9;

import android.location.Location;
import d.o0;
import d9.f;
import java.util.List;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f6695a;
    @f.b

    /* renamed from: b  reason: collision with root package name */
    public final int f6696b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final List f6697c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final Location f6698d;

    public j(int i10, @f.b int i11, @o0 List list, @o0 Location location) {
        this.f6695a = i10;
        this.f6696b = i11;
        this.f6697c = list;
        this.f6698d = location;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d9.j a(@d.m0 android.content.Intent r12) {
        /*
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "gms_error_code"
            r2 = -1
            int r1 = r12.getIntExtra(r1, r2)
            java.lang.String r3 = "com.google.android.location.intent.extra.transition"
            int r3 = r12.getIntExtra(r3, r2)
            r4 = 4
            if (r3 != r2) goto L_0x0016
        L_0x0014:
            r3 = r2
            goto L_0x001f
        L_0x0016:
            r5 = 1
            if (r3 == r5) goto L_0x001f
            r5 = 2
            if (r3 == r5) goto L_0x001f
            if (r3 != r4) goto L_0x0014
            r3 = r4
        L_0x001f:
            java.lang.String r4 = "com.google.android.location.intent.extra.geofence_list"
            java.io.Serializable r4 = r12.getSerializableExtra(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 != 0) goto L_0x002b
            r5 = r0
            goto L_0x005e
        L_0x002b:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            r5.<init>(r6)
            int r6 = r4.size()
            r7 = 0
            r8 = r7
        L_0x003a:
            if (r8 >= r6) goto L_0x005e
            java.lang.Object r9 = r4.get(r8)
            byte[] r9 = (byte[]) r9
            android.os.Parcel r10 = android.os.Parcel.obtain()
            int r11 = r9.length
            r10.unmarshall(r9, r7, r11)
            r10.setDataPosition(r7)
            android.os.Parcelable$Creator<com.google.android.gms.internal.location.zzdh> r9 = com.google.android.gms.internal.location.zzdh.CREATOR
            java.lang.Object r9 = r9.createFromParcel(r10)
            com.google.android.gms.internal.location.zzdh r9 = (com.google.android.gms.internal.location.zzdh) r9
            r10.recycle()
            r5.add(r9)
            int r8 = r8 + 1
            goto L_0x003a
        L_0x005e:
            java.lang.String r4 = "com.google.android.location.intent.extra.triggering_location"
            android.os.Parcelable r12 = r12.getParcelableExtra(r4)
            android.location.Location r12 = (android.location.Location) r12
            if (r5 != 0) goto L_0x006b
            if (r1 != r2) goto L_0x006b
            return r0
        L_0x006b:
            d9.j r0 = new d9.j
            r0.<init>(r1, r3, r5, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d9.j.a(android.content.Intent):d9.j");
    }

    public int b() {
        return this.f6695a;
    }

    @f.b
    public int c() {
        return this.f6696b;
    }

    @o0
    public List<f> d() {
        return this.f6697c;
    }

    @o0
    public Location e() {
        return this.f6698d;
    }

    public boolean f() {
        return this.f6695a != -1;
    }
}
