$(document).ready(function(){
    getCancionesEncuesta();
    /* $('#formularioCancionesEncuesta').submit(function(event){
        event.preventDefault();
        enviarCalificaciones(this);
    }); */
});
function getCancionesEncuesta(){
    $.ajax({
        method:"POST",
        async:true,
        cache:false,
        dataType:'json',
        url:'getCancionesJSON'
    }).done(function(msg){
        if(msg.estado == '404'){
            console.log('404');
        }else{
            mostrarCancionesUsuario(JSON.parse(msg.canciones));
        }
    });
}

function mostrarCancionesUsuario(listaCanciones){
    for(var i = 0; i < listaCanciones.length; i++){
        var divCancion = document.createElement('div');
        var tituloCancion = document.createElement('label');
        tituloCancion.innerHTML = listaCanciones[i]['can_titulo'];
        divCancion.append(tituloCancion);
        var hiddenCancionId = document.createElement('hidden');
        hiddenCancionId.name = "cancion"+(i+1);
        hiddenCancionId.value = listaCanciones[i]['can_id'];
        console.log(hiddenCancionId.value);
        divCancion.append(hiddenCancionId);
        var selectorCalificaciones = comboCalificaciones();
        selectorCalificaciones.name = "selector"+(i+1);
        divCancion.append(selectorCalificaciones);
        $('#formularioCancionesEncuesta').append(divCancion);
    }
    var btnEnviarEncuesta = "<input type='submit' name='enviarEncuesta' value='Enviar encuesta'/>";
    $('#formularioCancionesEncuesta').append(btnEnviarEncuesta);
}

function comboCalificaciones(){
    var selectorCalificaciones = document.createElement('select');
    for(var i = 0; i < 5; i++){
        var opcionCalificacion = document.createElement('option');
        opcionCalificacion.innerHTML = i + 1;
        selectorCalificaciones.append(opcionCalificacion);
    }
    return selectorCalificaciones;
}