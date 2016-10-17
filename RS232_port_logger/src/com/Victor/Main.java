package com.Victor;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;


public class Main {

ComPort comPort;


    public static void main(String[] args) {

        ComPort comPort = new ComPort("COM2");

        comPort.getPortList();

        comPort.open();

    }


}
