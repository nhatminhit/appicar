package x0;

import android.annotation.SuppressLint;
import android.os.Message;
import d.m0;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15017a = true;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f15018b = true;

    @SuppressLint({"NewApi"})
    public static boolean a(@m0 Message message) {
        return message.isAsynchronous();
    }

    @SuppressLint({"NewApi"})
    public static void b(@m0 Message message, boolean z10) {
        message.setAsynchronous(z10);
    }
}
