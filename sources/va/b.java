package va;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import zb.i;
import zb.k;

public final class b implements SensorEventListener {

    /* renamed from: f  reason: collision with root package name */
    public static final float f23516f = 45.0f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f23517g = 450.0f;

    /* renamed from: a  reason: collision with root package name */
    public i f23518a;

    /* renamed from: b  reason: collision with root package name */
    public k f23519b;

    /* renamed from: c  reason: collision with root package name */
    public Sensor f23520c;

    /* renamed from: d  reason: collision with root package name */
    public Context f23521d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f23522e = new Handler();

    public b(Context context, i iVar, k kVar) {
        this.f23521d = context;
        this.f23518a = iVar;
        this.f23519b = kVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(boolean z10) {
        this.f23518a.A(z10);
    }

    public final void c(boolean z10) {
        this.f23522e.post(new a(this, z10));
    }

    public void d() {
        if (this.f23519b.d()) {
            SensorManager sensorManager = (SensorManager) this.f23521d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f23520c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void e() {
        if (this.f23520c != null) {
            ((SensorManager) this.f23521d.getSystemService("sensor")).unregisterListener(this);
            this.f23520c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f10 = sensorEvent.values[0];
        if (this.f23518a == null) {
            return;
        }
        if (f10 <= 45.0f) {
            c(true);
        } else if (f10 >= 450.0f) {
            c(false);
        }
    }
}
