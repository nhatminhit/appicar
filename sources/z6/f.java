package z6;

import java.io.Closeable;

public interface f extends Closeable {
    void close();

    int getCount();

    int getPosition();

    boolean isAfterLast();

    boolean isBeforeFirst();

    boolean isClosed();

    boolean isFirst();

    boolean isLast();

    boolean moveToFirst();

    boolean moveToLast();

    boolean moveToNext();

    boolean moveToPosition(int i10);

    boolean moveToPrevious();

    d s1();
}
