package com.Victor;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;


public class ComPort {
    private static SerialPort serialPort = null;

    public ComPort(String port) {
        serialPort = new SerialPort(port);

    }

    public void open(){
        try {
            serialPort.openPort();
            serialPort.setParams(SerialPort.BAUDRATE_57600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            serialPort.setEventsMask(SerialPort.MASK_RXCHAR);

        }
        catch (SerialPortException ex) {
            System.out.println(ex);
        }
    }




    void getPortList() {
        String[] portNames = SerialPortList.getPortNames();
        for (int i = 0; i < portNames.length; i++) {
            System.out.println(portNames[i]);
        }
    }
}
