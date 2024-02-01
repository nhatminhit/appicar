package n1;

import android.widget.RatingBar;
import androidx.databinding.d;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;

@x0({x0.a.LIBRARY})
@q({@p(attribute = "android:rating", type = RatingBar.class)})
public class w {

    public class a implements RatingBar.OnRatingBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ RatingBar.OnRatingBarChangeListener f10787a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f10788b;

        public a(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, o oVar) {
            this.f10787a = onRatingBarChangeListener;
            this.f10788b = oVar;
        }

        public void onRatingChanged(RatingBar ratingBar, float f10, boolean z10) {
            RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.f10787a;
            if (onRatingBarChangeListener != null) {
                onRatingBarChangeListener.onRatingChanged(ratingBar, f10, z10);
            }
            this.f10788b.a();
        }
    }

    @d(requireAll = false, value = {"android:onRatingChanged", "android:ratingAttrChanged"})
    public static void a(RatingBar ratingBar, RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, o oVar) {
        if (oVar == null) {
            ratingBar.setOnRatingBarChangeListener(onRatingBarChangeListener);
        } else {
            ratingBar.setOnRatingBarChangeListener(new a(onRatingBarChangeListener, oVar));
        }
    }

    @d({"android:rating"})
    public static void b(RatingBar ratingBar, float f10) {
        if (ratingBar.getRating() != f10) {
            ratingBar.setRating(f10);
        }
    }
}
