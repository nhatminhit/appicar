package vj;

import aj.a;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qj.a;
import vn.icar.entertaiment.view.activity.HomeActivity;
import vn.icar.entertaiment.view.fragment.YoutubeFragment;
import xi.a;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public HomeActivity f23708a;

    /* renamed from: b  reason: collision with root package name */
    public Context f23709b;

    /* renamed from: c  reason: collision with root package name */
    public zi.a f23710c;

    /* renamed from: d  reason: collision with root package name */
    public uj.a f23711d;

    public a(HomeActivity homeActivity, zi.a aVar, uj.a aVar2) {
        this.f23708a = homeActivity;
        this.f23710c = aVar;
        this.f23709b = homeActivity;
        this.f23711d = aVar2;
    }

    public void a(List<a.C0490a> list) {
        ArrayList<a.C0490a> arrayList;
        ui.a.b().f23412o.clear();
        ui.a.b().f23416s.clear();
        ui.a.b().f23415r.clear();
        ui.a.b().f23417t.clear();
        ui.a.b().f23413p.clear();
        ui.a.b().f23414q.clear();
        for (a.C0490a next : list) {
            String a10 = next.a();
            a10.hashCode();
            char c10 = 65535;
            switch (a10.hashCode()) {
                case 98260:
                    if (a10.equals(a.e.f16178j)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 106182:
                    if (a10.equals(a.e.f16177i)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3377875:
                    if (a10.equals(a.e.f16176h)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109770997:
                    if (a10.equals(a.e.f16174f)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 926934164:
                    if (a10.equals(a.e.f16175g)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 1359515147:
                    if (a10.equals(a.e.f16173e)) {
                        c10 = 5;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    arrayList = ui.a.b().f23414q;
                    break;
                case 1:
                    arrayList = ui.a.b().f23413p;
                    break;
                case 2:
                    arrayList = ui.a.b().f23417t;
                    break;
                case 3:
                    arrayList = ui.a.b().f23416s;
                    break;
                case 4:
                    arrayList = ui.a.b().f23415r;
                    break;
                case 5:
                    arrayList = ui.a.b().f23412o;
                    break;
            }
            arrayList.add(next);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r8 = this;
            ui.a r0 = ui.a.b()
            java.util.ArrayList<java.lang.String> r0 = r0.f23406i
            int r0 = r0.size()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x002f
            ui.a r0 = ui.a.b()
            rj.b0 r0 = r0.f23403f
            rj.y r3 = new rj.y
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23412o
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
        L_0x0029:
            android.content.Context r4 = r8.f23709b
            r0.d(r3, r4)
            goto L_0x0091
        L_0x002f:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<xi.a$a> r0 = r0.f23412o
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L_0x003a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0068
            java.lang.Object r4 = r0.next()
            xi.a$a r4 = (xi.a.C0490a) r4
            ui.a r5 = ui.a.b()
            java.util.ArrayList<java.lang.String> r5 = r5.f23406i
            java.util.Iterator r5 = r5.iterator()
        L_0x0050:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x003a
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r4.d()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0050
            r3 = r1
            goto L_0x003a
        L_0x0068:
            if (r3 != 0) goto L_0x0091
            ui.a r0 = ui.a.b()
            rj.b0 r0 = r0.f23403f
            android.content.Context r3 = r8.f23709b
            r0.a(r3)
            ui.a r0 = ui.a.b()
            rj.b0 r0 = r0.f23403f
            rj.y r3 = new rj.y
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23411n
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
            goto L_0x0029
        L_0x0091:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<java.lang.String> r0 = r0.f23407j
            int r0 = r0.size()
            if (r0 != 0) goto L_0x00be
            ui.a r0 = ui.a.b()
            rj.f0 r0 = r0.f23404g
            rj.c0 r3 = new rj.c0
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23416s
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
        L_0x00b8:
            android.content.Context r4 = r8.f23709b
            r0.d(r3, r4)
            goto L_0x0120
        L_0x00be:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<xi.a$a> r0 = r0.f23416s
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L_0x00c9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00f7
            java.lang.Object r4 = r0.next()
            xi.a$a r4 = (xi.a.C0490a) r4
            ui.a r5 = ui.a.b()
            java.util.ArrayList<java.lang.String> r5 = r5.f23407j
            java.util.Iterator r5 = r5.iterator()
        L_0x00df:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00c9
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r4.d()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x00df
            r3 = r1
            goto L_0x00c9
        L_0x00f7:
            if (r3 != 0) goto L_0x0120
            ui.a r0 = ui.a.b()
            rj.f0 r0 = r0.f23404g
            android.content.Context r3 = r8.f23709b
            r0.a(r3)
            ui.a r0 = ui.a.b()
            rj.f0 r0 = r0.f23404g
            rj.c0 r3 = new rj.c0
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23416s
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
            goto L_0x00b8
        L_0x0120:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<java.lang.String> r0 = r0.f23408k
            int r0 = r0.size()
            if (r0 != 0) goto L_0x014d
            ui.a r0 = ui.a.b()
            rj.h r0 = r0.f23400c
            rj.e r3 = new rj.e
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23415r
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
        L_0x0147:
            android.content.Context r4 = r8.f23709b
            r0.d(r3, r4)
            goto L_0x01af
        L_0x014d:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<xi.a$a> r0 = r0.f23415r
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L_0x0158:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0186
            java.lang.Object r4 = r0.next()
            xi.a$a r4 = (xi.a.C0490a) r4
            ui.a r5 = ui.a.b()
            java.util.ArrayList<java.lang.String> r5 = r5.f23408k
            java.util.Iterator r5 = r5.iterator()
        L_0x016e:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0158
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r4.d()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x016e
            r3 = r1
            goto L_0x0158
        L_0x0186:
            if (r3 != 0) goto L_0x01af
            ui.a r0 = ui.a.b()
            rj.h r0 = r0.f23400c
            android.content.Context r3 = r8.f23709b
            r0.a(r3)
            ui.a r0 = ui.a.b()
            rj.h r0 = r0.f23400c
            rj.e r3 = new rj.e
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23415r
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
            goto L_0x0147
        L_0x01af:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<java.lang.String> r0 = r0.f23409l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x01dc
            ui.a r0 = ui.a.b()
            rj.t r0 = r0.f23402e
            rj.q r3 = new rj.q
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23417t
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
        L_0x01d6:
            android.content.Context r4 = r8.f23709b
            r0.d(r3, r4)
            goto L_0x023e
        L_0x01dc:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<xi.a$a> r0 = r0.f23417t
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L_0x01e7:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0215
            java.lang.Object r4 = r0.next()
            xi.a$a r4 = (xi.a.C0490a) r4
            ui.a r5 = ui.a.b()
            java.util.ArrayList<java.lang.String> r5 = r5.f23409l
            java.util.Iterator r5 = r5.iterator()
        L_0x01fd:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01e7
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r4.d()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x01fd
            r3 = r1
            goto L_0x01e7
        L_0x0215:
            if (r3 != 0) goto L_0x023e
            ui.a r0 = ui.a.b()
            rj.t r0 = r0.f23402e
            android.content.Context r3 = r8.f23709b
            r0.a(r3)
            ui.a r0 = ui.a.b()
            rj.t r0 = r0.f23402e
            rj.q r3 = new rj.q
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23417t
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
            goto L_0x01d6
        L_0x023e:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<java.lang.String> r0 = r0.f23405h
            int r0 = r0.size()
            if (r0 != 0) goto L_0x026b
            ui.a r0 = ui.a.b()
            rj.l r0 = r0.f23401d
            rj.i r3 = new rj.i
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23413p
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
        L_0x0265:
            android.content.Context r4 = r8.f23709b
            r0.d(r3, r4)
            goto L_0x02cd
        L_0x026b:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<xi.a$a> r0 = r0.f23413p
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L_0x0276:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x02a4
            java.lang.Object r4 = r0.next()
            xi.a$a r4 = (xi.a.C0490a) r4
            ui.a r5 = ui.a.b()
            java.util.ArrayList<java.lang.String> r5 = r5.f23405h
            java.util.Iterator r5 = r5.iterator()
        L_0x028c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0276
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r4.d()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x028c
            r3 = r1
            goto L_0x0276
        L_0x02a4:
            if (r3 != 0) goto L_0x02cd
            ui.a r0 = ui.a.b()
            rj.l r0 = r0.f23401d
            android.content.Context r3 = r8.f23709b
            r0.a(r3)
            ui.a r0 = ui.a.b()
            rj.l r0 = r0.f23401d
            rj.i r3 = new rj.i
            ui.a r4 = ui.a.b()
            java.util.ArrayList<xi.a$a> r4 = r4.f23413p
            java.lang.Object r4 = r4.get(r2)
            xi.a$a r4 = (xi.a.C0490a) r4
            java.lang.String r4 = r4.d()
            r3.<init>(r4)
            goto L_0x0265
        L_0x02cd:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<java.lang.String> r0 = r0.f23410m
            int r0 = r0.size()
            if (r0 != 0) goto L_0x02fa
            ui.a r0 = ui.a.b()
            rj.d r0 = r0.f23399b
            rj.a r1 = new rj.a
            ui.a r3 = ui.a.b()
            java.util.ArrayList<xi.a$a> r3 = r3.f23414q
            java.lang.Object r2 = r3.get(r2)
            xi.a$a r2 = (xi.a.C0490a) r2
            java.lang.String r2 = r2.d()
            r1.<init>(r2)
        L_0x02f4:
            android.content.Context r2 = r8.f23709b
            r0.d(r1, r2)
            goto L_0x035c
        L_0x02fa:
            ui.a r0 = ui.a.b()
            java.util.ArrayList<xi.a$a> r0 = r0.f23414q
            java.util.Iterator r0 = r0.iterator()
            r3 = r2
        L_0x0305:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0333
            java.lang.Object r4 = r0.next()
            xi.a$a r4 = (xi.a.C0490a) r4
            ui.a r5 = ui.a.b()
            java.util.ArrayList<java.lang.String> r5 = r5.f23410m
            java.util.Iterator r5 = r5.iterator()
        L_0x031b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0305
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r4.d()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x031b
            r3 = r1
            goto L_0x0305
        L_0x0333:
            if (r3 != 0) goto L_0x035c
            ui.a r0 = ui.a.b()
            rj.d r0 = r0.f23399b
            android.content.Context r1 = r8.f23709b
            r0.a(r1)
            ui.a r0 = ui.a.b()
            rj.d r0 = r0.f23399b
            rj.a r1 = new rj.a
            ui.a r3 = ui.a.b()
            java.util.ArrayList<xi.a$a> r3 = r3.f23414q
            java.lang.Object r2 = r3.get(r2)
            xi.a$a r2 = (xi.a.C0490a) r2
            java.lang.String r2 = r2.d()
            r1.<init>(r2)
            goto L_0x02f4
        L_0x035c:
            r8.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.a.b():void");
    }

    public void c(g gVar) {
        YoutubeFragment z10;
        ArrayList<String> arrayList;
        if (ui.a.b().f23398a.equals(a.e.f16173e)) {
            z10 = gVar.z();
            arrayList = ui.a.b().f23406i;
        } else if (ui.a.b().f23398a.equals(a.e.f16175g)) {
            z10 = gVar.z();
            arrayList = ui.a.b().f23408k;
        } else if (ui.a.b().f23398a.equals(a.e.f16174f)) {
            z10 = gVar.z();
            arrayList = ui.a.b().f23407j;
        } else if (ui.a.b().f23398a.equals(a.e.f16176h)) {
            z10 = gVar.z();
            arrayList = ui.a.b().f23409l;
        } else if (ui.a.b().f23398a.equals(a.e.f16177i)) {
            z10 = gVar.z();
            arrayList = ui.a.b().f23405h;
        } else if (ui.a.b().f23398a.equals(a.e.f16178j)) {
            z10 = gVar.z();
            arrayList = ui.a.b().f23410m;
        } else {
            return;
        }
        z10.c1(arrayList);
    }

    public void d() {
        ui.a.b().f23410m.clear();
        ui.a.b().f23405h.clear();
        ui.a.b().f23408k.clear();
        ui.a.b().f23409l.clear();
        ui.a.b().f23407j.clear();
        ui.a.b().f23406i.clear();
        ui.a.b().f23410m.addAll(ui.a.b().f23399b.c(this.f23709b));
        ui.a.b().f23405h.addAll(ui.a.b().f23401d.c(this.f23709b));
        ui.a.b().f23408k.addAll(ui.a.b().f23400c.c(this.f23709b));
        ui.a.b().f23409l.addAll(ui.a.b().f23402e.c(this.f23709b));
        ui.a.b().f23407j.addAll(ui.a.b().f23404g.c(this.f23709b));
        ui.a.b().f23406i.addAll(ui.a.b().f23403f.c(this.f23709b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(boolean r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r9 == 0) goto L_0x0010
            ui.a r1 = ui.a.b()
            java.util.ArrayList<xi.a$a> r1 = r1.f23418u
            r1.clear()
        L_0x0010:
            ui.a r1 = ui.a.b()
            java.lang.String r1 = r1.f23398a
            java.lang.String r2 = "review_film"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003a
            if (r9 == 0) goto L_0x002f
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23418u
            ui.a r1 = ui.a.b()
            java.util.ArrayList<xi.a$a> r1 = r1.f23412o
            r9.addAll(r1)
        L_0x002f:
            ui.a r9 = ui.a.b()
            java.util.ArrayList<java.lang.String> r9 = r9.f23406i
        L_0x0035:
            r0.addAll(r9)
            goto L_0x00fa
        L_0x003a:
            ui.a r1 = ui.a.b()
            java.lang.String r1 = r1.f23398a
            java.lang.String r2 = "history"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0060
            if (r9 == 0) goto L_0x0059
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23418u
            ui.a r1 = ui.a.b()
            java.util.ArrayList<xi.a$a> r1 = r1.f23415r
            r9.addAll(r1)
        L_0x0059:
            ui.a r9 = ui.a.b()
            java.util.ArrayList<java.lang.String> r9 = r9.f23408k
            goto L_0x0035
        L_0x0060:
            ui.a r1 = ui.a.b()
            java.lang.String r1 = r1.f23398a
            java.lang.String r2 = "story"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0086
            if (r9 == 0) goto L_0x007f
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23418u
            ui.a r1 = ui.a.b()
            java.util.ArrayList<xi.a$a> r1 = r1.f23416s
            r9.addAll(r1)
        L_0x007f:
            ui.a r9 = ui.a.b()
            java.util.ArrayList<java.lang.String> r9 = r9.f23407j
            goto L_0x0035
        L_0x0086:
            ui.a r1 = ui.a.b()
            java.lang.String r1 = r1.f23398a
            java.lang.String r2 = "news"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00ac
            if (r9 == 0) goto L_0x00a5
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23418u
            ui.a r1 = ui.a.b()
            java.util.ArrayList<xi.a$a> r1 = r1.f23417t
            r9.addAll(r1)
        L_0x00a5:
            ui.a r9 = ui.a.b()
            java.util.ArrayList<java.lang.String> r9 = r9.f23409l
            goto L_0x0035
        L_0x00ac:
            ui.a r1 = ui.a.b()
            java.lang.String r1 = r1.f23398a
            java.lang.String r2 = "kid"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00d3
            if (r9 == 0) goto L_0x00cb
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23418u
            ui.a r1 = ui.a.b()
            java.util.ArrayList<xi.a$a> r1 = r1.f23413p
            r9.addAll(r1)
        L_0x00cb:
            ui.a r9 = ui.a.b()
            java.util.ArrayList<java.lang.String> r9 = r9.f23405h
            goto L_0x0035
        L_0x00d3:
            ui.a r1 = ui.a.b()
            java.lang.String r1 = r1.f23398a
            java.lang.String r2 = "car"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x00fa
            if (r9 == 0) goto L_0x00f2
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23418u
            ui.a r1 = ui.a.b()
            java.util.ArrayList<xi.a$a> r1 = r1.f23414q
            r9.addAll(r1)
        L_0x00f2:
            ui.a r9 = ui.a.b()
            java.util.ArrayList<java.lang.String> r9 = r9.f23410m
            goto L_0x0035
        L_0x00fa:
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23418u
            java.util.Iterator r9 = r9.iterator()
            r1 = 0
            r2 = r1
        L_0x0106:
            boolean r3 = r9.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0150
            java.lang.Object r3 = r9.next()
            xi.a$a r3 = (xi.a.C0490a) r3
            java.util.Iterator r5 = r0.iterator()
        L_0x0117:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x014d
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r3.d()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x013d
            ui.a r3 = ui.a.b()
            java.util.ArrayList<xi.a$a> r3 = r3.f23418u
            java.lang.Object r3 = r3.get(r2)
            xi.a$a r3 = (xi.a.C0490a) r3
            r3.r(r4)
            goto L_0x014d
        L_0x013d:
            ui.a r6 = ui.a.b()
            java.util.ArrayList<xi.a$a> r6 = r6.f23418u
            java.lang.Object r6 = r6.get(r2)
            xi.a$a r6 = (xi.a.C0490a) r6
            r6.r(r1)
            goto L_0x0117
        L_0x014d:
            int r2 = r2 + 1
            goto L_0x0106
        L_0x0150:
            ui.a r9 = ui.a.b()
            r9.f23419v = r1
            ui.a r9 = ui.a.b()
            java.util.ArrayList<xi.a$a> r9 = r9.f23411n
            java.util.Iterator r9 = r9.iterator()
            r2 = r1
        L_0x0161:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x01b3
            java.lang.Object r3 = r9.next()
            xi.a$a r3 = (xi.a.C0490a) r3
            java.util.Iterator r5 = r0.iterator()
        L_0x0171:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01b0
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r3.d()
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x01a0
            ui.a r3 = ui.a.b()
            java.util.ArrayList<xi.a$a> r3 = r3.f23411n
            java.lang.Object r3 = r3.get(r2)
            xi.a$a r3 = (xi.a.C0490a) r3
            r3.r(r4)
            ui.a r3 = ui.a.b()
            int r5 = r3.f23419v
            int r5 = r5 + r4
            r3.f23419v = r5
            goto L_0x01b0
        L_0x01a0:
            ui.a r6 = ui.a.b()
            java.util.ArrayList<xi.a$a> r6 = r6.f23411n
            java.lang.Object r6 = r6.get(r2)
            xi.a$a r6 = (xi.a.C0490a) r6
            r6.r(r1)
            goto L_0x0171
        L_0x01b0:
            int r2 = r2 + 1
            goto L_0x0161
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.a.e(boolean):void");
    }

    public void f() {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<a.C0490a> it = ui.a.b().f23418u.iterator();
            while (it.hasNext()) {
                a.C0490a next = it.next();
                a.C0395a.C0396a aVar = new a.C0395a.C0396a();
                aVar.setName(next.f());
                aVar.setId(next.d());
                aVar.setThumb(next.h());
                aVar.setCategory(next.a());
                aVar.setSelected(next.j());
                arrayList.add(aVar);
            }
            kj.a.j(this.f23709b).l(new a.C0395a("channels", false, (List<a.C0395a.b>) null, arrayList));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r2 == 0) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r2 == 1) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r2 == 2) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r2 == 3) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r2 == 4) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r2 == 5) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        ui.a.b().f23399b.a(r1.f23709b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0078, code lost:
        ui.a.b().f23401d.a(r1.f23709b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        ui.a.b().f23402e.a(r1.f23709b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        ui.a.b().f23404g.a(r1.f23709b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        ui.a.b().f23400c.a(r1.f23709b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a8, code lost:
        ui.a.b().f23403f.a(r1.f23709b);
     */
    @android.annotation.SuppressLint({"NotifyDataSetChanged"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g(org.json.JSONArray r17, vj.g r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            int r2 = r17.length()     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r3 = "review_film"
            java.lang.String r4 = "history"
            java.lang.String r5 = "story"
            java.lang.String r6 = "news"
            java.lang.String r7 = "kid"
            java.lang.String r8 = "car"
            r9 = 0
            r10 = 1
            java.lang.String r11 = "category"
            if (r2 <= 0) goto L_0x00b3
            org.json.JSONObject r2 = r0.getJSONObject(r9)     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r2 = r2.getString(r11)     // Catch:{ JSONException -> 0x01a4 }
            int r13 = r2.hashCode()     // Catch:{ JSONException -> 0x01a4 }
            r14 = 5
            r15 = 4
            r9 = 3
            r12 = 2
            switch(r13) {
                case 98260: goto L_0x0056;
                case 106182: goto L_0x004e;
                case 3377875: goto L_0x0046;
                case 109770997: goto L_0x003e;
                case 926934164: goto L_0x0036;
                case 1359515147: goto L_0x002e;
                default: goto L_0x002d;
            }     // Catch:{ JSONException -> 0x01a4 }
        L_0x002d:
            goto L_0x005e
        L_0x002e:
            boolean r2 = r2.equals(r3)     // Catch:{ JSONException -> 0x01a4 }
            if (r2 == 0) goto L_0x005e
            r2 = 0
            goto L_0x005f
        L_0x0036:
            boolean r2 = r2.equals(r4)     // Catch:{ JSONException -> 0x01a4 }
            if (r2 == 0) goto L_0x005e
            r2 = r10
            goto L_0x005f
        L_0x003e:
            boolean r2 = r2.equals(r5)     // Catch:{ JSONException -> 0x01a4 }
            if (r2 == 0) goto L_0x005e
            r2 = r12
            goto L_0x005f
        L_0x0046:
            boolean r2 = r2.equals(r6)     // Catch:{ JSONException -> 0x01a4 }
            if (r2 == 0) goto L_0x005e
            r2 = r9
            goto L_0x005f
        L_0x004e:
            boolean r2 = r2.equals(r7)     // Catch:{ JSONException -> 0x01a4 }
            if (r2 == 0) goto L_0x005e
            r2 = r15
            goto L_0x005f
        L_0x0056:
            boolean r2 = r2.equals(r8)     // Catch:{ JSONException -> 0x01a4 }
            if (r2 == 0) goto L_0x005e
            r2 = r14
            goto L_0x005f
        L_0x005e:
            r2 = -1
        L_0x005f:
            if (r2 == 0) goto L_0x00a8
            if (r2 == r10) goto L_0x009c
            if (r2 == r12) goto L_0x0090
            if (r2 == r9) goto L_0x0084
            if (r2 == r15) goto L_0x0078
            if (r2 == r14) goto L_0x006c
            goto L_0x00b3
        L_0x006c:
            ui.a r2 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.d r2 = r2.f23399b     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r9 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r2.a(r9)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x00b3
        L_0x0078:
            ui.a r2 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.l r2 = r2.f23401d     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r9 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r2.a(r9)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x00b3
        L_0x0084:
            ui.a r2 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.t r2 = r2.f23402e     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r9 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r2.a(r9)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x00b3
        L_0x0090:
            ui.a r2 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.f0 r2 = r2.f23404g     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r9 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r2.a(r9)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x00b3
        L_0x009c:
            ui.a r2 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.h r2 = r2.f23400c     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r9 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r2.a(r9)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x00b3
        L_0x00a8:
            ui.a r2 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.b0 r2 = r2.f23403f     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r9 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r2.a(r9)     // Catch:{ JSONException -> 0x01a4 }
        L_0x00b3:
            r9 = 0
        L_0x00b4:
            int r2 = r17.length()     // Catch:{ JSONException -> 0x01a4 }
            if (r9 >= r2) goto L_0x0187
            org.json.JSONObject r2 = r0.getJSONObject(r9)     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r12 = "selected"
            boolean r12 = r2.getBoolean(r12)     // Catch:{ JSONException -> 0x01a4 }
            if (r12 == 0) goto L_0x0183
            java.lang.String r12 = r2.getString(r11)     // Catch:{ JSONException -> 0x01a4 }
            boolean r12 = r12.equals(r3)     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r13 = "id"
            if (r12 == 0) goto L_0x00e8
            ui.a r12 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.b0 r12 = r12.f23403f     // Catch:{ JSONException -> 0x01a4 }
            rj.y r14 = new rj.y     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r2 = r2.getString(r13)     // Catch:{ JSONException -> 0x01a4 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r2 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r12.d(r14, r2)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x0183
        L_0x00e8:
            java.lang.String r12 = r2.getString(r11)     // Catch:{ JSONException -> 0x01a4 }
            boolean r12 = r12.equals(r4)     // Catch:{ JSONException -> 0x01a4 }
            if (r12 == 0) goto L_0x0108
            ui.a r12 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.h r12 = r12.f23400c     // Catch:{ JSONException -> 0x01a4 }
            rj.e r14 = new rj.e     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r2 = r2.getString(r13)     // Catch:{ JSONException -> 0x01a4 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r2 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r12.d(r14, r2)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x0183
        L_0x0108:
            java.lang.String r12 = r2.getString(r11)     // Catch:{ JSONException -> 0x01a4 }
            boolean r12 = r12.equals(r5)     // Catch:{ JSONException -> 0x01a4 }
            if (r12 == 0) goto L_0x0127
            ui.a r12 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.f0 r12 = r12.f23404g     // Catch:{ JSONException -> 0x01a4 }
            rj.c0 r14 = new rj.c0     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r2 = r2.getString(r13)     // Catch:{ JSONException -> 0x01a4 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r2 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r12.d(r14, r2)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x0183
        L_0x0127:
            java.lang.String r12 = r2.getString(r11)     // Catch:{ JSONException -> 0x01a4 }
            boolean r12 = r12.equals(r6)     // Catch:{ JSONException -> 0x01a4 }
            if (r12 == 0) goto L_0x0146
            ui.a r12 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.t r12 = r12.f23402e     // Catch:{ JSONException -> 0x01a4 }
            rj.q r14 = new rj.q     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r2 = r2.getString(r13)     // Catch:{ JSONException -> 0x01a4 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r2 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r12.d(r14, r2)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x0183
        L_0x0146:
            java.lang.String r12 = r2.getString(r11)     // Catch:{ JSONException -> 0x01a4 }
            boolean r12 = r12.equals(r7)     // Catch:{ JSONException -> 0x01a4 }
            if (r12 == 0) goto L_0x0165
            ui.a r12 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.l r12 = r12.f23401d     // Catch:{ JSONException -> 0x01a4 }
            rj.i r14 = new rj.i     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r2 = r2.getString(r13)     // Catch:{ JSONException -> 0x01a4 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r2 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r12.d(r14, r2)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x0183
        L_0x0165:
            java.lang.String r12 = r2.getString(r11)     // Catch:{ JSONException -> 0x01a4 }
            boolean r12 = r12.equals(r8)     // Catch:{ JSONException -> 0x01a4 }
            if (r12 == 0) goto L_0x0183
            ui.a r12 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            rj.d r12 = r12.f23399b     // Catch:{ JSONException -> 0x01a4 }
            rj.a r14 = new rj.a     // Catch:{ JSONException -> 0x01a4 }
            java.lang.String r2 = r2.getString(r13)     // Catch:{ JSONException -> 0x01a4 }
            r14.<init>(r2)     // Catch:{ JSONException -> 0x01a4 }
            android.content.Context r2 = r1.f23709b     // Catch:{ JSONException -> 0x01a4 }
            r12.d(r14, r2)     // Catch:{ JSONException -> 0x01a4 }
        L_0x0183:
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x0187:
            r16.d()     // Catch:{ JSONException -> 0x01a4 }
            r1.e(r10)     // Catch:{ JSONException -> 0x01a4 }
            ui.a r0 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            oi.a r0 = r0.H     // Catch:{ JSONException -> 0x01a4 }
            if (r0 == 0) goto L_0x019e
            ui.a r0 = ui.a.b()     // Catch:{ JSONException -> 0x01a4 }
            oi.a r0 = r0.H     // Catch:{ JSONException -> 0x01a4 }
            r0.j()     // Catch:{ JSONException -> 0x01a4 }
        L_0x019e:
            r0 = r18
            r1.c(r0)     // Catch:{ JSONException -> 0x01a4 }
            goto L_0x01a8
        L_0x01a4:
            r0 = move-exception
            r0.printStackTrace()
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vj.a.g(org.json.JSONArray, vj.g):void");
    }
}
