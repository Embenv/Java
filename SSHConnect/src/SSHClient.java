
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
 
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

	/*
	 * Զ�� ִ��������ؽ�����ù��� ��ͬ���ģ�ִ����Ż᷵�أ�
	 * @param host	������
	 * @param user	�û���
	 * @param psw	����
	 * @param port	�˿�
	 * @param command	����
	 * @return
	 */

public class SSHClient {
	public static String exec(String host,String user,String psw,int port,String command){
		String result="";
		Session session =null;
		ChannelExec openChannel =null;
		try {
			JSch jsch=new JSch();
			session = jsch.getSession(user, host, port);
			java.util.Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			session.setConfig(config);
			session.setPassword(psw);
			session.connect();
			openChannel = (ChannelExec) session.openChannel("exec");
			openChannel.setCommand(command);
			int exitStatus = openChannel.getExitStatus();
			System.out.println(exitStatus);
			openChannel.connect();  
            InputStream in = openChannel.getInputStream();  
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));  
            String buf = null;
            while ((buf = reader.readLine()) != null) {
            	result+= new String(buf.getBytes("gbk"),"UTF-8")+"    <br />rn";  
            }  
		} catch (JSchException | IOException e) {
			result+=e.getMessage();
		}
		//}finally{
		//	if(openChannel!=null&&!openChannel.isClosed()){
		//		openChannel.disconnect();
		//	}
		//	if(session!=null&&session.isConnected()){
		//		session.disconnect();
		//	}
		//}
		try {
			Thread.sleep(20000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		openChannel.setCommand("p");
		try{
			int exitStatus = openChannel.getExitStatus();
			System.out.println(exitStatus);
			openChannel.connect();  
            InputStream in = openChannel.getInputStream();  
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));  
            String buf = null;
            while ((buf = reader.readLine()) != null) {
            	result+= new String(buf.getBytes("gbk"),"UTF-8");
            }
		}
		catch (JSchException | IOException e)
		{
			
		}
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		openChannel.setCommand("p");
		try{
			openChannel.connect();
		}
		catch (JSchException e)
		{
			
		}
		
		return result;
	}
	
	
	
	public static void main(String args[]){
		String exec = exec("192.168.10.1", "root", "0000", 22, "madplay /mnt/SD-P1/music/*.mp3 -z -r2 -a-25");
		System.out.println(exec);
	}
}
