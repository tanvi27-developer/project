
 interface Hello {
    void msg();
}

class Example implements Hello {

    public void msg() {
        System.out.println("Hello Interface forMethod");
    }


    public static void main(String[] args) {
        Example obj = new Example();
        obj.msg();
    }
}