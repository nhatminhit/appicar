package m6;

import b6.j0;
import j6.j;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final int f10489a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f10490b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f10491c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f10492d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f10493e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f10494f = 5;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a(int i10) throws j0;

    int b(int i10);

    boolean c(int i10);

    void d(int i10, String str) throws j0;

    void e(int i10, double d10) throws j0;

    void f(int i10, long j10, long j11) throws j0;

    void g(int i10, long j10) throws j0;

    void h(int i10, int i11, j jVar) throws IOException, InterruptedException;
}
