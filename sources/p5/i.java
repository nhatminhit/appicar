package p5;

import i5.g;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.Iterator;
import java.util.ServiceLoader;
import n5.e0;
import w4.l;
import w4.p;

public class i extends e0<Path> {
    public static final long U = 1;
    public static final boolean V;

    static {
        File[] listRoots = File.listRoots();
        int length = listRoots.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String path = listRoots[i10].getPath();
            if (path.length() >= 2 && Character.isLetter(path.charAt(0)) && path.charAt(1) == ':') {
                z10 = true;
                break;
            }
            i10++;
        }
        V = z10;
    }

    public i() {
        super((Class<?>) Path.class);
    }

    /* renamed from: E0 */
    public Path f(l lVar, g gVar) throws IOException {
        if (!lVar.q2(p.VALUE_STRING)) {
            return (Path) gVar.i0(Path.class, lVar);
        }
        String Y1 = lVar.Y1();
        if (Y1.indexOf(58) < 0) {
            return Paths.get(Y1, new String[0]);
        }
        if (V && Y1.length() >= 2 && Character.isLetter(Y1.charAt(0)) && Y1.charAt(1) == ':') {
            return Paths.get(Y1, new String[0]);
        }
        try {
            URI uri = new URI(Y1);
            try {
                return Paths.get(uri);
            } catch (FileSystemNotFoundException e10) {
                String scheme = uri.getScheme();
                Iterator<S> it = ServiceLoader.load(FileSystemProvider.class).iterator();
                while (it.hasNext()) {
                    FileSystemProvider fileSystemProvider = (FileSystemProvider) it.next();
                    if (fileSystemProvider.getScheme().equalsIgnoreCase(scheme)) {
                        return fileSystemProvider.getPath(uri);
                    }
                }
                return (Path) gVar.b0(r(), Y1, e10);
            } catch (Throwable th2) {
                th2.addSuppressed(e10);
                return (Path) gVar.b0(r(), Y1, th2);
            }
        } catch (URISyntaxException e11) {
            return (Path) gVar.b0(r(), Y1, e11);
        }
    }
}
