package space.bum.spring_boot.java;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCurrencyApplication {

  public static void main(String[] args) {
    SpringApplication.run(JavaCurrencyApplication.class, args);
    checkNumber();
  }

  private static void checkNumber() {
    Locale koLocale = new Locale("ko", "KR");
    Locale usLocale = new Locale("en", "US");
    long number = 4270;

    NumberFormat kocf = NumberFormat.getCurrencyInstance(koLocale);
    NumberFormat uscf = NumberFormat.getCurrencyInstance(usLocale);
    System.out.println("통화:");
    System.out.println("한:" + kocf.format(number));
    System.out.println("영:" + uscf.format(number));

    number = 1234567;
    NumberFormat konf = NumberFormat.getInstance(koLocale);
    NumberFormat usnf = NumberFormat.getInstance(usLocale);
    System.out.println("\n숫자:");
    System.out.println("한:" + konf.format(number));
    System.out.println("영:" + usnf.format(number));

    Date now = new Date();
    DateFormat usdf = DateFormat.getDateTimeInstance(DateFormat.LONG,
        DateFormat.LONG, usLocale);
    DateFormat dedf = DateFormat.getDateTimeInstance(DateFormat.LONG,
        DateFormat.LONG, koLocale);
    System.out.println("\n날짜:");
    System.out.println("한:" + dedf.format(now));
    System.out.println("영:" + usdf.format(now));
  }

}
