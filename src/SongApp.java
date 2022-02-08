import java.io.File;
import java.util.Scanner;
import java.util.Properties;

import java.io.FileReader;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.stream.Stream;

import java.net.Socket;
import java.net.ServerSocket;
import java.io.PrintWriter;

class SongApp {
	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("\nError: No filename provided.");
			System.out.println("\tUSAGE: java SongApp <filename>");
		}
		else {
			Properties props = new Properties();
			// alt: for (String arg : args)
			for (int i = 0; i < args.length; i++) {
				switch(args[i]) {
					case "--help":
					case "-h":
						usage();
						System.exit(0);
					case "-f":
						loadFile(args[++i]);
						break;
					case "-i":
						loadStdIn();
						break;
					case "-s":
						loadFileStream(args[++i]);
						break;
					case "--server":
						server();
						break;
					default:
						System.out.println("Unknown argument " + args[i]);
						System.exit(1);
				}
			}			
		}
	}

	public static void usage() {
			System.out.println("Read the docs!");
	}

	public static void loadFile(String filename) throws Exception {
		File songList = new File(filename);
		Scanner sc = new Scanner(songList);
		sc.useDelimiter("\n");
		while (sc.hasNext()) {
			//System.out.println(sc.next());
			String[] columns = sc.next().split("\t");
			System.out.println("Song Name: " + columns[1]);
		}
	}

	public static void loadFileStream(String filename) throws Exception {
		new BufferedReader(new FileReader(filename)).lines().forEach(System.out::println);
	}

	public static void loadStdIn() {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Stream<String> lines = br.lines();
		lines.forEach(System.out::println);
	}

	public static void server() throws Exception {
		ServerSocket server = new ServerSocket(8080);

		while(server.isBound()) {
			Socket incomingRequest = server.accept();
			Scanner sc = new Scanner(incomingRequest.getInputStream());
			PrintWriter out = new PrintWriter(incomingRequest.getOutputStream());

			System.out.println(sc.nextLine());
			out.println("Hello from server!");
	
		}
	}
}
