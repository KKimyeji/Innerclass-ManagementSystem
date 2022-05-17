package Logging;

public class Tester {
public static void main(String[]args) {
	IssueLogger logger = new IssueLogger("log.txt");
	logger.log("test");
}
}
