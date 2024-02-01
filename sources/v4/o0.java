package v4;

public enum o0 {
    TRUE,
    FALSE,
    DEFAULT;

    public static boolean d(Boolean bool, Boolean bool2) {
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    public static o0 e(Boolean bool) {
        return bool == null ? DEFAULT : bool.booleanValue() ? TRUE : FALSE;
    }

    public Boolean a() {
        if (this == DEFAULT) {
            return null;
        }
        return this == TRUE ? Boolean.TRUE : Boolean.FALSE;
    }

    public boolean b() {
        return this == TRUE;
    }
}
