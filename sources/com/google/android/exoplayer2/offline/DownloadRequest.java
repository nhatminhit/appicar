package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import d.o0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w7.q0;

public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new a();
    public static final String U = "progressive";
    public static final String V = "dash";
    public static final String W = "hls";
    public static final String X = "ss";
    public final String O;
    public final String P;
    public final Uri Q;
    public final List<StreamKey> R;
    @o0
    public final String S;
    public final byte[] T;

    public static class a implements Parcelable.Creator<DownloadRequest> {
        /* renamed from: a */
        public DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        /* renamed from: b */
        public DownloadRequest[] newArray(int i10) {
            return new DownloadRequest[i10];
        }
    }

    public static class b extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        this.O = (String) q0.l(parcel.readString());
        this.P = (String) q0.l(parcel.readString());
        this.Q = Uri.parse((String) q0.l(parcel.readString()));
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.R = Collections.unmodifiableList(arrayList);
        this.S = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.T = bArr;
        parcel.readByteArray(bArr);
    }

    public DownloadRequest(String str, String str2, Uri uri, List<StreamKey> list, @o0 String str3, @o0 byte[] bArr) {
        if (V.equals(str2) || W.equals(str2) || X.equals(str2)) {
            boolean z10 = str3 == null;
            w7.a.b(z10, "customCacheKey must be null for type: " + str2);
        }
        this.O = str;
        this.P = str2;
        this.Q = uri;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.R = Collections.unmodifiableList(arrayList);
        this.S = str3;
        this.T = bArr != null ? Arrays.copyOf(bArr, bArr.length) : q0.f14791f;
    }

    public DownloadRequest a(String str) {
        return new DownloadRequest(str, this.P, this.Q, this.R, this.S, this.T);
    }

    public DownloadRequest b(DownloadRequest downloadRequest) {
        List list;
        w7.a.a(this.O.equals(downloadRequest.O));
        w7.a.a(this.P.equals(downloadRequest.P));
        if (this.R.isEmpty() || downloadRequest.R.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = new ArrayList(this.R);
            for (int i10 = 0; i10 < downloadRequest.R.size(); i10++) {
                StreamKey streamKey = downloadRequest.R.get(i10);
                if (!list.contains(streamKey)) {
                    list.add(streamKey);
                }
            }
        }
        return new DownloadRequest(this.O, this.P, downloadRequest.Q, list, downloadRequest.S, downloadRequest.T);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.O.equals(downloadRequest.O) && this.P.equals(downloadRequest.P) && this.Q.equals(downloadRequest.Q) && this.R.equals(downloadRequest.R) && q0.e(this.S, downloadRequest.S) && Arrays.equals(this.T, downloadRequest.T);
    }

    public final int hashCode() {
        int hashCode = ((((((((this.P.hashCode() * 31) + this.O.hashCode()) * 31) + this.P.hashCode()) * 31) + this.Q.hashCode()) * 31) + this.R.hashCode()) * 31;
        String str = this.S;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.T);
    }

    public String toString() {
        return this.P + ":" + this.O;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q.toString());
        parcel.writeInt(this.R.size());
        for (int i11 = 0; i11 < this.R.size(); i11++) {
            parcel.writeParcelable(this.R.get(i11), 0);
        }
        parcel.writeString(this.S);
        parcel.writeInt(this.T.length);
        parcel.writeByteArray(this.T);
    }
}
