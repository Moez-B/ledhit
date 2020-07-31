package ledhit.arduino;

import com.fazecast.jSerialComm.SerialPort;

import arduino.Arduino;

public class SerialConnection {
	
	SerialPort port;
	
	public SerialConnection() {
		this.port = SerialPort.getCommPort("/dev/tty.usbmodem14201");
		this.port.setComPortParameters(9600, 8, 1, 0);
		this.port.setComPortTimeouts(SerialPort.TIMEOUT_WRITE_BLOCKING,0 ,0);
	}
	
	public void flicker() {
		this.port.openPort();
		this.port.closePort();
	}
	
}
