package com.google.android.exoplayer2.ui.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import d.g;
import y7.c;

public final class a implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f5582a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    public final float[] f5583b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final float[] f5584c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    public final float[] f5585d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    public final Display f5586e;

    /* renamed from: f  reason: collision with root package name */
    public final C0092a[] f5587f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5588g;

    /* renamed from: com.google.android.exoplayer2.ui.spherical.a$a  reason: collision with other inner class name */
    public interface C0092a {
        void a(float[] fArr, float f10);
    }

    public a(Display display, C0092a... aVarArr) {
        this.f5586e = display;
        this.f5587f = aVarArr;
    }

    public static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public final float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f5583b);
        SensorManager.getOrientation(this.f5583b, this.f5585d);
        return this.f5585d[2];
    }

    public final void b(float[] fArr, float f10) {
        for (C0092a a10 : this.f5587f) {
            a10.a(fArr, f10);
        }
    }

    public final void c(float[] fArr) {
        if (!this.f5588g) {
            c.a(this.f5584c, fArr);
            this.f5588g = true;
        }
        float[] fArr2 = this.f5583b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f5583b, 0, this.f5584c, 0);
    }

    public final void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 130;
            int i12 = 129;
            if (i10 == 1) {
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
                i11 = 129;
            } else if (i10 == 3) {
                i12 = 1;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f5583b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f5583b, i11, i12, fArr);
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    @g
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f5582a, sensorEvent.values);
        d(this.f5582a, this.f5586e.getRotation());
        float a10 = a(this.f5582a);
        e(this.f5582a);
        c(this.f5582a);
        b(this.f5582a, a10);
    }
}
