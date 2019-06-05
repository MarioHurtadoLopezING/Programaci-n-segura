<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <title>Inicio</title>
    <link rel="stylesheet" href="<?php echo base_url();?>css/bootstrap.min.css" >	
</head>
<body>
    <h1>Iniciar sesión</h1>
    <?php echo form_open('InicioSesionController/iniciarSesion', array('id'=>'login'))?>
        <div>
            <label>Usuario</label>
            <input type="text" id="txtNombreUsuario" name="txtNombreUsuario" placeholder="Usuario"/>
        </div>
        <div>
            <label>Contraseña</label>
            <input type="password" id="txtContrasena" name="txtContrasena" placeholder="contraseña"/>
        </div>
        <input type="submit" name="iniciarSesion" value="Iniciar Sesión"/>
    </form>
</body>
</html>