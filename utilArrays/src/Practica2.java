import java.util.Arrays;

void main() {
    int[] a = {45, -12, 78, 0, -3, 56, 234, -67, 89, 1};
    int[] b = {45, -12, 78, 0, -3, 56, 234, -67, 89, 1};
    int[] c = {-100, 25, 33, -8, 17, 0, 42, -55, 91, 6};

    System.out.println("toString a: " + Arrays.toString(a));

    int[] sortedA = a.clone();
    Arrays.sort(sortedA);
    System.out.println("binarySearch 56: " + Arrays.binarySearch(sortedA, 56));

    System.out.println("a equals b: " + Arrays.equals(a, b));
    System.out.println("a equals c: " + Arrays.equals(a, c));

    System.out.println("a compare b: " + Arrays.compare(a, b));
    System.out.println("a compare c: " + Arrays.compare(a, c));

    int[] toSort = a.clone();
    Arrays.sort(toSort);
    System.out.println("Sorted: " + Arrays.toString(toSort));
}