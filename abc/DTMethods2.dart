void main() {
  //Custom Date
  DateTime custom = DateTime(2025, 12, 31, 23, 59, 59, 500, 250);
  print('Custom DateTime: $custom');

  // Subtract
  DateTime now = DateTime.now();
  DateTime past = now.subtract(Duration(hours: 2));
  print('2 hours ago: $past');

  // toLocal
  DateTime utcTime = DateTime.utc(2025, 5, 27, 12);
  print('UTC Tome : $utcTime');
  print('Local Time: ${utcTime.toLocal()}');

  // toUtc
  print('UTC Time: ${now.toUtc()}');

  // toString
  print('DateTime as String: ${now.toString()}');

  // Parse
  String dateStr = "2025-05-27 10:00:00";
  DateTime dt = DateTime.parse(dateStr);
  print('Parsed DateTime: $dt');

  // tryParse
  String input = "invalid-date";
  DateTime? dt2 = DateTime.tryParse(input);
  print('TryParse result: $dt2'); // null

  // Constants
  print('Weekday: ${now.weekday}');
  print('Month: ${now.month}');

  // format

  /*
  import 'package:intl/intl.dart';

void main() {
  DateTime now = DateTime(
    DateTime.now().year,
    DateTime.now().month,
    DateTime.now().day,
    17, 
    45,
  );

  print('12 Hour Format: ${DateFormat('hh:mm a').format(now)}');
  print('24 Hour Format: ${DateFormat('HH:mm').format(now)}');
}
  */
}
