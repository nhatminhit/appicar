package c5;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;

public abstract class k implements Serializable {
    public abstract OutputStream a(d dVar, OutputStream outputStream) throws IOException;

    public abstract Writer b(d dVar, Writer writer) throws IOException;
}
