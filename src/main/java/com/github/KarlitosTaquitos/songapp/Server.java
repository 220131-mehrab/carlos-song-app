package com.github.KarlitosTaquitos.songapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket server;
    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("ServerSocket error");
        }
    }

    public void run(SongList songList) {
        while (server.isBound()) {
            try {
                Socket socket = server.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

                out.println("HTTP/1.1 200 Ok");
                out.println();
                out.println("<html><body><ul>");
                for (Song song : songList.songs) {
                    out.println("<li>" + song + "</li>");
                }
                out.println("</ul></body></html>");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Server error");
            }
        }
    }
}