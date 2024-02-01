package n1;

import android.widget.SeekBar;
import androidx.databinding.o;
import androidx.databinding.p;
import androidx.databinding.q;
import d.x0;

@x0({x0.a.LIBRARY})
@q({@p(attribute = "android:progress", type = SeekBar.class)})
public class y {

    public class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f10793a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f10794b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f10795c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ d f10796d;

        public a(b bVar, o oVar, c cVar, d dVar) {
            this.f10793a = bVar;
            this.f10794b = oVar;
            this.f10795c = cVar;
            this.f10796d = dVar;
        }

        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            b bVar = this.f10793a;
            if (bVar != null) {
                bVar.onProgressChanged(seekBar, i10, z10);
            }
            o oVar = this.f10794b;
            if (oVar != null) {
                oVar.a();
            }
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            c cVar = this.f10795c;
            if (cVar != null) {
                cVar.onStartTrackingTouch(seekBar);
            }
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            d dVar = this.f10796d;
            if (dVar != null) {
                dVar.onStopTrackingTouch(seekBar);
            }
        }
    }

    public interface b {
        void onProgressChanged(SeekBar seekBar, int i10, boolean z10);
    }

    public interface c {
        void onStartTrackingTouch(SeekBar seekBar);
    }

    public interface d {
        void onStopTrackingTouch(SeekBar seekBar);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onStartTrackingTouch", "android:onStopTrackingTouch", "android:onProgressChanged", "android:progressAttrChanged"})
    public static void a(SeekBar seekBar, c cVar, d dVar, b bVar, o oVar) {
        if (cVar == null && dVar == null && bVar == null && oVar == null) {
            seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        } else {
            seekBar.setOnSeekBarChangeListener(new a(bVar, oVar, cVar, dVar));
        }
    }

    @androidx.databinding.d({"android:progress"})
    public static void b(SeekBar seekBar, int i10) {
        if (i10 != seekBar.getProgress()) {
            seekBar.setProgress(i10);
        }
    }
}
