/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graphicalexamples.models;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Jhonatan
 */
public class ComboCellRender implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        String [] nomes = {"Teste","Tablea","1234"};
        JComboBox combo = new JComboBox(nomes);
        combo.setSelectedItem(value);
        return combo;
    }
    
}
