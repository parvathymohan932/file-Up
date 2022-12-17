/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package filetools2;

import java.io.File;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import filetools2.FileCompareWindow;
import static filetools2.FileComparison.equalFiles1;
import java.awt.HeadlessException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.nio.file.Files;
//import filetools2.FileComparison;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author darshanadask
 */
public class FileEqualWindow extends javax.swing.JFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    
     String[] pathArray1, pathArray2;
     public int size1,size2;
     public static File[] copyFiles;

    /**
     * Creates new form FileEqualWindow
     */
    public FileEqualWindow() throws IOException {
        initComponents();
        Table_Populate1();
        Table_Populate2();
        
        
    }
    
    public final void Table_Populate1() throws IOException{
        
        
     //   int i=0;
        
        
       // FileComparison c = new FileComparison();
       System.out.println("the folderpath 1 in FIleCompareWindow is "+filetools2.FileCompareWindow.directory1);

        filetools2.FileComparison.fileCompare(filetools2.FileCompareWindow.directory1,filetools2.FileCompareWindow.directory2);
         
        
  //int k=0;
  //String[] row3= new String[filetools2.FileComparison.flag];
 // System.out.println("row3 length is  "+ filetools2.FileCompareWindow.row1.length);
        for (File file : filetools2.FileComparison.equalFiles1 ) {
            
            if(file!=null){
                System.out.println("file is " +file);
                String name=file.getName();
                    String modifiedDate=sdf.format(file.lastModified());
                    String type=Files.probeContentType(file.toPath());
                    String sizeKB=Long.toString(file.length());
                    String[] data={name,modifiedDate,type,sizeKB};
                    size1 = filetools2.FileComparison.equalFiles1.length;
                  //  pathArray1= new String[size1];
                    
                    DefaultTableModel model1 = (DefaultTableModel)fileEqualTable1.getModel();
              //      for(int j=0;j<size1;j++){
               //         pathArray1[j]= file.getAbsolutePath() ;
                //    }
                     model1.addRow(data);
               
        
              // row3[k]= file.getName() ;
              // k++;
               // model1.addRow(row3);

            }
             
            
        }
        
       
        
       // String[] row1= new String[c.flag];
        
        for(int i=0;i<filetools2.FileComparison.flag;i++){
            
            System.out.println("The files are "+filetools2.FileComparison.equalFiles1[i]);
        }
        
       /* for (File file : c.equalFiles1 ) {
                if(file!= null){
                  row1[i]= file.getName() ; 
                   i++;  
                }
            
                   
               
           
            
        }*/
        
    }
    
    
    public final void Table_Populate2() throws IOException{
        
        
     //   int i=0;
        
        
       // FileComparison c = new FileComparison();
    //   System.out.println("the folderpath 1 in FIleCompareWindow is "+filetools2.FileCompareWindow.directory1);

        filetools2.FileComparison.fileCompare(filetools2.FileCompareWindow.directory1,filetools2.FileCompareWindow.directory2);
         
        
  //int k=0;
  //String[] row3= new String[filetools2.FileComparison.flag];
 // System.out.println("row3 length is  "+ filetools2.FileCompareWindow.row1.length);
        for (File file : filetools2.FileComparison.equalFiles2 ) {
            
            if(file!=null){
                System.out.println("file is " +file);
                String name1=file.getName();
                    String modifiedDate1=sdf.format(file.lastModified());
                    String type1=Files.probeContentType(file.toPath());
                    String sizeKB1=Long.toString(file.length());
                    String[] data={name1,modifiedDate1,type1,sizeKB1};
                    size2 = filetools2.FileComparison.equalFiles2.length;
                    pathArray2= new String[size2];
                    
                    DefaultTableModel model2 = (DefaultTableModel)fileEqualTable2.getModel();
                    for(int j=0;j<size2;j++){
                        pathArray2[j]= file.getAbsolutePath() ;
                    }
                     model2.addRow(data);
               
        
              // row3[k]= file.getName() ;
              // k++;
               // model1.addRow(row3);

            }
             
            
        }
       
        
       // String[] row1= new String[c.flag];
        
        
        
       /* for (File file : c.equalFiles1 ) {
                if(file!= null){
                  row1[i]= file.getName() ; 
                   i++;  
                }
            
                   
               
           
            
        }*/
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fileEqualTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        fileEqualTable2 = new javax.swing.JTable();
        deleteAButton = new javax.swing.JButton();
        deleteBButton = new javax.swing.JButton();
        syncButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("The following files are equal:");

        fileEqualTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FolderA", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(fileEqualTable1);

        fileEqualTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FolderB", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(fileEqualTable2);

        deleteAButton.setText("Delete from folder A");
        deleteAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAButtonActionPerformed(evt);
            }
        });

        deleteBButton.setText("Delete from folder B");
        deleteBButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBButtonActionPerformed(evt);
            }
        });

        syncButton.setText("Sync files");
        syncButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deleteBButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteAButton)
                            .addComponent(syncButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(deleteAButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(syncButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAButtonActionPerformed
        try{
            for (File f : filetools2.FileComparison.equalFiles1) {
          
            if(f.exists()){
                f.delete();
            }
        } // filetools2.FileComparison.fileCompare(filetools2.FileCompareWindow.directory1,filetools2.FileCompareWindow.directory2);
        JOptionPane.showMessageDialog(null,"File delete successfully!");
        }
        catch(HeadlessException e){
            
        }
        
        
        
    }//GEN-LAST:event_deleteAButtonActionPerformed

    private void deleteBButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBButtonActionPerformed
         for (File f : filetools2.FileComparison.equalFiles2) {
             if(f.exists()){
                f.delete();
            }
             
         }
         JOptionPane.showMessageDialog(null,"File delete successfully!");
    }//GEN-LAST:event_deleteBButtonActionPerformed

    private void syncButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncButtonActionPerformed
        // TODO add your handling code here:
       
        
        for(int i=0;i<filetools2.FileComparison.equalFiles1.length;i++){
        
        int p=0;
        System.out.println(""+filetools2.FileComparison.firstModifiedFilesA.length);
        copyFiles = new File[filetools2.FileComparison.firstModifiedFilesA.length];
        System.out.println(filetools2.FileComparison.firstModifiedFilesA.length);
        for(File f : filetools2.FileComparison.firstModifiedFilesA){
            if(f.exists()){
                copyFiles[p]= f;
                p++;
            }
            
        }
        for(File f : copyFiles){
            System.out.println("Cpy files is "+f);
            
        }
        for (File f : filetools2.FileComparison.firstModifiedFilesA) {
             if(f.exists()){
                f.delete();
            }
        if(filetools2.FileComparison.lastModifiedFilesB[i].exists() ){
           // File source = new File(filetools2.FileComparison.lastModifiedFilesB[i].getAbsolutePath());
       // File dest = new File (filetools2.FileComparison.firstModifiedFilesA[i].getAbsolutePath());
         Path sourceDirectory = Paths.get(filetools2.FileComparison.lastModifiedFilesB[i].getAbsolutePath());
        Path targetDirectory = Paths.get(copyFiles[i].getAbsolutePath());
        
            try {
                Files.copy(sourceDirectory,targetDirectory);
            } catch (IOException ex) {
                Logger.getLogger(FileEqualWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
        
            
        }

        
        
    }//GEN-LAST:event_syncButtonActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FileEqualWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FileEqualWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FileEqualWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FileEqualWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
          //   FileEqualWindow w = new FileEqualWindow();
           //   w.setVisible(true);
           //   w.Table_Populate();


        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FileEqualWindow().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FileEqualWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteAButton;
    private javax.swing.JButton deleteBButton;
    private javax.swing.JTable fileEqualTable1;
    private javax.swing.JTable fileEqualTable2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton syncButton;
    // End of variables declaration//GEN-END:variables
}
