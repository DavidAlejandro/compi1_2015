/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * interfaz.java
 *
 * Created on 16/11/2011, 07:44:27 AM
 */

package analizador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class interfaz extends javax.swing.JFrame {

    /** Creates new form interfaz */
    List<identificador> tokenslist;
    public interfaz() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Process");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Your Code:");

        jLabel2.setText("Result:");

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)))
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(46, 46, 46))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
             probarLexerFile();
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        tablaResultado();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextArea1.setText("");
        jTextArea2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }
    public void probarLexerFile() throws IOException{
        int contIDs=0;
        tokenslist = new LinkedList<identificador>();
        File fichero = new File ("fichero.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(jTextArea1.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexer lexer = new Lexer (reader);
        String resultado="";
        while (true){
            Token token =lexer.yylex();
            if (token == null){
                for(int i=0;i<tokenslist.size();i++){
                    System.out.println(tokenslist.get(i).nombre + "=" + tokenslist.get(i).ID);
                }
                jTextArea2.setText(resultado);
                return;
            }
            switch (token){
                case SUMA:
                    resultado=resultado+ "<+>";
                    break;
                case RESTA:
                    resultado=resultado+ "<->";
                    break;
                case MULT:
                    resultado=resultado+ "<*>";
                    break;
                case DIV:
                    resultado=resultado+ "</>";
                    break;
                case IF:
                    resultado=resultado+ "<if>";
                    break;
                case ASSIGN:
                    resultado=resultado+ "<=>";
                    break;
                case THEN:
                    resultado=resultado+ "<then>";
                    break;
                case ELSE:
                    resultado=resultado+ "<else>";
                    break;
                case BOOL:
                    resultado=resultado+ "<bool>";
                    break;
                case DOUBLE:
                    resultado=resultado+ "<double>";
                    break;
                case CHAR:
                    resultado=resultado+ "<char>";
                    break;
                case EQUALS:
                    resultado=resultado+ "<==>";
                    break;
                case ELSEIF:
                    resultado=resultado+ "<elseif>";
                    break;
                case CAST:
                    resultado=resultado+ "<cast>";
                    break;
                case ENDCAST:
                    resultado=resultado+ "<endcast>";
                    break;
                case FOR:
                    resultado=resultado+ "<for>";
                    break;
                case ENDFOR:
                    resultado=resultado+ "<endfor>";
                    break;
                case WHILE:
                    resultado=resultado+ "<while>";
                    break;
                case ENDWHILE:
                    resultado=resultado+ "<endwhile>";
                    break;
                case SELECT:
                    resultado=resultado+ "<select>";
                    break;
                case ENDSELECT:
                    resultado=resultado+ "<endselect>";
                    break;
                case OPTION:
                    resultado=resultado+ "<option>";
                    break;
                case ENDOPTION:
                    resultado=resultado+ "<endoption>";
                    break;
                case DEFAULT:
                    resultado=resultado+ "<default>";
                    break;
                case ENDDEFAULT:
                    resultado=resultado+ "<enddefault>";
                    break; 
                case LTERMINATOR:
                    resultado=resultado+ "<;>\n";
                    break;
                case SCOMMENT:
                    resultado=resultado+ "<//>";
                    break;
                case MCOMMENT:
                    resultado=resultado+ "</*>";
                    break;    
                case ENDMCOMMENT:
                    resultado=resultado+ "<*/>";
                    break;
                case RPAR:
                    resultado=resultado+ "<(>";
                    break;
                case LPAR:
                    resultado=resultado+ "<)>";
                    break;
                case SUMMON:
                    resultado=resultado+ "<summon>";
                    break;
                case ENDSUMMON:
                    resultado=resultado+ "<endsummon>";
                    break;
                case ENDIF:
                    resultado=resultado+ "<endif>";
                    break;
                case GREATEROREQUALTHAN:
                    resultado=resultado+ "<<=>";
                    break;
                case LESSOREQUALTHAN:
                    resultado=resultado+ "<>=>";
                    break;
                case NOTEQUAL:
                    resultado=resultado+ "<=/=>";
                    break;
                case GREATERTHAN:
                    resultado=resultado+ "<>>";
                    break;
                case LESSTHAN:
                    resultado=resultado+ "<>>";
                    break;
                case AND:
                    resultado=resultado+ "<and>";
                    break;
                case OR:
                    resultado=resultado+ "<or>";
                    break;
                case XOR:
                    resultado=resultado+ "<xor>";
                    break;
                case RETURN:
                    resultado=resultado+ "<return>";
                    break;
                case ERROR:
                    resultado=resultado+ "Error, not a valid token";
                    break;
                case ID: {
                    contIDs++;
                    identificador tokenitem=new identificador();
                    tokenitem.nombre=lexer.lexeme;
                    tokenitem.ID=contIDs;
                    tokenslist.add(tokenitem);
                    resultado=resultado+ "<ID" + contIDs + "> ";
                    break;
                }
                case INT:
                    resultado=resultado+ "< " + lexer.lexeme + "> ";
                    break;
                case CHARVALUE:
                    resultado=resultado+ "< " + lexer.lexeme + "> ";
                    break;
                default:
                    resultado=resultado+ "<"+ lexer.lexeme + "> ";
            }
    }
 }
    public void tablaResultado(){
        Object[][] matriz = new Object [tokenslist.size()][2];
        for(int i =0; i<tokenslist.size();i++){
            matriz[i][0] = tokenslist.get(i).nombre;
            matriz[i][1] = tokenslist.get(i).ID;
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz,
            new String [] {
                "Nombre", "ID"
        }
        ));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables

}
