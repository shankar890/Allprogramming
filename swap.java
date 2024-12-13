package Accenture_jobs;

public class swap {

	public static void main(String[] args) 
	{

		 String input = "The quick brown fox jumps over the lazy dog";
	        String swapped = swapConsecutiveWords(input);
	        System.out.println(swapped);
	    }

	    public static String swapConsecutiveWords(String input) {
	        // Split the input string into words
	        String[] words = input.split("\\s+");

	        // Swap consecutive words
	        for (int i = 0; i < words.length - 1; i += 2) {
	            String temp = words[i];
	            words[i] = words[i + 1];
	            words[i + 1] = temp;
	        }

	        // Join the words back into a string
	        return String.join(" ", words);
	    }
	}
