
/**
 * Write a description of class RobotWalk here.
 *
 * @author (2018315034 정철우, 2018315038 이혜인)
 * @version (2020/04/07)
 */
public class RobotWalk
{
    String TL; //Traffic Light
    double sp = 5; //Speed

    public void RobotWalk(String TL, double sp){
        if(TL == "green"){
        }
        else if(TL == "yellow"){
            sp = sp * 1.2;
        }
        else{
            sp = 0;
        }
    }    

    public static void main(String[] args){
        new RobotWalk();
    }
}