package u7;

import b6.c;
import d.o0;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w7.a;
import w7.q0;

public final class w extends j {
    public static final String U = ".exo";
    public static final String V = ".v3.exo";
    public static final Pattern W = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    public static final Pattern X = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    public static final Pattern Y = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public w(String str, long j10, long j11, long j12, @o0 File file) {
        super(str, j10, j11, j12, file);
    }

    @o0
    public static w i(File file, long j10, long j11, n nVar) {
        File file2;
        String l10;
        n nVar2 = nVar;
        String name = file.getName();
        if (!name.endsWith(V)) {
            File file3 = file;
            File o10 = o(file, nVar2);
            if (o10 == null) {
                return null;
            }
            file2 = o10;
            name = o10.getName();
        } else {
            file2 = file;
        }
        Matcher matcher = Y.matcher(name);
        if (!matcher.matches() || (l10 = nVar2.l(Integer.parseInt(matcher.group(1)))) == null) {
            return null;
        }
        long length = j10 == -1 ? file2.length() : j10;
        if (length == 0) {
            return null;
        }
        return new w(l10, Long.parseLong(matcher.group(2)), length, j11 == c.f4201b ? Long.parseLong(matcher.group(3)) : j11, file2);
    }

    @o0
    public static w j(File file, long j10, n nVar) {
        return i(file, j10, c.f4201b, nVar);
    }

    public static w k(String str, long j10, long j11) {
        return new w(str, j10, j11, c.f4201b, (File) null);
    }

    public static w l(String str, long j10) {
        return new w(str, j10, -1, c.f4201b, (File) null);
    }

    public static w m(String str, long j10) {
        return new w(str, j10, -1, c.f4201b, (File) null);
    }

    public static File n(File file, int i10, long j10, long j11) {
        return new File(file, i10 + "." + j10 + "." + j11 + V);
    }

    @o0
    public static File o(File file, n nVar) {
        String str;
        String name = file.getName();
        Matcher matcher = X.matcher(name);
        if (matcher.matches()) {
            str = q0.a1(matcher.group(1));
            if (str == null) {
                return null;
            }
        } else {
            matcher = W.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            str = matcher.group(1);
        }
        File n10 = n(file.getParentFile(), nVar.f(str), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (!file.renameTo(n10)) {
            return null;
        }
        return n10;
    }

    public w e(File file, long j10) {
        a.i(this.R);
        return new w(this.O, this.P, this.Q, j10, file);
    }
}
