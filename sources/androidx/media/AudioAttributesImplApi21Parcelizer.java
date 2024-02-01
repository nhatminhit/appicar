package androidx.media;

import android.media.AudioAttributes;
import d.x0;
import k3.e;

@x0({x0.a.O})
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(e eVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2908a = (AudioAttributes) eVar.W(audioAttributesImplApi21.f2908a, 1);
        audioAttributesImplApi21.f2909b = eVar.M(audioAttributesImplApi21.f2909b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, e eVar) {
        eVar.j0(false, false);
        eVar.X0(audioAttributesImplApi21.f2908a, 1);
        eVar.M0(audioAttributesImplApi21.f2909b, 2);
    }
}
