﻿/*
 * BToolStripLabel.cs
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
namespace org.kbinani.windows.forms {
    public class BToolStripLabel : System.Windows.Forms.ToolStripLabel {
        public void setText( string value ) {
            base.Text = value;
        }
    }
}
