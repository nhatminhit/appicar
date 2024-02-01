package x2;

import a3.f;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import d.m0;
import d.o0;
import d.x0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import u2.n2;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class c {
    @o0
    public static CancellationSignal a() {
        return new CancellationSignal();
    }

    /* JADX INFO: finally extract failed */
    public static void b(a3.c cVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor G0 = cVar.G0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (G0.moveToNext()) {
            try {
                arrayList.add(G0.getString(0));
            } catch (Throwable th2) {
                G0.close();
                throw th2;
            }
        }
        G0.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                cVar.E("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @Deprecated
    @m0
    public static Cursor c(n2 n2Var, f fVar, boolean z10) {
        return d(n2Var, fVar, z10, (CancellationSignal) null);
    }

    @m0
    public static Cursor d(@m0 n2 n2Var, @m0 f fVar, boolean z10, @o0 CancellationSignal cancellationSignal) {
        Cursor E = n2Var.E(fVar, cancellationSignal);
        if (!z10 || !(E instanceof AbstractWindowedCursor)) {
            return E;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) E;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : E;
    }

    public static int e(@m0 File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                fileChannel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th2;
        }
    }
}
