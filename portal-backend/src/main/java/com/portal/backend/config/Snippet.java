package com.portal.backend.config;

public class Snippet {
	public static void main(final String[] args) {
		final CassandraConnector client = new CassandraConnector();
		final String ipAddress = args.length > 0 ? args[0] : "139.162.219.14";
		final int port = args.length > 1 ? Integer.parseInt(args[1]) : 9160;
		System.out.println("Connecting to IP Address " + ipAddress + ":" + port + "...");
		client.connect(ipAddress, port);
		client.close();
	}
}
