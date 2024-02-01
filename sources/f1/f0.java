package f1;

import android.view.Menu;
import android.view.MenuItem;
import fh.g;
import java.util.Iterator;
import kotlin.Metadata;
import p000if.m;
import we.l;
import we.p;
import xe.l0;
import ye.d;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0002\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\n\u001a\r\u0010\n\u001a\u00020\u0006*\u00020\u0000H\b\u001a\r\u0010\u000b\u001a\u00020\u0006*\u00020\u0000H\b\u001a3\u0010\u0010\u001a\u00020\b*\u00020\u00002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\fH\bø\u0001\u0000\u001aH\u0010\u0012\u001a\u00020\b*\u00020\u000026\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\b0\u0011H\bø\u0001\u0000\u001a\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013*\u00020\u0000H\u0002\"\u0016\u0010\u0017\u001a\u00020\u0001*\u00020\u00008Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\"\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0002\u0007\n\u0005\b20\u0001¨\u0006\u001c"}, d2 = {"Landroid/view/Menu;", "", "index", "Landroid/view/MenuItem;", "d", "item", "", "a", "Lzd/u2;", "j", "g", "h", "Lkotlin/Function1;", "Lzd/v0;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "i", "f", "(Landroid/view/Menu;)I", "size", "Lif/m;", "e", "(Landroid/view/Menu;)Lif/m;", "children", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class f0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"f1/f0$a", "Lif/m;", "Landroid/view/MenuItem;", "", "iterator", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements m<MenuItem> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Menu f7117a;

        public a(Menu menu) {
            this.f7117a = menu;
        }

        @g
        public Iterator<MenuItem> iterator() {
            return f0.i(this.f7117a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"f1/f0$b", "", "Landroid/view/MenuItem;", "", "hasNext", "a", "Lzd/u2;", "remove", "", "O", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Iterator<MenuItem>, d {
        public int O;
        public final /* synthetic */ Menu P;

        public b(Menu menu) {
            this.P = menu;
        }

        @g
        /* renamed from: a */
        public MenuItem next() {
            Menu menu = this.P;
            int i10 = this.O;
            this.O = i10 + 1;
            MenuItem item = menu.getItem(i10);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.O < this.P.size();
        }

        public void remove() {
            Menu menu = this.P;
            int i10 = this.O - 1;
            this.O = i10;
            menu.removeItem(i10);
        }
    }

    public static final boolean a(@g Menu menu, @g MenuItem menuItem) {
        l0.p(menu, "<this>");
        l0.p(menuItem, "item");
        int size = menu.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (l0.g(menu.getItem(i10), menuItem)) {
                    return true;
                }
                if (i11 >= size) {
                    break;
                }
                i10 = i11;
            }
        }
        return false;
    }

    public static final void b(@g Menu menu, @g l<? super MenuItem, u2> lVar) {
        l0.p(menu, "<this>");
        l0.p(lVar, "action");
        int size = menu.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                MenuItem item = menu.getItem(i10);
                l0.o(item, "getItem(index)");
                lVar.A(item);
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    public static final void c(@g Menu menu, @g p<? super Integer, ? super MenuItem, u2> pVar) {
        l0.p(menu, "<this>");
        l0.p(pVar, "action");
        int size = menu.size();
        if (size > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Integer valueOf = Integer.valueOf(i10);
                MenuItem item = menu.getItem(i10);
                l0.o(item, "getItem(index)");
                pVar.g0(valueOf, item);
                if (i11 < size) {
                    i10 = i11;
                } else {
                    return;
                }
            }
        }
    }

    @g
    public static final MenuItem d(@g Menu menu, int i10) {
        l0.p(menu, "<this>");
        MenuItem item = menu.getItem(i10);
        l0.o(item, "getItem(index)");
        return item;
    }

    @g
    public static final m<MenuItem> e(@g Menu menu) {
        l0.p(menu, "<this>");
        return new a(menu);
    }

    public static final int f(@g Menu menu) {
        l0.p(menu, "<this>");
        return menu.size();
    }

    public static final boolean g(@g Menu menu) {
        l0.p(menu, "<this>");
        return menu.size() == 0;
    }

    public static final boolean h(@g Menu menu) {
        l0.p(menu, "<this>");
        return menu.size() != 0;
    }

    @g
    public static final Iterator<MenuItem> i(@g Menu menu) {
        l0.p(menu, "<this>");
        return new b(menu);
    }

    public static final void j(@g Menu menu, @g MenuItem menuItem) {
        l0.p(menu, "<this>");
        l0.p(menuItem, "item");
        menu.removeItem(menuItem.getItemId());
    }
}
