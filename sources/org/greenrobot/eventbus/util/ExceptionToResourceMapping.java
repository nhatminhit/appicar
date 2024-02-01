package org.greenrobot.eventbus.util;

import java.util.HashMap;
import java.util.Map;

public class ExceptionToResourceMapping {
    public final Map<Class<? extends Throwable>, Integer> throwableToMsgIdMap = new HashMap();

    public ExceptionToResourceMapping addMapping(Class<? extends Throwable> cls, int i10) {
        this.throwableToMsgIdMap.put(cls, Integer.valueOf(i10));
        return this;
    }

    public Integer mapThrowable(Throwable th2) {
        int i10 = 20;
        Throwable th3 = th2;
        do {
            Integer mapThrowableFlat = mapThrowableFlat(th3);
            if (mapThrowableFlat != null) {
                return mapThrowableFlat;
            }
            th3 = th3.getCause();
            i10--;
            if (i10 <= 0 || th3 == th2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("No specific message resource ID found for ");
                sb2.append(th2);
            }
        } while (th3 != null);
        StringBuilder sb22 = new StringBuilder();
        sb22.append("No specific message resource ID found for ");
        sb22.append(th2);
        return null;
    }

    public Integer mapThrowableFlat(Throwable th2) {
        Class<?> cls = th2.getClass();
        Integer num = this.throwableToMsgIdMap.get(cls);
        if (num == null) {
            Class cls2 = null;
            for (Map.Entry next : this.throwableToMsgIdMap.entrySet()) {
                Class cls3 = (Class) next.getKey();
                if (cls3.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(cls3))) {
                    num = (Integer) next.getValue();
                    cls2 = cls3;
                }
            }
        }
        return num;
    }
}
