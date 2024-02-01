package zc;

import com.tatv.baseapp.utils.location.ILocation;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public static a f25098b;

    /* renamed from: a  reason: collision with root package name */
    public ILocation f25099a;

    public static a a() {
        if (f25098b == null) {
            f25098b = new a();
        }
        return f25098b;
    }

    public ILocation b(ILocation iLocation) {
        ILocation iLocation2 = this.f25099a;
        if (iLocation2 != null) {
            if (iLocation2.distanceTo(iLocation) <= 1.0f || iLocation.getTime() - this.f25099a.getTime() < 1000) {
                if (iLocation.getBearing() == 0.0f && iLocation.getSpeed() == 0.0f) {
                    iLocation.setBearing(this.f25099a.getBearing());
                } else {
                    iLocation.setSpeed(g.d().b(iLocation.getSpeed()));
                }
                return iLocation;
            } else if (iLocation.getBearing() == 0.0f && iLocation.getSpeed() == 0.0f) {
                double bearingTo = (double) this.f25099a.bearingTo(iLocation);
                float distanceTo = (float) (((double) this.f25099a.distanceTo(iLocation)) / ((double) ((iLocation.getTime() - this.f25099a.getTime()) / 1000)));
                if (distanceTo > 50.0f) {
                    distanceTo = 50.0f;
                }
                iLocation.setSpeed(distanceTo);
                iLocation.o(bearingTo);
            } else {
                iLocation.setSpeed(g.d().b(iLocation.getSpeed()));
            }
        }
        this.f25099a = iLocation;
        return this.f25099a;
    }
}
