public class Current extends Account {
    
    Current(String cname,int acc_no,String acc_type,double balance){
        super(cname, acc_no, acc_type, balance);
    }

    void chequebook(String ans){
        if(ans == "Yes"){
            System.out.println("Dear!" + cname + " has a cheque book");
        }else{
            System.out.println("Dear!!" + cname + " does not have a cheque book");
        }
    }
}
