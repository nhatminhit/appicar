package kh;

import kh.i;

public enum l {
    Data {
        public void m(k kVar, a aVar) {
            l lVar;
            char s10 = aVar.s();
            if (s10 != 0) {
                if (s10 == '&') {
                    lVar = l.CharacterReferenceInData;
                } else if (s10 == '<') {
                    lVar = l.TagOpen;
                } else if (s10 != 65535) {
                    kVar.l(aVar.f());
                    return;
                } else {
                    kVar.m(new i.f());
                    return;
                }
                kVar.a(lVar);
                return;
            }
            kVar.u(this);
            kVar.k(aVar.e());
        }
    },
    CharacterReferenceInData {
        public void m(k kVar, a aVar) {
            l.n(kVar, l.Data);
        }
    },
    Rcdata {
        public void m(k kVar, a aVar) {
            l lVar;
            char s10 = aVar.s();
            if (s10 != 0) {
                if (s10 == '&') {
                    lVar = l.CharacterReferenceInRcdata;
                } else if (s10 == '<') {
                    lVar = l.RcdataLessthanSign;
                } else if (s10 != 65535) {
                    kVar.l(aVar.f());
                    return;
                } else {
                    kVar.m(new i.f());
                    return;
                }
                kVar.a(lVar);
                return;
            }
            kVar.u(this);
            aVar.a();
            kVar.k(65533);
        }
    },
    CharacterReferenceInRcdata {
        public void m(k kVar, a aVar) {
            l.n(kVar, l.Rcdata);
        }
    },
    Rawtext {
        public void m(k kVar, a aVar) {
            l.p(kVar, aVar, this, l.RawtextLessthanSign);
        }
    },
    ScriptData {
        public void m(k kVar, a aVar) {
            l.p(kVar, aVar, this, l.ScriptDataLessthanSign);
        }
    },
    PLAINTEXT {
        public void m(k kVar, a aVar) {
            char s10 = aVar.s();
            if (s10 == 0) {
                kVar.u(this);
                aVar.a();
                kVar.k(65533);
            } else if (s10 != 65535) {
                kVar.l(aVar.m(0));
            } else {
                kVar.m(new i.f());
            }
        }
    },
    TagOpen {
        public void m(k kVar, a aVar) {
            l lVar;
            l lVar2;
            char s10 = aVar.s();
            if (s10 == '!') {
                lVar = l.MarkupDeclarationOpen;
            } else if (s10 == '/') {
                lVar = l.EndTagOpen;
            } else if (s10 != '?') {
                if (aVar.E()) {
                    kVar.h(true);
                    lVar2 = l.TagName;
                } else {
                    kVar.u(this);
                    kVar.k('<');
                    lVar2 = l.Data;
                }
                kVar.y(lVar2);
                return;
            } else {
                kVar.e();
                lVar = l.BogusComment;
            }
            kVar.a(lVar);
        }
    },
    EndTagOpen {
        public void m(k kVar, a aVar) {
            l lVar;
            l lVar2;
            if (aVar.t()) {
                kVar.s(this);
                kVar.l("</");
                lVar2 = l.Data;
            } else if (aVar.E()) {
                kVar.h(false);
                lVar2 = l.TagName;
            } else {
                boolean y10 = aVar.y('>');
                kVar.u(this);
                if (y10) {
                    lVar = l.Data;
                } else {
                    kVar.e();
                    lVar = l.BogusComment;
                }
                kVar.a(lVar);
                return;
            }
            kVar.y(lVar2);
        }
    },
    TagName {
        public void m(k kVar, a aVar) {
            l lVar;
            kVar.f20338i.w(aVar.l());
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != ' ') {
                    if (e10 != '/') {
                        if (e10 == '<') {
                            aVar.L();
                            kVar.u(this);
                        } else if (e10 != '>') {
                            if (e10 == 65535) {
                                kVar.s(this);
                                lVar = l.Data;
                            } else if (!(e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13)) {
                                kVar.f20338i.v(e10);
                                return;
                            }
                        }
                        kVar.r();
                        lVar = l.Data;
                    } else {
                        lVar = l.SelfClosingStartTag;
                    }
                    kVar.y(lVar);
                    return;
                }
                lVar = l.BeforeAttributeName;
                kVar.y(lVar);
                return;
            }
            kVar.f20338i.w(l.f20366j1);
        }
    },
    RcdataLessthanSign {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.y('/')) {
                kVar.i();
                kVar.a(l.RCDATAEndTagOpen);
                return;
            }
            if (aVar.E() && kVar.b() != null) {
                if (!aVar.r("</" + kVar.b())) {
                    kVar.f20338i = kVar.h(false).C(kVar.b());
                    kVar.r();
                    aVar.L();
                    lVar = l.Data;
                    kVar.y(lVar);
                }
            }
            kVar.l("<");
            lVar = l.Rcdata;
            kVar.y(lVar);
        }
    },
    RCDATAEndTagOpen {
        public void m(k kVar, a aVar) {
            if (aVar.E()) {
                kVar.h(false);
                kVar.f20338i.v(aVar.s());
                kVar.f20337h.append(aVar.s());
                kVar.a(l.RCDATAEndTagName);
                return;
            }
            kVar.l("</");
            kVar.y(l.Rcdata);
        }
    },
    RCDATAEndTagName {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.E()) {
                String i10 = aVar.i();
                kVar.f20338i.w(i10);
                kVar.f20337h.append(i10);
                return;
            }
            char e10 = aVar.e();
            if (e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ') {
                if (kVar.w()) {
                    lVar = l.BeforeAttributeName;
                    kVar.y(lVar);
                    return;
                }
            } else if (e10 != '/') {
                if (e10 == '>' && kVar.w()) {
                    kVar.r();
                    lVar = l.Data;
                    kVar.y(lVar);
                    return;
                }
            } else if (kVar.w()) {
                lVar = l.SelfClosingStartTag;
                kVar.y(lVar);
                return;
            }
            q(kVar, aVar);
        }

        public final void q(k kVar, a aVar) {
            kVar.l("</" + kVar.f20337h.toString());
            aVar.L();
            kVar.y(l.Rcdata);
        }
    },
    RawtextLessthanSign {
        public void m(k kVar, a aVar) {
            if (aVar.y('/')) {
                kVar.i();
                kVar.a(l.RawtextEndTagOpen);
                return;
            }
            kVar.k('<');
            kVar.y(l.Rawtext);
        }
    },
    RawtextEndTagOpen {
        public void m(k kVar, a aVar) {
            l.o(kVar, aVar, l.RawtextEndTagName, l.Rawtext);
        }
    },
    RawtextEndTagName {
        public void m(k kVar, a aVar) {
            l.l(kVar, aVar, l.Rawtext);
        }
    },
    ScriptDataLessthanSign {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 == '!') {
                kVar.l("<!");
                lVar = l.ScriptDataEscapeStart;
            } else if (e10 != '/') {
                kVar.l("<");
                if (e10 != 65535) {
                    aVar.L();
                    lVar = l.ScriptData;
                } else {
                    kVar.s(this);
                    lVar = l.Data;
                }
            } else {
                kVar.i();
                lVar = l.ScriptDataEndTagOpen;
            }
            kVar.y(lVar);
        }
    },
    ScriptDataEndTagOpen {
        public void m(k kVar, a aVar) {
            l.o(kVar, aVar, l.ScriptDataEndTagName, l.ScriptData);
        }
    },
    ScriptDataEndTagName {
        public void m(k kVar, a aVar) {
            l.l(kVar, aVar, l.ScriptData);
        }
    },
    ScriptDataEscapeStart {
        public void m(k kVar, a aVar) {
            if (aVar.y('-')) {
                kVar.k('-');
                kVar.a(l.ScriptDataEscapeStartDash);
                return;
            }
            kVar.y(l.ScriptData);
        }
    },
    ScriptDataEscapeStartDash {
        public void m(k kVar, a aVar) {
            if (aVar.y('-')) {
                kVar.k('-');
                kVar.a(l.ScriptDataEscapedDashDash);
                return;
            }
            kVar.y(l.ScriptData);
        }
    },
    ScriptDataEscaped {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.t()) {
                kVar.s(this);
                kVar.y(l.Data);
                return;
            }
            char s10 = aVar.s();
            if (s10 != 0) {
                if (s10 == '-') {
                    kVar.k('-');
                    lVar = l.ScriptDataEscapedDash;
                } else if (s10 != '<') {
                    kVar.l(aVar.o('-', '<', 0));
                    return;
                } else {
                    lVar = l.ScriptDataEscapedLessthanSign;
                }
                kVar.a(lVar);
                return;
            }
            kVar.u(this);
            aVar.a();
            kVar.k(65533);
        }
    },
    ScriptDataEscapedDash {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.t()) {
                kVar.s(this);
                kVar.y(l.Data);
                return;
            }
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 == '-') {
                    kVar.k(e10);
                    lVar = l.ScriptDataEscapedDashDash;
                } else if (e10 == '<') {
                    lVar = l.ScriptDataEscapedLessthanSign;
                }
                kVar.y(lVar);
            }
            kVar.u(this);
            e10 = 65533;
            kVar.k(e10);
            lVar = l.ScriptDataEscaped;
            kVar.y(lVar);
        }
    },
    ScriptDataEscapedDashDash {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.t()) {
                kVar.s(this);
                kVar.y(l.Data);
                return;
            }
            char e10 = aVar.e();
            if (e10 == 0) {
                kVar.u(this);
                kVar.k(65533);
            } else if (e10 != '-') {
                if (e10 != '<') {
                    kVar.k(e10);
                    if (e10 == '>') {
                        lVar = l.ScriptData;
                    }
                } else {
                    lVar = l.ScriptDataEscapedLessthanSign;
                }
                kVar.y(lVar);
            } else {
                kVar.k(e10);
                return;
            }
            lVar = l.ScriptDataEscaped;
            kVar.y(lVar);
        }
    },
    ScriptDataEscapedLessthanSign {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.E()) {
                kVar.i();
                kVar.f20337h.append(aVar.s());
                kVar.l("<" + aVar.s());
                lVar = l.ScriptDataDoubleEscapeStart;
            } else if (aVar.y('/')) {
                kVar.i();
                lVar = l.ScriptDataEscapedEndTagOpen;
            } else {
                kVar.k('<');
                kVar.y(l.ScriptDataEscaped);
                return;
            }
            kVar.a(lVar);
        }
    },
    ScriptDataEscapedEndTagOpen {
        public void m(k kVar, a aVar) {
            if (aVar.E()) {
                kVar.h(false);
                kVar.f20338i.v(aVar.s());
                kVar.f20337h.append(aVar.s());
                kVar.a(l.ScriptDataEscapedEndTagName);
                return;
            }
            kVar.l("</");
            kVar.y(l.ScriptDataEscaped);
        }
    },
    ScriptDataEscapedEndTagName {
        public void m(k kVar, a aVar) {
            l.l(kVar, aVar, l.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscapeStart {
        public void m(k kVar, a aVar) {
            l.k(kVar, aVar, l.ScriptDataDoubleEscaped, l.ScriptDataEscaped);
        }
    },
    ScriptDataDoubleEscaped {
        public void m(k kVar, a aVar) {
            l lVar;
            char s10 = aVar.s();
            if (s10 != 0) {
                if (s10 == '-') {
                    kVar.k(s10);
                    lVar = l.ScriptDataDoubleEscapedDash;
                } else if (s10 == '<') {
                    kVar.k(s10);
                    lVar = l.ScriptDataDoubleEscapedLessthanSign;
                } else if (s10 != 65535) {
                    kVar.l(aVar.o('-', '<', 0));
                    return;
                } else {
                    kVar.s(this);
                    kVar.y(l.Data);
                    return;
                }
                kVar.a(lVar);
                return;
            }
            kVar.u(this);
            aVar.a();
            kVar.k(65533);
        }
    },
    ScriptDataDoubleEscapedDash {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 == '-') {
                    kVar.k(e10);
                    lVar = l.ScriptDataDoubleEscapedDashDash;
                } else if (e10 == '<') {
                    kVar.k(e10);
                    lVar = l.ScriptDataDoubleEscapedLessthanSign;
                } else if (e10 == 65535) {
                    kVar.s(this);
                    lVar = l.Data;
                }
                kVar.y(lVar);
            }
            kVar.u(this);
            e10 = 65533;
            kVar.k(e10);
            lVar = l.ScriptDataDoubleEscaped;
            kVar.y(lVar);
        }
    },
    ScriptDataDoubleEscapedDashDash {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 == 0) {
                kVar.u(this);
                e10 = 65533;
            } else if (e10 != '-') {
                if (e10 == '<') {
                    kVar.k(e10);
                    lVar = l.ScriptDataDoubleEscapedLessthanSign;
                } else if (e10 == '>') {
                    kVar.k(e10);
                    lVar = l.ScriptData;
                } else if (e10 == 65535) {
                    kVar.s(this);
                    lVar = l.Data;
                }
                kVar.y(lVar);
            } else {
                kVar.k(e10);
                return;
            }
            kVar.k(e10);
            lVar = l.ScriptDataDoubleEscaped;
            kVar.y(lVar);
        }
    },
    ScriptDataDoubleEscapedLessthanSign {
        public void m(k kVar, a aVar) {
            if (aVar.y('/')) {
                kVar.k('/');
                kVar.i();
                kVar.a(l.ScriptDataDoubleEscapeEnd);
                return;
            }
            kVar.y(l.ScriptDataDoubleEscaped);
        }
    },
    ScriptDataDoubleEscapeEnd {
        public void m(k kVar, a aVar) {
            l.k(kVar, aVar, l.ScriptDataEscaped, l.ScriptDataDoubleEscaped);
        }
    },
    BeforeAttributeName {
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
            r3.r();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m(kh.k r3, kh.a r4) {
            /*
                r2 = this;
                char r0 = r4.e()
                if (r0 == 0) goto L_0x005b
                r1 = 32
                if (r0 == r1) goto L_0x0069
                r1 = 34
                if (r0 == r1) goto L_0x004d
                r1 = 39
                if (r0 == r1) goto L_0x004d
                r1 = 47
                if (r0 == r1) goto L_0x004a
                r1 = 65535(0xffff, float:9.1834E-41)
                if (r0 == r1) goto L_0x0046
                r1 = 9
                if (r0 == r1) goto L_0x0069
                r1 = 10
                if (r0 == r1) goto L_0x0069
                r1 = 12
                if (r0 == r1) goto L_0x0069
                r1 = 13
                if (r0 == r1) goto L_0x0069
                switch(r0) {
                    case 60: goto L_0x0037;
                    case 61: goto L_0x004d;
                    case 62: goto L_0x003d;
                    default: goto L_0x002e;
                }
            L_0x002e:
                kh.i$i r0 = r3.f20338i
                r0.D()
                r4.L()
                goto L_0x0066
            L_0x0037:
                r4.L()
                r3.u(r2)
            L_0x003d:
                r3.r()
            L_0x0040:
                kh.l r4 = kh.l.Data
            L_0x0042:
                r3.y(r4)
                goto L_0x0069
            L_0x0046:
                r3.s(r2)
                goto L_0x0040
            L_0x004a:
                kh.l r4 = kh.l.SelfClosingStartTag
                goto L_0x0042
            L_0x004d:
                r3.u(r2)
                kh.i$i r4 = r3.f20338i
                r4.D()
                kh.i$i r4 = r3.f20338i
                r4.p(r0)
                goto L_0x0066
            L_0x005b:
                r4.L()
                r3.u(r2)
                kh.i$i r4 = r3.f20338i
                r4.D()
            L_0x0066:
                kh.l r4 = kh.l.AttributeName
                goto L_0x0042
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.l.a0.m(kh.k, kh.a):void");
        }
    },
    AttributeName {
        public void m(k kVar, a aVar) {
            i.C0348i iVar;
            l lVar;
            kVar.f20338i.q(aVar.p(l.f20360g1));
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != ' ') {
                    if (!(e10 == '\"' || e10 == '\'')) {
                        if (e10 != '/') {
                            if (e10 != 65535) {
                                if (!(e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13)) {
                                    switch (e10) {
                                        case '<':
                                            break;
                                        case '=':
                                            lVar = l.BeforeAttributeValue;
                                            break;
                                        case '>':
                                            kVar.r();
                                            break;
                                    }
                                }
                            } else {
                                kVar.s(this);
                            }
                            lVar = l.Data;
                        } else {
                            lVar = l.SelfClosingStartTag;
                        }
                        kVar.y(lVar);
                        return;
                    }
                    kVar.u(this);
                    iVar = kVar.f20338i;
                }
                lVar = l.AfterAttributeName;
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            iVar = kVar.f20338i;
            e10 = 65533;
            iVar.p(e10);
        }
    },
    AfterAttributeName {
        public void m(k kVar, a aVar) {
            l lVar;
            i.C0348i iVar;
            char e10 = aVar.e();
            if (e10 == 0) {
                kVar.u(this);
                iVar = kVar.f20338i;
                e10 = 65533;
            } else if (e10 != ' ') {
                if (!(e10 == '\"' || e10 == '\'')) {
                    if (e10 != '/') {
                        if (e10 != 65535) {
                            if (e10 != 9 && e10 != 10 && e10 != 12 && e10 != 13) {
                                switch (e10) {
                                    case '<':
                                        break;
                                    case '=':
                                        lVar = l.BeforeAttributeValue;
                                        break;
                                    case '>':
                                        kVar.r();
                                        break;
                                    default:
                                        kVar.f20338i.D();
                                        aVar.L();
                                        break;
                                }
                            } else {
                                return;
                            }
                        } else {
                            kVar.s(this);
                        }
                        lVar = l.Data;
                    } else {
                        lVar = l.SelfClosingStartTag;
                    }
                    kVar.y(lVar);
                }
                kVar.u(this);
                kVar.f20338i.D();
                iVar = kVar.f20338i;
            } else {
                return;
            }
            iVar.p(e10);
            lVar = l.AttributeName;
            kVar.y(lVar);
        }
    },
    BeforeAttributeValue {
        public void m(k kVar, a aVar) {
            l lVar;
            i.C0348i iVar;
            char e10 = aVar.e();
            if (e10 == 0) {
                kVar.u(this);
                iVar = kVar.f20338i;
                e10 = 65533;
            } else if (e10 != ' ') {
                if (e10 != '\"') {
                    if (e10 != '`') {
                        if (e10 == 65535) {
                            kVar.s(this);
                        } else if (e10 != 9 && e10 != 10 && e10 != 12 && e10 != 13) {
                            if (e10 != '&') {
                                if (e10 != '\'') {
                                    switch (e10) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            kVar.u(this);
                                            break;
                                    }
                                } else {
                                    lVar = l.AttributeValue_singleQuoted;
                                }
                            }
                            aVar.L();
                            lVar = l.AttributeValue_unquoted;
                        } else {
                            return;
                        }
                        kVar.r();
                        lVar = l.Data;
                    }
                    kVar.u(this);
                    iVar = kVar.f20338i;
                } else {
                    lVar = l.AttributeValue_doubleQuoted;
                }
                kVar.y(lVar);
            } else {
                return;
            }
            iVar.r(e10);
            lVar = l.AttributeValue_unquoted;
            kVar.y(lVar);
        }
    },
    AttributeValue_doubleQuoted {
        public void m(k kVar, a aVar) {
            i.C0348i iVar;
            l lVar;
            String p10 = aVar.p(l.f20358f1);
            if (p10.length() > 0) {
                kVar.f20338i.s(p10);
            } else {
                kVar.f20338i.G();
            }
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 == '\"') {
                    lVar = l.AfterAttributeValue_quoted;
                } else if (e10 == '&') {
                    int[] d10 = kVar.d('\"', true);
                    i.C0348i iVar2 = kVar.f20338i;
                    if (d10 != null) {
                        iVar2.u(d10);
                        return;
                    } else {
                        iVar2.r('&');
                        return;
                    }
                } else if (e10 != 65535) {
                    iVar = kVar.f20338i;
                } else {
                    kVar.s(this);
                    lVar = l.Data;
                }
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            iVar = kVar.f20338i;
            e10 = 65533;
            iVar.r(e10);
        }
    },
    AttributeValue_singleQuoted {
        public void m(k kVar, a aVar) {
            i.C0348i iVar;
            l lVar;
            String p10 = aVar.p(l.f20356e1);
            if (p10.length() > 0) {
                kVar.f20338i.s(p10);
            } else {
                kVar.f20338i.G();
            }
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 == 65535) {
                    kVar.s(this);
                    lVar = l.Data;
                } else if (e10 == '&') {
                    int[] d10 = kVar.d('\'', true);
                    i.C0348i iVar2 = kVar.f20338i;
                    if (d10 != null) {
                        iVar2.u(d10);
                        return;
                    } else {
                        iVar2.r('&');
                        return;
                    }
                } else if (e10 != '\'') {
                    iVar = kVar.f20338i;
                } else {
                    lVar = l.AfterAttributeValue_quoted;
                }
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            iVar = kVar.f20338i;
            e10 = 65533;
            iVar.r(e10);
        }
    },
    AttributeValue_unquoted {
        public void m(k kVar, a aVar) {
            i.C0348i iVar;
            l lVar;
            String p10 = aVar.p(l.f20362h1);
            if (p10.length() > 0) {
                kVar.f20338i.s(p10);
            }
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != ' ') {
                    if (!(e10 == '\"' || e10 == '`')) {
                        if (e10 == 65535) {
                            kVar.s(this);
                        } else if (!(e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13)) {
                            if (e10 != '&') {
                                if (e10 != '\'') {
                                    switch (e10) {
                                        case '<':
                                        case '=':
                                            break;
                                        case '>':
                                            kVar.r();
                                            break;
                                    }
                                }
                            } else {
                                int[] d10 = kVar.d('>', true);
                                i.C0348i iVar2 = kVar.f20338i;
                                if (d10 != null) {
                                    iVar2.u(d10);
                                    return;
                                } else {
                                    iVar2.r('&');
                                    return;
                                }
                            }
                        }
                        lVar = l.Data;
                        kVar.y(lVar);
                        return;
                    }
                    kVar.u(this);
                    iVar = kVar.f20338i;
                }
                lVar = l.BeforeAttributeName;
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            iVar = kVar.f20338i;
            e10 = 65533;
            iVar.r(e10);
        }
    },
    AfterAttributeValue_quoted {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (!(e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ')) {
                if (e10 != '/') {
                    if (e10 == '>') {
                        kVar.r();
                    } else if (e10 != 65535) {
                        aVar.L();
                        kVar.u(this);
                    } else {
                        kVar.s(this);
                    }
                    lVar = l.Data;
                } else {
                    lVar = l.SelfClosingStartTag;
                }
                kVar.y(lVar);
            }
            lVar = l.BeforeAttributeName;
            kVar.y(lVar);
        }
    },
    SelfClosingStartTag {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 == '>') {
                kVar.f20338i.f20321i = true;
                kVar.r();
            } else if (e10 != 65535) {
                aVar.L();
                kVar.u(this);
                lVar = l.BeforeAttributeName;
                kVar.y(lVar);
            } else {
                kVar.s(this);
            }
            lVar = l.Data;
            kVar.y(lVar);
        }
    },
    BogusComment {
        public void m(k kVar, a aVar) {
            aVar.L();
            kVar.f20343n.q(aVar.m('>'));
            char e10 = aVar.e();
            if (e10 == '>' || e10 == 65535) {
                kVar.p();
                kVar.y(l.Data);
            }
        }
    },
    MarkupDeclarationOpen {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.w("--")) {
                kVar.f();
                lVar = l.CommentStart;
            } else if (aVar.x("DOCTYPE")) {
                lVar = l.Doctype;
            } else if (aVar.w("[CDATA[")) {
                kVar.i();
                lVar = l.CdataSection;
            } else {
                kVar.u(this);
                kVar.e();
                kVar.a(l.BogusComment);
                return;
            }
            kVar.y(lVar);
        }
    },
    CommentStart {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != '-') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        aVar.L();
                    } else {
                        kVar.s(this);
                    }
                    kVar.p();
                    lVar = l.Data;
                } else {
                    lVar = l.CommentStartDash;
                }
                kVar.y(lVar);
            }
            kVar.u(this);
            kVar.f20343n.p(65533);
            lVar = l.Comment;
            kVar.y(lVar);
        }
    },
    CommentStartDash {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != '-') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        kVar.f20343n.p(e10);
                    } else {
                        kVar.s(this);
                    }
                    kVar.p();
                    lVar = l.Data;
                } else {
                    lVar = l.CommentStartDash;
                }
                kVar.y(lVar);
            }
            kVar.u(this);
            kVar.f20343n.p(65533);
            lVar = l.Comment;
            kVar.y(lVar);
        }
    },
    Comment {
        public void m(k kVar, a aVar) {
            char s10 = aVar.s();
            if (s10 == 0) {
                kVar.u(this);
                aVar.a();
                kVar.f20343n.p(65533);
            } else if (s10 == '-') {
                kVar.a(l.CommentEndDash);
            } else if (s10 != 65535) {
                kVar.f20343n.q(aVar.o('-', 0));
            } else {
                kVar.s(this);
                kVar.p();
                kVar.y(l.Data);
            }
        }
    },
    CommentEndDash {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 == '-') {
                    lVar = l.CommentEnd;
                } else if (e10 != 65535) {
                    kVar.f20343n.p('-').p(e10);
                } else {
                    kVar.s(this);
                    kVar.p();
                    lVar = l.Data;
                }
                kVar.y(lVar);
            }
            kVar.u(this);
            kVar.f20343n.p('-').p(65533);
            lVar = l.Comment;
            kVar.y(lVar);
        }
    },
    CommentEnd {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 == '!') {
                    kVar.u(this);
                    lVar = l.CommentEndBang;
                } else if (e10 != '-') {
                    if (e10 != '>') {
                        if (e10 != 65535) {
                            kVar.u(this);
                            kVar.f20343n.q("--").p(e10);
                        } else {
                            kVar.s(this);
                        }
                    }
                    kVar.p();
                    lVar = l.Data;
                } else {
                    kVar.u(this);
                    kVar.f20343n.p('-');
                    return;
                }
                kVar.y(lVar);
            }
            kVar.u(this);
            kVar.f20343n.q("--").p(65533);
            lVar = l.Comment;
            kVar.y(lVar);
        }
    },
    CommentEndBang {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != '-') {
                    if (e10 != '>') {
                        if (e10 != 65535) {
                            kVar.f20343n.q("--!").p(e10);
                        } else {
                            kVar.s(this);
                        }
                    }
                    kVar.p();
                    lVar = l.Data;
                } else {
                    kVar.f20343n.q("--!");
                    lVar = l.CommentEndDash;
                }
                kVar.y(lVar);
            }
            kVar.u(this);
            kVar.f20343n.q("--!").p(65533);
            lVar = l.Comment;
            kVar.y(lVar);
        }
    },
    Doctype {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (!(e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ')) {
                if (e10 != '>') {
                    if (e10 != 65535) {
                        kVar.u(this);
                    } else {
                        kVar.s(this);
                    }
                }
                kVar.u(this);
                kVar.g();
                kVar.f20342m.f20313f = true;
                kVar.q();
                lVar = l.Data;
                kVar.y(lVar);
            }
            lVar = l.BeforeDoctypeName;
            kVar.y(lVar);
        }
    },
    BeforeDoctypeName {
        public void m(k kVar, a aVar) {
            l lVar;
            if (aVar.E()) {
                kVar.g();
                kVar.y(l.DoctypeName);
                return;
            }
            char e10 = aVar.e();
            if (e10 == 0) {
                kVar.u(this);
                kVar.g();
                kVar.f20342m.f20309b.append(65533);
            } else if (e10 == ' ') {
                return;
            } else {
                if (e10 == 65535) {
                    kVar.s(this);
                    kVar.g();
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    lVar = l.Data;
                    kVar.y(lVar);
                } else if (e10 != 9 && e10 != 10 && e10 != 12 && e10 != 13) {
                    kVar.g();
                    kVar.f20342m.f20309b.append(e10);
                } else {
                    return;
                }
            }
            lVar = l.DoctypeName;
            kVar.y(lVar);
        }
    },
    DoctypeName {
        public void m(k kVar, a aVar) {
            StringBuilder sb2;
            l lVar;
            if (aVar.E()) {
                kVar.f20342m.f20309b.append(aVar.i());
                return;
            }
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != ' ') {
                    if (e10 != '>') {
                        if (e10 == 65535) {
                            kVar.s(this);
                            kVar.f20342m.f20313f = true;
                        } else if (!(e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13)) {
                            sb2 = kVar.f20342m.f20309b;
                        }
                    }
                    kVar.q();
                    lVar = l.Data;
                    kVar.y(lVar);
                    return;
                }
                lVar = l.AfterDoctypeName;
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            sb2 = kVar.f20342m.f20309b;
            e10 = 65533;
            sb2.append(e10);
        }
    },
    AfterDoctypeName {
        public void m(k kVar, a aVar) {
            l lVar;
            l lVar2;
            if (aVar.t()) {
                kVar.s(this);
                kVar.f20342m.f20313f = true;
                kVar.q();
                kVar.y(l.Data);
            } else if (aVar.A(9, 10, 13, 12, p7.f.f11698i)) {
                aVar.a();
            } else {
                if (aVar.y('>')) {
                    kVar.q();
                    lVar = l.Data;
                } else {
                    if (aVar.x(jh.g.T)) {
                        kVar.f20342m.f20310c = jh.g.T;
                        lVar2 = l.AfterDoctypePublicKeyword;
                    } else if (aVar.x(jh.g.U)) {
                        kVar.f20342m.f20310c = jh.g.U;
                        lVar2 = l.AfterDoctypeSystemKeyword;
                    } else {
                        kVar.u(this);
                        kVar.f20342m.f20313f = true;
                        lVar = l.BogusDoctype;
                    }
                    kVar.y(lVar2);
                    return;
                }
                kVar.a(lVar);
            }
        }
    },
    AfterDoctypePublicKeyword {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ') {
                lVar = l.BeforeDoctypePublicIdentifier;
            } else if (e10 == '\"') {
                kVar.u(this);
                lVar = l.DoctypePublicIdentifier_doubleQuoted;
            } else if (e10 != '\'') {
                if (e10 == '>') {
                    kVar.u(this);
                } else if (e10 != 65535) {
                    kVar.u(this);
                    kVar.f20342m.f20313f = true;
                    lVar = l.BogusDoctype;
                } else {
                    kVar.s(this);
                }
                kVar.f20342m.f20313f = true;
                kVar.q();
                lVar = l.Data;
            } else {
                kVar.u(this);
                lVar = l.DoctypePublicIdentifier_singleQuoted;
            }
            kVar.y(lVar);
        }
    },
    BeforeDoctypePublicIdentifier {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 9 && e10 != 10 && e10 != 12 && e10 != 13 && e10 != ' ') {
                if (e10 == '\"') {
                    lVar = l.DoctypePublicIdentifier_doubleQuoted;
                } else if (e10 != '\'') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        kVar.u(this);
                        kVar.f20342m.f20313f = true;
                        lVar = l.BogusDoctype;
                    } else {
                        kVar.s(this);
                    }
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    lVar = l.Data;
                } else {
                    lVar = l.DoctypePublicIdentifier_singleQuoted;
                }
                kVar.y(lVar);
            }
        }
    },
    DoctypePublicIdentifier_doubleQuoted {
        public void m(k kVar, a aVar) {
            StringBuilder sb2;
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != '\"') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        sb2 = kVar.f20342m.f20311d;
                    } else {
                        kVar.s(this);
                    }
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    lVar = l.Data;
                } else {
                    lVar = l.AfterDoctypePublicIdentifier;
                }
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            sb2 = kVar.f20342m.f20311d;
            e10 = 65533;
            sb2.append(e10);
        }
    },
    DoctypePublicIdentifier_singleQuoted {
        public void m(k kVar, a aVar) {
            StringBuilder sb2;
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != '\'') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        sb2 = kVar.f20342m.f20311d;
                    } else {
                        kVar.s(this);
                    }
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    lVar = l.Data;
                } else {
                    lVar = l.AfterDoctypePublicIdentifier;
                }
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            sb2 = kVar.f20342m.f20311d;
            e10 = 65533;
            sb2.append(e10);
        }
    },
    AfterDoctypePublicIdentifier {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ') {
                lVar = l.BetweenDoctypePublicAndSystemIdentifiers;
            } else if (e10 == '\"') {
                kVar.u(this);
                lVar = l.DoctypeSystemIdentifier_doubleQuoted;
            } else if (e10 != '\'') {
                if (e10 != '>') {
                    if (e10 != 65535) {
                        kVar.u(this);
                        kVar.f20342m.f20313f = true;
                        lVar = l.BogusDoctype;
                    } else {
                        kVar.s(this);
                        kVar.f20342m.f20313f = true;
                    }
                }
                kVar.q();
                lVar = l.Data;
            } else {
                kVar.u(this);
                lVar = l.DoctypeSystemIdentifier_singleQuoted;
            }
            kVar.y(lVar);
        }
    },
    BetweenDoctypePublicAndSystemIdentifiers {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 9 && e10 != 10 && e10 != 12 && e10 != 13 && e10 != ' ') {
                if (e10 == '\"') {
                    kVar.u(this);
                    lVar = l.DoctypeSystemIdentifier_doubleQuoted;
                } else if (e10 != '\'') {
                    if (e10 != '>') {
                        if (e10 != 65535) {
                            kVar.u(this);
                            kVar.f20342m.f20313f = true;
                            lVar = l.BogusDoctype;
                        } else {
                            kVar.s(this);
                            kVar.f20342m.f20313f = true;
                        }
                    }
                    kVar.q();
                    lVar = l.Data;
                } else {
                    kVar.u(this);
                    lVar = l.DoctypeSystemIdentifier_singleQuoted;
                }
                kVar.y(lVar);
            }
        }
    },
    AfterDoctypeSystemKeyword {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ') {
                lVar = l.BeforeDoctypeSystemIdentifier;
            } else if (e10 == '\"') {
                kVar.u(this);
                lVar = l.DoctypeSystemIdentifier_doubleQuoted;
            } else if (e10 != '\'') {
                if (e10 == '>') {
                    kVar.u(this);
                } else if (e10 != 65535) {
                    kVar.u(this);
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    return;
                } else {
                    kVar.s(this);
                }
                kVar.f20342m.f20313f = true;
                kVar.q();
                lVar = l.Data;
            } else {
                kVar.u(this);
                lVar = l.DoctypeSystemIdentifier_singleQuoted;
            }
            kVar.y(lVar);
        }
    },
    BeforeDoctypeSystemIdentifier {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 9 && e10 != 10 && e10 != 12 && e10 != 13 && e10 != ' ') {
                if (e10 == '\"') {
                    lVar = l.DoctypeSystemIdentifier_doubleQuoted;
                } else if (e10 != '\'') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        kVar.u(this);
                        kVar.f20342m.f20313f = true;
                        lVar = l.BogusDoctype;
                    } else {
                        kVar.s(this);
                    }
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    lVar = l.Data;
                } else {
                    lVar = l.DoctypeSystemIdentifier_singleQuoted;
                }
                kVar.y(lVar);
            }
        }
    },
    DoctypeSystemIdentifier_doubleQuoted {
        public void m(k kVar, a aVar) {
            StringBuilder sb2;
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != '\"') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        sb2 = kVar.f20342m.f20312e;
                    } else {
                        kVar.s(this);
                    }
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    lVar = l.Data;
                } else {
                    lVar = l.AfterDoctypeSystemIdentifier;
                }
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            sb2 = kVar.f20342m.f20312e;
            e10 = 65533;
            sb2.append(e10);
        }
    },
    DoctypeSystemIdentifier_singleQuoted {
        public void m(k kVar, a aVar) {
            StringBuilder sb2;
            l lVar;
            char e10 = aVar.e();
            if (e10 != 0) {
                if (e10 != '\'') {
                    if (e10 == '>') {
                        kVar.u(this);
                    } else if (e10 != 65535) {
                        sb2 = kVar.f20342m.f20312e;
                    } else {
                        kVar.s(this);
                    }
                    kVar.f20342m.f20313f = true;
                    kVar.q();
                    lVar = l.Data;
                } else {
                    lVar = l.AfterDoctypeSystemIdentifier;
                }
                kVar.y(lVar);
                return;
            }
            kVar.u(this);
            sb2 = kVar.f20342m.f20312e;
            e10 = 65533;
            sb2.append(e10);
        }
    },
    AfterDoctypeSystemIdentifier {
        public void m(k kVar, a aVar) {
            l lVar;
            char e10 = aVar.e();
            if (e10 != 9 && e10 != 10 && e10 != 12 && e10 != 13 && e10 != ' ') {
                if (e10 != '>') {
                    if (e10 != 65535) {
                        kVar.u(this);
                        lVar = l.BogusDoctype;
                        kVar.y(lVar);
                    }
                    kVar.s(this);
                    kVar.f20342m.f20313f = true;
                }
                kVar.q();
                lVar = l.Data;
                kVar.y(lVar);
            }
        }
    },
    BogusDoctype {
        public void m(k kVar, a aVar) {
            char e10 = aVar.e();
            if (e10 == '>' || e10 == 65535) {
                kVar.q();
                kVar.y(l.Data);
            }
        }
    },
    CdataSection {
        public void m(k kVar, a aVar) {
            kVar.f20337h.append(aVar.n("]]>"));
            if (aVar.w("]]>") || aVar.t()) {
                kVar.m(new i.b(kVar.f20337h.toString()));
                kVar.y(l.Data);
            }
        }
    };
    

    /* renamed from: d1  reason: collision with root package name */
    public static final char f20354d1 = '\u0000';

    /* renamed from: e1  reason: collision with root package name */
    public static final char[] f20356e1 = null;

    /* renamed from: f1  reason: collision with root package name */
    public static final char[] f20358f1 = null;

    /* renamed from: g1  reason: collision with root package name */
    public static final char[] f20360g1 = null;

    /* renamed from: h1  reason: collision with root package name */
    public static final char[] f20362h1 = null;

    /* renamed from: i1  reason: collision with root package name */
    public static final char f20364i1 = '�';

    /* renamed from: j1  reason: collision with root package name */
    public static final String f20366j1 = null;

    /* renamed from: k1  reason: collision with root package name */
    public static final char f20368k1 = '￿';

    /* access modifiers changed from: public */
    static {
        f20356e1 = new char[]{0, '&', '\''};
        f20358f1 = new char[]{0, '\"', '&'};
        f20360g1 = new char[]{0, 9, 10, 12, 13, p7.f.f11698i, '\"', '\'', '/', '<', '=', '>'};
        f20362h1 = new char[]{0, 9, 10, 12, 13, p7.f.f11698i, '\"', '&', '\'', '<', '=', '>', '`'};
        f20366j1 = String.valueOf(65533);
    }

    public static void k(k kVar, a aVar, l lVar, l lVar2) {
        if (aVar.E()) {
            String i10 = aVar.i();
            kVar.f20337h.append(i10);
            kVar.l(i10);
            return;
        }
        char e10 = aVar.e();
        if (e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ' || e10 == '/' || e10 == '>') {
            if (kVar.f20337h.toString().equals("script")) {
                kVar.y(lVar);
            } else {
                kVar.y(lVar2);
            }
            kVar.k(e10);
            return;
        }
        aVar.L();
        kVar.y(lVar2);
    }

    public static void l(k kVar, a aVar, l lVar) {
        l lVar2;
        if (aVar.E()) {
            String i10 = aVar.i();
            kVar.f20338i.w(i10);
            kVar.f20337h.append(i10);
            return;
        }
        boolean z10 = false;
        boolean z11 = true;
        if (kVar.w() && !aVar.t()) {
            char e10 = aVar.e();
            if (e10 == 9 || e10 == 10 || e10 == 12 || e10 == 13 || e10 == ' ') {
                lVar2 = BeforeAttributeName;
            } else if (e10 == '/') {
                lVar2 = SelfClosingStartTag;
            } else if (e10 != '>') {
                kVar.f20337h.append(e10);
                z10 = true;
                z11 = z10;
            } else {
                kVar.r();
                lVar2 = Data;
            }
            kVar.y(lVar2);
            z11 = z10;
        }
        if (z11) {
            kVar.l("</" + kVar.f20337h.toString());
            kVar.y(lVar);
        }
    }

    public static void n(k kVar, l lVar) {
        int[] d10 = kVar.d((Character) null, false);
        if (d10 == null) {
            kVar.k('&');
        } else {
            kVar.o(d10);
        }
        kVar.y(lVar);
    }

    public static void o(k kVar, a aVar, l lVar, l lVar2) {
        if (aVar.E()) {
            kVar.h(false);
            kVar.y(lVar);
            return;
        }
        kVar.l("</");
        kVar.y(lVar2);
    }

    public static void p(k kVar, a aVar, l lVar, l lVar2) {
        char s10 = aVar.s();
        if (s10 == 0) {
            kVar.u(lVar);
            aVar.a();
            kVar.k(65533);
        } else if (s10 == '<') {
            kVar.a(lVar2);
        } else if (s10 != 65535) {
            kVar.l(aVar.k());
        } else {
            kVar.m(new i.f());
        }
    }

    public abstract void m(k kVar, a aVar);
}
