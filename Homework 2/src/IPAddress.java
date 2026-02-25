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
        noOfIPAddress++;
    }
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
    public int getNoOfIPAddress(){
        return noOfIPAddress;
    }
    public String PrintIP(){
        return part1+"."+part2+"."+part3+"."+part4;
    }
    public void compareIP(IPAddress ip1, IPAddress ip2){
        if(Integer.parseInt(ip1.getPart1())==Integer.parseInt(ip2.getPart1()) && Integer.parseInt(ip1.getPart2())==Integer.parseInt(ip2.getPart2()) && Integer.parseInt(ip1.getPart3())==Integer.parseInt(ip2.getPart3()) && Integer.parseInt(ip1.getPart4())==Integer.parseInt(ip2.getPart4())){
            System.out.println("They are same.");
        }
        else{
            System.out.println("They are not same.");
        }
    }


}
