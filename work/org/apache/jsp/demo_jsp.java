package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<title>无标题文档</title>\r\n");
      out.write("<script src=\"diyUpload/js/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"diyUpload/css/webuploader.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"diyUpload/css/diyUpload.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"diyUpload/js/webuploader.html5only.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"diyUpload/js/diyUpload.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("*{ margin:0; padding:0;}\r\n");
      out.write("#box{ margin:50px auto; width:540px; min-height:400px; background:#FF9}\r\n");
      out.write("#demo{ margin:50px auto; width:540px; min-height:800px; background:#CF9}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"box\">\r\n");
      out.write("\t<div id=\"test\" ></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"demo\">\r\n");
      out.write("\t<div id=\"as\" ></div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("/*\r\n");
      out.write("* 服务器地址,成功返回,失败返回参数格式依照jquery.ajax习惯;\r\n");
      out.write("* 其他参数同WebUploader\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("$('#test').diyUpload({\r\n");
      out.write("\turl:'server/fileupload.php',\r\n");
      out.write("\tsuccess:function( data ) {\r\n");
      out.write("\t\tconsole.info( data );\r\n");
      out.write("\t},\r\n");
      out.write("\terror:function( err ) {\r\n");
      out.write("\t\tconsole.info( err );\t\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$('#as').diyUpload({\r\n");
      out.write("\turl:'http://localhost:2222/expis/expisinfo/issueCreate.action',\r\n");
      out.write("\tsuccess:function( data ) {\r\n");
      out.write("\t\tconsole.info( data );\r\n");
      out.write("\t},\r\n");
      out.write("\terror:function( err ) {\r\n");
      out.write("\t\tconsole.info( err );\t\r\n");
      out.write("\t},\r\n");
      out.write("\tbuttonText : '选择要上传的图片',\r\n");
      out.write("\tchunked:true,\r\n");
      out.write("\t// 分片大小\r\n");
      out.write("\tchunkSize:512 * 1024,\r\n");
      out.write("\t//最大上传的文件数量, 总文件大小,单个文件大小(单位字节);\r\n");
      out.write("\tfileNumLimit:5,\r\n");
      out.write("\tfileSizeLimit:500000 * 1024,\r\n");
      out.write("\tfileSingleSizeLimit:50000 * 1024,\r\n");
      out.write("\taccept: {}\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</html>\r\n");
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
