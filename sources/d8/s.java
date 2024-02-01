package d8;

import android.content.Intent;
import d.m0;

public class s extends Exception {
    public final Intent O;

    public s(@m0 String str, @m0 Intent intent) {
        super(str);
        this.O = intent;
    }

    @m0
    public Intent a() {
        return new Intent(this.O);
    }
}
