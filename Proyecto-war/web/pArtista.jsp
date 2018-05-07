<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="Css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link href="Css/pArtista.css" rel="stylesheet" >
        <link href="Css/Tabla.css" rel="stylesheet" >
        <script src="Js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <script src="Js/pArtista.js"></script>
    </head>
    <body>

        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#page-top">Estampate</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hidden">
                            <a href="#page-top"></a>
                        </li>
                        <li class="page-scroll">
                            <a href="#portfolio">Registro</a>
                        </li>
                        <li class="page-scroll">
                            <a href="#about">About</a>
                        </li>
                        <li class="page-scroll">
                            <a href="#contact">Contact</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container-fluid -->
        </nav>
        <header id="page-top">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <img class="img-responsive" src="http://ironsummitmedia.github.io/startbootstrap-freelancer/img/profile.png" alt="">
                        <div class="intro-text">
                            <span class="name">Inspired by PureCSS.io</span>
                            <hr class="star-light">
                            <p class="skills">Landing Page Layout</p>
                            <p class="skills">Scroll to see the effect</p>
                        </div>
                    </div>
                </div>
            </div>
        </header>
        <div class="content-wrapper">
            <section class="primary" id="portfolio">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 text-center">
                            <h2>Registro de Estampa</h2>
                            <hr class="star-primary">
                        </div>

                        <div class="row">
                            <div class="col-lg-12">
                                <div class="panel panel-default">
                                    <div class="panel-heading">

                                    </div>
                                    <div class="panel-body">
                                        <div class="row">
                                            <div class="container">
                                                <form role="form" method="post" action="pArtista">
                                                    <div class="col-md-6">
                                                        <div class="form-group">
                                                            <label for="titulo">nombre</label>
                                                            <input class="form-control" placeholder="nombre" id="nombre" name="nombre" required="">
                                                        </div>

                                                        <div class="form-group">
                                                            <label for="imagen">Imagen</label>
                                                            <input type="file" class="form-control" id="imagen" name="imagen" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="Video">precio</label>
                                                            <input class="form-control" type="number" placeholder="precio" id="precio" name="precio" required="">
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="Nredactor">Categoria</label>
                                                            <select class="form-control" name="categoria" >
                                                                <option value="Animales">Animales </option>
                                                                <option value="Artístico">Artístico </option>
                                                                <option value="Dibujos">Dibujos animados </option>
                                                                <option value="Juegos">Juegos </option>
                                                                <option value="Motores">Motores </option>
                                                                <option value="Películas">Películas </option>
                                                                <option value="Música">Música </option>
                                                                <option value="Naturaleza">Naturaleza </option>
                                                                <option value="Espacio">Espacio</option>
                                                                <option value="Deportes">Deportes </option>
                                                                <option value="Viaje">Viaje </option>
                                                                <option value="Vintage">Vintage </option>
                                                            </select>
                                                        </div>


                                                    </div>
                                                    <div class="col-md-6">
                                                        <div class="form-group">
                                                            <label for="informacion" >información Estampa</label>
                                                            <textarea class="form-control" name="informacion" rows="5" id="informacion" required=""></textarea>
                                                        </div>

                                                        <div class="form-group">
                                                            <label for="fecha">fecha</label>
                                                            <input type="date" name="fecha" class="form-control" id="fecha" required>
                                                        </div>                                      

                                                        <div class="form-group">
                                                            <label for="Nredactor">Nombre Autor</label>
                                                            <input class="form-control" placeholder="Nombre Autor" name="autor" id="Autor" required>
                                                        </div>
                                                        <div class="form-group">
                                                            <label for="Nredactor">tama�o</label>
                                                            <input class="form-control" placeholder="tama�o" name="tamano" id="tamano" required>
                                                        </div>

                                                        <div class="form-group">
                                                            <label for="Nredactor">Color</label>
                                                            <select class="form-control" name="color" >
                                                                <option value="Rojo">Rojo </option>
                                                                <option value="Verde">Verde </option>
                                                                <option value="Azul">Azul </option>
                                                                <option value="Magenta">Magenta </option>
                                                                <option value="Cian">Cian </option>
                                                                <option value="Amarillo">Amarillo </option>
                                                                <option value="Marrón">Marrón </option>
                                                                <option value="Violeta">Violeta </option>
                                                                <option value="Naranja">Naranja  </option>
                                                                <option value="Blanco">Blanco </option>
                                                                <option value="gris">gris </option>
                                                                <option value="negro">negro </option>
                                                            </select>
                                                        </div>


                                                    </div>
                                                    <button type="submit" class="btn btn-default" name="action" value="Insert" id="enviar">Enviar</button>

                                                </form>
                                            </div>

                                        </div>
                                        <!-- /.row (nested) -->
                                    </div>
                                    <!-- /.panel-body -->

                                </div>
                                <!-- /.col-lg-12 -->
                            </div>
                            <!-- /.row -->
                        </div>
                    </div>
                </div>
            </section>
            <section class="success" id="about">

            </section>
            <section class="primary" id="contact">
                <div class="container">
                    <div class="row col-md-9 col-md-offset-2 custyle">
                        <table class="table table-striped custab">
                            <thead>
                            <a href="#" class="btn btn-primary btn-xs pull-right"><b>+</b> Add new categories</a>
                            <tr>
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Fecha</th>
                                <th>Precio</th>
                                <th>Categoria</th>
                                <th>Color</th>
                                <th class="text-center">Eliminar/editar</th>
                            </tr>
                            </thead>
                            <c:forEach var="it" items="${items}" varStatus="number">
                            <tr>
                            
                                <td>${it.idEstampa}</td>
                                <td>${it.nombre}</td>
                                <td>${it.fecha}</td>
                                <td>${it.precio}</td>
                                <td>${it.categoria}</td>
                                <td>${it.color}</td>


                                <td class="text-center"><input type="submit" value="Update" name="action"/><span class="glyphicon glyphicon-edit"></span> Edit<input type="submit" value="Delete" name="action"/><span class="glyphicon glyphicon-remove"></span> Del</a></td>
                            </tr>
                            </c:forEach>

                        </table>
                    </div>
                </div>
            </section>

        </div>

    </body>
</html>
