package tutorial14.exercise03unsortedarrayobjects;

public class LinearArrayStudents {

    private Student[] arr;
    private int size;

    public LinearArrayStudents(int capacity) {
        arr = new Student[capacity];
        size = 0;
    }

    // Inserts a student at the end of the array
    public void insert(Student x) {

        if (size == arr.length) {
            System.out.println("Array is full.");
            return;
        }

        arr[size] = x;
        size++;
    }

    // Searches for a student using their ID
    public int linearSearch(Student x) {

        for (int i = 0; i < size; i++) {

            if (arr[i].getId() == x.getId()) {
                return i;
            }
        }

        return -1;
    }

    // Deletes a student from the array
    public void delete(Student x) {

        int position = linearSearch(x);

        if (position == -1) {
            System.out.println("Student not found.");
            return;
        }

        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
        arr[size] = null;
    }

    // Displays all students
    public void display() {

        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    // Returns the current number of students
    public int getSize() {
        return size;
    }
}