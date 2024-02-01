package gd;

import android.content.Context;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import mc.a;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public a f19208a;

    public f(Context context) {
        this.f19208a = new a(context);
    }

    public float a(float f10) {
        double d10;
        double d11;
        int h10 = this.f19208a.h();
        if (h10 == 1) {
            d10 = (double) f10;
            d11 = 14.5d;
        } else if (h10 != 2) {
            d10 = (double) f10;
            d11 = 1.0d;
        } else {
            d10 = (double) f10;
            d11 = 100.0d;
        }
        return (float) (d10 * d11);
    }

    public String b() {
        int h10 = this.f19208a.h();
        return h10 != 1 ? h10 != 2 ? "Bar" : "Kpa" : "Psi";
    }

    public String c(float f10) {
        double d10;
        double d11;
        double d12;
        int h10 = this.f19208a.h();
        boolean equals = this.f19208a.i() != null ? this.f19208a.i().b().equals("BLUETOOTH") : true;
        if (h10 == 1) {
            d11 = 14.5d;
            if (equals) {
                d12 = (double) f10;
            } else {
                d10 = (double) ((int) (((double) f10) * 14.5d));
                DecimalFormat decimalFormat = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
                decimalFormat.setMaximumFractionDigits(1);
                return decimalFormat.format(d10);
            }
        } else if (h10 != 2) {
            d12 = (double) f10;
            d11 = 1.0d;
        } else {
            return String.valueOf(Math.round(equals ? ((double) f10) * 100.0d : (double) ((int) (((double) f10) * 100.0d))));
        }
        d10 = d12 * d11;
        DecimalFormat decimalFormat2 = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));
        decimalFormat2.setMaximumFractionDigits(1);
        return decimalFormat2.format(d10);
    }

    public int d(int i10) {
        return this.f19208a.o() == 0 ? i10 : (int) ((((double) i10) * 1.8d) + 32.0d);
    }

    public String e() {
        return this.f19208a.o() == 0 ? "°C" : "°F";
    }

    public String f(int i10) {
        if (this.f19208a.o() != 0) {
            i10 = (int) ((((double) i10) * 1.8d) + 32.0d);
        }
        return Integer.toString(i10);
    }

    public boolean g(float f10) {
        float floatValue = k(1, 1, f10).floatValue();
        return floatValue != 0.0f && floatValue > this.f19208a.f();
    }

    public boolean h(float f10) {
        float floatValue = k(1, 1, f10).floatValue();
        return floatValue != 0.0f && floatValue < this.f19208a.g();
    }

    public boolean i(float f10) {
        float floatValue = k(1, 1, f10).floatValue();
        return (floatValue != 0.0f && floatValue < this.f19208a.g()) || floatValue > this.f19208a.f();
    }

    public boolean j(int i10) {
        return i10 != 0 && i10 > this.f19208a.n();
    }

    public Float k(int i10, int i11, float f10) {
        NumberFormat instance = NumberFormat.getInstance(Locale.US);
        instance.setMaximumFractionDigits(i10);
        instance.setMinimumFractionDigits(i11);
        instance.setRoundingMode(RoundingMode.HALF_UP);
        return new Float(instance.format((double) f10));
    }
}
