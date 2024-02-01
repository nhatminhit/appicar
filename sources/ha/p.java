package ha;

import ja.n;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import pa.a;
import pa.c;
import pa.e;

public final class p {
    public static k d(Reader reader) throws l, u {
        try {
            a aVar = new a(reader);
            k e10 = e(aVar);
            if (!e10.w()) {
                if (aVar.z0() != c.END_DOCUMENT) {
                    throw new u("Did not consume the entire document.");
                }
            }
            return e10;
        } catch (e e11) {
            throw new u((Throwable) e11);
        } catch (IOException e12) {
            throw new l((Throwable) e12);
        } catch (NumberFormatException e13) {
            throw new u((Throwable) e13);
        }
    }

    public static k e(a aVar) throws l, u {
        boolean q10 = aVar.q();
        aVar.Z0(true);
        try {
            k a10 = n.a(aVar);
            aVar.Z0(q10);
            return a10;
        } catch (StackOverflowError e10) {
            throw new o("Failed parsing JSON source: " + aVar + " to Json", e10);
        } catch (OutOfMemoryError e11) {
            throw new o("Failed parsing JSON source: " + aVar + " to Json", e11);
        } catch (Throwable th2) {
            aVar.Z0(q10);
            throw th2;
        }
    }

    public static k f(String str) throws u {
        return d(new StringReader(str));
    }

    @Deprecated
    public k a(Reader reader) throws l, u {
        return d(reader);
    }

    @Deprecated
    public k b(String str) throws u {
        return f(str);
    }

    @Deprecated
    public k c(a aVar) throws l, u {
        return e(aVar);
    }
}
