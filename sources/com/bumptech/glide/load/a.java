package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import d.m0;
import d.o0;
import d.t0;
import g4.b0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import w3.m;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f4992a = 5242880;

    /* renamed from: com.bumptech.glide.load.a$a  reason: collision with other inner class name */
    public class C0083a implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f4993a;

        public C0083a(InputStream inputStream) {
            this.f4993a = inputStream;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f4993a);
            } finally {
                this.f4993a.reset();
            }
        }
    }

    public class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f4994a;

        public b(ByteBuffer byteBuffer) {
            this.f4994a = byteBuffer;
        }

        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.a(this.f4994a);
        }
    }

    public class c implements g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f4995a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ z3.b f4996b;

        public c(m mVar, z3.b bVar) {
            this.f4995a = mVar;
            this.f4996b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                g4.b0 r1 = new g4.b0     // Catch:{ all -> 0x0027 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
                w3.m r3 = r4.f4995a     // Catch:{ all -> 0x0027 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0027 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
                r2.<init>(r3)     // Catch:{ all -> 0x0027 }
                z3.b r3 = r4.f4996b     // Catch:{ all -> 0x0027 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
                com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.b(r1)     // Catch:{ all -> 0x0024 }
                r1.close()     // Catch:{ IOException -> 0x001e }
            L_0x001e:
                w3.m r0 = r4.f4995a
                r0.a()
                return r5
            L_0x0024:
                r5 = move-exception
                r0 = r1
                goto L_0x0028
            L_0x0027:
                r5 = move-exception
            L_0x0028:
                if (r0 == 0) goto L_0x002d
                r0.close()     // Catch:{ IOException -> 0x002d }
            L_0x002d:
                w3.m r0 = r4.f4995a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.c.a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
        }
    }

    public class d implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InputStream f4997a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ z3.b f4998b;

        public d(InputStream inputStream, z3.b bVar) {
            this.f4997a = inputStream;
            this.f4998b = bVar;
        }

        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f4997a, this.f4998b);
            } finally {
                this.f4997a.reset();
            }
        }
    }

    public class e implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ m f4999a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ z3.b f5000b;

        public e(m mVar, z3.b bVar) {
            this.f4999a = mVar;
            this.f5000b = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
            /*
                r4 = this;
                r0 = 0
                g4.b0 r1 = new g4.b0     // Catch:{ all -> 0x0029 }
                java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
                w3.m r3 = r4.f4999a     // Catch:{ all -> 0x0029 }
                android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0029 }
                java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
                r2.<init>(r3)     // Catch:{ all -> 0x0029 }
                z3.b r3 = r4.f5000b     // Catch:{ all -> 0x0029 }
                r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
                z3.b r0 = r4.f5000b     // Catch:{ all -> 0x0026 }
                int r5 = r5.d(r1, r0)     // Catch:{ all -> 0x0026 }
                r1.close()     // Catch:{ IOException -> 0x0020 }
            L_0x0020:
                w3.m r0 = r4.f4999a
                r0.a()
                return r5
            L_0x0026:
                r5 = move-exception
                r0 = r1
                goto L_0x002a
            L_0x0029:
                r5 = move-exception
            L_0x002a:
                if (r0 == 0) goto L_0x002f
                r0.close()     // Catch:{ IOException -> 0x002f }
            L_0x002f:
                w3.m r0 = r4.f4999a
                r0.a()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.e.a(com.bumptech.glide.load.ImageHeaderParser):int");
        }
    }

    public interface f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static int a(@m0 List<ImageHeaderParser> list, @o0 InputStream inputStream, @m0 z3.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new b0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, bVar));
    }

    @t0(21)
    public static int b(@m0 List<ImageHeaderParser> list, @m0 m mVar, @m0 z3.b bVar) throws IOException {
        return c(list, new e(mVar, bVar));
    }

    public static int c(@m0 List<ImageHeaderParser> list, f fVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int a10 = fVar.a(list.get(i10));
            if (a10 != -1) {
                return a10;
            }
        }
        return -1;
    }

    @m0
    public static ImageHeaderParser.ImageType d(@m0 List<ImageHeaderParser> list, @o0 InputStream inputStream, @m0 z3.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new b0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return g(list, new C0083a(inputStream));
    }

    @m0
    public static ImageHeaderParser.ImageType e(@m0 List<ImageHeaderParser> list, @o0 ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : g(list, new b(byteBuffer));
    }

    @t0(21)
    @m0
    public static ImageHeaderParser.ImageType f(@m0 List<ImageHeaderParser> list, @m0 m mVar, @m0 z3.b bVar) throws IOException {
        return g(list, new c(mVar, bVar));
    }

    @m0
    public static ImageHeaderParser.ImageType g(@m0 List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType a10 = gVar.a(list.get(i10));
            if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a10;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
