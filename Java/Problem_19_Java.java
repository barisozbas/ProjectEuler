public class main {
 public static void main(String[] args) {
  int day = 2, sundays = 0; 
  for (int year = 1; year <= 100; year++) {
   for (int mon = 1; mon <= 12; mon++) {
    if (day == 7) {
     sundays++;
    }
    if (mon == 2) {
     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
      day++;
     }
    } else if (mon == 4 || mon == 6 || mon == 9 || mon == 11) {
     day += 2;
    } else {
     day += 3;
    }
    if (day > 7) {
     day -= 7;
    }
   }
  }
  System.out.println(sundays);
 }
}