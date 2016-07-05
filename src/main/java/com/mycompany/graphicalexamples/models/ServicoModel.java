/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphicalexamples.models;

import com.mycompany.graphicalexamples.beans.ServicoBeans;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Jhonatan
 */
public class ServicoModel extends AbstractTableModel  {

    private final List<ServicoBeans> servicos;
    private final String [] names = {"Quantidade","Serviço","Identificação","Ações"};
    
    public ServicoModel(List<ServicoBeans> servicos){
        this.servicos = servicos;
    }
    
    @Override
    public int getRowCount() {
        return servicos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        return this.names[column];
    }

    public String [] getDataCombo(){
        return this.names;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 :{
                return this.servicos.get(rowIndex).getQuantidade();
            }
            case 1 : {
                return this.servicos.get(rowIndex).getNomeServico();
            }
            case 2 : {
                return this.servicos.get(rowIndex).getIdentificacaoServico();
            }
            case 3 : {
                return 0;
            }
            
            default : {
                return "";
            }
        }
    }

    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch(columnIndex){
            case 0 :{
                return Integer.class;
            }
            case 1 : {
                return String.class;
            }
            case 2 : {
                return String.class;
            }
            case 3 : {
                return JComboBox.class;
            }default : {
                return Object.class;
            }
        }
    }
    
    
    
}