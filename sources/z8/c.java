package z8;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.common.m;
import d.m0;
import d.o0;

public interface c extends IInterface {

    public static abstract class a extends m implements c {
        public a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @m0
        public static c H(@m0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof c ? (c) queryLocalInterface : new r(iBinder);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0070, code lost:
            r3.writeNoException();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00bb, code lost:
            r3.writeNoException();
            com.google.android.gms.internal.common.n.c(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d0, code lost:
            r3.writeNoException();
            r3.writeInt(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e6, code lost:
            r3.writeNoException();
            com.google.android.gms.internal.common.n.f(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean D(int r1, @d.m0 android.os.Parcel r2, @d.m0 android.os.Parcel r3, int r4) throws android.os.RemoteException {
            /*
                r0 = this;
                switch(r1) {
                    case 2: goto L_0x00e2;
                    case 3: goto L_0x00d7;
                    case 4: goto L_0x00cc;
                    case 5: goto L_0x00c7;
                    case 6: goto L_0x00c2;
                    case 7: goto L_0x00b7;
                    case 8: goto L_0x00ac;
                    case 9: goto L_0x00a7;
                    case 10: goto L_0x00a2;
                    case 11: goto L_0x009d;
                    case 12: goto L_0x0098;
                    case 13: goto L_0x0093;
                    case 14: goto L_0x008e;
                    case 15: goto L_0x0089;
                    case 16: goto L_0x0084;
                    case 17: goto L_0x007f;
                    case 18: goto L_0x007a;
                    case 19: goto L_0x0075;
                    case 20: goto L_0x0062;
                    case 21: goto L_0x0057;
                    case 22: goto L_0x004c;
                    case 23: goto L_0x0041;
                    case 24: goto L_0x0036;
                    case 25: goto L_0x0027;
                    case 26: goto L_0x0014;
                    case 27: goto L_0x0005;
                    default: goto L_0x0003;
                }
            L_0x0003:
                r1 = 0
                return r1
            L_0x0005:
                android.os.IBinder r1 = r2.readStrongBinder()
                z8.d r1 = z8.d.a.H(r1)
                com.google.android.gms.internal.common.n.b(r2)
                r0.E0(r1)
                goto L_0x0070
            L_0x0014:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.google.android.gms.internal.common.n.a(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                int r4 = r2.readInt()
                com.google.android.gms.internal.common.n.b(r2)
                r0.A0(r1, r4)
                goto L_0x0070
            L_0x0027:
                android.os.Parcelable$Creator r1 = android.content.Intent.CREATOR
                android.os.Parcelable r1 = com.google.android.gms.internal.common.n.a(r2, r1)
                android.content.Intent r1 = (android.content.Intent) r1
                com.google.android.gms.internal.common.n.b(r2)
                r0.w0(r1)
                goto L_0x0070
            L_0x0036:
                boolean r1 = com.google.android.gms.internal.common.n.g(r2)
                com.google.android.gms.internal.common.n.b(r2)
                r0.I1(r1)
                goto L_0x0070
            L_0x0041:
                boolean r1 = com.google.android.gms.internal.common.n.g(r2)
                com.google.android.gms.internal.common.n.b(r2)
                r0.l0(r1)
                goto L_0x0070
            L_0x004c:
                boolean r1 = com.google.android.gms.internal.common.n.g(r2)
                com.google.android.gms.internal.common.n.b(r2)
                r0.X(r1)
                goto L_0x0070
            L_0x0057:
                boolean r1 = com.google.android.gms.internal.common.n.g(r2)
                com.google.android.gms.internal.common.n.b(r2)
                r0.K(r1)
                goto L_0x0070
            L_0x0062:
                android.os.IBinder r1 = r2.readStrongBinder()
                z8.d r1 = z8.d.a.H(r1)
                com.google.android.gms.internal.common.n.b(r2)
                r0.v1(r1)
            L_0x0070:
                r3.writeNoException()
                goto L_0x00ec
            L_0x0075:
                boolean r1 = r0.T1()
                goto L_0x00bb
            L_0x007a:
                boolean r1 = r0.c0()
                goto L_0x00bb
            L_0x007f:
                boolean r1 = r0.S()
                goto L_0x00bb
            L_0x0084:
                boolean r1 = r0.Q0()
                goto L_0x00bb
            L_0x0089:
                boolean r1 = r0.z0()
                goto L_0x00bb
            L_0x008e:
                boolean r1 = r0.s1()
                goto L_0x00bb
            L_0x0093:
                boolean r1 = r0.h1()
                goto L_0x00bb
            L_0x0098:
                z8.d r1 = r0.t()
                goto L_0x00e6
            L_0x009d:
                boolean r1 = r0.X1()
                goto L_0x00bb
            L_0x00a2:
                int r1 = r0.o()
                goto L_0x00d0
            L_0x00a7:
                z8.c r1 = r0.w()
                goto L_0x00e6
            L_0x00ac:
                java.lang.String r1 = r0.A1()
                r3.writeNoException()
                r3.writeString(r1)
                goto L_0x00ec
            L_0x00b7:
                boolean r1 = r0.G1()
            L_0x00bb:
                r3.writeNoException()
                com.google.android.gms.internal.common.n.c(r3, r1)
                goto L_0x00ec
            L_0x00c2:
                z8.d r1 = r0.W()
                goto L_0x00e6
            L_0x00c7:
                z8.c r1 = r0.h()
                goto L_0x00e6
            L_0x00cc:
                int r1 = r0.l()
            L_0x00d0:
                r3.writeNoException()
                r3.writeInt(r1)
                goto L_0x00ec
            L_0x00d7:
                android.os.Bundle r1 = r0.c()
                r3.writeNoException()
                com.google.android.gms.internal.common.n.e(r3, r1)
                goto L_0x00ec
            L_0x00e2:
                z8.d r1 = r0.y()
            L_0x00e6:
                r3.writeNoException()
                com.google.android.gms.internal.common.n.f(r3, r1)
            L_0x00ec:
                r1 = 1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: z8.c.a.D(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void A0(@m0 Intent intent, int i10) throws RemoteException;

    @o0
    String A1() throws RemoteException;

    void E0(@m0 d dVar) throws RemoteException;

    boolean G1() throws RemoteException;

    void I1(boolean z10) throws RemoteException;

    void K(boolean z10) throws RemoteException;

    boolean Q0() throws RemoteException;

    boolean S() throws RemoteException;

    boolean T1() throws RemoteException;

    @m0
    d W() throws RemoteException;

    void X(boolean z10) throws RemoteException;

    boolean X1() throws RemoteException;

    @o0
    Bundle c() throws RemoteException;

    boolean c0() throws RemoteException;

    @o0
    c h() throws RemoteException;

    boolean h1() throws RemoteException;

    int l() throws RemoteException;

    void l0(boolean z10) throws RemoteException;

    int o() throws RemoteException;

    boolean s1() throws RemoteException;

    @m0
    d t() throws RemoteException;

    void v1(@m0 d dVar) throws RemoteException;

    @o0
    c w() throws RemoteException;

    void w0(@m0 Intent intent) throws RemoteException;

    @m0
    d y() throws RemoteException;

    boolean z0() throws RemoteException;
}
