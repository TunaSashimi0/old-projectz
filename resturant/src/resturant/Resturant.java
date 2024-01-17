class Main {
    static String step1(
      boolean hasFish,
      boolean hasPizza,
      boolean hasVegan
    ) {
    String message = "";
    if ((hasFish=true || hasPizza=true)&&hasVegan=true){
      message = "Let's go!";
    }
    else {
      message = "Sorry, we'll have to think of somewhere else.";
    }
    return message;
  }

  static String step2(
    int temperature,
    boolean isRaining,
    boolean isSunny
  ) {
    String message = "";
    // Step 2: Place your code here

    return message;
  }

  // Do not have to modify below
  public static void main(String[] args) {
    System.out.println("Step1");
    System.out.println("Has fish and vegan: \n" + step1(true, false, true) + "\n");
    System.out.println("Has pizza: \n" + step1(false, true, false) + "\n");
    System.out.println("Has nothing: \n" + step1(false, false, false) + "\n");

    System.out.println("Step2");
    System.out.println("30 degree, not raining and sunny: \n" + step2(30, false, true) + "\n");
    System.out.println("25 degree, raining and not sunny: \n" + step2(25, true, false) + "\n");
    System.out.println("10 degree, not raining and not sunny: \n" + step2(10, false, false) + "\n");
    System.out.println("10 degree, raining and not sunny: \n" + step2(10, true, false) + "\n");
  }
}

