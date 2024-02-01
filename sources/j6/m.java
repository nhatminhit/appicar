package j6;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class m {

    /* renamed from: c  reason: collision with root package name */
    public static final String f9589c = "com.apple.iTunes";

    /* renamed from: d  reason: collision with root package name */
    public static final String f9590d = "iTunSMPB";

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f9591e = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a  reason: collision with root package name */
    public int f9592a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f9593b = -1;

    public boolean a() {
        return (this.f9592a == -1 || this.f9593b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f9591e.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f9592a = parseInt;
            this.f9593b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(Metadata metadata) {
        for (int i10 = 0; i10 < metadata.d(); i10++) {
            Metadata.Entry c10 = metadata.c(i10);
            if (c10 instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) c10;
                if (f9590d.equals(commentFrame.Q) && b(commentFrame.R)) {
                    return true;
                }
            } else if (c10 instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) c10;
                if (f9589c.equals(internalFrame.P) && f9590d.equals(internalFrame.Q) && b(internalFrame.R)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public boolean d(int i10) {
        int i11 = i10 >> 12;
        int i12 = i10 & 4095;
        if (i11 <= 0 && i12 <= 0) {
            return false;
        }
        this.f9592a = i11;
        this.f9593b = i12;
        return true;
    }
}
