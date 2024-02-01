package j8;

import com.google.android.gms.common.internal.TelemetryData;
import com.google.errorprone.annotations.DoNotMock;
import com.google.errorprone.annotations.RestrictedInheritance;
import d.m0;
import e8.a;
import f8.l;
import h9.m;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms.*", explanation = "Use canonical fakes instead.", link = "go/gmscore-restrictedinheritance")
@a
@DoNotMock("Use canonical fakes instead. go/cheezhead-testing-methodology")
public interface z extends l<a0> {
    @a
    @m0
    m<Void> g(@m0 TelemetryData telemetryData);
}
