package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.view.Surface;
import d.e0;
import d.t0;
import d.v;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import zb.r;

final class GifInfoHandle {

    /* renamed from: a  reason: collision with root package name */
    public volatile long f22100a;

    static {
        o.c();
    }

    public GifInfoHandle() {
    }

    public GifInfoHandle(AssetFileDescriptor assetFileDescriptor) throws IOException {
        try {
            this.f22100a = x(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), false);
        } finally {
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    public GifInfoHandle(FileDescriptor fileDescriptor) throws GifIOException {
        this.f22100a = x(fileDescriptor, 0, true);
    }

    public GifInfoHandle(InputStream inputStream) throws GifIOException {
        if (inputStream.markSupported()) {
            this.f22100a = openStream(inputStream);
            return;
        }
        throw new IllegalArgumentException("InputStream does not support marking");
    }

    public GifInfoHandle(String str) throws GifIOException {
        this.f22100a = openFile(str);
    }

    public GifInfoHandle(ByteBuffer byteBuffer) throws GifIOException {
        this.f22100a = openDirectByteBuffer(byteBuffer);
    }

    public GifInfoHandle(byte[] bArr) throws GifIOException {
        this.f22100a = openByteArray(bArr);
    }

    private static native void bindSurface(long j10, Surface surface, long[] jArr);

    public static native int createTempNativeFileDescriptor() throws GifIOException;

    public static native int extractNativeFileDescriptor(FileDescriptor fileDescriptor, boolean z10) throws GifIOException;

    private static native void free(long j10);

    private static native long getAllocationByteCount(long j10);

    private static native String getComment(long j10);

    private static native int getCurrentFrameIndex(long j10);

    private static native int getCurrentLoop(long j10);

    private static native int getCurrentPosition(long j10);

    private static native int getDuration(long j10);

    private static native int getFrameDuration(long j10, int i10);

    private static native int getHeight(long j10);

    private static native int getLoopCount(long j10);

    private static native long getMetadataByteCount(long j10);

    private static native int getNativeErrorCode(long j10);

    private static native int getNumberOfFrames(long j10);

    private static native long[] getSavedState(long j10);

    private static native long getSourceLength(long j10);

    private static native int getWidth(long j10);

    private static native void glTexImage2D(long j10, int i10, int i11);

    private static native void glTexSubImage2D(long j10, int i10, int i11);

    private static native void initTexImageDescriptor(long j10);

    private static native boolean isAnimationCompleted(long j10);

    private static native boolean isOpaque(long j10);

    @t0(21)
    public static int m(FileDescriptor fileDescriptor, boolean z10) throws GifIOException, ErrnoException {
        try {
            int createTempNativeFileDescriptor = createTempNativeFileDescriptor();
            Os.dup2(fileDescriptor, createTempNativeFileDescriptor);
            return createTempNativeFileDescriptor;
        } finally {
            if (z10) {
                Os.close(fileDescriptor);
            }
        }
    }

    public static native long openByteArray(byte[] bArr) throws GifIOException;

    public static native long openDirectByteBuffer(ByteBuffer byteBuffer) throws GifIOException;

    public static native long openFile(String str) throws GifIOException;

    public static native long openNativeFileDescriptor(int i10, long j10) throws GifIOException;

    public static native long openStream(InputStream inputStream) throws GifIOException;

    private static native void postUnbindSurface(long j10);

    private static native long renderFrame(long j10, Bitmap bitmap);

    private static native boolean reset(long j10);

    private static native long restoreRemainder(long j10);

    private static native int restoreSavedState(long j10, long[] jArr, Bitmap bitmap);

    private static native void saveRemainder(long j10);

    private static native void seekToFrame(long j10, int i10, Bitmap bitmap);

    private static native void seekToFrameGL(long j10, int i10);

    private static native void seekToTime(long j10, int i10, Bitmap bitmap);

    private static native void setLoopCount(long j10, char c10);

    private static native void setOptions(long j10, char c10, boolean z10);

    private static native void setSpeedFactor(long j10, float f10);

    private static native void startDecoderThread(long j10);

    private static native void stopDecoderThread(long j10);

    public static long x(FileDescriptor fileDescriptor, long j10, boolean z10) throws GifIOException {
        int i10;
        if (Build.VERSION.SDK_INT > 27) {
            try {
                i10 = m(fileDescriptor, z10);
            } catch (Exception e10) {
                throw new GifIOException(h.OPEN_FAILED.P, e10.getMessage());
            }
        } else {
            i10 = extractNativeFileDescriptor(fileDescriptor, z10);
        }
        return openNativeFileDescriptor(i10, j10);
    }

    public static GifInfoHandle y(ContentResolver contentResolver, Uri uri) throws IOException {
        if ("file".equals(uri.getScheme())) {
            return new GifInfoHandle(uri.getPath());
        }
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, r.f25096b);
        if (openAssetFileDescriptor != null) {
            return new GifInfoHandle(openAssetFileDescriptor);
        }
        throw new IOException("Could not open AssetFileDescriptor for " + uri);
    }

    public synchronized void A() {
        free(this.f22100a);
        this.f22100a = 0;
    }

    public synchronized long B(Bitmap bitmap) {
        return renderFrame(this.f22100a, bitmap);
    }

    public synchronized boolean C() {
        return reset(this.f22100a);
    }

    public synchronized long D() {
        return restoreRemainder(this.f22100a);
    }

    public synchronized int E(long[] jArr, Bitmap bitmap) {
        return restoreSavedState(this.f22100a, jArr, bitmap);
    }

    public synchronized void F() {
        saveRemainder(this.f22100a);
    }

    public synchronized void G(@e0(from = 0, to = 2147483647L) int i10, Bitmap bitmap) {
        seekToFrame(this.f22100a, i10, bitmap);
    }

    public void H(@e0(from = 0) int i10) {
        O(i10);
        seekToFrameGL(this.f22100a, i10);
    }

    public synchronized void I(@e0(from = 0, to = 2147483647L) int i10, Bitmap bitmap) {
        seekToTime(this.f22100a, i10, bitmap);
    }

    public void J(@e0(from = 0, to = 65535) int i10) {
        if (i10 < 0 || i10 > 65535) {
            throw new IllegalArgumentException("Loop count of range <0, 65535>");
        }
        synchronized (this) {
            setLoopCount(this.f22100a, (char) i10);
        }
    }

    public void K(char c10, boolean z10) {
        setOptions(this.f22100a, c10, z10);
    }

    public void L(@v(from = 0.0d, fromInclusive = false) float f10) {
        if (f10 <= 0.0f || Float.isNaN(f10)) {
            throw new IllegalArgumentException("Speed factor is not positive");
        }
        if (f10 < 4.656613E-10f) {
            f10 = 4.656613E-10f;
        }
        synchronized (this) {
            setSpeedFactor(this.f22100a, f10);
        }
    }

    public void M() {
        startDecoderThread(this.f22100a);
    }

    public void N() {
        stopDecoderThread(this.f22100a);
    }

    public final void O(@e0(from = 0) int i10) {
        int numberOfFrames = getNumberOfFrames(this.f22100a);
        if (i10 < 0 || i10 >= numberOfFrames) {
            throw new IndexOutOfBoundsException("Frame index is not in range <0;" + numberOfFrames + '>');
        }
    }

    public void a(Surface surface, long[] jArr) {
        bindSurface(this.f22100a, surface, jArr);
    }

    public synchronized long b() {
        return getAllocationByteCount(this.f22100a);
    }

    public synchronized String c() {
        return getComment(this.f22100a);
    }

    public synchronized int d() {
        return getCurrentFrameIndex(this.f22100a);
    }

    public synchronized int e() {
        return getCurrentLoop(this.f22100a);
    }

    public synchronized int f() {
        return getCurrentPosition(this.f22100a);
    }

    public void finalize() throws Throwable {
        try {
            A();
        } finally {
            super.finalize();
        }
    }

    public synchronized int g() {
        return getDuration(this.f22100a);
    }

    public synchronized int h(@e0(from = 0) int i10) {
        O(i10);
        return getFrameDuration(this.f22100a, i10);
    }

    public synchronized int i() {
        return getHeight(this.f22100a);
    }

    public synchronized int j() {
        return getLoopCount(this.f22100a);
    }

    public synchronized long k() {
        return getMetadataByteCount(this.f22100a);
    }

    public synchronized int l() {
        return getNativeErrorCode(this.f22100a);
    }

    public synchronized int n() {
        return getNumberOfFrames(this.f22100a);
    }

    public synchronized long[] o() {
        return getSavedState(this.f22100a);
    }

    public synchronized long p() {
        return getSourceLength(this.f22100a);
    }

    public synchronized int q() {
        return getWidth(this.f22100a);
    }

    public void r(int i10, int i11) {
        glTexImage2D(this.f22100a, i10, i11);
    }

    public void s(int i10, int i11) {
        glTexSubImage2D(this.f22100a, i10, i11);
    }

    public void t() {
        initTexImageDescriptor(this.f22100a);
    }

    public synchronized boolean u() {
        return isAnimationCompleted(this.f22100a);
    }

    public synchronized boolean v() {
        return isOpaque(this.f22100a);
    }

    public synchronized boolean w() {
        return this.f22100a == 0;
    }

    public synchronized void z() {
        postUnbindSurface(this.f22100a);
    }
}
