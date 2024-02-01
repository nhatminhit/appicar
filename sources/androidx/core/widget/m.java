package androidx.core.widget;

import android.widget.ListView;
import d.m0;

public final class m {
    public static boolean a(@m0 ListView listView, int i10) {
        return listView.canScrollList(i10);
    }

    public static void b(@m0 ListView listView, int i10) {
        listView.scrollListBy(i10);
    }
}
