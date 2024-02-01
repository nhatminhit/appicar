package og;

import java.io.IOException;

public enum h0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public final String O;

    /* access modifiers changed from: public */
    h0(String str) {
        this.O = str;
    }

    public static h0 a(String str) throws IOException {
        h0 h0Var = HTTP_1_0;
        if (str.equals(h0Var.O)) {
            return h0Var;
        }
        h0 h0Var2 = HTTP_1_1;
        if (str.equals(h0Var2.O)) {
            return h0Var2;
        }
        h0 h0Var3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(h0Var3.O)) {
            return h0Var3;
        }
        h0 h0Var4 = HTTP_2;
        if (str.equals(h0Var4.O)) {
            return h0Var4;
        }
        h0 h0Var5 = SPDY_3;
        if (str.equals(h0Var5.O)) {
            return h0Var5;
        }
        h0 h0Var6 = QUIC;
        if (str.equals(h0Var6.O)) {
            return h0Var6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.O;
    }
}
