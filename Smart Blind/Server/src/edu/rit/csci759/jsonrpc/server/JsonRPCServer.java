package edu.rit.csci759.jsonrpc.server;


import java.io.IOException;
import java.net.ServerSocket;

public class JsonRPCServer extends Thread {
	/**
	 * The port that the server listens on.
	 */
	private static final int PORT = 8080;
	public static ServerSocket serverSocket;

	JsonRPCServer() {
		System.out.println("lalala");
	}
	
	public void run() {
		System.out.println("Starting TCP Server...");
		try {
			serverSocket = new ServerSocket(PORT);

			while(true) {
				System.out.print("asasas");
				new ExecutionThread(serverSocket.accept()).start();
				System.out.println("Connection Eastablished");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}  
	}
}