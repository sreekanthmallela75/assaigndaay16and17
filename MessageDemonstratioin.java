package assaignDay16and17;

import java.sql.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageDemonstratioin {
	  Scanner input = new Scanner(System.in);

      String message = "Hello <<name>>,\n We have your full name as <<full name>> in our system.\n your contact number is 91-xxxxxxxxxx."
              +   "\nPlease,let us know in case of any clarification Thank you BridgeLabz 01/01/2021.";

      System.out.println("Enter your first name: ");
      String firstName = input.next();

      System.out.println("Enter your last name: ");
      String lastName = input.next();

      System.out.println("Enter your phone number: ");
      String phoneNumber = input.next();

      String REGEX1 = "<<name>>";
      String REGEX2 = "<<full name>>";
      String REGEX3 = "xxxxxxxxxx";

      String replaceFirstName = firstName;
      String replaceFullName = firstName + " " + lastName;
      String replacePhone = phoneNumber;

      Pattern p1 = Pattern.compile(REGEX1);
      Pattern p2 = Pattern.compile(REGEX2);
      Pattern p3 = Pattern.compile(REGEX3);

      Matcher m1 = p1.matcher(message);
      message = m1.replaceAll(replaceFirstName);
      System.out.println(message);

      Matcher m2 = p2.matcher(message);
      message = m2.replaceAll(replaceFullName);
      System.out.println(message);

      Matcher m3 = p3.matcher(message);
      message = m3.replaceAll(replacePhone);
      System.out.println(message);

      String[] messageArray = message.split("\\s");

      String REGEX4 = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";
      Pattern DATE_PATTERN = Pattern.compile(REGEX4);

      for(int i=0; i< messageArray.length; i++) {
          String message1 = messageArray[i].replace(".", "");
          Matcher m4 = DATE_PATTERN.matcher(message1);
          if(m4.matches()) {
              Date d = new Date();
              message1 = m4.replaceAll(d.toString());
              messageArray[i] = message1;
          }
      }
	public MessageDemonstratioin(Scanner input, String message, String firstName, String lastName, String phoneNumber,
			String rEGEX1, String rEGEX2, String rEGEX3, String replaceFirstName, String replaceFullName,
			String replacePhone, Pattern p1, Pattern p2, Pattern p3, Matcher m1, Matcher m2, Matcher m3,
			String[] messageArray, String rEGEX4, Pattern dATE_PATTERN, int i) {
		super();
		this.input = input;
		this.message = message;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		REGEX1 = rEGEX1;
		REGEX2 = rEGEX2;
		REGEX3 = rEGEX3;
		this.replaceFirstName = replaceFirstName;
		this.replaceFullName = replaceFullName;
		this.replacePhone = replacePhone;
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.messageArray = messageArray;
		REGEX4 = rEGEX4;
		DATE_PATTERN = dATE_PATTERN;
		this.i = i;
	}

      message = Arrays.toString(messageArray).replaceAll("," ,"");
      System.out.println(message.replace("[","").replace("]",""));

  }
}

