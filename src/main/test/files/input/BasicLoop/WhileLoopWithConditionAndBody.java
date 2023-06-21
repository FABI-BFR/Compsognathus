public class WhileLoopWithConditionAndBody {
    public void doSomething(){
        while(isTrue()){
            doNothing();
        }
    }
    public boolean isTrue(){
        return true;
    }
    public void doNothing(){
        return;
    }
}