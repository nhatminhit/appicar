package uf;

import be.e0;
import kotlin.Metadata;
import xe.l0;
import xe.n0;
import zd.e1;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a\u0001\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032F\u0010\f\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0001\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032Y\b\u0001\u0010\f\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016\u001a\u0001\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u000320\b\u0001\u0010\f\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0011ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0001\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00030\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032A\b\u0001\u0010\f\u001a;\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001c¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a¢\u0001\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u000324\u0010\f\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001aµ\u0001\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00040\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032G\b\u0001\u0010\f\u001aA\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a¼\u0001\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032:\u0010\f\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0#ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001aÏ\u0001\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0018\"\u0004\b\u0003\u0010\u001f\"\u0004\b\u0004\u0010&\"\u0004\b\u0005\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00030\u00032\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00040\u00032M\b\u0001\u0010\f\u001aG\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0*¢\u0006\u0002\b\u0014ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001as\u00101\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\bø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u0001\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\bø\u0001\u0000¢\u0006\u0004\b3\u00104\u001as\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\bø\u0001\u0000¢\u0006\u0004\b5\u00102\u001a\u0001\u00106\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u001e\u0010/\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030.\"\b\u0012\u0004\u0012\u00028\u00000\u00032;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\bø\u0001\u0000¢\u0006\u0004\b6\u00104\u001a#\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010.07\"\u0004\b\u0000\u0010-H\u0002¢\u0006\u0004\b8\u00109\u001ag\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2*\b\u0004\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b00H\bø\u0001\u0000¢\u0006\u0004\b\t\u0010;\u001ax\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0006\b\u0000\u0010-\u0018\u0001\"\u0004\b\u0001\u0010\u00022\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030:2;\b\u0005\u0010\f\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\u0002\b\u0014H\bø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001aj\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032(\u0010\f\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0004\b?\u0010\u000e\u0002\u0004\n\u0002\b\u0019¨\u0006@"}, d2 = {"T1", "T2", "R", "Luf/i;", "flow", "Lkotlin/Function3;", "Lzd/v0;", "name", "a", "b", "Lie/d;", "", "transform", "p", "(Luf/i;Luf/i;Lwe/q;)Luf/i;", "flow2", "f", "Lkotlin/Function4;", "Luf/j;", "Lzd/u2;", "Lzd/u;", "q", "(Luf/i;Luf/i;Lwe/r;)Luf/i;", "l", "T3", "flow3", "e", "(Luf/i;Luf/i;Luf/i;Lwe/r;)Luf/i;", "Lkotlin/Function5;", "k", "(Luf/i;Luf/i;Luf/i;Lwe/s;)Luf/i;", "T4", "flow4", "d", "(Luf/i;Luf/i;Luf/i;Luf/i;Lwe/s;)Luf/i;", "Lkotlin/Function6;", "j", "(Luf/i;Luf/i;Luf/i;Luf/i;Lwe/t;)Luf/i;", "T5", "flow5", "c", "(Luf/i;Luf/i;Luf/i;Luf/i;Luf/i;Lwe/t;)Luf/i;", "Lkotlin/Function7;", "i", "(Luf/i;Luf/i;Luf/i;Luf/i;Luf/i;Lwe/u;)Luf/i;", "T", "", "flows", "Lkotlin/Function2;", "g", "([Luf/i;Lwe/p;)Luf/i;", "m", "([Luf/i;Lwe/q;)Luf/i;", "o", "n", "Lkotlin/Function0;", "r", "()Lwe/a;", "", "(Ljava/lang/Iterable;Lwe/p;)Luf/i;", "h", "(Ljava/lang/Iterable;Lwe/q;)Luf/i;", "other", "s", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class b0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/b0$t"}, k = 1, mv = {1, 6, 0})
    public static final class a implements i<R> {
        public final /* synthetic */ i[] O;
        public final /* synthetic */ we.r P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: uf.b0$a$a  reason: collision with other inner class name */
        public static final class C0434a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.r V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0434a(ie.d dVar, we.r rVar) {
                super(3, dVar);
                this.V = rVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: uf.j} */
            /* JADX WARNING: Multi-variable type inference failed */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object K(@fh.g java.lang.Object r8) {
                /*
                    r7 = this;
                    java.lang.Object r0 = ke.d.h()
                    int r1 = r7.S
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    zd.e1.n(r8)
                    goto L_0x0056
                L_0x0012:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L_0x001a:
                    java.lang.Object r1 = r7.T
                    uf.j r1 = (uf.j) r1
                    zd.e1.n(r8)
                    goto L_0x004a
                L_0x0022:
                    zd.e1.n(r8)
                    java.lang.Object r8 = r7.T
                    r1 = r8
                    uf.j r1 = (uf.j) r1
                    java.lang.Object r8 = r7.U
                    java.lang.Object[] r8 = (java.lang.Object[]) r8
                    we.r r4 = r7.V
                    r5 = 0
                    r5 = r8[r5]
                    r6 = r8[r3]
                    r8 = r8[r2]
                    r7.T = r1
                    r7.S = r3
                    r3 = 6
                    xe.i0.e(r3)
                    java.lang.Object r8 = r4.M(r5, r6, r8, r7)
                    r3 = 7
                    xe.i0.e(r3)
                    if (r8 != r0) goto L_0x004a
                    return r0
                L_0x004a:
                    r3 = 0
                    r7.T = r3
                    r7.S = r2
                    java.lang.Object r8 = r1.d(r8, r7)
                    if (r8 != r0) goto L_0x0056
                    return r0
                L_0x0056:
                    zd.u2 r8 = zd.u2.f25116a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.b0.a.C0434a.K(java.lang.Object):java.lang.Object");
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                C0434a aVar = new C0434a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        public a(i[] iVarArr, we.r rVar) {
            this.O = iVarArr;
            this.P = rVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = vf.m.a(jVar, this.O, b0.r(), new C0434a((ie.d) null, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/b0$t"}, k = 1, mv = {1, 6, 0})
    public static final class b implements i<R> {
        public final /* synthetic */ i[] O;
        public final /* synthetic */ we.s P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.s V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ie.d dVar, we.s sVar) {
                super(3, dVar);
                this.V = sVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: uf.j} */
            /* JADX WARNING: Multi-variable type inference failed */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object K(@fh.g java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = ke.d.h()
                    int r1 = r10.S
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    zd.e1.n(r11)
                    goto L_0x005a
                L_0x0012:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L_0x001a:
                    java.lang.Object r1 = r10.T
                    uf.j r1 = (uf.j) r1
                    zd.e1.n(r11)
                    goto L_0x004e
                L_0x0022:
                    zd.e1.n(r11)
                    java.lang.Object r11 = r10.T
                    r1 = r11
                    uf.j r1 = (uf.j) r1
                    java.lang.Object r11 = r10.U
                    java.lang.Object[] r11 = (java.lang.Object[]) r11
                    we.s r4 = r10.V
                    r5 = 0
                    r5 = r11[r5]
                    r6 = r11[r3]
                    r7 = r11[r2]
                    r8 = 3
                    r8 = r11[r8]
                    r10.T = r1
                    r10.S = r3
                    r11 = 6
                    xe.i0.e(r11)
                    r9 = r10
                    java.lang.Object r11 = r4.i0(r5, r6, r7, r8, r9)
                    r3 = 7
                    xe.i0.e(r3)
                    if (r11 != r0) goto L_0x004e
                    return r0
                L_0x004e:
                    r3 = 0
                    r10.T = r3
                    r10.S = r2
                    java.lang.Object r11 = r1.d(r11, r10)
                    if (r11 != r0) goto L_0x005a
                    return r0
                L_0x005a:
                    zd.u2 r11 = zd.u2.f25116a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.b0.b.a.K(java.lang.Object):java.lang.Object");
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        public b(i[] iVarArr, we.s sVar) {
            this.O = iVarArr;
            this.P = sVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = vf.m.a(jVar, this.O, b0.r(), new a((ie.d) null, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/b0$t"}, k = 1, mv = {1, 6, 0})
    public static final class c implements i<R> {
        public final /* synthetic */ i[] O;
        public final /* synthetic */ we.t P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", i = {}, l = {333, 333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$u", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.t V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ie.d dVar, we.t tVar) {
                super(3, dVar);
                this.V = tVar;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: uf.j} */
            /* JADX WARNING: Multi-variable type inference failed */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object K(@fh.g java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = ke.d.h()
                    int r1 = r11.S
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0022
                    if (r1 == r3) goto L_0x001a
                    if (r1 != r2) goto L_0x0012
                    zd.e1.n(r12)
                    goto L_0x005d
                L_0x0012:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001a:
                    java.lang.Object r1 = r11.T
                    uf.j r1 = (uf.j) r1
                    zd.e1.n(r12)
                    goto L_0x0051
                L_0x0022:
                    zd.e1.n(r12)
                    java.lang.Object r12 = r11.T
                    r1 = r12
                    uf.j r1 = (uf.j) r1
                    java.lang.Object r12 = r11.U
                    java.lang.Object[] r12 = (java.lang.Object[]) r12
                    we.t r4 = r11.V
                    r5 = 0
                    r5 = r12[r5]
                    r6 = r12[r3]
                    r7 = r12[r2]
                    r8 = 3
                    r8 = r12[r8]
                    r9 = 4
                    r9 = r12[r9]
                    r11.T = r1
                    r11.S = r3
                    r12 = 6
                    xe.i0.e(r12)
                    r10 = r11
                    java.lang.Object r12 = r4.b0(r5, r6, r7, r8, r9, r10)
                    r3 = 7
                    xe.i0.e(r3)
                    if (r12 != r0) goto L_0x0051
                    return r0
                L_0x0051:
                    r3 = 0
                    r11.T = r3
                    r11.S = r2
                    java.lang.Object r12 = r1.d(r12, r11)
                    if (r12 != r0) goto L_0x005d
                    return r0
                L_0x005d:
                    zd.u2 r12 = zd.u2.f25116a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.b0.c.a.K(java.lang.Object):java.lang.Object");
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        public c(i[] iVarArr, we.t tVar) {
            this.O = iVarArr;
            this.P = tVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = vf.m.a(jVar, this.O, b0.r(), new a((ie.d) null, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class d implements i<R> {
        public final /* synthetic */ i O;
        public final /* synthetic */ i P;
        public final /* synthetic */ we.q Q;

        public d(i iVar, i iVar2, we.q qVar) {
            this.O = iVar;
            this.P = iVar2;
            this.Q = qVar;
        }

        @fh.h
        public Object a(@fh.g j<? super R> jVar, @fh.g ie.d<? super u2> dVar) {
            Object a10 = vf.m.a(jVar, new i[]{this.O, this.P}, b0.r(), new g(this.Q, (ie.d<? super g>) null), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class e implements i<R> {
        public final /* synthetic */ i[] O;
        public final /* synthetic */ we.p P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ e T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar, ie.d dVar) {
                super(dVar);
                this.T = eVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public e(i[] iVarArr, we.p pVar) {
            this.O = iVarArr;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j<? super R> jVar, @fh.g ie.d<? super u2> dVar) {
            i[] iVarArr = this.O;
            l0.w();
            h hVar = new h(this.O);
            l0.w();
            Object a10 = vf.m.a(jVar, iVarArr, hVar, new i(this.P, (ie.d<? super i>) null), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i[] iVarArr = this.O;
            l0.w();
            h hVar = new h(this.O);
            l0.w();
            i iVar = new i(this.P, (ie.d<? super i>) null);
            xe.i0.e(0);
            vf.m.a(jVar, iVarArr, hVar, iVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class f implements i<R> {
        public final /* synthetic */ i[] O;
        public final /* synthetic */ we.p P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ f T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, ie.d dVar) {
                super(dVar);
                this.T = fVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public f(i[] iVarArr, we.p pVar) {
            this.O = iVarArr;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j<? super R> jVar, @fh.g ie.d<? super u2> dVar) {
            i[] iVarArr = this.O;
            l0.w();
            j jVar2 = new j(this.O);
            l0.w();
            Object a10 = vf.m.a(jVar, iVarArr, jVar2, new k(this.P, (ie.d<? super k>) null), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i[] iVarArr = this.O;
            l0.w();
            j jVar2 = new j(this.O);
            l0.w();
            k kVar = new k(this.P, (ie.d<? super k>) null);
            xe.i0.e(0);
            vf.m.a(jVar, iVarArr, jVar2, kVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H@"}, d2 = {"T1", "T2", "R", "Luf/j;", "", "", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class g extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ we.q<T1, T2, ie.d<? super R>, Object> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(we.q<? super T1, ? super T2, ? super ie.d<? super R>, ? extends Object> qVar, ie.d<? super g> dVar) {
            super(3, dVar);
            this.V = qVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: uf.j} */
        /* JADX WARNING: Multi-variable type inference failed */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r6.S
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                zd.e1.n(r7)
                goto L_0x004c
            L_0x0012:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001a:
                java.lang.Object r1 = r6.T
                uf.j r1 = (uf.j) r1
                zd.e1.n(r7)
                goto L_0x0040
            L_0x0022:
                zd.e1.n(r7)
                java.lang.Object r7 = r6.T
                r1 = r7
                uf.j r1 = (uf.j) r1
                java.lang.Object r7 = r6.U
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                we.q<T1, T2, ie.d<? super R>, java.lang.Object> r4 = r6.V
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.T = r1
                r6.S = r3
                java.lang.Object r7 = r4.y(r5, r7, r6)
                if (r7 != r0) goto L_0x0040
                return r0
            L_0x0040:
                r3 = 0
                r6.T = r3
                r6.S = r2
                java.lang.Object r7 = r1.d(r7, r6)
                if (r7 != r0) goto L_0x004c
                return r0
            L_0x004c:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.b0.g.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
            g gVar = new g(this.V, dVar);
            gVar.T = jVar;
            gVar.U = objArr;
            return gVar.K(u2.f25116a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class h extends n0 implements we.a<T[]> {
        public final /* synthetic */ i<T>[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(i<? extends T>[] iVarArr) {
            super(0);
            this.P = iVarArr;
        }

        @fh.h
        /* renamed from: c */
        public final T[] n() {
            int length = this.P.length;
            l0.y(0, "T?");
            return new Object[length];
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", i = {}, l = {238, 238}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class i extends le.o implements we.q<j<? super R>, T[], ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ we.p<T[], ie.d<? super R>, Object> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(we.p<? super T[], ? super ie.d<? super R>, ? extends Object> pVar, ie.d<? super i> dVar) {
            super(3, dVar);
            this.V = pVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
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
                goto L_0x003b
            L_0x0022:
                zd.e1.n(r6)
                java.lang.Object r6 = r5.T
                r1 = r6
                uf.j r1 = (uf.j) r1
                java.lang.Object r6 = r5.U
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                we.p<T[], ie.d<? super R>, java.lang.Object> r4 = r5.V
                r5.T = r1
                r5.S = r3
                java.lang.Object r6 = r4.g0(r6, r5)
                if (r6 != r0) goto L_0x003b
                return r0
            L_0x003b:
                r3 = 0
                r5.T = r3
                r5.S = r2
                java.lang.Object r6 = r1.d(r6, r5)
                if (r6 != r0) goto L_0x0047
                return r0
            L_0x0047:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.b0.i.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object y(@fh.g j<? super R> jVar, @fh.g T[] tArr, @fh.h ie.d<? super u2> dVar) {
            i iVar = new i(this.V, dVar);
            iVar.T = jVar;
            iVar.U = tArr;
            return iVar.K(u2.f25116a);
        }

        @fh.h
        public final Object Q(@fh.g Object obj) {
            Object g02 = this.V.g0((Object[]) this.U, this);
            xe.i0.e(0);
            ((j) this.T).d(g02, this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class j extends n0 implements we.a<T[]> {
        public final /* synthetic */ i<T>[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(i<T>[] iVarArr) {
            super(0);
            this.P = iVarArr;
        }

        @fh.h
        /* renamed from: c */
        public final T[] n() {
            int length = this.P.length;
            l0.y(0, "T?");
            return new Object[length];
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class k extends le.o implements we.q<j<? super R>, T[], ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ we.p<T[], ie.d<? super R>, Object> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(we.p<? super T[], ? super ie.d<? super R>, ? extends Object> pVar, ie.d<? super k> dVar) {
            super(3, dVar);
            this.V = pVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
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
                goto L_0x003b
            L_0x0022:
                zd.e1.n(r6)
                java.lang.Object r6 = r5.T
                r1 = r6
                uf.j r1 = (uf.j) r1
                java.lang.Object r6 = r5.U
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                we.p<T[], ie.d<? super R>, java.lang.Object> r4 = r5.V
                r5.T = r1
                r5.S = r3
                java.lang.Object r6 = r4.g0(r6, r5)
                if (r6 != r0) goto L_0x003b
                return r0
            L_0x003b:
                r3 = 0
                r5.T = r3
                r5.S = r2
                java.lang.Object r6 = r1.d(r6, r5)
                if (r6 != r0) goto L_0x0047
                return r0
            L_0x0047:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.b0.k.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object y(@fh.g j<? super R> jVar, @fh.g T[] tArr, @fh.h ie.d<? super u2> dVar) {
            k kVar = new k(this.V, dVar);
            kVar.T = jVar;
            kVar.U = tArr;
            return kVar.K(u2.f25116a);
        }

        @fh.h
        public final Object Q(@fh.g Object obj) {
            Object g02 = this.V.g0((Object[]) this.U, this);
            xe.i0.e(0);
            ((j) this.T).d(g02, this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¨\u0006\u0004"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "uf/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class l extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i[] U;
        public final /* synthetic */ we.r V;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.r V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ie.d dVar, we.r rVar) {
                super(3, dVar);
                this.V = rVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    Object[] objArr = (Object[]) this.U;
                    we.r rVar = this.V;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.S = 1;
                    xe.i0.e(6);
                    Object M = rVar.M((j) this.T, obj2, obj3, this);
                    xe.i0.e(7);
                    if (M == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(i[] iVarArr, ie.d dVar, we.r rVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = rVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            l lVar = new l(this.U, dVar, this.V);
            lVar.T = obj;
            return lVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i[] iVarArr = this.U;
                we.a a10 = b0.r();
                a aVar = new a((ie.d) null, this.V);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, a10, aVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((l) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¨\u0006\u0004"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "uf/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class m extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i[] U;
        public final /* synthetic */ we.r V;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.r V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ie.d dVar, we.r rVar) {
                super(3, dVar);
                this.V = rVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    Object[] objArr = (Object[]) this.U;
                    we.r rVar = this.V;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    this.S = 1;
                    xe.i0.e(6);
                    Object M = rVar.M((j) this.T, obj2, obj3, this);
                    xe.i0.e(7);
                    if (M == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(i[] iVarArr, ie.d dVar, we.r rVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = rVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            m mVar = new m(this.U, dVar, this.V);
            mVar.T = obj;
            return mVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i[] iVarArr = this.U;
                we.a a10 = b0.r();
                a aVar = new a((ie.d) null, this.V);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, a10, aVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((m) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¨\u0006\u0004"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "uf/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class n extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i[] U;
        public final /* synthetic */ we.s V;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.s V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ie.d dVar, we.s sVar) {
                super(3, dVar);
                this.V = sVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    Object[] objArr = (Object[]) this.U;
                    we.s sVar = this.V;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.S = 1;
                    xe.i0.e(6);
                    Object i02 = sVar.i0((j) this.T, obj2, obj3, obj4, this);
                    xe.i0.e(7);
                    if (i02 == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public n(i[] iVarArr, ie.d dVar, we.s sVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = sVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            n nVar = new n(this.U, dVar, this.V);
            nVar.T = obj;
            return nVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i[] iVarArr = this.U;
                we.a a10 = b0.r();
                a aVar = new a((ie.d) null, this.V);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, a10, aVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((n) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¨\u0006\u0004"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "uf/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class o extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i[] U;
        public final /* synthetic */ we.t V;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.t V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ie.d dVar, we.t tVar) {
                super(3, dVar);
                this.V = tVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    Object[] objArr = (Object[]) this.U;
                    we.t tVar = this.V;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.S = 1;
                    xe.i0.e(6);
                    Object b02 = tVar.b0((j) this.T, obj2, obj3, obj4, obj5, this);
                    xe.i0.e(7);
                    if (b02 == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(i[] iVarArr, ie.d dVar, we.t tVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = tVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            o oVar = new o(this.U, dVar, this.V);
            oVar.T = obj;
            return oVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i[] iVarArr = this.U;
                we.a a10 = b0.r();
                a aVar = new a((ie.d) null, this.V);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, a10, aVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((o) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@¨\u0006\u0004"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "uf/b0$s", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class p extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i[] U;
        public final /* synthetic */ we.u V;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¨\u0006\u0006"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "uf/b0$s$a", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, Object[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.u V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ie.d dVar, we.u uVar) {
                super(3, dVar);
                this.V = uVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    Object[] objArr = (Object[]) this.U;
                    we.u uVar = this.V;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    this.S = 1;
                    xe.i0.e(6);
                    Object m02 = uVar.m0((j) this.T, obj2, obj3, obj4, obj5, obj6, this);
                    xe.i0.e(7);
                    if (m02 == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g Object[] objArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(dVar, this.V);
                aVar.T = jVar;
                aVar.U = objArr;
                return aVar.K(u2.f25116a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(i[] iVarArr, ie.d dVar, we.u uVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = uVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            p pVar = new p(this.U, dVar, this.V);
            pVar.T = obj;
            return pVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i[] iVarArr = this.U;
                we.a a10 = b0.r();
                a aVar = new a((ie.d) null, this.V);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, a10, aVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((p) H(jVar, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class q extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i<T>[] U;
        public final /* synthetic */ we.q<j<? super R>, T[], ie.d<? super u2>, Object> V;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a extends n0 implements we.a<T[]> {
            public final /* synthetic */ i<T>[] P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(i<? extends T>[] iVarArr) {
                super(0);
                this.P = iVarArr;
            }

            @fh.h
            /* renamed from: c */
            public final T[] n() {
                int length = this.P.length;
                l0.y(0, "T?");
                return new Object[length];
            }
        }

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b extends le.o implements we.q<j<? super R>, T[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.q<j<? super R>, T[], ie.d<? super u2>, Object> V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(we.q<? super j<? super R>, ? super T[], ? super ie.d<? super u2>, ? extends Object> qVar, ie.d<? super b> dVar) {
                super(3, dVar);
                this.V = qVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    we.q<j<? super R>, T[], ie.d<? super u2>, Object> qVar = this.V;
                    this.T = null;
                    this.S = 1;
                    if (qVar.y((j) this.T, (Object[]) this.U, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g T[] tArr, @fh.h ie.d<? super u2> dVar) {
                b bVar = new b(this.V, dVar);
                bVar.T = jVar;
                bVar.U = tArr;
                return bVar.K(u2.f25116a);
            }

            @fh.h
            public final Object Q(@fh.g Object obj) {
                this.V.y((j) this.T, (Object[]) this.U, this);
                return u2.f25116a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(i<? extends T>[] iVarArr, we.q<? super j<? super R>, ? super T[], ? super ie.d<? super u2>, ? extends Object> qVar, ie.d<? super q> dVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            q qVar = new q(this.U, this.V, dVar);
            qVar.T = obj;
            return qVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i<T>[] iVarArr = this.U;
                l0.w();
                a aVar = new a(this.U);
                l0.w();
                b bVar = new b(this.V, (ie.d<? super b>) null);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, aVar, bVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((q) H(jVar, dVar)).K(u2.f25116a);
        }

        @fh.h
        public final Object Q(@fh.g Object obj) {
            i<T>[] iVarArr = this.U;
            l0.w();
            a aVar = new a(this.U);
            l0.w();
            b bVar = new b(this.V, (ie.d<? super b>) null);
            xe.i0.e(0);
            vf.m.a((j) this.T, iVarArr, aVar, bVar, this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class r extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i<T>[] U;
        public final /* synthetic */ we.q<j<? super R>, T[], ie.d<? super u2>, Object> V;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "c", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
        public static final class a extends n0 implements we.a<T[]> {
            public final /* synthetic */ i<T>[] P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(i<T>[] iVarArr) {
                super(0);
                this.P = iVarArr;
            }

            @fh.h
            /* renamed from: c */
            public final T[] n() {
                int length = this.P.length;
                l0.y(0, "T?");
                return new Object[length];
            }
        }

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", i = {}, l = {308}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class b extends le.o implements we.q<j<? super R>, T[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.q<j<? super R>, T[], ie.d<? super u2>, Object> V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(we.q<? super j<? super R>, ? super T[], ? super ie.d<? super u2>, ? extends Object> qVar, ie.d<? super b> dVar) {
                super(3, dVar);
                this.V = qVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    we.q<j<? super R>, T[], ie.d<? super u2>, Object> qVar = this.V;
                    this.T = null;
                    this.S = 1;
                    if (qVar.y((j) this.T, (Object[]) this.U, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g T[] tArr, @fh.h ie.d<? super u2> dVar) {
                b bVar = new b(this.V, dVar);
                bVar.T = jVar;
                bVar.U = tArr;
                return bVar.K(u2.f25116a);
            }

            @fh.h
            public final Object Q(@fh.g Object obj) {
                this.V.y((j) this.T, (Object[]) this.U, this);
                return u2.f25116a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public r(i<T>[] iVarArr, we.q<? super j<? super R>, ? super T[], ? super ie.d<? super u2>, ? extends Object> qVar, ie.d<? super r> dVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            r rVar = new r(this.U, this.V, dVar);
            rVar.T = obj;
            return rVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i<T>[] iVarArr = this.U;
                l0.w();
                a aVar = new a(this.U);
                l0.w();
                b bVar = new b(this.V, (ie.d<? super b>) null);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, aVar, bVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((r) H(jVar, dVar)).K(u2.f25116a);
        }

        @fh.h
        public final Object Q(@fh.g Object obj) {
            i<T>[] iVarArr = this.U;
            l0.w();
            a aVar = new a(this.U);
            l0.w();
            b bVar = new b(this.V, (ie.d<? super b>) null);
            xe.i0.e(0);
            vf.m.a((j) this.T, iVarArr, aVar, bVar, this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"T", "R", "Luf/j;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class s extends le.o implements we.p<j<? super R>, ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i<T>[] U;
        public final /* synthetic */ we.q<j<? super R>, T[], ie.d<? super u2>, Object> V;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class a extends le.o implements we.q<j<? super R>, T[], ie.d<? super u2>, Object> {
            public int S;
            public /* synthetic */ Object T;
            public /* synthetic */ Object U;
            public final /* synthetic */ we.q<j<? super R>, T[], ie.d<? super u2>, Object> V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(we.q<? super j<? super R>, ? super T[], ? super ie.d<? super u2>, ? extends Object> qVar, ie.d<? super a> dVar) {
                super(3, dVar);
                this.V = qVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                Object h10 = ke.d.h();
                int i10 = this.S;
                if (i10 == 0) {
                    e1.n(obj);
                    we.q<j<? super R>, T[], ie.d<? super u2>, Object> qVar = this.V;
                    this.T = null;
                    this.S = 1;
                    if (qVar.y((j) this.T, (Object[]) this.U, this) == h10) {
                        return h10;
                    }
                } else if (i10 == 1) {
                    e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return u2.f25116a;
            }

            @fh.h
            /* renamed from: P */
            public final Object y(@fh.g j<? super R> jVar, @fh.g T[] tArr, @fh.h ie.d<? super u2> dVar) {
                a aVar = new a(this.V, dVar);
                aVar.T = jVar;
                aVar.U = tArr;
                return aVar.K(u2.f25116a);
            }

            @fh.h
            public final Object Q(@fh.g Object obj) {
                this.V.y((j) this.T, (Object[]) this.U, this);
                return u2.f25116a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(i<? extends T>[] iVarArr, we.q<? super j<? super R>, ? super T[], ? super ie.d<? super u2>, ? extends Object> qVar, ie.d<? super s> dVar) {
            super(2, dVar);
            this.U = iVarArr;
            this.V = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            s sVar = new s(this.U, this.V, dVar);
            sVar.T = obj;
            return sVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                i<T>[] iVarArr = this.U;
                we.a a10 = b0.r();
                l0.w();
                a aVar = new a(this.V, (ie.d<? super a>) null);
                this.S = 1;
                if (vf.m.a((j) this.T, iVarArr, a10, aVar, this) == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return u2.f25116a;
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g j<? super R> jVar, @fh.h ie.d<? super u2> dVar) {
            return ((s) H(jVar, dVar)).K(u2.f25116a);
        }

        @fh.h
        public final Object Q(@fh.g Object obj) {
            i<T>[] iVarArr = this.U;
            we.a a10 = b0.r();
            l0.w();
            a aVar = new a(this.V, (ie.d<? super a>) null);
            xe.i0.e(0);
            vf.m.a((j) this.T, iVarArr, a10, aVar, this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class t implements i<R> {
        public final /* synthetic */ i[] O;
        public final /* synthetic */ we.p P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ t T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(t tVar, ie.d dVar) {
                super(dVar);
                this.T = tVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public t(i[] iVarArr, we.p pVar) {
            this.O = iVarArr;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j<? super R> jVar, @fh.g ie.d<? super u2> dVar) {
            i[] iVarArr = this.O;
            we.a a10 = b0.r();
            l0.w();
            Object a11 = vf.m.a(jVar, iVarArr, a10, new u(this.P, (ie.d<? super u>) null), dVar);
            return a11 == ke.d.h() ? a11 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i[] iVarArr = this.O;
            we.a a10 = b0.r();
            l0.w();
            u uVar = new u(this.P, (ie.d<? super u>) null);
            xe.i0.e(0);
            vf.m.a(jVar, iVarArr, a10, uVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @le.f(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", i = {}, l = {262, 262}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@"}, d2 = {"T", "R", "Luf/j;", "", "it", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class u extends le.o implements we.q<j<? super R>, T[], ie.d<? super u2>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public /* synthetic */ Object U;
        public final /* synthetic */ we.p<T[], ie.d<? super R>, Object> V;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(we.p<? super T[], ? super ie.d<? super R>, ? extends Object> pVar, ie.d<? super u> dVar) {
            super(3, dVar);
            this.V = pVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
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
                goto L_0x003b
            L_0x0022:
                zd.e1.n(r6)
                java.lang.Object r6 = r5.T
                r1 = r6
                uf.j r1 = (uf.j) r1
                java.lang.Object r6 = r5.U
                java.lang.Object[] r6 = (java.lang.Object[]) r6
                we.p<T[], ie.d<? super R>, java.lang.Object> r4 = r5.V
                r5.T = r1
                r5.S = r3
                java.lang.Object r6 = r4.g0(r6, r5)
                if (r6 != r0) goto L_0x003b
                return r0
            L_0x003b:
                r3 = 0
                r5.T = r3
                r5.S = r2
                java.lang.Object r6 = r1.d(r6, r5)
                if (r6 != r0) goto L_0x0047
                return r0
            L_0x0047:
                zd.u2 r6 = zd.u2.f25116a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.b0.u.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object y(@fh.g j<? super R> jVar, @fh.g T[] tArr, @fh.h ie.d<? super u2> dVar) {
            u uVar = new u(this.V, dVar);
            uVar.T = jVar;
            uVar.U = tArr;
            return uVar.K(u2.f25116a);
        }

        @fh.h
        public final Object Q(@fh.g Object obj) {
            Object g02 = this.V.g0((Object[]) this.U, this);
            xe.i0.e(0);
            ((j) this.T).d(g02, this);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "c", "()Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    public static final class v extends n0 implements we.a {
        public static final v P = new v();

        public v() {
            super(0);
        }

        @fh.h
        /* renamed from: c */
        public final Void n() {
            return null;
        }
    }

    public static final /* synthetic */ <T, R> i<R> b(Iterable<? extends i<? extends T>> iterable, we.p<? super T[], ? super ie.d<? super R>, ? extends Object> pVar) {
        Object[] array = e0.Q5(iterable).toArray(new i[0]);
        if (array != null) {
            l0.w();
            return new f((i[]) array, pVar);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @fh.g
    public static final <T1, T2, T3, T4, T5, R> i<R> c(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g i<? extends T3> iVar3, @fh.g i<? extends T4> iVar4, @fh.g i<? extends T5> iVar5, @fh.g we.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super ie.d<? super R>, ? extends Object> tVar) {
        return new c(new i[]{iVar, iVar2, iVar3, iVar4, iVar5}, tVar);
    }

    @fh.g
    public static final <T1, T2, T3, T4, R> i<R> d(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g i<? extends T3> iVar3, @fh.g i<? extends T4> iVar4, @fh.g we.s<? super T1, ? super T2, ? super T3, ? super T4, ? super ie.d<? super R>, ? extends Object> sVar) {
        return new b(new i[]{iVar, iVar2, iVar3, iVar4}, sVar);
    }

    @fh.g
    public static final <T1, T2, T3, R> i<R> e(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g i<? extends T3> iVar3, @fh.g @zd.b we.r<? super T1, ? super T2, ? super T3, ? super ie.d<? super R>, ? extends Object> rVar) {
        return new a(new i[]{iVar, iVar2, iVar3}, rVar);
    }

    @fh.g
    public static final <T1, T2, R> i<R> f(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g we.q<? super T1, ? super T2, ? super ie.d<? super R>, ? extends Object> qVar) {
        return k.J0(iVar, iVar2, qVar);
    }

    public static final /* synthetic */ <T, R> i<R> h(Iterable<? extends i<? extends T>> iterable, @zd.b we.q<? super j<? super R>, ? super T[], ? super ie.d<? super u2>, ? extends Object> qVar) {
        Object[] array = e0.Q5(iterable).toArray(new i[0]);
        if (array != null) {
            l0.w();
            return k.I0(new r((i[]) array, qVar, (ie.d<? super r>) null));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @fh.g
    public static final <T1, T2, T3, T4, T5, R> i<R> i(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g i<? extends T3> iVar3, @fh.g i<? extends T4> iVar4, @fh.g i<? extends T5> iVar5, @fh.g @zd.b we.u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super ie.d<? super u2>, ? extends Object> uVar) {
        return k.I0(new p(new i[]{iVar, iVar2, iVar3, iVar4, iVar5}, (ie.d) null, uVar));
    }

    @fh.g
    public static final <T1, T2, T3, T4, R> i<R> j(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g i<? extends T3> iVar3, @fh.g i<? extends T4> iVar4, @fh.g @zd.b we.t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super ie.d<? super u2>, ? extends Object> tVar) {
        return k.I0(new o(new i[]{iVar, iVar2, iVar3, iVar4}, (ie.d) null, tVar));
    }

    @fh.g
    public static final <T1, T2, T3, R> i<R> k(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g i<? extends T3> iVar3, @fh.g @zd.b we.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super ie.d<? super u2>, ? extends Object> sVar) {
        return k.I0(new n(new i[]{iVar, iVar2, iVar3}, (ie.d) null, sVar));
    }

    @fh.g
    public static final <T1, T2, R> i<R> l(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g @zd.b we.r<? super j<? super R>, ? super T1, ? super T2, ? super ie.d<? super u2>, ? extends Object> rVar) {
        return k.I0(new m(new i[]{iVar, iVar2}, (ie.d) null, rVar));
    }

    @fh.g
    @ve.h(name = "flowCombine")
    public static final <T1, T2, R> i<R> p(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g we.q<? super T1, ? super T2, ? super ie.d<? super R>, ? extends Object> qVar) {
        return new d(iVar, iVar2, qVar);
    }

    @fh.g
    @ve.h(name = "flowCombineTransform")
    public static final <T1, T2, R> i<R> q(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g @zd.b we.r<? super j<? super R>, ? super T1, ? super T2, ? super ie.d<? super u2>, ? extends Object> rVar) {
        return k.I0(new l(new i[]{iVar, iVar2}, (ie.d) null, rVar));
    }

    public static final <T> we.a<T[]> r() {
        return v.P;
    }

    @fh.g
    public static final <T1, T2, R> i<R> s(@fh.g i<? extends T1> iVar, @fh.g i<? extends T2> iVar2, @fh.g we.q<? super T1, ? super T2, ? super ie.d<? super R>, ? extends Object> qVar) {
        return vf.m.b(iVar, iVar2, qVar);
    }
}
