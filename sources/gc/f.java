package gc;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import gc.b0;
import gc.v;
import java.io.IOException;
import java.io.InputStream;
import t7.t;

public class f extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final int f19026b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f19027c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19028d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19029e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final UriMatcher f19030f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19031a;

    @TargetApi(14)
    public static class a {
        public static InputStream a(ContentResolver contentResolver, Uri uri) {
            return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        }
    }

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f19030f = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public f(Context context) {
        this.f19031a = context;
    }

    public boolean c(z zVar) {
        Uri uri = zVar.f19165d;
        return t.f13205o.equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f19030f.match(zVar.f19165d) != -1;
    }

    public b0.a f(z zVar, int i10) throws IOException {
        InputStream j10 = j(zVar);
        if (j10 != null) {
            return new b0.a(j10, v.e.DISK);
        }
        return null;
    }

    public final InputStream j(z zVar) throws IOException {
        ContentResolver contentResolver = this.f19031a.getContentResolver();
        Uri uri = zVar.f19165d;
        int match = f19030f.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return a.a(contentResolver, uri);
    }
}
