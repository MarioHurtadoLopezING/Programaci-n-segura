<?php

defined('BASEPATH') OR exit('No direct script access allowed');

class CancionController extends CI_Controller{
    
    public function __construct(){
        parent::__construct();
        $this->load->helper('url');
        $this->load->helper('form');
        $this->load->library('Autenticacion');
        $this->load->library('Cancion');
        $this->load->library('form_validation');
    }
    function index(){
        if(!$this->autenticacion->getSesionValida()){
            redirect('InicioSesionController/vista');
        }else{
            $datos = $this->autenticacion->getDatosUsuario($this->autenticacion->getIdUsuario());
            $this->load->view('paginas/paginaPrincipal',array('nombreUsuario'=>$datos['usu_nombreUsuario']));
        }
    }
    function getCancionesJSON(){
        $resultado = array();
        if($this->autenticacion->getSesionvalida()){
            $resultado['estado'] = '200';
            $resultado['canciones'] = json_encode($this->cancion->getCancionesEncuesta());
        }else{
            $resultado['estado'] = '404';
        }
        echo json_encode($resultado);
    }

    function calificarCancionesEncuesta(){
        $idUsuario = $this->autenticacion->getIdUsuario();
        for($i = 0; $i < 3; $i++){
            $this->cancion->guardarCalificacionesEncuesta($idUsuario,
            $this->input->post('cancion'.($i+1)),$this->input->post('selector'.($i+1)));
        }
        $resultado['estado'] = '400';
        echo json_encode($resultado);
    }
}