/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphicalexamples.models;

import java.awt.Component;
import javax.swing.AbstractCellEditor;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;

/**
 *
 * @author Jhonatan
 */
public class ComboxBoxEditorData extends AbstractCellEditor implements TableCellEditor {

    private JComboBox combo;
    private String [] nomes = {"Jhonatan","Teste","1234"};
    
    @Override
    public Object getCellEditorValue() {
        return 0;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        combo = new JComboBox(nomes);
        
        return combo;
    }
    
}
