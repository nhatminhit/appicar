package yg;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import og.h0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
public class c extends d {
    public c(Class<?> cls) {
        super(cls, (Class<?>) null, (Method) null, (Method) null, (Method) null, (Method) null);
    }

    @Nullable
    public static h A() {
        if (!h.r()) {
            return null;
        }
        try {
            if (d.B() >= 29) {
                return new c(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ReflectiveOperationException unused) {
        }
        return null;
    }

    public final void C(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public void h(SSLSocket sSLSocket, String str, List<h0> list) throws IOException {
        try {
            C(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) h.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    @Nullable
    @IgnoreJRERequirement
    public String p(SSLSocket sSLSocket) {
        String a10 = sSLSocket.getApplicationProtocol();
        if (a10 == null || a10.isEmpty()) {
            return null;
        }
        return a10;
    }
}
