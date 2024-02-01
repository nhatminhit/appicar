package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.Bundle;
import d.m0;
import d.t0;
import d.x0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@t0(21)
@x0({x0.a.P})
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: c  reason: collision with root package name */
    public static final String f2906c = "AudioAttributesCompat21";

    /* renamed from: d  reason: collision with root package name */
    public static Method f2907d;
    @x0({x0.a.P})

    /* renamed from: a  reason: collision with root package name */
    public AudioAttributes f2908a;
    @x0({x0.a.P})

    /* renamed from: b  reason: collision with root package name */
    public int f2909b;

    public AudioAttributesImplApi21() {
        this.f2909b = -1;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f2908a = audioAttributes;
        this.f2909b = i10;
    }

    public static AudioAttributesImpl b(Bundle bundle) {
        AudioAttributes audioAttributes;
        if (bundle == null || (audioAttributes = (AudioAttributes) bundle.getParcelable(AudioAttributesCompat.Q)) == null) {
            return null;
        }
        return new AudioAttributesImplApi21(audioAttributes, bundle.getInt(AudioAttributesCompat.U, -1));
    }

    public static Method c() {
        try {
            if (f2907d == null) {
                f2907d = AudioAttributes.class.getMethod("toLegacyStreamType", new Class[]{AudioAttributes.class});
            }
            return f2907d;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @m0
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AudioAttributesCompat.Q, this.f2908a);
        int i10 = this.f2909b;
        if (i10 != -1) {
            bundle.putInt(AudioAttributesCompat.U, i10);
        }
        return bundle;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f2908a.equals(((AudioAttributesImplApi21) obj).f2908a);
    }

    public Object f() {
        return this.f2908a;
    }

    public int g() {
        StringBuilder sb2;
        String str;
        int i10 = this.f2909b;
        if (i10 != -1) {
            return i10;
        }
        Method c10 = c();
        if (c10 == null) {
            sb2 = new StringBuilder();
            str = "No AudioAttributes#toLegacyStreamType() on API: ";
        } else {
            try {
                return ((Integer) c10.invoke((Object) null, new Object[]{this.f2908a})).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused) {
                sb2 = new StringBuilder();
                str = "getLegacyStreamType() failed on API: ";
            }
        }
        sb2.append(str);
        sb2.append(Build.VERSION.SDK_INT);
        return -1;
    }

    public int h() {
        return this.f2909b;
    }

    public int hashCode() {
        return this.f2908a.hashCode();
    }

    public int i() {
        return this.f2908a.getUsage();
    }

    public int j() {
        return this.f2908a.getFlags();
    }

    public int k() {
        return this.f2908a.getContentType();
    }

    public int l() {
        return Build.VERSION.SDK_INT >= 26 ? this.f2908a.getVolumeControlStream() : AudioAttributesCompat.d(true, j(), i());
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f2908a;
    }
}
