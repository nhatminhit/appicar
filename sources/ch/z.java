package ch;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

public interface z extends Closeable, Flushable {
    b0 b();

    void close() throws IOException;

    void d1(c cVar, long j10) throws IOException;

    void flush() throws IOException;
}
