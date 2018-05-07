<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="Css/index.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">  
            <form id="contact" action="registroArtista" method="post">
                <h3>Registro Artista</h3>
                <fieldset>
                    <input  name="idArtista" placeholder="cedula" type="text" tabindex="0" required autofocus>
                </fieldset>
                <fieldset>
                    <input  name="nombre" placeholder="Nombres" type="text" tabindex="1" required autofocus>
                </fieldset>
                <fieldset>
                    <input name="apellido" placeholder="Apellidos" type="text" tabindex="2" required>
                </fieldset>
                <fieldset>
                    <input name="Email" placeholder="Email" type="text" tabindex="3" required>
                </fieldset>
                <fieldset>
                    <input name="contraseña" placeholder="contraseña" type="password" tabindex="4" required>
                </fieldset>
                <fieldset>
                    <label for="gen">genero </label><br/>
                    <input type="radio" name="genero" value="masculino" checked>   Masculino<br>
                    <input type="radio" name="genero" value="femenino">    femenino<br>
                </fieldset>
                <fieldset>
                    <input name="telefono" placeholder="telefono" type="tel" tabindex="5" required>
                </fieldset>
                <fieldset>
                    <input name="direccion" placeholder="direccion" type="text" tabindex="6" required>
                </fieldset>
                <fieldset>
                    <button name="action" value="Insert" type="submit" id="contact-submit" data-submit="...Sending">enviar</button>
                    <p class="message"><a href="Artista.jsp">volver</a></p>                   
                </fieldset>


            </form>
        </div>
        <script src="Js/index.js"></script>
    </body>
</html>
