package o5;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import w4.j;
import w4.l;

public abstract class g extends f {
    public static final int Z = 1000;
    public final Class<?> V;
    public final String W;
    public final Collection<Object> X;
    public transient String Y;

    @Deprecated
    public g(String str, j jVar, Class<?> cls, String str2, Collection<Object> collection) {
        this((l) null, str, jVar, cls, str2, collection);
    }

    public g(l lVar, String str, j jVar, Class<?> cls, String str2, Collection<Object> collection) {
        super(lVar, str, jVar);
        this.V = cls;
        this.W = str2;
        this.X = collection;
    }

    public Collection<Object> E() {
        Collection<Object> collection = this.X;
        if (collection == null) {
            return null;
        }
        return Collections.unmodifiableCollection(collection);
    }

    public String F() {
        return this.W;
    }

    public Class<?> G() {
        return this.V;
    }

    public String c() {
        String str = this.Y;
        if (str != null || this.X == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(100);
        int size = this.X.size();
        if (size != 1) {
            sb2.append(" (");
            sb2.append(size);
            sb2.append(" known properties: ");
            Iterator<Object> it = this.X.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb2.append('\"');
                sb2.append(String.valueOf(it.next()));
                sb2.append('\"');
                if (sb2.length() > 1000) {
                    sb2.append(" [truncated]");
                    break;
                } else if (it.hasNext()) {
                    sb2.append(", ");
                }
            }
        } else {
            sb2.append(" (one known property: \"");
            sb2.append(String.valueOf(this.X.iterator().next()));
            sb2.append('\"');
        }
        sb2.append("])");
        String sb3 = sb2.toString();
        this.Y = sb3;
        return sb3;
    }
}
