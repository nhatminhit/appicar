package com.tatv.baseapp.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ia.c;

public class Device implements Parcelable {
    public static final Parcelable.Creator<Device> CREATOR = new a();
    @c("deviceMac")
    @ia.a
    public String O;
    @c("deviceName")
    @ia.a
    public String P;
    @c("accessToken")
    @ia.a
    public String Q;
    @c("appId")
    @ia.a
    public String R;

    public class a implements Parcelable.Creator<Device> {
        /* renamed from: a */
        public Device createFromParcel(Parcel parcel) {
            return new Device(parcel);
        }

        /* renamed from: b */
        public Device[] newArray(int i10) {
            return new Device[i10];
        }
    }

    public Device(Parcel parcel) {
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
    }

    public Device(String str, String str2, String str3, String str4) {
        this.O = str;
        this.P = str2;
        this.Q = str3;
        this.R = str4;
    }

    public String a() {
        return this.Q;
    }

    public String b() {
        return this.R;
    }

    public String c() {
        return this.O;
    }

    public String d() {
        String str = this.P;
        return (str == null || str.equals("")) ? "-/-" : this.P;
    }

    public int describeContents() {
        return 0;
    }

    public void e(String str) {
        this.Q = str;
    }

    public void f(String str) {
        this.R = str;
    }

    public void g(String str) {
        this.O = str;
    }

    public void h(String str) {
        this.P = str;
    }

    public String toString() {
        return "Device{deviceMac='" + this.O + '\'' + ", deviceName='" + this.P + '\'' + ", accessToken='" + this.Q + '\'' + ", appId='" + this.R + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
    }
}
