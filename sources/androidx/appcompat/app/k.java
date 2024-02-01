package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import d.m0;
import d.t0;
import java.lang.reflect.Field;
import java.util.Map;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f835a = "ResourcesFlusher";

    /* renamed from: b  reason: collision with root package name */
    public static Field f836b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f837c;

    /* renamed from: d  reason: collision with root package name */
    public static Class<?> f838d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f839e;

    /* renamed from: f  reason: collision with root package name */
    public static Field f840f;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f841g;

    /* renamed from: h  reason: collision with root package name */
    public static Field f842h;

    /* renamed from: i  reason: collision with root package name */
    public static boolean f843i;

    public static void a(@m0 Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            if (i10 >= 24) {
                d(resources);
            } else {
                c(resources);
            }
        }
    }

    @t0(21)
    public static void b(@m0 Resources resources) {
        if (!f837c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f836b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f837c = true;
        }
        Field field = f836b;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    @t0(23)
    public static void c(@m0 Resources resources) {
        if (!f837c) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f836b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f837c = true;
        }
        Object obj = null;
        Field field = f836b;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
            }
        }
        if (obj != null) {
            e(obj);
        }
    }

    @t0(24)
    public static void d(@m0 Resources resources) {
        Object obj;
        if (!f843i) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f842h = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f843i = true;
        }
        Field field = f842h;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException unused2) {
                obj = null;
            }
            if (obj != null) {
                if (!f837c) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                        f836b = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f837c = true;
                }
                Field field2 = f836b;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException unused4) {
                    }
                }
                if (obj2 != null) {
                    e(obj2);
                }
            }
        }
    }

    @t0(16)
    public static void e(@m0 Object obj) {
        if (!f839e) {
            try {
                f838d = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            f839e = true;
        }
        Class<?> cls = f838d;
        if (cls != null) {
            if (!f841g) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f840f = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException unused2) {
                }
                f841g = true;
            }
            Field field = f840f;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException unused3) {
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
