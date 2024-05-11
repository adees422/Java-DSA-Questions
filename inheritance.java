class MyClass {
    private int hiddenVariable;

    // Getter method to access the hiddenVariable
    public int getHiddenVariable() {
        return hiddenVariable;
    }

    // Setter method to modify the hiddenVariable
    public void setHiddenVariable(int value) {
        hiddenVariable = value;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Accessing and modifying the hiddenVariable through public methods
        obj.setHiddenVariable(42);
        System.out.println(obj.getHiddenVariable());
    }
}
