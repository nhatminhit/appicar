package j6;

import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface i {

    /* renamed from: a  reason: collision with root package name */
    public static final int f9586a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f9587b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9588c = -1;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    void a();

    boolean c(j jVar) throws IOException, InterruptedException;

    int f(j jVar, p pVar) throws IOException, InterruptedException;

    void g(k kVar);

    void h(long j10, long j11);
}
