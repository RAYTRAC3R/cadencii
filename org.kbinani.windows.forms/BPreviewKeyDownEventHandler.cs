﻿/*
 * BPreviewKeyDownEventHandler.cs
 * Copyright (C) 2009-2010 kbinani
 *
 * This file is part of org.kbinani.windows.forms.
 *
 * org.kbinani.windows.forms is free software; you can redistribute it and/or
 * modify it under the terms of the BSD License.
 *
 * org.kbinani.windows.forms is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
#if JAVA
//INCLUDE ../BuildJavaUI/src/org/kbinani/windows/forms/BPreviewKeyDownEventHandler.java
#else
using System;
using System.Windows.Forms;

namespace org.kbinani.windows.forms {

    public class BPreviewKeyDownEventHandler : BEventHandler {
        public BPreviewKeyDownEventHandler( Object sender, String method_name )
            : base( sender, method_name, typeof( void ), typeof( Object ), typeof( PreviewKeyDownEventArgs ) ) {
        }

        public BPreviewKeyDownEventHandler( Type sender, String method_name )
            : base( sender, method_name, typeof( void ), typeof( Object ), typeof( PreviewKeyDownEventArgs ) ) {
        }
    }

}
#endif