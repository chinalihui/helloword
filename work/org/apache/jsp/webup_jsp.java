package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class webup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\" src=\"webup/upjquery.js\" ></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"webup/webuploader.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"webup/upload.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"webup/webuploader.css\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"webup/uploadstyle.css\" />\r\n");
      out.write("\r\n");
      out.write("<div id=\"container\" >\r\n");
      out.write("<div id=\"uploader\" >\r\n");
      out.write("                <div class=\"queueList\">\r\n");
      out.write("                    <div id=\"dndArea\" class=\"placeholder\">\r\n");
      out.write("                        <div id=\"filePicker\"></div>\r\n");
      out.write("                        <p>或将照片拖到这里，单次最多可选9张，单个文件大小不超过2M</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"statusBar\" style=\"display:none;\">\r\n");
      out.write("                    <div class=\"progress\">\r\n");
      out.write("                        <span class=\"text\">0%</span>\r\n");
      out.write("                        <span class=\"percentage\"></span>\r\n");
      out.write("                    </div><div class=\"info\"></div>\r\n");
      out.write("                    <div class=\"btns\">\r\n");
      out.write("                        <div id=\"filePicker2\"></div><div class=\"uploadBtn\">发表</div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write(" </div>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("uploader = WebUploader.create({\r\n");
      out.write("    pick: {      //选择图片按钮\r\n");
      out.write("        id: '#filePicker',\r\n");
      out.write("        label: '点击选择图片'\r\n");
      out.write("    },\r\n");
      out.write("    formData: {     //上传图片时附带的参数\r\n");
      out.write("        uid: 123\r\n");
      out.write("    },\r\n");
      out.write("    dnd: '#dndArea',       //指定可拖拽的容器\r\n");
      out.write("    paste: '#uploader',      //监听粘贴事件的容器\r\n");
      out.write("    swf: './Uploader.swf',   //swf\r\n");
      out.write("    chunked: false,           //是否分片上传\r\n");
      out.write("    chunkSize: 512 * 1024,   //分片大小\r\n");
      out.write("    server: '/Gagbbs/uploadfile', //上传文件服务端\r\n");
      out.write("\r\n");
      out.write("    accept: {      //允许的文件类型\r\n");
      out.write("        title: 'Images',\r\n");
      out.write("        extensions: 'gif,jpg,jpeg,bmp,png',\r\n");
      out.write("        mimeTypes: 'image/*'\r\n");
      out.write("    },\r\n");
      out.write("   \r\n");
      out.write("    disableGlobalDnd: true,       // 禁掉全局的拖拽功能。这样不会出现图片拖进页面的时候，把图片打开。\r\n");
      out.write("    fileNumLimit: 9,      //上传文件个数\r\n");
      out.write("    fileSizeLimit: 200 * 1024 * 1024,    // 200 M     上传文件总大小\r\n");
      out.write("    fileSingleSizeLimit: 2 * 1024 * 1024    // 2 M    单个文件大小\r\n");
      out.write("});\r\n");
      out.write("\r\n");
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
