package t7;

import android.net.Uri;
import d.o0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

public final class s0 extends e {

    /* renamed from: p  reason: collision with root package name */
    public static final int f13191p = 2000;

    /* renamed from: q  reason: collision with root package name */
    public static final int f13192q = 8000;

    /* renamed from: f  reason: collision with root package name */
    public final int f13193f;

    /* renamed from: g  reason: collision with root package name */
    public final byte[] f13194g;

    /* renamed from: h  reason: collision with root package name */
    public final DatagramPacket f13195h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public Uri f13196i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public DatagramSocket f13197j;
    @o0

    /* renamed from: k  reason: collision with root package name */
    public MulticastSocket f13198k;
    @o0

    /* renamed from: l  reason: collision with root package name */
    public InetAddress f13199l;
    @o0

    /* renamed from: m  reason: collision with root package name */
    public InetSocketAddress f13200m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13201n;

    /* renamed from: o  reason: collision with root package name */
    public int f13202o;

    public static final class a extends IOException {
        public a(IOException iOException) {
            super(iOException);
        }
    }

    public s0() {
        this(2000);
    }

    public s0(int i10) {
        this(i10, 8000);
    }

    public s0(int i10, int i11) {
        super(true);
        this.f13193f = i11;
        byte[] bArr = new byte[i10];
        this.f13194g = bArr;
        this.f13195h = new DatagramPacket(bArr, 0, i10);
    }

    @Deprecated
    public s0(@o0 r0 r0Var) {
        this(r0Var, 2000);
    }

    @Deprecated
    public s0(@o0 r0 r0Var, int i10) {
        this(r0Var, i10, 8000);
    }

    @Deprecated
    public s0(@o0 r0 r0Var, int i10, int i11) {
        this(i10, i11);
        if (r0Var != null) {
            d(r0Var);
        }
    }

    public long a(o oVar) throws a {
        DatagramSocket datagramSocket;
        Uri uri = oVar.f13130a;
        this.f13196i = uri;
        String host = uri.getHost();
        int port = this.f13196i.getPort();
        j(oVar);
        try {
            this.f13199l = InetAddress.getByName(host);
            this.f13200m = new InetSocketAddress(this.f13199l, port);
            if (this.f13199l.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f13200m);
                this.f13198k = multicastSocket;
                multicastSocket.joinGroup(this.f13199l);
                datagramSocket = this.f13198k;
            } else {
                datagramSocket = new DatagramSocket(this.f13200m);
            }
            this.f13197j = datagramSocket;
            try {
                this.f13197j.setSoTimeout(this.f13193f);
                this.f13201n = true;
                k(oVar);
                return -1;
            } catch (SocketException e10) {
                throw new a(e10);
            }
        } catch (IOException e11) {
            throw new a(e11);
        }
    }

    public void close() {
        this.f13196i = null;
        MulticastSocket multicastSocket = this.f13198k;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f13199l);
            } catch (IOException unused) {
            }
            this.f13198k = null;
        }
        DatagramSocket datagramSocket = this.f13197j;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f13197j = null;
        }
        this.f13199l = null;
        this.f13200m = null;
        this.f13202o = 0;
        if (this.f13201n) {
            this.f13201n = false;
            i();
        }
    }

    @o0
    public Uri g() {
        return this.f13196i;
    }

    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f13202o == 0) {
            try {
                this.f13197j.receive(this.f13195h);
                int length = this.f13195h.getLength();
                this.f13202o = length;
                h(length);
            } catch (IOException e10) {
                throw new a(e10);
            }
        }
        int length2 = this.f13195h.getLength();
        int i12 = this.f13202o;
        int min = Math.min(i12, i11);
        System.arraycopy(this.f13194g, length2 - i12, bArr, i10, min);
        this.f13202o -= min;
        return min;
    }
}
