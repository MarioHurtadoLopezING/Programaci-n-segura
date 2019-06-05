<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <title>Pagina principal</title>
    <link rel="stylesheet" href="<?php echo base_url();?>css/bootstrap.min.css" >
    <script type="text/javascript" src="<?php echo base_url();?>js/jquery-3.4.0.min.js"></script>
    <script type="text/javascript" src="<?php echo base_url();?>js/paginaPrincipal.js"></script>
</head>
<body>
    <h1>bienvenido <?php echo $nombreUsuario ?></h1>
    <div id="divCancionesEncuesta">
        <?php echo form_open('cancionController/calificarCancionesEncuesta', array('id'=>'formularioCancionesEncuesta'))?>
        </form>
    </div>
</body>
</html>