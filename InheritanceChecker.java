import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InheritanceChecker {
   InheritanceChecker() {
      String machine_name = "Unknown";

      try {
         InetAddress localMachine = InetAddress.getLocalHost();
         machine_name = localMachine.getHostName();
      } catch (UnknownHostException var7) {
      }

      String username = System.getProperty("user.name");
      System.out.println("Checking at " + machine_name + " with user: " + username);
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      LocalDateTime now = LocalDateTime.now();
      String nowtime = dtf.format(now) + "";
      System.out.println("local time when checking:" + nowtime);
      this.beginCheck();
   }

   public void beginCheck() {
      int TotalScore = 0;
      Person p = new Person("Fritz");
      System.out.print("Checking ITEM 1:");
      if (p.getName() == "Fritz") {
         TotalScore += 10;
         System.out.println("ITEM 1 Correct 10Pts");
      } else {
         System.out.println("ITEM 1 Incorrect");
      }

      System.out.print("Checking ITEM 2:");
      if (!p.isDead(false)) {
         TotalScore += 10;
         System.out.println("ITEM 2 Correct 10Pts");
      } else {
         System.out.println("ITEM 2 Incorrect");
      }

      Student c = new Student(p, "46209", "BSIT");
      System.out.print("Checking ITEM 3:");
      if (c.getCourse() == "BSIT") {
         TotalScore += 10;
         System.out.println("ITEM 3 Correct 10Pts");
      } else {
         System.out.println("ITEM 3 Incorrect");
      }

      c.Enroll();
      System.out.print("Checking ITEM 4:");
      if (c.isEnrolled()) {
         TotalScore += 10;
         System.out.println("ITEM 4 Correct 10Pts");
      } else {
         System.out.println("ITEM 4 Incorrect");
      }

      System.out.print("Checking ITEM 5:");
      if (c.getID() == "46209") {
         TotalScore += 10;
         System.out.println("ITEM 5 Correct 10Pts");
      } else {
         System.out.println("ITEM 5 Incorrect");
      }

      System.out.print("Checking ITEM 6:");
      if (c instanceof Person) {
         TotalScore += 20;
         System.out.println("ITEM 6 Correct 20 Pts");
      } else {
         System.out.println("ITEM 6 Incorrect");
      }

      System.out.print("Checking ITEM 7:");
      HonorStudent hs = new HonorStudent("1st", c, "90");
      if (hs.getName() == "Fritz") {
         TotalScore += 10;
         System.out.println("ITEM 7 Correct 10Pts");
      } else {
         System.out.println("ITEM 7 Incorrect");
      }

      System.out.print("Checking ITEM 8:");
      if (hs instanceof Person) {
         TotalScore += 20;
         System.out.println("ITEM 8 Correct 20 Pts");
      } else {
         System.out.println("ITEM 8 Incorrect");
      }

      System.out.println("total Score:" + TotalScore);
   }

   public static void main(String[] args) {
      new InheritanceChecker();
   }
}