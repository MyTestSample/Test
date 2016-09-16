import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;

public class Socket {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        //创建一个ServerSocket，用于监听客户端Socket的连接请求
		ServerSocket ss = new ServerSocket();
		//采用循环不断接收来自客户端的请求
		while(true){
			java.net.Socket s = ss.accept();
			OutputStream os = s.getOutputStream();
			os.write("您好，您收到了服务器的信息！\n".getBytes("utf-8"));
			os.close();
			s.close();
		}
		
	}

}
