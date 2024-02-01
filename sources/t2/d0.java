package t2;

import d.m0;
import t2.e0;

public final class d0 {

    public static class a extends e0.c<K> {
        public boolean a() {
            return true;
        }

        public boolean b(int i10, boolean z10) {
            return true;
        }

        public boolean c(@m0 K k10, boolean z10) {
            return true;
        }
    }

    public static class b extends e0.c<K> {
        public boolean a() {
            return false;
        }

        public boolean b(int i10, boolean z10) {
            return true;
        }

        public boolean c(@m0 K k10, boolean z10) {
            return true;
        }
    }

    @m0
    public static <K> e0.c<K> a() {
        return new a();
    }

    @m0
    public static <K> e0.c<K> b() {
        return new b();
    }
}
