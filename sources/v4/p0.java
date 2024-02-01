package v4;

public enum p0 {
    GETTER,
    SETTER,
    CREATOR,
    FIELD,
    IS_GETTER,
    T,
    ALL;

    public boolean a() {
        return this == CREATOR || this == ALL;
    }

    public boolean b() {
        return this == FIELD || this == ALL;
    }

    public boolean d() {
        return this == GETTER || this == ALL;
    }

    public boolean e() {
        return this == IS_GETTER || this == ALL;
    }

    public boolean i() {
        return this == SETTER || this == ALL;
    }
}
