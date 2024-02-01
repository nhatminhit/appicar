package r1;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import d.m0;
import d.o0;
import java.io.File;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f12055b = "DocumentFile";
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final a f12056a;

    public a(@o0 a aVar) {
        this.f12056a = aVar;
    }

    @m0
    public static a h(@m0 File file) {
        return new c((a) null, file);
    }

    @o0
    public static a i(@m0 Context context, @m0 Uri uri) {
        return new d((a) null, context, uri);
    }

    @o0
    public static a j(@m0 Context context, @m0 Uri uri) {
        return new e((a) null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@m0 Context context, @o0 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @o0
    public abstract a c(@m0 String str);

    @o0
    public abstract a d(@m0 String str, @m0 String str2);

    public abstract boolean e();

    public abstract boolean f();

    @o0
    public a g(@m0 String str) {
        for (a aVar : u()) {
            if (str.equals(aVar.k())) {
                return aVar;
            }
        }
        return null;
    }

    @o0
    public abstract String k();

    @o0
    public a l() {
        return this.f12056a;
    }

    @o0
    public abstract String m();

    @m0
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @m0
    public abstract a[] u();

    public abstract boolean v(@m0 String str);
}
