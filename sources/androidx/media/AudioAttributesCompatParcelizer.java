package androidx.media;

import d.x0;
import k3.e;

@x0({x0.a.O})
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e eVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f2897a = (AudioAttributesImpl) eVar.h0(audioAttributesCompat.f2897a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e eVar) {
        eVar.j0(false, false);
        eVar.m1(audioAttributesCompat.f2897a, 1);
    }
}
