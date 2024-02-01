package com.google.android.exoplayer2.ui;

import d.o0;

public interface e {

    public interface a {
        void a(e eVar, long j10);

        void c(e eVar, long j10, boolean z10);

        void f(e eVar, long j10);
    }

    void a(@o0 long[] jArr, @o0 boolean[] zArr, int i10);

    void b(a aVar);

    void c(a aVar);

    long getPreferredUpdateDelay();

    void setBufferedPosition(long j10);

    void setDuration(long j10);

    void setEnabled(boolean z10);

    void setKeyCountIncrement(int i10);

    void setKeyTimeIncrement(long j10);

    void setPosition(long j10);
}
