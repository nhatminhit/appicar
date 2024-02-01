package com.google.android.exoplayer2.offline;

import d.o0;
import java.io.IOException;

public interface c {

    public interface a {
        void a(long j10, long j11, float f10);
    }

    void a(@o0 a aVar) throws InterruptedException, IOException;

    void cancel();

    void remove() throws InterruptedException;
}
