package v3;

import d.m0;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14158a = "UTF-8";

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f14159b = Charset.forName("UTF-8");

    void a(@m0 MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
