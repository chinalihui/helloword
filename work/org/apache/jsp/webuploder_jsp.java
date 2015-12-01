package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webuploder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"zh-CN\"><head>\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>\r\n");
      out.write("            演示 - Web Uploader\r\n");
      out.write("        </title>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"http://fex.baidu.com/webuploader/images/favicon.ico\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploder/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploder/bootstrap-theme.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploder/font-awesome.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploder/syntax.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploder/style.css\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploder/webuploader.css\">\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"webuploder/demo.css\">\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("         <div class=\"page-body\">\r\n");
      out.write("\r\n");
      out.write("<div id=\"post-container\" class=\"container\">\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"page-container\">\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("<p>您可以尝试文件拖拽，使用QQ截屏工具，然后激活窗口后粘贴，或者点击添加图片按钮，来体验此demo.</p>\r\n");
      out.write("\r\n");
      out.write("<div id=\"uploader\" class=\"wu-example\">\r\n");
      out.write("    <div class=\"queueList\">\r\n");
      out.write("        <div id=\"dndArea\" class=\"placeholder\">\r\n");
      out.write("            <div class=\"webuploader-container\" id=\"filePicker\"><div class=\"webuploader-pick\">点击选择图片</div><div style=\"position: absolute; top: 0px; left: 448px; width: 168px; height: 44px; overflow: hidden; bottom: auto; right: auto;\" id=\"rt_rt_19c3kj909h49io1909bb0a791\"><input accept=\"image/*\" multiple=\"multiple\" class=\"webuploader-element-invisible\" name=\"file\" type=\"file\"><label style=\"opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: none repeat scroll 0% 0% rgb(255, 255, 255);\"></label></div></div>\r\n");
      out.write("            <p>或将照片拖到这里，单次最多可选300张</p>\r\n");
      out.write("        </div>\r\n");
      out.write("    <ul class=\"filelist\"></ul></div>\r\n");
      out.write("    <div class=\"statusBar\" style=\"display:none;\">\r\n");
      out.write("        <div style=\"display: none;\" class=\"progress\">\r\n");
      out.write("            <span class=\"text\">0%</span>\r\n");
      out.write("            <span style=\"width: 0%;\" class=\"percentage\"></span>\r\n");
      out.write("        </div><div class=\"info\">共0张（0B），已上传0张</div>\r\n");
      out.write("        <div class=\"btns\">\r\n");
      out.write("            <div class=\"webuploader-container\" id=\"filePicker2\"><div class=\"webuploader-pick\">继续添加</div><div style=\"position: absolute; top: 0px; left: 0px; width: 1px; height: 1px; overflow: hidden;\" id=\"rt_rt_19c3kj90em3d1hrdcjk11ri45c6\"><input accept=\"image/*\" multiple=\"multiple\" class=\"webuploader-element-invisible\" name=\"file\" type=\"file\"><label style=\"opacity: 0; width: 100%; height: 100%; display: block; cursor: pointer; background: none repeat scroll 0% 0% rgb(255, 255, 255);\"></label></div></div><div class=\"uploadBtn state-pedding\">开始上传</div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write(" \r\n");
      out.write("</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    // 添加全局站点信息\r\n");
      out.write("    var BASE_URL = '/webuploader';\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"webuploder/jquery-1.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"webuploder/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"webuploder/global.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("        <script type=\"text/javascript\" src=\"webuploder/webuploader.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("        <script type=\"text/javascript\" src=\"webuploder/demo.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    var _bdhmProtocol = ((\"https:\" == document.location.protocol) ? \" https://\" : \" http://\");\r\n");
      out.write("    document.write(unescape(\"%3Cscript src='\" + _bdhmProtocol + \"hm.baidu.com/h.js%3F67c4841095cbee8275705e1f6224a3c7' type='text/javascript'%3E%3C/script%3E\"));\r\n");
      out.write("    </script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body></html>");
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
