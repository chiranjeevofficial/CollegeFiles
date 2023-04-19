package BrahmasmiClasses;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;

public class GetImage {
    public static JLabel getImageOnLabel(String path, int imageWidth) {
        ImageIcon scaledIcon = null;
        try{
            ImageIcon originalImage = new ImageIcon(ImageIO.read(new File(path)));
            int originalWidth = originalImage.getIconWidth();
            int originalHeight = originalImage.getIconHeight();
            int newHeight = (int) (( (double) imageWidth / originalWidth) * originalHeight);
            scaledIcon = new ImageIcon(originalImage.getImage().getScaledInstance(imageWidth, newHeight, java.awt.Image.SCALE_SMOOTH));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return new JLabel(scaledIcon);
    }
}
