package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.b;
import d.m0;
import d.o0;
import f8.a;
import g8.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface x {
    ConnectionResult f();

    boolean g();

    ConnectionResult h(long j10, TimeUnit timeUnit);

    void i();

    b.a j(@m0 b.a aVar);

    boolean k();

    b.a l(@m0 b.a aVar);

    boolean m(n nVar);

    void n();

    void o();

    @o0
    ConnectionResult p(@m0 a aVar);

    void q();

    void r(String str, @o0 FileDescriptor fileDescriptor, PrintWriter printWriter, @o0 String[] strArr);
}
