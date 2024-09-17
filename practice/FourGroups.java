package practice;

public class FourGroups {
public static void main(String[] args) {
	int StartingRollNumber = 101;
	int groups = 4;
	for(int i=0;i<groups;i++) {
		System.out.println("groups"+(i+1)+":");
	
	for(int j=0;j<5;j++) {
		System.out.println(StartingRollNumber+(j*4)+i);
	}
	System.out.println();
}
}
}