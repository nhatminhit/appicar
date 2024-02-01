package com.fasterxml.jackson.databind.node;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class r implements Serializable, Externalizable {
    public static final long P = 1;
    public byte[] O;

    public r() {
    }

    public r(byte[] bArr) {
        this.O = bArr;
    }

    public static r a(Object obj) {
        try {
            return new r(k.d(obj));
        } catch (IOException e10) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + obj.getClass().getSimpleName() + "` value: " + e10.getMessage(), e10);
        }
    }

    public Object b() {
        try {
            return k.a(this.O);
        } catch (IOException e10) {
            throw new IllegalArgumentException("Failed to JDK deserialize `JsonNode` value: " + e10.getMessage(), e10);
        }
    }

    public void readExternal(ObjectInput objectInput) throws IOException {
        int readInt = objectInput.readInt();
        byte[] bArr = new byte[readInt];
        this.O = bArr;
        objectInput.readFully(bArr, 0, readInt);
    }

    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(this.O.length);
        objectOutput.write(this.O);
    }
}
