package qa;

import java.util.List;

public enum e {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(r0),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(u.class),
    ALLOWED_EAN_EXTENSIONS(r0);
    
    public final Class<?> O;

    /* access modifiers changed from: public */
    e(Class<?> cls) {
        this.O = cls;
    }

    public Class<?> a() {
        return this.O;
    }
}
