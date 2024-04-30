package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.edu.ifpe.recife.model.negocio.Usuario;

public final class CadastroUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'Cadastro de novo':'Editar'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" usuário</h1>\n");
      out.write("\n");
      out.write("        <a href=\"index.html\">home</a><br/>\n");
      out.write("        <form method=\"post\" action=\"UsuariosServlet2\">\n");
      out.write("            \n");
      out.write("            <input type=\"hidden\" name=\"op\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'cadastro':'editar'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            Codigo: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':usuario.codigo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <input type=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'text':'hidden'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"codigo\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':' value=\"'+=usuario.codigo+='\"'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("  /><br/>\n");
      out.write("            Login: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':usuario.login}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <input type=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'text':'hidden'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"login\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':' value=\"'+=usuario.login+='\"'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/><br/>\n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'Senha: <input type=\"password\" name=\"senha\"/><br/>':''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            e-mail: <input type=\"text\" name=\"email\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':'value=\"'+=usuario.email+='\"'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/><br/>\n");
      out.write("            Cidade: <input type=\"text\" name=\"cidade\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':'value=\"'+=usuario.cidade+='\"'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/><br/>\n");
      out.write("            Bairro: <input type=\"text\" name=\"bairro\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':'value=\"'+=usuario.bairro+='\"'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/><br/>\n");
      out.write("            Contato: <input type=\"text\" name=\"contato\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'':'value=\"'+=usuario.contato+='\"'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/><br/>\n");
      out.write("            <input type=\"submit\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${(requestScope.usuario == null)?'Cadastrar':'Editar'}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
