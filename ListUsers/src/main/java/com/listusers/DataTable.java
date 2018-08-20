package com.listusers;

public class DataTable {
    
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTable jTable;

    public DataTable(javax.swing.JScrollPane newJScrollPane, javax.swing.JTable newJTable){
        jScrollPane = newJScrollPane;
        jTable = newJTable;
    }
    
    public javax.swing.JTable getTable(){
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane.setViewportView(jTable);

        return jTable;
    }    
}
