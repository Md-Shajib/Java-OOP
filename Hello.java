class Numbers {

    //Properties
    private int a;
    private int b;

    //Setter Method
    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}

    //Methods
    public void sum() {System.out.println(a+b);}
    public void sub() {System.out.println(a-b);}

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        //using setter instead of direct access
        obj.setA(2);
        obj.setB(8);

        obj.sum();
        obj.sub();
    }
}