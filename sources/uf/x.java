package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import le.f;
import le.o;
import pf.f1;
import we.l;
import we.p;
import we.q;
import we.r;
import we.s;
import we.t;
import xe.n0;
import zd.b1;
import zd.e1;
import zd.k;
import zd.m;
import zd.u2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a&\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a,\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a\u0018\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001aF\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001aj\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\"\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aX\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032(\u0010\u0019\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a>\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001cH\u0007\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001a$\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0003H\u0007\u001aI\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032#\u0010!\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u001c¢\u0006\u0002\b H\u0007\u001a&\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010$\u001a\u00020#H\u0007\u001aU\u0010*\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u000321\u0010)\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b*\u0010\u0013\u001a\u0001\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010+\u001a\u00028\u00012H\b\u0001\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00102\u001aC\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\t\u001a\u00028\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u0002030\u001cH\u0007¢\u0006\u0004\b5\u00106\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b7\u00102\u001a,\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a-\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010(\u001a\u00028\u0000H\u0007¢\u0006\u0004\b:\u00102\u001a,\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001al\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010>\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032.\u0010>\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100CH\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001a \u0001\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010>\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100HH\u0007ø\u0001\u0000¢\u0006\u0004\bI\u0010J\u001aº\u0001\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010<\"\u0004\b\u0001\u0010=\"\u0004\b\u0002\u0010A\"\u0004\b\u0003\u0010F\"\u0004\b\u0004\u0010K\"\u0004\b\u0005\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010>\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100MH\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010O\u001a&\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001a&\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010Q\u001a\u00020PH\u0007\u001ag\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u000327\u0010>\u001a3\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\bT\u0010\u001b\u001ap\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032F\u0010.\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b(-\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b&\u0012\b\b'\u0012\u0004\b\b((\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100,H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u001a&\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010X\u001a\u00020#H\u0007\u001a\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", "p", "T", "Luf/i;", "Lie/g;", "context", "q", "y", "J", "fallback", "r", "s", "Lzd/u2;", "G", "Lkotlin/Function2;", "Lie/d;", "", "onEach", "H", "(Luf/i;Lwe/p;)V", "", "onError", "I", "(Luf/i;Lwe/p;Lwe/p;)V", "R", "mapper", "l", "(Luf/i;Lwe/p;)Luf/i;", "Lkotlin/Function1;", "g", "o", "m", "Lzd/u;", "transformer", "f", "", "count", "D", "Lzd/v0;", "name", "value", "action", "n", "initial", "Lkotlin/Function3;", "accumulator", "operation", "B", "(Luf/i;Ljava/lang/Object;Lwe/q;)Luf/i;", "t", "(Luf/i;Ljava/lang/Object;)Luf/i;", "", "predicate", "u", "(Luf/i;Ljava/lang/Object;Lwe/l;)Luf/i;", "E", "other", "F", "h", "i", "T1", "T2", "transform", "e", "(Luf/i;Luf/i;Lwe/q;)Luf/i;", "T3", "other2", "Lkotlin/Function4;", "d", "(Luf/i;Luf/i;Luf/i;Lwe/r;)Luf/i;", "T4", "other3", "Lkotlin/Function5;", "c", "(Luf/i;Luf/i;Luf/i;Luf/i;Lwe/s;)Luf/i;", "T5", "other4", "Lkotlin/Function6;", "b", "(Luf/i;Luf/i;Luf/i;Luf/i;Luf/i;Lwe/t;)Luf/i;", "", "timeMillis", "k", "j", "K", "C", "(Luf/i;Lwe/q;)Luf/i;", "w", "bufferSize", "x", "z", "A", "a", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class x {

    @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, d2 = {"T", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class a extends o implements p<T, ie.d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ long T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j10, ie.d<? super a> dVar) {
            super(2, dVar);
            this.T = j10;
        }

        @g
        public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
            return new a(this.T, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                long j10 = this.T;
                this.S = 1;
                if (f1.b(j10, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object g0(T t10, @h ie.d<? super u2> dVar) {
            return ((a) H(t10, dVar)).K(u2.f25116a);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {415}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"T", "Luf/j;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class b extends o implements p<j<? super T>, ie.d<? super u2>, Object> {
        public int S;
        public final /* synthetic */ long T;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(long j10, ie.d<? super b> dVar) {
            super(2, dVar);
            this.T = j10;
        }

        @g
        public final ie.d<u2> H(@h Object obj, @g ie.d<?> dVar) {
            return new b(this.T, dVar);
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                long j10 = this.T;
                this.S = 1;
                if (f1.b(j10, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object g0(@g j<? super T> jVar, @h ie.d<? super u2> dVar) {
            return ((b) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "c", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends n0 implements l<Throwable, Boolean> {
        public static final c P = new c();

        public c() {
            super(1);
        }

        @g
        /* renamed from: c */
        public final Boolean A(@g Throwable th2) {
            return Boolean.TRUE;
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {306}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@"}, d2 = {"T", "Luf/j;", "", "e", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class d extends o implements q<j<? super T>, Throwable, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ l<Throwable, Boolean> V;
        public final /* synthetic */ T W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(l<? super Throwable, Boolean> lVar, T t10, ie.d<? super d> dVar) {
            super(3, dVar);
            this.V = lVar;
            this.W = t10;
        }

        @h
        public final Object K(@g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                j jVar = (j) this.T;
                Throwable th2 = (Throwable) this.U;
                if (this.V.A(th2).booleanValue()) {
                    T t10 = this.W;
                    this.T = null;
                    this.S = 1;
                    if (jVar.d(t10, this) == h10) {
                        return h10;
                    }
                } else {
                    throw th2;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @h
        /* renamed from: P */
        public final Object y(@g j<? super T> jVar, @g Throwable th2, @h ie.d<? super u2> dVar) {
            d dVar2 = new d(this.V, this.W, dVar);
            dVar2.T = jVar;
            dVar2.U = th2;
            return dVar2.K(u2.f25116a);
        }
    }

    @f(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {190, 190}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@¨\u0006\u0005"}, d2 = {"T", "R", "Luf/j;", "it", "Lzd/u2;", "uf/w$b", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e extends o implements q<j<? super R>, T, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ p V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p pVar, ie.d dVar) {
            super(3, dVar);
            this.V = pVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: uf.j} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r5.S
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                zd.e1.n(r6)
                goto L_0x0047
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.T
                uf.j r1 = (uf.j) r1
                zd.e1.n(r6)
                goto L_0x0039
            L_0x0022:
                zd.e1.n(r6)
                java.lang.Object r6 = r5.T
                r1 = r6
                uf.j r1 = (uf.j) r1
                java.lang.Object r6 = r5.U
                we.p r4 = r5.V
                r5.T = r1
                r5.S = r3
                java.lang.Object r6 = r4.g0(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                uf.i r6 = (uf.i) r6
                r3 = 0
                r5.T = r3
                r5.S = r2
                java.lang.Object r6 = uf.k.m0(r1, r6, r5)
                if (r6 != r0) goto L_0x0047
                return r0
            L_0x0047:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.x.e.K(java.lang.Object):java.lang.Object");
        }

        @h
        /* renamed from: P */
        public final Object y(@g j<? super R> jVar, T t10, @h ie.d<? super u2> dVar) {
            e eVar = new e(this.V, dVar);
            eVar.T = jVar;
            eVar.U = t10;
            return eVar.K(u2.f25116a);
        }
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    public static final <T> i<T> A(@g i<? extends T> iVar, int i10) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow has less verbose 'scan' shortcut", replaceWith = @b1(expression = "scan(initial, operation)", imports = {}))
    public static final <T, R> i<R> B(@g i<? extends T> iVar, R r10, @g @zd.b q<? super R, ? super T, ? super ie.d<? super R>, ? extends Object> qVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @b1(expression = "runningReduce(operation)", imports = {}))
    public static final <T> i<T> C(@g i<? extends T> iVar, @g q<? super T, ? super T, ? super ie.d<? super T>, ? extends Object> qVar) {
        return k.z1(iVar, qVar);
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @b1(expression = "drop(count)", imports = {}))
    public static final <T> i<T> D(@g i<? extends T> iVar, int i10) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @b1(expression = "onStart { emit(value) }", imports = {}))
    public static final <T> i<T> E(@g i<? extends T> iVar, T t10) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @b1(expression = "onStart { emitAll(other) }", imports = {}))
    public static final <T> i<T> F(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        k.b1();
        throw new y();
    }

    @k(level = m.P, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void G(@g i<? extends T> iVar) {
        k.b1();
        throw new y();
    }

    @k(level = m.P, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void H(@g i<? extends T> iVar, @g p<? super T, ? super ie.d<? super u2>, ? extends Object> pVar) {
        k.b1();
        throw new y();
    }

    @k(level = m.P, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@g i<? extends T> iVar, @g p<? super T, ? super ie.d<? super u2>, ? extends Object> pVar, @g p<? super Throwable, ? super ie.d<? super u2>, ? extends Object> pVar2) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Use 'flowOn' instead")
    public static final <T> i<T> J(@g i<? extends T> iVar, @g ie.g gVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @b1(expression = "this.flatMapLatest(transform)", imports = {}))
    public static final <T, R> i<R> K(@g i<? extends T> iVar, @g p<? super T, ? super ie.d<? super i<? extends R>>, ? extends Object> pVar) {
        return k.b2(iVar, new e(pVar, (ie.d) null));
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    public static final <T> i<T> a(@g i<? extends T> iVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, T5, R> i<R> b(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g i<? extends T5> iVar5, @g t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super ie.d<? super R>, ? extends Object> tVar) {
        return k.D(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    public static final <T1, T2, T3, T4, R> i<R> c(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g i<? extends T4> iVar4, @g s<? super T1, ? super T2, ? super T3, ? super T4, ? super ie.d<? super R>, ? extends Object> sVar) {
        return k.E(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "combine(this, other, other2, transform)", imports = {}))
    public static final <T1, T2, T3, R> i<R> d(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g i<? extends T3> iVar3, @g r<? super T1, ? super T2, ? super T3, ? super ie.d<? super R>, ? extends Object> rVar) {
        return k.F(iVar, iVar2, iVar3, rVar);
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @b1(expression = "this.combine(other, transform)", imports = {}))
    public static final <T1, T2, R> i<R> e(@g i<? extends T1> iVar, @g i<? extends T2> iVar2, @g q<? super T1, ? super T2, ? super ie.d<? super R>, ? extends Object> qVar) {
        return k.G(iVar, iVar2, qVar);
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'compose' is 'let'", replaceWith = @b1(expression = "let(transformer)", imports = {}))
    public static final <T, R> i<R> f(@g i<? extends T> iVar, @g l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> g(@g i<? extends T> iVar, @g l<? super T, ? extends i<? extends R>> lVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @b1(expression = "onCompletion { emit(value) }", imports = {}))
    public static final <T> i<T> h(@g i<? extends T> iVar, T t10) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    public static final <T> i<T> i(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> j(@g i<? extends T> iVar, long j10) {
        return k.e1(iVar, new a(j10, (ie.d<? super a>) null));
    }

    @g
    @k(level = m.P, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    public static final <T> i<T> k(@g i<? extends T> iVar, long j10) {
        return k.l1(iVar, new b(j10, (ie.d<? super b>) null));
    }

    @g
    @k(level = m.P, message = "Flow analogue is 'flatMapConcat'", replaceWith = @b1(expression = "flatMapConcat(mapper)", imports = {}))
    public static final <T, R> i<R> l(@g i<? extends T> iVar, @g p<? super T, ? super ie.d<? super i<? extends R>>, ? extends Object> pVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> m(@g i<? extends i<? extends T>> iVar) {
        k.b1();
        throw new y();
    }

    @k(level = m.P, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @b1(expression = "collect(action)", imports = {}))
    public static final <T> void n(@g i<? extends T> iVar, @g p<? super T, ? super ie.d<? super u2>, ? extends Object> pVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @b1(expression = "flattenConcat()", imports = {}))
    public static final <T> i<T> o(@g i<? extends i<? extends T>> iVar) {
        k.b1();
        throw new y();
    }

    @g
    public static final Void p() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @g
    @k(level = m.P, message = "Collect flow in the desired context instead")
    public static final <T> i<T> q(@g i<? extends T> iVar, @g ie.g gVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> r(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @b1(expression = "catch { emitAll(fallback) }", imports = {}))
    public static final <T> i<T> s(@g i<? extends T> iVar, @g i<? extends T> iVar2) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @b1(expression = "catch { emit(fallback) }", imports = {}))
    public static final <T> i<T> t(@g i<? extends T> iVar, T t10) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    public static final <T> i<T> u(@g i<? extends T> iVar, T t10, @g l<? super Throwable, Boolean> lVar) {
        return k.u(iVar, new d(lVar, t10, (ie.d<? super d>) null));
    }

    public static /* synthetic */ i v(i iVar, Object obj, l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = c.P;
        }
        return k.j1(iVar, obj, lVar);
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> w(@g i<? extends T> iVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    public static final <T> i<T> x(@g i<? extends T> iVar, int i10) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Collect flow in the desired context instead")
    public static final <T> i<T> y(@g i<? extends T> iVar, @g ie.g gVar) {
        k.b1();
        throw new y();
    }

    @g
    @k(level = m.P, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    public static final <T> i<T> z(@g i<? extends T> iVar) {
        k.b1();
        throw new y();
    }
}
