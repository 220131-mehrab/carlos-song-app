package com.github.KarlitosTaquitos.songapp;

class SongApp {
	public static void main(String[] args) {
		String filename = args[0];
		SongList songList = new SongList(filename);
		Server server = new Server(8080);
		server.run(songList);
	}
}
