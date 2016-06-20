package com.daksa.jainsip.video;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 *
 * @author salman
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Webcam webcam = Webcam.getDefault();
		Webcam.setAutoOpenMode(true);
		Dimension dimension = new Dimension(640, 480);
		webcam.setViewSize(dimension);
		SingleVideoDisplayWindow displayWindow = new SingleVideoDisplayWindow("Stream example", dimension);

		BufferedImage image;
		while (true) {
			image = webcam.getImage();
			displayWindow.setVisible(true);
			displayWindow.updateImage(image);
		}
	}
}
