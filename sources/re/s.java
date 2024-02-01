package re;

import fh.g;
import fh.h;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p000if.m;
import xe.l0;

public final class s implements m<String> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f22516a;

    public static final class a implements Iterator<String>, ye.a {
        @h
        public String O;
        public boolean P;
        public final /* synthetic */ s Q;

        public a(s sVar) {
            this.Q = sVar;
        }

        @g
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.O;
                this.O = null;
                l0.m(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.O == null && !this.P) {
                String readLine = this.Q.f22516a.readLine();
                this.O = readLine;
                if (readLine == null) {
                    this.P = true;
                }
            }
            return this.O != null;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(@g BufferedReader bufferedReader) {
        l0.p(bufferedReader, "reader");
        this.f22516a = bufferedReader;
    }

    @g
    public Iterator<String> iterator() {
        return new a(this);
    }
}
