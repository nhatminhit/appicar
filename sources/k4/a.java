package k4;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import d.g1;
import d.m0;
import d.o0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import t4.g;
import t4.m;
import u3.a;
import u3.c;
import u3.d;
import u3.f;
import v3.i;
import v3.k;
import z3.e;

public class a implements k<ByteBuffer, c> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f9971f = "BufferGifDecoder";

    /* renamed from: g  reason: collision with root package name */
    public static final C0168a f9972g = new C0168a();

    /* renamed from: h  reason: collision with root package name */
    public static final b f9973h = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9974a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f9975b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9976c;

    /* renamed from: d  reason: collision with root package name */
    public final C0168a f9977d;

    /* renamed from: e  reason: collision with root package name */
    public final b f9978e;

    @g1
    /* renamed from: k4.a$a  reason: collision with other inner class name */
    public static class C0168a {
        public u3.a a(a.C0227a aVar, c cVar, ByteBuffer byteBuffer, int i10) {
            return new f(aVar, cVar, byteBuffer, i10);
        }
    }

    @g1
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Queue<d> f9979a = m.f(0);

        public synchronized d a(ByteBuffer byteBuffer) {
            d poll;
            poll = this.f9979a.poll();
            if (poll == null) {
                poll = new d();
            }
            return poll.q(byteBuffer);
        }

        public synchronized void b(d dVar) {
            dVar.a();
            this.f9979a.offer(dVar);
        }
    }

    public a(Context context) {
        this(context, com.bumptech.glide.b.d(context).m().g(), com.bumptech.glide.b.d(context).g(), com.bumptech.glide.b.d(context).f());
    }

    public a(Context context, List<ImageHeaderParser> list, e eVar, z3.b bVar) {
        this(context, list, eVar, bVar, f9973h, f9972g);
    }

    @g1
    public a(Context context, List<ImageHeaderParser> list, e eVar, z3.b bVar, b bVar2, C0168a aVar) {
        this.f9974a = context.getApplicationContext();
        this.f9975b = list;
        this.f9977d = aVar;
        this.f9978e = new b(eVar, bVar);
        this.f9976c = bVar2;
    }

    public static int e(c cVar, int i10, int i11) {
        int min = Math.min(cVar.a() / i11, cVar.d() / i10);
        int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
        if (Log.isLoggable(f9971f, 2) && max > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Downsampling GIF, sampleSize: ");
            sb2.append(max);
            sb2.append(", target dimens: [");
            sb2.append(i10);
            sb2.append("x");
            sb2.append(i11);
            sb2.append("], actual dimens: [");
            sb2.append(cVar.d());
            sb2.append("x");
            sb2.append(cVar.a());
            sb2.append("]");
        }
        return max;
    }

    @o0
    public final e c(ByteBuffer byteBuffer, int i10, int i11, d dVar, i iVar) {
        long b10 = g.b();
        try {
            c d10 = dVar.d();
            if (d10.b() > 0) {
                if (d10.c() == 0) {
                    Bitmap.Config config = iVar.c(i.f10007a) == v3.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    u3.a a10 = this.f9977d.a(this.f9978e, d10, byteBuffer, e(d10, i10, i11));
                    a10.h(config);
                    a10.d();
                    Bitmap c10 = a10.c();
                    if (c10 == null) {
                        if (Log.isLoggable(f9971f, 2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Decoded GIF from stream in ");
                            sb2.append(g.a(b10));
                        }
                        return null;
                    }
                    e eVar = new e(new c(this.f9974a, a10, f4.c.c(), i10, i11, c10));
                    if (Log.isLoggable(f9971f, 2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Decoded GIF from stream in ");
                        sb3.append(g.a(b10));
                    }
                    return eVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(f9971f, 2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Decoded GIF from stream in ");
                sb4.append(g.a(b10));
            }
        }
    }

    /* renamed from: d */
    public e a(@m0 ByteBuffer byteBuffer, int i10, int i11, @m0 i iVar) {
        d a10 = this.f9976c.a(byteBuffer);
        try {
            return c(byteBuffer, i10, i11, a10, iVar);
        } finally {
            this.f9976c.b(a10);
        }
    }

    /* renamed from: f */
    public boolean b(@m0 ByteBuffer byteBuffer, @m0 i iVar) throws IOException {
        return !((Boolean) iVar.c(i.f10008b)).booleanValue() && com.bumptech.glide.load.a.e(this.f9975b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
