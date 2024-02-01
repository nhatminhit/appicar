package m0;

import android.database.sqlite.SQLiteDatabase;
import fh.g;
import kotlin.Metadata;
import we.l;
import xe.i0;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0002\u0007\n\u0005\b20\u0001¨\u0006\t"}, d2 = {"T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lzd/u;", "body", "a", "(Landroid/database/sqlite/SQLiteDatabase;ZLwe/l;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class c {
    public static final <T> T a(@g SQLiteDatabase sQLiteDatabase, boolean z10, @g l<? super SQLiteDatabase, ? extends T> lVar) {
        l0.p(sQLiteDatabase, "<this>");
        l0.p(lVar, "body");
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T A = lVar.A(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return A;
        } finally {
            i0.d(1);
            sQLiteDatabase.endTransaction();
            i0.c(1);
        }
    }

    public static /* synthetic */ Object b(SQLiteDatabase sQLiteDatabase, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        l0.p(sQLiteDatabase, "<this>");
        l0.p(lVar, "body");
        if (z10) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object A = lVar.A(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return A;
        } finally {
            i0.d(1);
            sQLiteDatabase.endTransaction();
            i0.c(1);
        }
    }
}
