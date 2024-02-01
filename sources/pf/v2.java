package pf;

import fh.g;
import fh.h;
import ie.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import le.f;
import p000if.o;
import p000if.q;
import pf.n2;
import we.l;
import we.p;
import wf.j0;
import wf.x;
import wf.y;
import xe.l0;
import xe.w;
import zd.f1;
import zd.k;
import zd.m;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006Ï\u0001Ð\u0001´\u0001B\u0012\u0012\u0007\u0010Ì\u0001\u001a\u00020\u001b¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u0013\u0010@\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bF\u0010CJ\u0019\u0010G\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bG\u0010HJ\u001f\u0010I\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ#\u0010M\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bP\u0010QJ*\u0010S\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010R\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0010¢\u0006\u0004\bS\u0010TJ)\u0010V\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010U\u001a\u00020O2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bV\u0010WJ\u0015\u0010Y\u001a\u0004\u0018\u00010O*\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020[2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\\\u0010]J\u0015\u0010^\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0004\b^\u0010AJ\u0019\u0010`\u001a\u00020\u00072\b\u0010_\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\b`\u0010aJ\r\u0010b\u001a\u00020\u001b¢\u0006\u0004\bb\u0010?J\u000f\u0010c\u001a\u00020\u0007H\u0014¢\u0006\u0004\bc\u0010dJ\u0011\u0010g\u001a\u00060ej\u0002`f¢\u0006\u0004\bg\u0010hJ#\u0010j\u001a\u00060ej\u0002`f*\u00020\u00122\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[H\u0004¢\u0006\u0004\bj\u0010kJ6\u0010m\u001a\u00020l2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bm\u0010nJF\u0010p\u001a\u00020l2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010o\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bp\u0010qJ\u0013\u0010r\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\br\u0010AJB\u0010w\u001a\u00020\u0007\"\u0004\b\u0000\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000v\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005ø\u0001\u0000¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\by\u0010=J\u001f\u0010z\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010ej\u0004\u0018\u0001`fH\u0016¢\u0006\u0004\bz\u0010{J\u000f\u0010|\u001a\u00020[H\u0014¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b~\u0010&J\u0018\u0010\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0001\u0010\u0001J\u0019\u0010\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0001\u0010&J\u0019\u0010\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0005\b\u0001\u0010&J\u001c\u0010\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J,\u0010\u0001\u001a\u00030\u00012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010[2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\b¢\u0006\u0006\b\u0001\u0010\u0001J\u0015\u0010\u0001\u001a\u00060ej\u0002`fH\u0016¢\u0006\u0005\b\u0001\u0010hJ\u001c\u0010\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u001d\u0010\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u0001\u0010CJ\u0019\u0010\u0001\u001a\u00030\u00012\u0006\u0010R\u001a\u00020\u0002¢\u0006\u0006\b\u0001\u0010\u0001J\u001b\u0010\u0001\u001a\u00020\u00072\u0007\u0010\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001a\u0010\u0001\u001a\u00020\u001b2\u0007\u0010\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\b\u0001\u0010&J\u001c\u0010\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020[H\u0016¢\u0006\u0005\b\u0001\u0010}J\u0011\u0010\u0001\u001a\u00020[H\u0007¢\u0006\u0005\b\u0001\u0010}J\u0011\u0010\u0001\u001a\u00020[H\u0010¢\u0006\u0005\b\u0001\u0010}J\u0012\u0010\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u0001\u0010\u0001J\u0014\u0010\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0001\u0010\u0001J\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0006H@ø\u0001\u0000¢\u0006\u0005\b\u0001\u0010AJT\u0010¡\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JT\u0010£\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010s2\f\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00010t2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010v\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000ø\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¢\u0001R\u001e\u0010¥\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068BX\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010ER\u001b\u0010¨\u0001\u001a\u00020\u001b*\u00020\u00198BX\u0004¢\u0006\b\u001a\u0006\b¦\u0001\u0010§\u0001R\u0019\u0010¬\u0001\u001a\u0007\u0012\u0002\b\u00030©\u00018F¢\u0006\b\u001a\u0006\bª\u0001\u0010«\u0001R0\u0010²\u0001\u001a\u0005\u0018\u00010\u00012\n\u0010­\u0001\u001a\u0005\u0018\u00010\u00018@@@X\u000e¢\u0006\u0010\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068@X\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u0001R\u0016\u0010µ\u0001\u001a\u00020\u001b8VX\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010?R\u0013\u0010·\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010?R\u0013\u0010¸\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010?R\u0019\u0010º\u0001\u001a\u0004\u0018\u00010\u00128DX\u0004¢\u0006\b\u001a\u0006\b¹\u0001\u0010\u0001R\u0016\u0010¼\u0001\u001a\u00020\u001b8DX\u0004¢\u0006\u0007\u001a\u0005\b»\u0001\u0010?R\u0014\u0010¿\u0001\u001a\u00020\u00048F¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001R\u0016\u0010Á\u0001\u001a\u00020\u001b8PX\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010?R\u001b\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010Â\u00018F¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001R\u0016\u0010Ç\u0001\u001a\u00020\u001b8TX\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010?R\u0016\u0010É\u0001\u001a\u00020\u001b8PX\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010?R\u0013\u0010Ë\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bÊ\u0001\u0010?\u0002\u0004\n\u0002\b\u0019¨\u0006Ñ\u0001"}, d2 = {"Lpf/v2;", "Lpf/n2;", "Lpf/y;", "Lpf/f3;", "Lzf/c;", "Lkotlin/Function1;", "", "Lzd/u2;", "block", "", "S0", "(Lwe/l;)Ljava/lang/Void;", "Lpf/v2$c;", "state", "proposedUpdate", "x0", "(Lpf/v2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "E0", "(Lpf/v2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "d0", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lpf/g2;", "update", "", "y1", "(Lpf/g2;Ljava/lang/Object;)Z", "r0", "(Lpf/g2;Ljava/lang/Object;)V", "Lpf/a3;", "list", "cause", "c1", "(Lpf/a3;Ljava/lang/Throwable;)V", "o0", "(Ljava/lang/Throwable;)Z", "d1", "Lpf/u2;", "T", "e1", "", "t1", "(Ljava/lang/Object;)I", "Lzd/v0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Y0", "(Lwe/l;Z)Lpf/u2;", "expect", "node", "c0", "(Ljava/lang/Object;Lpf/a3;Lpf/u2;)Z", "Lpf/s1;", "l1", "(Lpf/s1;)V", "n1", "(Lpf/u2;)V", "Q0", "()Z", "R0", "(Lie/d;)Ljava/lang/Object;", "n0", "(Ljava/lang/Object;)Ljava/lang/Object;", "u0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "U0", "H0", "(Lpf/g2;)Lpf/a3;", "z1", "(Lpf/g2;Ljava/lang/Throwable;)Z", "B1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "C1", "(Lpf/g2;Ljava/lang/Object;)Ljava/lang/Object;", "Lpf/x;", "y0", "(Lpf/g2;)Lpf/x;", "child", "D1", "(Lpf/v2$c;Lpf/x;Ljava/lang/Object;)Z", "lastChild", "s0", "(Lpf/v2$c;Lpf/x;Ljava/lang/Object;)V", "Lwf/y;", "b1", "(Lwf/y;)Lpf/x;", "", "u1", "(Ljava/lang/Object;)Ljava/lang/String;", "h0", "parent", "M0", "(Lpf/n2;)V", "start", "k1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "k0", "()Ljava/util/concurrent/CancellationException;", "message", "v1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lpf/p1;", "A", "(Lwe/l;)Lpf/p1;", "invokeImmediately", "e0", "(ZZLwe/l;)Lpf/p1;", "L1", "R", "Lzf/f;", "select", "Lie/d;", "M", "(Lzf/f;Lwe/l;)V", "p1", "h", "(Ljava/util/concurrent/CancellationException;)V", "p0", "()Ljava/lang/String;", "f", "l0", "(Ljava/lang/Throwable;)V", "parentJob", "m0", "(Lpf/f3;)V", "q0", "i0", "j0", "(Ljava/lang/Object;)Z", "Lpf/o2;", "v0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lpf/o2;", "r1", "V0", "W0", "Lpf/w;", "A1", "(Lpf/y;)Lpf/w;", "exception", "L0", "i1", "K0", "j1", "(Ljava/lang/Object;)V", "f0", "toString", "x1", "a1", "Q", "()Ljava/lang/Throwable;", "A0", "()Ljava/lang/Object;", "g0", "Lkotlin/Function2;", "o1", "(Lzf/f;Lwe/p;)V", "q1", "D0", "exceptionOrNull", "N0", "(Lpf/g2;)Z", "isCancelling", "Lie/g$c;", "getKey", "()Lie/g$c;", "key", "value", "I0", "()Lpf/w;", "s1", "(Lpf/w;)V", "parentHandle", "J0", "c", "isActive", "m", "isCompleted", "isCancelled", "B0", "completionCause", "C0", "completionCauseHandled", "f1", "()Lzf/c;", "onJoin", "G0", "onCancelComplete", "Lif/m;", "P", "()Lif/m;", "children", "P0", "isScopedCoroutine", "F0", "handlesException", "O0", "isCompletedExceptionally", "active", "<init>", "(Z)V", "a", "b", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@k(level = m.P, message = "This is internal API and may be removed in the future releases")
public class v2 implements n2, y, f3, zf.c {
    public static final /* synthetic */ AtomicReferenceFieldUpdater O = AtomicReferenceFieldUpdater.newUpdater(v2.class, Object.class, "_state");
    @g
    private volatile /* synthetic */ Object _parentHandle;
    @g
    private volatile /* synthetic */ Object _state;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lpf/v2$a;", "T", "Lpf/r;", "Lpf/n2;", "parent", "", "y", "", "H", "Lpf/v2;", "W", "Lpf/v2;", "job", "Lie/d;", "delegate", "<init>", "(Lie/d;Lpf/v2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a<T> extends r<T> {
        @g
        public final v2 W;

        public a(@g ie.d<? super T> dVar, @g v2 v2Var) {
            super(dVar, 1);
            this.W = v2Var;
        }

        @g
        public String H() {
            return "AwaitContinuation";
        }

        @g
        public Throwable y(@g n2 n2Var) {
            Throwable e10;
            Object J0 = this.W.J0();
            return (!(J0 instanceof c) || (e10 = ((c) J0).e()) == null) ? J0 instanceof e0 ? ((e0) J0).f21998a : n2Var.k0() : e10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lpf/v2$b;", "Lpf/u2;", "", "cause", "Lzd/u2;", "X0", "Lpf/v2;", "S", "Lpf/v2;", "parent", "Lpf/v2$c;", "T", "Lpf/v2$c;", "state", "Lpf/x;", "U", "Lpf/x;", "child", "", "V", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lpf/v2;Lpf/v2$c;Lpf/x;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b extends u2 {
        @g
        public final v2 S;
        @g
        public final c T;
        @g
        public final x U;
        @h
        public final Object V;

        public b(@g v2 v2Var, @g c cVar, @g x xVar, @h Object obj) {
            this.S = v2Var;
            this.T = cVar;
            this.U = xVar;
            this.V = obj;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            X0((Throwable) obj);
            return u2.f25116a;
        }

        public void X0(@h Throwable th2) {
            this.S.s0(this.T, this.U, this.V);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010 \u001a\u00020\u001a\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b0\u00101J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0010j\b\u0012\u0004\u0012\u00020\u0004`\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8F@FX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048F@FX\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\fR\u0011\u0010&\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0011\u0010(\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010*\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR(\u0010/\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u00018B@BX\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lpf/v2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lpf/g2;", "", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lzd/u2;", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "b", "()Ljava/util/ArrayList;", "Lpf/a3;", "O", "Lpf/a3;", "K", "()Lpf/a3;", "list", "", "value", "g", "()Z", "j", "(Z)V", "isCompleting", "e", "()Ljava/lang/Throwable;", "l", "rootCause", "h", "isSealed", "f", "isCancelling", "c", "isActive", "d", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "exceptionsHolder", "<init>", "(Lpf/a3;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class c implements g2 {
        @g
        public final a3 O;
        @g
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        @g
        private volatile /* synthetic */ int _isCompleting;
        @g
        private volatile /* synthetic */ Object _rootCause;

        public c(@g a3 a3Var, boolean z10, @h Throwable th2) {
            this.O = a3Var;
            this._isCompleting = z10 ? 1 : 0;
            this._rootCause = th2;
        }

        @g
        public a3 K() {
            return this.O;
        }

        public final void a(@g Throwable th2) {
            Throwable e10 = e();
            if (e10 == null) {
                l(th2);
            } else if (th2 != e10) {
                Object d10 = d();
                if (d10 == null) {
                    k(th2);
                } else if (d10 instanceof Throwable) {
                    if (th2 != d10) {
                        ArrayList<Throwable> b10 = b();
                        b10.add(d10);
                        b10.add(th2);
                        k(b10);
                    }
                } else if (d10 instanceof ArrayList) {
                    ((ArrayList) d10).add(th2);
                } else {
                    throw new IllegalStateException(("State is " + d10).toString());
                }
            }
        }

        public final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        public boolean c() {
            return e() == null;
        }

        public final Object d() {
            return this._exceptionsHolder;
        }

        @h
        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        public final boolean f() {
            return e() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        public final boolean g() {
            return this._isCompleting;
        }

        public final boolean h() {
            return d() == w2.f22042h;
        }

        @g
        public final List<Throwable> i(@h Throwable th2) {
            ArrayList<Throwable> arrayList;
            Object d10 = d();
            if (d10 == null) {
                arrayList = b();
            } else if (d10 instanceof Throwable) {
                ArrayList<Throwable> b10 = b();
                b10.add(d10);
                arrayList = b10;
            } else if (d10 instanceof ArrayList) {
                arrayList = (ArrayList) d10;
            } else {
                throw new IllegalStateException(("State is " + d10).toString());
            }
            Throwable e10 = e();
            if (e10 != null) {
                arrayList.add(0, e10);
            }
            if (th2 != null && !l0.g(th2, e10)) {
                arrayList.add(th2);
            }
            k(w2.f22042h);
            return arrayList;
        }

        public final void j(boolean z10) {
            this._isCompleting = z10 ? 1 : 0;
        }

        public final void k(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void l(@h Throwable th2) {
            this._rootCause = th2;
        }

        @g
        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + K() + ']';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"wf/y$f", "Lwf/y$c;", "Lwf/y;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d extends y.c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ v2 f22029d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f22030e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(y yVar, v2 v2Var, Object obj) {
            super(yVar);
            this.f22029d = v2Var;
            this.f22030e = obj;
        }

        @h
        /* renamed from: k */
        public Object i(@g y yVar) {
            if (this.f22029d.J0() == this.f22030e) {
                return null;
            }
            return x.a();
        }
    }

    @f(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {952, 954}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, d2 = {"Lif/o;", "Lpf/n2;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e extends le.k implements p<o<? super n2>, ie.d<? super u2>, Object> {
        public Object Q;
        public Object R;
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ v2 U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(v2 v2Var, ie.d<? super e> dVar) {
            super(2, dVar);
            this.U = v2Var;
        }

        @g
        public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
            e eVar = new e(this.U, dVar);
            eVar.T = obj;
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r7.S
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002b
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                java.lang.Object r1 = r7.R
                wf.y r1 = (wf.y) r1
                java.lang.Object r3 = r7.Q
                wf.w r3 = (wf.w) r3
                java.lang.Object r4 = r7.T
                if.o r4 = (p000if.o) r4
                zd.e1.n(r8)
                r8 = r7
                goto L_0x007e
            L_0x001f:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0027:
                zd.e1.n(r8)
                goto L_0x0083
            L_0x002b:
                zd.e1.n(r8)
                java.lang.Object r8 = r7.T
                if.o r8 = (p000if.o) r8
                pf.v2 r1 = r7.U
                java.lang.Object r1 = r1.J0()
                boolean r4 = r1 instanceof pf.x
                if (r4 == 0) goto L_0x0049
                pf.x r1 = (pf.x) r1
                pf.y r1 = r1.S
                r7.S = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L_0x0083
                return r0
            L_0x0049:
                boolean r3 = r1 instanceof pf.g2
                if (r3 == 0) goto L_0x0083
                pf.g2 r1 = (pf.g2) r1
                pf.a3 r1 = r1.K()
                if (r1 == 0) goto L_0x0083
                java.lang.Object r3 = r1.I0()
                wf.y r3 = (wf.y) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L_0x0060:
                boolean r5 = xe.l0.g(r1, r3)
                if (r5 != 0) goto L_0x0083
                boolean r5 = r1 instanceof pf.x
                if (r5 == 0) goto L_0x007e
                r5 = r1
                pf.x r5 = (pf.x) r5
                pf.y r5 = r5.S
                r8.T = r4
                r8.Q = r3
                r8.R = r1
                r8.S = r2
                java.lang.Object r5 = r4.a(r5, r8)
                if (r5 != r0) goto L_0x007e
                return r0
            L_0x007e:
                wf.y r1 = r1.J0()
                goto L_0x0060
            L_0x0083:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: pf.v2.e.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: N */
        public final Object g0(@g o<? super n2> oVar, @h ie.d<? super u2> dVar) {
            return ((e) H(oVar, dVar)).K(u2.f25116a);
        }
    }

    public v2(boolean z10) {
        this._state = z10 ? w2.f22044j : w2.f22043i;
        this._parentHandle = null;
    }

    private final /* synthetic */ <T extends u2> void e1(a3 a3Var, Throwable th2) {
        h0 h0Var = null;
        for (y yVar = (y) a3Var.I0(); !l0.g(yVar, a3Var); yVar = yVar.J0()) {
            l0.y(3, w1.a.X4);
            if (yVar instanceof y) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.X0(th2);
                } catch (Throwable th3) {
                    if (h0Var != null) {
                        zd.p.a(h0Var, th3);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th3);
                        u2 u2Var2 = u2.f25116a;
                    }
                }
            }
        }
        if (h0Var != null) {
            L0(h0Var);
        }
    }

    public static /* synthetic */ o2 w0(v2 v2Var, String str, Throwable th2, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            if (str == null) {
                str = v2Var.p0();
            }
            return new o2(str, th2, v2Var);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    public static /* synthetic */ CancellationException w1(v2 v2Var, Throwable th2, String str, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return v2Var.v1(th2, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    @g
    public final p1 A(@g l<? super Throwable, u2> lVar) {
        return e0(false, true, lVar);
    }

    @h
    public final Object A0() {
        Object J0 = J0();
        if (!(!(J0 instanceof g2))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(J0 instanceof e0)) {
            return w2.o(J0);
        } else {
            throw ((e0) J0).f21998a;
        }
    }

    @g
    public final w A1(@g y yVar) {
        return (w) n2.a.f(this, true, false, new x(yVar), 2, (Object) null);
    }

    @h
    public final Throwable B0() {
        Object J0 = J0();
        if (J0 instanceof c) {
            Throwable e10 = ((c) J0).e();
            if (e10 != null) {
                return e10;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (J0 instanceof g2) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (J0 instanceof e0) {
            return ((e0) J0).f21998a;
        } else {
            return null;
        }
    }

    public final Object B1(Object obj, Object obj2) {
        return !(obj instanceof g2) ? w2.f22035a : (((obj instanceof s1) || (obj instanceof u2)) && !(obj instanceof x) && !(obj2 instanceof e0)) ? y1((g2) obj, obj2) ? obj2 : w2.f22037c : C1((g2) obj, obj2);
    }

    public final boolean C0() {
        Object J0 = J0();
        return (J0 instanceof e0) && ((e0) J0).a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        r3 = (java.lang.Throwable) r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0071, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0073, code lost:
        c1(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0076, code lost:
        r9 = y0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        if (r9 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0080, code lost:
        if (D1(r1, r9, r10) == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0084, code lost:
        return pf.w2.f22036b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0089, code lost:
        return x0(r1, r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object C1(pf.g2 r9, java.lang.Object r10) {
        /*
            r8 = this;
            pf.a3 r0 = r8.H0(r9)
            if (r0 != 0) goto L_0x000b
            wf.r0 r9 = pf.w2.f22037c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof pf.v2.c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            pf.v2$c r1 = (pf.v2.c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            pf.v2$c r1 = new pf.v2$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            xe.k1$h r4 = new xe.k1$h
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.g()     // Catch:{ all -> 0x008a }
            if (r5 == 0) goto L_0x002f
            wf.r0 r9 = pf.w2.f22035a     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.j(r5)     // Catch:{ all -> 0x008a }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = O     // Catch:{ all -> 0x008a }
            boolean r6 = zd.f1.a(r6, r8, r9, r1)     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x0043
            wf.r0 r9 = pf.w2.f22037c     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = r1.f()     // Catch:{ all -> 0x008a }
            boolean r7 = r10 instanceof pf.e0     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x004f
            r7 = r10
            pf.e0 r7 = (pf.e0) r7     // Catch:{ all -> 0x008a }
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x0057
            java.lang.Throwable r7 = r7.f21998a     // Catch:{ all -> 0x008a }
            r1.a(r7)     // Catch:{ all -> 0x008a }
        L_0x0057:
            java.lang.Throwable r7 = r1.e()     // Catch:{ all -> 0x008a }
            if (r6 != 0) goto L_0x005e
            r3 = r5
        L_0x005e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x008a }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r4.O = r2     // Catch:{ all -> 0x008a }
            zd.u2 r3 = zd.u2.f25116a     // Catch:{ all -> 0x008a }
            monitor-exit(r1)
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r2 == 0) goto L_0x0076
            r8.c1(r0, r2)
        L_0x0076:
            pf.x r9 = r8.y0(r9)
            if (r9 == 0) goto L_0x0085
            boolean r9 = r8.D1(r1, r9, r10)
            if (r9 == 0) goto L_0x0085
            wf.r0 r9 = pf.w2.f22036b
            return r9
        L_0x0085:
            java.lang.Object r9 = r8.x0(r1, r10)
            return r9
        L_0x008a:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v2.C1(pf.g2, java.lang.Object):java.lang.Object");
    }

    public final Throwable D0(Object obj) {
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            return e0Var.f21998a;
        }
        return null;
    }

    public final boolean D1(c cVar, x xVar, Object obj) {
        while (n2.a.f(xVar.S, false, false, new b(this, cVar, xVar, obj), 1, (Object) null) == c3.O) {
            xVar = b1(xVar);
            if (xVar == null) {
                return false;
            }
        }
        return true;
    }

    public final Throwable E0(c cVar, List<? extends Throwable> list) {
        T t10;
        boolean z10;
        T t11 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (!(((Throwable) t10) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th2 = (Throwable) t10;
            if (th2 != null) {
                return th2;
            }
            Throwable th3 = (Throwable) list.get(0);
            if (th3 instanceof y3) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th4 = (Throwable) next;
                    if (th4 == th3 || !(th4 instanceof y3)) {
                        z10 = false;
                        continue;
                    } else {
                        z10 = true;
                        continue;
                    }
                    if (z10) {
                        t11 = next;
                        break;
                    }
                }
                Throwable th5 = (Throwable) t11;
                if (th5 != null) {
                    return th5;
                }
            }
            return th3;
        } else if (cVar.f()) {
            return new o2(p0(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    public boolean F0() {
        return true;
    }

    public boolean G0() {
        return false;
    }

    public final a3 H0(g2 g2Var) {
        a3 K = g2Var.K();
        if (K != null) {
            return K;
        }
        if (g2Var instanceof s1) {
            return new a3();
        }
        if (g2Var instanceof u2) {
            n1((u2) g2Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + g2Var).toString());
    }

    @h
    public final w I0() {
        return (w) this._parentHandle;
    }

    @h
    public final Object J0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof j0)) {
                return obj;
            }
            ((j0) obj).c(this);
        }
    }

    public boolean K0(@g Throwable th2) {
        return false;
    }

    public void L0(@g Throwable th2) {
        throw th2;
    }

    @h
    public final Object L1(@g ie.d<? super u2> dVar) {
        if (!Q0()) {
            r2.z(dVar.e());
            return u2.f25116a;
        }
        Object R0 = R0(dVar);
        return R0 == ke.d.h() ? R0 : u2.f25116a;
    }

    public final <R> void M(@g zf.f<? super R> fVar, @g l<? super ie.d<? super R>, ? extends Object> lVar) {
        Object J0;
        do {
            J0 = J0();
            if (!fVar.N()) {
                if (!(J0 instanceof g2)) {
                    if (fVar.F()) {
                        xf.b.c(lVar, fVar.Q());
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } while (t1(J0) != 0);
        fVar.H(A(new n3(fVar, lVar)));
    }

    public final void M0(@h n2 n2Var) {
        if (n2Var == null) {
            s1(c3.O);
            return;
        }
        n2Var.start();
        w A1 = n2Var.A1(this);
        s1(A1);
        if (m()) {
            A1.P();
            s1(c3.O);
        }
    }

    public final boolean N0(g2 g2Var) {
        return (g2Var instanceof c) && ((c) g2Var).f();
    }

    public final boolean O0() {
        return J0() instanceof e0;
    }

    @g
    public final p000if.m<n2> P() {
        return q.b(new e(this, (ie.d<? super e>) null));
    }

    public boolean P0() {
        return false;
    }

    @h
    public final Throwable Q() {
        Object J0 = J0();
        if (!(J0 instanceof g2)) {
            return D0(J0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final boolean Q0() {
        Object J0;
        do {
            J0 = J0();
            if (!(J0 instanceof g2)) {
                return false;
            }
        } while (t1(J0) < 0);
        return true;
    }

    public final Object R0(ie.d<? super u2> dVar) {
        r rVar = new r(ke.c.d(dVar), 1);
        rVar.Z();
        t.a(rVar, A(new i3(rVar)));
        Object z10 = rVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10 == ke.d.h() ? z10 : u2.f25116a;
    }

    public final Void S0(l<Object, u2> lVar) {
        while (true) {
            lVar.A(J0());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        c1(((pf.v2.c) r2).K(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return pf.w2.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object U0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.J0()
            boolean r3 = r2 instanceof pf.v2.c
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            pf.v2$c r3 = (pf.v2.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.h()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            wf.r0 r7 = pf.w2.f22038d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            pf.v2$c r3 = (pf.v2.c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.f()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.u0(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            pf.v2$c r7 = (pf.v2.c) r7     // Catch:{ all -> 0x004e }
            r7.a(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            pf.v2$c r7 = (pf.v2.c) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.e()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            pf.v2$c r2 = (pf.v2.c) r2
            pf.a3 r7 = r2.K()
            r6.c1(r7, r0)
        L_0x0049:
            wf.r0 r7 = pf.w2.f22035a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof pf.g2
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.u0(r7)
        L_0x005b:
            r3 = r2
            pf.g2 r3 = (pf.g2) r3
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.z1(r3, r1)
            if (r2 == 0) goto L_0x0002
            wf.r0 r7 = pf.w2.f22035a
            return r7
        L_0x006f:
            pf.e0 r3 = new pf.e0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.B1(r2, r3)
            wf.r0 r4 = pf.w2.f22035a
            if (r3 == r4) goto L_0x0087
            wf.r0 r2 = pf.w2.f22037c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            wf.r0 r7 = pf.w2.f22038d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v2.U0(java.lang.Object):java.lang.Object");
    }

    public final boolean V0(@h Object obj) {
        Object B1;
        do {
            B1 = B1(J0(), obj);
            if (B1 == w2.f22035a) {
                return false;
            }
            if (B1 == w2.f22036b) {
                return true;
            }
        } while (B1 == w2.f22037c);
        f0(B1);
        return true;
    }

    @h
    public final Object W0(@h Object obj) {
        Object B1;
        do {
            B1 = B1(J0(), obj);
            if (B1 == w2.f22035a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, D0(obj));
            }
        } while (B1 == w2.f22037c);
        return B1;
    }

    public final u2 Y0(l<? super Throwable, u2> lVar, boolean z10) {
        u2 u2Var = null;
        if (z10) {
            if (lVar instanceof p2) {
                u2Var = (p2) lVar;
            }
            if (u2Var == null) {
                u2Var = new l2(lVar);
            }
        } else {
            if (lVar instanceof u2) {
                u2Var = (u2) lVar;
            }
            if (u2Var == null) {
                u2Var = new m2(lVar);
            }
        }
        u2Var.Z0(this);
        return u2Var;
    }

    @g
    public String a1() {
        return z0.a(this);
    }

    public final x b1(y yVar) {
        while (yVar.N0()) {
            yVar = yVar.K0();
        }
        while (true) {
            yVar = yVar.J0();
            if (!yVar.N0()) {
                if (yVar instanceof x) {
                    return (x) yVar;
                }
                if (yVar instanceof a3) {
                    return null;
                }
            }
        }
    }

    public boolean c() {
        Object J0 = J0();
        return (J0 instanceof g2) && ((g2) J0).c();
    }

    public final boolean c0(Object obj, a3 a3Var, u2 u2Var) {
        int V0;
        d dVar = new d(u2Var, this, obj);
        do {
            V0 = a3Var.K0().V0(u2Var, a3Var, dVar);
            if (V0 == 1) {
                return true;
            }
        } while (V0 != 2);
        return false;
    }

    public final void c1(a3 a3Var, Throwable th2) {
        i1(th2);
        h0 h0Var = null;
        for (y yVar = (y) a3Var.I0(); !l0.g(yVar, a3Var); yVar = yVar.J0()) {
            if (yVar instanceof p2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.X0(th2);
                } catch (Throwable th3) {
                    if (h0Var != null) {
                        zd.p.a(h0Var, th3);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th3);
                        u2 u2Var2 = u2.f25116a;
                    }
                }
            }
        }
        if (h0Var != null) {
            L0(h0Var);
        }
        o0(th2);
    }

    @k(level = m.Q, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        h((CancellationException) null);
    }

    public final void d0(Throwable th2, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th3 : list) {
                if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                    zd.p.a(th2, th3);
                }
            }
        }
    }

    public final void d1(a3 a3Var, Throwable th2) {
        h0 h0Var = null;
        for (y yVar = (y) a3Var.I0(); !l0.g(yVar, a3Var); yVar = yVar.J0()) {
            if (yVar instanceof u2) {
                u2 u2Var = (u2) yVar;
                try {
                    u2Var.X0(th2);
                } catch (Throwable th3) {
                    if (h0Var != null) {
                        zd.p.a(h0Var, th3);
                    } else {
                        h0Var = new h0("Exception in completion handler " + u2Var + " for " + this, th3);
                        u2 u2Var2 = u2.f25116a;
                    }
                }
            }
        }
        if (h0Var != null) {
            L0(h0Var);
        }
    }

    @g
    public final p1 e0(boolean z10, boolean z11, @g l<? super Throwable, u2> lVar) {
        u2 Y0 = Y0(lVar, z10);
        while (true) {
            Object J0 = J0();
            if (J0 instanceof s1) {
                s1 s1Var = (s1) J0;
                if (!s1Var.c()) {
                    l1(s1Var);
                } else if (f1.a(O, this, J0, Y0)) {
                    return Y0;
                }
            } else {
                Throwable th2 = null;
                if (J0 instanceof g2) {
                    a3 K = ((g2) J0).K();
                    if (K != null) {
                        p1 p1Var = c3.O;
                        if (z10 && (J0 instanceof c)) {
                            synchronized (J0) {
                                th2 = ((c) J0).e();
                                if (th2 == null || ((lVar instanceof x) && !((c) J0).g())) {
                                    if (c0(J0, K, Y0)) {
                                        if (th2 == null) {
                                            return Y0;
                                        }
                                        p1Var = Y0;
                                    }
                                }
                                u2 u2Var = u2.f25116a;
                            }
                        }
                        if (th2 != null) {
                            if (z11) {
                                lVar.A(th2);
                            }
                            return p1Var;
                        } else if (c0(J0, K, Y0)) {
                            return Y0;
                        }
                    } else if (J0 != null) {
                        n1((u2) J0);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    }
                } else {
                    if (z11) {
                        e0 e0Var = J0 instanceof e0 ? (e0) J0 : null;
                        if (e0Var != null) {
                            th2 = e0Var.f21998a;
                        }
                        lVar.A(th2);
                    }
                    return c3.O;
                }
            }
        }
    }

    @k(level = m.Q, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean f(Throwable th2) {
        Throwable th3;
        if (th2 == null || (th3 = w1(this, th2, (String) null, 1, (Object) null)) == null) {
            th3 = new o2(p0(), (Throwable) null, this);
        }
        l0(th3);
        return true;
    }

    public void f0(@h Object obj) {
    }

    @g
    public final zf.c f1() {
        return this;
    }

    @h
    public <E extends g.b> E g(@fh.g g.c<E> cVar) {
        return n2.a.e(this, cVar);
    }

    @h
    public final Object g0(@fh.g ie.d<Object> dVar) {
        Object J0;
        do {
            J0 = J0();
            if (!(J0 instanceof g2)) {
                if (!(J0 instanceof e0)) {
                    return w2.o(J0);
                }
                throw ((e0) J0).f21998a;
            }
        } while (t1(J0) < 0);
        return h0(dVar);
    }

    @fh.g
    public final g.c<?> getKey() {
        return n2.D;
    }

    public void h(@h CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o2(p0(), (Throwable) null, this);
        }
        l0(cancellationException);
    }

    public final Object h0(ie.d<Object> dVar) {
        a aVar = new a(ke.c.d(dVar), this);
        aVar.Z();
        t.a(aVar, A(new h3(aVar)));
        Object z10 = aVar.z();
        if (z10 == ke.d.h()) {
            le.h.c(dVar);
        }
        return z10;
    }

    @fh.g
    public ie.g i(@fh.g g.c<?> cVar) {
        return n2.a.g(this, cVar);
    }

    public final boolean i0(@h Throwable th2) {
        return j0(th2);
    }

    public void i1(@h Throwable th2) {
    }

    public final boolean isCancelled() {
        Object J0 = J0();
        return (J0 instanceof e0) || ((J0 instanceof c) && ((c) J0).f());
    }

    public final boolean j0(@h Object obj) {
        Object a10 = w2.f22035a;
        if (G0() && (a10 = n0(obj)) == w2.f22036b) {
            return true;
        }
        if (a10 == w2.f22035a) {
            a10 = U0(obj);
        }
        if (a10 == w2.f22035a || a10 == w2.f22036b) {
            return true;
        }
        if (a10 == w2.f22038d) {
            return false;
        }
        f0(a10);
        return true;
    }

    public void j1(@h Object obj) {
    }

    @fh.g
    public final CancellationException k0() {
        Object J0 = J0();
        if (J0 instanceof c) {
            Throwable e10 = ((c) J0).e();
            if (e10 != null) {
                CancellationException v12 = v1(e10, z0.a(this) + " is cancelling");
                if (v12 != null) {
                    return v12;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (J0 instanceof g2) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (J0 instanceof e0) {
            return w1(this, ((e0) J0).f21998a, (String) null, 1, (Object) null);
        } else {
            return new o2(z0.a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    public void k1() {
    }

    public void l0(@fh.g Throwable th2) {
        j0(th2);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [pf.f2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l1(pf.s1 r3) {
        /*
            r2 = this;
            pf.a3 r0 = new pf.a3
            r0.<init>()
            boolean r1 = r3.c()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            pf.f2 r1 = new pf.f2
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = O
            zd.f1.a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v2.l1(pf.s1):void");
    }

    public final boolean m() {
        return !(J0() instanceof g2);
    }

    public final void m0(@fh.g f3 f3Var) {
        j0(f3Var);
    }

    @fh.g
    public ie.g m1(@fh.g ie.g gVar) {
        return n2.a.h(this, gVar);
    }

    public final Object n0(Object obj) {
        Object B1;
        do {
            Object J0 = J0();
            if (!(J0 instanceof g2) || ((J0 instanceof c) && ((c) J0).g())) {
                return w2.f22035a;
            }
            B1 = B1(J0, new e0(u0(obj), false, 2, (w) null));
        } while (B1 == w2.f22037c);
        return B1;
    }

    public final void n1(u2 u2Var) {
        u2Var.C0(new a3());
        f1.a(O, this, u2Var, u2Var.J0());
    }

    public <R> R o(R r10, @fh.g p<? super R, ? super g.b, ? extends R> pVar) {
        return n2.a.d(this, r10, pVar);
    }

    public final boolean o0(Throwable th2) {
        if (P0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        w I0 = I0();
        return (I0 == null || I0 == c3.O) ? z10 : I0.G(th2) || z10;
    }

    public final <T, R> void o1(@fh.g zf.f<? super R> fVar, @fh.g p<? super T, ? super ie.d<? super R>, ? extends Object> pVar) {
        Object J0;
        do {
            J0 = J0();
            if (!fVar.N()) {
                if (!(J0 instanceof g2)) {
                    if (!fVar.F()) {
                        return;
                    }
                    if (J0 instanceof e0) {
                        fVar.j0(((e0) J0).f21998a);
                        return;
                    } else {
                        xf.b.d(pVar, w2.o(J0), fVar.Q());
                        return;
                    }
                }
            } else {
                return;
            }
        } while (t1(J0) != 0);
        fVar.H(A(new m3(fVar, pVar)));
    }

    @fh.g
    public String p0() {
        return "Job was cancelled";
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void p1(@fh.g pf.u2 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.J0()
            boolean r1 = r0 instanceof pf.u2
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = O
            pf.s1 r2 = pf.w2.f22044j
            boolean r0 = zd.f1.a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof pf.g2
            if (r1 == 0) goto L_0x0027
            pf.g2 r0 = (pf.g2) r0
            pf.a3 r0 = r0.K()
            if (r0 == 0) goto L_0x0027
            r4.Q0()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.v2.p1(pf.u2):void");
    }

    @fh.g
    @k(level = m.P, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public n2 q(@fh.g n2 n2Var) {
        return n2.a.i(this, n2Var);
    }

    public boolean q0(@fh.g Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return j0(th2) && F0();
    }

    public final <T, R> void q1(@fh.g zf.f<? super R> fVar, @fh.g p<? super T, ? super ie.d<? super R>, ? extends Object> pVar) {
        Object J0 = J0();
        if (J0 instanceof e0) {
            fVar.j0(((e0) J0).f21998a);
            return;
        }
        xf.a.f(pVar, w2.o(J0), fVar.Q(), (l) null, 4, (Object) null);
    }

    public final void r0(g2 g2Var, Object obj) {
        w I0 = I0();
        if (I0 != null) {
            I0.P();
            s1(c3.O);
        }
        Throwable th2 = null;
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        if (e0Var != null) {
            th2 = e0Var.f21998a;
        }
        if (g2Var instanceof u2) {
            try {
                ((u2) g2Var).X0(th2);
            } catch (Throwable th3) {
                L0(new h0("Exception in completion handler " + g2Var + " for " + this, th3));
            }
        } else {
            a3 K = g2Var.K();
            if (K != null) {
                d1(K, th2);
            }
        }
    }

    @fh.g
    public CancellationException r1() {
        Throwable th2;
        Object J0 = J0();
        CancellationException cancellationException = null;
        if (J0 instanceof c) {
            th2 = ((c) J0).e();
        } else if (J0 instanceof e0) {
            th2 = ((e0) J0).f21998a;
        } else if (!(J0 instanceof g2)) {
            th2 = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + J0).toString());
        }
        if (th2 instanceof CancellationException) {
            cancellationException = (CancellationException) th2;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new o2("Parent job is " + u1(J0), th2, this);
    }

    public final void s0(c cVar, x xVar, Object obj) {
        x b12 = b1(xVar);
        if (b12 == null || !D1(cVar, b12, obj)) {
            f0(x0(cVar, obj));
        }
    }

    public final void s1(@h w wVar) {
        this._parentHandle = wVar;
    }

    public final boolean start() {
        int t12;
        do {
            t12 = t1(J0());
            if (t12 == 0) {
                return false;
            }
        } while (t12 != 1);
        return true;
    }

    public final int t1(Object obj) {
        if (obj instanceof s1) {
            if (((s1) obj).c()) {
                return 0;
            }
            if (!f1.a(O, this, obj, w2.f22044j)) {
                return -1;
            }
            k1();
            return 1;
        } else if (!(obj instanceof f2)) {
            return 0;
        } else {
            if (!f1.a(O, this, obj, ((f2) obj).K())) {
                return -1;
            }
            k1();
            return 1;
        }
    }

    @fh.g
    public String toString() {
        return x1() + '@' + z0.b(this);
    }

    public final Throwable u0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new o2(p0(), (Throwable) null, this) : th2;
        } else if (obj != null) {
            return ((f3) obj).r1();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    public final String u1(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof g2 ? ((g2) obj).c() ? "Active" : "New" : obj instanceof e0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    @fh.g
    public final o2 v0(@h String str, @h Throwable th2) {
        if (str == null) {
            str = p0();
        }
        return new o2(str, th2, this);
    }

    @fh.g
    public final CancellationException v1(@fh.g Throwable th2, @h String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = p0();
            }
            cancellationException = new o2(str, th2, this);
        }
        return cancellationException;
    }

    public final Object x0(c cVar, Object obj) {
        boolean f10;
        Throwable E0;
        e0 e0Var = obj instanceof e0 ? (e0) obj : null;
        Throwable th2 = e0Var != null ? e0Var.f21998a : null;
        synchronized (cVar) {
            f10 = cVar.f();
            List<Throwable> i10 = cVar.i(th2);
            E0 = E0(cVar, i10);
            if (E0 != null) {
                d0(E0, i10);
            }
        }
        boolean z10 = false;
        if (!(E0 == null || E0 == th2)) {
            obj = new e0(E0, false, 2, (w) null);
        }
        if (E0 != null) {
            if (o0(E0) || K0(E0)) {
                z10 = true;
            }
            if (z10) {
                if (obj != null) {
                    ((e0) obj).b();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                }
            }
        }
        if (!f10) {
            i1(E0);
        }
        j1(obj);
        f1.a(O, this, cVar, w2.g(obj));
        r0(cVar, obj);
        return obj;
    }

    @fh.g
    @i2
    public final String x1() {
        return a1() + '{' + u1(J0()) + '}';
    }

    public final x y0(g2 g2Var) {
        x xVar = g2Var instanceof x ? (x) g2Var : null;
        if (xVar != null) {
            return xVar;
        }
        a3 K = g2Var.K();
        if (K != null) {
            return b1(K);
        }
        return null;
    }

    public final boolean y1(g2 g2Var, Object obj) {
        if (!f1.a(O, this, g2Var, w2.g(obj))) {
            return false;
        }
        i1((Throwable) null);
        j1(obj);
        r0(g2Var, obj);
        return true;
    }

    public final boolean z1(g2 g2Var, Throwable th2) {
        a3 H0 = H0(g2Var);
        if (H0 == null) {
            return false;
        }
        if (!f1.a(O, this, g2Var, new c(H0, false, th2))) {
            return false;
        }
        c1(H0, th2);
        return true;
    }
}
