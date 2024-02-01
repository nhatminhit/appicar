package va;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Vibrator;
import java.io.IOException;
import va.l;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final String f23523d = "e";

    /* renamed from: e  reason: collision with root package name */
    public static final float f23524e = 0.1f;

    /* renamed from: f  reason: collision with root package name */
    public static final long f23525f = 200;

    /* renamed from: a  reason: collision with root package name */
    public final Context f23526a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23527b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23528c = false;

    public e(Activity activity) {
        activity.setVolumeControlStream(3);
        this.f23526a = activity.getApplicationContext();
    }

    public static /* synthetic */ void e(MediaPlayer mediaPlayer) {
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
    }

    public static /* synthetic */ boolean f(MediaPlayer mediaPlayer, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failed to beep ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        mediaPlayer.stop();
        mediaPlayer.reset();
        mediaPlayer.release();
        return true;
    }

    public boolean c() {
        return this.f23527b;
    }

    public boolean d() {
        return this.f23528c;
    }

    public MediaPlayer g() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new c());
        mediaPlayer.setOnErrorListener(new d());
        try {
            openRawResourceFd = this.f23526a.getResources().openRawResourceFd(l.j.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
            return mediaPlayer;
        } catch (IOException unused) {
            mediaPlayer.reset();
            mediaPlayer.release();
            return null;
        } catch (Throwable th2) {
            openRawResourceFd.close();
            throw th2;
        }
    }

    @SuppressLint({"MissingPermission"})
    public synchronized void h() {
        Vibrator vibrator;
        if (this.f23527b) {
            g();
        }
        if (this.f23528c && (vibrator = (Vibrator) this.f23526a.getSystemService("vibrator")) != null) {
            vibrator.vibrate(200);
        }
    }

    public void i(boolean z10) {
        this.f23527b = z10;
    }

    public void j(boolean z10) {
        this.f23528c = z10;
    }
}
