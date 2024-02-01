package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import b6.c;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import w7.q0;

public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new a();
    public final SchemeData[] O;
    public int P;
    @o0
    public final String Q;
    public final int R;

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new a();
        public int O;
        public final UUID P;
        @o0
        public final String Q;
        public final String R;
        @o0
        public final byte[] S;
        public final boolean T;

        public static class a implements Parcelable.Creator<SchemeData> {
            /* renamed from: a */
            public SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            /* renamed from: b */
            public SchemeData[] newArray(int i10) {
                return new SchemeData[i10];
            }
        }

        public SchemeData(Parcel parcel) {
            this.P = new UUID(parcel.readLong(), parcel.readLong());
            this.Q = parcel.readString();
            this.R = (String) q0.l(parcel.readString());
            this.S = parcel.createByteArray();
            this.T = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, @o0 String str, String str2, @o0 byte[] bArr, boolean z10) {
            this.P = (UUID) w7.a.g(uuid);
            this.Q = str;
            this.R = (String) w7.a.g(str2);
            this.S = bArr;
            this.T = z10;
        }

        public SchemeData(UUID uuid, String str, @o0 byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, @o0 byte[] bArr, boolean z10) {
            this(uuid, (String) null, str, bArr, z10);
        }

        public boolean b(SchemeData schemeData) {
            return d() && !schemeData.d() && e(schemeData.P);
        }

        public SchemeData c(@o0 byte[] bArr) {
            return new SchemeData(this.P, this.Q, this.R, bArr, this.T);
        }

        public boolean d() {
            return this.S != null;
        }

        public int describeContents() {
            return 0;
        }

        public boolean e(UUID uuid) {
            return c.f4291x1.equals(this.P) || uuid.equals(this.P);
        }

        public boolean equals(@o0 Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return q0.e(this.Q, schemeData.Q) && q0.e(this.R, schemeData.R) && q0.e(this.P, schemeData.P) && Arrays.equals(this.S, schemeData.S);
        }

        public int hashCode() {
            if (this.O == 0) {
                int hashCode = this.P.hashCode() * 31;
                String str = this.Q;
                this.O = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.R.hashCode()) * 31) + Arrays.hashCode(this.S);
            }
            return this.O;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.P.getMostSignificantBits());
            parcel.writeLong(this.P.getLeastSignificantBits());
            parcel.writeString(this.Q);
            parcel.writeString(this.R);
            parcel.writeByteArray(this.S);
            parcel.writeByte(this.T ? (byte) 1 : 0);
        }
    }

    public static class a implements Parcelable.Creator<DrmInitData> {
        /* renamed from: a */
        public DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        /* renamed from: b */
        public DrmInitData[] newArray(int i10) {
            return new DrmInitData[i10];
        }
    }

    public DrmInitData(Parcel parcel) {
        this.Q = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) q0.l(parcel.createTypedArray(SchemeData.CREATOR));
        this.O = schemeDataArr;
        this.R = schemeDataArr.length;
    }

    public DrmInitData(@o0 String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DrmInitData(@d.o0 java.lang.String r1, boolean r2, com.google.android.exoplayer2.drm.DrmInitData.SchemeData... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.Q = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
        L_0x000e:
            r0.O = r3
            int r1 = r3.length
            r0.R = r1
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.<init>(java.lang.String, boolean, com.google.android.exoplayer2.drm.DrmInitData$SchemeData[]):void");
    }

    public DrmInitData(@o0 String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> list) {
        this((String) null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public static boolean b(ArrayList<SchemeData> arrayList, int i10, UUID uuid) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (arrayList.get(i11).P.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    @o0
    public static DrmInitData d(@o0 DrmInitData drmInitData, @o0 DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.Q;
            for (SchemeData schemeData : drmInitData.O) {
                if (schemeData.d()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.Q;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.O) {
                if (schemeData2.d() && !b(arrayList, size, schemeData2.P)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, (List<SchemeData>) arrayList);
    }

    /* renamed from: a */
    public int compare(SchemeData schemeData, SchemeData schemeData2) {
        UUID uuid = c.f4291x1;
        return uuid.equals(schemeData.P) ? uuid.equals(schemeData2.P) ? 0 : 1 : schemeData.P.compareTo(schemeData2.P);
    }

    public DrmInitData c(@o0 String str) {
        return q0.e(this.Q, str) ? this : new DrmInitData(str, false, this.O);
    }

    public int describeContents() {
        return 0;
    }

    public SchemeData e(int i10) {
        return this.O[i10];
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return q0.e(this.Q, drmInitData.Q) && Arrays.equals(this.O, drmInitData.O);
    }

    @o0
    @Deprecated
    public SchemeData f(UUID uuid) {
        for (SchemeData schemeData : this.O) {
            if (schemeData.e(uuid)) {
                return schemeData;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r3.Q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.drm.DrmInitData g(com.google.android.exoplayer2.drm.DrmInitData r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.Q
            if (r0 == 0) goto L_0x0011
            java.lang.String r1 = r3.Q
            if (r1 == 0) goto L_0x0011
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            w7.a.i(r0)
            java.lang.String r0 = r2.Q
            if (r0 == 0) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            java.lang.String r0 = r3.Q
        L_0x001c:
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r1 = r2.O
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = r3.O
            java.lang.Object[] r3 = w7.q0.D0(r1, r3)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r3 = (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3
            com.google.android.exoplayer2.drm.DrmInitData r1 = new com.google.android.exoplayer2.drm.DrmInitData
            r1.<init>((java.lang.String) r0, (com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]) r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DrmInitData.g(com.google.android.exoplayer2.drm.DrmInitData):com.google.android.exoplayer2.drm.DrmInitData");
    }

    public int hashCode() {
        if (this.P == 0) {
            String str = this.Q;
            this.P = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.O);
        }
        return this.P;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.Q);
        parcel.writeTypedArray(this.O, 0);
    }
}
