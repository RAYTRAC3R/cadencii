﻿#if ENABLE_AQUESTONE
/*
 * AquesToneDriver.cs
 * Copyright (C) 2009-2010 kbinani
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

import org.kbinani.*;
import org.kbinani.vsq.*;
#else
using System;
using System.Text;
using org.kbinani;
using org.kbinani.java.io;
using org.kbinani.vsq;

namespace org.kbinani.cadencii {
    using boolean = System.Boolean;
#endif

#if JAVA
    public class AquesToneDriver{
#else
    public class AquesToneDriver : vstidrv {
#endif
        public static readonly String[] PHONES = new String[] { 
            "ア", "イ", "ウ", "エ", "オ",
            "カ", "キ", "ク", "ケ", "コ",
            "サ", "シ", "ス", "セ", "ソ",
            "タ", "チ", "ツ", "テ", "ト",
            "ナ", "ニ", "ヌ", "ネ", "ノ",
            "ハ", "ヒ", "フ", "ヘ", "ホ",
            "マ", "ミ", "ム", "メ", "モ",
            "ヤ", "ユ", "イェ", "ヨ",
            "ラ", "リ", "ル", "レ", "ロ",
            "ワ", "ヲ",
            "ン",
            "ガ", "ギ", "グ", "ゲ", "ゴ",
            "ザ", "ジ", "ズ", "ゼ", "ゾ",
            "ダ", "デ", "ド",
            "バ", "ビ", "ブ", "ベ", "ボ",
            "パ", "ピ", "プ", "ペ", "ポ",
            "キャ", "キュ", "キェ", "キョ",
            "シャ", "シュ", "シェ", "ショ",
            "チャ", "チュ", "チェ", "チョ",
            "ニャ", "ニュ", "ニェ", "ニョ",
            "ヒャ", "ヒュ", "ヒェ", "ヒョ",
            "ミャ", "ミュ", "ミェ", "ミョ",
            "リャ", "リュ", "リェ", "リョ",
            "ギャ", "ギュ", "ギェ", "ギョ",
            "ジャ", "ジュ", "ジェ", "ジョ",
            "ウィ", "ウェ", "ウォ",
            "ツァ", "ツィ", "ツェ", "ツォ",
            "ファ", "フィ", "フェ", "フォ",
            "ビャ", "ビュ", "ビェ", "ビョ",
            "ピャ", "ピュ", "ピェ", "ピョ",
            "スィ", "ティ", "ズィ", "ディ",
            "トゥ", "ドゥ", "デュ", "テュ",
        };
        private static readonly SingerConfig female_f1 = new SingerConfig( "Female_F1", 0, 0 );
        private static readonly SingerConfig auto_f1 = new SingerConfig( "Auto_F1", 1, 1 );
        private static readonly SingerConfig male_hk = new SingerConfig( "Male_HK", 2, 2 );
        private static readonly SingerConfig auto_hk = new SingerConfig( "Auto_HK", 3, 3 );

        public static readonly SingerConfig[] SINGERS = new SingerConfig[] { female_f1, auto_f1, male_hk, auto_hk };

        private static AquesToneDriver _instance = null;

#if ENABLE_AQUESTONE

        public int haskyParameterIndex = 0;
        public int resonancParameterIndex = 1;
        public int yomiLineParameterIndex = 2;
        public int volumeParameterIndex = 3;
        public int releaseParameterIndex = 4;
        public int portaTimeParameterIndex = 5;
        public int vibFreqParameterIndex = 6;
        public int bendLblParameterIndex = 7;
        public int phontParameterIndex = 8;

        private AquesToneDriver() {
        }

        public static AquesToneDriver getInstance() {
            if ( _instance == null ) {
                reload();
            }
            return _instance;
        }

        public static void reload() {
            String aques_tone = AppManager.editorConfig.PathAquesTone;
            if ( _instance == null ) {
#if FAKE_AQUES_TONE_DLL_AS_VOCALOID1
                _instance = new VocaloidDriver();
#else
                _instance = new AquesToneDriver();
#endif
                _instance.loaded = false;
                _instance.kind = RendererKind.AQUES_TONE;
            }
            if ( _instance.loaded ) {
                _instance.close();
                _instance.loaded = false;
            }
            _instance.path = aques_tone;
            if ( !aques_tone.Equals( "" ) && PortUtil.isFileExists( aques_tone ) && !AppManager.editorConfig.DoNotUseAquesTone ) {
                boolean loaded = false;
                try {
#if FAKE_AQUES_TONE_DLL_AS_VOCALOID1
                    loaded = _instance.open( aques_tone, SAMPLE_RATE, SAMPLE_RATE, false );
#else
                    loaded = _instance.open( aques_tone, VSTiProxy.SAMPLE_RATE, VSTiProxy.SAMPLE_RATE, true );
#endif
                } catch ( Exception ex ) {
                    PortUtil.stderr.println( "VSTiProxy#realoadAquesTone; ex=" + ex );
                    loaded = false;
                    Logger.write( typeof( AquesToneDriver ) + ".reload; ex=" + ex + "\n" );
                }
                _instance.loaded = loaded;
            }
#if DEBUG
            PortUtil.println( "VSTiProxy#initCor; aquesToneDriver.loaded=" + _instance.loaded );
#endif
        }

        public override boolean open( string dll_path, int block_size, int sample_rate, boolean use_native_dll_loader ){
#if DEBUG
            PortUtil.println( "AquesToneDriver#open" );
#endif
            int strlen = 260;
            StringBuilder sb = new StringBuilder( strlen );
            win32.GetProfileString( "AquesTone", "FileKoe_00", "", sb, (uint)strlen );
            String koe_old = sb.ToString();

            String required = getKoeFilePath();
            boolean refresh_winini = false;
            if ( !required.Equals( koe_old ) && !koe_old.Equals( "" ) ) {
                refresh_winini = true;
            }
            win32.WriteProfileString( "AquesTone", "FileKoe_00", required );
            boolean ret = false;
            try {
                ret = base.open( dll_path, block_size, sample_rate, true );
            } catch ( Exception ex ) {
                ret = false;
                PortUtil.stderr.println( "AquesToneDriver#open; ex=" + ex );
                Logger.write( typeof( AquesToneDriver ) + ".open; ex=" + ex + "\n" );
            }

            /*try {
                for ( int i = 0; i < aEffect.aeffect.numParams; i++ ) {
                    //String name = getParameterName( i ).Trim().ToLower();
                     ( name.StartsWith( "phont" ) ) {
                        phontParameterIndex = i;
                    }else if ( name.StartsWith( "bendlbl" ) ){
                        bendLblParameterIndex = i;
                    } else if ( name.StartsWith( "volume" ) ) {
                        volumeParameterIndex = i;
                    } else if ( name.StartsWith( "hasky" ) ) {
                        haskyParameterIndex = i;
                    } else if ( name.StartsWith( "resonanc" ) ) {
                        resonancParameterIndex = i;
                    } else if ( name.StartsWith( "portatime" ) ) {
                        portaTimeParameterIndex = i;
                    } else if ( name.StartsWith( "release" ) ) {
                        releaseParameterIndex = i;
                    }
                    //AquesToneDriver#open; #0 Haskey
                    //AquesToneDriver#open; #1 Resonanc
                    //AquesToneDriver#open; #2 YomiLine
                    //AquesToneDriver#open; #3 Volume
                    //AquesToneDriver#open; #4 Release
                    //AquesToneDriver#open; #5 PrtaTime
                    //AquesToneDriver#open; #6 VibFreq
                    //AquesToneDriver#open; #7 BendLbl
                    //er#open; #8 Phont
#if DEBUG
                    PortUtil.stdout.println( "AquesToneDriver#open; #" + i + " " + getParameterName( i ) + "=" + getParameterDisplay( i ) + getParameterLabel( i ) + "; value=" + getParameter( i ) );
#endif
                }
            } catch ( Exception ex ) {
                PortUtil.stderr.println( "AquesToneDriver#open; ex=" + ex );
            }*/

            if ( refresh_winini ) {
                win32.WriteProfileString( "AquesTone", "FileKoe_00", koe_old );
            }
#if DEBUG
            PortUtil.println( "AquesToneDriver#open; done; ret=" + ret );
#endif
            return ret;
        }

        private static String getKoeFilePath() {
            String ret = PortUtil.combinePath( AppManager.getCadenciiTempDir(), "jphonefifty.txt" );
            BufferedWriter bw = null;
            try {
                bw = new BufferedWriter( new OutputStreamWriter( new FileOutputStream( ret ), "Shift_JIS" ) );
                foreach ( String s in PHONES ) {
                    bw.write( s ); bw.newLine();
                }
            } catch ( Exception ex ) {
                Logger.write( typeof( AquesToneDriver ) + ".getKoeFilePath; ex=" + ex + "\n" );
                PortUtil.stderr.println( "AquesToneDriver#getKoeFilePath; ex=" + ex );
            } finally {
                if ( bw != null ) {
                    try {
                        bw.close();
                    } catch ( Exception ex2 ) {
                        Logger.write( typeof( AquesToneDriver ) + ".getKoeFilePath; ex=" + ex2 + "\n" );
                        PortUtil.stderr.println( "AquesToneDriver#getKoeFilePath; ex=" + ex2 );
                    }
                }
            }
            return ret;
        }
#endif
    }

#if !JAVA
}
#endif
#endif
