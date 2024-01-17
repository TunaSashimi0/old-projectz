/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduce.myself;

/**
 *
 * @author Alex_
 */
class Main {
  // Step1-1: Update function here
  static String introduceMyself() {
    return "";
  }

  // Step2-1: Update function here
  static int magicEightBall() {
    return -1;
      for (int i = 0; i < 10; i++) {
          System.out.println("");
      }
  }

  public static void main(String[] args) {
    System.out.println("Step1 introduceMyself():");
    String introduction = introduceMyself();
    System.out.println(introduction);

    System.out.println("Step2 magicEightBall():");
    // Step2-2: Call function defined in Step 2 here

  }
  static String introducemyslef(){
      String intro;
      intro = "i'm alex";
      return intro;
  }
}