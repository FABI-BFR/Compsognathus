public class Main {
    String temp;
    private int i, b;

    public Main() {
        this.i = 0;
        temp = "null";
        int c;

    }
    public Main(int i, String temp){
        this.i = i;
        this.temp = temp;
        int a, b, c;
    }

    public int geti(){
        return i;
    }

    public void setStringIf(int a, int b, boolean cond, String temp){
        if(a == b && cond){
            this.temp = temp;
        } else if( a > b){
            this.temp = "fisch";
        } else {
            this.temp = "kein fisch";
        }
    }

    public void doABackflip(){
        setStringIf(1, 1, true, "fischomat");
        int f;
        f = geti();
        while(f <= 10){
            f++;
        }
    }
}