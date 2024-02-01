package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import w7.q0;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new a();
    public static final String U = "Icy-MetaData";
    public static final String V = "1";
    public static final String W = "IcyHeaders";
    public static final String X = "icy-br";
    public static final String Y = "icy-genre";
    public static final String Z = "icy-name";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f5165a0 = "icy-url";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f5166b0 = "icy-pub";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f5167c0 = "icy-metaint";
    public final int O;
    @o0
    public final String P;
    @o0
    public final String Q;
    @o0
    public final String R;
    public final boolean S;
    public final int T;

    public static class a implements Parcelable.Creator<IcyHeaders> {
        /* renamed from: a */
        public IcyHeaders createFromParcel(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        /* renamed from: b */
        public IcyHeaders[] newArray(int i10) {
            return new IcyHeaders[i10];
        }
    }

    public IcyHeaders(int i10, @o0 String str, @o0 String str2, @o0 String str3, boolean z10, int i11) {
        w7.a.a(i11 == -1 || i11 > 0);
        this.O = i10;
        this.P = str;
        this.Q = str2;
        this.R = str3;
        this.S = z10;
        this.T = i11;
    }

    public IcyHeaders(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readString();
        this.S = q0.H0(parcel);
        this.T = parcel.readInt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x004f
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0037 }
            int r6 = r6 * 1000
            if (r6 <= 0) goto L_0x0021
            r1 = r4
            goto L_0x004d
        L_0x0021:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0038 }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r8 = "Invalid bitrate: "
            r7.append(r8)     // Catch:{ NumberFormatException -> 0x0038 }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x0038 }
            java.lang.String r7 = r7.toString()     // Catch:{ NumberFormatException -> 0x0038 }
            w7.p.l(r2, r7)     // Catch:{ NumberFormatException -> 0x0038 }
            r6 = r3
            goto L_0x004c
        L_0x0037:
            r6 = r3
        L_0x0038:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Invalid bitrate header: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            w7.p.l(r2, r1)
        L_0x004c:
            r1 = r5
        L_0x004d:
            r7 = r6
            goto L_0x0051
        L_0x004f:
            r7 = r3
            r1 = r5
        L_0x0051:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L_0x0065
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = r4
            goto L_0x0066
        L_0x0065:
            r9 = r8
        L_0x0066:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x0079
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = r4
            goto L_0x007a
        L_0x0079:
            r10 = r8
        L_0x007a:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008d
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = r4
            goto L_0x008e
        L_0x008d:
            r11 = r8
        L_0x008e:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a7
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = r4
            goto L_0x00a8
        L_0x00a7:
            r12 = r5
        L_0x00a8:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L_0x00e8
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x00d6 }
            if (r5 <= 0) goto L_0x00c0
            r3 = r5
            goto L_0x00d3
        L_0x00c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00d5 }
            r4.<init>()     // Catch:{ NumberFormatException -> 0x00d5 }
            r4.append(r0)     // Catch:{ NumberFormatException -> 0x00d5 }
            r4.append(r13)     // Catch:{ NumberFormatException -> 0x00d5 }
            java.lang.String r4 = r4.toString()     // Catch:{ NumberFormatException -> 0x00d5 }
            w7.p.l(r2, r4)     // Catch:{ NumberFormatException -> 0x00d5 }
            r4 = r1
        L_0x00d3:
            r1 = r4
            goto L_0x00e8
        L_0x00d5:
            r3 = r5
        L_0x00d6:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            w7.p.l(r2, r13)
        L_0x00e8:
            if (r1 == 0) goto L_0x00f6
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r13 = new com.google.android.exoplayer2.metadata.icy.IcyHeaders
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L_0x00f6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.a(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.O == icyHeaders.O && q0.e(this.P, icyHeaders.P) && q0.e(this.Q, icyHeaders.Q) && q0.e(this.R, icyHeaders.R) && this.S == icyHeaders.S && this.T == icyHeaders.T;
    }

    public int hashCode() {
        int i10 = (527 + this.O) * 31;
        String str = this.P;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.Q;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.R;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return ((((hashCode2 + i11) * 31) + (this.S ? 1 : 0)) * 31) + this.T;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.Q + "\", genre=\"" + this.P + "\", bitrate=" + this.O + ", metadataInterval=" + this.T;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeString(this.R);
        q0.b1(parcel, this.S);
        parcel.writeInt(this.T);
    }
}
