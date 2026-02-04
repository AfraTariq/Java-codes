public class Radar {
    public static void main(String[] args) {
        int hits1=0, hits2=0;
        double rate1, rate2, avgRate;
        for(int i=0; i<10000;i++){
            double x = -1+ Math.random()*2;
            double y = -1+ Math.random()*2;
            if((Math.pow(x,2)+Math.pow(y,2))<=1)
                hits1++;
        }
        rate1= hits1/10000.0;
        System.out.printf("Test 1 (10000 scans) detection rate: %.3f %n", rate1);
        for(int i=0; i<100000;i++){
            double x = -1+ Math.random()*2;
            double y = -1+ Math.random()*2;
            if((Math.pow(x,2)+Math.pow(y,2))<=1)
                hits2++;
        }
        rate2= hits2/100000.0;
        System.out.printf("Test 2 (100000 scans) detection rate: %.3f %n", rate2);
        avgRate= (rate1+rate2)/2;
        System.out.printf("Average detection rate: %.1f%% %n ", avgRate*100);
    }
}
