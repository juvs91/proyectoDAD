<%-- 
    Document   : index
    Created on : 01-abr-2012, 12:16:20
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <h1>agrega tu usuario</h1>
        
        <form action="UsuarioControlador"  method="POST">
        nombre<input type="text" name="nombre" /></br>
        contraseña<input type="text" name="name"  />
        <input type="submit" value="submit" name="sumbit" />
        </form>
    </body>
</html>
