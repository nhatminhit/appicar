package f8;

import com.google.android.gms.common.Feature;
import d.m0;
import e8.a;

public final class z extends UnsupportedOperationException {
    public final Feature O;

    @a
    public z(@m0 Feature feature) {
        this.O = feature;
    }

    @m0
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.O));
    }
}
