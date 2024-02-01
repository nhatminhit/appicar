package n7;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.Map;

public final class d {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i10, int i11, e eVar) {
        Object obj;
        if (eVar.h() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(eVar.h()), i10, i11, 33);
        }
        if (eVar.n()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (eVar.o()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (eVar.k()) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(eVar.c()), i10, i11, 33);
        }
        if (eVar.j()) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(eVar.b()), i10, i11, 33);
        }
        if (eVar.d() != null) {
            spannableStringBuilder.setSpan(new TypefaceSpan(eVar.d()), i10, i11, 33);
        }
        if (eVar.i() != null) {
            spannableStringBuilder.setSpan(new AlignmentSpan.Standard(eVar.i()), i10, i11, 33);
        }
        int f10 = eVar.f();
        if (f10 == 1) {
            obj = new AbsoluteSizeSpan((int) eVar.e(), true);
        } else if (f10 == 2) {
            obj = new RelativeSizeSpan(eVar.e());
        } else if (f10 == 3) {
            obj = new RelativeSizeSpan(eVar.e() / 100.0f);
        } else {
            return;
        }
        spannableStringBuilder.setSpan(obj, i10, i11, 33);
    }

    public static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    public static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    public static e d(e eVar, String[] strArr, Map<String, e> map) {
        if (eVar == null && strArr == null) {
            return null;
        }
        int i10 = 0;
        if (eVar == null && strArr.length == 1) {
            return map.get(strArr[0]);
        }
        if (eVar == null && strArr.length > 1) {
            e eVar2 = new e();
            int length = strArr.length;
            while (i10 < length) {
                eVar2.a(map.get(strArr[i10]));
                i10++;
            }
            return eVar2;
        } else if (eVar != null && strArr != null && strArr.length == 1) {
            return eVar.a(map.get(strArr[0]));
        } else {
            if (!(eVar == null || strArr == null || strArr.length <= 1)) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    eVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
            return eVar;
        }
    }
}
