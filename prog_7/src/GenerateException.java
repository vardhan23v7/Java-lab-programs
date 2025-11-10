import java.util.*;
class GenerateException {
private int[] myarray = new int[5];
  

private void readElements() {
Scanner read = new Scanner(System.in);
System.out.print("Enter the array elements: ");
for (int i = 0; i < myarray.length; i++) {
myarray[i] = read.nextInt();
}
}



private void divideElements() {
int small = getSmallestElements();
for (int i = 0; i < myarray.length; i++) {
double result = myarray[i] / small;
}
System.out.print("Division is successful\n");
}
private int getSmallestElements() {
int small = myarray[0];
for (int i = 0; i < myarray.length; i++) {
       if (myarray[i] < small)
      small = myarray[i];
}
return small;
}


private void displayElements() {
Scanner read = new Scanner(System.in);
System.out.print("Enter the index you want to access: ");
int idx = read.nextInt();
int val = myarray[idx];
System.out.print("Value is: " + val);
}
void compute() {
readElements();
divideElements();
displayElements();
}
}
