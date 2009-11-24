﻿#if ENABLE_SCRIPT
/*
 * PaletteToolServer.cs
 * Copyright (c) 2009 kbinani
 *
 * This file is part of Boare.Cadencii.
 *
 * Boare.Cadencii is free software; you can redistribute it and/or
 * modify it under the terms of the GPLv3 License.
 *
 * Boare.Cadencii is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
using System;
using System.CodeDom.Compiler;
using System.IO;
using System.Reflection;
using System.Windows.Forms;
using Boare.Lib.Vsq;
using bocoree;
using bocoree.java.util;

namespace Boare.Cadencii {
    using boolean = System.Boolean;

    public static class PaletteToolServer {
        public static TreeMap<String, object> LoadedTools = new TreeMap<String, object>();

        public static void Init() {
            String path = Path.Combine( Application.StartupPath, "tool" );
            if ( !Directory.Exists( path ) ) {
                return;
            }

            FileInfo[] files = new DirectoryInfo( path ).GetFiles( "*.txt" );
            foreach ( FileInfo file in files ) {
                String code = "";
                using ( StreamReader sr = new StreamReader( file.FullName ) ){
                    code += sr.ReadToEnd();
                }
                CompilerResults results = AppManager.compileScript( code );
                if ( results == null ) {
                    continue;
                }
                Assembly asm = null;
                try {
                    asm = results.CompiledAssembly;
                } catch ( Exception ex ) {
                    continue;
                }
                foreach ( Type t in asm.GetTypes() ) {
                    if ( t.IsClass && t.IsPublic && !t.IsAbstract && t.GetInterface( typeof( IPaletteTool ).FullName ) != null ) {
                        try {
#if DEBUG
                            AppManager.debugWriteLine( "t.FullName=" + t.FullName );
#endif
                            object instance = asm.CreateInstance( t.FullName );
                            String dir = Path.Combine( AppManager.getApplicationDataPath(), "tool" );
                            String cfg = Path.GetFileNameWithoutExtension( file.FullName ) + ".config";
                            String config = Path.Combine( dir, cfg );
                            if ( PortUtil.isFileExists( config ) ) {
                                XmlStaticMemberSerializer xsms = new XmlStaticMemberSerializer( instance.GetType() );
                                using ( FileStream fs = new FileStream( config, FileMode.Open ) ) {
                                    xsms.Deserialize( fs );
                                }
                            }
                            String id = Path.GetFileNameWithoutExtension( file.FullName );
                            LoadedTools.put( id, instance );
#if DEBUG
                            AppManager.debugWriteLine( "PaletteToolServer.Init; id=" + id );
#endif
                        } catch {
                        }
                    }
                }
            }
        }

        public static boolean InvokePaletteTool( String id, int track, int[] vsq_event_intrenal_ids, MouseButtons button ) {
            if ( LoadedTools.containsKey( id ) ) {
                VsqTrack item = (VsqTrack)AppManager.getVsqFile().Track.get( track ).clone();
                boolean edited = false;
                try {
                    edited = ((IPaletteTool)LoadedTools.get( id )).edit( item, vsq_event_intrenal_ids, button );
                } catch ( Exception ex ) {
#if DEBUG
                    PortUtil.println( "PaletteToolServer#InvokePaletteTool; ex=" + ex );
#endif
                    edited = false;
                }
                if ( edited ) {
                    CadenciiCommand run = VsqFileEx.generateCommandTrackReplace( track, item, AppManager.getVsqFile().AttachedCurves.get( track - 1 ) );
                    AppManager.register( AppManager.getVsqFile().executeCommand( run ) );
                }
                return edited;
            } else {
                return false;
            }
        }
    }

}
#endif
