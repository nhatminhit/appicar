package i8;

import d.m0;
import java.util.ArrayList;

public final class j {
    @m0
    public static <T, E extends i<T>> ArrayList<T> a(@m0 ArrayList<E> arrayList) {
        ArrayList<T> arrayList2 = new ArrayList<>(arrayList.size());
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(((i) arrayList.get(i10)).freeze());
        }
        return arrayList2;
    }

    @m0
    public static <T, E extends i<T>> ArrayList<T> b(@m0 E[] eArr) {
        ArrayList<T> arrayList = new ArrayList<>(eArr.length);
        for (E freeze : eArr) {
            arrayList.add(freeze.freeze());
        }
        return arrayList;
    }

    @m0
    public static <T, E extends i<T>> ArrayList<T> c(@m0 Iterable<E> iterable) {
        ArrayList<T> arrayList = new ArrayList<>();
        for (E freeze : iterable) {
            arrayList.add(freeze.freeze());
        }
        return arrayList;
    }
}
