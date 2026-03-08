public class IPAddress {
    private String part1;
    private String part2;
    private String part3;
    private String part4;
    static int noOfIPAddress;

    public IPAddress(){
        part1 ="0";
        part2 ="0";
        part3 ="0";
        part4 ="0";
        noOfIPAddress++;
    }
    public IPAddress(String p1,String p2,String p3,String p4){
        setIPAddress(p1,p2,p3,p4);
        noOfIPAddress++;
    }
    /*Method to set an IP address by setting its four parts.
    You should be able to set it all in one statement. */
    void setIPAddress(String p1,String p2,String p3,String p4){
        if(Integer.parseInt(p1)>=0 && Integer.parseInt(p1)<=255)
            part1 =p1;
        else
            part1 ="0";
        if(Integer.parseInt(p2)>=0 && Integer.parseInt(p2)<=255)
            part2 =p2;
        else
            part2 ="0";
        if(Integer.parseInt(p3)>=0 && Integer.parseInt(p3)<=255)
            part3 =p3;
        else
            part3 ="0";
        if(Integer.parseInt(p4)>=0 && Integer.parseInt(p4)<=255)
            part4 =p4;
        else
            part4 ="0";
    }
    //Method to decrement the static variable when an IP address is deleted
    public static void decnoOfIPAddress(){
        noOfIPAddress--;
    }
    //Method to get the different IP address parts.
    public String getPart1(){
        return part1;
    }
    public String getPart2(){
        return part2;
    }
    public String getPart3(){
        return part3;
    }
    public String getPart4(){
        return part4;
    }
    //Method to the total number of the IP addresses created.
    public static int getNoOfIPAddress(){
        return noOfIPAddress;
    }
    //Method PrintIP which displays the IP address
    public String PrintIP(){
        return part1+"."+part2+"."+part3+"."+part4;
    }
    /*Method to compare if IP addresses are the same or not.
    * returns true if they are equal
    * returns false if they are not equal */
    public boolean compareIP(IPAddress ip2){
        if(Integer.parseInt(this.getPart1())==Integer.parseInt(ip2.getPart1()) && Integer.parseInt(this.getPart2())==Integer.parseInt(ip2.getPart2()) && Integer.parseInt(this.getPart3())==Integer.parseInt(ip2.getPart3()) && Integer.parseInt(this.getPart4())==Integer.parseInt(ip2.getPart4())){
            return true;
        }
        else{
            return false;
        }
    }


}
