package w3;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.h;
import d.m0;
import java.io.FileNotFoundException;
import java.io.IOException;
import v3.a;
import w3.d;

public abstract class l<T> implements d<T> {
    public static final String R = "LocalUriFetcher";
    public final Uri O;
    public final ContentResolver P;
    public T Q;

    public l(ContentResolver contentResolver, Uri uri) {
        this.P = contentResolver;
        this.O = uri;
    }

    public void b() {
        T t10 = this.Q;
        if (t10 != null) {
            try {
                c(t10);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t10) throws IOException;

    public void cancel() {
    }

    @m0
    public a d() {
        return a.LOCAL;
    }

    public abstract T e(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public final void f(@m0 h hVar, @m0 d.a<? super T> aVar) {
        try {
            T e10 = e(this.O, this.P);
            this.Q = e10;
            aVar.e(e10);
        } catch (FileNotFoundException e11) {
            Log.isLoggable(R, 3);
            aVar.c(e11);
        }
    }
}
