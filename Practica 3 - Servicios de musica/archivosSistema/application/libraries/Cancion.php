<?php
class Cancion{
    public function __get($attr) {
		return CI_Controller::get_instance()->$attr;
    }
    public function __construct(){
        $this->load->model('Cancion_modelo','modeloCancion');
    }
    function getCancionesEncuesta(){
        return $this->modeloCancion->getCancionesEncuesta();
    }
    function guardarCalificacionesEncuesta($idUsuario,$idCancion,$calificacion){
        return $this->modeloCancion->guardarCalificacionesEncuesta($idUsuario,$idCancion,$calificacion);
    }
}