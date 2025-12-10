package io.quassar.editor.box.util;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageResizer {

    public static void resizeImage(File inputFile, int height, File outputFile) throws IOException {
        BufferedImage originalImage = ImageIO.read(inputFile);
        int originalWidth = originalImage.getWidth();
        int originalHeight = originalImage.getHeight();
        int targetWidth = (height * originalWidth) / originalHeight;
        resizeImage(originalImage, targetWidth, height, outputFile);
    }

    public static void resizeImage(File inputFile, int width, int height, File outputFile) throws IOException {
        resizeImage(ImageIO.read(inputFile), width, height, outputFile);
    }

    public static void resizeImage(BufferedImage originalImage, int width, int height, File outputFile) throws IOException {
        Image scaledImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(width, height, originalImage.getType());

        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(scaledImage, 0, 0, null);
        g2d.dispose();

        ImageIO.write(resizedImage, "png", outputFile);
    }

}