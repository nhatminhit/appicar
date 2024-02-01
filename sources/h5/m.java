package h5;

import java.io.Serializable;

public class m implements Serializable {
    public static final long R = 1;
    public final char O;
    public final char P;
    public final char Q;

    public m() {
        this(':', ',', ',');
    }

    public m(char c10, char c11, char c12) {
        this.O = c10;
        this.P = c11;
        this.Q = c12;
    }

    public static m a() {
        return new m();
    }

    public char b() {
        return this.Q;
    }

    public char c() {
        return this.P;
    }

    public char d() {
        return this.O;
    }

    public m e(char c10) {
        return this.Q == c10 ? this : new m(this.O, this.P, c10);
    }

    public m f(char c10) {
        return this.P == c10 ? this : new m(this.O, c10, this.Q);
    }

    public m g(char c10) {
        return this.O == c10 ? this : new m(c10, this.P, this.Q);
    }
}
