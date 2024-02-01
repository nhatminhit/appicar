package d4;

import android.util.Log;
import d.m0;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import t4.a;
import v3.d;
import v3.i;

public class c implements d<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f6014a = "ByteBufferEncoder";

    /* renamed from: c */
    public boolean b(@m0 ByteBuffer byteBuffer, @m0 File file, @m0 i iVar) {
        try {
            a.e(byteBuffer, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(f6014a, 3);
            return false;
        }
    }
}
