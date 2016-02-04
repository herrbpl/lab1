import java.util.*;

public class Answer {

   public static void main (String[] param) {

      // TODO!!! Solutions to small problems 
      //   that do not need an independent method!
    
      // conversion double -> String
	   
	  System.out.println(Double.toString(13.0));
	 System.out.println(String.valueOf(13.0));
      // conversion String -> int
	 int x=0;
	 try {
		 x = Integer.parseInt("13x");
	} catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println(e.toString());
	}
	 
	 System.out.println(x+1);
	 
      // "hh:mm:ss"
	 Calendar rightNow = Calendar.getInstance();
	 System.out.println(rightNow.get(Calendar.HOUR_OF_DAY));
	System.out.println((Calendar.getInstance().getTime().toString()));
	 
	 
      // cos 45 deg

      // table of square roots

      String firstString = "ABcd12";
      String result = reverseCase (firstString);
      System.out.println ("\"" + firstString + "\" -> \"" + result + "\"");

      // reverse string

      String s = "How  many	 words   here";
      int nw = countWords (s);
      System.out.println (s + "\t" + String.valueOf (nw));

      // pause. COMMENT IT OUT BEFORE JUNIT-TESTING!

      final int LSIZE = 100;
      ArrayList<Integer> randList = new ArrayList<Integer> (LSIZE);
      Random generaator = new Random();
      for (int i=0; i<LSIZE; i++) {
         randList.add (new Integer (generaator.nextInt(1000)));
      }

      // minimal element

      // HashMap tasks:
      //    create
      //    print all keys
      //    remove a key
      //    print all pairs

      System.out.println ("Before reverse:  " + randList);
      reverseList (randList);
      System.out.println ("After reverse: " + randList);

      System.out.println ("Maximum: " + maximum (randList));
   }

   /** Finding the maximal element.
    * @param a Collection of Comparable elements
    * @return maximal element.
    * @throws NoSuchElementException if <code> a </code> is empty.
    */
   static public <T extends Object & Comparable<? super T>>
         T maximum (Collection<? extends T> a) 
            throws NoSuchElementException {
      //return null; // TODO!!! Your code here
	   return Collections.max(a);
   }

   /** Counting the number of words. Any number of any kind of
    * whitespace symbols between words is allowed.
    * @param text text
    * @return number of words in the text
    */
   public static int countWords (String text) {
      return 0; // TODO!!! Your code here
   }

   /** Case-reverse. Upper -> lower AND lower -> upper.
    * @param s string
    * @return processed string
    */
   public static String reverseCase (String s) {
	  StringBuilder result = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (Character.isLowerCase(ch)) {
				result.append(Character.toUpperCase(ch));
			} else if (Character.isUpperCase(ch)) {
				result.append(Character.toLowerCase(ch));
			} else {
				result.append(ch);
			}
				
		}
      return result.toString(); // TODO!!! Your code here
   }

   /** List reverse. Do not create a new list.
    * @param list list to reverse
    */
   public static <T extends Object> void reverseList (List<T> list)
      throws UnsupportedOperationException {
         // TODO!!! Your code here
   }
}
