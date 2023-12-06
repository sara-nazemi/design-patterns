package org.designpatterns.structural.adaptor;

public class Socket {
    public Voltage getVolt() {
        return new Voltage(220);
    }
}

class Voltage {
    private int v;

    public Voltage(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
}

interface VoltageAdaptor {
    Voltage get220Volt();

    Voltage get120Volt();

    Voltage get12Volt();

    Voltage get3Volt();
}

class VoltageAdaptorImpl implements VoltageAdaptor {

    Socket socket;

    public VoltageAdaptorImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public Voltage get220Volt() {
        return socket.getVolt();
    }

    @Override
    public Voltage get120Volt() {
        int v = socket.getVolt().getV(); // convert
        return new Voltage(v - 100);
    }

    @Override
    public Voltage get12Volt() {
        int v = socket.getVolt().getV(); // convert
        return new Voltage(v - 208);
    }

    @Override
    public Voltage get3Volt() {
        int v = socket.getVolt().getV(); // convert
        return new Voltage(v - 217);
    }
}

class Main {
    public static void main(String[] args) {
        VoltageAdaptor adaptor = new VoltageAdaptorImpl(new Socket());
        Voltage volt = adaptor.get120Volt();
        System.out.println(volt.getV());
    }
}