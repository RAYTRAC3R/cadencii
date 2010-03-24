﻿/*
 * BFolderBrowser.cs
 * Copyright (C) 2009-2010 kbinani
 *
 * This file is part of org.kbinani.
 *
 * org.kbinani is free software; you can redistribute it and/or
 * modify it under the terms of the BSD License.
 *
 * org.kbinani is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
#if JAVA
//INCLUDE ..\BuildJavaUI\src\org\kbinani\windows\forms\BFolderBrowser.java
#else
using System;
using System.Windows.Forms;

namespace org.kbinani.windows.forms {

    public class BFolderBrowser {
        public FolderBrowserDialog dialog;
        private BDialogResult m_result = BDialogResult.CANCEL;

        public BFolderBrowser() {
            dialog = new FolderBrowserDialog();
            dialog.RootFolder = Environment.SpecialFolder.Desktop;
        }

        public bool isNewFolderButtonVisible() {
            return dialog.ShowNewFolderButton;
        }

        public void setNewFolderButtonVisible( bool value ) {
            dialog.ShowNewFolderButton = value;
        }

        public string getDescription() {
            return dialog.Description;
        }

        public void setDescription( string value ) {
            dialog.Description = value;
        }

        public string getSelectedPath() {
            return dialog.SelectedPath;
        }

        public void setSelectedPath( string value ) {
            dialog.SelectedPath = value;
        }

        public void setVisible( bool value ) {
            if ( value ) {
                DialogResult ret = dialog.ShowDialog();
                if ( ret == DialogResult.OK ) {
                    m_result = BDialogResult.OK;
                } else {
                    m_result = BDialogResult.CANCEL;
                }
            } else {
                //do nothing
            }
        }

        public BDialogResult getDialogResult() {
            return m_result;
        }
    }

}
#endif
