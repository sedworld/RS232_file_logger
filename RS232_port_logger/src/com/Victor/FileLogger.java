package com.Victor;

import android.os.Environment;
import android.util.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Created by Victor on 19.10.2016.
 */

/*
если надо считать содержание файла, то применяется поток ввода, а если надо записать в файл - то поток вывода.
 */

public class FileLogger {
    private String fileName;

    public FileLogger(String fileName) {
        this.fileName = fileName;
    }






    public void write (byte[] command){




//        if () {
//            System.out.println( "Memory not mounted");
//            return;
//        }


//        if (!file.getParentFile().exists()) {
//            file.getParentFile().mkdirs();
//            System.out.println( "File not found. Create...: " + file.getAbsolutePath() + "\n");
//        }
//        System.out.println( "File cheked: " + file.getAbsolutePath() + "\n");

        File file = new File("D:\\Desktop\\GenerateFolder\\log_file.txt");

        if(file == null || !file.isFile()){
            System.out.println("Wrong filepath");

        }

        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        FileOutputStream toFile = null;

        try {
            toFile = new FileOutputStream(file, true);
            System.out.println( "New data tread with file: " + toFile.getAbsolutePath() + "With Append");

            toFile.write(command);
            System.out.println( "File wrire: " + Arrays.toString(command) + "\n");

            toFile.flush();
            System.out.println( "File flush..");

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println( "toFile exception: " + ex.toString());

        } finally {
            try {
                toFile.close();
                System.out.println( "File close if finnaly. Total space: " + file.getTotalSpace() + "\n");

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void read (byte[] command){


    }

    /*
                                            //wrire to file
    InputStream
            ByteArrayInputStream
    */
    /*
                                        //wrie array to file
    OutputStream
            ByteArrayOutputStream
    Методы класса:

    int close() - закрывает выходной поток. Следующие попытки записи передадут исключение IOException
    void flush() - финализирует выходное состояние, очищая все буферы вывода
    abstract void write (int oneByte) - записывает единственный байт в выходной поток
    void write (byte[] buffer) - записывает полный массив байтов в выходной поток
    void write (byte[] buffer, int offset, int count) - записывает диапазон из count байт из массива, начиная с смещения offset
     */



}
