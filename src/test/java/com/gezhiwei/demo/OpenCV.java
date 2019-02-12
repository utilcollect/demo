package com.gezhiwei.demo;

import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

import java.io.File;
import java.io.InputStream;

/**
 * @ClassName: OpenCV
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/2/11 15:55
 * @modified By:
 */
public class OpenCV {

    private static void loadLibraries() {

        try {
            InputStream in = null;
            File fileOut = null;
            String osName = System.getProperty("os.name");
            String opencvpath = "C:\\opencv\\build\\java";
            if (osName.startsWith("Windows")) {
                int bitness = Integer.parseInt(System.getProperty("sun.arch.data.model"));
                if (bitness == 32) {
                    opencvpath = opencvpath + "\\x86\\";
                } else if (bitness == 64) {
                    opencvpath = opencvpath + "\\x64\\";
                } else {
                    opencvpath = opencvpath + "\\x86\\";
                }
            } else if (osName.equals("Mac OS X")) {
                opencvpath = opencvpath + "Your path to .dylib";
            }
            System.out.println(opencvpath);
            System.load(opencvpath + Core.NATIVE_LIBRARY_NAME + ".dll");
        } catch (Exception e) {
            throw new RuntimeException("Failed to load opencv native library", e);
        }
    }

    public static void main(String[] args) {

        loadLibraries();


        System.out.println("sdf");
        System.out.println("Hello, OpenCV");
        // Load the native library.
        new OpenCV().run();

    }

    public void run() {
        System.out.println("\nRunning DetectFaceDemo");
        // Create a face detector from the cascade file in the resources
        // directory.

        String templateFilePath = "C:\\Users\\gezhiwei\\Downloads\\s\\mmexport1537330794444.jpg";
        String originalFilePath = "C:\\Users\\gezhiwei\\Downloads\\s\\mmexport1537330798654.jpg";
        String originalFilePath1 = "C:\\Users\\gezhiwei\\Downloads\\s\\mmexport1537330871815.jpg";
        //读取图片文件
        Mat image = Imgcodecs.imread(originalFilePath1);
//        Mat image = Imgcodecs.imread(originalFilePath);

        File ff = new File("E:\\open_sources\\opencv\\data\\haarcascades\\haarcascade_lowerbody.xml");
        CascadeClassifier faceDetector = new CascadeClassifier(ff.getAbsolutePath());
//        Mat image = Imgcodecs.imread(getClass().getResource("/lena.png").getPath());
        // Detect faces in the image.
        // MatOfRect is a special container class for Rect.
        MatOfRect faceDetections = new MatOfRect();
        faceDetector.detectMultiScale(image, faceDetections);
        System.out.println(String.format("Detected %s faces", faceDetections.toArray().length));
        // Draw a bounding box around each face.
        for (Rect rect : faceDetections.toArray()) {
            Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
        }
        // Save the visualized detection.
        String filename = "onss.png";
        System.out.println(String.format("Writing %s", filename));
        Imgcodecs.imwrite(filename, image);
    }
}
