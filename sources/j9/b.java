package j9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import d.m0;
import d.x0;
import java.util.List;

@x0({x0.a.LIBRARY_GROUP})
public class b {
    public static void a(@m0 AnimatorSet animatorSet, @m0 List<Animator> list) {
        int size = list.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = list.get(i10);
            j10 = Math.max(j10, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j10);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
