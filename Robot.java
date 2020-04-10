
/**
 * Write a description of class RobotWalk here.
 *
 * @author (2018315034 정철우, 2018315038 이혜인)
 * @version (2020/04/07)
 */
public class Robot
{
    String TL; //Traffic Light
    double sp = 5; //Speed

    public RobotWalk(String TL, double sp){
        if(TL == "green"){
        }
        else if(TL == "yellow"){
            sp = sp * 1.2;
        }
        else{
            sp = 0;
        }
        System.out.print("속도: " + sp);
    }    
}