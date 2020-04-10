
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

    public Robot(String TL, double sp){
        this.TL = TL; 
        this.sp = sp;
        RobotWalk();
    }
    
    public void RobotWalk(){
        if(TL == "green"){
        }
        else if(TL == "yellow"){
            sp = sp * 1.2;
        }
        else{
            sp = 0;
        }
        System.out.println("속도: " + (int)sp + "km/h");
    }    
}