
/**
 * Write a description of class RobotWalk here.
 *
 * @author (2018315034 정철우, 2018315038 이혜인)
 * @version (2020/04/07)
 */
public class RobotWalk
{
    public String TL; //Traffic Light
    double sp = 5;
    public void RobotWalk(String TL, double sp){
        this.TL = TL;
        this.sp = sp;
       
        if(TL == "green"){
            sp = 0;
            System.out.print(sp);
        }
    }    
    public static void main(String[] args){
         new RobotWalk();
       
    }
}
