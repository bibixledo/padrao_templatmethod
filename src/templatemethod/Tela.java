package templatemethod;

import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class Tela extends javax.swing.JFrame {
    
    PersistenciaLista dados;

    public Tela() {
        initComponents();
        dados = new PersistenciaLista();
        DefaultTableModel model = (DefaultTableModel) grid_Dados.getModel();
        Iterator<Professor> it = dados.getDados();
        //List<Professor> teste = new SortDepart().bubbleSort(dados.getLista());
        //Iterator<Professor> it = teste.iterator();
        while(it.hasNext()){
            Professor aux = it.next();
            String[] x = {aux.getMatricula(),aux.getNome(),aux.getDepartamento(),aux.getTitulacao(),aux.getHorista()};
            model.addRow(x);
        }
        //String postagem = novaPostagem.getText();
        //model.add(postagem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid_Dados = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMain = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setText("Dados Professor");

        grid_Dados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matrícula", "Nome", "Departamento", "Titulação", "Horista"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(grid_Dados);

        jCheckBox1.setText("Ord. Nome");

        jCheckBox2.setText("Ord. Matricula");

        jCheckBox3.setText("Ord. Titulacao");

        jCheckBox4.setText("Ord. Departamento");

        jCheckBox5.setText("Ord. Horista");

        jToggleButton1.setText("Atualizar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        menuMain.setText("Ordenar");
        jMenuBar1.add(menuMain);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(labelTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3)
                                .addGap(30, 30, 30)
                                .addComponent(jCheckBox5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4)
                                .addGap(26, 26, 26)
                                .addComponent(jToggleButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox4))
                    .addComponent(jToggleButton1))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        List<Professor> dadosProf = dados.getLista();
        
        if(this.jCheckBox1.isSelected())
            dadosProf = new SortNome().bubbleSort(dadosProf);
        if(this.jCheckBox2.isSelected())
            dadosProf = new SortMatricula().bubbleSort(dadosProf);
        if(this.jCheckBox3.isSelected())
            dadosProf = new SortTitulacao().bubbleSort(dadosProf);
        if(this.jCheckBox4.isSelected())
            dadosProf = new SortDepart().bubbleSort(dadosProf);
        if(this.jCheckBox5.isSelected())
            dadosProf = new SortHorst().bubbleSort(dadosProf);
        
        DefaultTableModel model = (DefaultTableModel) grid_Dados.getModel();
        Iterator<Professor> it = dadosProf.iterator();
        for(int i = 0; i < model.getRowCount();i++){
            System.out.println(i);
            model.removeRow(i);
        }
        int i = 0;
          while(it.hasNext()){
            Professor aux = it.next();
            String[] x = {aux.getMatricula(),aux.getNome(),aux.getDepartamento(),aux.getTitulacao(),aux.getHorista()};
            model.addRow(x);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable grid_Dados;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenu menuMain;
    // End of variables declaration//GEN-END:variables
}
