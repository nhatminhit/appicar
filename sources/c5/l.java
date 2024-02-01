package c5;

import h5.a;
import h5.n;
import java.io.Writer;

public final class l extends Writer {
    public final n O;

    public l(a aVar) {
        this.O = new n(aVar);
    }

    public Writer append(char c10) {
        write((int) c10);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.O.b(charSequence2, 0, charSequence2.length());
        return this;
    }

    public Writer append(CharSequence charSequence, int i10, int i11) {
        String charSequence2 = charSequence.subSequence(i10, i11).toString();
        this.O.b(charSequence2, 0, charSequence2.length());
        return this;
    }

    public String c() {
        String l10 = this.O.l();
        this.O.A();
        return l10;
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(int i10) {
        this.O.a((char) i10);
    }

    public void write(String str) {
        this.O.b(str, 0, str.length());
    }

    public void write(String str, int i10, int i11) {
        this.O.b(str, i10, i11);
    }

    public void write(char[] cArr) {
        this.O.c(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i10, int i11) {
        this.O.c(cArr, i10, i11);
    }
}
