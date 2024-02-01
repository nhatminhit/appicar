package hh;

import ih.c;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import jh.d;
import jh.f;
import jh.h;
import jh.m;
import jh.p;
import mh.g;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public DocumentBuilderFactory f19614a;

    public static class a implements g {

        /* renamed from: d  reason: collision with root package name */
        public static final String f19615d = "xmlns";

        /* renamed from: e  reason: collision with root package name */
        public static final String f19616e = "xmlns:";

        /* renamed from: a  reason: collision with root package name */
        public final Document f19617a;

        /* renamed from: b  reason: collision with root package name */
        public final Stack<HashMap<String, String>> f19618b;

        /* renamed from: c  reason: collision with root package name */
        public Element f19619c;

        public a(Document document) {
            Stack<HashMap<String, String>> stack = new Stack<>();
            this.f19618b = stack;
            this.f19617a = document;
            stack.push(new HashMap());
        }

        public void a(m mVar, int i10) {
            Document document;
            String u02;
            Node createComment;
            this.f19618b.push(new HashMap(this.f19618b.peek()));
            if (mVar instanceof h) {
                h hVar = (h) mVar;
                String str = (String) this.f19618b.peek().get(d(hVar));
                String j22 = hVar.j2();
                Element createElementNS = (str != null || !j22.contains(":")) ? this.f19617a.createElementNS(str, j22) : this.f19617a.createElementNS("", j22);
                c(hVar, createElementNS);
                Node node = this.f19619c;
                if (node == null) {
                    node = this.f19617a;
                }
                node.appendChild(createElementNS);
                this.f19619c = createElementNS;
                return;
            }
            if (mVar instanceof p) {
                document = this.f19617a;
                u02 = ((p) mVar).u0();
            } else if (mVar instanceof d) {
                createComment = this.f19617a.createComment(((d) mVar).u0());
                this.f19619c.appendChild(createComment);
            } else if (mVar instanceof jh.e) {
                document = this.f19617a;
                u02 = ((jh.e) mVar).u0();
            } else {
                return;
            }
            createComment = document.createTextNode(u02);
            this.f19619c.appendChild(createComment);
        }

        public void b(m mVar, int i10) {
            if ((mVar instanceof h) && (this.f19619c.getParentNode() instanceof Element)) {
                this.f19619c = (Element) this.f19619c.getParentNode();
            }
            this.f19618b.pop();
        }

        public final void c(m mVar, Element element) {
            Iterator<jh.a> it = mVar.p().iterator();
            while (it.hasNext()) {
                jh.a next = it.next();
                String replaceAll = next.getKey().replaceAll("[^-a-zA-Z0-9_:.]", "");
                if (replaceAll.matches("[a-zA-Z_:][-a-zA-Z0-9_:.]*")) {
                    element.setAttribute(replaceAll, next.getValue());
                }
            }
        }

        public final String d(h hVar) {
            String str;
            Iterator<jh.a> it = hVar.p().iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                jh.a next = it.next();
                String g10 = next.getKey();
                if (!g10.equals(f19615d)) {
                    if (g10.startsWith(f19616e)) {
                        str = g10.substring(6);
                    }
                }
                this.f19618b.peek().put(str, next.getValue());
            }
            int indexOf = hVar.j2().indexOf(":");
            return indexOf > 0 ? hVar.j2().substring(0, indexOf) : str;
        }
    }

    public e() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.f19614a = newInstance;
        newInstance.setNamespaceAware(true);
    }

    public static HashMap<String, String> a() {
        return h("html");
    }

    public static HashMap<String, String> b() {
        return h("xml");
    }

    public static String d(Document document, Map<String, String> map) {
        String str;
        try {
            DOMSource dOMSource = new DOMSource(document);
            StringWriter stringWriter = new StringWriter();
            StreamResult streamResult = new StreamResult(stringWriter);
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            if (map != null) {
                newTransformer.setOutputProperties(i(map));
            }
            if (document.getDoctype() != null) {
                DocumentType doctype = document.getDoctype();
                if (!c.f(doctype.getPublicId())) {
                    newTransformer.setOutputProperty("doctype-public", doctype.getPublicId());
                }
                if (!c.f(doctype.getSystemId())) {
                    str = doctype.getSystemId();
                } else if (doctype.getName().equalsIgnoreCase("html") && c.f(doctype.getPublicId()) && c.f(doctype.getSystemId())) {
                    str = "about:legacy-compat";
                }
                newTransformer.setOutputProperty("doctype-system", str);
            }
            newTransformer.transform(dOMSource, streamResult);
            return stringWriter.toString();
        } catch (TransformerException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Document e(f fVar) {
        return new e().g(fVar);
    }

    public static HashMap<String, String> h(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("method", str);
        return hashMap;
    }

    public static Properties i(Map<String, String> map) {
        Properties properties = new Properties();
        properties.putAll(map);
        return properties;
    }

    public String c(Document document) {
        return d(document, (Map<String, String>) null);
    }

    public void f(f fVar, Document document) {
        if (!c.f(fVar.E2())) {
            document.setDocumentURI(fVar.E2());
        }
        mh.f.c(new a(document), fVar.F0(0));
    }

    public Document g(f fVar) {
        d.j(fVar);
        try {
            DocumentBuilder newDocumentBuilder = this.f19614a.newDocumentBuilder();
            DOMImplementation dOMImplementation = newDocumentBuilder.getDOMImplementation();
            Document newDocument = newDocumentBuilder.newDocument();
            jh.g A2 = fVar.A2();
            if (A2 != null) {
                newDocument.appendChild(dOMImplementation.createDocumentType(A2.t0(), A2.u0(), A2.w0()));
            }
            newDocument.setXmlStandalone(true);
            f(fVar, newDocument);
            return newDocument;
        } catch (ParserConfigurationException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
