public class MethodCallWithValues {
    int i = 5;
    public int doSomething(){
        doSomethingElse(10);
        return doSomethingElse(i);
    }
    public int doSomethingElse(int x){
        return x + 5;
    }
}