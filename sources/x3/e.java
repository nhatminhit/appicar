package x3;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import z3.b;

public class e {

    /* renamed from: f  reason: collision with root package name */
    public static final String f15069f = "ThumbStreamOpener";

    /* renamed from: g  reason: collision with root package name */
    public static final a f15070g = new a();

    /* renamed from: a  reason: collision with root package name */
    public final a f15071a;

    /* renamed from: b  reason: collision with root package name */
    public final d f15072b;

    /* renamed from: c  reason: collision with root package name */
    public final b f15073c;

    /* renamed from: d  reason: collision with root package name */
    public final ContentResolver f15074d;

    /* renamed from: e  reason: collision with root package name */
    public final List<ImageHeaderParser> f15075e;

    public e(List<ImageHeaderParser> list, a aVar, d dVar, b bVar, ContentResolver contentResolver) {
        this.f15071a = aVar;
        this.f15072b = dVar;
        this.f15073c = bVar;
        this.f15074d = contentResolver;
        this.f15075e = list;
    }

    public e(List<ImageHeaderParser> list, d dVar, b bVar, ContentResolver contentResolver) {
        this(list, f15070g, dVar, bVar, contentResolver);
    }

    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            InputStream openInputStream = this.f15074d.openInputStream(uri);
            int a10 = a.a(this.f15075e, openInputStream, this.f15073c);
            if (openInputStream != null) {
                try {
                    openInputStream.close();
                } catch (IOException unused) {
                }
            }
            return a10;
        } catch (IOException | NullPointerException unused2) {
            if (Log.isLoggable(f15069f, 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to open uri: ");
                sb2.append(uri);
            }
            if (inputStream == null) {
                return -1;
            }
            try {
                inputStream.close();
                return -1;
            } catch (IOException unused3) {
                return -1;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                }
            }
            throw th2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x002a A[Catch:{ all -> 0x003d }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0041  */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(@d.m0 android.net.Uri r5) {
        /*
            r4 = this;
            r0 = 0
            x3.d r1 = r4.f15072b     // Catch:{ SecurityException -> 0x0020, all -> 0x001e }
            android.database.Cursor r1 = r1.a(r5)     // Catch:{ SecurityException -> 0x0020, all -> 0x001e }
            if (r1 == 0) goto L_0x0018
            boolean r2 = r1.moveToFirst()     // Catch:{ SecurityException -> 0x0021 }
            if (r2 == 0) goto L_0x0018
            r2 = 0
            java.lang.String r5 = r1.getString(r2)     // Catch:{ SecurityException -> 0x0021 }
            r1.close()
            return r5
        L_0x0018:
            if (r1 == 0) goto L_0x001d
            r1.close()
        L_0x001d:
            return r0
        L_0x001e:
            r5 = move-exception
            goto L_0x003f
        L_0x0020:
            r1 = r0
        L_0x0021:
            java.lang.String r2 = "ThumbStreamOpener"
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0037
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r2.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "Failed to query for thumbnail for Uri: "
            r2.append(r3)     // Catch:{ all -> 0x003d }
            r2.append(r5)     // Catch:{ all -> 0x003d }
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()
        L_0x003c:
            return r0
        L_0x003d:
            r5 = move-exception
            r0 = r1
        L_0x003f:
            if (r0 == 0) goto L_0x0044
            r0.close()
        L_0x0044:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.e.b(android.net.Uri):java.lang.String");
    }

    public final boolean c(File file) {
        return this.f15071a.a(file) && 0 < this.f15071a.c(file);
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String b10 = b(uri);
        if (TextUtils.isEmpty(b10)) {
            return null;
        }
        File b11 = this.f15071a.b(b10);
        if (!c(b11)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(b11);
        try {
            return this.f15074d.openInputStream(fromFile);
        } catch (NullPointerException e10) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e10));
        }
    }
}
