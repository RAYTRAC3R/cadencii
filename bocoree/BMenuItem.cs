﻿/*
 * BMenuItem.cs
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
//INCLUDE ..\BuildJavaUI\src\org\kbinani\windows\forms\BMenuItem.java
#else
#define ABSTRACT_BUTTON_ENABLE_IS_SELECTED
#define COMPONENT_PARENT_AS_OWNERITEM
#define COMPONENT_ENABLE_TOOL_TIP_TEXT
using System.Collections.Generic;
using System.Windows.Forms;
using bocoree.javax.swing;

namespace bocoree.windows.forms {
    public class BMenuItem : System.Windows.Forms.ToolStripMenuItem, MenuElement {
        // root implementation of javax.swing.AbstractButton
        #region javax.swing.AbstractButton
        // root implementation of javax.swing.AbstractButton is in BMenuItem.cs
        public string getText() {
            return base.Text;
        }

        public void setText( string value ) {
            base.Text = value;
        }
#if ABSTRACT_BUTTON_ENABLE_IS_SELECTED
        public bool isSelected() {
            return base.Checked;
        }

        public void setSelected( bool value ) {
            base.Checked = value;
        }
#endif
        public bocoree.java.awt.Icon getIcon() {
            bocoree.java.awt.Icon ret = new bocoree.java.awt.Icon();
            ret.image = base.Image;
            return ret;
        }

        public void setIcon( bocoree.java.awt.Icon value ) {
            if ( value == null ) {
                base.Image = null;
            } else {
                base.Image = value.image;
            }
        }
        #endregion

        #region java.awt.Component
        public bool isVisible() {
            return base.Visible;
        }

        public void setVisible( bool value ) {
            base.Visible = value;
        }

#if COMPONENT_ENABLE_TOOL_TIP_TEXT
        public void setToolTipText( string value ) {
            base.ToolTipText = value;
        }

        public string getToolTipText() {
            return base.ToolTipText;
        }
#endif

#if COMPONENT_PARENT_AS_OWNERITEM
        public object getParent() {
            return base.OwnerItem;
        }
#else
        public object getParent(){
            return base.Parent;
        }
#endif

        public string getName() {
            return base.Name;
        }

        public void setName( string value ) {
            base.Name = value;
        }

#if COMPONENT_ENABLE_LOCATION
        public bocoree.java.awt.Point getLocation()
        {
            System.Drawing.Point loc = this.Location;
            return new bocoree.java.awt.Point( loc.X, loc.Y );
        }

        public void setLocation( int x, int y )
        {
            base.Location = new System.Drawing.Point( x, y );
        }

        public void setLocation( bocoree.java.awt.Point p )
        {
            base.Location = new System.Drawing.Point( p.x, p.y );
        }
#endif

        public bocoree.java.awt.Rectangle getBounds() {
            System.Drawing.Rectangle r = base.Bounds;
            return new bocoree.java.awt.Rectangle( r.X, r.Y, r.Width, r.Height );
        }

#if COMPONENT_ENABLE_X
        public int getX()
        {
            return base.Left;
        }
#endif

#if COMPONENT_ENABLE_Y
        public int getY()
        {
            return base.Top;
        }
#endif

        public int getWidth() {
            return base.Width;
        }

        public int getHeight() {
            return base.Height;
        }

        public bocoree.java.awt.Dimension getSize() {
            return new bocoree.java.awt.Dimension( base.Size.Width, base.Size.Height );
        }

        public void setSize( int width, int height ) {
            base.Size = new System.Drawing.Size( width, height );
        }

        public void setSize( bocoree.java.awt.Dimension d ) {
            setSize( d.width, d.height );
        }

        public void setBackground( bocoree.java.awt.Color color ) {
            base.BackColor = System.Drawing.Color.FromArgb( color.getRed(), color.getGreen(), color.getBlue() );
        }

        public bocoree.java.awt.Color getBackground() {
            return new bocoree.java.awt.Color( base.BackColor.R, base.BackColor.G, base.BackColor.B );
        }

        public void setForeground( bocoree.java.awt.Color color ) {
            base.ForeColor = color.color;
        }

        public bocoree.java.awt.Color getForeground() {
            return new bocoree.java.awt.Color( base.ForeColor.R, base.ForeColor.G, base.ForeColor.B );
        }

        public void setFont( bocoree.java.awt.Font font ) {
            base.Font = font.font;
        }

        public bool getEnabled() {
            return base.Enabled;
        }

        public void setEnabled( bool value ) {
            base.Enabled = value;
        }
        #endregion

        #region javax.swing.MenuElement
        public MenuElement[] getSubElements() {
            List<MenuElement> list = new List<MenuElement>();
            foreach ( ToolStripItem item in base.DropDownItems ) {
                if ( item is MenuElement ) {
                    list.Add( (MenuElement)item );
                }
            }
            return list.ToArray();
        }
        #endregion

        public bool isCheckOnClick() {
            return base.CheckOnClick;
        }

        public void setCheckOnClick( bool value ) {
            base.CheckOnClick = value;
        }

        public KeyStroke getAccelerator() {
            KeyStroke ret = KeyStroke.getKeyStroke( 0, 0 );
            ret.keys = base.ShortcutKeys;
            return ret;
        }

        public void setAccelerator( KeyStroke stroke ) {
            base.ShortcutKeys = stroke.keys;
        }

        public void add( ToolStripItem item ) {
            base.DropDownItems.Add( item );
        }

        public void addSeparator() {
            base.DropDownItems.Add( new ToolStripSeparator() );
        }

        public void removeAll() {
            base.DropDownItems.Clear();
        }

        public void setTag( object value ) {
            base.Tag = value;
        }

        public object getTag() {
            return base.Tag;
        }
    }
}
#endif
