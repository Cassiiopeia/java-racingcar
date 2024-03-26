package view;

import org.kokodak.Console;

public class InputView {
  public static String[] getCarNamesInput(){
    return Console.readLine().split(",");
  }

  public static String getAttemptCountInput(){
    return Console.readLine();
  }


}
