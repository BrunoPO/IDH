package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Arrays;
import java.sql.*;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 public int[] x = new int[2];
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("      <body>\n");
      out.write("\n");


String connectionURL = "jdbc:postgresql://localhost:5432/Trab";

String User = "postgres";

String Pass = "postgres";

Connection connection = null;

Statement statement = null;

ResultSet rs = null;


      out.write('\n');

try{
    Class.forName("org.postgresql.Driver").newInstance();
}catch(java.lang.ClassNotFoundException e) 
{
        System.err.print("ClassNotFoundException: ");
        System.err.println(e.getMessage());
}
connection = DriverManager.getConnection(connectionURL, User , Pass);

statement = connection.createStatement();
rs = statement.executeQuery("SELECT * FROM infos");

out.println("<table border='1'>");

while (rs.next()) {

out.println("<tr>");

out.println("<td>" + rs.getString("coluna1")+ "</td>");
        
}

out.println("</table>");

rs.close();

      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");
 x[0] = 12;x[1] = 10;
      out.write("\n");
      out.write("    <div id=\"map\"></div>\n");
      out.write("<!--script async defer\n");
      out.write("    src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBJtvVr9mV3pmMfcw3rnC8xQpPsiNqNS2M&callback=initMap\">\n");
      out.write("</script-->\n");
      out.write("<script>\n");
      out.write("//&callback=initMap\n");
      out.write("var xhttp = new XMLHttpRequest();\n");
      out.write("var my_xml;\n");
      out.write("var coord;\n");
      out.write("var array;\n");
      out.write("var coords;\n");
      out.write("var xmlDoc;\n");
      out.write("var DocCoordsPosi=[];\n");
      out.write("var finished = false;\n");
      out.write("var map;\n");
      out.write("var infoWindow;\n");
      out.write("var triangleCoords = [];\n");
      out.write("var triangleCoords_bk = [];\n");
      out.write("var tochange = ");
      out.print(Arrays.toString(x) );
      out.write(";\n");
      out.write("console.log(tochange);\n");
      out.write("\tfunction initMap() {\n");
      out.write("\t\tmap = new google.maps.Map(document.getElementById('map'), {\n");
      out.write("\t\t  zoom: 5,\n");
      out.write("\t\t  center: new google.maps.LatLng(-7.29576915383618,-39.0824566557438),\n");
      out.write("\t\t  mapTypeId: 'terrain'\n");
      out.write("\t\t});\n");
      out.write("\t\tstart();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction start(){\n");
      out.write("\t\txhttp.onreadystatechange = function() {\n");
      out.write("\t\t\tif (this.readyState == 4 && this.status == 200) {\n");
      out.write("\t\t\t\tmy_xml = this;\n");
      out.write("\t\t\t\tloop_AddPoly(this);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t};\n");
      out.write("\t\txhttp.open(\"GET\", \"My_xml.xml\", true);\n");
      out.write("\t\txhttp.send();\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction loop_AddPoly() {\n");
      out.write("\t\txmlDoc = my_xml.responseXML;\n");
      out.write("\t\tvar j =0;\n");
      out.write("\t\tfor(var i =0;i<xmlDoc.getElementsByTagName(\"local\")[0].children.length-1;i++){\n");
      out.write("\t\t\t//if(xmlDoc.getElementsByTagName(\"local\")[0].childNodes[i].nodeType == 1){\n");
      out.write("\t\t\t\t\tDocCoordsPosi[j++] = i;\n");
      out.write("\t\t\t\t\tcoord = xmlDoc.getElementsByTagName(\"local\")[0].children[i].innerHTML;\n");
      out.write("\t\t\t\t\tarray = JSON.parse(\"[\" +coord+ \"]\");\n");
      out.write("\t\t\t\t\tconsole.log(i);\n");
      out.write("\t\t\t\t\tsetTimeout(addPoly(xmlDoc.getElementsByTagName(\"local\")[0].children[xmlDoc.getElementsByTagName(\"local\")[0].children.length-1].children[i].innerHTML),finished);\n");
      out.write("\t\t\t\t\tfinished=false;\n");
      out.write("\t\t\t\t\t//array = [];\n");
      out.write("\t\t\t//}\n");
      out.write("\t\t}\n");
      out.write("\t\t//console.log(array);\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\tfunction addPoly(name){\n");
      out.write("\t\tconsole.log(name);\n");
      out.write("\t\tvar j=0;\n");
      out.write("\t\tfor(var i =0;i<array.length;i++){\n");
      out.write("\t\t\ttriangleCoords[j]= new google.maps.LatLng(parseFloat(array[++i].toFixed(6)), parseFloat(array[i-1].toFixed(6)));\n");
      out.write("\t\t\tj++;\n");
      out.write("\t\t}\n");
      out.write("\t\tvar bermudaTriangle = new google.maps.Polygon({\n");
      out.write("\t\t  paths: triangleCoords,\n");
      out.write("\t\t  strokeColor: '#FF0000',\n");
      out.write("\t\t  strokeOpacity: 0.8,\n");
      out.write("\t\t  strokeWeight: 3,\n");
      out.write("\t\t  fillColor: '#FF0000',\n");
      out.write("\t\t  fillOpacity: 0.35\n");
      out.write("\t\t});\n");
      out.write("\t\tbermudaTriangle.nome = name;\n");
      out.write("\t\tbermudaTriangle.setMap(map);\n");
      out.write("\n");
      out.write("\t\t// Add a listener for the click event.\n");
      out.write("\t\tbermudaTriangle.addListener('click', showArrays);\n");
      out.write("\n");
      out.write("\t\tinfoWindow = new google.maps.InfoWindow;\n");
      out.write("\t\ttriangleCoords=[];\n");
      out.write("\t\tfinished=true;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("\t  /** @this {google.maps.Polygon} */\n");
      out.write("\tfunction showArrays(event) {\n");
      out.write("\t\t// Since this polygon has only one path, we can call getPath() to return the\n");
      out.write("\t\t// MVCArray of LatLngs.\n");
      out.write("\t\tvar vertices = this.getPath();\n");
      out.write("\n");
      out.write("\t\tvar contentString = '<b>'+this.nome+'</b><br>' +\n");
      out.write("\t\t\t'Clicked location: <br>' + event.latLng.lat() + ',' + event.latLng.lng() +\n");
      out.write("\t\t\t'<br>';\n");
      out.write("\n");
      out.write("\t\t// Iterate over the vertices.\n");
      out.write("\t\t/*for (var i =0; i < vertices.getLength(); i++) {\n");
      out.write("\t\t  var xy = vertices.getAt(i);\n");
      out.write("\t\t  contentString += '<br>' + 'Coordinate ' + i + ':<br>' + xy.lat() + ',' +\n");
      out.write("\t\t\t  xy.lng();\n");
      out.write("\t\t}*/\n");
      out.write("\n");
      out.write("\t\t// Replace the info window's content and position.\n");
      out.write("\t\tinfoWindow.setContent(contentString);\n");
      out.write("\t\tinfoWindow.setPosition(event.latLng);\n");
      out.write("\n");
      out.write("\t\tinfoWindow.open(map);\n");
      out.write("\t }\n");
      out.write("    </script>\n");
      out.write("    \n");
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
