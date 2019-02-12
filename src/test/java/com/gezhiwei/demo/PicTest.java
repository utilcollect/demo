package com.gezhiwei.demo;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

import java.io.File;
import java.io.InputStream;

import static org.bytedeco.javacpp.opencv_core.NORM_L2;
import static org.opencv.core.CvType.CV_32FC1;
import static org.opencv.core.CvType.CV_8U;

/**
 * @ClassName: PicTest
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/2/11 18:03
 * @modified By:
 */
public class PicTest {

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

        //读取模板
        Mat templ = Imgcodecs.imread("C:\\Users\\gezhiwei\\Desktop\\范冰冰模板.png");
        Mat pic = Imgcodecs.imread("C:\\Users\\gezhiwei\\Downloads\\20141024210001_CGYeN.jpeg");

        Mat result = new Mat();

        int result_cols = pic.cols() - templ.cols() + 1;
        int result_rows = pic.rows() - templ.rows() + 1;
        result.create(result_cols, result_rows, CV_32FC1);

        Imgproc.matchTemplate(pic, templ, result, CV_8U);

        Core.normalize(result, result, 0, 1, NORM_L2, -1, new Mat());

        double minVal = -1;
        double maxVal = 0;
        Point minLoc = null;
        Point maxLoc = null;

        Core.MinMaxLocResult minMaxLocResult = Core.minMaxLoc(result);

        System.out.println(minMaxLocResult.minVal);


    }
}
