package main.rrays.Socket.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Server2 {
    public static void main(String[] args) throws IOException {
        //创建serversocket,对象
        ServerSocket serverSocket = new ServerSocket(10087);
        //获取服务瑞的套接字对象
        Socket server = serverSocket.accept();
        //-------------------接受客户端的输入---------------------------
        //获取输入流对象
        InputStream inputStream = server.getInputStream();
        byte[] buf = new byte[1024];
        int length = inputStream.read(buf);
        System.out.println("客户端传输的数据是" +  new String(buf,0,length));
        //-------------------返回客户端的数据---------------------------
        OutputStream outputStream = server.getOutputStream();
        outputStream.write("收到消息".getBytes(StandardCharsets.UTF_8));
        //关闭流
        outputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();



    }
}
