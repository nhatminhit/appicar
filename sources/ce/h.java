package ce;

import be.k1;
import be.v;
import fh.g;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import xe.l0;
import xe.w;

public final class h implements Externalizable {
    @g
    public static final a Q = new a((w) null);
    public static final long R = 0;
    public static final int S = 0;
    public static final int T = 1;
    @g
    public Collection<?> O;
    public final int P;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public h() {
        this(be.w.E(), 0);
    }

    public h(@g Collection<?> collection, int i10) {
        l0.p(collection, "collection");
        this.O = collection;
        this.P = i10;
    }

    public final Object a() {
        return this.O;
    }

    public void readExternal(@g ObjectInput objectInput) {
        Collection<?> collection;
        l0.p(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b10 = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i10 = 0;
                if (b10 == 0) {
                    List j10 = v.j(readInt);
                    while (i10 < readInt) {
                        j10.add(objectInput.readObject());
                        i10++;
                    }
                    collection = v.a(j10);
                } else if (b10 == 1) {
                    Set e10 = k1.e(readInt);
                    while (i10 < readInt) {
                        e10.add(objectInput.readObject());
                        i10++;
                    }
                    collection = k1.a(e10);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b10 + '.');
                }
                this.O = collection;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(@g ObjectOutput objectOutput) {
        l0.p(objectOutput, "output");
        objectOutput.writeByte(this.P);
        objectOutput.writeInt(this.O.size());
        for (Object writeObject : this.O) {
            objectOutput.writeObject(writeObject);
        }
    }
}
