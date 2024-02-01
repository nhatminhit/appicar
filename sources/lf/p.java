package lf;

import be.b0;
import fh.g;
import gf.m;
import gf.v;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import we.l;
import xe.l0;
import xe.n0;

public final class p {

    public static final class a extends n0 implements l<T, Boolean> {
        public final /* synthetic */ int P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10) {
            super(1);
            this.P = i10;
        }

        @g
        /* renamed from: c */
        public final Boolean A(T t10) {
            i iVar = (i) t10;
            return Boolean.valueOf((this.P & iVar.a()) == iVar.getValue());
        }
    }

    public static final m f(Matcher matcher, int i10, CharSequence charSequence) {
        if (!matcher.find(i10)) {
            return null;
        }
        return new n(matcher, charSequence);
    }

    public static final /* synthetic */ <T extends Enum<T> & i> Set<T> g(int i10) {
        l0.y(4, w1.a.X4);
        EnumSet<E> allOf = EnumSet.allOf(Enum.class);
        l0.o(allOf, "fromInt$lambda$1");
        l0.w();
        b0.N0(allOf, new a(i10));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        l0.o(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    public static final m h(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new n(matcher, charSequence);
    }

    public static final m i(MatchResult matchResult) {
        return v.W1(matchResult.start(), matchResult.end());
    }

    public static final m j(MatchResult matchResult, int i10) {
        return v.W1(matchResult.start(i10), matchResult.end(i10));
    }

    public static final int k(Iterable<? extends i> iterable) {
        int i10 = 0;
        for (i value : iterable) {
            i10 |= value.getValue();
        }
        return i10;
    }
}
