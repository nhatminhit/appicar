package ci;

public class e {
    public String appId;
    public String appVersion;
    public String deviceId;
    public String deviceName;
    public String fcmToken;

    public String getAppId() {
        return this.appId;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public String getFcmToken() {
        return this.fcmToken;
    }

    public e setAppId(String str) {
        this.appId = str;
        return this;
    }

    public e setAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    public e setDeviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public e setDeviceName(String str) {
        this.deviceName = str;
        return this;
    }

    public e setFcmToken(String str) {
        this.fcmToken = str;
        return this;
    }

    public String toString() {
        return "Auth{appId='" + this.appId + '\'' + ", deviceId='" + this.deviceId + '\'' + ", appVersion='" + this.appVersion + '\'' + ", deviceName='" + this.deviceName + '\'' + ", fcmToken='" + this.fcmToken + '\'' + '}';
    }
}
