package org.kbinani.Cadencii;

//SECTION-BEGIN-IMPORT
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import org.kbinani.windows.forms.BButton;
import org.kbinani.windows.forms.BComboBox;
import org.kbinani.windows.forms.BForm;
import org.kbinani.windows.forms.BHScrollBar;
import org.kbinani.windows.forms.BLabel;
import org.kbinani.windows.forms.BMenu;
import org.kbinani.windows.forms.BMenuBar;
import org.kbinani.windows.forms.BMenuItem;
import org.kbinani.windows.forms.BPanel;
import org.kbinani.windows.forms.BPopupMenu;
import org.kbinani.windows.forms.BSlider;
import org.kbinani.windows.forms.BSplitPane;
import org.kbinani.windows.forms.BToggleButton;
import org.kbinani.windows.forms.BToolBar;
import org.kbinani.windows.forms.BVScrollBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

//SECTION-END-IMPORT
public class FormMain extends BForm {
    //SECTION-BEGIN-FIELD

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;  //  @jve:decl-index=0:visual-constraint="10,55"
    private BMenuBar jBMenuBar = null;
    private BMenu menuFile = null;
    private BMenuItem menuFileNew = null;
    private BMenuItem menuFileOpen = null;
    private BMenuItem menuFileSave = null;
    private BMenuItem menuFileSaveNamed = null;
    private JSeparator toolStripMenuItem10 = null;
    private BMenuItem menuFileOpenVsq = null;
    private BMenuItem menuFileOpenUst = null;
    private BMenu menuFileImport = null;
    private BMenu menuFileExport = null;
    private JSeparator toolStripMenuItem101 = null;
    private BMenuItem menuFileRecent = null;
    private JSeparator toolStripMenuItem102 = null;
    private BMenuItem menuFileQuit = null;
    private BMenuItem menuFileImportVsq = null;
    private BMenuItem menuFileImportMidi = null;
    private BMenuItem menuFileExportWave = null;
    private BMenuItem menuFileExportMidi = null;
    private BMenu menuEdit = null;
    private BMenuItem menuEditUndo = null;
    private BMenuItem menuEditRedo = null;
    private JSeparator toolStripMenuItem103 = null;
    private BMenuItem menuEditCut = null;
    private BMenuItem menuEditCopy = null;
    private BMenuItem menuEditPaste = null;
    private BMenuItem menuEditDelete = null;
    private JSeparator toolStripMenuItem104 = null;
    private BMenuItem menuEditAutoNormalizeMode = null;
    private JSeparator toolStripMenuItem1041 = null;
    private BMenuItem menuEditSelectAll = null;
    private BMenuItem menuEditSelectAllEvents = null;
    private BMenu menuVisual = null;
    private BMenuItem menuVisualControlTrack = null;
    private BMenuItem menuVisualMixer = null;
    private BMenuItem menuVisualWaveform = null;
    private BMenuItem menuVisualProperty = null;
    private BMenuItem menuVisualOverview = null;
    private JSeparator toolStripMenuItem1031 = null;
    private BMenuItem menuVisualGridline = null;
    private JSeparator toolStripMenuItem1032 = null;
    private BMenuItem menuVisualStartMarker = null;
    private BMenuItem menuVisualEndMarker = null;
    private JSeparator toolStripMenuItem1033 = null;
    private BMenuItem menuVisualNoteProperty = null;
    private BMenuItem menuVisualLyrics = null;
    private BMenuItem menuVisualPitchLine = null;
    private BMenu menuJob = null;
    private BMenuItem menuJobNormalize = null;
    private BMenuItem menuJobInsertBar = null;
    private BMenuItem menuJobDeleteBar = null;
    private BMenuItem menuJobRandomize = null;
    private BMenuItem menuJobConnect = null;
    private BMenuItem menuJobLyric = null;
    private BMenuItem menuJobRewire = null;
    private BMenuItem menuJobRealTime = null;
    private BMenuItem menuJobReloadVsti = null;
    private BMenu menuTrack = null;
    private BMenuItem menuTrackOn = null;
    private JSeparator toolStripMenuItem10321 = null;
    private BMenuItem menuTrackAdd = null;
    private BMenuItem menuTrackCopy = null;
    private BMenuItem menuTrackChangeName = null;
    private BMenuItem menuTrackDelete = null;
    private JSeparator toolStripMenuItem10322 = null;
    private BMenuItem menuTrackRenderCurrent = null;
    private BMenuItem menuTrackRenderAll = null;
    private JSeparator toolStripMenuItem10323 = null;
    private BMenuItem menuTrackOverlay = null;
    private BMenu menuTrackRenderer = null;
    private JSeparator toolStripMenuItem10324 = null;
    private BMenu menuTrackBgm = null;
    private BMenuItem menuTrackManager = null;
    private BMenu menuLyric = null;
    private BMenuItem menuLyricExpressionProperty = null;
    private BMenuItem menuLyricVibratoProperty = null;
    private BMenuItem menuLyricSymbol = null;
    private BMenuItem menuLyricDictionary = null;
    private BMenu menuScript = null;
    private BMenuItem menuScriptUpdate = null;
    private BMenu menuSetting = null;
    private BMenuItem menuSettingPreference = null;
    private BMenu menuSettingGameControler = null;
    private BMenuItem menuSettingShortcut = null;
    private BMenuItem menuSettingMidi = null;
    private BMenuItem menuSettingUtauVoiceDB = null;
    private JSeparator toolStripMenuItem103211 = null;
    private BMenuItem menuSettingDefaultSingerStyle = null;
    private JSeparator toolStripMenuItem103212 = null;
    private BMenu menuSettingPositionQuantize = null;
    private BMenuItem menuSettingSingerProperty = null;
    private BMenu menuSettingPaletteTool = null;
    private BMenuItem menuSettingPositionQuantize04 = null;
    private BMenuItem menuSettingPositionQuantize08 = null;
    private BMenuItem menuSettingPositionQuantize16 = null;
    private BMenuItem menuSettingPositionQuantize32 = null;
    private BMenuItem menuSettingPositionQuantize64 = null;
    private BMenuItem menuSettingPositionQuantize128 = null;
    private BMenuItem menuSettingPositionQuantizeOff = null;
    private JSeparator toolStripMenuItem1032121 = null;
    private BMenuItem menuSettingPositionQuantizeTriplet = null;
    private BMenu menuSettingLengthQuantize = null;
    private BMenuItem menuSettingLengthQuantize04 = null;
    private BMenuItem menuSettingLengthQuantize08 = null;
    private BMenuItem menuSettingLengthQuantize16 = null;
    private BMenuItem menuSettingLengthQuantize32 = null;
    private BMenuItem menuSettingLengthQuantize64 = null;
    private BMenuItem menuSettingLengthQuantize128 = null;
    private BMenuItem menuSettingLengthQuantizeOff = null;
    private JSeparator toolStripMenuItem10321211 = null;
    private BMenuItem menuSettingLengthQuantizeTriplet = null;
    private BMenu menuHelp = null;
    private BMenuItem menuHelpAbout = null;
    private BSplitPane splitContainer2 = null;
    private BPanel panel1 = null;
    private BPanel panel2 = null;
    private BSplitPane splitContainer1 = null;
    private TrackSelector trackSelector = null;
    private BSplitPane splitContainerProperty = null;
    private BPanel m_property_panel_container = null;
    private BToolBar toolStripFile = null;
    private BToolBar toolStripBottom = null;
    private BButton stripBtnFileNew = null;
    private BButton stripBtnFileOpen = null;
    private BButton stripBtnFileSave = null;
    private BButton stripBtnCut = null;
    private BButton stripBtnCopy = null;
    private BButton stripBtnPaste = null;
    private BButton stripBtnUndo = null;
    private BButton stripBtnRedo = null;
    private BToolBar toolStripPosition = null;
    private BButton stripBtnMoveTop = null;
    private BPanel BPanel = null;
    private BButton stripBtnRewind = null;
    private BButton stripBtnForward = null;
    private BButton stripBtnMoveEnd = null;
    private BButton stripBtnPlay = null;
    private BButton stripBtnStop = null;
    private BToggleButton stripBtnScroll = null;
    private BToggleButton stripBtnLoop = null;
    private BToolBar toolStripMeasure = null;
    private BLabel toolStripLabel5 = null;
    private BLabel stripLblMeasure = null;
    private BComboBox stripDDBtnLength = null;
    private BLabel BLabel = null;
    private BLabel jLabel1 = null;
    private BComboBox stripDDBtnQuantize = null;
    private BToggleButton stripBtnStartMarker = null;
    private BToggleButton stripBtnEndMarker = null;
    private BToolBar toolStripTool = null;
    private BToggleButton stripBtnPointer = null;
    private BToggleButton stripBtnPencil = null;
    private BToggleButton stripBtnLine = null;
    private BToggleButton stripBtnEraser = null;
    private BToggleButton stripBtnGrid = null;
    private BToggleButton stripBtnCurve = null;
    private BLabel toolStripLabel6 = null;
    private BLabel stripLblCursor = null;
    private BLabel toolStripLabel8 = null;
    private BLabel stripLblTempo = null;
    private BLabel jLabel2 = null;
    private BLabel stripLblBeat = null;
    private BLabel jLabel3 = null;
    private BLabel stripLblGameCtrlMode = null;
    private BLabel jLabel4 = null;
    private BLabel stripLblMidiIn = null;
    private BLabel jLabel5 = null;
    private BComboBox stripDDBtnSpeed = null;
    private BPopupMenu cMenuTrackSelector = null;  //  @jve:decl-index=0:visual-constraint="749,73"
    private BPopupMenu cMenuPiano = null;  //  @jve:decl-index=0:visual-constraint="764,258"
    private BPopupMenu cMenuTrackTab = null;  //  @jve:decl-index=0:visual-constraint="752,356"
    private BMenuItem cMenuTrackSelectorPointer = null;
    private BMenuItem cMenuTrackSelectorPencil = null;
    private BMenuItem cMenuTrackSelectorLine = null;
    private BMenuItem cMenuTrackSelectorEraser = null;
    private BMenuItem cMenuTrackSelectorPaletteTool = null;
    private BMenuItem cMenuTrackSelectorCurve = null;
    private BMenuItem cMenuTrackSelectorUndo = null;
    private BMenuItem cMenuTrackSelectorRedo = null;
    private BMenuItem cMenuTrackSelectorCut = null;
    private BMenuItem cMenuTrackSelectorCopy = null;
    private BMenuItem cMenuTrackSelectorPaste = null;
    private BMenuItem cMenuTrackSelectorDelete = null;
    private BMenuItem cMenuTrackSelectorDeleteBezier = null;
    private BMenuItem cMenuTrackSelectorSelectAll = null;
    private BMenuItem cMenuPianoPointer = null;
    private BMenuItem cMenuPianoPencil = null;
    private BMenuItem cMenuPianoEraser = null;
    private BMenuItem cMenuPianoPaletteTool = null;
    private BMenuItem cMenuPianoCurve = null;
    private BMenu cMenuPianoFixed = null;
    private BMenu cMenuPianoQuantize = null;
    private BMenuItem cMenuPianoGrid = null;
    private BMenuItem cMenuPianoUndo = null;
    private BMenuItem cMenuPianoRedo = null;
    private BMenuItem cMenuPianoCut = null;
    private BMenuItem cMenuPianoCopy = null;
    private BMenuItem cMenuPianoPaste = null;
    private BMenuItem cMenuPianoDelete = null;
    private BMenuItem cMenuPianoSelectAll = null;
    private BMenuItem cMenuPianoSelectAllEvents = null;
    private BMenuItem cMenuPianoImportLyric = null;
    private BMenuItem cMenuPianoExpressionProperty = null;
    private BMenuItem cMenuPianoVibratoProperty = null;
    private BMenuItem cMenuPianoFixed02 = null;
    private BMenuItem cMenuPianoFixed04 = null;
    private BMenuItem cMenuPianoFixed08 = null;
    private BMenuItem cMenuPianoFixed01 = null;
    private BMenuItem cMenuPianoFixed16 = null;
    private BMenuItem cMenuPianoFixed32 = null;
    private BMenuItem cMenuPianoFixed64 = null;
    private BMenuItem cMenuPianoFixed128 = null;
    private BMenuItem cMenuPianoFixedOff = null;
    private BMenuItem cMenuPianoFixedTriplet = null;
    private BMenuItem cMenuPianoFixedDotted = null;
    private BMenuItem cMenuPianoQuantize04 = null;
    private BMenuItem cMenuPianoQuantize08 = null;
    private BMenuItem cMenuPianoQuantize16 = null;
    private BMenuItem cMenuPianoQuantize32 = null;
    private BMenuItem cMenuPianoQuantize64 = null;
    private BMenuItem cMenuPianoQuantize128 = null;
    private BMenuItem cMenuPianoQuantizeTriplet = null;
    private BMenu cMenuPianoLength = null;
    private BMenuItem cMenuPianoLength04 = null;
    private BMenuItem cMenuPianoLength08 = null;
    private BMenuItem cMenuPianoLength16 = null;
    private BMenuItem cMenuPianoLength32 = null;
    private BMenuItem cMenuPianoLength64 = null;
    private BMenuItem cMenuPianoLength128 = null;
    private BMenuItem cMenuPianoLengthTriplet = null;
    private BMenuItem cMenuTrackTabTrackOn = null;
    private BMenuItem cMenuTrackTabAdd = null;
    private BMenuItem cMenuTrackTabCopy = null;
    private BMenuItem cMenuTrackTabChangeName = null;
    private BMenuItem cMenuTrackTabDelete = null;
    private BMenuItem cMenuTrackTabRenderCurrent = null;
    private BMenuItem cMenuTrackTabRenderAll = null;
    private BMenuItem cMenuTrackTabOverlay = null;
    private BMenu cMenuTrackTabRenderer = null;
    private BMenuItem cMenuTrackTabRendererVOCALOID2 = null;
    private BMenuItem cMenuTrackTabRendererVOCALOID1 = null;
    private BMenuItem cMenuTrackTabRendererUtau = null;
    private BMenuItem cMenuTrackTabRendererStraight = null;
    private BMenuItem cMenuPianoQuantizeOff = null;
    private BMenuItem cMenuPianoLengthOff = null;
    private BPanel panel3 = null;
    private BPanel jPanel2 = null;
    private BButton BButton = null;
    private BButton jButton1 = null;
    private BButton jButton2 = null;
    private BButton jButton3 = null;
    private BButton jButton4 = null;
    private BButton jButton5 = null;
    private PictPianoRoll pictPianoRoll = null;
    private BVScrollBar vScroll = null;
    private BHScrollBar hScroll = null;
    private BPanel pictureBox3 = null;
    private BSlider trackBar = null;
    private BButton jButton6 = null;
    private BPanel picturePositionIndicator = null;
    private BPanel jPanel1 = null;
    private BPanel jPanel3 = null;
    private BLabel statusLabel = null;
    private JMenu menuHidden = null;
    private JMenuItem menuHiddenEditLyric = null;
    private JMenuItem menuHiddenEditFlipToolPointerPencil = null;
    private JMenuItem menuHiddenEditFlipToolPointerEraser = null;
    private JMenuItem menuHiddenVisualForwardParameter = null;
    private JMenuItem menuHiddenVisualBackwardParameter = null;
    private JMenuItem menuHiddenTrackNext = null;
    private JMenuItem menuHiddenTrackBack = null;
    private JMenuItem menuHiddenCopy = null;
    private JMenuItem menuHiddenPaste = null;
    private JMenuItem menuHiddenCut = null;
    private JMenuItem menuTrackRendererVOCALOID1 = null;
    private JMenuItem menuTrackRendererVOCALOID2 = null;
    private JMenuItem menuTrackRendererUtau = null;
    private JMenuItem menuTrackRendererStraight = null;
    //SECTION-END-FIELD
    /**
     * This is the default constructor
     */
    public FormMain() {
        super();
        initialize();
    }
    //SECTION-BEGIN-METHOD

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(845, 591);
        this.setJMenuBar(getJBMenuBar());
        this.setContentPane( this.getJContentPane());
        this.setTitle("JFrame");
    }

    /**
     * This method initializes jContentPane
     * 
     * @return javax.swing.BPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            jContentPane = new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.setSize(new Dimension(582, 431));
            jContentPane.add(getJPanel(), BorderLayout.NORTH);
            jContentPane.add(getSplitContainerProperty(), BorderLayout.CENTER);
            jContentPane.add(getJPanel3(), BorderLayout.SOUTH);
        }
        return jContentPane;
    }

    /**
     * This method initializes jBMenuBar    
     *  
     * @return javax.swing.BMenuBar 
     */
    private BMenuBar getJBMenuBar() {
        if (jBMenuBar == null) {
            jBMenuBar = new BMenuBar();
            jBMenuBar.add(getMenuFile());
            jBMenuBar.add(getMenuEdit());
            jBMenuBar.add(getMenuVisual());
            jBMenuBar.add(getMenuJob());
            jBMenuBar.add(getMenuTrack());
            jBMenuBar.add(getMenuLyric());
            jBMenuBar.add(getMenuScript());
            jBMenuBar.add(getMenuSetting());
            jBMenuBar.add(getMenuHelp());
            jBMenuBar.add(getMenuHidden());
        }
        return jBMenuBar;
    }

    /**
     * This method initializes menuFile 
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuFile() {
        if (menuFile == null) {
            menuFile = new BMenu();
            menuFile.setText("File");
            menuFile.add(getMenuFileNew());
            menuFile.add(getMenuFileOpen());
            menuFile.add(getMenuFileSave());
            menuFile.add(getMenuFileSaveNamed());
            menuFile.add(getBMenuItem());
            menuFile.add(getBMenuItem2());
            menuFile.add(getBMenuItem3());
            menuFile.add(getMenuFileImport());
            menuFile.add(getMenuFileExport());
            menuFile.add(getToolStripMenuItem101());
            menuFile.add(getBMenuItem4());
            menuFile.add(getToolStripMenuItem102());
            menuFile.add(getBMenuItem5());
        }
        return menuFile;
    }

    /**
     * This method initializes menuFileNew  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuFileNew() {
        if (menuFileNew == null) {
            menuFileNew = new BMenuItem();
            menuFileNew.setText("New");
        }
        return menuFileNew;
    }

    /**
     * This method initializes menuFileOpen 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuFileOpen() {
        if (menuFileOpen == null) {
            menuFileOpen = new BMenuItem();
            menuFileOpen.setText("Open");
        }
        return menuFileOpen;
    }

    /**
     * This method initializes menuFileSave 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuFileSave() {
        if (menuFileSave == null) {
            menuFileSave = new BMenuItem();
            menuFileSave.setText("Save");
        }
        return menuFileSave;
    }

    /**
     * This method initializes menuFileSaveNamed    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuFileSaveNamed() {
        if (menuFileSaveNamed == null) {
            menuFileSaveNamed = new BMenuItem();
            menuFileSaveNamed.setText("Save As");
        }
        return menuFileSaveNamed;
    }

    /**
     * This method initializes toolStripMenuItem10  
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getBMenuItem() {
        if (toolStripMenuItem10 == null) {
            toolStripMenuItem10 = new JSeparator();
        }
        return toolStripMenuItem10;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem2() {
        if (menuFileOpenVsq == null) {
            menuFileOpenVsq = new BMenuItem();
            menuFileOpenVsq.setText("Open VSQ/Vocaloid Midi");
        }
        return menuFileOpenVsq;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem3() {
        if (menuFileOpenUst == null) {
            menuFileOpenUst = new BMenuItem();
            menuFileOpenUst.setText("Open UTAU Project File");
        }
        return menuFileOpenUst;
    }

    /**
     * This method initializes menuFileImport   
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuFileImport() {
        if (menuFileImport == null) {
            menuFileImport = new BMenu();
            menuFileImport.setText("Import");
            menuFileImport.add(getBMenuItem6());
            menuFileImport.add(getBMenuItem7());
        }
        return menuFileImport;
    }

    /**
     * This method initializes menuFileExport   
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuFileExport() {
        if (menuFileExport == null) {
            menuFileExport = new BMenu();
            menuFileExport.setText("Export");
            menuFileExport.add(getBMenuItem8());
            menuFileExport.add(getBMenuItem9());
        }
        return menuFileExport;
    }

    /**
     * This method initializes toolStripMenuItem101 
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem101() {
        if (toolStripMenuItem101 == null) {
            toolStripMenuItem101 = new JSeparator();
        }
        return toolStripMenuItem101;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem4() {
        if (menuFileRecent == null) {
            menuFileRecent = new BMenuItem();
            menuFileRecent.setText("Recent Files");
        }
        return menuFileRecent;
    }

    /**
     * This method initializes toolStripMenuItem102 
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem102() {
        if (toolStripMenuItem102 == null) {
            toolStripMenuItem102 = new JSeparator();
        }
        return toolStripMenuItem102;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem5() {
        if (menuFileQuit == null) {
            menuFileQuit = new BMenuItem();
            menuFileQuit.setText("Quit");
        }
        return menuFileQuit;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem6() {
        if (menuFileImportVsq == null) {
            menuFileImportVsq = new BMenuItem();
            menuFileImportVsq.setText("VSQ / Vocaloid MIDI");
        }
        return menuFileImportVsq;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem7() {
        if (menuFileImportMidi == null) {
            menuFileImportMidi = new BMenuItem();
            menuFileImportMidi.setText("Standard MIDI");
        }
        return menuFileImportMidi;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem8() {
        if (menuFileExportWave == null) {
            menuFileExportWave = new BMenuItem();
            menuFileExportWave.setText("Wave");
        }
        return menuFileExportWave;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem9() {
        if (menuFileExportMidi == null) {
            menuFileExportMidi = new BMenuItem();
            menuFileExportMidi.setText("MIDI");
        }
        return menuFileExportMidi;
    }

    /**
     * This method initializes menuEdit 
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuEdit() {
        if (menuEdit == null) {
            menuEdit = new BMenu();
            menuEdit.setText("Edit");
            menuEdit.add(getBMenuItem10());
            menuEdit.add(getBMenuItem11());
            menuEdit.add(getToolStripMenuItem103());
            menuEdit.add(getBMenuItem12());
            menuEdit.add(getMenuEditCopy());
            menuEdit.add(getBMenuItem22());
            menuEdit.add(getBMenuItem13());
            menuEdit.add(getToolStripMenuItem104());
            menuEdit.add(getBMenuItem14());
            menuEdit.add(getToolStripMenuItem1041());
            menuEdit.add(getBMenuItem15());
            menuEdit.add(getMenuEditSelectAllEvents());
        }
        return menuEdit;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem10() {
        if (menuEditUndo == null) {
            menuEditUndo = new BMenuItem();
            menuEditUndo.setText("Undo");
        }
        return menuEditUndo;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem11() {
        if (menuEditRedo == null) {
            menuEditRedo = new BMenuItem();
            menuEditRedo.setText("Redo");
        }
        return menuEditRedo;
    }

    /**
     * This method initializes toolStripMenuItem103 
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem103() {
        if (toolStripMenuItem103 == null) {
            toolStripMenuItem103 = new JSeparator();
        }
        return toolStripMenuItem103;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem12() {
        if (menuEditCut == null) {
            menuEditCut = new BMenuItem();
            menuEditCut.setText("Cut");
        }
        return menuEditCut;
    }

    /**
     * This method initializes menuEditCopy 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuEditCopy() {
        if (menuEditCopy == null) {
            menuEditCopy = new BMenuItem();
            menuEditCopy.setText("Copy");
        }
        return menuEditCopy;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem22() {
        if (menuEditPaste == null) {
            menuEditPaste = new BMenuItem();
            menuEditPaste.setText("Paste");
        }
        return menuEditPaste;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem13() {
        if (menuEditDelete == null) {
            menuEditDelete = new BMenuItem();
            menuEditDelete.setText("Delete");
        }
        return menuEditDelete;
    }

    /**
     * This method initializes toolStripMenuItem104 
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem104() {
        if (toolStripMenuItem104 == null) {
            toolStripMenuItem104 = new JSeparator();
        }
        return toolStripMenuItem104;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem14() {
        if (menuEditAutoNormalizeMode == null) {
            menuEditAutoNormalizeMode = new BMenuItem();
            menuEditAutoNormalizeMode.setText("Auto Normalize Mode");
        }
        return menuEditAutoNormalizeMode;
    }

    /**
     * This method initializes toolStripMenuItem1041    
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem1041() {
        if (toolStripMenuItem1041 == null) {
            toolStripMenuItem1041 = new JSeparator();
        }
        return toolStripMenuItem1041;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem15() {
        if (menuEditSelectAll == null) {
            menuEditSelectAll = new BMenuItem();
            menuEditSelectAll.setText("Select All");
        }
        return menuEditSelectAll;
    }

    /**
     * This method initializes menuEditSelectAllEvents  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuEditSelectAllEvents() {
        if (menuEditSelectAllEvents == null) {
            menuEditSelectAllEvents = new BMenuItem();
            menuEditSelectAllEvents.setText("Select All Events");
        }
        return menuEditSelectAllEvents;
    }

    /**
     * This method initializes menuVisual   
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuVisual() {
        if (menuVisual == null) {
            menuVisual = new BMenu();
            menuVisual.setText("Visual");
            menuVisual.add(getBMenuItem16());
            menuVisual.add(getBMenuItem17());
            menuVisual.add(getMenuVisualWaveform());
            menuVisual.add(getBMenuItem23());
            menuVisual.add(getBMenuItem32());
            menuVisual.add(getToolStripMenuItem1031());
            menuVisual.add(getBMenuItem18());
            menuVisual.add(getToolStripMenuItem1032());
            menuVisual.add(getBMenuItem19());
            menuVisual.add(getMenuVisualEndMarker());
            menuVisual.add(getToolStripMenuItem1033());
            menuVisual.add(getMenuVisualLyrics());
            menuVisual.add(getBMenuItem20());
            menuVisual.add(getBMenuItem24());
        }
        return menuVisual;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem16() {
        if (menuVisualControlTrack == null) {
            menuVisualControlTrack = new BMenuItem();
            menuVisualControlTrack.setText("Control Track");
        }
        return menuVisualControlTrack;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem17() {
        if (menuVisualMixer == null) {
            menuVisualMixer = new BMenuItem();
            menuVisualMixer.setText("Mixer");
        }
        return menuVisualMixer;
    }

    /**
     * This method initializes menuVisualWaveform   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuVisualWaveform() {
        if (menuVisualWaveform == null) {
            menuVisualWaveform = new BMenuItem();
            menuVisualWaveform.setText("Waveform");
        }
        return menuVisualWaveform;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem23() {
        if (menuVisualProperty == null) {
            menuVisualProperty = new BMenuItem();
            menuVisualProperty.setText("Property Window");
        }
        return menuVisualProperty;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem32() {
        if (menuVisualOverview == null) {
            menuVisualOverview = new BMenuItem();
            menuVisualOverview.setText("Navigation");
        }
        return menuVisualOverview;
    }

    /**
     * This method initializes toolStripMenuItem1031    
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem1031() {
        if (toolStripMenuItem1031 == null) {
            toolStripMenuItem1031 = new JSeparator();
        }
        return toolStripMenuItem1031;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem18() {
        if (menuVisualGridline == null) {
            menuVisualGridline = new BMenuItem();
            menuVisualGridline.setText("Grid Line");
        }
        return menuVisualGridline;
    }

    /**
     * This method initializes toolStripMenuItem1032    
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem1032() {
        if (toolStripMenuItem1032 == null) {
            toolStripMenuItem1032 = new JSeparator();
        }
        return toolStripMenuItem1032;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem19() {
        if (menuVisualStartMarker == null) {
            menuVisualStartMarker = new BMenuItem();
            menuVisualStartMarker.setText("Start Marker");
        }
        return menuVisualStartMarker;
    }

    /**
     * This method initializes menuVisualEndMarker  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuVisualEndMarker() {
        if (menuVisualEndMarker == null) {
            menuVisualEndMarker = new BMenuItem();
            menuVisualEndMarker.setText("End Marker");
        }
        return menuVisualEndMarker;
    }

    /**
     * This method initializes toolStripMenuItem1033    
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem1033() {
        if (toolStripMenuItem1033 == null) {
            toolStripMenuItem1033 = new JSeparator();
        }
        return toolStripMenuItem1033;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem20() {
        if (menuVisualNoteProperty == null) {
            menuVisualNoteProperty = new BMenuItem();
            menuVisualNoteProperty.setText("Note Expression/Vibrato");
        }
        return menuVisualNoteProperty;
    }

    /**
     * This method initializes menuVisualLyrics 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuVisualLyrics() {
        if (menuVisualLyrics == null) {
            menuVisualLyrics = new BMenuItem();
            menuVisualLyrics.setText("Lyrics/Phoneme");
        }
        return menuVisualLyrics;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem24() {
        if (menuVisualPitchLine == null) {
            menuVisualPitchLine = new BMenuItem();
            menuVisualPitchLine.setText("Pitch Line");
        }
        return menuVisualPitchLine;
    }

    /**
     * This method initializes menuJob  
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuJob() {
        if (menuJob == null) {
            menuJob = new BMenu();
            menuJob.setText("Job");
            menuJob.add(getBMenuItem21());
            menuJob.add(getMenuJobInsertBar());
            menuJob.add(getBMenuItem25());
            menuJob.add(getBMenuItem33());
            menuJob.add(getBMenuItem42());
            menuJob.add(getBMenuItem52());
            menuJob.add(getBMenuItem62());
            menuJob.add(getBMenuItem72());
            menuJob.add(getBMenuItem26());
        }
        return menuJob;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem21() {
        if (menuJobNormalize == null) {
            menuJobNormalize = new BMenuItem();
            menuJobNormalize.setText("Normalize Notes");
        }
        return menuJobNormalize;
    }

    /**
     * This method initializes menuJobInsertBar 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuJobInsertBar() {
        if (menuJobInsertBar == null) {
            menuJobInsertBar = new BMenuItem();
            menuJobInsertBar.setText("Insert Bars");
        }
        return menuJobInsertBar;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem25() {
        if (menuJobDeleteBar == null) {
            menuJobDeleteBar = new BMenuItem();
            menuJobDeleteBar.setText("Delete Bars");
        }
        return menuJobDeleteBar;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem33() {
        if (menuJobRandomize == null) {
            menuJobRandomize = new BMenuItem();
            menuJobRandomize.setText("Randomize");
        }
        return menuJobRandomize;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem42() {
        if (menuJobConnect == null) {
            menuJobConnect = new BMenuItem();
            menuJobConnect.setText("Connect Notes");
        }
        return menuJobConnect;
    }

    /**
     * This method initializes BMenuItem5   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem52() {
        if (menuJobLyric == null) {
            menuJobLyric = new BMenuItem();
            menuJobLyric.setText("Insert Lyrics");
        }
        return menuJobLyric;
    }

    /**
     * This method initializes BMenuItem6   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem62() {
        if (menuJobRewire == null) {
            menuJobRewire = new BMenuItem();
            menuJobRewire.setText("Import ReWire Host Tempo");
        }
        return menuJobRewire;
    }

    /**
     * This method initializes BMenuItem7   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem72() {
        if (menuJobRealTime == null) {
            menuJobRealTime = new BMenuItem();
            menuJobRealTime.setText("Start Realtime Input");
        }
        return menuJobRealTime;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem26() {
        if (menuJobReloadVsti == null) {
            menuJobReloadVsti = new BMenuItem();
            menuJobReloadVsti.setText("Reload VSTi");
        }
        return menuJobReloadVsti;
    }

    /**
     * This method initializes menuTrack    
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuTrack() {
        if (menuTrack == null) {
            menuTrack = new BMenu();
            menuTrack.setText("Track");
            menuTrack.add(getBMenuItem27());
            menuTrack.add(getToolStripMenuItem10321());
            menuTrack.add(getMenuTrackAdd());
            menuTrack.add(getBMenuItem28());
            menuTrack.add(getBMenuItem34());
            menuTrack.add(getBMenuItem43());
            menuTrack.add(getToolStripMenuItem10322());
            menuTrack.add(getBMenuItem53());
            menuTrack.add(getBMenuItem63());
            menuTrack.add(getToolStripMenuItem10323());
            menuTrack.add(getBMenuItem73());
            menuTrack.add(getMenuTrackRenderer());
            menuTrack.add(getToolStripMenuItem10324());
            menuTrack.add(getMenuTrackBgm());
            menuTrack.add(getBMenuItem82());
        }
        return menuTrack;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem27() {
        if (menuTrackOn == null) {
            menuTrackOn = new BMenuItem();
            menuTrackOn.setText("Track On");
        }
        return menuTrackOn;
    }

    /**
     * This method initializes toolStripMenuItem10321   
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem10321() {
        if (toolStripMenuItem10321 == null) {
            toolStripMenuItem10321 = new JSeparator();
        }
        return toolStripMenuItem10321;
    }

    /**
     * This method initializes menuTrackAdd 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuTrackAdd() {
        if (menuTrackAdd == null) {
            menuTrackAdd = new BMenuItem();
            menuTrackAdd.setText("Add Track");
        }
        return menuTrackAdd;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem28() {
        if (menuTrackCopy == null) {
            menuTrackCopy = new BMenuItem();
            menuTrackCopy.setText("Copy Track");
        }
        return menuTrackCopy;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem34() {
        if (menuTrackChangeName == null) {
            menuTrackChangeName = new BMenuItem();
            menuTrackChangeName.setText("Rename Track");
        }
        return menuTrackChangeName;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem43() {
        if (menuTrackDelete == null) {
            menuTrackDelete = new BMenuItem();
            menuTrackDelete.setText("Delete Track");
        }
        return menuTrackDelete;
    }

    /**
     * This method initializes toolStripMenuItem10322   
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem10322() {
        if (toolStripMenuItem10322 == null) {
            toolStripMenuItem10322 = new JSeparator();
        }
        return toolStripMenuItem10322;
    }

    /**
     * This method initializes BMenuItem5   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem53() {
        if (menuTrackRenderCurrent == null) {
            menuTrackRenderCurrent = new BMenuItem();
            menuTrackRenderCurrent.setText("Render Current Track");
        }
        return menuTrackRenderCurrent;
    }

    /**
     * This method initializes BMenuItem6   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem63() {
        if (menuTrackRenderAll == null) {
            menuTrackRenderAll = new BMenuItem();
            menuTrackRenderAll.setText("Render All Tracks");
        }
        return menuTrackRenderAll;
    }

    /**
     * This method initializes toolStripMenuItem10323   
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem10323() {
        if (toolStripMenuItem10323 == null) {
            toolStripMenuItem10323 = new JSeparator();
        }
        return toolStripMenuItem10323;
    }

    /**
     * This method initializes BMenuItem7   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem73() {
        if (menuTrackOverlay == null) {
            menuTrackOverlay = new BMenuItem();
            menuTrackOverlay.setText("Overlay");
        }
        return menuTrackOverlay;
    }

    /**
     * This method initializes menuTrackRenderer    
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuTrackRenderer() {
        if (menuTrackRenderer == null) {
            menuTrackRenderer = new BMenu();
            menuTrackRenderer.setText("Renderer");
            menuTrackRenderer.add(getMenuTrackRendererVOCALOID1());
            menuTrackRenderer.add(getMenuTrackRendererVOCALOID2());
            menuTrackRenderer.add(getMenuTrackRendererUtau());
            menuTrackRenderer.add(getMenuTrackRendererStraight());
        }
        return menuTrackRenderer;
    }

    /**
     * This method initializes toolStripMenuItem10324   
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem10324() {
        if (toolStripMenuItem10324 == null) {
            toolStripMenuItem10324 = new JSeparator();
        }
        return toolStripMenuItem10324;
    }

    /**
     * This method initializes menuTrackBgm 
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuTrackBgm() {
        if (menuTrackBgm == null) {
            menuTrackBgm = new BMenu();
            menuTrackBgm.setText("BGM");
        }
        return menuTrackBgm;
    }

    /**
     * This method initializes BMenuItem8   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem82() {
        if (menuTrackManager == null) {
            menuTrackManager = new BMenuItem();
        }
        return menuTrackManager;
    }

    /**
     * This method initializes menuLyric    
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuLyric() {
        if (menuLyric == null) {
            menuLyric = new BMenu();
            menuLyric.setText("Lyrics");
            menuLyric.add(getBMenuItem29());
            menuLyric.add(getMenuLyricVibratoProperty());
            menuLyric.add(getBMenuItem210());
            menuLyric.add(getBMenuItem35());
        }
        return menuLyric;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem29() {
        if (menuLyricExpressionProperty == null) {
            menuLyricExpressionProperty = new BMenuItem();
            menuLyricExpressionProperty.setText("Note Expression Propertry");
        }
        return menuLyricExpressionProperty;
    }

    /**
     * This method initializes menuLyricVibratoProperty 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuLyricVibratoProperty() {
        if (menuLyricVibratoProperty == null) {
            menuLyricVibratoProperty = new BMenuItem();
            menuLyricVibratoProperty.setText("Note Vibrato Property");
        }
        return menuLyricVibratoProperty;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem210() {
        if (menuLyricSymbol == null) {
            menuLyricSymbol = new BMenuItem();
            menuLyricSymbol.setText("Phoneme Transformation");
        }
        return menuLyricSymbol;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem35() {
        if (menuLyricDictionary == null) {
            menuLyricDictionary = new BMenuItem();
            menuLyricDictionary.setText("User Word Dictionary");
        }
        return menuLyricDictionary;
    }

    /**
     * This method initializes menuScript   
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuScript() {
        if (menuScript == null) {
            menuScript = new BMenu();
            menuScript.setText("Script");
            menuScript.add(getBMenuItem30());
        }
        return menuScript;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem30() {
        if (menuScriptUpdate == null) {
            menuScriptUpdate = new BMenuItem();
            menuScriptUpdate.setText("Update Script List");
        }
        return menuScriptUpdate;
    }

    /**
     * This method initializes menuSetting  
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuSetting() {
        if (menuSetting == null) {
            menuSetting = new BMenu();
            menuSetting.setText("Setting");
            menuSetting.add(getBMenuItem31());
            menuSetting.add(getMenuSettingGameControler());
            menuSetting.add(getMenuSettingPaletteTool());
            menuSetting.add(getBMenuItem211());
            menuSetting.add(getBMenuItem36());
            menuSetting.add(getBMenuItem44());
            menuSetting.add(getToolStripMenuItem103211());
            menuSetting.add(getBMenuItem54());
            menuSetting.add(getToolStripMenuItem103212());
            menuSetting.add(getMenuSettingPositionQuantize());
            menuSetting.add(getMenuSettingLengthQuantize());
            menuSetting.add(getBMenuItem64());
        }
        return menuSetting;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem31() {
        if (menuSettingPreference == null) {
            menuSettingPreference = new BMenuItem();
            menuSettingPreference.setText("Preference");
        }
        return menuSettingPreference;
    }

    /**
     * This method initializes menuSettingGameControler 
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuSettingGameControler() {
        if (menuSettingGameControler == null) {
            menuSettingGameControler = new BMenu();
            menuSettingGameControler.setText("Game Controler");
        }
        return menuSettingGameControler;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem211() {
        if (menuSettingShortcut == null) {
            menuSettingShortcut = new BMenuItem();
            menuSettingShortcut.setText("Shortcut Key");
        }
        return menuSettingShortcut;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem36() {
        if (menuSettingMidi == null) {
            menuSettingMidi = new BMenuItem();
        }
        return menuSettingMidi;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem44() {
        if (menuSettingUtauVoiceDB == null) {
            menuSettingUtauVoiceDB = new BMenuItem();
            menuSettingUtauVoiceDB.setText("UTAU Voice DB");
        }
        return menuSettingUtauVoiceDB;
    }

    /**
     * This method initializes toolStripMenuItem103211  
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem103211() {
        if (toolStripMenuItem103211 == null) {
            toolStripMenuItem103211 = new JSeparator();
        }
        return toolStripMenuItem103211;
    }

    /**
     * This method initializes BMenuItem5   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem54() {
        if (menuSettingDefaultSingerStyle == null) {
            menuSettingDefaultSingerStyle = new BMenuItem();
            menuSettingDefaultSingerStyle.setText("Singing Style Defaults");
        }
        return menuSettingDefaultSingerStyle;
    }

    /**
     * This method initializes toolStripMenuItem103212  
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem103212() {
        if (toolStripMenuItem103212 == null) {
            toolStripMenuItem103212 = new JSeparator();
        }
        return toolStripMenuItem103212;
    }

    /**
     * This method initializes menuSettingPositionQuantize  
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuSettingPositionQuantize() {
        if (menuSettingPositionQuantize == null) {
            menuSettingPositionQuantize = new BMenu();
            menuSettingPositionQuantize.setText("Quantize");
            menuSettingPositionQuantize.add(getBMenuItem37());
            menuSettingPositionQuantize.add(getMenuSettingPositionQuantize08());
            menuSettingPositionQuantize.add(getBMenuItem212());
            menuSettingPositionQuantize.add(getBMenuItem38());
            menuSettingPositionQuantize.add(getBMenuItem45());
            menuSettingPositionQuantize.add(getBMenuItem55());
            menuSettingPositionQuantize.add(getBMenuItem65());
            menuSettingPositionQuantize.add(getToolStripMenuItem1032121());
            menuSettingPositionQuantize.add(getBMenuItem74());
        }
        return menuSettingPositionQuantize;
    }

    /**
     * This method initializes BMenuItem6   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem64() {
        if (menuSettingSingerProperty == null) {
            menuSettingSingerProperty = new BMenuItem();
        }
        return menuSettingSingerProperty;
    }

    /**
     * This method initializes menuSettingPaletteTool   
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuSettingPaletteTool() {
        if (menuSettingPaletteTool == null) {
            menuSettingPaletteTool = new BMenu();
            menuSettingPaletteTool.setText("Palette Tool");
        }
        return menuSettingPaletteTool;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem37() {
        if (menuSettingPositionQuantize04 == null) {
            menuSettingPositionQuantize04 = new BMenuItem();
            menuSettingPositionQuantize04.setText("1/4");
        }
        return menuSettingPositionQuantize04;
    }

    /**
     * This method initializes menuSettingPositionQuantize08    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingPositionQuantize08() {
        if (menuSettingPositionQuantize08 == null) {
            menuSettingPositionQuantize08 = new BMenuItem();
            menuSettingPositionQuantize08.setText("1/8");
        }
        return menuSettingPositionQuantize08;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem212() {
        if (menuSettingPositionQuantize16 == null) {
            menuSettingPositionQuantize16 = new BMenuItem();
            menuSettingPositionQuantize16.setText("1/16");
        }
        return menuSettingPositionQuantize16;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem38() {
        if (menuSettingPositionQuantize32 == null) {
            menuSettingPositionQuantize32 = new BMenuItem();
            menuSettingPositionQuantize32.setText("1/32");
        }
        return menuSettingPositionQuantize32;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem45() {
        if (menuSettingPositionQuantize64 == null) {
            menuSettingPositionQuantize64 = new BMenuItem();
            menuSettingPositionQuantize64.setText("1/64");
        }
        return menuSettingPositionQuantize64;
    }

    /**
     * This method initializes BMenuItem5   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem55() {
        if (menuSettingPositionQuantize128 == null) {
            menuSettingPositionQuantize128 = new BMenuItem();
            menuSettingPositionQuantize128.setText("1/128");
        }
        return menuSettingPositionQuantize128;
    }

    /**
     * This method initializes BMenuItem6   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem65() {
        if (menuSettingPositionQuantizeOff == null) {
            menuSettingPositionQuantizeOff = new BMenuItem();
            menuSettingPositionQuantizeOff.setText("Off");
        }
        return menuSettingPositionQuantizeOff;
    }

    /**
     * This method initializes toolStripMenuItem1032121 
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem1032121() {
        if (toolStripMenuItem1032121 == null) {
            toolStripMenuItem1032121 = new JSeparator();
        }
        return toolStripMenuItem1032121;
    }

    /**
     * This method initializes BMenuItem7   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem74() {
        if (menuSettingPositionQuantizeTriplet == null) {
            menuSettingPositionQuantizeTriplet = new BMenuItem();
            menuSettingPositionQuantizeTriplet.setText("Triplet");
        }
        return menuSettingPositionQuantizeTriplet;
    }

    /**
     * This method initializes menuSettingLengthQuantize    
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuSettingLengthQuantize() {
        if (menuSettingLengthQuantize == null) {
            menuSettingLengthQuantize = new BMenu();
            menuSettingLengthQuantize.setText("Length");
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantize04());
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantize08());
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantize16());
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantize32());
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantize64());
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantize128());
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantizeOff());
            menuSettingLengthQuantize.add(getToolStripMenuItem10321211());
            menuSettingLengthQuantize.add(getMenuSettingLengthQuantizeTriplet());
        }
        return menuSettingLengthQuantize;
    }

    /**
     * This method initializes menuSettingLengthQuantize04  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantize04() {
        if (menuSettingLengthQuantize04 == null) {
            menuSettingLengthQuantize04 = new BMenuItem();
            menuSettingLengthQuantize04.setText("1/4");
        }
        return menuSettingLengthQuantize04;
    }

    /**
     * This method initializes menuSettingLengthQuantize08  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantize08() {
        if (menuSettingLengthQuantize08 == null) {
            menuSettingLengthQuantize08 = new BMenuItem();
            menuSettingLengthQuantize08.setText("1/8");
        }
        return menuSettingLengthQuantize08;
    }

    /**
     * This method initializes menuSettingLengthQuantize16  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantize16() {
        if (menuSettingLengthQuantize16 == null) {
            menuSettingLengthQuantize16 = new BMenuItem();
            menuSettingLengthQuantize16.setText("1/16");
        }
        return menuSettingLengthQuantize16;
    }

    /**
     * This method initializes menuSettingLengthQuantize32  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantize32() {
        if (menuSettingLengthQuantize32 == null) {
            menuSettingLengthQuantize32 = new BMenuItem();
            menuSettingLengthQuantize32.setText("1/32");
        }
        return menuSettingLengthQuantize32;
    }

    /**
     * This method initializes menuSettingLengthQuantize64  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantize64() {
        if (menuSettingLengthQuantize64 == null) {
            menuSettingLengthQuantize64 = new BMenuItem();
            menuSettingLengthQuantize64.setText("1/64");
        }
        return menuSettingLengthQuantize64;
    }

    /**
     * This method initializes menuSettingLengthQuantize128 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantize128() {
        if (menuSettingLengthQuantize128 == null) {
            menuSettingLengthQuantize128 = new BMenuItem();
            menuSettingLengthQuantize128.setText("1/128");
        }
        return menuSettingLengthQuantize128;
    }

    /**
     * This method initializes menuSettingLengthQuantizeOff 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantizeOff() {
        if (menuSettingLengthQuantizeOff == null) {
            menuSettingLengthQuantizeOff = new BMenuItem();
            menuSettingLengthQuantizeOff.setText("Off");
        }
        return menuSettingLengthQuantizeOff;
    }

    /**
     * This method initializes toolStripMenuItem10321211    
     *  
     * @return javax.swing.JSeparator   
     */
    private JSeparator getToolStripMenuItem10321211() {
        if (toolStripMenuItem10321211 == null) {
            toolStripMenuItem10321211 = new JSeparator();
        }
        return toolStripMenuItem10321211;
    }

    /**
     * This method initializes menuSettingLengthQuantizeTriplet 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getMenuSettingLengthQuantizeTriplet() {
        if (menuSettingLengthQuantizeTriplet == null) {
            menuSettingLengthQuantizeTriplet = new BMenuItem();
            menuSettingLengthQuantizeTriplet.setText("Triplet");
        }
        return menuSettingLengthQuantizeTriplet;
    }

    /**
     * This method initializes menuHelp 
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getMenuHelp() {
        if (menuHelp == null) {
            menuHelp = new BMenu();
            menuHelp.setText("Help");
            menuHelp.add(getBMenuItem39());
        }
        return menuHelp;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getBMenuItem39() {
        if (menuHelpAbout == null) {
            menuHelpAbout = new BMenuItem();
            menuHelpAbout.setText("About Cadencii");
        }
        return menuHelpAbout;
    }

    /**
     * This method initializes splitContainer2  
     *  
     * @return javax.swing.BSplitPane   
     */
    private BSplitPane getSplitContainer2() {
        if (splitContainer2 == null) {
            splitContainer2 = new BSplitPane();
            splitContainer2.setDividerSize(0);
            splitContainer2.setDividerLocation(70);
            splitContainer2.setEnabled(false);
            splitContainer2.setResizeWeight(1.0D);
            splitContainer2.setBottomComponent(getPanel2());
            splitContainer2.setTopComponent(getJPanel1());
            splitContainer2.setOrientation(BSplitPane.VERTICAL_SPLIT);
        }
        return splitContainer2;
    }

    /**
     * This method initializes panel1   
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getPanel1() {
        if (panel1 == null) {
            GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
            gridBagConstraints11.fill = GridBagConstraints.NONE;
            gridBagConstraints11.gridy = 1;
            gridBagConstraints11.weightx = 0.0D;
            gridBagConstraints11.anchor = GridBagConstraints.EAST;
            gridBagConstraints11.gridx = 2;
            GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
            gridBagConstraints10.gridx = 0;
            gridBagConstraints10.fill = GridBagConstraints.BOTH;
            gridBagConstraints10.gridy = 1;
            GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
            gridBagConstraints9.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints9.gridy = 1;
            gridBagConstraints9.weighty = 0.0D;
            gridBagConstraints9.weightx = 1.0D;
            gridBagConstraints9.gridx = 1;
            GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
            gridBagConstraints8.fill = GridBagConstraints.VERTICAL;
            gridBagConstraints8.gridy = 0;
            gridBagConstraints8.weighty = 1.0D;
            gridBagConstraints8.gridx = 3;
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.gridx = 0;
            gridBagConstraints7.fill = GridBagConstraints.BOTH;
            gridBagConstraints7.weightx = 1.0D;
            gridBagConstraints7.weighty = 1.0D;
            gridBagConstraints7.gridwidth = 3;
            gridBagConstraints7.gridy = 0;
            panel1 = new BPanel();
            panel1.setLayout(new GridBagLayout());
            panel1.add(getPictPianoRoll(), gridBagConstraints7);
            panel1.add(getVScroll(), gridBagConstraints8);
            panel1.add(getHScroll(), gridBagConstraints9);
            panel1.add(getPictureBox3(), gridBagConstraints10);
            panel1.add(getTrackBar(), gridBagConstraints11);
        }
        return panel1;
    }

    /**
     * This method initializes panel2   
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getPanel2() {
        if (panel2 == null) {
            panel2 = new BPanel();
            panel2.setLayout(new GridBagLayout());
        }
        return panel2;
    }

    /**
     * This method initializes splitContainer1  
     *  
     * @return javax.swing.BSplitPane   
     */
    private BSplitPane getSplitContainer1() {
        if (splitContainer1 == null) {
            splitContainer1 = new BSplitPane();
            splitContainer1.setDividerLocation(200);
            splitContainer1.setResizeWeight(1.0D);
            splitContainer1.setTopComponent(getSplitContainer2());
            splitContainer1.setBottomComponent(getTrackSelector());
            splitContainer1.setOrientation(BSplitPane.VERTICAL_SPLIT);
        }
        return splitContainer1;
    }

    /**
     * This method initializes trackSelector    
     *  
     * @return javax.swing.BPanel   
     */
    private TrackSelector getTrackSelector() {
        if (trackSelector == null) {
            trackSelector = new TrackSelector();
            trackSelector.setLayout(new GridBagLayout());
        }
        return trackSelector;
    }

    /**
     * This method initializes splitContainerProperty   
     *  
     * @return javax.swing.BSplitPane   
     */
    private BSplitPane getSplitContainerProperty() {
        if (splitContainerProperty == null) {
            splitContainerProperty = new BSplitPane();
            splitContainerProperty.setDividerLocation(0);
            splitContainerProperty.setEnabled(false);
            splitContainerProperty.setDividerSize(0);
            splitContainerProperty.setRightComponent(getSplitContainer1());
            splitContainerProperty.setLeftComponent(getM_property_panel_container());
        }
        return splitContainerProperty;
    }

    /**
     * This method initializes m_property_panel_container   
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getM_property_panel_container() {
        if (m_property_panel_container == null) {
            m_property_panel_container = new BPanel();
            m_property_panel_container.setLayout(new GridBagLayout());
        }
        return m_property_panel_container;
    }

    /**
     * This method initializes toolStripFile    
     *  
     * @return javax.swing.BToolBar 
     */
    private BToolBar getToolStripFile() {
        if (toolStripFile == null) {
            toolStripFile = new BToolBar();
            toolStripFile.setName("toolStripFile");
            toolStripFile.add(getStripBtnFileNew());
            toolStripFile.add(getStripBtnFileOpen());
            toolStripFile.add(getStripBtnFileSave());
            toolStripFile.addSeparator();
            toolStripFile.add(getStripBtnCut());
            toolStripFile.add(getStripBtnCopy());
            toolStripFile.add(getStripBtnPaste());
            toolStripFile.add(getStripBtnUndo());
            toolStripFile.add(getStripBtnRedo());
        }
        return toolStripFile;
    }

    /**
     * This method initializes toolStripBottom  
     *  
     * @return javax.swing.BToolBar 
     */
    private BToolBar getToolStripBottom() {
        if (toolStripBottom == null) {
            jLabel5 = new BLabel();
            jLabel5.setText("Speed 1.0x");
            stripLblMidiIn = new BLabel();
            stripLblMidiIn.setText("Disabled");
            jLabel4 = new BLabel();
            jLabel4.setText("MIDI In");
            stripLblGameCtrlMode = new BLabel();
            stripLblGameCtrlMode.setText("Disabled");
            jLabel3 = new BLabel();
            jLabel3.setText("Game Controler");
            stripLblBeat = new BLabel();
            stripLblBeat.setText("4/4");
            jLabel2 = new BLabel();
            jLabel2.setText("BEAT");
            stripLblTempo = new BLabel();
            stripLblTempo.setText("120.00");
            toolStripLabel8 = new BLabel();
            toolStripLabel8.setText("TEMPO");
            stripLblCursor = new BLabel();
            stripLblCursor.setText("0 : 0 : 000");
            toolStripLabel6 = new BLabel();
            toolStripLabel6.setText("CURSOR");
            toolStripBottom = new BToolBar();
            toolStripBottom.add(toolStripLabel6);
            toolStripBottom.add(stripLblCursor);
            toolStripBottom.addSeparator();
            toolStripBottom.add(toolStripLabel8);
            toolStripBottom.add(stripLblTempo);
            toolStripBottom.addSeparator();
            toolStripBottom.add(jLabel2);
            toolStripBottom.add(stripLblBeat);
            toolStripBottom.addSeparator();
            toolStripBottom.add(jLabel3);
            toolStripBottom.add(stripLblGameCtrlMode);
            toolStripBottom.addSeparator();
            toolStripBottom.add(jLabel4);
            toolStripBottom.add(stripLblMidiIn);
            toolStripBottom.add(jLabel5);
            toolStripBottom.add(getStripDDBtnSpeed());
            toolStripBottom.addSeparator();
            
        }
        return toolStripBottom;
    }

    /**
     * This method initializes stripBtnFileNew  
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnFileNew() {
        if (stripBtnFileNew == null) {
            stripBtnFileNew = new BButton();
            stripBtnFileNew.setText("New");
        }
        return stripBtnFileNew;
    }

    /**
     * This method initializes stripBtnFileOpen 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnFileOpen() {
        if (stripBtnFileOpen == null) {
            stripBtnFileOpen = new BButton();
            stripBtnFileOpen.setText("Open");
        }
        return stripBtnFileOpen;
    }

    /**
     * This method initializes stripBtnFileSave 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnFileSave() {
        if (stripBtnFileSave == null) {
            stripBtnFileSave = new BButton();
            stripBtnFileSave.setText("Save");
        }
        return stripBtnFileSave;
    }

    /**
     * This method initializes stripBtnCut  
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnCut() {
        if (stripBtnCut == null) {
            stripBtnCut = new BButton();
            stripBtnCut.setText("Cut");
        }
        return stripBtnCut;
    }

    /**
     * This method initializes stripBtnCopy 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnCopy() {
        if (stripBtnCopy == null) {
            stripBtnCopy = new BButton();
            stripBtnCopy.setText("Copy");
        }
        return stripBtnCopy;
    }

    /**
     * This method initializes stripBtnPaste    
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnPaste() {
        if (stripBtnPaste == null) {
            stripBtnPaste = new BButton();
            stripBtnPaste.setText("Paste");
        }
        return stripBtnPaste;
    }

    /**
     * This method initializes stripBtnUndo 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnUndo() {
        if (stripBtnUndo == null) {
            stripBtnUndo = new BButton();
            stripBtnUndo.setText("Undo");
        }
        return stripBtnUndo;
    }

    /**
     * This method initializes stripBtnRedo 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnRedo() {
        if (stripBtnRedo == null) {
            stripBtnRedo = new BButton();
            stripBtnRedo.setText("Redo");
        }
        return stripBtnRedo;
    }

    /**
     * This method initializes toolStripPosition    
     *  
     * @return javax.swing.BToolBar 
     */
    private BToolBar getToolStripPosition() {
        if (toolStripPosition == null) {
            toolStripPosition = new BToolBar();
            toolStripPosition.setName("toolStripPosition");
            toolStripPosition.add(getStripBtnMoveTop());
            toolStripPosition.add(getStripBtnRewind());
            toolStripPosition.add(getStripBtnForward());
            toolStripPosition.add(getStripBtnMoveEnd());
            toolStripPosition.add(getStripBtnPlay());
            toolStripPosition.add(getStripBtnStop());
            toolStripPosition.add(getStripBtnScroll());
            toolStripPosition.add(getStripBtnLoop());
            toolStripPosition.addSeparator();
        }
        return toolStripPosition;
    }

    /**
     * This method initializes stripBtnMoveTop  
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnMoveTop() {
        if (stripBtnMoveTop == null) {
            stripBtnMoveTop = new BButton();
            stripBtnMoveTop.setText("|<");
        }
        return stripBtnMoveTop;
    }

    /**
     * This method initializes BPanel   
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getJPanel() {
        if (BPanel == null) {
            GridLayout gridLayout4 = new GridLayout();
            gridLayout4.setRows(2);
            GridLayout gridLayout3 = new GridLayout();
            gridLayout3.setRows(2);
            GridLayout gridLayout2 = new GridLayout();
            gridLayout2.setRows(2);
            GridLayout gridLayout = new GridLayout();
            gridLayout.setRows(2);
            BPanel = new BPanel();
            BPanel.setLayout(new BoxLayout(getJPanel(), BoxLayout.X_AXIS));
            BPanel.add(getToolStripFile(), null);
            BPanel.add(getToolStripPosition(), null);
            BPanel.add(getToolStripTool(), null);
            BPanel.add(getToolStripMeasure(), null);
        }
        return BPanel;
    }

    /**
     * This method initializes stripBtnRewind   
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnRewind() {
        if (stripBtnRewind == null) {
            stripBtnRewind = new BButton();
            stripBtnRewind.setText("<<");
        }
        return stripBtnRewind;
    }

    /**
     * This method initializes stripBtnForward  
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnForward() {
        if (stripBtnForward == null) {
            stripBtnForward = new BButton();
            stripBtnForward.setText(">>");
        }
        return stripBtnForward;
    }

    /**
     * This method initializes stripBtnMoveEnd  
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnMoveEnd() {
        if (stripBtnMoveEnd == null) {
            stripBtnMoveEnd = new BButton();
            stripBtnMoveEnd.setText(">|");
        }
        return stripBtnMoveEnd;
    }

    /**
     * This method initializes stripBtnPlay 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnPlay() {
        if (stripBtnPlay == null) {
            stripBtnPlay = new BButton();
            stripBtnPlay.setText(">");
        }
        return stripBtnPlay;
    }

    /**
     * This method initializes stripBtnStop 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getStripBtnStop() {
        if (stripBtnStop == null) {
            stripBtnStop = new BButton();
            stripBtnStop.setText("[  ]");
        }
        return stripBtnStop;
    }

    /**
     * This method initializes stripBtnScroll   
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnScroll() {
        if (stripBtnScroll == null) {
            stripBtnScroll = new BToggleButton();
            stripBtnScroll.setText("Scroll");
        }
        return stripBtnScroll;
    }

    /**
     * This method initializes stripBtnLoop 
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnLoop() {
        if (stripBtnLoop == null) {
            stripBtnLoop = new BToggleButton();
            stripBtnLoop.setText("Loop");
        }
        return stripBtnLoop;
    }

    /**
     * This method initializes toolStripMeasure 
     *  
     * @return javax.swing.BToolBar 
     */
    private BToolBar getToolStripMeasure() {
        if (toolStripMeasure == null) {
            jLabel1 = new BLabel();
            jLabel1.setText("QUANTIZE");
            BLabel = new BLabel();
            BLabel.setText("LENGTH");
            stripLblMeasure = new BLabel();
            stripLblMeasure.setText("0 : 0 : 000");
            toolStripLabel5 = new BLabel();
            toolStripLabel5.setText("MEASURE");
            toolStripMeasure = new BToolBar();
            toolStripMeasure.setName("toolStripMeasure");
            toolStripMeasure.add(toolStripLabel5);
            toolStripMeasure.add(stripLblMeasure);
            toolStripMeasure.add(BLabel);
            toolStripMeasure.add(getStripDDBtnLength());
            toolStripMeasure.add(jLabel1);
            toolStripMeasure.add(getStripDDBtnQuantize());
            toolStripMeasure.add(getStripBtnStartMarker());
            toolStripMeasure.add(getStripBtnEndMarker());
            toolStripMeasure.addSeparator();
        }
        return toolStripMeasure;
    }

    /**
     * This method initializes stripDDBtnLength 
     *  
     * @return javax.swing.BComboBox    
     */
    private BComboBox getStripDDBtnLength() {
        if (stripDDBtnLength == null) {
            stripDDBtnLength = new BComboBox();
        }
        return stripDDBtnLength;
    }

    /**
     * This method initializes stripDDBtnQuantize   
     *  
     * @return javax.swing.BComboBox    
     */
    private BComboBox getStripDDBtnQuantize() {
        if (stripDDBtnQuantize == null) {
            stripDDBtnQuantize = new BComboBox();
        }
        return stripDDBtnQuantize;
    }

    /**
     * This method initializes stripBtnStartMarker  
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnStartMarker() {
        if (stripBtnStartMarker == null) {
            stripBtnStartMarker = new BToggleButton();
        }
        return stripBtnStartMarker;
    }

    /**
     * This method initializes stripBtnEndMarker    
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnEndMarker() {
        if (stripBtnEndMarker == null) {
            stripBtnEndMarker = new BToggleButton();
        }
        return stripBtnEndMarker;
    }

    /**
     * This method initializes toolStripTool    
     *  
     * @return javax.swing.BToolBar 
     */
    private BToolBar getToolStripTool() {
        if (toolStripTool == null) {
            toolStripTool = new BToolBar();
            toolStripTool.add(getStripBtnPointer());
            toolStripTool.add(getStripBtnPencil());
            toolStripTool.add(getStripBtnLine());
            toolStripTool.add(getStripBtnEraser());
            toolStripTool.add(getStripBtnGrid());
            toolStripTool.add(getStripBtnCurve());
            toolStripTool.addSeparator();
        }
        return toolStripTool;
    }

    /**
     * This method initializes stripBtnPointer  
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnPointer() {
        if (stripBtnPointer == null) {
            stripBtnPointer = new BToggleButton();
            stripBtnPointer.setText("Pointer");
        }
        return stripBtnPointer;
    }

    /**
     * This method initializes stripBtnPencil   
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnPencil() {
        if (stripBtnPencil == null) {
            stripBtnPencil = new BToggleButton();
            stripBtnPencil.setText("Pencil");
        }
        return stripBtnPencil;
    }

    /**
     * This method initializes stripBtnLine 
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnLine() {
        if (stripBtnLine == null) {
            stripBtnLine = new BToggleButton();
            stripBtnLine.setText("Line");
        }
        return stripBtnLine;
    }

    /**
     * This method initializes stripBtnEraser   
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnEraser() {
        if (stripBtnEraser == null) {
            stripBtnEraser = new BToggleButton();
            stripBtnEraser.setToolTipText("");
            stripBtnEraser.setText("Eraser");
        }
        return stripBtnEraser;
    }

    /**
     * This method initializes stripBtnGrid 
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnGrid() {
        if (stripBtnGrid == null) {
            stripBtnGrid = new BToggleButton();
            stripBtnGrid.setText("Grid");
        }
        return stripBtnGrid;
    }

    /**
     * This method initializes stripBtnCurve    
     *  
     * @return javax.swing.BToggleButton    
     */
    private BToggleButton getStripBtnCurve() {
        if (stripBtnCurve == null) {
            stripBtnCurve = new BToggleButton();
            stripBtnCurve.setText("Curve");
        }
        return stripBtnCurve;
    }

    /**
     * This method initializes stripDDBtnSpeed  
     *  
     * @return javax.swing.BComboBox    
     */
    private BComboBox getStripDDBtnSpeed() {
        if (stripDDBtnSpeed == null) {
            stripDDBtnSpeed = new BComboBox();
        }
        return stripDDBtnSpeed;
    }

    /**
     * This method initializes cMenuTrackSelector   
     *  
     * @return javax.swing.BPopupMenu   
     */
    private BPopupMenu getCMenuTrackSelector() {
        if (cMenuTrackSelector == null) {
            cMenuTrackSelector = new BPopupMenu();
            cMenuTrackSelector.add(getCMenuTrackSelectorPointer());
            cMenuTrackSelector.add(getCMenuTrackSelectorPencil());
            cMenuTrackSelector.add(getCMenuTrackSelectorLine());
            cMenuTrackSelector.add(getCMenuTrackSelectorEraser());
            cMenuTrackSelector.add(getCMenuTrackSelectorPaletteTool());
            cMenuTrackSelector.addSeparator();
            cMenuTrackSelector.add(getCMenuTrackSelectorCurve());
            cMenuTrackSelector.addSeparator();
            cMenuTrackSelector.add(getCMenuTrackSelectorUndo());
            cMenuTrackSelector.add(getCMenuTrackSelectorRedo());
            cMenuTrackSelector.addSeparator();
            cMenuTrackSelector.add(getCMenuTrackSelectorCut());
            cMenuTrackSelector.add(getCMenuTrackSelectorCopy());
            cMenuTrackSelector.add(getCMenuTrackSelectorPaste());
            cMenuTrackSelector.add(getCMenuTrackSelectorDelete());
            cMenuTrackSelector.add(getCMenuTrackSelectorDeleteBezier());
            cMenuTrackSelector.addSeparator();
            cMenuTrackSelector.add(getCMenuTrackSelectorSelectAll());
        }
        return cMenuTrackSelector;
    }

    /**
     * This method initializes cMenuPiano   
     *  
     * @return javax.swing.BPopupMenu   
     */
    private BPopupMenu getCMenuPiano() {
        if (cMenuPiano == null) {
            cMenuPiano = new BPopupMenu();
            cMenuPiano.add(getCMenuPianoPointer());
            cMenuPiano.add(getCMenuPianoPencil());
            cMenuPiano.add(getCMenuPianoEraser());
            cMenuPiano.add(getCMenuPianoPaletteTool());
            cMenuPiano.addSeparator();
            cMenuPiano.add(getCMenuPianoCurve());
            cMenuPiano.addSeparator();
            cMenuPiano.add(getCMenuPianoFixed());
            cMenuPiano.add(getCMenuPianoQuantize());
            cMenuPiano.add(getCMenuPianoLength());
            cMenuPiano.add(getCMenuPianoGrid());
            cMenuPiano.addSeparator();
            cMenuPiano.add(getCMenuPianoUndo());
            cMenuPiano.add(getCMenuPianoRedo());
            cMenuPiano.addSeparator();
            cMenuPiano.add(getCMenuPianoCut());
            cMenuPiano.add(getCMenuPianoCopy());
            cMenuPiano.add(getCMenuPianoPaste());
            cMenuPiano.add(getCMenuPianoDelete());
            cMenuPiano.addSeparator();
            cMenuPiano.add(getCMenuPianoSelectAll());
            cMenuPiano.add(getCMenuPianoSelectAllEvents());
            cMenuPiano.addSeparator();
            cMenuPiano.add(getCMenuPianoImportLyric());
            cMenuPiano.add(getCMenuPianoExpressionProperty());
            cMenuPiano.add(getCMenuPianoVibratoProperty());
        }
        return cMenuPiano;
    }

    /**
     * This method initializes cMenuTrackTab    
     *  
     * @return javax.swing.BPopupMenu   
     */
    private BPopupMenu getCMenuTrackTab() {
        if (cMenuTrackTab == null) {
            cMenuTrackTab = new BPopupMenu();
            cMenuTrackTab.add(getCMenuTrackTabTrackOn());
            cMenuTrackTab.addSeparator();
            cMenuTrackTab.add(getCMenuTrackTabAdd());
            cMenuTrackTab.add(getCMenuTrackTabCopy());
            cMenuTrackTab.add(getCMenuTrackTabChangeName());
            cMenuTrackTab.add(getCMenuTrackTabDelete());
            cMenuTrackTab.addSeparator();
            cMenuTrackTab.add(getCMenuTrackTabRenderCurrent());
            cMenuTrackTab.add(getCMenuTrackTabRenderAll());
            cMenuTrackTab.addSeparator();
            cMenuTrackTab.add(getCMenuTrackTabOverlay());
            cMenuTrackTab.add(getCMenuTrackTabRenderer());
        }
        return cMenuTrackTab;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorPointer() {
        if (cMenuTrackSelectorPointer == null) {
            cMenuTrackSelectorPointer = new BMenuItem();
        }
        return cMenuTrackSelectorPointer;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorPencil() {
        if (cMenuTrackSelectorPencil == null) {
            cMenuTrackSelectorPencil = new BMenuItem();
        }
        return cMenuTrackSelectorPencil;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorLine() {
        if (cMenuTrackSelectorLine == null) {
            cMenuTrackSelectorLine = new BMenuItem();
        }
        return cMenuTrackSelectorLine;
    }

    /**
     * This method initializes cMenuTrackSelectorEraser 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorEraser() {
        if (cMenuTrackSelectorEraser == null) {
            cMenuTrackSelectorEraser = new BMenuItem();
        }
        return cMenuTrackSelectorEraser;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorPaletteTool() {
        if (cMenuTrackSelectorPaletteTool == null) {
            cMenuTrackSelectorPaletteTool = new BMenuItem();
        }
        return cMenuTrackSelectorPaletteTool;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorCurve() {
        if (cMenuTrackSelectorCurve == null) {
            cMenuTrackSelectorCurve = new BMenuItem();
        }
        return cMenuTrackSelectorCurve;
    }

    /**
     * This method initializes cMenuTrackSelectorUndo   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorUndo() {
        if (cMenuTrackSelectorUndo == null) {
            cMenuTrackSelectorUndo = new BMenuItem();
        }
        return cMenuTrackSelectorUndo;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorRedo() {
        if (cMenuTrackSelectorRedo == null) {
            cMenuTrackSelectorRedo = new BMenuItem();
        }
        return cMenuTrackSelectorRedo;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorCut() {
        if (cMenuTrackSelectorCut == null) {
            cMenuTrackSelectorCut = new BMenuItem();
        }
        return cMenuTrackSelectorCut;
    }

    /**
     * This method initializes cMenuTrackSelectorCopy   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorCopy() {
        if (cMenuTrackSelectorCopy == null) {
            cMenuTrackSelectorCopy = new BMenuItem();
        }
        return cMenuTrackSelectorCopy;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorPaste() {
        if (cMenuTrackSelectorPaste == null) {
            cMenuTrackSelectorPaste = new BMenuItem();
        }
        return cMenuTrackSelectorPaste;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorDelete() {
        if (cMenuTrackSelectorDelete == null) {
            cMenuTrackSelectorDelete = new BMenuItem();
        }
        return cMenuTrackSelectorDelete;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorDeleteBezier() {
        if (cMenuTrackSelectorDeleteBezier == null) {
            cMenuTrackSelectorDeleteBezier = new BMenuItem();
        }
        return cMenuTrackSelectorDeleteBezier;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackSelectorSelectAll() {
        if (cMenuTrackSelectorSelectAll == null) {
            cMenuTrackSelectorSelectAll = new BMenuItem();
        }
        return cMenuTrackSelectorSelectAll;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoPointer() {
        if (cMenuPianoPointer == null) {
            cMenuPianoPointer = new BMenuItem();
        }
        return cMenuPianoPointer;
    }

    /**
     * This method initializes cMenuPianoPencil 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoPencil() {
        if (cMenuPianoPencil == null) {
            cMenuPianoPencil = new BMenuItem();
        }
        return cMenuPianoPencil;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoEraser() {
        if (cMenuPianoEraser == null) {
            cMenuPianoEraser = new BMenuItem();
        }
        return cMenuPianoEraser;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoPaletteTool() {
        if (cMenuPianoPaletteTool == null) {
            cMenuPianoPaletteTool = new BMenuItem();
        }
        return cMenuPianoPaletteTool;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoCurve() {
        if (cMenuPianoCurve == null) {
            cMenuPianoCurve = new BMenuItem();
        }
        return cMenuPianoCurve;
    }

    /**
     * This method initializes cMenuPianoFixed  
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getCMenuPianoFixed() {
        if (cMenuPianoFixed == null) {
            cMenuPianoFixed = new BMenu();
            cMenuPianoFixed.add(getCMenuPianoFixed01());
            cMenuPianoFixed.add(getCMenuPianoFixed02());
            cMenuPianoFixed.add(getCMenuPianoFixed04());
            cMenuPianoFixed.add(getCMenuPianoFixed08());
            cMenuPianoFixed.add(getCMenuPianoFixed16());
            cMenuPianoFixed.add(getCMenuPianoFixed32());
            cMenuPianoFixed.add(getCMenuPianoFixed64());
            cMenuPianoFixed.add(getCMenuPianoFixed128());
            cMenuPianoFixed.add(getCMenuPianoFixedOff());
            cMenuPianoFixed.addSeparator();
            cMenuPianoFixed.add(getCMenuPianoFixedTriplet());
            cMenuPianoFixed.add(getCMenuPianoFixedDotted());
        }
        return cMenuPianoFixed;
    }

    /**
     * This method initializes cMenuPianoQuantize   
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getCMenuPianoQuantize() {
        if (cMenuPianoQuantize == null) {
            cMenuPianoQuantize = new BMenu();
            cMenuPianoQuantize.add(getCMenuPianoQuantize04());
            cMenuPianoQuantize.add(getCMenuPianoQuantize08());
            cMenuPianoQuantize.add(getCMenuPianoQuantize16());
            cMenuPianoQuantize.add(getCMenuPianoQuantize32());
            cMenuPianoQuantize.add(getCMenuPianoQuantize64());
            cMenuPianoQuantize.add(getCMenuPianoQuantize128());
            cMenuPianoQuantize.add(getCMenuPianoQuantizeOff());
            cMenuPianoQuantize.addSeparator();
            cMenuPianoQuantize.add(getCMenuPianoQuantizeTriplet());
        }
        return cMenuPianoQuantize;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoGrid() {
        if (cMenuPianoGrid == null) {
            cMenuPianoGrid = new BMenuItem();
        }
        return cMenuPianoGrid;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoUndo() {
        if (cMenuPianoUndo == null) {
            cMenuPianoUndo = new BMenuItem();
        }
        return cMenuPianoUndo;
    }

    /**
     * This method initializes cMenuPianoRedo   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoRedo() {
        if (cMenuPianoRedo == null) {
            cMenuPianoRedo = new BMenuItem();
        }
        return cMenuPianoRedo;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoCut() {
        if (cMenuPianoCut == null) {
            cMenuPianoCut = new BMenuItem();
        }
        return cMenuPianoCut;
    }

    /**
     * This method initializes cMenuPianoCopy   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoCopy() {
        if (cMenuPianoCopy == null) {
            cMenuPianoCopy = new BMenuItem();
        }
        return cMenuPianoCopy;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoPaste() {
        if (cMenuPianoPaste == null) {
            cMenuPianoPaste = new BMenuItem();
        }
        return cMenuPianoPaste;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoDelete() {
        if (cMenuPianoDelete == null) {
            cMenuPianoDelete = new BMenuItem();
        }
        return cMenuPianoDelete;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoSelectAll() {
        if (cMenuPianoSelectAll == null) {
            cMenuPianoSelectAll = new BMenuItem();
        }
        return cMenuPianoSelectAll;
    }

    /**
     * This method initializes cMenuPianoSelectAllEvents    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoSelectAllEvents() {
        if (cMenuPianoSelectAllEvents == null) {
            cMenuPianoSelectAllEvents = new BMenuItem();
        }
        return cMenuPianoSelectAllEvents;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoImportLyric() {
        if (cMenuPianoImportLyric == null) {
            cMenuPianoImportLyric = new BMenuItem();
        }
        return cMenuPianoImportLyric;
    }

    /**
     * This method initializes cMenuPianoExpressionProperty 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoExpressionProperty() {
        if (cMenuPianoExpressionProperty == null) {
            cMenuPianoExpressionProperty = new BMenuItem();
        }
        return cMenuPianoExpressionProperty;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoVibratoProperty() {
        if (cMenuPianoVibratoProperty == null) {
            cMenuPianoVibratoProperty = new BMenuItem();
        }
        return cMenuPianoVibratoProperty;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed02() {
        if (cMenuPianoFixed02 == null) {
            cMenuPianoFixed02 = new BMenuItem();
        }
        return cMenuPianoFixed02;
    }

    /**
     * This method initializes cMenuPianoFixed04    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed04() {
        if (cMenuPianoFixed04 == null) {
            cMenuPianoFixed04 = new BMenuItem();
        }
        return cMenuPianoFixed04;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed08() {
        if (cMenuPianoFixed08 == null) {
            cMenuPianoFixed08 = new BMenuItem();
        }
        return cMenuPianoFixed08;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed01() {
        if (cMenuPianoFixed01 == null) {
            cMenuPianoFixed01 = new BMenuItem();
        }
        return cMenuPianoFixed01;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed16() {
        if (cMenuPianoFixed16 == null) {
            cMenuPianoFixed16 = new BMenuItem();
        }
        return cMenuPianoFixed16;
    }

    /**
     * This method initializes BMenuItem5   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed32() {
        if (cMenuPianoFixed32 == null) {
            cMenuPianoFixed32 = new BMenuItem();
        }
        return cMenuPianoFixed32;
    }

    /**
     * This method initializes BMenuItem6   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed64() {
        if (cMenuPianoFixed64 == null) {
            cMenuPianoFixed64 = new BMenuItem();
        }
        return cMenuPianoFixed64;
    }

    /**
     * This method initializes BMenuItem7   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixed128() {
        if (cMenuPianoFixed128 == null) {
            cMenuPianoFixed128 = new BMenuItem();
        }
        return cMenuPianoFixed128;
    }

    /**
     * This method initializes BMenuItem8   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixedOff() {
        if (cMenuPianoFixedOff == null) {
            cMenuPianoFixedOff = new BMenuItem();
        }
        return cMenuPianoFixedOff;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixedTriplet() {
        if (cMenuPianoFixedTriplet == null) {
            cMenuPianoFixedTriplet = new BMenuItem();
        }
        return cMenuPianoFixedTriplet;
    }

    /**
     * This method initializes cMenuPianoFixedDotted    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoFixedDotted() {
        if (cMenuPianoFixedDotted == null) {
            cMenuPianoFixedDotted = new BMenuItem();
        }
        return cMenuPianoFixedDotted;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantize04() {
        if (cMenuPianoQuantize04 == null) {
            cMenuPianoQuantize04 = new BMenuItem();
        }
        return cMenuPianoQuantize04;
    }

    /**
     * This method initializes cMenuPianoQuantize08 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantize08() {
        if (cMenuPianoQuantize08 == null) {
            cMenuPianoQuantize08 = new BMenuItem();
        }
        return cMenuPianoQuantize08;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantize16() {
        if (cMenuPianoQuantize16 == null) {
            cMenuPianoQuantize16 = new BMenuItem();
        }
        return cMenuPianoQuantize16;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantize32() {
        if (cMenuPianoQuantize32 == null) {
            cMenuPianoQuantize32 = new BMenuItem();
        }
        return cMenuPianoQuantize32;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantize64() {
        if (cMenuPianoQuantize64 == null) {
            cMenuPianoQuantize64 = new BMenuItem();
        }
        return cMenuPianoQuantize64;
    }

    /**
     * This method initializes BMenuItem5   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantize128() {
        if (cMenuPianoQuantize128 == null) {
            cMenuPianoQuantize128 = new BMenuItem();
        }
        return cMenuPianoQuantize128;
    }

    /**
     * This method initializes BMenuItem6   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantizeTriplet() {
        if (cMenuPianoQuantizeTriplet == null) {
            cMenuPianoQuantizeTriplet = new BMenuItem();
        }
        return cMenuPianoQuantizeTriplet;
    }

    /**
     * This method initializes cMenuPianoLength 
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getCMenuPianoLength() {
        if (cMenuPianoLength == null) {
            cMenuPianoLength = new BMenu();
            cMenuPianoLength.add(getCMenuPianoLength04());
            cMenuPianoLength.add(getCMenuPianoLength08());
            cMenuPianoLength.add(getCMenuPianoLength16());
            cMenuPianoLength.add(getCMenuPianoLength32());
            cMenuPianoLength.add(getCMenuPianoLength64());
            cMenuPianoLength.add(getCMenuPianoLength128());
            cMenuPianoLength.add(getCMenuPianoLengthOff());
            cMenuPianoLength.addSeparator();
            cMenuPianoLength.add(getCMenuPianoLengthTriplet());
        }
        return cMenuPianoLength;
    }

    /**
     * This method initializes cMenuPianoLength04   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLength04() {
        if (cMenuPianoLength04 == null) {
            cMenuPianoLength04 = new BMenuItem();
        }
        return cMenuPianoLength04;
    }

    /**
     * This method initializes cMenuPianoLength08   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLength08() {
        if (cMenuPianoLength08 == null) {
            cMenuPianoLength08 = new BMenuItem();
        }
        return cMenuPianoLength08;
    }

    /**
     * This method initializes cMenuPianoLength16   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLength16() {
        if (cMenuPianoLength16 == null) {
            cMenuPianoLength16 = new BMenuItem();
        }
        return cMenuPianoLength16;
    }

    /**
     * This method initializes cMenuPianoLength32   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLength32() {
        if (cMenuPianoLength32 == null) {
            cMenuPianoLength32 = new BMenuItem();
        }
        return cMenuPianoLength32;
    }

    /**
     * This method initializes cMenuPianoLength64   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLength64() {
        if (cMenuPianoLength64 == null) {
            cMenuPianoLength64 = new BMenuItem();
        }
        return cMenuPianoLength64;
    }

    /**
     * This method initializes cMenuPianoLength128  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLength128() {
        if (cMenuPianoLength128 == null) {
            cMenuPianoLength128 = new BMenuItem();
        }
        return cMenuPianoLength128;
    }

    /**
     * This method initializes cMenuPianoLengthTriplet  
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLengthTriplet() {
        if (cMenuPianoLengthTriplet == null) {
            cMenuPianoLengthTriplet = new BMenuItem();
        }
        return cMenuPianoLengthTriplet;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabTrackOn() {
        if (cMenuTrackTabTrackOn == null) {
            cMenuTrackTabTrackOn = new BMenuItem();
        }
        return cMenuTrackTabTrackOn;
    }

    /**
     * This method initializes cMenuTrackTabAdd 
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabAdd() {
        if (cMenuTrackTabAdd == null) {
            cMenuTrackTabAdd = new BMenuItem();
        }
        return cMenuTrackTabAdd;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabCopy() {
        if (cMenuTrackTabCopy == null) {
            cMenuTrackTabCopy = new BMenuItem();
        }
        return cMenuTrackTabCopy;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabChangeName() {
        if (cMenuTrackTabChangeName == null) {
            cMenuTrackTabChangeName = new BMenuItem();
        }
        return cMenuTrackTabChangeName;
    }

    /**
     * This method initializes BMenuItem4   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabDelete() {
        if (cMenuTrackTabDelete == null) {
            cMenuTrackTabDelete = new BMenuItem();
        }
        return cMenuTrackTabDelete;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabRenderCurrent() {
        if (cMenuTrackTabRenderCurrent == null) {
            cMenuTrackTabRenderCurrent = new BMenuItem();
        }
        return cMenuTrackTabRenderCurrent;
    }

    /**
     * This method initializes cMenuTrackTabRenderAll   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabRenderAll() {
        if (cMenuTrackTabRenderAll == null) {
            cMenuTrackTabRenderAll = new BMenuItem();
        }
        return cMenuTrackTabRenderAll;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabOverlay() {
        if (cMenuTrackTabOverlay == null) {
            cMenuTrackTabOverlay = new BMenuItem();
        }
        return cMenuTrackTabOverlay;
    }

    /**
     * This method initializes cMenuTrackTabRenderer    
     *  
     * @return javax.swing.BMenu    
     */
    private BMenu getCMenuTrackTabRenderer() {
        if (cMenuTrackTabRenderer == null) {
            cMenuTrackTabRenderer = new BMenu();
            cMenuTrackTabRenderer.add(getCMenuTrackTabRendererVOCALOID1());
            cMenuTrackTabRenderer.add(getCMenuTrackTabRendererVOCALOID2());
            cMenuTrackTabRenderer.add(getCMenuTrackTabRendererUtau());
            cMenuTrackTabRenderer.add(getCMenuTrackTabRendererStraight());
        }
        return cMenuTrackTabRenderer;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabRendererVOCALOID2() {
        if (cMenuTrackTabRendererVOCALOID2 == null) {
            cMenuTrackTabRendererVOCALOID2 = new BMenuItem();
        }
        return cMenuTrackTabRendererVOCALOID2;
    }

    /**
     * This method initializes cMenuTrackTabRendererVOCALOID1   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabRendererVOCALOID1() {
        if (cMenuTrackTabRendererVOCALOID1 == null) {
            cMenuTrackTabRendererVOCALOID1 = new BMenuItem();
        }
        return cMenuTrackTabRendererVOCALOID1;
    }

    /**
     * This method initializes BMenuItem2   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabRendererUtau() {
        if (cMenuTrackTabRendererUtau == null) {
            cMenuTrackTabRendererUtau = new BMenuItem();
        }
        return cMenuTrackTabRendererUtau;
    }

    /**
     * This method initializes BMenuItem3   
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuTrackTabRendererStraight() {
        if (cMenuTrackTabRendererStraight == null) {
            cMenuTrackTabRendererStraight = new BMenuItem();
        }
        return cMenuTrackTabRendererStraight;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoQuantizeOff() {
        if (cMenuPianoQuantizeOff == null) {
            cMenuPianoQuantizeOff = new BMenuItem();
        }
        return cMenuPianoQuantizeOff;
    }

    /**
     * This method initializes BMenuItem    
     *  
     * @return javax.swing.BMenuItem    
     */
    private BMenuItem getCMenuPianoLengthOff() {
        if (cMenuPianoLengthOff == null) {
            cMenuPianoLengthOff = new BMenuItem();
        }
        return cMenuPianoLengthOff;
    }

    /**
     * This method initializes panel3   
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getPanel3() {
        if (panel3 == null) {
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.gridx = 3;
            gridBagConstraints6.weightx = 1.0D;
            gridBagConstraints6.gridheight = 2;
            gridBagConstraints6.weighty = 1.0D;
            gridBagConstraints6.fill = GridBagConstraints.BOTH;
            gridBagConstraints6.gridy = 0;
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridx = 4;
            gridBagConstraints5.gridy = 1;
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.gridx = 4;
            gridBagConstraints4.gridy = 0;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 1;
            gridBagConstraints3.gridheight = 2;
            gridBagConstraints3.gridy = 0;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 2;
            gridBagConstraints2.weighty = 1.0D;
            gridBagConstraints2.gridy = 1;
            GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
            gridBagConstraints1.gridx = 2;
            gridBagConstraints1.weighty = 1.0D;
            gridBagConstraints1.gridy = 0;
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.gridheight = 2;
            gridBagConstraints.weighty = 1.0D;
            gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints.gridy = 0;
            panel3 = new BPanel();
            panel3.setLayout(new GridBagLayout());
            panel3.add(getJButton(), gridBagConstraints);
            panel3.add(getJButton1(), gridBagConstraints1);
            panel3.add(getJButton2(), gridBagConstraints2);
            panel3.add(getJButton3(), gridBagConstraints3);
            panel3.add(getJButton4(), gridBagConstraints4);
            panel3.add(getJButton5(), gridBagConstraints5);
            panel3.add(getJPanel2(), gridBagConstraints6);
        }
        return panel3;
    }

    /**
     * This method initializes jPanel2  
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getJPanel2() {
        if (jPanel2 == null) {
            jPanel2 = new BPanel();
            jPanel2.setLayout(new GridBagLayout());
        }
        return jPanel2;
    }

    /**
     * This method initializes BButton  
     *  
     * @return javax.swing.BButton  
     */
    private BButton getJButton() {
        if (BButton == null) {
            BButton = new BButton();
            BButton.setText("-");
        }
        return BButton;
    }

    /**
     * This method initializes jButton1 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getJButton1() {
        if (jButton1 == null) {
            jButton1 = new BButton();
            jButton1.setText("<");
        }
        return jButton1;
    }

    /**
     * This method initializes jButton2 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getJButton2() {
        if (jButton2 == null) {
            jButton2 = new BButton();
            jButton2.setText(">");
        }
        return jButton2;
    }

    /**
     * This method initializes jButton3 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getJButton3() {
        if (jButton3 == null) {
            jButton3 = new BButton();
            jButton3.setText("+");
        }
        return jButton3;
    }

    /**
     * This method initializes jButton4 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getJButton4() {
        if (jButton4 == null) {
            jButton4 = new BButton();
            jButton4.setText("<");
        }
        return jButton4;
    }

    /**
     * This method initializes jButton5 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getJButton5() {
        if (jButton5 == null) {
            jButton5 = new BButton();
            jButton5.setText(">");
        }
        return jButton5;
    }

    /**
     * This method initializes pictPianoRoll    
     *  
     * @return javax.swing.BPanel   
     */
    private PictPianoRoll getPictPianoRoll() {
        if (pictPianoRoll == null) {
            pictPianoRoll = new PictPianoRoll();
            pictPianoRoll.setLayout(new GridBagLayout());
        }
        return pictPianoRoll;
    }

    /**
     * This method initializes vScroll  
     *  
     * @return javax.swing.JScrollBar   
     */
    private BVScrollBar getVScroll() {
        if (vScroll == null) {
            vScroll = new BVScrollBar();
        }
        return vScroll;
    }

    /**
     * This method initializes hScroll  
     *  
     * @return javax.swing.JScrollBar   
     */
    private BHScrollBar getHScroll() {
        if (hScroll == null) {
            hScroll = new BHScrollBar();
        }
        return hScroll;
    }

    /**
     * This method initializes pictureBox3  
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getPictureBox3() {
        if (pictureBox3 == null) {
            GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
            gridBagConstraints12.anchor = GridBagConstraints.EAST;
            pictureBox3 = new BPanel();
            pictureBox3.setLayout(new GridBagLayout());
            pictureBox3.setPreferredSize(new Dimension(68, 0));
            pictureBox3.add(getJButton6(), gridBagConstraints12);
        }
        return pictureBox3;
    }

    /**
     * This method initializes trackBar 
     *  
     * @return javax.swing.JSlider  
     */
    private BSlider getTrackBar() {
        if (trackBar == null) {
            trackBar = new BSlider();
            trackBar.setPreferredSize(new Dimension(83, 16));
        }
        return trackBar;
    }

    /**
     * This method initializes jButton6 
     *  
     * @return javax.swing.BButton  
     */
    private BButton getJButton6() {
        if (jButton6 == null) {
            jButton6 = new BButton();
        }
        return jButton6;
    }

    /**
     * This method initializes picturePositionIndicator 
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getPicturePositionIndicator() {
        if (picturePositionIndicator == null) {
            picturePositionIndicator = new BPanel();
            picturePositionIndicator.setLayout(new GridBagLayout());
            picturePositionIndicator.setPreferredSize(new Dimension(421, 48));
        }
        return picturePositionIndicator;
    }

    /**
     * This method initializes jPanel1  
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getJPanel1() {
        if (jPanel1 == null) {
            GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
            gridBagConstraints15.gridx = 0;
            gridBagConstraints15.fill = GridBagConstraints.BOTH;
            gridBagConstraints15.weightx = 1.0D;
            gridBagConstraints15.weighty = 1.0D;
            gridBagConstraints15.gridy = 2;
            GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
            gridBagConstraints14.gridx = 0;
            gridBagConstraints14.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints14.weightx = 1.0D;
            gridBagConstraints14.gridy = 1;
            GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
            gridBagConstraints13.gridx = 0;
            gridBagConstraints13.fill = GridBagConstraints.HORIZONTAL;
            gridBagConstraints13.anchor = GridBagConstraints.NORTH;
            gridBagConstraints13.weightx = 1.0D;
            gridBagConstraints13.gridy = 0;
            jPanel1 = new BPanel();
            jPanel1.setLayout(new GridBagLayout());
            jPanel1.add(getPanel3(), gridBagConstraints13);
            jPanel1.add(getPicturePositionIndicator(), gridBagConstraints14);
            jPanel1.add(getPanel1(), gridBagConstraints15);
        }
        return jPanel1;
    }

    /**
     * This method initializes jPanel3  
     *  
     * @return javax.swing.BPanel   
     */
    private BPanel getJPanel3() {
        if (jPanel3 == null) {
            GridLayout gridLayout1 = new GridLayout();
            gridLayout1.setRows(2);
            gridLayout1.setColumns(1);
            statusLabel = new BLabel();
            statusLabel.setText("");
            jPanel3 = new BPanel();
            jPanel3.setLayout(gridLayout1);
            jPanel3.add(getToolStripBottom(), null);
            jPanel3.add(statusLabel, null);
        }
        return jPanel3;
    }

    /**
     * This method initializes menuHidden	
     * 	
     * @return javax.swing.JMenu	
     */
    private JMenu getMenuHidden() {
        if (menuHidden == null) {
            menuHidden = new JMenu();
            menuHidden.setText("Hidden");
            menuHidden.add(getMenuHiddenEditLyric());
            menuHidden.add(getMenuHiddenEditFlipToolPointerPencil());
            menuHidden.add(getMenuHiddenEditFlipToolPointerEraser());
            menuHidden.add(getMenuHiddenVisualForwardParameter());
            menuHidden.add(getMenuHiddenVisualBackwardParameter());
            menuHidden.add(getMenuHiddenTrackNext());
            menuHidden.add(getMenuHiddenTrackBack());
            menuHidden.add(getMenuHiddenCopy());
            menuHidden.add(getMenuHiddenPaste());
            menuHidden.add(getMenuHiddenCut());
        }
        return menuHidden;
    }

    /**
     * This method initializes menuHiddenEditLyric	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenEditLyric() {
        if (menuHiddenEditLyric == null) {
            menuHiddenEditLyric = new JMenuItem();
            menuHiddenEditLyric.setText("Start Lyric Input");
        }
        return menuHiddenEditLyric;
    }

    /**
     * This method initializes menuHiddenEditFlipToolPointerPencil	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenEditFlipToolPointerPencil() {
        if (menuHiddenEditFlipToolPointerPencil == null) {
            menuHiddenEditFlipToolPointerPencil = new JMenuItem();
            menuHiddenEditFlipToolPointerPencil.setText("Change Tool Pointer / Pencil");
        }
        return menuHiddenEditFlipToolPointerPencil;
    }

    /**
     * This method initializes menuHiddenEditFlipToolPointerEraser	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenEditFlipToolPointerEraser() {
        if (menuHiddenEditFlipToolPointerEraser == null) {
            menuHiddenEditFlipToolPointerEraser = new JMenuItem();
            menuHiddenEditFlipToolPointerEraser.setText("Change Tool Pointer/ Eraser");
        }
        return menuHiddenEditFlipToolPointerEraser;
    }

    /**
     * This method initializes menuHiddenVisualForwardParameter	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenVisualForwardParameter() {
        if (menuHiddenVisualForwardParameter == null) {
            menuHiddenVisualForwardParameter = new JMenuItem();
            menuHiddenVisualForwardParameter.setText("Next Control Curve");
        }
        return menuHiddenVisualForwardParameter;
    }

    /**
     * This method initializes menuHiddenVisualBackwardParameter	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenVisualBackwardParameter() {
        if (menuHiddenVisualBackwardParameter == null) {
            menuHiddenVisualBackwardParameter = new JMenuItem();
            menuHiddenVisualBackwardParameter.setText("Previous Control Curve");
        }
        return menuHiddenVisualBackwardParameter;
    }

    /**
     * This method initializes menuHiddenTrackNext	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenTrackNext() {
        if (menuHiddenTrackNext == null) {
            menuHiddenTrackNext = new JMenuItem();
            menuHiddenTrackNext.setText("Next Track");
        }
        return menuHiddenTrackNext;
    }

    /**
     * This method initializes menuHiddenTrackBack	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenTrackBack() {
        if (menuHiddenTrackBack == null) {
            menuHiddenTrackBack = new JMenuItem();
            menuHiddenTrackBack.setText("Previous Track");
        }
        return menuHiddenTrackBack;
    }

    /**
     * This method initializes menuHiddenCopy	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenCopy() {
        if (menuHiddenCopy == null) {
            menuHiddenCopy = new JMenuItem();
            menuHiddenCopy.setText("Copy");
        }
        return menuHiddenCopy;
    }

    /**
     * This method initializes menuHiddenPaste	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenPaste() {
        if (menuHiddenPaste == null) {
            menuHiddenPaste = new JMenuItem();
            menuHiddenPaste.setText("Paste");
        }
        return menuHiddenPaste;
    }

    /**
     * This method initializes menuHiddenCut	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuHiddenCut() {
        if (menuHiddenCut == null) {
            menuHiddenCut = new JMenuItem();
            menuHiddenCut.setText("Cut");
        }
        return menuHiddenCut;
    }

    /**
     * This method initializes menuTrackRendererVOCALOID1	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuTrackRendererVOCALOID1() {
        if (menuTrackRendererVOCALOID1 == null) {
            menuTrackRendererVOCALOID1 = new JMenuItem();
            menuTrackRendererVOCALOID1.setText("VOCALOID1");
        }
        return menuTrackRendererVOCALOID1;
    }

    /**
     * This method initializes menuTrackRendererVOCALOID2	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuTrackRendererVOCALOID2() {
        if (menuTrackRendererVOCALOID2 == null) {
            menuTrackRendererVOCALOID2 = new JMenuItem();
            menuTrackRendererVOCALOID2.setText("VOCALOID2");
        }
        return menuTrackRendererVOCALOID2;
    }

    /**
     * This method initializes menuTrackRendererUtau	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuTrackRendererUtau() {
        if (menuTrackRendererUtau == null) {
            menuTrackRendererUtau = new JMenuItem();
            menuTrackRendererUtau.setText("UTAU");
        }
        return menuTrackRendererUtau;
    }

    /**
     * This method initializes menuTrackRendererStraight	
     * 	
     * @return javax.swing.JMenuItem	
     */
    private JMenuItem getMenuTrackRendererStraight() {
        if (menuTrackRendererStraight == null) {
            menuTrackRendererStraight = new JMenuItem();
            menuTrackRendererStraight.setText("Straight X UTAU");
        }
        return menuTrackRendererStraight;
    }

    //SECTION-END-METHOD
}  //  @jve:decl-index=0:visual-constraint="18,34"