package by.htp6.task1.main;


public class Main {
	
	public static void main(String[] args) {
		String line = "  I   don't know what            dram is that you have. "
				+ "I don't care how disappoting it might've   been as you've been working toward that dream, "
				+ "but that dream that you're  holding in your mind."
				+ "That it's possible!!!";

		System.out.println("Исходная строка:");
		System.out.println(line);

		System.out.println("Итоговая строка:");
		RefracString rs = new RefracString();
		System.out.println(rs.refractLine(line));
	}
	
}
