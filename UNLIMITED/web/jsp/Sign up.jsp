
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
    <body>
        <%
            Connection conexion = null;
            Statement sentencia = null;
            ResultSet resultado = null;
            String url="jdbc:mysql://localhost/lab4";
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
        %>
        <header>
            <h1 align="center"></h1>
        </header>
        <%
            String nombre = request.getParameter("nombre");
            String apellidoP = request.getParameter("apellidoP");
            String apellidoM = request.getParameter("apellidoM");
            String telefono = request.getParameter("telefono");
            String nombreU = request.getParameter("nombreU");
            String correo = request.getParameter("correo");
            String contra = request.getParameter("contra");
            String contra2 = request.getParameter("contra2");
            
            try{
                if(contra.equals(contra2)){
                    sentencia.executeUpdate("insert into usuarios (nombre, apellidoP, apellidoM, telefono, nombreU, correo, contra, contra2) values('"+nombre+"','"+apellidoP+"','"+apellidoM+"','"+telefono+"','"+nombreU+"','"+correo+"','"+contra+"','"+contra2+"');");
                    out.println("<script>alert('Registrado')</script>");
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
                    resultado = sentencia.executeQuery("select * from usuarios where usuario = '"+nombreU+"' and contra = '"+contra+"'");
                    int contador = 0;
                    while(resultado.next()){
                        contador++;
                    }
                    if(contador == 1){
                        HttpSession sesion = request.getSession(true);
                        sesion.setAttribute("usuario", nombreU);
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
        %>
    </body>
</html>