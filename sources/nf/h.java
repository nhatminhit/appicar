package nf;

import fh.g;
import java.util.concurrent.TimeUnit;
import zd.h1;
import zd.y2;

@h1(version = "1.6")
@y2(markerClass = {l.class})
public enum h {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);
    
    @g
    public final TimeUnit O;

    /* access modifiers changed from: public */
    h(TimeUnit timeUnit) {
        this.O = timeUnit;
    }

    @g
    public final TimeUnit b() {
        return this.O;
    }
}
