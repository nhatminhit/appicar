package d8;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import d.m0;
import e8.a;
import j8.s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@a
public class b implements ServiceConnection {
    public boolean O = false;
    public final BlockingQueue P = new LinkedBlockingQueue();

    @a
    @m0
    public IBinder a() throws InterruptedException {
        s.k("BlockingServiceConnection.getService() called on main thread");
        if (!this.O) {
            this.O = true;
            return (IBinder) this.P.take();
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @a
    @m0
    public IBinder b(long j10, @m0 TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        s.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.O) {
            this.O = true;
            IBinder iBinder = (IBinder) this.P.poll(j10, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@m0 ComponentName componentName, @m0 IBinder iBinder) {
        this.P.add(iBinder);
    }

    public final void onServiceDisconnected(@m0 ComponentName componentName) {
    }
}
