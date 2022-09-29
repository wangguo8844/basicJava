package main.rrays.Socket.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        //服务端需要使用serversocket.来开放本地的端口
        ServerSocket serverSocket = new ServerSocket(10086);
        //需要接受client传输过来的数据，需要定义socket对象
        Socket server = serverSocket.accept();
        InputStream inputStream = server.getInputStream();
        //对输入流做包装，包装DataInputstream
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String s = dataInputStream.readUTF();
        System.out.println(s);
        //关闭所有的流操作
        dataInputStream.close();
        inputStream.close();
        server.close();
        serverSocket.close();

    }
}
