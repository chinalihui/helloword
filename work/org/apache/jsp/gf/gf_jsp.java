package org.apache.jsp.gf;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gf_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\r\n");
      out.write("    <title>WebUploader演示</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploader.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <div id=\"container\">\r\n");
      out.write("            <!--头部，相册选择和格式选择-->\r\n");
      out.write("\r\n");
      out.write("            <div id=\"uploader\">\r\n");
      out.write("                <div class=\"queueList\">\r\n");
      out.write("                    <div id=\"dndArea\" class=\"placeholder\">\r\n");
      out.write("                        <div id=\"filePicker\"></div>\r\n");
      out.write("                        <p>或将照片拖到这里，单次最多可选300张</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"statusBar\" style=\"display:none;\">\r\n");
      out.write("                    <div class=\"progress\">\r\n");
      out.write("                        <span class=\"text\">0%</span>\r\n");
      out.write("                        <span class=\"percentage\"></span>\r\n");
      out.write("                    </div><div class=\"info\"></div>\r\n");
      out.write("                    <div class=\"btns\">\r\n");
      out.write("                        <div id=\"filePicker2\"></div><div class=\"uploadBtn\">开始上传</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"webuploader.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"upload.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
