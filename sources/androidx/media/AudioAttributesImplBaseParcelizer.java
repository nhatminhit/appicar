package androidx.media;

import d.x0;
import k3.e;

@x0({x0.a.O})
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(e eVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2910a = eVar.M(audioAttributesImplBase.f2910a, 1);
        audioAttributesImplBase.f2911b = eVar.M(audioAttributesImplBase.f2911b, 2);
        audioAttributesImplBase.f2912c = eVar.M(audioAttributesImplBase.f2912c, 3);
        audioAttributesImplBase.f2913d = eVar.M(audioAttributesImplBase.f2913d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, e eVar) {
        eVar.j0(false, false);
        eVar.M0(audioAttributesImplBase.f2910a, 1);
        eVar.M0(audioAttributesImplBase.f2911b, 2);
        eVar.M0(audioAttributesImplBase.f2912c, 3);
        eVar.M0(audioAttributesImplBase.f2913d, 4);
    }
}
