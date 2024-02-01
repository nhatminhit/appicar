package ha;

public enum v {
    DEFAULT {
        public k a(Long l10) {
            return l10 == null ? m.O : new q((Number) l10);
        }
    },
    STRING {
        public k a(Long l10) {
            return l10 == null ? m.O : new q(l10.toString());
        }
    };

    public abstract k a(Long l10);
}
