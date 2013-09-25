/*
 * VsqEvent.cs
 * Copyright © 2008-2011 kbinani
 *
 * This file is part of cadencii.vsq.
 *
 * cadencii.vsq is free software; you can redistribute it and/or
 * modify it under the terms of the BSD License.
 *
 * cadencii.vsq is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 */
#if JAVA
package cadencii.vsq;

import java.io.*;
import java.util.*;
import cadencii.*;
#else
using System;
using cadencii;
using cadencii.java.util;
using cadencii.java.io;

namespace cadencii.vsq
{
    using boolean = System.Boolean;
#endif

    /// <summary>
    /// vsqファイルのメタテキスト内に記述されるイベント。
    /// </summary>
#if JAVA
    public class VsqEvent implements Comparable<VsqEvent>, Cloneable, Serializable
#else
    [Serializable]
    public class VsqEvent : IComparable<VsqEvent>, ICloneable
#endif
    {
        public String Tag;
        /// <summary>
        /// 内部で使用するインスタンス固有のID
        /// </summary>
        public int InternalID;
        public int Clock;
        public VsqID ID;
        public UstEvent UstEvent = new UstEvent();

        public boolean equals( VsqEvent item )
        {
            if ( this.Clock != item.Clock ) {
                return false;
            }
            if ( this.ID.type != item.ID.type ) {
                return false;
            }
            if ( this.ID.type == VsqIDType.Anote ) {
                #region 音符の比較
                if ( this.ID.Note != item.ID.Note ) return false;
                if ( this.ID.getLength() != item.ID.getLength() ) return false;
                if ( this.ID.d4mean != item.ID.d4mean ) return false;
                if ( this.ID.DEMaccent != item.ID.DEMaccent ) return false;
                if ( this.ID.DEMdecGainRate != item.ID.DEMdecGainRate ) return false;
                if ( this.ID.Dynamics != item.ID.Dynamics ) return false;
                if ( this.ID.LyricHandle == null && item.ID.LyricHandle != null ) return false;
                if ( this.ID.LyricHandle != null && item.ID.LyricHandle == null ) return false;
                if ( this.ID.LyricHandle != null && item.ID.LyricHandle != null ) {
                    if ( !this.ID.LyricHandle.L0.equalsForSynth( item.ID.LyricHandle.L0 ) ) return false;
                    int count = this.ID.LyricHandle.Trailing.size();
                    if ( count != item.ID.LyricHandle.Trailing.size() ) return false;
                    for ( int k = 0; k < count; k++ ) {
                        if ( !this.ID.LyricHandle.Trailing.get( k ).equalsForSynth( item.ID.LyricHandle.Trailing.get( k ) ) ) return false;
                    }
                }
                if ( this.ID.NoteHeadHandle == null && item.ID.NoteHeadHandle != null ) return false;
                if ( this.ID.NoteHeadHandle != null && item.ID.NoteHeadHandle == null ) return false;
                if ( this.ID.NoteHeadHandle != null && item.ID.NoteHeadHandle != null ) {
                    if ( !this.ID.NoteHeadHandle.IconID.Equals( item.ID.NoteHeadHandle.IconID ) ) return false;
                    if ( this.ID.NoteHeadHandle.getDepth() != item.ID.NoteHeadHandle.getDepth() ) return false;
                    if ( this.ID.NoteHeadHandle.getDuration() != item.ID.NoteHeadHandle.getDuration() ) return false;
                    if ( this.ID.NoteHeadHandle.getLength() != item.ID.NoteHeadHandle.getLength() ) return false;
                }
                if ( this.ID.PMBendDepth != item.ID.PMBendDepth ) return false;
                if ( this.ID.PMBendLength != item.ID.PMBendLength ) return false;
                if ( this.ID.PMbPortamentoUse != item.ID.PMbPortamentoUse ) return false;
                if ( this.ID.pMeanEndingNote != item.ID.pMeanEndingNote ) return false;
                if ( this.ID.pMeanOnsetFirstNote != item.ID.pMeanOnsetFirstNote ) return false;
                VibratoHandle hVibratoThis = this.ID.VibratoHandle;
                VibratoHandle hVibratoItem = item.ID.VibratoHandle;
                if ( hVibratoThis == null && hVibratoItem != null ) return false;
                if ( hVibratoThis != null && hVibratoItem == null ) return false;
                if ( hVibratoThis != null && hVibratoItem != null ) {
                    if ( this.ID.VibratoDelay != item.ID.VibratoDelay ) return false;
                    if ( !hVibratoThis.IconID.Equals( hVibratoItem.IconID ) ) return false;
                    if ( hVibratoThis.getStartDepth() != hVibratoItem.getStartDepth() ) return false;
                    if ( hVibratoThis.getStartRate() != hVibratoItem.getStartRate() ) return false;
                    VibratoBPList vibRateThis = hVibratoThis.getRateBP();
                    VibratoBPList vibRateItem = hVibratoItem.getRateBP();
                    if ( vibRateThis == null && vibRateItem != null ) return false;
                    if ( vibRateThis != null && vibRateItem == null ) return false;
                    if ( vibRateThis != null && vibRateItem != null ) {
                        int numRateCount = vibRateThis.getCount();
                        if ( numRateCount != vibRateItem.getCount() ) return false;
                        for ( int k = 0; k < numRateCount; k++ ) {
                            VibratoBPPair pThis = vibRateThis.getElement( k );
                            VibratoBPPair pItem = vibRateItem.getElement( k );
                            if ( pThis.X != pItem.X ) return false;
                            if ( pThis.Y != pItem.Y ) return false;
                        }
                    }
                    VibratoBPList vibDepthThis = hVibratoThis.getDepthBP();
                    VibratoBPList vibDepthItem = hVibratoItem.getDepthBP();
                    if ( vibDepthThis == null && vibDepthItem != null ) return false;
                    if ( vibDepthThis != null && vibDepthItem == null ) return false;
                    if ( vibDepthThis != null && vibDepthItem != null ) {
                        int numDepthCount = vibDepthThis.getCount();
                        if ( numDepthCount != vibDepthItem.getCount() ) return false;
                        for ( int k = 0; k < numDepthCount; k++ ) {
                            VibratoBPPair pThis = vibDepthThis.getElement( k );
                            VibratoBPPair pItem = vibDepthItem.getElement( k );
                            if ( pThis.X != pItem.X ) return false;
                            if ( pThis.Y != pItem.Y ) return false;
                        }
                    }
                }
                if ( this.ID.vMeanNoteTransition != item.ID.vMeanNoteTransition ) return false;
                #endregion
            } else if ( this.ID.type == VsqIDType.Singer ) {
                #region シンガーイベントの比較
                if ( this.ID.IconHandle.Program != item.ID.IconHandle.Program ) return false;
                #endregion
            } else if ( this.ID.type == VsqIDType.Aicon ) {
                if ( !this.ID.IconDynamicsHandle.IconID.Equals( item.ID.IconDynamicsHandle.IconID ) ) return false;
                if ( this.ID.IconDynamicsHandle.isDynaffType() ) {
                    // 強弱記号
                } else {
                    // クレッシェンド・デクレッシェンド
                    if ( this.ID.getLength() != item.ID.getLength() ) return false;
                }
            }

            return true;
        }

        /// <summary>
        /// インスタンスをテキストファイルに出力します
        /// </summary>
        /// <param name="sw">出力先</param>
        public void write( ITextWriter sw )
#if JAVA
            throws IOException
#endif
        {
            Vector<String> def = new Vector<String>( new String[]{ "Length",
                                                                   "Note#",
                                                                   "Dynamics",
                                                                   "PMBendDepth",
                                                                   "PMBendLength",
                                                                   "PMbPortamentoUse",
                                                                   "DEMdecGainRate",
                                                                   "DEMaccent" } );
            write( sw, def );
        }

        public void write( ITextWriter writer, Vector<String> print_targets )
#if JAVA
            throws IOException
#endif
        {
            writeCor( writer, print_targets );
        }

        public void write( BufferedWriter writer, Vector<String> print_targets )
#if JAVA
            throws IOException
#endif
        {
            writeCor( new WrappedStreamWriter( writer ), print_targets );
        }

        private void writeCor( ITextWriter writer, Vector<String> print_targets )
#if JAVA
            throws IOException
#endif
        {
            writer.writeLine( "[ID#" + PortUtil.formatDecimal( "0000", ID.value ) + "]" );
            writer.writeLine( "Type=" + ID.type );
            if ( ID.type == VsqIDType.Anote ) {
                if ( print_targets.contains( "Length" ) ) writer.writeLine( "Length=" + ID.getLength() );
                if ( print_targets.contains( "Note#" ) ) writer.writeLine( "Note#=" + ID.Note );
                if ( print_targets.contains( "Dynamics" ) ) writer.writeLine( "Dynamics=" + ID.Dynamics );
                if ( print_targets.contains( "PMBendDepth" ) ) writer.writeLine( "PMBendDepth=" + ID.PMBendDepth );
                if ( print_targets.contains( "PMBendLength" ) ) writer.writeLine( "PMBendLength=" + ID.PMBendLength );
                if ( print_targets.contains( "PMbPortamentoUse" ) ) writer.writeLine( "PMbPortamentoUse=" + ID.PMbPortamentoUse );
                if ( print_targets.contains( "DEMdecGainRate" ) ) writer.writeLine( "DEMdecGainRate=" + ID.DEMdecGainRate );
                if ( print_targets.contains( "DEMaccent" ) ) writer.writeLine( "DEMaccent=" + ID.DEMaccent );
                if ( print_targets.contains( "PreUtterance" ) ) writer.writeLine( "PreUtterance=" + UstEvent.getPreUtterance() );
                if ( print_targets.contains( "VoiceOverlap" ) ) writer.writeLine( "VoiceOverlap=" + UstEvent.getVoiceOverlap() );
                if ( ID.LyricHandle != null ) {
                    writer.writeLine( "LyricHandle=h#" + PortUtil.formatDecimal( "0000", ID.LyricHandle_index ) );
                }
                if ( ID.VibratoHandle != null ) {
                    writer.writeLine( "VibratoHandle=h#" + PortUtil.formatDecimal( "0000", ID.VibratoHandle_index ) );
                    writer.writeLine( "VibratoDelay=" + ID.VibratoDelay );
                }
                if ( ID.NoteHeadHandle != null ) {
                    writer.writeLine( "NoteHeadHandle=h#" + PortUtil.formatDecimal( "0000", ID.NoteHeadHandle_index ) );
                }
            } else if ( ID.type == VsqIDType.Singer ) {
                writer.writeLine( "IconHandle=h#" + PortUtil.formatDecimal( "0000", ID.IconHandle_index ) );
            } else if ( ID.type == VsqIDType.Aicon ) {
                writer.writeLine( "IconHandle=h#" + PortUtil.formatDecimal( "0000", ID.IconHandle_index ) );
                writer.writeLine( "Note#=" + ID.Note );
            }
        }

        /// <summary>
        /// このオブジェクトのコピーを作成します
        /// </summary>
        /// <returns></returns>
        public Object clone()
        {
            VsqEvent ret = new VsqEvent( Clock, (VsqID)ID.clone() );
            ret.InternalID = InternalID;
            if ( UstEvent != null ) {
                ret.UstEvent = (UstEvent)UstEvent.clone();
            }
            ret.Tag = Tag;
            return ret;
        }

#if !JAVA
        public object Clone()
        {
            return clone();
        }
#endif

#if !JAVA
        public int CompareTo( VsqEvent item )
        {
            return compareTo( item );
        }
#endif

        public int compareTo( VsqEvent item )
        {
            int ret = this.Clock - item.Clock;
            if ( ret == 0 ) {
                if ( this.ID != null && item.ID != null ) {
#if JAVA
                    return this.ID.type.ordinal() - item.ID.type.ordinal();
#else
                    return (int)this.ID.type - (int)item.ID.type;
#endif
                } else {
                    return ret;
                }
            } else {
                return ret;
            }
        }

        public VsqEvent( String line )
        {
            String[] spl = PortUtil.splitString( line, new char[] { '=' } );
            Clock = int.Parse( spl[0] );
            if ( spl[1].Equals( "EOS" ) ) {
                ID = VsqID.EOS;
            }
        }

#if JAVA
        public VsqEvent(){
            this( 0, new VsqID() );
#else
        public VsqEvent()
            : this( 0, new VsqID() )
        {
#endif
        }

        public VsqEvent( int clock, VsqID id /*, int internal_id*/ )
        {
            Clock = clock;
            ID = id;
            //InternalID = internal_id;
            InternalID = 0;
        }
    }

#if !JAVA
}
#endif
