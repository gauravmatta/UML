package simple.mail.transform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.RuntimeTagElement;
import org.eclipse.jet.taglib.TagInfo;

public class _jet_letterhtml implements JET2Template {
    private static final String _jetns_c = "org.eclipse.jet.controlTags"; //$NON-NLS-1$

    public _jet_letterhtml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$
    
    private static final TagInfo _td_c_get_20_9 = new TagInfo("c:get", //$NON-NLS-1$
            20, 9,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$mailing/@firstName", //$NON-NLS-1$
            } );
    private static final TagInfo _td_c_get_20_48 = new TagInfo("c:get", //$NON-NLS-1$
            20, 48,
            new String[] {
                "select", //$NON-NLS-1$
            },
            new String[] {
                "$mailing/@lastName", //$NON-NLS-1$
            } );

    public void generate(final JET2Context context, final JET2Writer __out) {
        JET2Writer out = __out;
        out.write("<!DOCTYPE html>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<title>Text Example</title>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<style>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("div.container {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("background-color: #ffffff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("div.container p {");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("font-family: Arial;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("font-size: 14px;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("font-style: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("font-weight: normal;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("text-decoration: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("text-transform: none;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("color: #000000;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("background-color: #ffffff;");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("}");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</style>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write(NL);         
        out.write("<div class=\"container\">");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<p>Dear ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_9 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_9); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_9.setRuntimeParent(null);
        _jettag_c_get_20_9.setTagInfo(_td_c_get_20_9);
        _jettag_c_get_20_9.doStart(context, out);
        _jettag_c_get_20_9.doEnd();
        out.write(" ");  //$NON-NLS-1$        
        RuntimeTagElement _jettag_c_get_20_48 = context.getTagFactory().createRuntimeTag(_jetns_c, "get", "c:get", _td_c_get_20_48); //$NON-NLS-1$ //$NON-NLS-2$
        _jettag_c_get_20_48.setRuntimeParent(null);
        _jettag_c_get_20_48.setTagInfo(_td_c_get_20_48);
        _jettag_c_get_20_48.doStart(context, out);
        _jettag_c_get_20_48.doEnd();
        out.write("</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<p>Thanks for Subscribing</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
    }
}
