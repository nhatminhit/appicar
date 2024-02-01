package ci;

import ia.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class d {
    @c("data")
    @ia.a
    private List<a> data = null;
    @c("message")
    @ia.a
    private String message;
    @c("statusCode")
    @ia.a
    private Integer statusCode;

    public class a {
        @c("accessToken")
        @ia.a
        private String accessToken;
        @c("account")
        @ia.a
        private String account;
        @c("appId")
        @ia.a
        private String appId;
        @c("appVersion")
        @ia.a
        private String appVersion;
        @c("car")
        @ia.a
        private C0272a car;
        @c("createdAt")
        @ia.a
        private Long createdAt;
        @c("deviceId")
        @ia.a
        private String deviceId;
        @c("displayName")
        @ia.a
        private String displayName;
        @c("exp")
        @ia.a
        private Long exp;
        @c("fcmToken")
        @ia.a
        private String fcmToken;
        @c("lang")
        @ia.a
        private String lang;
        @c("lastTime")
        @ia.a
        private Long lastTime;
        @c("refreshToken")
        @ia.a
        private String refreshToken;
        @c("sub")
        @ia.a
        private String sub;
        @c("userId")
        @ia.a
        private String userId;
        @c("workingStatus")
        @ia.a
        private Integer workingStatus;

        /* renamed from: ci.d$a$a  reason: collision with other inner class name */
        public class C0272a {
            private Map<String, Object> additionalProperties = new HashMap();
            @c("brand")
            @ia.a
            private String brand;
            @c("color")
            @ia.a
            private String color;
            @c("id")
            @ia.a

            /* renamed from: id  reason: collision with root package name */
            private String f16539id;
            @c("image")
            @ia.a
            private String image;
            @c("model")
            @ia.a
            private String model;
            @c("option")
            @ia.a
            private String option;
            @c("plate")
            @ia.a
            private String plate;
            @c("userId")
            @ia.a
            private String userId;
            @c("year")
            @ia.a
            private String year;

            public C0272a() {
            }

            public Map<String, Object> getAdditionalProperties() {
                Map<String, Object> map = this.additionalProperties;
                return map == null ? new HashMap() : map;
            }

            public String getBrand() {
                String str = this.brand;
                return str == null ? "" : str;
            }

            public String getColor() {
                String str = this.color;
                return str == null ? "" : str;
            }

            public String getId() {
                String str = this.f16539id;
                return str == null ? "" : str;
            }

            public String getImage() {
                String str = this.image;
                return str == null ? "" : str;
            }

            public String getModel() {
                String str = this.model;
                return str == null ? "" : str;
            }

            public String getOption() {
                String str = this.option;
                return str == null ? "" : str;
            }

            public String getPlate() {
                String str = this.plate;
                return str == null ? "" : str;
            }

            public String getUserId() {
                String str = this.userId;
                return str == null ? "" : str;
            }

            public String getYear() {
                String str = this.year;
                return str == null ? "" : str;
            }

            public void setAdditionalProperty(String str, Object obj) {
                this.additionalProperties.put(str, obj);
            }

            public void setBrand(String str) {
                this.brand = str;
            }

            public void setColor(String str) {
                this.color = str;
            }

            public void setId(String str) {
                this.f16539id = str;
            }

            public void setImage(String str) {
                this.image = str;
            }

            public void setModel(String str) {
                this.model = str;
            }

            public void setOption(String str) {
                this.option = str;
            }

            public void setPlate(String str) {
                this.plate = str;
            }

            public void setUserId(String str) {
                this.userId = str;
            }

            public void setYear(String str) {
                this.year = str;
            }

            public String toString() {
                return "Car{id='" + this.f16539id + '\'' + ", userId='" + this.userId + '\'' + ", plate='" + this.plate + '\'' + ", brand='" + this.brand + '\'' + ", model='" + this.model + '\'' + ", year='" + this.year + '\'' + ", option='" + this.option + '\'' + ", color='" + this.color + '\'' + ", image='" + this.image + '\'' + ", additionalProperties=" + this.additionalProperties + '}';
            }
        }

        public a() {
        }

        public String getAccessToken() {
            String str = this.accessToken;
            return str == null ? "" : str;
        }

        public String getAccount() {
            String str = this.account;
            return str == null ? "" : str;
        }

        public String getAppId() {
            String str = this.appId;
            return str == null ? "" : str;
        }

        public String getAppVersion() {
            String str = this.appVersion;
            return str == null ? "" : str;
        }

        public C0272a getCar() {
            C0272a aVar = this.car;
            return aVar == null ? new C0272a() : aVar;
        }

        public Long getCreatedAt() {
            Long l10 = this.createdAt;
            return Long.valueOf(l10 == null ? -1 : l10.longValue());
        }

        public String getDeviceId() {
            String str = this.deviceId;
            return str == null ? "" : str;
        }

        public String getDisplayName() {
            String str = this.displayName;
            return str == null ? "" : str;
        }

        public Long getExp() {
            Long l10 = this.exp;
            return Long.valueOf(l10 == null ? 0 : l10.longValue());
        }

        public String getFcmToken() {
            String str = this.fcmToken;
            return str == null ? "" : str;
        }

        public String getHintAccount() {
            String str = this.account;
            if (str == null) {
                return "";
            }
            if (str.length() >= 10) {
                this.account = this.account.substring(0, 7);
                this.account += "***";
            }
            return this.account;
        }

        public String getLang() {
            String str = this.lang;
            return str == null ? "" : str;
        }

        public Long getLastTime() {
            Long l10 = this.lastTime;
            return Long.valueOf(l10 == null ? -1 : l10.longValue());
        }

        public String getRefreshToken() {
            String str = this.refreshToken;
            return str == null ? "" : str;
        }

        public String getSub() {
            String str = this.sub;
            return str == null ? "" : str;
        }

        public String getUserId() {
            String str = this.userId;
            return str == null ? "" : str;
        }

        public Integer getWorkingStatus() {
            Integer num = this.workingStatus;
            return Integer.valueOf(num == null ? -1 : num.intValue());
        }

        public void setAccessToken(String str) {
            this.accessToken = str;
        }

        public void setAccount(String str) {
            this.account = str;
        }

        public void setAppId(String str) {
            this.appId = str;
        }

        public void setAppVersion(String str) {
            this.appVersion = str;
        }

        public void setCar(C0272a aVar) {
            this.car = aVar;
        }

        public void setCreatedAt(Long l10) {
            this.createdAt = l10;
        }

        public void setDeviceId(String str) {
            this.deviceId = str;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public void setExp(Long l10) {
            this.exp = l10;
        }

        public void setFcmToken(String str) {
            this.fcmToken = str;
        }

        public void setLang(String str) {
            this.lang = str;
        }

        public void setLastTime(Long l10) {
            this.lastTime = l10;
        }

        public void setRefreshToken(String str) {
            this.refreshToken = str;
        }

        public void setSub(String str) {
            this.sub = str;
        }

        public void setUserId(String str) {
            this.userId = str;
        }

        public void setWorkingStatus(Integer num) {
            this.workingStatus = num;
        }

        public String toString() {
            return "DataQREvent{appId='" + this.appId + '\'' + ", accessToken='" + this.accessToken + '\'' + ", account='" + this.account + '\'' + ", appVersion='" + this.appVersion + '\'' + ", car=" + this.car + ", createdAt=" + this.createdAt + ", deviceId='" + this.deviceId + '\'' + ", displayName='" + this.displayName + '\'' + ", fcmToken='" + this.fcmToken + '\'' + ", lang='" + this.lang + '\'' + ", lastTime=" + this.lastTime + ", exp=" + this.exp + ", refreshToken='" + this.refreshToken + '\'' + ", sub='" + this.sub + '\'' + ", userId='" + this.userId + '\'' + ", workingStatus=" + this.workingStatus + '}';
        }
    }

    public List<a> getData() {
        List<a> list = this.data;
        return list == null ? new ArrayList() : list;
    }

    public String getMessage() {
        String str = this.message;
        return str == null ? "" : str;
    }

    public Integer getStatusCode() {
        Integer num = this.statusCode;
        return Integer.valueOf(num == null ? -1 : num.intValue());
    }

    public void setData(List<a> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatusCode(Integer num) {
        this.statusCode = num;
    }

    public String toString() {
        return "QREvent{message='" + this.message + '\'' + ", data=" + this.data + ", statusCode=" + this.statusCode + '}';
    }
}
