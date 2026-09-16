package jdbc;

import org.h2.tools.Server;

public class lec_b_StartH2Console {
	public static void main(String[] args) throws Exception {
		Server server = Server.createWebServer("-web").start();
		System.out.println(server.getURL());
	
		}
}