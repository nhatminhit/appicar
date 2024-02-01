package a6;

import java.io.Serializable;

public abstract class s {
    public static final s O = new e();

    public static class a extends s {
        public final /* synthetic */ String P;
        public final /* synthetic */ String Q;

        public a(String str, String str2) {
            this.P = str;
            this.Q = str2;
        }

        public String b(String str) {
            if (!str.startsWith(this.P)) {
                return null;
            }
            String substring = str.substring(this.P.length());
            if (substring.endsWith(this.Q)) {
                return substring.substring(0, substring.length() - this.Q.length());
            }
            return null;
        }

        public String d(String str) {
            return this.P + str + this.Q;
        }

        public String toString() {
            return "[PreAndSuffixTransformer('" + this.P + "','" + this.Q + "')]";
        }
    }

    public static class b extends s {
        public final /* synthetic */ String P;

        public b(String str) {
            this.P = str;
        }

        public String b(String str) {
            if (str.startsWith(this.P)) {
                return str.substring(this.P.length());
            }
            return null;
        }

        public String d(String str) {
            return this.P + str;
        }

        public String toString() {
            return "[PrefixTransformer('" + this.P + "')]";
        }
    }

    public static class c extends s {
        public final /* synthetic */ String P;

        public c(String str) {
            this.P = str;
        }

        public String b(String str) {
            if (str.endsWith(this.P)) {
                return str.substring(0, str.length() - this.P.length());
            }
            return null;
        }

        public String d(String str) {
            return str + this.P;
        }

        public String toString() {
            return "[SuffixTransformer('" + this.P + "')]";
        }
    }

    public static class d extends s implements Serializable {
        public static final long R = 1;
        public final s P;
        public final s Q;

        public d(s sVar, s sVar2) {
            this.P = sVar;
            this.Q = sVar2;
        }

        public String b(String str) {
            String b10 = this.P.b(str);
            return b10 != null ? this.Q.b(b10) : b10;
        }

        public String d(String str) {
            return this.P.d(this.Q.d(str));
        }

        public String toString() {
            return "[ChainedTransformer(" + this.P + ", " + this.Q + ")]";
        }
    }

    public static final class e extends s implements Serializable {
        public static final long P = 1;

        public String b(String str) {
            return str;
        }

        public String d(String str) {
            return str;
        }
    }

    public static s a(s sVar, s sVar2) {
        return new d(sVar, sVar2);
    }

    public static s c(String str, String str2) {
        boolean z10 = true;
        boolean z11 = str != null && str.length() > 0;
        if (str2 == null || str2.length() <= 0) {
            z10 = false;
        }
        return z11 ? z10 ? new a(str, str2) : new b(str) : z10 ? new c(str2) : O;
    }

    public abstract String b(String str);

    public abstract String d(String str);
}
