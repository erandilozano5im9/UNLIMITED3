package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrarUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../../dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"form-validation.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <h1 align=\"center\">¡Registrate aquí!</h1>\n");
      out.write("            <a href=\"index.jsp\" class=\"ey\">Regresar</a>\n");
      out.write("        </header>\n");
      out.write("        <nav></nav>\n");
      out.write("        <section>\n");
      out.write("            <article>\n");
      out.write("                <div class=\"row\"> \n");
      out.write("                    <form method=\"post\" action=\"jsp/Registro.jsp\" class=\"card p-2\">\n");
      out.write("                        <span>\n");
      out.write("                            <input type=\"text\" name=\"nombre\" id=\"nombre\" class=\"form-control\">\n");
      out.write("                            <label for=\"nombre\">Nombre</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <span>\n");
      out.write("                            <input type=\"text\" name=\"apellidoPaterno\" id=\"apellidoPaterno\" class=\"form-control\">\n");
      out.write("                            <label for=\"apellidoPaterno\">Apellido Paterno</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <span>\n");
      out.write("                            <input type=\"text\" name=\"apellidoMaterno\" id=\"apellidoMaterno\" class=\"form-control\">\n");
      out.write("                            <label for=\"apellidoMaterno\">Apellido Materno</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <span>\n");
      out.write("                            <input type=\"text\" name=\"telefono\" id=\"telefono\" class=\"form-control\">\n");
      out.write("                            <label for=\"telefono\">Telefono</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <span>\n");
      out.write("                        <input type=\"text\" name=\"nombreusu\" id=\"nombreusu\" class=\"form-control\">\n");
      out.write("                        <label for=\"nombreusu\">Usuario</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <span>\n");
      out.write("                        <input type=\"email\" name=\"correo\" id=\"correo\" class=\"form-control\"\">\n");
      out.write("                        <label for=\"correo\">Correo</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <span>\n");
      out.write("                        <input type=\"password\" name=\"contra\" id=\"contra\" class=\"form-control\">\n");
      out.write("                        <label for=\"contra\">Contraseña</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <span>\n");
      out.write("                        <input type=\"password\" name=\"contra2\" class=\"form-control\">\n");
      out.write("                        <label for=\"contra2\">Repetir contraseña</label>\n");
      out.write("                        </span>\n");
      out.write("                        <br>\n");
      out.write("                        <input type=\"submit\" value=\"Registrarme\" class=\"btn btn-primary btn-lg btn-block\">\n");
      out.write("                    </form>\n");
      out.write("                </div> \n");
      out.write("            </article>\n");
      out.write("        </section>\n");
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
