package vn.icar.baseauthentication.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import ia.c;

public class Device implements Parcelable {
    public static final Parcelable.Creator<Device> CREATOR = new a();
    @c("accessToken")
    @ia.a
    private String accessToken;
    @c("appId")
    @ia.a
    private String appId;
    @c("deviceMac")
    @ia.a
    private String deviceMac;
    @c("deviceName")
    @ia.a
    private String deviceName;

    public class a implements Parcelable.Creator<Device> {
        public Device createFromParcel(Parcel parcel) {
            return new Device(parcel);
        }

        public Device[] newArray(int i10) {
            return new Device[i10];
        }
    }

    public Device(Parcel parcel) {
        this.deviceMac = parcel.readString();
        this.deviceName = parcel.readString();
        this.accessToken = parcel.readString();
    }

    public Device(String str, String str2, String str3, String str4) {
        this.deviceMac = str;
        this.deviceName = str2;
        this.accessToken = str3;
        this.appId = str4;
    }

    public int describeContents() {
        return 0;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAppId() {
        return this.appId;
    }

    public String getDeviceMac() {
        return this.deviceMac;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public void setDeviceMac(String str) {
        this.deviceMac = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public String toString() {
        return "Device{deviceMac='" + this.deviceMac + '\'' + ", deviceName='" + this.deviceName + '\'' + ", accessToken='" + this.accessToken + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.deviceMac);
        parcel.writeString(this.deviceName);
        parcel.writeString(this.accessToken);
    }
}
