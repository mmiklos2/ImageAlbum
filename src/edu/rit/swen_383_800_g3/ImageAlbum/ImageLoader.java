/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.rit.swen_383_800_g3.ImageAlbum;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import javax.imageio.ImageIO;

/**
 *
 * @author G3
 */
public class ImageLoader {
    private ArrayList images;
    private String type;
    private String sourceName;
    
    public ImageLoader(){
    }
    public void getType(){
        int i = sourceName.lastIndexOf('.');       
        if (i > 0) {
            type = sourceName.substring(i+1);
        }
    }
    public void getDir(){
    }
    
       public void getURL(){
      images= new ArrayList<Image>();
      BufferedImage image=null;
      try{
      String stringo="https://pbs.twimg.com/profile_images/758084549821730820/_HYHtD8F.jpg";
      URL url= new URL(stringo);
      image= ImageIO.read(url);
      String str= stringo.substring(stringo.lastIndexOf('/'));
      File file= new File("media/"+str);
      ImageIO.write(image, "JPG", file);
      }catch(IOException ioe){
          ioe.printStackTrace();
      
    }
    }
}