package javaCrossing;

public class PrintDTO {

	private String t01 = "          *****          ";
	private String t02 = "         *     *         ";
	private String t03 = "        *  @@@  *        "; // 3
	private String t04 = "     ****  @@@  ****     "; // 4
	private String t05 = "    **             **    ";
	private String t06 = "   **  @@@     @@@  **   "; // 6
	private String t07 = "   *   @@@     @@@   *   "; // 7
	private String t08 = "   **               **   ";
	private String t09 = "    *****************    ";
	private String t10 = "         |     |         ";
	private String t11 = "         |     |         ";
	private String t12 = "   $%^$%^%$^$%^$%^%$^%$  ";

	private String tn1 = "            1            ";
	private String tn2 = "            2            ";
	private String tn3 = "            3            ";

	private String t33 = "        *       *        "; // 3
	private String t44 = "     ****       ****     "; // 4
	private String t66 = "   **               **   "; // 6
	private String t77 = "   *                 *   "; // 7
	
	public void tree1o() {
		System.out.println(t01 + "\n" + t02 + "\n" + t03 + "\n" + t04 + "\n" + t05 + "\n" + t06 + "\n" + t07 + "\n"
				+ t08 + "\n" + t09 + "\n" + t10 + "\n" + t11 + "\n" + t12 + "\n" + tn1);
	}

	public void tree1x() {
		System.out.println(t01 + "\n" + t02 + "\n" + t33 + "\n" + t44 + "\n" + t05 + "\n" + t66 + "\n" + t77 + "\n"
				+ t08 + "\n" + t09 + "\n" + t10 + "\n" + t11 + "\n" + t12 + "\n" + tn1);
	}

	public void tree1o2o() {
		System.out.println(t01 + t01 + "\n" + t02 + t02 + "\n" + t03 + t03 + "\n" + t04 + t04 + "\n" + t05 + t05 + "\n"
				+ t06 + t06 + "\n" + t07 + t07 + "\n" + t08 + t08 + "\n" + t09 + t09 + "\n" + t10 + t10 + "\n" + t11
				+ t11 + "\n" + t12 + t12 + "\n" + tn1 + tn2);
	}

	public void tree1o2x() {
		System.out.println(t01 + t01 + "\n" + t02 + t02 + "\n" + t03 + t33 + "\n" + t04 + t44 + "\n" + t05 + t05 + "\n"
				+ t06 + t66 + "\n" + t07 + t77 + "\n" + t08 + t08 + "\n" + t09 + t09 + "\n" + t10 + t10 + "\n" + t11
				+ t11 + "\n" + t12 + t12 + "\n" + tn1 + tn2);
	}

	public void tree1x2o() {
		System.out.println(t01 + t01 + "\n" + t02 + t02 + "\n" + t33 + t03 + "\n" + t44 + t04 + "\n" + t05 + t05 + "\n"
				+ t66 + t06 + "\n" + t77 + t07 + "\n" + t08 + t08 + "\n" + t09 + t09 + "\n" + t10 + t10 + "\n" + t11
				+ t11 + "\n" + t12 + t12 + "\n" + tn1 + tn2);
	}

	public void tree1x2x() {
		System.out.println(t01 + t01 + "\n" + t02 + t02 + "\n" + t33 + t33 + "\n" + t44 + t44 + "\n" + t05 + t05 + "\n"
				+ t66 + t66 + "\n" + t77 + t77 + "\n" + t08 + t08 + "\n" + t09 + t09 + "\n" + t10 + t10 + "\n" + t11
				+ t11 + "\n" + t12 + t12 + "\n" + tn1 + tn2);
	}

	public void tree1o2o3o() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t03 + t03 + t03 + "\n" + t04 + t04 + t04
				+ "\n" + t05 + t05 + t05 + "\n" + t06 + t06 + t06 + "\n" + t07 + t07 + t07 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

	public void tree1o2o3x() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t03 + t03 + t33 + "\n" + t04 + t04 + t44
				+ "\n" + t05 + t05 + t05 + "\n" + t06 + t06 + t66 + "\n" + t07 + t07 + t77 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

	public void tree1o2x3o() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t03 + t33 + t03 + "\n" + t04 + t44 + t04
				+ "\n" + t05 + t05 + t05 + "\n" + t06 + t66 + t06 + "\n" + t07 + t77 + t07 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

	public void tree1o2x3x() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t03 + t33 + t33 + "\n" + t04 + t44 + t44
				+ "\n" + t05 + t05 + t05 + "\n" + t06 + t66 + t66 + "\n" + t07 + t77 + t77 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

	public void tree1x2o3o() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t33 + t03 + t03 + "\n" + t44 + t04 + t04
				+ "\n" + t05 + t05 + t05 + "\n" + t66 + t06 + t06 + "\n" + t77 + t07 + t07 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

	public void tree1x2o3x() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t33 + t03 + t33 + "\n" + t44 + t04 + t44
				+ "\n" + t05 + t05 + t05 + "\n" + t66 + t06 + t66 + "\n" + t77 + t07 + t77 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

	public void tree1x2x3o() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t33 + t33 + t03 + "\n" + t44 + t44 + t04
				+ "\n" + t05 + t05 + t05 + "\n" + t66 + t66 + t06 + "\n" + t77 + t77 + t07 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

	public void tree1x2x3x() {
		System.out.println(t01 + t01 + t01 + "\n" + t02 + t02 + t02 + "\n" + t33 + t33 + t33 + "\n" + t44 + t44 + t44
				+ "\n" + t05 + t05 + t05 + "\n" + t66 + t66 + t66 + "\n" + t77 + t77 + t77 + "\n" + t08 + t08 + t08
				+ "\n" + t09 + t09 + t09 + "\n" + t10 + t10 + t10 + "\n" + t11 + t11 + t11 + "\n" + t12 + t12 + t12
				+ "\n" + tn1 + tn2 + tn3);
	}

}
