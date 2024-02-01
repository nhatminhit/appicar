package a6;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;

@Deprecated
public class m extends DateFormat {
    public static final long O = 1;

    public m() {
        this.numberFormat = new DecimalFormat();
        this.calendar = new GregorianCalendar();
    }

    public Object clone() {
        return this;
    }

    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        stringBuffer.append(n.b(date));
        return stringBuffer;
    }

    public Date parse(String str) throws ParseException {
        return n.g(str, new ParsePosition(0));
    }

    public Date parse(String str, ParsePosition parsePosition) {
        try {
            return n.g(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
