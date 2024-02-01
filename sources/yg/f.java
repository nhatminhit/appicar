package yg;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import og.h0;
import pg.e;

public class f extends h {

    /* renamed from: e  reason: collision with root package name */
    public final Method f24820e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f24821f;

    /* renamed from: g  reason: collision with root package name */
    public final Method f24822g;

    /* renamed from: h  reason: collision with root package name */
    public final Class<?> f24823h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<?> f24824i;

    public static class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f24825a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f24826b;

        /* renamed from: c  reason: collision with root package name */
        public String f24827c;

        public a(List<String> list) {
            this.f24825a = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = e.f22066b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f24826b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f24825a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            String str = (String) list.get(i10);
                            if (this.f24825a.contains(str)) {
                                this.f24827c = str;
                                return str;
                            }
                        }
                        String str2 = this.f24825a.get(0);
                        this.f24827c = str2;
                        return str2;
                    }
                }
                if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                }
                this.f24827c = (String) objArr[0];
                return null;
            }
        }
    }

    public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f24820e = method;
        this.f24821f = method2;
        this.f24822g = method3;
        this.f24823h = cls;
        this.f24824i = cls2;
    }

    public static h y() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, (ClassLoader) null);
            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$Provider", true, (ClassLoader) null);
            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ClientProvider", true, (ClassLoader) null);
            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN" + "$ServerProvider", true, (ClassLoader) null);
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new f(method, cls.getMethod("get", new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket) {
        try {
            this.f24822g.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        }
    }

    public void h(SSLSocket sSLSocket, String str, List<h0> list) {
        List<String> b10 = h.b(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f24823h, this.f24824i}, new a(b10));
            this.f24820e.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        }
    }

    @Nullable
    public String p(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.f24821f.invoke((Object) null, new Object[]{sSLSocket}));
            boolean z10 = aVar.f24826b;
            if (!z10 && aVar.f24827c == null) {
                h.m().u(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (z10) {
                return null;
            } else {
                return aVar.f24827c;
            }
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        }
    }
}
