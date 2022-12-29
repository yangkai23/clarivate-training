package day2;

public class SwitchVowel {
public static void main(String[] args) {
	char c='E';
	switch (c) {
	//by grouping
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
		System.out.println("Vowel");
		break;
	default:
		System.out.println("Consonant");
	}
}
}
