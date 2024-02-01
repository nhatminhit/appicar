package b5;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import w4.f;

public interface c {

    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f4144a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f4145b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4146c;

        /* renamed from: d  reason: collision with root package name */
        public int f4147d;

        /* renamed from: e  reason: collision with root package name */
        public int f4148e;

        public a(InputStream inputStream, byte[] bArr) {
            this.f4144a = inputStream;
            this.f4145b = bArr;
            this.f4146c = 0;
            this.f4148e = 0;
            this.f4147d = 0;
        }

        public a(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        public a(byte[] bArr, int i10, int i11) {
            this.f4144a = null;
            this.f4145b = bArr;
            this.f4148e = i10;
            this.f4146c = i10;
            this.f4147d = i10 + i11;
        }

        public byte a() throws IOException {
            if (this.f4148e < this.f4147d || b()) {
                byte[] bArr = this.f4145b;
                int i10 = this.f4148e;
                this.f4148e = i10 + 1;
                return bArr[i10];
            }
            throw new EOFException("Failed auto-detect: could not read more than " + this.f4148e + " bytes (max buffer size: " + this.f4145b.length + ")");
        }

        public boolean b() throws IOException {
            int read;
            int i10 = this.f4148e;
            if (i10 < this.f4147d) {
                return true;
            }
            InputStream inputStream = this.f4144a;
            if (inputStream == null) {
                return false;
            }
            byte[] bArr = this.f4145b;
            int length = bArr.length - i10;
            if (length < 1 || (read = inputStream.read(bArr, i10, length)) <= 0) {
                return false;
            }
            this.f4147d += read;
            return true;
        }

        public b c(f fVar, d dVar) {
            InputStream inputStream = this.f4144a;
            byte[] bArr = this.f4145b;
            int i10 = this.f4146c;
            return new b(inputStream, bArr, i10, this.f4147d - i10, fVar, dVar);
        }

        public void reset() {
            this.f4148e = this.f4146c;
        }
    }

    byte a() throws IOException;

    boolean b() throws IOException;

    void reset();
}
