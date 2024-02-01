package k4;

import android.util.Log;
import d.m0;
import java.io.File;
import java.io.IOException;
import t4.a;
import v3.c;
import v3.i;
import v3.l;
import y3.v;

public class d implements l<c> {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9985a = "GifEncoder";

    @m0
    public c a(@m0 i iVar) {
        return c.SOURCE;
    }

    /* renamed from: c */
    public boolean b(@m0 v<c> vVar, @m0 File file, @m0 i iVar) {
        try {
            a.e(vVar.get().e(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable(f9985a, 5);
            return false;
        }
    }
}
