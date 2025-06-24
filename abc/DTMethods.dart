void main() {
  // Add
  DateTime now = DateTime.now();
  DateTime future = now.add(Duration(days: 3));
  print('Future Date (after 3 days): $future');

  // Compare
  DateTime other = now.add(Duration(days: 1));
  print(other);
  print(now);
  print('Compare Result: ${now.compareTo(other)}');

  // Difference
  DateTime past = now.subtract(Duration(days: 2));
  Duration diff = now.difference(past);
  print('past : $past');
  print('Now : $now');
  print('Difference in days: ${diff.inDays}');

  // After
  print('Is future after now? ${future.isAfter(now)}');

  // Before
  print('Is past before now? ${past.isBefore(now)}');

  // Same or Not
  DateTime a = DateTime.now();
  DateTime b = a;
  print('Is same moment? ${a.isAtSameMomentAs(b)}');
}
