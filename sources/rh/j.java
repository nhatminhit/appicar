package rh;

import java.util.Objects;
import javax.annotation.Nullable;

public class j extends RuntimeException {
    public final int O;
    public final String P;
    public final transient u<?> Q;

    public j(u<?> uVar) {
        super(b(uVar));
        this.O = uVar.b();
        this.P = uVar.h();
        this.Q = uVar;
    }

    public static String b(u<?> uVar) {
        Objects.requireNonNull(uVar, "response == null");
        return "HTTP " + uVar.b() + " " + uVar.h();
    }

    public int a() {
        return this.O;
    }

    public String c() {
        return this.P;
    }

    @Nullable
    public u<?> d() {
        return this.Q;
    }
}
