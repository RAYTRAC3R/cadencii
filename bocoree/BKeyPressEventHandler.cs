﻿/*
 * BKeyPressEventHandler.cs
 * Copyright (c) 2009 kbinani
 *
 * This file is part of bocoree.
 *
 * bocoree is free software; you can redistribute it and/or
 * modify it under the terms of the BSD License.
 *
 * bocoree is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
#if JAVA
package org.kbinani.windows.forms;

import org.kbinani.BEventHandler;
#else
using System;
using System.Windows.Forms;

namespace bocoree.windows.forms {
#endif

#if JAVA
    public class BKeyPressEventHandler extends BEventHandler{
#else
    public class BKeyPressEventHandler : BEventHandler {
#endif
        public BKeyPressEventHandler( Object sender, String method_name )
#if JAVA
        {
#else
            :
#endif
            base( sender, method_name, typeof( void ), typeof( Object ), typeof( KeyEventArgs ) )
#if JAVA
            ;
#else
        {
#endif
        }

        public BKeyPressEventHandler( Type sender, String method_name )
#if JAVA
        {
#else
            :
#endif
            base( sender, method_name, typeof( void ), typeof( Object ), typeof( KeyEventArgs ) )
#if JAVA
            ;
#else
        {
#endif
        }
    }

#if !JAVA
}
#endif