package c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import d.m0;
import d.o0;

public abstract class a<I, O> {

    /* renamed from: c.a$a  reason: collision with other inner class name */
    public static final class C0070a<T> {
        @SuppressLint({"UnknownNullness"})

        /* renamed from: a  reason: collision with root package name */
        public final T f4759a;

        public C0070a(@SuppressLint({"UnknownNullness"}) T t10) {
            this.f4759a = t10;
        }

        @SuppressLint({"UnknownNullness"})
        public T a() {
            return this.f4759a;
        }
    }

    @m0
    public abstract Intent a(@m0 Context context, @SuppressLint({"UnknownNullness"}) I i10);

    @o0
    public C0070a<O> b(@m0 Context context, @SuppressLint({"UnknownNullness"}) I i10) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i10, @o0 Intent intent);
}
