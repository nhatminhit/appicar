package androidx.core.app;

import a.a;
import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import h0.k2;

public abstract class NotificationCompatSideChannelService extends Service {

    public class a extends a.b {
        public a() {
        }

        public void O1(String str, int i10, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.d(str, i10, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void f1(String str, int i10, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.a(str, i10, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void p0(String str) {
            NotificationCompatSideChannelService.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int i10, String str2);

    public abstract void b(String str);

    public void c(int i10, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i10);
        int length = packagesForUid.length;
        int i11 = 0;
        while (i11 < length) {
            if (!packagesForUid[i11].equals(str)) {
                i11++;
            } else {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i10 + " is not authorized for package " + str);
    }

    public abstract void d(String str, int i10, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        intent.getAction().equals(k2.f8406g);
        return null;
    }
}
