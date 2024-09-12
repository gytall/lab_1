public class Palindrome {
	public static void main(String[] args) {
			// Предопределенный ввод
			String input = "madam";

			// Проверка на палиндром
			boolean isPalindrome = checkPalindrome(input);

			// Вывод результата
			if (isPalindrome) {
					System.out.println("'" + input + "' - это палиндром");
			} else {
					System.out.println("'" + input + "' - это не палиндром");
			}
	}

	private static boolean checkPalindrome(String str) {
			int length = str.length();
			for (int i = 0; i < length / 2; i++) {
					if (str.charAt(i) != str.charAt(length - 1 - i)) {
							return false;
					}
			}
			return true;
	}
}
