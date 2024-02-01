package u2;

import android.content.Context;
import d.m0;
import u2.n2;

public class k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f13512a = "ROOM";

    /* renamed from: b  reason: collision with root package name */
    public static final String f13513b = "room_master_table";

    /* renamed from: c  reason: collision with root package name */
    public static final String f13514c = "_CursorConverter";

    @m0
    public static <T extends n2> n2.a<T> a(@m0 Context context, @m0 Class<T> cls, @m0 String str) {
        if (str != null && str.trim().length() != 0) {
            return new n2.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }

    @m0
    public static <T, C> T b(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return Class.forName(str2, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    @m0
    public static <T extends n2> n2.a<T> c(@m0 Context context, @m0 Class<T> cls) {
        return new n2.a<>(context, cls, (String) null);
    }
}
