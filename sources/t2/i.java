package t2;

import d.m0;
import t2.n;

public abstract class i<K> {

    public static class a extends i<K> {
        public void a() {
        }

        public void c(@m0 n.a<K> aVar) {
        }

        public int d() {
            return -1;
        }

        public boolean e() {
            return false;
        }
    }

    public static <K> i<K> b() {
        return new a();
    }

    public abstract void a();

    public abstract void c(@m0 n.a<K> aVar);

    public abstract int d();

    public abstract boolean e();
}
