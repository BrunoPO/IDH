<%-- 
    Document   : IDH
    Created on : 24/10/2016, 12:02:06
    Author     : BPO
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="dbAccess.Access"%>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>IDH</title>
        <link rel="stylesheet" type="text/css" href="css/mapa.css">
    </head>
    <body>
        <% Access db = new Access();
            StringBuilder vetorCoords = db.SelectSQL(new String("SELECT \"coordenadas\" FROM \"Coordenadas\""),0);
            StringBuilder vetorNomes = db.SelectSQL(new String("SELECT \"nome\" FROM \"Municipios\""),1);
        %>
        <div id="map"></div>
        <script> 
            var muniCoords = <%=vetorCoords %>;
            var muniNome = <%=vetorNomes %>;
        </script>
        <script src="Script/Mapa_Script.js"></script>
        <script async defer
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBJtvVr9mV3pmMfcw3rnC8xQpPsiNqNS2M&callback=initMap">
        </script>
        
    </body>