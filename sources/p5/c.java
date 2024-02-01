package p5;

import i5.g;
import java.io.StringReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import n5.n;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

public abstract class c<T> extends n<T> {
    public static final long U = 1;
    public static final DocumentBuilderFactory V;

    public static class a extends c<Document> {
        public static final long W = 1;

        public a() {
            super(Document.class);
        }

        /* renamed from: L0 */
        public Document E0(String str, g gVar) throws IllegalArgumentException {
            return K0(str);
        }
    }

    public static class b extends c<Node> {
        public static final long W = 1;

        public b() {
            super(Node.class);
        }

        /* renamed from: L0 */
        public Node E0(String str, g gVar) throws IllegalArgumentException {
            return K0(str);
        }
    }

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setExpandEntityReferences(false);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
        } catch (Error | ParserConfigurationException unused) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
        } catch (Throwable unused2) {
        }
        try {
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
        } catch (Throwable unused3) {
        }
        V = newInstance;
    }

    public c(Class<T> cls) {
        super(cls);
    }

    public abstract T E0(String str, g gVar);

    public DocumentBuilder J0() throws ParserConfigurationException {
        return V.newDocumentBuilder();
    }

    public final Document K0(String str) throws IllegalArgumentException {
        try {
            return J0().parse(new InputSource(new StringReader(str)));
        } catch (Exception e10) {
            throw new IllegalArgumentException("Failed to parse JSON String as XML: " + e10.getMessage(), e10);
        }
    }
}
