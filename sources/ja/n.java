package ja;

import ha.k;
import java.io.IOException;
import java.io.Writer;
import pa.d;

public final class n {

    public static final class a extends Writer {
        public final Appendable O;
        public final C0334a P = new C0334a();

        /* renamed from: ja.n$a$a  reason: collision with other inner class name */
        public static class C0334a implements CharSequence {
            public char[] O;

            public char charAt(int i10) {
                return this.O[i10];
            }

            public int length() {
                return this.O.length;
            }

            public CharSequence subSequence(int i10, int i11) {
                return new String(this.O, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.O = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i10) throws IOException {
            this.O.append((char) i10);
        }

        public void write(char[] cArr, int i10, int i11) throws IOException {
            C0334a aVar = this.P;
            aVar.O = cArr;
            this.O.append(aVar, i10, i11 + i10);
        }
    }

    public n() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new ha.l((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new ha.u((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return ha.m.O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new ha.u((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new ha.u((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: e (r2v4 'e' pa.e A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ha.k a(pa.a r2) throws ha.o {
        /*
            r2.z0()     // Catch:{ EOFException -> 0x0024, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            ha.y<ha.k> r1 = ka.n.U     // Catch:{ EOFException -> 0x000d, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.e(r2)     // Catch:{ EOFException -> 0x000d, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            ha.k r2 = (ha.k) r2     // Catch:{ EOFException -> 0x000d, e -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            ha.u r0 = new ha.u
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            ha.l r0 = new ha.l
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            ha.u r0 = new ha.u
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            ha.m r2 = ha.m.O
            return r2
        L_0x002b:
            ha.u r0 = new ha.u
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.n.a(pa.a):ha.k");
    }

    public static void b(k kVar, d dVar) throws IOException {
        ka.n.U.i(dVar, kVar);
    }

    public static Writer c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
