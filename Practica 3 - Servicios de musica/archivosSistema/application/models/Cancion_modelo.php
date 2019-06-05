<?php

defined('BASEPATH') OR exit('No direct script access allowed');

class Cancion_modelo extends CI_Model{
    
    function __construct(){
        $this->load->database('test');
        $this->load->helper('url');
        $this->load->library('session');
    }
    public function getCancionesEncuesta(){
        $this->db->order_by('id','RANDOM');
        $this->db->limit(3);
        $query =$this->db->get('canciones');
        return $query->result_array();
    }//idUsuario,cancionId,calificacion
    public function guardarCalificacionesEncuesta($idUsuario, $idCancion, $calificacion){
        return $this->db->insert('calificacionescancion',array(
            'cal_calificacionCancion'=>0,
            'usu_idUsuario'=>$idUsuario,
            'can_id'=>$idCancion,
            'cal_calificacion'=>$calificacion
        ));
    }
}