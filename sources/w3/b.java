package w3;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.h;
import d.m0;
import java.io.IOException;
import v3.a;
import w3.d;

public abstract class b<T> implements d<T> {
    public static final String R = "AssetPathFetcher";
    public final String O;
    public final AssetManager P;
    public T Q;

    public b(AssetManager assetManager, String str) {
        this.P = assetManager;
        this.O = str;
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

    public abstract T e(AssetManager assetManager, String str) throws IOException;

    public void f(@m0 h hVar, @m0 d.a<? super T> aVar) {
        try {
            T e10 = e(this.P, this.O);
            this.Q = e10;
            aVar.e(e10);
        } catch (IOException e11) {
            Log.isLoggable(R, 3);
            aVar.c(e11);
        }
    }
}
