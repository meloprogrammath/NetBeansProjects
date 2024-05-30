<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UniClima</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
        <link rel="icon" type="image/png" href="img/logo.png">
    </head>
    <body>
        <nav class="navbar bg-body-tertiary bg-dark" data-bs-theme="dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">
                    <img src="img/logo.png" alt="Logo" width="24" class="d-inline-block align-text-top">
                    UniClima
                </a>
                <form class="d-flex" role="search" method="post">
                    <input class="form-control me-2" type="search" placeholder="Cidade" aria-label="Search">
                    <button class="btn btn-outline-success" type="submit">Carregar</button>
                </form>
            </div>
        </nav>
    </body>
</html>



