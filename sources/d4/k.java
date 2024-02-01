package d4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.h;
import d.m0;
import d4.n;
import java.io.File;
import java.io.FileNotFoundException;
import s4.e;
import v3.i;
import w3.d;

public final class k implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6043a;

    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f6044a;

        public a(Context context) {
            this.f6044a = context;
        }

        @m0
        public n<Uri, File> a(r rVar) {
            return new k(this.f6044a);
        }

        public void b() {
        }
    }

    public static class b implements d<File> {
        public static final String[] Q = {"_data"};
        public final Context O;
        public final Uri P;

        public b(Context context, Uri uri) {
            this.O = context;
            this.P = uri;
        }

        @m0
        public Class<File> a() {
            return File.class;
        }

        public void b() {
        }

        public void cancel() {
        }

        @m0
        public v3.a d() {
            return v3.a.LOCAL;
        }

        public void f(@m0 h hVar, @m0 d.a<? super File> aVar) {
            Cursor query = this.O.getContentResolver().query(this.P, Q, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.P));
                return;
            }
            aVar.e(new File(str));
        }
    }

    public k(Context context) {
        this.f6043a = context;
    }

    /* renamed from: c */
    public n.a<File> b(@m0 Uri uri, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new e(uri), new b(this.f6043a, uri));
    }

    /* renamed from: d */
    public boolean a(@m0 Uri uri) {
        return x3.b.b(uri);
    }
}
