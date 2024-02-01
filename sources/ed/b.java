package ed;

import eb.j;
import java.util.Arrays;
import lb.d;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f18594a = {192, 193, 194, 195, 200, 201, 202, 204, 205, 210, 211, 212, 213, 217, 218, 221, 224, 225, 226, 227, 232, 233, 234, j.f18559e, j.f18560f, d.f20445j, d.f20446k, d.f20447l, 245, 249, 250, 253, 258, 259, 272, 273, 296, 297, 360, 361, 416, 417, 431, 432, 7840, 7841, 7842, 7843, 7844, 7845, 7846, 7847, 7848, 7849, 7850, 7851, 7852, 7853, 7854, 7855, 7856, 7857, 7858, 7859, 7860, 7861, 7862, 7863, 7864, 7865, 7866, 7867, 7868, 7869, 7870, 7871, 7872, 7873, 7874, 7875, 7876, 7877, 7878, 7879, 7880, 7881, 7882, 7883, 7884, 7885, 7886, 7887, 7888, 7889, 7890, 7891, 7892, 7893, 7894, 7895, 7896, 7897, 7898, 7899, 7900, 7901, 7902, 7903, 7904, 7905, 7906, 7907, 7908, 7909, 7910, 7911, 7912, 7913, 7914, 7915, 7916, 7917, 7918, 7919, 7920, 7921};

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f18595b = {'A', 'A', 'A', 'A', 'E', 'E', 'E', 'I', 'I', 'O', 'O', 'O', 'O', 'U', 'U', 'Y', 'a', 'a', 'a', 'a', 'e', 'e', 'e', 'i', 'i', 'o', 'o', 'o', 'o', 'u', 'u', 'y', 'A', 'a', 'D', 'd', 'I', 'i', 'U', 'u', 'O', 'o', 'U', 'u', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'A', 'a', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'E', 'e', 'I', 'i', 'I', 'i', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'O', 'o', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u', 'U', 'u'};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f18596c = {"òa", "óa", "ỏa", "õa", "ọa", "òe", "óe", "ỏe", "õe", "ọe", "ùy", "úy", "ủy", "ũy", "ụy"};

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f18597d = {"oà", "oá", "oả", "oã", "oạ", "oè", "oé", "oẻ", "oẽ", "oẹ", "uỳ", "uý", "uỷ", "uỹ", "uỵ"};

    public static boolean a(String str, String str2) {
        if (str2.matches("[a-zA-Z0-9 ]+")) {
            str = c(str);
            str2 = c(str2);
        }
        String replace = str.toLowerCase().replace(" ", "");
        for (char c10 : str2.toLowerCase().replace(" ", "").toCharArray()) {
            if (!replace.contains(c10 + "")) {
                return false;
            }
            replace = replace.substring(replace.indexOf(c10));
        }
        return true;
    }

    public static char b(char c10) {
        int binarySearch = Arrays.binarySearch(f18594a, c10);
        return binarySearch >= 0 ? f18595b[binarySearch] : c10;
    }

    public static String c(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        for (int i10 = 0; i10 < sb2.length(); i10++) {
            sb2.setCharAt(i10, b(sb2.charAt(i10)));
        }
        return sb2.toString();
    }

    public static boolean d(String str, String str2) {
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f18596c;
            if (i11 >= strArr.length) {
                break;
            }
            if (lowerCase.contains(strArr[i11])) {
                lowerCase = lowerCase.replaceAll(strArr[i11], f18597d[i11]);
            }
            i11++;
        }
        while (true) {
            String[] strArr2 = f18596c;
            if (i10 >= strArr2.length) {
                return lowerCase.contains(lowerCase2);
            }
            if (lowerCase2.contains(strArr2[i10])) {
                lowerCase2 = lowerCase2.replaceAll(strArr2[i10], f18597d[i10]);
            }
            i10++;
        }
    }

    public static boolean e(String str, String str2) {
        String lowerCase = str.replaceAll("(\\s|-|\\.|_)+", " ").toLowerCase();
        String lowerCase2 = str2.replaceAll("(\\s|-|\\.|_)+", " ").toLowerCase();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = f18596c;
            if (i11 >= strArr.length) {
                break;
            }
            if (lowerCase.contains(strArr[i11])) {
                lowerCase = lowerCase.replaceAll(strArr[i11], f18597d[i11]);
            }
            i11++;
        }
        while (true) {
            String[] strArr2 = f18596c;
            if (i10 >= strArr2.length) {
                return lowerCase.contains(lowerCase2);
            }
            if (lowerCase2.contains(strArr2[i10])) {
                lowerCase2 = lowerCase2.replaceAll(strArr2[i10], f18597d[i10]);
            }
            i10++;
        }
    }
}
