import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;

public class Socket {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        //����һ��ServerSocket�����ڼ����ͻ���Socket����������
		ServerSocket ss = new ServerSocket();
		//����ѭ�����Ͻ������Կͻ��˵�����
		while(true){
			java.net.Socket s = ss.accept();
			OutputStream os = s.getOutputStream();
			os.write("���ã����յ��˷���������Ϣ��\n".getBytes("utf-8"));
			os.close();
			s.close();
		}
		
	}

}
