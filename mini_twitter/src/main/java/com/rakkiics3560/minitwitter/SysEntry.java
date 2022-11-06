/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rakkiics3560.minitwitter;
import javax.swing.tree.TreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * User/Group entries in the Mini Twitter system.
 * Composite Pattern
 * @author Rakkii
 */
public interface SysEntry extends Visitable {
    public String getDisplayName();
    // TODO something something tree node jtree
}
