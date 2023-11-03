package src;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamResolution;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
     Webcam webcam=Webcam.getDefault();

     for (Dimension dimension:webcam.getViewSizes()){
         System.out.println(dimension);
     }

     webcam.setViewSize(WebcamResolution.VGA.getSize());
     webcam.open();
        ImageIO.write(webcam.getImage(),"PNG",new File("Webcam1.png"));
        webcam.close();

    }
}
