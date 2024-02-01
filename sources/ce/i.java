package ce;

import be.a1;
import be.z0;
import fh.g;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import xe.l0;
import xe.w;

public final class i implements Externalizable {
    @g
    public static final a P = new a((w) null);
    public static final long Q = 0;
    @g
    public Map<?, ?> O;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public i() {
        this(a1.z());
    }

    public i(@g Map<?, ?> map) {
        l0.p(map, "map");
        this.O = map;
    }

    public final Object a() {
        return this.O;
    }

    public void readExternal(@g ObjectInput objectInput) {
        l0.p(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map h10 = z0.h(readInt);
                for (int i10 = 0; i10 < readInt; i10++) {
                    h10.put(objectInput.readObject(), objectInput.readObject());
                }
                this.O = z0.d(h10);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(@g ObjectOutput objectOutput) {
        l0.p(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.O.size());
        for (Map.Entry next : this.O.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }
}
