package mh;

import jh.m;

public interface e {

    public enum a {
        CONTINUE,
        SKIP_CHILDREN,
        SKIP_ENTIRELY,
        REMOVE,
        STOP
    }

    a a(m mVar, int i10);

    a b(m mVar, int i10);
}
