package k3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.a;
import d.x0;
import java.lang.reflect.Method;
import y3.q;

@x0({x0.a.LIBRARY})
public class f extends e {
    public static final boolean B = false;
    public static final String C = "VersionedParcelParcel";
    public int A;

    /* renamed from: t  reason: collision with root package name */
    public final SparseIntArray f9953t;

    /* renamed from: u  reason: collision with root package name */
    public final Parcel f9954u;

    /* renamed from: v  reason: collision with root package name */
    public final int f9955v;

    /* renamed from: w  reason: collision with root package name */
    public final int f9956w;

    /* renamed from: x  reason: collision with root package name */
    public final String f9957x;

    /* renamed from: y  reason: collision with root package name */
    public int f9958y;

    /* renamed from: z  reason: collision with root package name */
    public int f9959z;

    public f(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a(), new a(), new a());
    }

    public f(Parcel parcel, int i10, int i11, String str, a<String, Method> aVar, a<String, Method> aVar2, a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f9953t = new SparseIntArray();
        this.f9958y = -1;
        this.A = -1;
        this.f9954u = parcel;
        this.f9955v = i10;
        this.f9956w = i11;
        this.f9959z = i10;
        this.f9957x = str;
    }

    public void C0(double d10) {
        this.f9954u.writeDouble(d10);
    }

    public boolean F(int i10) {
        while (this.f9959z < this.f9956w) {
            int i11 = this.A;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f9954u.setDataPosition(this.f9959z);
            int readInt = this.f9954u.readInt();
            this.A = this.f9954u.readInt();
            this.f9959z += readInt;
        }
        return this.A == i10;
    }

    public float G() {
        return this.f9954u.readFloat();
    }

    public void H0(float f10) {
        this.f9954u.writeFloat(f10);
    }

    public int L() {
        return this.f9954u.readInt();
    }

    public void L0(int i10) {
        this.f9954u.writeInt(i10);
    }

    public long Q() {
        return this.f9954u.readLong();
    }

    public void Q0(long j10) {
        this.f9954u.writeLong(j10);
    }

    public <T extends Parcelable> T V() {
        return this.f9954u.readParcelable(getClass().getClassLoader());
    }

    public void W0(Parcelable parcelable) {
        this.f9954u.writeParcelable(parcelable, 0);
    }

    public void a() {
        int i10 = this.f9958y;
        if (i10 >= 0) {
            int i11 = this.f9953t.get(i10);
            int dataPosition = this.f9954u.dataPosition();
            this.f9954u.setDataPosition(i11);
            this.f9954u.writeInt(dataPosition - i11);
            this.f9954u.setDataPosition(dataPosition);
        }
    }

    public e c() {
        Parcel parcel = this.f9954u;
        int dataPosition = parcel.dataPosition();
        int i10 = this.f9959z;
        if (i10 == this.f9955v) {
            i10 = this.f9956w;
        }
        int i11 = i10;
        return new f(parcel, dataPosition, i11, this.f9957x + q.a.R, this.f9950a, this.f9951b, this.f9952c);
    }

    public String c0() {
        return this.f9954u.readString();
    }

    public IBinder e0() {
        return this.f9954u.readStrongBinder();
    }

    public void e1(String str) {
        this.f9954u.writeString(str);
    }

    public void g1(IBinder iBinder) {
        this.f9954u.writeStrongBinder(iBinder);
    }

    public void i0(int i10) {
        a();
        this.f9958y = i10;
        this.f9953t.put(i10, this.f9954u.dataPosition());
        L0(0);
        L0(i10);
    }

    public void i1(IInterface iInterface) {
        this.f9954u.writeStrongInterface(iInterface);
    }

    public boolean l() {
        return this.f9954u.readInt() != 0;
    }

    public void m0(boolean z10) {
        this.f9954u.writeInt(z10 ? 1 : 0);
    }

    public Bundle p() {
        return this.f9954u.readBundle(getClass().getClassLoader());
    }

    public void q0(Bundle bundle) {
        this.f9954u.writeBundle(bundle);
    }

    public byte[] s() {
        int readInt = this.f9954u.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f9954u.readByteArray(bArr);
        return bArr;
    }

    public void t0(byte[] bArr) {
        if (bArr != null) {
            this.f9954u.writeInt(bArr.length);
            this.f9954u.writeByteArray(bArr);
            return;
        }
        this.f9954u.writeInt(-1);
    }

    public CharSequence v() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f9954u);
    }

    public void v0(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            this.f9954u.writeInt(bArr.length);
            this.f9954u.writeByteArray(bArr, i10, i11);
            return;
        }
        this.f9954u.writeInt(-1);
    }

    public double y() {
        return this.f9954u.readDouble();
    }

    public void y0(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f9954u, 0);
    }
}
