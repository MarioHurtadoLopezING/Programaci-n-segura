<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Usuario_modelo extends CI_Model{
    
    private $datos_del_usuario;

    function __construct(){
        $this->load->database('test');
        $this->load->helper('url');
        $this->load->library('session');
    }
    function getDatosSesion($idUsuario){
        return $this->session->userdata($idUsuario);
    }
    function datosUsuario($idUsuario){
        if(!isset($this->datos_del_usuario)){
            $this->datos_del_usuario = $this->db->get_where('usuario'
            ,['usu_idUsuario' => $idUsuario])->row_array();
        }
        return $this->datos_del_usuario;
    }
    function iniciarSesion($usuario,$contrasena){
        if (!isset($this->datos_del_usuario)) {
			$this->datos_del_usuario = $this->db->where('usu_nombreUsuario', $usuario)
			->where('usu_contrasena', $contrasena)
			->get('usuario')->row_array();	
		}
        return $this->datos_del_usuario;
    }
    function guardarSesion($idUsuario){
        $this->session->set_userdata('idUsuario',$idUsuario);
    }
    function cerrarSesion($idUsuario){
        $this->session->unset_userdata($idUsuario);
    }
}