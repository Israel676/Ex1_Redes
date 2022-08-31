package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class RedesController {
	
	public RedesController() {
		super();
	}
	
	public String os() {
		String os = System.getProperty("os.name");
		return os;
	}
	
	public void ip(String process) {
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while(linha != null) {
				if(linha.contains("IPv4")) {
					System.out.println(linha);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			fluxo.close();
			leitor.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void ping(String proce) {
		try {
			Process x = Runtime.getRuntime().exec(proce);
			InputStream flow = x.getInputStream();
			InputStreamReader reader = new InputStreamReader(flow);
			BufferedReader buffe = new BufferedReader(reader);
			String line = buffe.readLine();
			while(line != null) {
				System.out.println(line);
				line = buffe.readLine();
			}
			buffe.close();
			reader.close();
			flow.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
