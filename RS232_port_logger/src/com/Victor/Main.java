

package com.Victor;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;

import java.util.Scanner;


public class Main {

ComPort comPort = null;
static Scanner scanner = null;


    public static void main(String[] args) {

        System.out.println("Input \"C\" to chek COM Ports list");
        scanner = new Scanner(System.in);


        ComPort comPort = new ComPort("COM2");

        comPort.getPortList();

        comPort.open();

    }

    void setComPort(){




        switch ()
    }

}
