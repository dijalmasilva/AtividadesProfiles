/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.ifpb.pp.main;

import edu.ifpb.pp.entidades.Editora;
import edu.ifpb.pp.infraestrutura.GenericDAO;
import edu.ifpb.pp.infraestrutura.GenericRepository;

/**
 * 
 * @author Dijalma Silva <dijalmacz@gmail.com>
 */
public class Loader {

    public static void main(String[] args) {
     
        
        GenericDAO<Editora> dao = new GenericRepository(Editora.class);
        
    }
}
