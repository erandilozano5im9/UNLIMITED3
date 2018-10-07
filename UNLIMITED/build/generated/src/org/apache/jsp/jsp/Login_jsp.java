package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" href=\"http://getbootstrap.com/favicon.ico\">\n");
      out.write("\n");
      out.write("    <title>Product example for Bootstrap</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"http://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"http://getbootstrap.com/docs/4.1/examples/product/product.css\" rel=\"stylesheet\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <nav class=\"site-header sticky-top py-1\">\n");
      out.write("      <div class=\"container d-flex flex-column flex-md-row justify-content-between\">\n");
      out.write("        <a class=\"py-2\" href=\"#\">\n");
      out.write("          <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"d-block mx-auto\"><circle cx=\"12\" cy=\"12\" r=\"10\"></circle><line x1=\"14.31\" y1=\"8\" x2=\"20.05\" y2=\"17.94\"></line><line x1=\"9.69\" y1=\"8\" x2=\"21.17\" y2=\"8\"></line><line x1=\"7.38\" y1=\"12\" x2=\"13.12\" y2=\"2.06\"></line><line x1=\"9.69\" y1=\"16\" x2=\"3.95\" y2=\"6.06\"></line><line x1=\"14.31\" y1=\"16\" x2=\"2.83\" y2=\"16\"></line><line x1=\"16.62\" y1=\"12\" x2=\"10.88\" y2=\"21.94\"></line></svg>\n");
      out.write("        </a>\n");
      out.write("        <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Tour</a>\n");
      out.write("        <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Product</a>\n");
      out.write("        <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Features</a>\n");
      out.write("        <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Enterprise</a>\n");
      out.write("        <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Support</a>\n");
      out.write("        <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Pricing</a>\n");
      out.write("        <a class=\"py-2 d-none d-md-inline-block\" href=\"#\">Cart</a>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"position-relative overflow-hidden p-3 p-md-5 m-md-3 text-center bg-light\">\n");
      out.write("      <div class=\"col-md-5 p-lg-5 mx-auto my-5\">\n");
      out.write("        <h1 class=\"display-4 font-weight-normal\">Punny headline</h1>\n");
      out.write("        <p class=\"lead font-weight-normal\">And an even wittier subheading to boot. Jumpstart your marketing efforts with this example based on Apple's marketing pages.</p>\n");
      out.write("        <a class=\"btn btn-outline-secondary\" href=\"#\">Coming soon</a>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"product-device shadow-sm d-none d-md-block\"></div>\n");
      out.write("      <div class=\"product-device product-device-2 shadow-sm d-none d-md-block\"></div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"d-md-flex flex-md-equal w-100 my-md-3 pl-md-3\">\n");
      out.write("      <div class=\"bg-dark mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center text-white overflow-hidden\">\n");
      out.write("        <div class=\"my-3 py-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-light shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"bg-light mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden\">\n");
      out.write("        <div class=\"my-3 p-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-dark shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"d-md-flex flex-md-equal w-100 my-md-3 pl-md-3\">\n");
      out.write("      <div class=\"bg-light mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden\">\n");
      out.write("        <div class=\"my-3 p-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-dark shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"bg-primary mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center text-white overflow-hidden\">\n");
      out.write("        <div class=\"my-3 py-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-light shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"d-md-flex flex-md-equal w-100 my-md-3 pl-md-3\">\n");
      out.write("      <div class=\"bg-light mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden\">\n");
      out.write("        <div class=\"my-3 p-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-white shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"bg-light mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden\">\n");
      out.write("        <div class=\"my-3 py-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-white shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"d-md-flex flex-md-equal w-100 my-md-3 pl-md-3\">\n");
      out.write("      <div class=\"bg-light mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden\">\n");
      out.write("        <div class=\"my-3 p-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-white shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"bg-light mr-md-3 pt-3 px-3 pt-md-5 px-md-5 text-center overflow-hidden\">\n");
      out.write("        <div class=\"my-3 py-3\">\n");
      out.write("          <h2 class=\"display-5\">Another headline</h2>\n");
      out.write("          <p class=\"lead\">And an even wittier subheading.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bg-white shadow-sm mx-auto\" style=\"width: 80%; height: 300px; border-radius: 21px 21px 0 0;\"></div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer class=\"container py-5\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-12 col-md\">\n");
      out.write("          <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"d-block mb-2\"><circle cx=\"12\" cy=\"12\" r=\"10\"></circle><line x1=\"14.31\" y1=\"8\" x2=\"20.05\" y2=\"17.94\"></line><line x1=\"9.69\" y1=\"8\" x2=\"21.17\" y2=\"8\"></line><line x1=\"7.38\" y1=\"12\" x2=\"13.12\" y2=\"2.06\"></line><line x1=\"9.69\" y1=\"16\" x2=\"3.95\" y2=\"6.06\"></line><line x1=\"14.31\" y1=\"16\" x2=\"2.83\" y2=\"16\"></line><line x1=\"16.62\" y1=\"12\" x2=\"10.88\" y2=\"21.94\"></line></svg>\n");
      out.write("          <small class=\"d-block mb-3 text-muted\">&copy; 2017-2018</small>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-6 col-md\">\n");
      out.write("          <h5>Features</h5>\n");
      out.write("          <ul class=\"list-unstyled text-small\">\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Cool stuff</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Random feature</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Team feature</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Stuff for developers</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Another one</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Last time</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-6 col-md\">\n");
      out.write("          <h5>Resources</h5>\n");
      out.write("          <ul class=\"list-unstyled text-small\">\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Resource</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Resource name</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Another resource</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Final resource</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-6 col-md\">\n");
      out.write("          <h5>Resources</h5>\n");
      out.write("          <ul class=\"list-unstyled text-small\">\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Business</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Education</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Government</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Gaming</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-6 col-md\">\n");
      out.write("          <h5>About</h5>\n");
      out.write("          <ul class=\"list-unstyled text-small\">\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Team</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Locations</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Privacy</a></li>\n");
      out.write("            <li><a class=\"text-muted\" href=\"#\">Terms</a></li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>window.jQuery || document.write('<script src=\"../../assets/js/vendor/jquery-slim.min.js\"><\\/script>')</script>\n");
      out.write("    <script src=\"../../assets/js/vendor/popper.min.js\"></script>\n");
      out.write("    <script src=\"../../dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"../../assets/js/vendor/holder.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("      Holder.addTheme('thumb', {\n");
      out.write("        bg: '#55595c',\n");
      out.write("        fg: '#eceeef',\n");
      out.write("        text: 'Thumbnail'\n");
      out.write("      });\n");
      out.write("    </script>\n");
      out.write("  </body>\n");
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
