package com.gezhiwei.demo;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

/**
 * @ClassName: Base64Test
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/24 17:58
 * @modified By:
 */
public class Base64Test {

    @Test
    public void test() {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decode = decoder.decode("MjE4");
        System.out.println(new String(decode));

        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encode = encoder.encode("1089172".getBytes());
        System.out.println(new String(encode));

        Base64.Encoder mimeEncoder = Base64.getMimeEncoder();
        byte[] encode1 = mimeEncoder.encode("1089172".getBytes());
        System.out.println(new String(encode1));


        Base64.Encoder urlEncoder = Base64.getUrlEncoder();
        byte[] encode2 = urlEncoder.encode("1089172".getBytes());
        System.out.println(new String(encode2));
    }

    @Test
    public void tewst() throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        Integer[] i = new Integer[]{474, 460, 453, 468, 458, 473, 459, 115, 46, 210, 349, 23, 227, 403, 191, 421, 102, 229, 231, 212, 76, 316, 259, 79, 188, 310, 54, 67, 84, 77, 40, 81, 99, 219, 223, 69, 96, 114, 34, 462, 213, 204, 83, 98, 51, 53, 93};
        for (Integer integer : i) {
            Base64.Encoder encoder = Base64.getEncoder();
            byte[] encode = encoder.encode(integer.toString().getBytes());
            stringBuffer.append(new String(encode)).append(System.lineSeparator());
        }
        File f = new File("C:\\Users\\gezhiwei\\Desktop\\a.txt");
        if (!f.exists()) {
            f.createNewFile();
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(f)) {
            fileOutputStream.write(stringBuffer.toString().getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
