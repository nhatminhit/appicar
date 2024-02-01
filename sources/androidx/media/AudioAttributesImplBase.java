package androidx.media;

import android.os.Bundle;
import d.m0;
import d.x0;
import java.util.Arrays;

@x0({x0.a.P})
public class AudioAttributesImplBase implements AudioAttributesImpl {
    @x0({x0.a.P})

    /* renamed from: a  reason: collision with root package name */
    public int f2910a;
    @x0({x0.a.P})

    /* renamed from: b  reason: collision with root package name */
    public int f2911b;
    @x0({x0.a.P})

    /* renamed from: c  reason: collision with root package name */
    public int f2912c;
    @x0({x0.a.P})

    /* renamed from: d  reason: collision with root package name */
    public int f2913d;

    public AudioAttributesImplBase() {
        this.f2910a = 0;
        this.f2911b = 0;
        this.f2912c = 0;
        this.f2913d = -1;
    }

    public AudioAttributesImplBase(int i10, int i11, int i12, int i13) {
        this.f2911b = i10;
        this.f2912c = i11;
        this.f2910a = i12;
        this.f2913d = i13;
    }

    public static AudioAttributesImpl b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return new AudioAttributesImplBase(bundle.getInt(AudioAttributesCompat.S, 0), bundle.getInt(AudioAttributesCompat.T, 0), bundle.getInt(AudioAttributesCompat.R, 0), bundle.getInt(AudioAttributesCompat.U, -1));
    }

    @m0
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(AudioAttributesCompat.R, this.f2910a);
        bundle.putInt(AudioAttributesCompat.S, this.f2911b);
        bundle.putInt(AudioAttributesCompat.T, this.f2912c);
        int i10 = this.f2913d;
        if (i10 != -1) {
            bundle.putInt(AudioAttributesCompat.U, i10);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f2911b == audioAttributesImplBase.k() && this.f2912c == audioAttributesImplBase.j() && this.f2910a == audioAttributesImplBase.i() && this.f2913d == audioAttributesImplBase.f2913d;
    }

    public Object f() {
        return null;
    }

    public int g() {
        int i10 = this.f2913d;
        return i10 != -1 ? i10 : AudioAttributesCompat.d(false, this.f2912c, this.f2910a);
    }

    public int h() {
        return this.f2913d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2911b), Integer.valueOf(this.f2912c), Integer.valueOf(this.f2910a), Integer.valueOf(this.f2913d)});
    }

    public int i() {
        return this.f2910a;
    }

    public int j() {
        int i10 = this.f2912c;
        int g10 = g();
        if (g10 == 6) {
            i10 |= 4;
        } else if (g10 == 7) {
            i10 |= 1;
        }
        return i10 & 273;
    }

    public int k() {
        return this.f2911b;
    }

    public int l() {
        return AudioAttributesCompat.d(true, this.f2912c, this.f2910a);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f2913d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f2913d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        sb2.append(AudioAttributesCompat.o(this.f2910a));
        sb2.append(" content=");
        sb2.append(this.f2911b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f2912c).toUpperCase());
        return sb2.toString();
    }
}
