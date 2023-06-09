// -------------------------------------------------------------------------------------------------------------------- //
// import libraries: 

package no.uib.PMCExplorer.GUI;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import javax.swing.SwingConstants;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import no.uib.PMCExplorer.ArticleBrowser.ArticleBrowser;
import no.uib.PMCExplorer.JTableRenderers.TableButtonEditor;
import no.uib.PMCExplorer.JTableRenderers.TableButtonRenderer;
import no.uib.PMCExplorer.JTableRenderers.TableColorRenderer;
import no.uib.PMCExplorer.PMCExplorer;
import no.uib.jsparklines.renderers.JSparklinesHeatMapTableCellRenderer;
import no.uib.jsparklines.renderers.util.GradientColorCoding;
// -------------------------------------------------------------------------------------------------------------------- //

/**
 * Class responsible for displaying multiple articles in a table format.
 * 
 * @author Markus Berggrav
 */
public class MultipleArticles extends javax.swing.JFrame {
    
    private ArticleBrowser articleBrowser;
    private int start;
    private int end;

    /**
     * Creates new form MultipleArticles
     */
    public MultipleArticles() {
        setDefaultLookAndFeelDecorated(true);
        initComponents();
        this.start = -1;
        this.end = -1;
        progressBar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        keyWordLabel = new javax.swing.JLabel();
        keyWordScrollPane = new javax.swing.JScrollPane();
        keywordArea = new javax.swing.JTextArea();
        browseFilesRadioButton = new javax.swing.JRadioButton();
        pubMedRadioButton = new javax.swing.JRadioButton();
        runButton = new javax.swing.JButton();
        articleTableScrollPane = new javax.swing.JScrollPane();
        articleTable = new javax.swing.JTable();
        progressBar = new javax.swing.JProgressBar();
        previousButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        articleRange = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PMCExplorer");
        setExtendedState(MAXIMIZED_BOTH);
        setName("multipleArticlesFrame"); // NOI18N

        mainPanel.setBackground(new java.awt.Color(115, 147, 179));
        mainPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));

        keyWordLabel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        keyWordLabel.setForeground(new java.awt.Color(255, 255, 255));
        keyWordLabel.setText("Input keywords:");

        keyWordScrollPane.setForeground(new java.awt.Color(255, 255, 255));
        keyWordScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        keywordArea.setBackground(new java.awt.Color(182, 208, 226));
        keywordArea.setColumns(20);
        keywordArea.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        keywordArea.setForeground(new java.awt.Color(51, 51, 51));
        keywordArea.setLineWrap(true);
        keywordArea.setRows(5);
        keywordArea.setWrapStyleWord(true);
        keyWordScrollPane.setViewportView(keywordArea);

        browseFilesRadioButton.setBackground(new java.awt.Color(115, 147, 179));
        buttonGroup1.add(browseFilesRadioButton);
        browseFilesRadioButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        browseFilesRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        browseFilesRadioButton.setSelected(true);
        browseFilesRadioButton.setText("Browse Local Files");
        browseFilesRadioButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        browseFilesRadioButton.setMaximumSize(new java.awt.Dimension(129, 28));
        browseFilesRadioButton.setMinimumSize(new java.awt.Dimension(129, 28));
        browseFilesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseFilesRadioButtonActionPerformed(evt);
            }
        });

        pubMedRadioButton.setBackground(new java.awt.Color(115, 147, 179));
        buttonGroup1.add(pubMedRadioButton);
        pubMedRadioButton.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pubMedRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        pubMedRadioButton.setText("Browse PubMed");
        pubMedRadioButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pubMedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubMedRadioButtonActionPerformed(evt);
            }
        });

        runButton.setBackground(new java.awt.Color(102, 102, 102));
        runButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        runButton.setForeground(new java.awt.Color(0, 0, 0));
        runButton.setText("RUN");
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        articleTable.setBackground(new java.awt.Color(182, 208, 226));
        articleTable.setForeground(new java.awt.Color(0, 0, 0));
        articleTable.setFillsViewportHeight(true);
        articleTable.setShowGrid(true);
        articleTableScrollPane.setViewportView(articleTable);

        progressBar.setBackground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        progressBar.setForeground(new java.awt.Color(102, 102, 102));
        progressBar.setIndeterminate(true);

        previousButton.setBackground(new java.awt.Color(102, 102, 102));
        previousButton.setForeground(new java.awt.Color(0, 0, 0));
        previousButton.setText("PREVIOUS");
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(102, 102, 102));
        nextButton.setForeground(new java.awt.Color(0, 0, 0));
        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        articleRange.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(articleTableScrollPane)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(keyWordScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(keyWordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(browseFilesRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(pubMedRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(previousButton)
                        .addGap(28, 28, 28)
                        .addComponent(articleRange, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(keyWordLabel)
                        .addGap(9, 9, 9)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(runButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(browseFilesRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pubMedRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(keyWordScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addComponent(articleTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articleRange))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1106, 687);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Initialize article meta-data table on buttonclick.
     * 
     * @param evt - actionevent
     */
    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        this.start = 0;
        this.end = 20;
        articleRange.setText(String.valueOf(start) + "/" + String.valueOf(end));
        progressBar.setVisible(true);
        createTable();
        progressBar.setVisible(false); 
        
    }//GEN-LAST:event_runButtonActionPerformed

    /**
     * Browse local articles on buttonclick.
     * 
     * @param evt - actionevent
     */
    private void browseFilesRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseFilesRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_browseFilesRadioButtonActionPerformed

    
    /**
     * Browse PubMed articles button.
     * 
     * @param evt - actionevent
     */
    private void pubMedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubMedRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pubMedRadioButtonActionPerformed

    /**
     * Inspect previous 20 articles in the PubMed database
     * 
     * @param evt - actionevent
     */
    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        // TODO add your handling code here:
        if (start - 20 >= 0){
            start -= 20;
            end -= 20;
            articleRange.setText(String.valueOf(start) + "/" + String.valueOf(end));
            
            progressBar.setVisible(true);
            createTable();
            progressBar.setVisible(false); }
    }//GEN-LAST:event_previousButtonActionPerformed

    /**
     * Inspect next 20 articles in the PubMed database.
     * 
     * @param evt - actionevent
     */
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        if (start >= 0){
            start += 20;
            end += 20;
            progressBar.setVisible(true);
            createTable();
            progressBar.setVisible(false); }
    }//GEN-LAST:event_nextButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MultipleArticles().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel articleRange;
    private javax.swing.JTable articleTable;
    private javax.swing.JScrollPane articleTableScrollPane;
    private javax.swing.JRadioButton browseFilesRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel keyWordLabel;
    private javax.swing.JScrollPane keyWordScrollPane;
    private javax.swing.JTextArea keywordArea;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton previousButton;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JRadioButton pubMedRadioButton;
    private javax.swing.JButton runButton;
    // End of variables declaration//GEN-END:variables

    /**
     * Create table with articles from PubMed or local files depending
     * on what is selected.
     */
    private void createTable(){
        
        this.articleBrowser = new ArticleBrowser(keywordArea.getText());
        
        if (browseFilesRadioButton.isSelected()){
            Object[][] articleMatrix = articleBrowser.browseLocalArticles();
            initializeTable(articleMatrix);
        }
        else if (pubMedRadioButton.isSelected()){
            Object[][] articleMatrix = articleBrowser.browsePubmedArticles(start,end);
            initializeTable(articleMatrix);
        }
        
    }
    
    /**
     * Initialize the table and set table properties
     * 
     * @param articleMatrix - matrix consisting of article meta-data and keyword frequencies. 
     */
    private void initializeTable(Object[][] articleMatrix){
        
        DefaultTableModel tableModel = initializeTableModel(articleMatrix);
        articleTable.setModel(tableModel);
        
        setTableProperties();
    }
    
    /**
     * Initialize tablemodel with tablemodel listener. 
     * This method responds to the actions performed on buttonclick in the table.
     * 
     * @param urlMatrix - matrix consisting of article meta-data and keyword frequencies.
     * @return - tablemodel that will fill the JTable.
     */
    private DefaultTableModel initializeTableModel(Object[][] urlMatrix){

        String[] columnNames = {"Nr","Notes","Author","Title","Year","PMC-id", "Status","Frequencies","View Article"};
        DefaultTableModel tableModel = new DefaultTableModel(urlMatrix,columnNames){
            @Override
        public boolean isCellEditable(int row, int column) {return (column ==1) || (column == 5) || (column == 8);}};

            tableModel.addTableModelListener(
                (var e) -> {
                    if (e.getType() == TableModelEvent.UPDATE){
                        int row = e.getFirstRow();
                        int column = e.getColumn();
                        TableModel model1 = (TableModel)e.getSource();
                        String chosenArticle = (String) model1.getValueAt(row,5);
                        
                        if (column == 1){
                            if (Desktop.isDesktopSupported()){
                                File notesFile = new File(PMCExplorer.Downloads_Folder_Url + "/" + chosenArticle + "/Article_Notes.txt");
                                try {
                                    Desktop.getDesktop().edit(notesFile);
                                } catch (IOException ex) {
                                    System.out.println(ex.getMessage());
                                }
                            }
                            
                        }
                        
                        if (column == 5){
                            String doi = articleBrowser.getArticle(row).getDoi();
                            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                                try {
                                    Desktop.getDesktop().browse(new URI(doi));
                                } catch (Exception ex) {
                                    ex.getMessage();
                                    
                                }
}
                        }

                        if (column == 8){
                            SingleArticle article = new SingleArticle(articleBrowser.getArticle(row),chosenArticle,keywordArea.getText());
                            article.openPanels();
                            article.setVisible(true);
                        }
                    }
                });

        return tableModel;
    }
    
    /**
     * Method responsible for customizing renderers for table-colors, table-buttons and frequency-plot.
     * 
     */
    private void setTableProperties(){
        
        setTableDimensions();
        
        TableColumn notesColumn = articleTable.getColumn("Notes");
        notesColumn.setCellRenderer(new TableButtonRenderer());
        notesColumn.setCellEditor(new TableButtonEditor());
        
        
        TableColumn titleColumn = articleTable.getColumn("Title");
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        leftRenderer.setVerticalAlignment(SwingConstants.TOP);
        titleColumn.setCellRenderer(leftRenderer);
        
        TableColumn idColumn = articleTable.getColumn("PMC-id");
        idColumn.setCellRenderer(new TableButtonRenderer());
        idColumn.setCellEditor(new TableButtonEditor());
        
        articleTable.getColumn("Status").setCellRenderer(new TableColorRenderer());
        
        TableColumn frequencyColumn = articleTable.getColumn("Frequencies");
        JSparklinesHeatMapTableCellRenderer heatMapRenderer = new JSparklinesHeatMapTableCellRenderer
                                                                    (GradientColorCoding.ColorGradient.RedWhiteGreen,100.0);
        frequencyColumn.setCellRenderer(heatMapRenderer);
        
        
        TableColumn buttonColumn = articleTable.getColumn("View Article");
        buttonColumn.setCellRenderer(new TableButtonRenderer());
        buttonColumn.setCellEditor(new TableButtonEditor());
        
    }
    
    /**
     * Method responsible for setting the dimensions of the columns. 
     * 
     */
    private void setTableDimensions(){
        int maxWidth = articleTableScrollPane.getWidth() -5;
        //                              {"Nr","Notes", "Author","Title","Year","PMC-id", "Status","Frequencies","View Article"};
        float[] columnWidthPercentage = {0.05f,0.05f   , 0.15f,  0.25f,  0.05f,  0.10f,    0.05f,     0.20f,        0.10f};
        
        articleTable.setRowHeight(50);
        
        for (int i= 0; i < 9; i++){
            int width = Math.round(columnWidthPercentage[i]*maxWidth);
            articleTable.getColumnModel().getColumn(i).setPreferredWidth(width);
            
        } 
    }

}
