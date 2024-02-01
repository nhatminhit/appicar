package d6;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.provider.Settings;
import d.o0;
import java.util.Arrays;
import w7.q0;

@TargetApi(21)
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final int f6281c = 8;

    /* renamed from: d  reason: collision with root package name */
    public static final d f6282d = new d(new int[]{2}, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final d f6283e = new d(new int[]{2, 5, 6}, 8);

    /* renamed from: f  reason: collision with root package name */
    public static final String f6284f = "external_surround_sound_enabled";

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6285a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6286b;

    public d(@o0 int[] iArr, int i10) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f6285a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f6285a = new int[0];
        }
        this.f6286b = i10;
    }

    public static boolean a() {
        return q0.f14786a >= 17 && "Amazon".equals(q0.f14788c);
    }

    public static d b(Context context) {
        return c(context, context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")));
    }

    @SuppressLint({"InlinedApi"})
    public static d c(Context context, @o0 Intent intent) {
        return (!a() || Settings.Global.getInt(context.getContentResolver(), f6284f, 0) != 1) ? (intent == null || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 0) ? f6282d : new d(intent.getIntArrayExtra("android.media.extra.ENCODINGS"), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8)) : f6283e;
    }

    @o0
    public static Uri d() {
        if (a()) {
            return Settings.Global.getUriFor(f6284f);
        }
        return null;
    }

    public int e() {
        return this.f6286b;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f6285a, dVar.f6285a) && this.f6286b == dVar.f6286b;
    }

    public boolean f(int i10) {
        return Arrays.binarySearch(this.f6285a, i10) >= 0;
    }

    public int hashCode() {
        return this.f6286b + (Arrays.hashCode(this.f6285a) * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f6286b + ", supportedEncodings=" + Arrays.toString(this.f6285a) + "]";
    }
}
