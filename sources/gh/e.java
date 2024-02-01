package gh;

import java.io.IOException;

public class e extends RuntimeException {
    public e(IOException iOException) {
        super(iOException);
    }

    public e(String str) {
        super(new IOException(str));
    }

    public IOException a() {
        return (IOException) getCause();
    }
}
