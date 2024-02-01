package gh;

import java.io.IOException;

public class f extends IOException {
    public String O;
    public String P;

    public f(String str, String str2, String str3) {
        super(str);
        this.O = str2;
        this.P = str3;
    }

    public String a() {
        return this.O;
    }

    public String b() {
        return this.P;
    }

    public String toString() {
        return super.toString() + ". Mimetype=" + this.O + ", URL=" + this.P;
    }
}
