<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class InicioSesionController extends CI_Controller {
    
    public function __construct(){
        parent::__construct();
        $this->load->helper('url');
        $this->load->helper('form');
        $this->load->library('Autenticacion');
        $this->load->library('form_validation');
    }
    public function index(){
        if(!$this->autenticacion->getSesionValida()){
            redirect('InicioSesionController/vista');
        }else{
            redirect('CancionController/index');
        }
    }
    public function vista($pagina = 'login'){
        $this->load->view('paginas/inicioSesion');
    }
    public function iniciarSesion(){
        $usuario = $this->input->post('txtNombreUsuario');
        $contrasena = $this->input->post('txtContrasena');
        if($this->autenticacion->iniciarSesion($usuario,$contrasena)){
            $this->autenticacion->guardarSesion($usuario,$contrasena);
            $this->index();
        }else{
            echo "usuario no valido";
        }
    }
    public function cerrarSesion(){
        $this->autenticacion->cerrarSesion();
        redirect('InicioSesionController/vista');
    }
}