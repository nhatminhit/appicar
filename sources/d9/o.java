package d9;

import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import d.m0;
import d.o0;
import f8.t;

public class o extends t<LocationSettingsResult> {
    public o(@m0 LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }

    @o0
    public LocationSettingsStates h() {
        return ((LocationSettingsResult) c()).X0();
    }
}
