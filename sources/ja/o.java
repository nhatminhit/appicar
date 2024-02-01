package ja;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public abstract class o {

    public class a extends o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f19892a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f19893b;

        public a(Method method, Object obj) {
            this.f19892a = method;
            this.f19893b = obj;
        }

        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return this.f19892a.invoke(this.f19893b, new Object[]{cls});
        }
    }

    public class b extends o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f19894a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f19895b;

        public b(Method method, int i10) {
            this.f19894a = method;
            this.f19895b = i10;
        }

        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return this.f19894a.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f19895b)});
        }
    }

    public class c extends o {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Method f19896a;

        public c(Method method) {
            this.f19896a = method;
        }

        public <T> T c(Class<T> cls) throws Exception {
            o.a(cls);
            return this.f19896a.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    public class d extends o {
        public <T> T c(Class<T> cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls);
        }
    }

    public static void a(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
        } else if (Modifier.isAbstract(modifiers)) {
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
    }

    public static o b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return new a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                return new b(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    return new c(declaredMethod3);
                } catch (Exception unused3) {
                    return new d();
                }
            }
        }
    }

    public abstract <T> T c(Class<T> cls) throws Exception;
}
