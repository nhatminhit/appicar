package g4;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import d.g1;
import d.m0;
import d.o0;
import d.t0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import v3.h;
import v3.i;
import v3.k;
import y3.v;

public class k0<T> implements k<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f7938d = "VideoDecoder";

    /* renamed from: e  reason: collision with root package name */
    public static final long f7939e = -1;
    @g1

    /* renamed from: f  reason: collision with root package name */
    public static final int f7940f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final h<Long> f7941g = h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: h  reason: collision with root package name */
    public static final h<Integer> f7942h = h.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* renamed from: i  reason: collision with root package name */
    public static final e f7943i = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f7944a;

    /* renamed from: b  reason: collision with root package name */
    public final z3.e f7945b;

    /* renamed from: c  reason: collision with root package name */
    public final e f7946c;

    public class a implements h.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f7947a = ByteBuffer.allocate(8);

        /* renamed from: b */
        public void a(@m0 byte[] bArr, @m0 Long l10, @m0 MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f7947a) {
                this.f7947a.position(0);
                messageDigest.update(this.f7947a.putLong(l10.longValue()).array());
            }
        }
    }

    public class b implements h.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f7948a = ByteBuffer.allocate(4);

        /* renamed from: b */
        public void a(@m0 byte[] bArr, @m0 Integer num, @m0 MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f7948a) {
                    this.f7948a.position(0);
                    messageDigest.update(this.f7948a.putInt(num.intValue()).array());
                }
            }
        }
    }

    public static final class c implements f<AssetFileDescriptor> {
        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @t0(23)
    public static final class d implements f<ByteBuffer> {

        public class a extends MediaDataSource {
            public final /* synthetic */ ByteBuffer O;

            public a(ByteBuffer byteBuffer) {
                this.O = byteBuffer;
            }

            public void close() {
            }

            public long getSize() {
                return (long) this.O.limit();
            }

            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= ((long) this.O.limit())) {
                    return -1;
                }
                this.O.position((int) j10);
                int min = Math.min(i11, this.O.remaining());
                this.O.get(bArr, i10, min);
                return min;
            }
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    @g1
    public static class e {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    @g1
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t10);
    }

    public static final class g implements f<ParcelFileDescriptor> {
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public k0(z3.e eVar, f<T> fVar) {
        this(eVar, fVar, f7943i);
    }

    @g1
    public k0(z3.e eVar, f<T> fVar, e eVar2) {
        this.f7945b = eVar;
        this.f7944a = fVar;
        this.f7946c = eVar2;
    }

    public static k<AssetFileDescriptor, Bitmap> c(z3.e eVar) {
        return new k0(eVar, new c((a) null));
    }

    @t0(api = 23)
    public static k<ByteBuffer, Bitmap> d(z3.e eVar) {
        return new k0(eVar, new d());
    }

    @o0
    public static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, p pVar) {
        Bitmap g10 = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || pVar == p.f7987f) ? null : g(mediaMetadataRetriever, j10, i10, i11, i12, pVar);
        return g10 == null ? f(mediaMetadataRetriever, j10, i10) : g10;
    }

    public static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    @TargetApi(27)
    public static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, p pVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i13 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i13;
            }
            float b10 = pVar.b(parseInt, parseInt2, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(((float) parseInt) * b10), Math.round(b10 * ((float) parseInt2)));
        } catch (Throwable unused) {
            Log.isLoggable(f7938d, 3);
            return null;
        }
    }

    public static k<ParcelFileDescriptor, Bitmap> h(z3.e eVar) {
        return new k0(eVar, new g());
    }

    public v<Bitmap> a(@m0 T t10, int i10, int i11, @m0 i iVar) throws IOException {
        long longValue = ((Long) iVar.c(f7941g)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.c(f7942h);
            if (num == null) {
                num = 2;
            }
            p pVar = (p) iVar.c(p.f7989h);
            if (pVar == null) {
                pVar = p.f7988g;
            }
            p pVar2 = pVar;
            MediaMetadataRetriever a10 = this.f7946c.a();
            try {
                this.f7944a.a(a10, t10);
                Bitmap e10 = e(a10, longValue, num.intValue(), i10, i11, pVar2);
                a10.release();
                return g.f(e10, this.f7945b);
            } catch (RuntimeException e11) {
                throw new IOException(e11);
            } catch (Throwable th2) {
                a10.release();
                throw th2;
            }
        } else {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
    }

    public boolean b(@m0 T t10, @m0 i iVar) {
        return true;
    }
}
