package y5;

import g5.c;
import i5.e0;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import w4.i;
import w4.p;

public class q extends l0<InetSocketAddress> {
    public q() {
        super(InetSocketAddress.class);
    }

    /* renamed from: M */
    public void m(InetSocketAddress inetSocketAddress, i iVar, e0 e0Var) throws IOException {
        String str;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int indexOf = hostName.indexOf(47);
        if (indexOf >= 0) {
            if (indexOf == 0) {
                if (address instanceof Inet6Address) {
                    str = "[" + hostName.substring(1) + "]";
                } else {
                    str = hostName.substring(1);
                }
                hostName = str;
            } else {
                hostName = hostName.substring(0, indexOf);
            }
        }
        iVar.Z2(hostName + ":" + inetSocketAddress.getPort());
    }

    /* renamed from: N */
    public void n(InetSocketAddress inetSocketAddress, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.f(inetSocketAddress, InetSocketAddress.class, p.VALUE_STRING));
        m(inetSocketAddress, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}
