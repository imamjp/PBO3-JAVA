/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ImamJatiPermana.LatihanMVC.controller;

import edu.ImamJatiPermana.LatihanMVC.model.PelangganModel;
import edu.ImamJatiPermana.LatihanMVC.view.PelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 * NIM   : 10117097
 * Nama  : Imam Jati Permana
 * Kelas : IF-3
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    
    
    public void resetForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.equals("") && email.equals("") && noTlp.equals("")){
            
        }else {
            
            model.resetForm();
        }
        
    }
    
    public void simpanForm(PelangganView view){
        
        String nama = view.getTxtNama().getText();
        String email = view.getTxtEmail().getText();
        String noTlp = view.getTxtTelp().getText();
        
        if (nama.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Nama Masih Kosong");
        }else if(email.trim().equals("")){
            JOptionPane.showMessageDialog(view,"Email Masih Kosong");
        }else if(noTlp.trim().equals("")){
            JOptionPane.showMessageDialog(view,"No Telepon Masih Kosong");
        }else {
            model.simpanForm();
        }
    }
    
}
