package tg;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import og.o;
import pg.a;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<o> f23222a;

    /* renamed from: b  reason: collision with root package name */
    public int f23223b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23224c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f23225d;

    public b(List<o> list) {
        this.f23222a = list;
    }

    public o a(SSLSocket sSLSocket) throws IOException {
        o oVar;
        int i10 = this.f23223b;
        int size = this.f23222a.size();
        while (true) {
            if (i10 >= size) {
                oVar = null;
                break;
            }
            oVar = this.f23222a.get(i10);
            i10++;
            if (oVar.c(sSLSocket)) {
                this.f23223b = i10;
                break;
            }
        }
        if (oVar != null) {
            this.f23224c = c(sSLSocket);
            a.f22062a.c(oVar, sSLSocket, this.f23225d);
            return oVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f23225d + ", modes=" + this.f23222a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f23225d = true;
        if (!this.f23224c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return iOException instanceof SSLException;
        }
        return false;
    }

    public final boolean c(SSLSocket sSLSocket) {
        for (int i10 = this.f23223b; i10 < this.f23222a.size(); i10++) {
            if (this.f23222a.get(i10).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
