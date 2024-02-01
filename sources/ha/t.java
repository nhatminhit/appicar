package ha;

import ja.n;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import pa.a;
import pa.c;
import pa.e;

public final class t implements Iterator<k> {
    public final a O;
    public final Object P;

    public t(Reader reader) {
        a aVar = new a(reader);
        this.O = aVar;
        aVar.Z0(true);
        this.P = new Object();
    }

    public t(String str) {
        this((Reader) new StringReader(str));
    }

    /* renamed from: a */
    public k next() throws o {
        if (hasNext()) {
            try {
                return n.a(this.O);
            } catch (StackOverflowError e10) {
                throw new o("Failed parsing JSON source to Json", e10);
            } catch (OutOfMemoryError e11) {
                throw new o("Failed parsing JSON source to Json", e11);
            } catch (o e12) {
                e = e12;
                if (e.getCause() instanceof EOFException) {
                    e = new NoSuchElementException();
                }
                throw e;
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        boolean z10;
        synchronized (this.P) {
            try {
                z10 = this.O.z0() != c.END_DOCUMENT;
            } catch (e e10) {
                throw new u((Throwable) e10);
            } catch (IOException e11) {
                throw new l((Throwable) e11);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
