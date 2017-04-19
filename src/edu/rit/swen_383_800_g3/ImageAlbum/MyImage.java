/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rit.swen_383_800_g3.ImageAlbum;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import javax.imageio.ImageIO;

/**
 *
 * @author G3
 */
public class MyImage {
    private ArrayList<String> labels;
    private String fileName;
    private BufferedImage img;
    
    
    public MyImage(String fileName){
        try {
            img=ImageIO.read(new File(fileName));
        } catch (IOException ex) {
            //Logger.getLogger(AlbumImage.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        Path p=Paths.get(fileName);
        this.fileName=p.getFileName().toString();
    }
    public BufferedImage getImage(){
        return img;
    }
    public String getFileName(){
        return fileName;
    }
    public ArrayList<String> getLabels(){
        return labels;
    }
    public void removeLabels(String label){
        if(labels.contains(label))
            labels.remove(label);
    }
    public void addLabel(String label){
        labels.add(label);
    }
}