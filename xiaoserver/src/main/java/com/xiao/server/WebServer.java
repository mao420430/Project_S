package com.xiao.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static final int PORT = 2333;
    public WebServer() {
        ServerSocket serverSocket;
        Socket socket;
        try {
            serverSocket = new ServerSocket(PORT);
        }
        catch (Exception e){
            e.printStackTrace();
            return;
        }

        while (true){
            try {
                socket = serverSocket.accept();
                System.out.println("\n\naccept...");

                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = br.readLine();
                System.out.println("message:"+message);


            }
            catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
