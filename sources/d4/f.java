package d4;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.h;
import d.m0;
import d4.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import v3.i;
import w3.d;

public class f<Data> implements n<File, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final String f6021b = "FileLoader";

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f6022a;

    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f6023a;

        public a(d<Data> dVar) {
            this.f6023a = dVar;
        }

        @m0
        public final n<File, Data> a(@m0 r rVar) {
            return new f(this.f6023a);
        }

        public final void b() {
        }
    }

    public static class b extends a<ParcelFileDescriptor> {

        public class a implements d<ParcelFileDescriptor> {
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            /* renamed from: e */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, b6.c.A);
            }
        }

        public b() {
            super(new a());
        }
    }

    public static final class c<Data> implements w3.d<Data> {
        public final File O;
        public final d<Data> P;
        public Data Q;

        public c(File file, d<Data> dVar) {
            this.O = file;
            this.P = dVar;
        }

        @m0
        public Class<Data> a() {
            return this.P.a();
        }

        public void b() {
            Data data = this.Q;
            if (data != null) {
                try {
                    this.P.b(data);
                } catch (IOException unused) {
                }
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
            } catch (FileNotFoundException e10) {
                Log.isLoggable(f.f6021b, 3);
                aVar.c(e10);
            }
        }
    }

    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    public static class e extends a<InputStream> {

        public class a implements d<InputStream> {
            public Class<InputStream> a() {
                return InputStream.class;
            }

            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            /* renamed from: e */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f6022a = dVar;
    }

    /* renamed from: c */
    public n.a<Data> b(@m0 File file, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new s4.e(file), new c(file, this.f6022a));
    }

    /* renamed from: d */
    public boolean a(@m0 File file) {
        return true;
    }
}
