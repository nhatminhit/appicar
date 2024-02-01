package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import d.e0;
import d.m0;
import d.o0;
import d.s0;
import d.u;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Locale;

public class GifAnimationMetaData implements Serializable, Parcelable {
    public static final Parcelable.Creator<GifAnimationMetaData> CREATOR = new a();
    public static final long V = 5692363926580237325L;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final long T;
    public final long U;

    public class a implements Parcelable.Creator<GifAnimationMetaData> {
        /* renamed from: a */
        public GifAnimationMetaData createFromParcel(Parcel parcel) {
            return new GifAnimationMetaData(parcel, (a) null);
        }

        /* renamed from: b */
        public GifAnimationMetaData[] newArray(int i10) {
            return new GifAnimationMetaData[i10];
        }
    }

    public GifAnimationMetaData(@o0 ContentResolver contentResolver, @m0 Uri uri) throws IOException {
        this(GifInfoHandle.y(contentResolver, uri));
    }

    public GifAnimationMetaData(@m0 AssetFileDescriptor assetFileDescriptor) throws IOException {
        this(new GifInfoHandle(assetFileDescriptor));
    }

    public GifAnimationMetaData(@m0 AssetManager assetManager, @m0 String str) throws IOException {
        this(assetManager.openFd(str));
    }

    public GifAnimationMetaData(@m0 Resources resources, @s0 @u int i10) throws Resources.NotFoundException, IOException {
        this(resources.openRawResourceFd(i10));
    }

    public GifAnimationMetaData(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = parcel.readInt();
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.U = parcel.readLong();
        this.T = parcel.readLong();
    }

    public /* synthetic */ GifAnimationMetaData(Parcel parcel, a aVar) {
        this(parcel);
    }

    public GifAnimationMetaData(@m0 File file) throws IOException {
        this(file.getPath());
    }

    public GifAnimationMetaData(@m0 FileDescriptor fileDescriptor) throws IOException {
        this(new GifInfoHandle(fileDescriptor));
    }

    public GifAnimationMetaData(@m0 InputStream inputStream) throws IOException {
        this(new GifInfoHandle(inputStream));
    }

    public GifAnimationMetaData(@m0 String str) throws IOException {
        this(new GifInfoHandle(str));
    }

    public GifAnimationMetaData(@m0 ByteBuffer byteBuffer) throws IOException {
        this(new GifInfoHandle(byteBuffer));
    }

    public GifAnimationMetaData(GifInfoHandle gifInfoHandle) {
        this.O = gifInfoHandle.j();
        this.P = gifInfoHandle.g();
        this.R = gifInfoHandle.q();
        this.Q = gifInfoHandle.i();
        this.S = gifInfoHandle.n();
        this.U = gifInfoHandle.k();
        this.T = gifInfoHandle.b();
        gifInfoHandle.A();
    }

    public GifAnimationMetaData(@m0 byte[] bArr) throws IOException {
        this(new GifInfoHandle(bArr));
    }

    public long a() {
        return this.T;
    }

    @nh.a
    public long b(@o0 e eVar, @e0(from = 1, to = 65535) int i10) {
        if (i10 < 1 || i10 > 65535) {
            throw new IllegalStateException("Sample size " + i10 + " out of range <1, " + 65535 + ">");
        }
        int i11 = i10 * i10;
        return (this.T / ((long) i11)) + ((long) ((eVar == null || eVar.T.isRecycled()) ? ((this.R * this.Q) * 4) / i11 : eVar.T.getAllocationByteCount()));
    }

    public int c() {
        return this.P;
    }

    public int d() {
        return this.Q;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.O;
    }

    public long f() {
        return this.U;
    }

    public int g() {
        return this.S;
    }

    public int h() {
        return this.R;
    }

    public boolean j() {
        return this.S > 1 && this.P > 0;
    }

    @m0
    public String toString() {
        int i10 = this.O;
        String format = String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d", new Object[]{Integer.valueOf(this.R), Integer.valueOf(this.Q), Integer.valueOf(this.S), i10 == 0 ? "Infinity" : Integer.toString(i10), Integer.valueOf(this.P)});
        if (!j()) {
            return format;
        }
        return "Animated " + format;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeLong(this.U);
        parcel.writeLong(this.T);
    }
}
