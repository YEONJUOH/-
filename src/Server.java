package kosta.net3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import kosta.net2.ServerReceive;
import kosta.net2.ServerSender;

public class Server {

	
       public Server(){
		ServerSocket server = null;
		Socket socket = null;

		try {

			server = new ServerSocket(9500);
			System.out.println("나는 서버");

			while (true) {
				socket = server.accept();
				Thread thread = new PerClientThread(socket);
				thread.start();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}}


