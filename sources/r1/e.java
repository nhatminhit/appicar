package r1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import d.o0;
import d.t0;
import java.util.ArrayList;

@t0(21)
public class e extends a {

    /* renamed from: c  reason: collision with root package name */
    public Context f12062c;

    /* renamed from: d  reason: collision with root package name */
    public Uri f12063d;

    public e(@o0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f12062c = context;
        this.f12063d = uri;
    }

    public static void w(@o0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @o0
    public static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean a() {
        return b.a(this.f12062c, this.f12063d);
    }

    public boolean b() {
        return b.b(this.f12062c, this.f12063d);
    }

    @o0
    public a c(String str) {
        Uri x10 = x(this.f12062c, this.f12063d, "vnd.android.document/directory", str);
        if (x10 != null) {
            return new e(this, this.f12062c, x10);
        }
        return null;
    }

    @o0
    public a d(String str, String str2) {
        Uri x10 = x(this.f12062c, this.f12063d, str, str2);
        if (x10 != null) {
            return new e(this, this.f12062c, x10);
        }
        return null;
    }

    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f12062c.getContentResolver(), this.f12063d);
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean f() {
        return b.d(this.f12062c, this.f12063d);
    }

    @o0
    public String k() {
        return b.f(this.f12062c, this.f12063d);
    }

    @o0
    public String m() {
        return b.h(this.f12062c, this.f12063d);
    }

    public Uri n() {
        return this.f12063d;
    }

    public boolean o() {
        return b.i(this.f12062c, this.f12063d);
    }

    public boolean q() {
        return b.j(this.f12062c, this.f12063d);
    }

    public boolean r() {
        return b.k(this.f12062c, this.f12063d);
    }

    public long s() {
        return b.l(this.f12062c, this.f12063d);
    }

    public long t() {
        return b.m(this.f12062c, this.f12063d);
    }

    public a[] u() {
        ContentResolver contentResolver = this.f12062c.getContentResolver();
        Uri uri = this.f12063d;
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            while (cursor.moveToNext()) {
                arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f12063d, cursor.getString(0)));
            }
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed query: ");
            sb2.append(e10);
        } catch (Throwable th2) {
            w((AutoCloseable) null);
            throw th2;
        }
        w(cursor);
        Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
        a[] aVarArr = new a[uriArr.length];
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            aVarArr[i10] = new e(this, this.f12062c, uriArr[i10]);
        }
        return aVarArr;
    }

    public boolean v(String str) {
        try {
            Uri renameDocument = DocumentsContract.renameDocument(this.f12062c.getContentResolver(), this.f12063d, str);
            if (renameDocument != null) {
                this.f12063d = renameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
