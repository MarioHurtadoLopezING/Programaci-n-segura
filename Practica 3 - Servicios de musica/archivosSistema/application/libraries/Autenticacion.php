<?php
class Autenticacion{
    public function __get($attr) {
		return CI_Controller::get_instance()->$attr;
	}
    public function __construct(){
        $this->load->model('Usuario_modelo','modelo');
    }
    public function getSesionValida(){
        return $this->modelo->getDatosSesion('idUsuario');
    }
    function getIdUsuario(){
        return $this->getSesionValida();
    }
    function getDatosUsuario($idusuario){
        return $this->modelo->datosUsuario($idusuario);
    }
    function iniciarSesion($usuario,$contrasena){
        $datosUsuario = $this->modelo->iniciarSesion($usuario,$contrasena);
        return isset($datosUsuario['usu_idUsuario']);
    }
    function guardarSesion($usuario,$contrasena){
        if($this->iniciarSesion($usuario,$contrasena)){
            $datosUsuario = $this->modelo->iniciarSesion($usuario,$contrasena);
            $this->modelo->guardarSesion($datosUsuario['usu_idUsuario']);
        }
    }
    function cerrarSesion(){
        $this->modelo->cerrarSesion('idUsuario');
    }
}