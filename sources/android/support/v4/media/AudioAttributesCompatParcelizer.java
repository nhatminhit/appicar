package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import d.x0;
import k3.e;

@x0({x0.a.O})
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e eVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(eVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e eVar) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, eVar);
    }
}
