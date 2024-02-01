package i8;

import android.os.Bundle;
import d.m0;
import e8.a;
import java.util.ArrayList;

public final class g {
    @a
    @m0

    /* renamed from: a  reason: collision with root package name */
    public static final String f9324a = "next_page_token";
    @a
    @m0

    /* renamed from: b  reason: collision with root package name */
    public static final String f9325b = "prev_page_token";

    @m0
    public static <T, E extends i<T>> ArrayList<T> a(@m0 b<E> bVar) {
        ArrayList<T> arrayList = new ArrayList<>(bVar.getCount());
        try {
            for (E freeze : bVar) {
                arrayList.add(freeze.freeze());
            }
            return arrayList;
        } finally {
            bVar.close();
        }
    }

    public static boolean b(@m0 b<?> bVar) {
        return bVar != null && bVar.getCount() > 0;
    }

    public static boolean c(@m0 b<?> bVar) {
        Bundle d10 = bVar.d();
        return (d10 == null || d10.getString(f9324a) == null) ? false : true;
    }

    public static boolean d(@m0 b<?> bVar) {
        Bundle d10 = bVar.d();
        return (d10 == null || d10.getString(f9325b) == null) ? false : true;
    }
}
