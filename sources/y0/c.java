package y0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import d.g1;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import k0.d;
import t7.t;
import y0.f;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<byte[]> f15243a = new a();

    public class a implements Comparator<byte[]> {
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            if (bArr.length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            for (int i10 = 0; i10 < bArr.length; i10++) {
                byte b10 = bArr[i10];
                byte b11 = bArr2[i10];
                if (b10 != b11) {
                    return b10 - b11;
                }
            }
            return 0;
        }
    }

    public static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    public static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals(list.get(i10), list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static List<List<byte[]>> c(d dVar, Resources resources) {
        return dVar.b() != null ? dVar.b() : d.c(resources, dVar.c());
    }

    @m0
    public static f.b d(@m0 Context context, @m0 d dVar, @o0 CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo e10 = e(context.getPackageManager(), dVar, context.getResources());
        return e10 == null ? f.b.a(1, (f.c[]) null) : f.b.a(0, f(context, dVar, e10.authority, cancellationSignal));
    }

    @o0
    @g1
    public static ProviderInfo e(@m0 PackageManager packageManager, @m0 d dVar, @o0 Resources resources) throws PackageManager.NameNotFoundException {
        String f10 = dVar.f();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(f10, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + f10);
        } else if (resolveContentProvider.packageName.equals(dVar.g())) {
            List<byte[]> a10 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a10, f15243a);
            List<List<byte[]>> c10 = c(dVar, resources);
            for (int i10 = 0; i10 < c10.size(); i10++) {
                ArrayList arrayList = new ArrayList(c10.get(i10));
                Collections.sort(arrayList, f15243a);
                if (b(a10, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + f10 + ", but package was not " + dVar.g());
        }
    }

    @g1
    @m0
    public static f.c[] f(Context context, d dVar, String str, CancellationSignal cancellationSignal) {
        boolean z10;
        int i10;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme(t.f13205o).authority(str2).build();
        Uri build2 = new Uri.Builder().scheme(t.f13205o).authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i11 = 0;
            cursor = context.getContentResolver().query(build, new String[]{"_id", f.a.f15269a, f.a.f15270b, f.a.f15271c, f.a.f15272d, f.a.f15273e, f.a.f15274f}, "query = ?", new String[]{dVar.h()}, (String) null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex(f.a.f15274f);
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex(f.a.f15269a);
                int columnIndex4 = cursor.getColumnIndex(f.a.f15270b);
                int columnIndex5 = cursor.getColumnIndex(f.a.f15272d);
                int columnIndex6 = cursor.getColumnIndex(f.a.f15273e);
                while (cursor.moveToNext()) {
                    int i12 = columnIndex != -1 ? cursor.getInt(columnIndex) : i11;
                    int i13 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i11;
                    int i14 = i12;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i15 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i10 = i14;
                        z10 = false;
                    } else {
                        i10 = i14;
                        z10 = true;
                    }
                    arrayList2.add(f.c.a(withAppendedId, i13, i15, z10, i10));
                    i11 = 0;
                }
                arrayList = arrayList2;
            }
            return (f.c[]) arrayList.toArray(new f.c[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
