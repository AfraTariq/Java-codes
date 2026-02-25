import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CollegeDemo
{
    public static void main(String[] args) {
        College [] cArray=new College[10] ;
        int i=0;
        String name;
        int depts;
        int numStds;
        int numF;
        int numOfColleges;
        try {
            Scanner inFile = new Scanner(new FileReader("college.txt"));
            while(inFile.hasNext())
            {
                // read each row
                name= inFile.next();
                depts=inFile.nextInt();
                numStds=inFile.nextInt();
                numF=inFile.nextInt();
                // create an object from the data read
                College collegeObject=new College(name,depts,numStds,numF);
                // add the object to cArray
                cArray[i]=collegeObject;
                // hint use i to move to the next location in the array, i.e., i++
                i++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
        }
        numOfColleges=cArray[0].getnumCols();
        System.out.println("Colleges' information ");
        for( i=0; i<numOfColleges; i++)
            System.out.println(cArray[i]);
        System.out.printf("The average number of students per college is %7.2f\n"
                ,findAvg(cArray, numOfColleges));
        System.out.println("The college with the highest number of faculty is "+
                getMax(cArray, numOfColleges));
    }
    // returns the average number of students per college
    public static double findAvg(College[] arr,int nc) {
        double sum=0;
        for (int i=0; i<nc;i++){
            sum+=arr[i].getnumStds();
        }
        return (sum/nc);
    }
    // returns the name of the college with the highest number of faculty
    public static String getMax(College[] arr, int nc) {
        int max= arr[0].getnumFaculty();
        int maxIndex=0;
        for (int i=1;i<nc;i++){
            if (arr[i].getnumFaculty()>max) {
                max = arr[i].getnumFaculty();
                maxIndex=i;
            }
        }
        return arr[maxIndex].getName();
    }
}