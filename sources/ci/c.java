package ci;

import java.util.List;

public class c {
    private List<a> data = null;
    private String message;
    private int statusCode;

    public class a {
        private String authEvent;
        private String qrCode;
        private long qrExpiresAt;

        public a() {
        }

        public String getAuthEvent() {
            return this.authEvent;
        }

        public String getQrCode() {
            return this.qrCode;
        }

        public long getQrExpiresAt() {
            return this.qrExpiresAt;
        }

        public void setAuthEvent(String str) {
            this.authEvent = str;
        }

        public void setQrCode(String str) {
            this.qrCode = str;
        }

        public void setQrExpiresAt(long j10) {
            this.qrExpiresAt = j10;
        }

        public String toString() {
            return "DataQRAuth{authEvent='" + this.authEvent + '\'' + ", qrExpiresAt=" + this.qrExpiresAt + ", qrCode='" + this.qrCode + '\'' + '}';
        }
    }

    public List<a> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public void setData(List<a> list) {
        this.data = list;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatusCode(int i10) {
        this.statusCode = i10;
    }

    public String toString() {
        return "QRAuth{message='" + this.message + '\'' + ", data=" + this.data + ", statusCode='" + this.statusCode + '\'' + '}';
    }
}
