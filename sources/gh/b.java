package gh;

import java.io.IOException;

public class b extends IOException {
    public int O;
    public String P;

    public b(String str, int i10, String str2) {
        super(str);
        this.O = i10;
        this.P = str2;
    }

    public int a() {
        return this.O;
    }

    public String b() {
        return this.P;
    }

    public String toString() {
        return super.toString() + ". Status=" + this.O + ", URL=" + this.P;
    }
}
