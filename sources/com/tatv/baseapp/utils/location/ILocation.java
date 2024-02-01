package com.tatv.baseapp.utils.location;

import ad.d;
import android.location.Location;
import org.json.JSONException;
import org.json.JSONObject;
import zc.a;
import zc.g;

public class ILocation extends Location {
    public int O = 50;
    public int P = 10;
    public int Q = 50;
    public int R = -999;
    public Location S;
    public long T;
    public float U;
    public double V;
    public int W;
    public int X;

    public ILocation(double d10, double d11, float f10) {
        super(new Location(""));
        Location location = new Location("");
        location.setLatitude(d10);
        location.setLongitude(d11);
        location.setBearing(f10);
        f(location);
    }

    public ILocation(Location location) {
        super(location);
        f(location);
    }

    public ILocation a() {
        ILocation b10 = a.a().b(this);
        setBearing(b10.getBearing());
        setSpeed(b10.getSpeed());
        return this;
    }

    public float b() {
        return this.U;
    }

    public int c() {
        return this.W;
    }

    public int d() {
        return this.X;
    }

    public Location e() {
        return this.S;
    }

    public final void f(Location location) {
        this.S = location;
        this.V = location.hasAltitude() ? location.getAltitude() : (double) this.R;
        this.T = System.currentTimeMillis();
    }

    public boolean g(Location location) {
        return bearingTo(location) < ((float) this.O);
    }

    public double getAltitude() {
        return this.V;
    }

    public long getTime() {
        return this.T;
    }

    public boolean h(Location location) {
        double abs = (double) Math.abs(getBearing() - location.getBearing());
        int i10 = this.P;
        return abs > ((double) (180 - i10)) || abs < ((double) (i10 + 180));
    }

    public boolean j(Location location) {
        double bearingTo = (double) location.bearingTo(this);
        if (bearingTo < 0.0d) {
            bearingTo += 360.0d;
        }
        if (bearingTo >= 360.0d) {
            bearingTo -= 360.0d;
        }
        double abs = Math.abs(((double) location.getBearing()) - bearingTo);
        int i10 = this.Q;
        return abs <= ((double) i10) || (abs >= ((double) (360 - i10)) && distanceTo(location) < ((float) this.O));
    }

    public boolean l(Location location) {
        double abs = (double) Math.abs(getBearing() - location.getBearing());
        int i10 = this.P;
        return abs < ((double) i10) || abs > ((double) (360 - i10));
    }

    public boolean n(Location location, double d10) {
        double abs = (double) Math.abs(getBearing() - location.getBearing());
        return abs < d10 || abs > 360.0d - d10;
    }

    public ILocation o(double d10) {
        super.setBearing((float) d10);
        return this;
    }

    public void p(float f10) {
        this.U = f10;
    }

    public ILocation q(int i10) {
        this.W = i10;
        return this;
    }

    public ILocation r(int i10) {
        this.X = i10;
        return this;
    }

    public ILocation s() {
        setSpeed(g.d().b(getSpeed()));
        return this;
    }

    public void setAltitude(double d10) {
        this.V = d10;
    }

    public void setBearing(float f10) {
        super.setBearing(f10);
    }

    public void setTime(long j10) {
        this.T = j10;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("time", this.T);
            jSONObject.put("provider", getProvider());
            jSONObject.put("latitude", getLatitude());
            jSONObject.put("longitude", getLongitude());
            jSONObject.put("bearing", (double) getBearing());
            jSONObject.put("speed", (double) getSpeed());
            jSONObject.put("compass", (double) this.U);
            jSONObject.put("altitude", this.V);
            jSONObject.put("inUse", this.W);
            jSONObject.put("inView", this.X);
        } catch (JSONException e10) {
            d.c("ILocation", e10.toString());
        }
        return jSONObject.toString();
    }
}
