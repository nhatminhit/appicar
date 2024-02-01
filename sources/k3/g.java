package k3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import b6.c;
import d.x0;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;
import k3.e;

@x0({x0.a.LIBRARY})
public class g extends e {
    public static final Charset C = Charset.forName(c.f4245m);
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = 7;
    public static final int L = 8;
    public static final int M = 9;
    public static final int N = 10;
    public static final int O = 11;
    public static final int P = 12;
    public static final int Q = 13;
    public static final int R = 14;
    public int A;
    public int B;

    /* renamed from: t  reason: collision with root package name */
    public final DataInputStream f9960t;

    /* renamed from: u  reason: collision with root package name */
    public final DataOutputStream f9961u;

    /* renamed from: v  reason: collision with root package name */
    public DataInputStream f9962v;

    /* renamed from: w  reason: collision with root package name */
    public DataOutputStream f9963w;

    /* renamed from: x  reason: collision with root package name */
    public b f9964x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f9965y;

    /* renamed from: z  reason: collision with root package name */
    public int f9966z;

    public class a extends FilterInputStream {
        public a(InputStream inputStream) {
            super(inputStream);
        }

        public int read() throws IOException {
            g gVar = g.this;
            int i10 = gVar.B;
            if (i10 == -1 || gVar.f9966z < i10) {
                int read = super.read();
                g.this.f9966z++;
                return read;
            }
            throw new IOException();
        }

        public int read(byte[] bArr, int i10, int i11) throws IOException {
            g gVar = g.this;
            int i12 = gVar.B;
            if (i12 == -1 || gVar.f9966z < i12) {
                int read = super.read(bArr, i10, i11);
                if (read > 0) {
                    g.this.f9966z += read;
                }
                return read;
            }
            throw new IOException();
        }

        public long skip(long j10) throws IOException {
            g gVar = g.this;
            int i10 = gVar.B;
            if (i10 == -1 || gVar.f9966z < i10) {
                long skip = super.skip(j10);
                if (skip > 0) {
                    g.this.f9966z += (int) skip;
                }
                return skip;
            }
            throw new IOException();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteArrayOutputStream f9967a;

        /* renamed from: b  reason: collision with root package name */
        public final DataOutputStream f9968b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9969c;

        /* renamed from: d  reason: collision with root package name */
        public final DataOutputStream f9970d;

        public b(int i10, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f9967a = byteArrayOutputStream;
            this.f9968b = new DataOutputStream(byteArrayOutputStream);
            this.f9969c = i10;
            this.f9970d = dataOutputStream;
        }

        public void a() throws IOException {
            this.f9968b.flush();
            int size = this.f9967a.size();
            this.f9970d.writeInt((this.f9969c << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f9970d.writeInt(size);
            }
            this.f9967a.writeTo(this.f9970d);
        }
    }

    public g(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    public g(InputStream inputStream, OutputStream outputStream, androidx.collection.a<String, Method> aVar, androidx.collection.a<String, Method> aVar2, androidx.collection.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f9966z = 0;
        this.A = -1;
        this.B = -1;
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new a(inputStream)) : null;
        this.f9960t = dataInputStream;
        dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : dataOutputStream;
        this.f9961u = dataOutputStream;
        this.f9962v = dataInputStream;
        this.f9963w = dataOutputStream;
    }

    public void C0(double d10) {
        try {
            this.f9963w.writeDouble(d10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public boolean F(int i10) {
        while (true) {
            try {
                int i11 = this.A;
                if (i11 == i10) {
                    return true;
                }
                if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                    return false;
                }
                int i12 = this.f9966z;
                int i13 = this.B;
                if (i12 < i13) {
                    this.f9960t.skip((long) (i13 - i12));
                }
                this.B = -1;
                int readInt = this.f9960t.readInt();
                this.f9966z = 0;
                int i14 = readInt & 65535;
                if (i14 == 65535) {
                    i14 = this.f9960t.readInt();
                }
                this.A = (readInt >> 16) & 65535;
                this.B = i14;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public float G() {
        try {
            return this.f9962v.readFloat();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public void H0(float f10) {
        try {
            this.f9963w.writeFloat(f10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public int L() {
        try {
            return this.f9962v.readInt();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public void L0(int i10) {
        try {
            this.f9963w.writeInt(i10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public long Q() {
        try {
            return this.f9962v.readLong();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public void Q0(long j10) {
        try {
            this.f9963w.writeLong(j10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public <T extends Parcelable> T V() {
        return null;
    }

    public void W0(Parcelable parcelable) {
        if (!this.f9965y) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    public void a() {
        b bVar = this.f9964x;
        if (bVar != null) {
            try {
                if (bVar.f9967a.size() != 0) {
                    this.f9964x.a();
                }
                this.f9964x = null;
            } catch (IOException e10) {
                throw new e.b(e10);
            }
        }
    }

    public e c() {
        return new g(this.f9962v, this.f9963w, this.f9950a, this.f9951b, this.f9952c);
    }

    public String c0() {
        try {
            int readInt = this.f9962v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f9962v.readFully(bArr);
            return new String(bArr, C);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public IBinder e0() {
        return null;
    }

    public void e1(String str) {
        if (str != null) {
            try {
                byte[] bytes = str.getBytes(C);
                this.f9963w.writeInt(bytes.length);
                this.f9963w.write(bytes);
            } catch (IOException e10) {
                throw new e.b(e10);
            }
        } else {
            this.f9963w.writeInt(-1);
        }
    }

    public void g1(IBinder iBinder) {
        if (!this.f9965y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public boolean i() {
        return true;
    }

    public void i0(int i10) {
        a();
        b bVar = new b(i10, this.f9961u);
        this.f9964x = bVar;
        this.f9963w = bVar.f9968b;
    }

    public void i1(IInterface iInterface) {
        if (!this.f9965y) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    public void j0(boolean z10, boolean z11) {
        if (z10) {
            this.f9965y = z11;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    public boolean l() {
        try {
            return this.f9962v.readBoolean();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public void m0(boolean z10) {
        try {
            this.f9963w.writeBoolean(z10);
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public final void o1(int i10, String str, Bundle bundle) {
        switch (i10) {
            case 0:
                bundle.putParcelable(str, (Parcelable) null);
                return;
            case 1:
            case 2:
                bundle.putBundle(str, p());
                return;
            case 3:
                bundle.putString(str, c0());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) j(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, l());
                return;
            case 6:
                bundle.putBooleanArray(str, n());
                return;
            case 7:
                bundle.putDouble(str, y());
                return;
            case 8:
                bundle.putDoubleArray(str, A());
                return;
            case 9:
                bundle.putInt(str, L());
                return;
            case 10:
                bundle.putIntArray(str, N());
                return;
            case 11:
                bundle.putLong(str, Q());
                return;
            case 12:
                bundle.putLongArray(str, S());
                return;
            case 13:
                bundle.putFloat(str, G());
                return;
            case 14:
                bundle.putFloatArray(str, I());
                return;
            default:
                throw new RuntimeException("Unknown type " + i10);
        }
    }

    public Bundle p() {
        int L2 = L();
        if (L2 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < L2; i10++) {
            o1(L(), c0(), bundle);
        }
        return bundle;
    }

    public final void p1(Object obj) {
        int intValue;
        if (obj == null) {
            intValue = 0;
        } else if (obj instanceof Bundle) {
            L0(1);
            q0((Bundle) obj);
            return;
        } else if (obj instanceof String) {
            L0(3);
            e1((String) obj);
            return;
        } else if (obj instanceof String[]) {
            L0(4);
            k0((String[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            L0(5);
            m0(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof boolean[]) {
            L0(6);
            o0((boolean[]) obj);
            return;
        } else if (obj instanceof Double) {
            L0(7);
            C0(((Double) obj).doubleValue());
            return;
        } else if (obj instanceof double[]) {
            L0(8);
            E0((double[]) obj);
            return;
        } else if (obj instanceof Integer) {
            L0(9);
            intValue = ((Integer) obj).intValue();
        } else if (obj instanceof int[]) {
            L0(10);
            N0((int[]) obj);
            return;
        } else if (obj instanceof Long) {
            L0(11);
            Q0(((Long) obj).longValue());
            return;
        } else if (obj instanceof long[]) {
            L0(12);
            S0((long[]) obj);
            return;
        } else if (obj instanceof Float) {
            L0(13);
            H0(((Float) obj).floatValue());
            return;
        } else if (obj instanceof float[]) {
            L0(14);
            J0((float[]) obj);
            return;
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
        L0(intValue);
    }

    public void q0(Bundle bundle) {
        if (bundle != null) {
            try {
                Set<String> keySet = bundle.keySet();
                this.f9963w.writeInt(keySet.size());
                for (String next : keySet) {
                    e1(next);
                    p1(bundle.get(next));
                }
            } catch (IOException e10) {
                throw new e.b(e10);
            }
        } else {
            this.f9963w.writeInt(-1);
        }
    }

    public byte[] s() {
        try {
            int readInt = this.f9962v.readInt();
            if (readInt <= 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            this.f9962v.readFully(bArr);
            return bArr;
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public void t0(byte[] bArr) {
        if (bArr != null) {
            try {
                this.f9963w.writeInt(bArr.length);
                this.f9963w.write(bArr);
            } catch (IOException e10) {
                throw new e.b(e10);
            }
        } else {
            this.f9963w.writeInt(-1);
        }
    }

    public CharSequence v() {
        return null;
    }

    public void v0(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            try {
                this.f9963w.writeInt(i11);
                this.f9963w.write(bArr, i10, i11);
            } catch (IOException e10) {
                throw new e.b(e10);
            }
        } else {
            this.f9963w.writeInt(-1);
        }
    }

    public double y() {
        try {
            return this.f9962v.readDouble();
        } catch (IOException e10) {
            throw new e.b(e10);
        }
    }

    public void y0(CharSequence charSequence) {
        if (!this.f9965y) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }
}
