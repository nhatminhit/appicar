package e4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.h;
import d.m0;
import d.o0;
import d.t0;
import d4.n;
import d4.o;
import d4.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import s4.e;
import v3.i;
import w3.d;

@t0(29)
public final class f<DataT> implements n<Uri, DataT> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6819a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f6820b;

    /* renamed from: c  reason: collision with root package name */
    public final n<Uri, DataT> f6821c;

    /* renamed from: d  reason: collision with root package name */
    public final Class<DataT> f6822d;

    public static abstract class a<DataT> implements o<Uri, DataT> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6823a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f6824b;

        public a(Context context, Class<DataT> cls) {
            this.f6823a = context;
            this.f6824b = cls;
        }

        @m0
        public final n<Uri, DataT> a(@m0 r rVar) {
            return new f(this.f6823a, rVar.d(File.class, this.f6824b), rVar.d(Uri.class, this.f6824b), this.f6824b);
        }

        public final void b() {
        }
    }

    @t0(29)
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @t0(29)
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class d<DataT> implements w3.d<DataT> {
        public static final String[] Y = {"_data"};
        public final Context O;
        public final n<File, DataT> P;
        public final n<Uri, DataT> Q;
        public final Uri R;
        public final int S;
        public final int T;
        public final i U;
        public final Class<DataT> V;
        public volatile boolean W;
        @o0
        public volatile w3.d<DataT> X;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i10, int i11, i iVar, Class<DataT> cls) {
            this.O = context.getApplicationContext();
            this.P = nVar;
            this.Q = nVar2;
            this.R = uri;
            this.S = i10;
            this.T = i11;
            this.U = iVar;
            this.V = cls;
        }

        @m0
        public Class<DataT> a() {
            return this.V;
        }

        public void b() {
            w3.d<DataT> dVar = this.X;
            if (dVar != null) {
                dVar.b();
            }
        }

        @o0
        public final n.a<DataT> c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.P.b(h(this.R), this.S, this.T, this.U);
            }
            return this.Q.b(g() ? MediaStore.setRequireOriginal(this.R) : this.R, this.S, this.T, this.U);
        }

        public void cancel() {
            this.W = true;
            w3.d<DataT> dVar = this.X;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @m0
        public v3.a d() {
            return v3.a.LOCAL;
        }

        @o0
        public final w3.d<DataT> e() throws FileNotFoundException {
            n.a c10 = c();
            if (c10 != null) {
                return c10.f6054c;
            }
            return null;
        }

        public void f(@m0 h hVar, @m0 d.a<? super DataT> aVar) {
            try {
                w3.d<DataT> e10 = e();
                if (e10 == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.R));
                    return;
                }
                this.X = e10;
                if (this.W) {
                    cancel();
                } else {
                    e10.f(hVar, aVar);
                }
            } catch (FileNotFoundException e11) {
                aVar.c(e11);
            }
        }

        public final boolean g() {
            return this.O.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @m0
        public final File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                cursor = this.O.getContentResolver().query(uri, Y, (String) null, (String[]) null, (String) null);
                if (cursor == null || !cursor.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursor.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th2) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th2;
            }
        }
    }

    public f(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f6819a = context.getApplicationContext();
        this.f6820b = nVar;
        this.f6821c = nVar2;
        this.f6822d = cls;
    }

    /* renamed from: c */
    public n.a<DataT> b(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new e(uri), new d(this.f6819a, this.f6820b, this.f6821c, uri, i10, i11, iVar, this.f6822d));
    }

    /* renamed from: d */
    public boolean a(@m0 Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && x3.b.b(uri);
    }
}
