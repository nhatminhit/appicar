package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import c3.a;
import c3.d;
import d.m0;
import d.o0;

public class InitializationProvider extends ContentProvider {
    public final int delete(@m0 Uri uri, @o0 String str, @o0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @o0
    public final String getType(@m0 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @o0
    public final Uri insert(@m0 Uri uri, @o0 ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new d("Context cannot be null");
        } else if (context.getApplicationContext() == null) {
            return true;
        } else {
            a.e(context).a();
            return true;
        }
    }

    @o0
    public final Cursor query(@m0 Uri uri, @o0 String[] strArr, @o0 String str, @o0 String[] strArr2, @o0 String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public final int update(@m0 Uri uri, @o0 ContentValues contentValues, @o0 String str, @o0 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
