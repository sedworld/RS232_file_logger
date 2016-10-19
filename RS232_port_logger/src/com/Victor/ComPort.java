package com.Victor;

import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;


public class ComPort {
    private SerialPort serialPort = null;

    public ComPort(String port) {
        serialPort = new SerialPort(port);

    }

    public boolean open(String port, int baud) {
        try {
            serialPort.openPort();
            serialPort.setParams(baud, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            serialPort.setEventsMask(SerialPort.MASK_RXCHAR);

        } catch (SerialPortException ex) {
            System.out.println("Error: " + ex);
            return false;
        }
        return true;
    }




    public void getPortList(String[] ports) {
        String[] portNames = SerialPortList.getPortNames();
        for (int i = 0; i < portNames.length; i++) {
            ports[i] = portNames[i];
            System.out.println("debug. com port: " + portNames[i]);
        }
    }
}
