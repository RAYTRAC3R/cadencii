﻿/*
 * InternalStdOut.cs
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
package org.kbinani;

#else
using System;

namespace org.kbinani {
#endif

    public class InternalStdOut {
        public void println( String s ) {
#if JAVA
            System.out.println( s );
#else
            Console.Out.WriteLine( s );
#endif
        }
    }

#if !JAVA
}
#endif