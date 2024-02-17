package simple.mail.transform.compiled;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Template;
import org.eclipse.jet.JET2Writer;

public class _jet_letterhtml implements JET2Template {

    public _jet_letterhtml() {
        super();
    }

    private static final String NL = System.getProperty("line.separator"); //$NON-NLS-1$

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
        out.write("<p>Dear Gaurav</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("<p>Thanks for Subscribing</p>");  //$NON-NLS-1$        
        out.write(NL);         
        out.write("</div>");  //$NON-NLS-1$        
    }
}
