package d6;

import d.o0;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import w7.p;
import w7.q0;

public final class j0 extends y {

    /* renamed from: h  reason: collision with root package name */
    public final a f6410h;

    public interface a {
        void a(ByteBuffer byteBuffer);

        void b(int i10, int i11, int i12);
    }

    public static final class b implements a {

        /* renamed from: j  reason: collision with root package name */
        public static final String f6411j = "WaveFileAudioBufferSink";

        /* renamed from: k  reason: collision with root package name */
        public static final int f6412k = 4;

        /* renamed from: l  reason: collision with root package name */
        public static final int f6413l = 40;

        /* renamed from: m  reason: collision with root package name */
        public static final int f6414m = 44;

        /* renamed from: a  reason: collision with root package name */
        public final String f6415a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f6416b;

        /* renamed from: c  reason: collision with root package name */
        public final ByteBuffer f6417c;

        /* renamed from: d  reason: collision with root package name */
        public int f6418d;

        /* renamed from: e  reason: collision with root package name */
        public int f6419e;

        /* renamed from: f  reason: collision with root package name */
        public int f6420f;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public RandomAccessFile f6421g;

        /* renamed from: h  reason: collision with root package name */
        public int f6422h;

        /* renamed from: i  reason: collision with root package name */
        public int f6423i;

        public b(String str) {
            this.f6415a = str;
            byte[] bArr = new byte[1024];
            this.f6416b = bArr;
            this.f6417c = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        }

        public void a(ByteBuffer byteBuffer) {
            try {
                d();
                f(byteBuffer);
            } catch (IOException e10) {
                p.e(f6411j, "Error writing data", e10);
            }
        }

        public void b(int i10, int i11, int i12) {
            try {
                e();
            } catch (IOException e10) {
                p.e(f6411j, "Error resetting", e10);
            }
            this.f6418d = i10;
            this.f6419e = i11;
            this.f6420f = i12;
        }

        public final String c() {
            int i10 = this.f6422h;
            this.f6422h = i10 + 1;
            return q0.E("%s-%04d.wav", this.f6415a, Integer.valueOf(i10));
        }

        public final void d() throws IOException {
            if (this.f6421g == null) {
                RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
                g(randomAccessFile);
                this.f6421g = randomAccessFile;
                this.f6423i = 44;
            }
        }

        public final void e() throws IOException {
            RandomAccessFile randomAccessFile = this.f6421g;
            if (randomAccessFile != null) {
                try {
                    this.f6417c.clear();
                    this.f6417c.putInt(this.f6423i - 8);
                    randomAccessFile.seek(4);
                    randomAccessFile.write(this.f6416b, 0, 4);
                    this.f6417c.clear();
                    this.f6417c.putInt(this.f6423i - 44);
                    randomAccessFile.seek(40);
                    randomAccessFile.write(this.f6416b, 0, 4);
                } catch (IOException e10) {
                    p.m(f6411j, "Error updating file size", e10);
                }
                try {
                    randomAccessFile.close();
                } finally {
                    this.f6421g = null;
                }
            }
        }

        public final void f(ByteBuffer byteBuffer) throws IOException {
            RandomAccessFile randomAccessFile = (RandomAccessFile) w7.a.g(this.f6421g);
            while (byteBuffer.hasRemaining()) {
                int min = Math.min(byteBuffer.remaining(), this.f6416b.length);
                byteBuffer.get(this.f6416b, 0, min);
                randomAccessFile.write(this.f6416b, 0, min);
                this.f6423i += min;
            }
        }

        public final void g(RandomAccessFile randomAccessFile) throws IOException {
            randomAccessFile.writeInt(l0.f6435a);
            randomAccessFile.writeInt(-1);
            randomAccessFile.writeInt(l0.f6436b);
            randomAccessFile.writeInt(l0.f6437c);
            this.f6417c.clear();
            this.f6417c.putInt(16);
            this.f6417c.putShort((short) l0.b(this.f6420f));
            this.f6417c.putShort((short) this.f6419e);
            this.f6417c.putInt(this.f6418d);
            int Z = q0.Z(this.f6420f, this.f6419e);
            this.f6417c.putInt(this.f6418d * Z);
            this.f6417c.putShort((short) Z);
            this.f6417c.putShort((short) ((Z * 8) / this.f6419e));
            randomAccessFile.write(this.f6416b, 0, this.f6417c.position());
            randomAccessFile.writeInt(l0.f6438d);
            randomAccessFile.writeInt(-1);
        }
    }

    public j0(a aVar) {
        this.f6410h = (a) w7.a.g(aVar);
    }

    public void d(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining != 0) {
            this.f6410h.a(byteBuffer.asReadOnlyBuffer());
            n(remaining).put(byteBuffer).flip();
        }
    }

    public boolean i(int i10, int i11, int i12) {
        return o(i10, i11, i12);
    }

    public void k() {
        if (c()) {
            this.f6410h.b(this.f6496b, this.f6497c, this.f6498d);
        }
    }
}
