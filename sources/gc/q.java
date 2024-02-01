package gc;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import gc.b0;
import gc.v;
import java.io.IOException;
import java.io.InputStream;
import t7.t;

public class q extends g {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f19108b = {"orientation"};

    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        public final int O;
        public final int P;
        public final int Q;

        /* access modifiers changed from: public */
        a(int i10, int i11, int i12) {
            this.O = i10;
            this.P = i11;
            this.Q = i12;
        }
    }

    public q(Context context) {
        super(context);
    }

    public static int k(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        try {
            Cursor query = contentResolver.query(uri, f19108b, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    int i10 = query.getInt(0);
                    query.close();
                    return i10;
                }
            }
            if (query != null) {
                query.close();
            }
            return 0;
        } catch (RuntimeException unused) {
            if (cursor != null) {
                cursor.close();
            }
            return 0;
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    public static a l(int i10, int i11) {
        a aVar = a.MICRO;
        if (i10 <= aVar.P && i11 <= aVar.Q) {
            return aVar;
        }
        a aVar2 = a.MINI;
        return (i10 > aVar2.P || i11 > aVar2.Q) ? a.FULL : aVar2;
    }

    public boolean c(z zVar) {
        Uri uri = zVar.f19165d;
        return t.f13205o.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public b0.a f(z zVar, int i10) throws IOException {
        Bitmap bitmap;
        z zVar2 = zVar;
        ContentResolver contentResolver = this.f19032a.getContentResolver();
        int k10 = k(contentResolver, zVar2.f19165d);
        String type = contentResolver.getType(zVar2.f19165d);
        boolean z10 = type != null && type.startsWith("video/");
        if (zVar.d()) {
            a l10 = l(zVar2.f19169h, zVar2.f19170i);
            if (!z10 && l10 == a.FULL) {
                return new b0.a((Bitmap) null, j(zVar), v.e.DISK, k10);
            }
            long parseId = ContentUris.parseId(zVar2.f19165d);
            BitmapFactory.Options d10 = b0.d(zVar);
            d10.inJustDecodeBounds = true;
            BitmapFactory.Options options = d10;
            b0.a(zVar2.f19169h, zVar2.f19170i, l10.P, l10.Q, d10, zVar);
            if (z10) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l10 == a.FULL ? 1 : l10.O, options);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l10.O, options);
            }
            if (bitmap != null) {
                return new b0.a(bitmap, (InputStream) null, v.e.DISK, k10);
            }
        }
        return new b0.a((Bitmap) null, j(zVar), v.e.DISK, k10);
    }
}
