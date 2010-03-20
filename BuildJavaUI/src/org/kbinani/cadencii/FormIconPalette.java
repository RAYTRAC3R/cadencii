package org.kbinani.cadencii;

//SECTION-BEGIN-IMPORT
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import org.kbinani.windows.forms.BCheckBox;
import org.kbinani.windows.forms.BForm;
import org.kbinani.windows.forms.BMenu;
import org.kbinani.windows.forms.BMenuBar;
import org.kbinani.windows.forms.BMenuItem;

//SECTION-END-IMPORT
public class FormIconPalette extends BForm {
//SECTION-BEGIN-FIELD
    private static final long serialVersionUID = 1L;
    private BMenuBar myMenuBar = null;
    private BMenu menuWindow = null;
    private BMenuItem menuWindowHide = null;
    private BCheckBox chkTopMost = null;
    private JPanel jPanel = null;

    //SECTION-END-FIELD
    public FormIconPalette() {
    	super();
    	initialize();
    }
    //SECTION-BEGIN-METHOD

    private void initialize() {
        this.setSize(new Dimension(275, 178));
        this.setContentPane(getJPanel());
        this.setJMenuBar(getMyMenuBar());
    		
    }

    /**
     * This method initializes menuBar	
     * 	
     * @return org.kbinani.windows.forms.BMenuBar	
     */
    private BMenuBar getMyMenuBar() {
        if (myMenuBar == null) {
            myMenuBar = new BMenuBar();
            myMenuBar.add(getMenuWindow());
        }
        return myMenuBar;
    }

    /**
     * This method initializes menuWindow	
     * 	
     * @return javax.swing.JMenu	
     */
    private BMenu getMenuWindow() {
        if (menuWindow == null) {
            menuWindow = new BMenu();
            menuWindow.setText("Window");
            menuWindow.add(getMenuWindowHide());
        }
        return menuWindow;
    }

    /**
     * This method initializes menuWindowHide	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private BMenuItem getMenuWindowHide() {
        if (menuWindowHide == null) {
            menuWindowHide = new BMenuItem();
            menuWindowHide.setText("Hide");
        }
        return menuWindowHide;
    }

    /**
     * This method initializes chkTopMost	
     * 	
     * @return org.kbinani.windows.forms.BCheckBox	
     */
    private BCheckBox getChkTopMost() {
        if (chkTopMost == null) {
            chkTopMost = new BCheckBox();
            chkTopMost.setText("TopMost");
        }
        return chkTopMost;
    }

    /**
     * This method initializes jPanel	
     * 	
     * @return javax.swing.JPanel	
     */
    private JPanel getJPanel() {
        if (jPanel == null) {
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridy = 0;
            jPanel = new JPanel();
            jPanel.setLayout(new GridBagLayout());
            jPanel.add(getChkTopMost(), gridBagConstraints);
        }
        return jPanel;
    }

    //SECTION-END-METHOD
}  //  @jve:decl-index=0:visual-constraint="10,10"
