package a6;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public class q<K, V> implements Serializable {
    public static final long R = 1;
    public final transient int O;
    public final transient ConcurrentHashMap<K, V> P;
    public transient int Q;

    public q(int i10, int i11) {
        this.P = new ConcurrentHashMap<>(i10, 0.8f, 4);
        this.O = i11;
    }

    public void a() {
        this.P.clear();
    }

    public V b(Object obj) {
        return this.P.get(obj);
    }

    public V c(K k10, V v10) {
        if (this.P.size() >= this.O) {
            synchronized (this) {
                if (this.P.size() >= this.O) {
                    a();
                }
            }
        }
        return this.P.put(k10, v10);
    }

    public V d(K k10, V v10) {
        if (this.P.size() >= this.O) {
            synchronized (this) {
                if (this.P.size() >= this.O) {
                    a();
                }
            }
        }
        return this.P.putIfAbsent(k10, v10);
    }

    public final void e(ObjectInputStream objectInputStream) throws IOException {
        this.Q = objectInputStream.readInt();
    }

    public Object f() {
        int i10 = this.Q;
        return new q(i10, i10);
    }

    public int g() {
        return this.P.size();
    }

    public final void h(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.Q);
    }
}
