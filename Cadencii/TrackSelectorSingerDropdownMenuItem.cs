/*
 * TrackSelectorSingerDropdownMenuItem.cs
 * Copyright © 2011 kbinani
 *
 * This file is part of org.kbinani.cadencii.
 *
 * org.kbinani.cadencii is free software; you can redistribute it and/or
 * modify it under the terms of the GPLv3 License.
 *
 * org.kbinani.cadencii is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
#if JAVA

package org.kbinani.cadencii;

import org.kbinani.windows.forms.*;

#else

using System;
using com.github.cadencii.windows.forms;

namespace com.github.cadencii
{
#endif

#if JAVA
    public class TrackSelectorSingerDropdownMenuItem extends BMenuItem
#else
    public class TrackSelectorSingerDropdownMenuItem : BMenuItem
#endif
    {
        public int ToolTipPxWidth;
        public String ToolTipText;
        public int Language;
        public int Program;
    }

#if !JAVA
}
#endif
