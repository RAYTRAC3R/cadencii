﻿/*
 * EmptyRenderingRunner.cs
 * Copyright (C) 2010 kbinani
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

import java.util.*;
import org.kbinani.*;
import org.kbinani.media.*;
#else
using System;
using org.kbinani.media;
using org.kbinani.java.util;

namespace org.kbinani.cadencii {
    using boolean = System.Boolean;
#endif

#if JAVA
    public class EmptyRenderingRunner extends RenderingRunner {
#else
    public class EmptyRenderingRunner : RenderingRunner {
#endif
        private boolean modeInfinite;
        private double startedDate;

        public EmptyRenderingRunner( int track,
                                     boolean reflect_amp_to_wave,
                                     WaveWriter wave_writer,
                                     double wave_read_offset_seconds,
                                     Vector<WaveReader> readers,
                                     boolean direct_play,
                                     int trim_msec,
                                     long total_samples,
                                     int sample_rate,
                                     boolean mode_infinite )
#if JAVA
            {
#else
            :
#endif
 base( track, reflect_amp_to_wave, wave_writer, wave_read_offset_seconds, readers, direct_play, trim_msec, total_samples, sample_rate )
#if JAVA
            ;
#else
 {
#endif
#if DEBUG
     PortUtil.println( "EmptyRenderingRunner#.ctor; readers.size()=" + readers.size() );
#endif
            modeInfinite = mode_infinite;
        }

        public override void run() {
            m_rendering = true;
            startedDate = PortUtil.getCurrentTime();
            int buflen = 1024;
            double[] left = new double[buflen];
            double[] right = new double[buflen];
            long remain = totalSamples;
            while ( remain > 0 && !m_abort_required ) {
                int delta = (remain > buflen) ? buflen : (int)remain;
                waveIncoming( left, right, delta );
                for ( int i = 0; i < delta; i++ ) {
                    left[i] = 0.0;
                    right[i] = 0.0;
                }
                remain -= delta;
            }

            if ( modeInfinite ) {
                while ( !m_abort_required ) {
                    waveIncoming( left, right, buflen );
                    for ( int i = 0; i < buflen; i++ ) {
                        left[i] = 0.0;
                        right[i] = 0.0;
                    }
                }
            }

            if ( directPlay ) {
                PlaySound.waitForExit();
            }

            m_rendering = false;
        }

        public override double getProgress() {
            if ( m_rendering ) {
                return m_total_append / (double)totalSamples * 100.0;
            } else {
                return 0.0;
            }
        }

        public override double getElapsedSeconds() {
            if ( m_rendering ) {
                return PortUtil.getCurrentTime() - startedDate;
            } else {
                return 0.0;
            }
        }

        public override double computeRemainingSeconds() {
            if ( m_rendering ) {
                double progress = getProgress();
                double elapsed = getElapsedSeconds();
                double rate = progress / elapsed;
                return (100.0 - progress) / rate;
            } else {
                return 0.0;
            }
        }
    }

#if !JAVA
}
#endif
