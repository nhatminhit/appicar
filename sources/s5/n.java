package s5;

import n7.b;
import v4.i0;

public enum n {
    COLOR(b.L),
    DATE("date"),
    DATE_TIME("date-time"),
    EMAIL("email"),
    HOST_NAME("host-name"),
    IP_ADDRESS("ip-address"),
    IPV6("ipv6"),
    PHONE("phone"),
    REGEX("regex"),
    Y("style"),
    TIME("time"),
    URI("uri"),
    UTC_MILLISEC("utc-millisec"),
    UUID("uuid");
    
    public final String O;

    /* access modifiers changed from: public */
    n(String str) {
        this.O = str;
    }

    @i0
    public String toString() {
        return this.O;
    }
}
