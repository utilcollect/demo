package com.gezhiwei.demo;

import org.junit.Test;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.text.DecimalFormat;

/**
 * @ClassName: DriverTest
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/7 16:06
 * @modified By:
 */
public class DriverTest {
    public static String FormetFileSize(long fileS) {
        DecimalFormat df = new DecimalFormat("#.00");
        String fileSizeString = "";
        if (fileS < 1024) {
            fileSizeString = df.format((double) fileS) + "B";
        } else if (fileS < 1048576) {
            fileSizeString = df.format((double) fileS / 1024) + "K";
        } else if (fileS < 1073741824) {
            fileSizeString = df.format((double) fileS / 1048576) + "M";
        } else {
            fileSizeString = df.format((double) fileS / 1073741824) + "G";
        }
        return fileSizeString;
    }

    /**
     * 获取硬盘的每个盘符
     */
    public static void driver(){
        // 当前文件系统类
        FileSystemView fsv = FileSystemView.getFileSystemView();
        // 列出所有windows 磁盘
        File[] fs = File.listRoots();
        // 显示磁盘卷标
        for (int i = 0; i < fs.length; i++) {
            System.out.println(fsv.getSystemDisplayName(fs[i]));
//            System.out.print("总大小" + FormetFileSize(fs[i].getTotalSpace()));
//            System.out.println("剩余" + FormetFileSize(fs[i].getFreeSpace()));
        }
    }

    @Test
    public void testDriver(){
        driver();
    }

    @Test
    public void testFile() {
        File[] files = File.listRoots();
        for (File file : files) {
            if (file.isDirectory() && file.getAbsolutePath().equalsIgnoreCase("c:\\")) {
                System.out.println("asdfasdf");
            }
            System.out.println("sdf");
        }
    }
}
