package d4;

import android.util.Base64;
import com.bumptech.glide.h;
import d.m0;
import d4.n;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import v3.i;
import w3.d;

public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6016b = "data:image";

    /* renamed from: c  reason: collision with root package name */
    public static final String f6017c = ";base64";

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f6018a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    public static final class b<Data> implements d<Data> {
        public final String O;
        public final a<Data> P;
        public Data Q;

        public b(String str, a<Data> aVar) {
            this.O = str;
            this.P = aVar;
        }

        @m0
        public Class<Data> a() {
            return this.P.a();
        }

        public void b() {
            try {
                this.P.b(this.Q);
            } catch (IOException unused) {
            }
        }

        public void cancel() {
        }

        @m0
        public v3.a d() {
            return v3.a.LOCAL;
        }

        public void f(@m0 h hVar, @m0 d.a<? super Data> aVar) {
            try {
                Data c10 = this.P.c(this.O);
                this.Q = c10;
                aVar.e(c10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a<InputStream> f6019a = new a();

        public class a implements a<InputStream> {
            public a() {
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith(e.f6016b)) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(e.f6017c)) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        @m0
        public n<Model, InputStream> a(@m0 r rVar) {
            return new e(this.f6019a);
        }

        public void b() {
        }
    }

    public e(a<Data> aVar) {
        this.f6018a = aVar;
    }

    public boolean a(@m0 Model model) {
        return model.toString().startsWith(f6016b);
    }

    public n.a<Data> b(@m0 Model model, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new s4.e(model), new b(model.toString(), this.f6018a));
    }
}
