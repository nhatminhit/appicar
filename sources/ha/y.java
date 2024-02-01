package ha;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import ka.f;
import ka.g;
import pa.c;
import pa.d;

public abstract class y<T> {

    public class a extends y<T> {
        public a() {
        }

        public T e(pa.a aVar) throws IOException {
            if (aVar.z0() != c.NULL) {
                return y.this.e(aVar);
            }
            aVar.c0();
            return null;
        }

        public void i(d dVar, T t10) throws IOException {
            if (t10 == null) {
                dVar.N();
            } else {
                y.this.i(dVar, t10);
            }
        }
    }

    public final T a(Reader reader) throws IOException {
        return e(new pa.a(reader));
    }

    public final T b(String str) throws IOException {
        return a(new StringReader(str));
    }

    public final T c(k kVar) {
        try {
            return e(new f(kVar));
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public final y<T> d() {
        return new a();
    }

    public abstract T e(pa.a aVar) throws IOException;

    public final String f(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            g(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void g(Writer writer, T t10) throws IOException {
        i(new d(writer), t10);
    }

    public final k h(T t10) {
        try {
            g gVar = new g();
            i(gVar, t10);
            return gVar.h1();
        } catch (IOException e10) {
            throw new l((Throwable) e10);
        }
    }

    public abstract void i(d dVar, T t10) throws IOException;
}
