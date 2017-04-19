/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rit.swen_383_800_g3.ImageAlbum;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author G3
 */
public class Album {
    private ArrayList<MyImage> images;
    public void addImage(MyImage img){
        images.add(img);
    }
    public void removeImage(MyImage img){
        if(images.contains(img))
            images.remove(img);
    }
    public void generateAlbum(String filter){
        
    }
}