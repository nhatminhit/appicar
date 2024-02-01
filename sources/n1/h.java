package n1;

import androidx.cardview.widget.CardView;
import androidx.databinding.d;
import androidx.databinding.g;
import d.x0;

@x0({x0.a.LIBRARY})
@androidx.databinding.h({@g(attribute = "cardCornerRadius", method = "setRadius", type = CardView.class), @g(attribute = "cardMaxElevation", method = "setMaxCardElevation", type = CardView.class), @g(attribute = "cardPreventCornerOverlap", method = "setPreventCornerOverlap", type = CardView.class), @g(attribute = "cardUseCompatPadding", method = "setUseCompatPadding", type = CardView.class)})
public class h {
    @d({"contentPadding"})
    public static void a(CardView cardView, int i10) {
        cardView.h(i10, i10, i10, i10);
    }

    @d({"contentPaddingBottom"})
    public static void b(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), i10);
    }

    @d({"contentPaddingLeft"})
    public static void c(CardView cardView, int i10) {
        cardView.h(i10, cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }

    @d({"contentPaddingRight"})
    public static void d(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), i10, cardView.getContentPaddingBottom());
    }

    @d({"contentPaddingTop"})
    public static void e(CardView cardView, int i10) {
        cardView.h(cardView.getContentPaddingLeft(), i10, cardView.getContentPaddingRight(), cardView.getContentPaddingBottom());
    }
}
