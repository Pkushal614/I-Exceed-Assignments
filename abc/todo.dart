import 'dart:io';

void main() {
  final todoList = <String>[];

  while (true) {
    print("\nTo-Do List:");
    if (todoList.isEmpty) {
      print("No tasks yet!");
    } else {
      for (var i = 0; i < todoList.length; i++) {
        print("${i + 1}. ${todoList[i]}");
      }
    }

    print("\nOptions:");
    print("1. Add task");
    print("2. Remove task");
    print("3. View tasks");
    print("4. Exit");

    stdout.write("Enter your choice: ");
    final choice = stdin.readLineSync();

    switch (choice) {
      case '1':
        stdout.write("Enter task to add: ");
        final task = stdin.readLineSync();
        if (task != null && task.isNotEmpty) {
          todoList.add(task);
        } else {
          print("Task cannot be empty.");
        }
        break;
      case '2':
        if (todoList.isEmpty) {
          print("No tasks to remove!");
        } else {
          stdout.write("Enter the number of the task to remove: ");
          final taskNumber = int.tryParse(stdin.readLineSync() ?? '');
          if (taskNumber != null &&
              taskNumber > 0 &&
              taskNumber <= todoList.length) {
            todoList.removeAt(taskNumber - 1);
          } else {
            print("Invalid task number.");
          }
        }
        break;
      case '3':
        print("\nTo-Do List:");
    if (todoList.isEmpty) {
      print("No tasks yet!");
    } else {
      for (var i = 0; i < todoList.length; i++) {
        print("${i + 1}. ${todoList[i]}");
      }
    }
        break;
      case '4':
        print("Exiting...");
        return;
      default:
        print("Invalid choice. Please try again.");
    }
  }
}