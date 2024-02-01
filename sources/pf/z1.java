package pf;

import fh.g;
import fh.h;
import ie.b;
import ie.g;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import we.l;
import xe.n0;
import xe.w;
import zd.r;

@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lpf/z1;", "Lpf/o0;", "Ljava/io/Closeable;", "Lzd/u2;", "close", "Ljava/util/concurrent/Executor;", "S1", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "Q", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public abstract class z1 extends o0 implements Closeable {
    @g
    public static final a Q = new a((w) null);

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpf/z1$a;", "Lie/b;", "Lpf/o0;", "Lpf/z1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @r
    public static final class a extends b<o0, z1> {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lie/g$b;", "it", "Lpf/z1;", "c", "(Lie/g$b;)Lpf/z1;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: pf.z1$a$a  reason: collision with other inner class name */
        public static final class C0388a extends n0 implements l<g.b, z1> {
            public static final C0388a P = new C0388a();

            public C0388a() {
                super(1);
            }

            @h
            /* renamed from: c */
            public final z1 A(@fh.g g.b bVar) {
                if (bVar instanceof z1) {
                    return (z1) bVar;
                }
                return null;
            }
        }

        public a() {
            super(o0.P, C0388a.P);
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @fh.g
    public abstract Executor S1();

    public abstract void close();
}
