package kc;

import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public String f20113a;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f20114b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f20115c;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public String f20116a;

        /* renamed from: b  reason: collision with root package name */
        public long f20117b;

        /* renamed from: c  reason: collision with root package name */
        public String f20118c;

        public a() {
        }

        public String a() {
            return this.f20116a;
        }

        public String b() {
            return this.f20118c;
        }

        public long c() {
            return this.f20117b;
        }

        public void d(String str) {
            this.f20116a = str;
        }

        public void e(String str) {
            this.f20118c = str;
        }

        public void f(long j10) {
            this.f20117b = j10;
        }

        public String toString() {
            return "DataQRAuth{authEvent='" + this.f20116a + '\'' + ", qrExpiresAt=" + this.f20117b + ", qrCode='" + this.f20118c + '\'' + '}';
        }
    }

    public List<a> a() {
        return this.f20114b;
    }

    public String b() {
        return this.f20113a;
    }

    public int c() {
        return this.f20115c;
    }

    public void d(List<a> list) {
        this.f20114b = list;
    }

    public void e(String str) {
        this.f20113a = str;
    }

    public void f(int i10) {
        this.f20115c = i10;
    }

    public String toString() {
        return "QRAuth{message='" + this.f20113a + '\'' + ", data=" + this.f20114b + ", statusCode='" + this.f20115c + '\'' + '}';
    }
}
