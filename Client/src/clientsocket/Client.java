/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientsocket;

/**
 *
 * @author bini.alessio
 */
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("10.205.0.64", 5555);

        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        Scanner tastiera = new Scanner(System.in);

        while(true){
        System.out.print("Client: ");
        out.writeUTF(tastiera.nextLine());

        System.out.println("Server: " + in.readUTF());

        }
    }
}