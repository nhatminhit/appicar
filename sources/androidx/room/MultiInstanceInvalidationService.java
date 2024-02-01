package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import androidx.room.b;
import d.o0;
import d.x0;
import java.util.HashMap;

@x0({x0.a.Q})
public class MultiInstanceInvalidationService extends Service {
    public int O = 0;
    public final HashMap<Integer, String> P = new HashMap<>();
    public final RemoteCallbackList<a> Q = new a();
    public final b.C0052b R = new b();

    public class a extends RemoteCallbackList<a> {
        public a() {
        }

        /* renamed from: a */
        public void onCallbackDied(a aVar, Object obj) {
            MultiInstanceInvalidationService.this.P.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class b extends b.C0052b {
        public b() {
        }

        public void M1(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.Q) {
                String str = MultiInstanceInvalidationService.this.P.get(Integer.valueOf(i10));
                if (str != null) {
                    int beginBroadcast = MultiInstanceInvalidationService.this.Q.beginBroadcast();
                    int i11 = 0;
                    while (i11 < beginBroadcast) {
                        try {
                            int intValue = ((Integer) MultiInstanceInvalidationService.this.Q.getBroadcastCookie(i11)).intValue();
                            String str2 = MultiInstanceInvalidationService.this.P.get(Integer.valueOf(intValue));
                            if (i10 != intValue && str.equals(str2)) {
                                try {
                                    MultiInstanceInvalidationService.this.Q.getBroadcastItem(i11).d0(strArr);
                                } catch (RemoteException unused) {
                                }
                            }
                            i11++;
                        } catch (Throwable th2) {
                            MultiInstanceInvalidationService.this.Q.finishBroadcast();
                            throw th2;
                        }
                    }
                    MultiInstanceInvalidationService.this.Q.finishBroadcast();
                }
            }
        }

        public void Q1(a aVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.Q) {
                MultiInstanceInvalidationService.this.Q.unregister(aVar);
                MultiInstanceInvalidationService.this.P.remove(Integer.valueOf(i10));
            }
        }

        public int q0(a aVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.Q) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i10 = multiInstanceInvalidationService.O + 1;
                multiInstanceInvalidationService.O = i10;
                if (multiInstanceInvalidationService.Q.register(aVar, Integer.valueOf(i10))) {
                    MultiInstanceInvalidationService.this.P.put(Integer.valueOf(i10), str);
                    return i10;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.O--;
                return 0;
            }
        }
    }

    @o0
    public IBinder onBind(Intent intent) {
        return this.R;
    }
}
