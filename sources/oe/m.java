package oe;

import fh.g;
import pe.a;
import qe.d;
import ve.e;
import xe.l0;
import zd.a0;
import zd.a1;
import zd.h1;

public final class m {
    @g
    @e

    /* renamed from: a  reason: collision with root package name */
    public static final l f21456a;

    static {
        l lVar;
        d newInstance;
        Class<l> cls = l.class;
        try {
            newInstance = d.class.newInstance();
            l0.o(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            if (newInstance != null) {
                lVar = newInstance;
                f21456a = lVar;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
        } catch (ClassCastException e10) {
            ClassLoader classLoader = newInstance.getClass().getClassLoader();
            ClassLoader classLoader2 = cls.getClassLoader();
            if (!l0.g(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
            }
            throw e10;
        } catch (ClassNotFoundException unused) {
            try {
                Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                l0.o(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                if (newInstance2 != null) {
                    try {
                        lVar = (l) newInstance2;
                    } catch (ClassCastException e11) {
                        ClassLoader classLoader3 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader4 = cls.getClassLoader();
                        if (!l0.g(classLoader3, classLoader4)) {
                            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
                        }
                        throw e11;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
            } catch (ClassNotFoundException unused2) {
                try {
                    a newInstance3 = a.class.newInstance();
                    l0.o(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                    if (newInstance3 != null) {
                        try {
                            lVar = newInstance3;
                        } catch (ClassCastException e12) {
                            ClassLoader classLoader5 = newInstance3.getClass().getClassLoader();
                            ClassLoader classLoader6 = cls.getClassLoader();
                            if (!l0.g(classLoader5, classLoader6)) {
                                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                            }
                            throw e12;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                } catch (ClassNotFoundException unused3) {
                    try {
                        Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        l0.o(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                        if (newInstance4 != null) {
                            try {
                                lVar = (l) newInstance4;
                            } catch (ClassCastException e13) {
                                ClassLoader classLoader7 = newInstance4.getClass().getClassLoader();
                                ClassLoader classLoader8 = cls.getClassLoader();
                                if (!l0.g(classLoader7, classLoader8)) {
                                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                                }
                                throw e13;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                    } catch (ClassNotFoundException unused4) {
                        lVar = new l();
                    }
                }
            }
        }
    }

    @h1(version = "1.2")
    @a1
    public static final boolean a(int i10, int i11, int i12) {
        return a0.U.j(i10, i11, i12);
    }

    @f
    public static final /* synthetic */ <T> T b(Object obj) {
        try {
            l0.y(1, w1.a.X4);
            return obj;
        } catch (ClassCastException e10) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            l0.y(4, w1.a.X4);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (!l0.g(classLoader, classLoader2)) {
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
            }
            throw e10;
        }
    }
}
