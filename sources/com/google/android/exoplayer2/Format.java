package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w7.q0;

public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new a();

    /* renamed from: r0  reason: collision with root package name */
    public static final int f5066r0 = -1;

    /* renamed from: s0  reason: collision with root package name */
    public static final long f5067s0 = Long.MAX_VALUE;
    @o0
    public final String O;
    @o0
    public final String P;
    public final int Q;
    public final int R;
    public final int S;
    @o0
    public final String T;
    @o0
    public final Metadata U;
    @o0
    public final String V;
    @o0
    public final String W;
    public final int X;
    public final List<byte[]> Y;
    @o0
    public final DrmInitData Z;

    /* renamed from: a0  reason: collision with root package name */
    public final long f5068a0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f5069b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f5070c0;

    /* renamed from: d0  reason: collision with root package name */
    public final float f5071d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f5072e0;

    /* renamed from: f0  reason: collision with root package name */
    public final float f5073f0;

    /* renamed from: g0  reason: collision with root package name */
    public final int f5074g0;
    @o0

    /* renamed from: h0  reason: collision with root package name */
    public final byte[] f5075h0;
    @o0

    /* renamed from: i0  reason: collision with root package name */
    public final ColorInfo f5076i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f5077j0;

    /* renamed from: k0  reason: collision with root package name */
    public final int f5078k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f5079l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f5080m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f5081n0;
    @o0

    /* renamed from: o0  reason: collision with root package name */
    public final String f5082o0;

    /* renamed from: p0  reason: collision with root package name */
    public final int f5083p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f5084q0;

    public static class a implements Parcelable.Creator<Format> {
        /* renamed from: a */
        public Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        /* renamed from: b */
        public Format[] newArray(int i10) {
            return new Format[i10];
        }
    }

    public Format(Parcel parcel) {
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readString();
        this.U = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.V = parcel.readString();
        this.W = parcel.readString();
        this.X = parcel.readInt();
        int readInt = parcel.readInt();
        this.Y = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            this.Y.add(parcel.createByteArray());
        }
        this.Z = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f5068a0 = parcel.readLong();
        this.f5069b0 = parcel.readInt();
        this.f5070c0 = parcel.readInt();
        this.f5071d0 = parcel.readFloat();
        this.f5072e0 = parcel.readInt();
        this.f5073f0 = parcel.readFloat();
        this.f5075h0 = q0.H0(parcel) ? parcel.createByteArray() : null;
        this.f5074g0 = parcel.readInt();
        this.f5076i0 = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f5077j0 = parcel.readInt();
        this.f5078k0 = parcel.readInt();
        this.f5079l0 = parcel.readInt();
        this.f5080m0 = parcel.readInt();
        this.f5081n0 = parcel.readInt();
        this.f5082o0 = parcel.readString();
        this.f5083p0 = parcel.readInt();
    }

    public Format(@o0 String str, @o0 String str2, int i10, int i11, int i12, @o0 String str3, @o0 Metadata metadata, @o0 String str4, @o0 String str5, int i13, @o0 List<byte[]> list, @o0 DrmInitData drmInitData, long j10, int i14, int i15, float f10, int i16, float f11, @o0 byte[] bArr, int i17, @o0 ColorInfo colorInfo, int i18, int i19, int i20, int i21, int i22, @o0 String str6, int i23) {
        this.O = str;
        this.P = str2;
        this.Q = i10;
        this.R = i11;
        this.S = i12;
        this.T = str3;
        this.U = metadata;
        this.V = str4;
        this.W = str5;
        this.X = i13;
        this.Y = list == null ? Collections.emptyList() : list;
        this.Z = drmInitData;
        this.f5068a0 = j10;
        this.f5069b0 = i14;
        this.f5070c0 = i15;
        this.f5071d0 = f10;
        int i24 = i16;
        this.f5072e0 = i24 == -1 ? 0 : i24;
        this.f5073f0 = f11 == -1.0f ? 1.0f : f11;
        this.f5075h0 = bArr;
        this.f5074g0 = i17;
        this.f5076i0 = colorInfo;
        this.f5077j0 = i18;
        this.f5078k0 = i19;
        this.f5079l0 = i20;
        int i25 = i21;
        this.f5080m0 = i25 == -1 ? 0 : i25;
        int i26 = i22;
        this.f5081n0 = i26 == -1 ? 0 : i26;
        this.f5082o0 = q0.B0(str6);
        this.f5083p0 = i23;
    }

    public static Format A(@o0 String str, String str2, int i10, @o0 String str3, @o0 DrmInitData drmInitData) {
        return C(str, str2, (String) null, -1, i10, str3, -1, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format B(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, @o0 String str4, int i12, @o0 DrmInitData drmInitData) {
        return C(str, str2, str3, i10, i11, str4, i12, drmInitData, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format C(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, @o0 String str4, int i12, @o0 DrmInitData drmInitData, long j10, List<byte[]> list) {
        return new Format(str, (String) null, i11, 0, i10, str3, (Metadata) null, (String) null, str2, -1, list, drmInitData, j10, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, str4, i12);
    }

    public static Format D(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, @o0 String str4, @o0 DrmInitData drmInitData, long j10) {
        return C(str, str2, str3, i10, i11, str4, -1, drmInitData, j10, Collections.emptyList());
    }

    @Deprecated
    public static Format E(@o0 String str, @o0 String str2, String str3, String str4, int i10, int i11, int i12, float f10, @o0 List<byte[]> list, int i13) {
        return F(str, (String) null, str2, str3, str4, i10, i11, i12, f10, list, i13, 0);
    }

    public static Format F(@o0 String str, @o0 String str2, @o0 String str3, String str4, String str5, int i10, int i11, int i12, float f10, @o0 List<byte[]> list, int i13, int i14) {
        return new Format(str, str2, i13, i14, i10, str5, (Metadata) null, str3, str4, -1, list, (DrmInitData) null, Long.MAX_VALUE, i11, i12, f10, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, (String) null, -1);
    }

    public static Format G(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, int i12, int i13, float f10, @o0 List<byte[]> list, int i14, float f11, @o0 DrmInitData drmInitData) {
        return H(str, str2, str3, i10, i11, i12, i13, f10, list, i14, f11, (byte[]) null, -1, (ColorInfo) null, drmInitData);
    }

    public static Format H(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, int i12, int i13, float f10, @o0 List<byte[]> list, int i14, float f11, byte[] bArr, int i15, @o0 ColorInfo colorInfo, @o0 DrmInitData drmInitData) {
        return new Format(str, (String) null, 0, 0, i10, str3, (Metadata) null, (String) null, str2, i11, list, drmInitData, Long.MAX_VALUE, i12, i13, f10, i14, f11, bArr, i15, colorInfo, -1, -1, -1, -1, -1, (String) null, -1);
    }

    public static Format I(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, int i12, int i13, float f10, @o0 List<byte[]> list, @o0 DrmInitData drmInitData) {
        return G(str, str2, str3, i10, i11, i12, i13, f10, list, -1, -1.0f, drmInitData);
    }

    public static String L(@o0 Format format) {
        if (format == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(format.O);
        sb2.append(", mimeType=");
        sb2.append(format.W);
        if (format.S != -1) {
            sb2.append(", bitrate=");
            sb2.append(format.S);
        }
        if (format.T != null) {
            sb2.append(", codecs=");
            sb2.append(format.T);
        }
        if (!(format.f5069b0 == -1 || format.f5070c0 == -1)) {
            sb2.append(", res=");
            sb2.append(format.f5069b0);
            sb2.append("x");
            sb2.append(format.f5070c0);
        }
        if (format.f5071d0 != -1.0f) {
            sb2.append(", fps=");
            sb2.append(format.f5071d0);
        }
        if (format.f5077j0 != -1) {
            sb2.append(", channels=");
            sb2.append(format.f5077j0);
        }
        if (format.f5078k0 != -1) {
            sb2.append(", sample_rate=");
            sb2.append(format.f5078k0);
        }
        if (format.f5082o0 != null) {
            sb2.append(", language=");
            sb2.append(format.f5082o0);
        }
        if (format.P != null) {
            sb2.append(", label=");
            sb2.append(format.P);
        }
        return sb2.toString();
    }

    @Deprecated
    public static Format n(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, int i10, int i11, int i12, @o0 List<byte[]> list, int i13, @o0 String str5) {
        return o(str, (String) null, str2, str3, str4, i10, i11, i12, list, i13, 0, str5);
    }

    public static Format o(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, @o0 String str5, int i10, int i11, int i12, @o0 List<byte[]> list, int i13, int i14, @o0 String str6) {
        return new Format(str, str2, i13, i14, i10, str5, (Metadata) null, str3, str4, -1, list, (DrmInitData) null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i11, i12, -1, -1, -1, str6, -1);
    }

    public static Format p(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, @o0 List<byte[]> list, @o0 DrmInitData drmInitData, int i17, @o0 String str4, @o0 Metadata metadata) {
        return new Format(str, (String) null, i17, 0, i10, str3, metadata, (String) null, str2, i11, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i12, i13, i14, i15, i16, str4, -1);
    }

    public static Format q(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, int i12, int i13, int i14, @o0 List<byte[]> list, @o0 DrmInitData drmInitData, int i15, @o0 String str4) {
        return p(str, str2, str3, i10, i11, i12, i13, i14, -1, -1, list, drmInitData, i15, str4, (Metadata) null);
    }

    public static Format r(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, int i12, int i13, @o0 List<byte[]> list, @o0 DrmInitData drmInitData, int i14, @o0 String str4) {
        return q(str, str2, str3, i10, i11, i12, i13, -1, list, drmInitData, i14, str4);
    }

    @Deprecated
    public static Format s(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, int i10, int i11, @o0 String str5) {
        return t(str, (String) null, str2, str3, str4, i10, i11, 0, str5);
    }

    public static Format t(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, @o0 String str5, int i10, int i11, int i12, @o0 String str6) {
        return new Format(str, str2, i11, i12, i10, str5, (Metadata) null, str3, str4, -1, (List<byte[]>) null, (DrmInitData) null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, str6, -1);
    }

    public static Format u(@o0 String str, @o0 String str2, @o0 String str3, int i10, int i11, @o0 List<byte[]> list, @o0 String str4, @o0 DrmInitData drmInitData) {
        return new Format(str, (String) null, i11, 0, i10, str3, (Metadata) null, (String) null, str2, -1, list, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, str4, -1);
    }

    public static Format v(@o0 String str, @o0 String str2, long j10) {
        return new Format(str, (String) null, 0, 0, -1, (String) null, (Metadata) null, (String) null, str2, -1, (List<byte[]>) null, (DrmInitData) null, j10, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, (String) null, -1);
    }

    public static Format w(@o0 String str, @o0 String str2, @o0 String str3, int i10, @o0 DrmInitData drmInitData) {
        return new Format(str, (String) null, 0, 0, i10, str3, (Metadata) null, (String) null, str2, -1, (List<byte[]>) null, drmInitData, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, (String) null, -1);
    }

    public static Format x(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, @o0 String str5, int i10, int i11, int i12, @o0 String str6) {
        return y(str, str2, str3, str4, str5, i10, i11, i12, str6, -1);
    }

    public static Format y(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, @o0 String str5, int i10, int i11, int i12, @o0 String str6, int i13) {
        return new Format(str, str2, i11, i12, i10, str5, (Metadata) null, str3, str4, -1, (List<byte[]>) null, (DrmInitData) null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, -1, -1, str6, i13);
    }

    public static Format z(@o0 String str, String str2, int i10, @o0 String str3) {
        return A(str, str2, i10, str3, (DrmInitData) null);
    }

    public int J() {
        int i10;
        int i11 = this.f5069b0;
        if (i11 == -1 || (i10 = this.f5070c0) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean K(Format format) {
        if (this.Y.size() != format.Y.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.Y.size(); i10++) {
            if (!Arrays.equals(this.Y.get(i10), format.Y.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public Format a(int i10) {
        return new Format(this.O, this.P, this.Q, this.R, i10, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f5068a0, this.f5069b0, this.f5070c0, this.f5071d0, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, this.f5082o0, this.f5083p0);
    }

    public Format b(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, @o0 Metadata metadata, int i10, int i11, int i12, int i13, int i14, @o0 String str5) {
        Metadata metadata2 = this.U;
        Metadata metadata3 = metadata;
        return new Format(str, str2, i14, this.R, i10, str4, metadata2 != null ? metadata2.b(metadata3) : metadata3, this.V, str3, this.X, this.Y, this.Z, this.f5068a0, i11, i12, this.f5071d0, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, i13, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, str5, this.f5083p0);
    }

    public Format c(@o0 DrmInitData drmInitData) {
        return new Format(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, drmInitData, this.f5068a0, this.f5069b0, this.f5070c0, this.f5071d0, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, this.f5082o0, this.f5083p0);
    }

    public Format d(float f10) {
        return new Format(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f5068a0, this.f5069b0, this.f5070c0, f10, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, this.f5082o0, this.f5083p0);
    }

    public int describeContents() {
        return 0;
    }

    public Format e(int i10, int i11) {
        return new Format(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f5068a0, this.f5069b0, this.f5070c0, this.f5071d0, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, i10, i11, this.f5082o0, this.f5083p0);
    }

    public boolean equals(@o0 Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i11 = this.f5084q0;
        if (i11 == 0 || (i10 = format.f5084q0) == 0 || i11 == i10) {
            return this.Q == format.Q && this.R == format.R && this.S == format.S && this.X == format.X && this.f5068a0 == format.f5068a0 && this.f5069b0 == format.f5069b0 && this.f5070c0 == format.f5070c0 && this.f5072e0 == format.f5072e0 && this.f5074g0 == format.f5074g0 && this.f5077j0 == format.f5077j0 && this.f5078k0 == format.f5078k0 && this.f5079l0 == format.f5079l0 && this.f5080m0 == format.f5080m0 && this.f5081n0 == format.f5081n0 && this.f5083p0 == format.f5083p0 && Float.compare(this.f5071d0, format.f5071d0) == 0 && Float.compare(this.f5073f0, format.f5073f0) == 0 && q0.e(this.O, format.O) && q0.e(this.P, format.P) && q0.e(this.T, format.T) && q0.e(this.V, format.V) && q0.e(this.W, format.W) && q0.e(this.f5082o0, format.f5082o0) && Arrays.equals(this.f5075h0, format.f5075h0) && q0.e(this.U, format.U) && q0.e(this.f5076i0, format.f5076i0) && q0.e(this.Z, format.Z) && K(format);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r6 = r1.f5082o0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.Format f(com.google.android.exoplayer2.Format r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            if (r0 != r1) goto L_0x0007
            return r0
        L_0x0007:
            java.lang.String r2 = r0.W
            int r2 = w7.s.g(r2)
            java.lang.String r4 = r1.O
            java.lang.String r3 = r1.P
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            java.lang.String r3 = r0.P
        L_0x0016:
            r5 = r3
            java.lang.String r3 = r0.f5082o0
            r6 = 3
            r7 = 1
            if (r2 == r6) goto L_0x001f
            if (r2 != r7) goto L_0x0026
        L_0x001f:
            java.lang.String r6 = r1.f5082o0
            if (r6 == 0) goto L_0x0026
            r31 = r6
            goto L_0x0028
        L_0x0026:
            r31 = r3
        L_0x0028:
            int r3 = r0.S
            r6 = -1
            if (r3 != r6) goto L_0x002f
            int r3 = r1.S
        L_0x002f:
            r8 = r3
            java.lang.String r3 = r0.T
            if (r3 != 0) goto L_0x0043
            java.lang.String r6 = r1.T
            java.lang.String r6 = w7.q0.L(r6, r2)
            java.lang.String[] r9 = w7.q0.T0(r6)
            int r9 = r9.length
            if (r9 != r7) goto L_0x0043
            r9 = r6
            goto L_0x0044
        L_0x0043:
            r9 = r3
        L_0x0044:
            com.google.android.exoplayer2.metadata.Metadata r3 = r0.U
            if (r3 != 0) goto L_0x004b
            com.google.android.exoplayer2.metadata.Metadata r3 = r1.U
            goto L_0x0051
        L_0x004b:
            com.google.android.exoplayer2.metadata.Metadata r6 = r1.U
            com.google.android.exoplayer2.metadata.Metadata r3 = r3.b(r6)
        L_0x0051:
            r10 = r3
            float r3 = r0.f5071d0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x0062
            r6 = 2
            if (r2 != r6) goto L_0x0062
            float r2 = r1.f5071d0
            r20 = r2
            goto L_0x0064
        L_0x0062:
            r20 = r3
        L_0x0064:
            int r2 = r0.Q
            int r3 = r1.Q
            r6 = r2 | r3
            int r2 = r0.R
            int r3 = r1.R
            r7 = r2 | r3
            com.google.android.exoplayer2.drm.DrmInitData r1 = r1.Z
            com.google.android.exoplayer2.drm.DrmInitData r2 = r0.Z
            com.google.android.exoplayer2.drm.DrmInitData r15 = com.google.android.exoplayer2.drm.DrmInitData.d(r1, r2)
            com.google.android.exoplayer2.Format r1 = new com.google.android.exoplayer2.Format
            r3 = r1
            java.lang.String r11 = r0.V
            java.lang.String r12 = r0.W
            int r13 = r0.X
            java.util.List<byte[]> r14 = r0.Y
            r34 = r1
            long r1 = r0.f5068a0
            r16 = r1
            int r1 = r0.f5069b0
            r18 = r1
            int r1 = r0.f5070c0
            r19 = r1
            int r1 = r0.f5072e0
            r21 = r1
            float r1 = r0.f5073f0
            r22 = r1
            byte[] r1 = r0.f5075h0
            r23 = r1
            int r1 = r0.f5074g0
            r24 = r1
            com.google.android.exoplayer2.video.ColorInfo r1 = r0.f5076i0
            r25 = r1
            int r1 = r0.f5077j0
            r26 = r1
            int r1 = r0.f5078k0
            r27 = r1
            int r1 = r0.f5079l0
            r28 = r1
            int r1 = r0.f5080m0
            r29 = r1
            int r1 = r0.f5081n0
            r30 = r1
            int r1 = r0.f5083p0
            r32 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Format.f(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.Format");
    }

    public Format g(int i10) {
        return new Format(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, i10, this.Y, this.Z, this.f5068a0, this.f5069b0, this.f5070c0, this.f5071d0, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, this.f5082o0, this.f5083p0);
    }

    public Format h(@o0 Metadata metadata) {
        return new Format(this.O, this.P, this.Q, this.R, this.S, this.T, metadata, this.V, this.W, this.X, this.Y, this.Z, this.f5068a0, this.f5069b0, this.f5070c0, this.f5071d0, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, this.f5082o0, this.f5083p0);
    }

    public int hashCode() {
        if (this.f5084q0 == 0) {
            String str = this.O;
            int i10 = 0;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.P;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31;
            String str3 = this.T;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Metadata metadata = this.U;
            int hashCode4 = (hashCode3 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str4 = this.V;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.W;
            int hashCode6 = (((((((((((((((((((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.X) * 31) + ((int) this.f5068a0)) * 31) + this.f5069b0) * 31) + this.f5070c0) * 31) + Float.floatToIntBits(this.f5071d0)) * 31) + this.f5072e0) * 31) + Float.floatToIntBits(this.f5073f0)) * 31) + this.f5074g0) * 31) + this.f5077j0) * 31) + this.f5078k0) * 31) + this.f5079l0) * 31) + this.f5080m0) * 31) + this.f5081n0) * 31;
            String str6 = this.f5082o0;
            if (str6 != null) {
                i10 = str6.hashCode();
            }
            this.f5084q0 = ((hashCode6 + i10) * 31) + this.f5083p0;
        }
        return this.f5084q0;
    }

    public Format j(int i10) {
        return new Format(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f5068a0, this.f5069b0, this.f5070c0, this.f5071d0, i10, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, this.f5082o0, this.f5083p0);
    }

    public Format l(long j10) {
        return new Format(this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, j10, this.f5069b0, this.f5070c0, this.f5071d0, this.f5072e0, this.f5073f0, this.f5075h0, this.f5074g0, this.f5076i0, this.f5077j0, this.f5078k0, this.f5079l0, this.f5080m0, this.f5081n0, this.f5082o0, this.f5083p0);
    }

    public String toString() {
        return "Format(" + this.O + ", " + this.P + ", " + this.V + ", " + this.W + ", " + this.T + ", " + this.S + ", " + this.f5082o0 + ", [" + this.f5069b0 + ", " + this.f5070c0 + ", " + this.f5071d0 + "], [" + this.f5077j0 + ", " + this.f5078k0 + "])";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeString(this.T);
        boolean z10 = false;
        parcel.writeParcelable(this.U, 0);
        parcel.writeString(this.V);
        parcel.writeString(this.W);
        parcel.writeInt(this.X);
        int size = this.Y.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeByteArray(this.Y.get(i11));
        }
        parcel.writeParcelable(this.Z, 0);
        parcel.writeLong(this.f5068a0);
        parcel.writeInt(this.f5069b0);
        parcel.writeInt(this.f5070c0);
        parcel.writeFloat(this.f5071d0);
        parcel.writeInt(this.f5072e0);
        parcel.writeFloat(this.f5073f0);
        if (this.f5075h0 != null) {
            z10 = true;
        }
        q0.b1(parcel, z10);
        byte[] bArr = this.f5075h0;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f5074g0);
        parcel.writeParcelable(this.f5076i0, i10);
        parcel.writeInt(this.f5077j0);
        parcel.writeInt(this.f5078k0);
        parcel.writeInt(this.f5079l0);
        parcel.writeInt(this.f5080m0);
        parcel.writeInt(this.f5081n0);
        parcel.writeString(this.f5082o0);
        parcel.writeInt(this.f5083p0);
    }
}
