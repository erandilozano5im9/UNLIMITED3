package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Sign_0020up_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Login</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estiloGeneral.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            Connection conexion = null;
            Statement sentencia = null;
            ResultSet resultado = null;
            String url="jdbc:mysql://localhost/unlimited";
            String user="root";
            String password="n0m3l0";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conexion = DriverManager.getConnection(url, user, password);
                sentencia = conexion.createStatement();
                System.out.println("Si se conecto");
            }
            catch(Exception e){
                System.out.println("NO se conecto");
            }
        
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <h1 align=\"center\"></h1>\n");
      out.write("        </header>\n");
      out.write("        ");

            String usuario = request.getParameter("nombreusu");
            String correo = request.getParameter("correo");
            String contra = request.getParameter("contra");
            String contra2 = request.getParameter("contra2");
            String nombre = request.getParameter("nombre");
            String apellidoPaterno = request.getParameter("apellidoPaterno");
            String apellidoMaterno = request.getParameter("apellidoMaterno");
            String telefono = request.getParameter("telefono");
            try{
                if(contra.equals(contra2)){
                    sentencia.executeUpdate("insert into usuarios (usuario, correo, contra, nombre, apellidoPaterno, apellidoMaterno, telefono) values('"+usuario+"','"+correo+"','"+contra+"','"+nombre+"','"+apellidoPaterno+"','"+apellidoMaterno+"','"+telefono+"');");
                    out.println("<script>alert('Registro exitoso uwu')</script>");
                    try{
                        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        conexion = DriverManager.getConnection(url, user, password);
                        sentencia = conexion.createStatement();
                        System.out.println("Si se conecto");
                    }
                    catch(Exception e){
                        System.out.println("NO se conecto");
                    }
                    resultado = sentencia.executeQuery("select * from usuarios where usuario = '"+usuario+"' and contra = '"+contra+"'");
                    int contador = 0;
                    while(resultado.next()){
                        contador++;
                    }
                    if(contador == 1){
                        HttpSession sesion = request.getSession(true);
                        sesion.setAttribute("usuario", usuario);
                        response.sendRedirect("../inicio.jsp");
                    }
                    else{
                        if(contador != 1){
                        try{
                            /* TODO output your page here. You may use following sample code. */
                            out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head>");
                            out.println("<title>Servlet Login</title>");            
                            out.println("</head>");
                            out.println("<body>");
                            out.println("<script>alert('Usuario o contraseña incorrectos')</script>");
                            out.println("<script>window.location='../index.jsp'</script>");
                            out.println("</body>");
                            out.println("</html>");
                            }
                        catch(Exception e){
                    System.out.println("Error en la conexion");
                }
                        HttpSession sesion = request.getSession(false);
                    }
                        }
                }catch(Exception e){
                    System.out.println("Error en la conexion");
                }
                            //out.println("<script>window.location='principal.html'</script>");
                        }       
                else{
                    out.println("<script>alert('Las contraseñas no coinden unu')</script>");
                    out.println("<script>window.location='../registrarusuarios.jsp'</script>");
                    System.out.println("No entro");
                }
            }catch(Exception e){
                out.println("<script>alert('Registro NO realizado unu')</script>");
                out.println("<script>window.location='../index.jsp'</script>");
            }
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
