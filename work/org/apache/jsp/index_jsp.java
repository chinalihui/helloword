package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"diyUpload/css/webuploader.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"diyUpload/css/diyUpload.css\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"diyUpload/js/jquery-1.7.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"diyUpload/js/webuploader.html5only.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"diyUpload/js/diyUpload.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("*{ margin:0; padding:0;}\r\n");
      out.write("#filesArea{ margin:0px auto; width:100%; min-height:20px;}\r\n");
      out.write(".upload_drag_area{z-index:99; display:inline-block; width:840px; padding:4em 0; margin-left:.5em; border:1px dashed #ddd; background:#fff url(http://rescdn.qqmail.com/zh_CN/htmledition/images/func/dragfile07bf38.gif) no-repeat 20px center; color:#999; text-align:center; vertical-align:middle;}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<div id=\"filesArea\"><div id=\"files_show\" ></div></div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("/*\r\n");
      out.write("* 服务器地址,成功返回,失败返回参数格式依照jquery.ajax习惯;\r\n");
      out.write("* 其他参数同WebUploader\r\n");
      out.write("*/\r\n");
      out.write("function initUpload(){\r\n");
      out.write("\t$('#files_show').diyUpload({\r\n");
      out.write("\t\turl:'uploadFiles.action',\r\n");
      out.write("\t\tsuccess:function( data ) {\r\n");
      out.write("\t\t\tconsole.info( data );\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\terror:function( err ) {\r\n");
      out.write("\t\t\tconsole.info( err );\t\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tbuttonText : '点击此处选择图片或者将图片拖到此处',\r\n");
      out.write("\t\tchunked:true,\r\n");
      out.write("\t\t// 分片大小\r\n");
      out.write("\t\tchunkSize:512 * 1024,\r\n");
      out.write("\t\t//最大上传的文件数量, 总文件大小,单个文件大小(单位字节);\r\n");
      out.write("\t\tfileNumLimit:22,\r\n");
      out.write("\t\tfileSizeLimit:500000 * 1024,\r\n");
      out.write("\t\tfileSingleSizeLimit:1000 * 1024,\r\n");
      out.write("\t\taccept:{\r\n");
      out.write("\t\t\ttitle:\"Images\",\r\n");
      out.write("\t\t\textensions:\"gif,jpg,jpeg,bmp,png\",\r\n");
      out.write("\t\t\tmimeTypes:\"image/*\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("initUpload();\r\n");
      out.write("</script>");
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
