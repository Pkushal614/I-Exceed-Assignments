void main() {
  DateTime locTime = DateTime.now();
  //Gives the local time of the system
  print('Local time = $locTime');

  //Gives the coordinated universal time
  DateTime utcTime = DateTime.utc(2025, 5, 27, 10, 0);
  print('UTC Date and Time : $utcTime');

  //To calculate the time passed from the Epoch
  // Current time
  DateTime now = DateTime.now();

  // Get seconds since epoch using micro
  int secondsSinceEpoch = now.microsecondsSinceEpoch ~/ 1000000;
  print('Using Micro $secondsSinceEpoch');

  DateTime localTimeFromEpochmicro = DateTime.fromMillisecondsSinceEpoch(
    secondsSinceEpoch * 1000,
  );
  print("Local time from epoch: $localTimeFromEpochmicro");

  // Get seconds since epoch using milli
  int secondsSinceEpoch1 = now.millisecondsSinceEpoch ~/ 1000;

  print("Seconds since Epoch: $secondsSinceEpoch1");

  // Convert seconds back to DateTime (local)
  DateTime localTimeFromEpochmilli = DateTime.fromMillisecondsSinceEpoch(
    secondsSinceEpoch1 * 1000,
  );

  print("Local time from epoch: $localTimeFromEpochmilli");
}
