package i0;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import fh.g;
import kotlin.Metadata;
import we.l;
import xe.l0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lzd/u2;", "Lzd/u;", "action", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class q {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@g SharedPreferences sharedPreferences, boolean z10, @g l<? super SharedPreferences.Editor, u2> lVar) {
        l0.p(sharedPreferences, "<this>");
        l0.p(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l0.o(edit, "editor");
        lVar.A(edit);
        if (z10) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        l0.p(sharedPreferences, "<this>");
        l0.p(lVar, "action");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        l0.o(edit, "editor");
        lVar.A(edit);
        if (z10) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
