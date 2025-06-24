import 'dart:io';

DateTime getUserDate(String label) {
  stdout.write("📅 Enter $label (yyyy-mm-dd): ");
  String? input = stdin.readLineSync();
  try {
    return DateTime.parse(input!);
  } catch (e) {
    print("❌ Invalid date format! Please try again.");
    return getUserDate(label);
  }
}

void findMyAge() {
  DateTime birthDate = getUserDate("your birthdate");
  DateTime today = DateTime.now();

  int years = today.year - birthDate.year;
  int months = today.month - birthDate.month;
  int days = today.day - birthDate.day;

  if (days < 0) {
    months--;
    days += DateTime(today.year, today.month, 0).day;
  }

  if (months < 0) {
    years--;
    months += 12;
  }

  print("\n🎂 You are $years years, $months months, and $days days old!");
}

void main() {
  bool again = true;
  do {
    print("📆 Welcome to the Dart DateTime Explorer!");
    print("Choose an operation:\n");

    List<String> options = [
      "1. Add Duration to a Date",
      "2. Compare Two Dates",
      "3. Find Difference Between Two Dates",
      "4. Check if First Date is After Second",
      "5. Check if First Date is Before Second",
      "6. Parse and Display a Date",
      "7. Show Current DateTime",
      "8. Find My Age",
      "9. Exit",
    ];

    for (var option in options) {
      print(option);
    }

    stdout.write("\nEnter your choice (1-9): ");
    String? choice = stdin.readLineSync();

    switch (choice) {
      case '1':
        DateTime baseDate = getUserDate("the base date");
        stdout.write("⏳ Enter number of days to add: ");
        int days = int.parse(stdin.readLineSync()!);
        DateTime result = baseDate.add(Duration(days: days));
        print("Resulting Date: $result");
        break;

      case '2':
        DateTime date1 = getUserDate("the first date");
        DateTime date2 = getUserDate("the second date");
        int result = date1.compareTo(date2);
        print(
          "Comparison Result: $result (${result == 0
              ? "Equal"
              : result < 0
              ? "First is earlier"
              : "First is later"})",
        );
        break;

      case '3':
        DateTime start = getUserDate("the start date");
        DateTime end = getUserDate("the end date");
        Duration diff = end.difference(start);
        print("⏳ Difference: ${diff.inDays.abs()} days");
        break;

      case '4':
        DateTime date1 = getUserDate("the first date");
        DateTime date2 = getUserDate("the second date");
        print("Is first date after second? → ${date1.isAfter(date2)}");
        break;

      case '5':
        DateTime date1 = getUserDate("the first date");
        DateTime date2 = getUserDate("the second date");
        print("Is first date before second? → ${date1.isBefore(date2)}");
        break;

      case '6':
        stdout.write("Enter a date string (yyyy-mm-dd): ");
        String? input = stdin.readLineSync();
        try {
          DateTime parsed = DateTime.parse(input!);
          print("Parsed DateTime: $parsed");
        } catch (e) {
          print(" Invalid date format!");
        }
        break;

      case '7':
        print("🕒 Current DateTime: ${DateTime.now()}");
        break;

      case '8':
        findMyAge();
        break;

      case '9':
        print("👋 Goodbye!");
        return;

      default:
        print("❗ Invalid option. Please restart the program.");
    }
    print('Do you want to try again true/false');
    String? ag = stdin.readLineSync();
    if (ag != null && ag.isNotEmpty) {
      again = bool.parse(ag);
    }
  } while (again);

  print("\n Thankyou");
}
