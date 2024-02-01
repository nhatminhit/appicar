package a9;

import dalvik.system.PathClassLoader;

public final class c extends PathClassLoader {
    public c(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    public final Class loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z10);
    }
}
