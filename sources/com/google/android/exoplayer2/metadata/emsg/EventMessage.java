package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import d.o0;
import java.util.Arrays;
import w7.q0;

public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new a();
    public final String O;
    public final String P;
    public final long Q;
    public final long R;
    public final byte[] S;
    public int T;

    public static class a implements Parcelable.Creator<EventMessage> {
        /* renamed from: a */
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* renamed from: b */
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    }

    public EventMessage(Parcel parcel) {
        this.O = (String) q0.l(parcel.readString());
        this.P = (String) q0.l(parcel.readString());
        this.Q = parcel.readLong();
        this.R = parcel.readLong();
        this.S = (byte[]) q0.l(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j10, long j11, byte[] bArr) {
        this.O = str;
        this.P = str2;
        this.Q = j10;
        this.R = j11;
        this.S = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        return this.Q == eventMessage.Q && this.R == eventMessage.R && q0.e(this.O, eventMessage.O) && q0.e(this.P, eventMessage.P) && Arrays.equals(this.S, eventMessage.S);
    }

    public int hashCode() {
        if (this.T == 0) {
            String str = this.O;
            int i10 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.P;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.Q;
            long j11 = this.R;
            this.T = ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.S);
        }
        return this.T;
    }

    public String toString() {
        return "EMSG: scheme=" + this.O + ", id=" + this.R + ", value=" + this.P;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeLong(this.Q);
        parcel.writeLong(this.R);
        parcel.writeByteArray(this.S);
    }
}
