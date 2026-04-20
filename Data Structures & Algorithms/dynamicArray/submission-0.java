class DynamicArray {

    private int capacity;
    private int length;
    private int[] arr;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr  = new int[this.capacity];
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        //error handling 
        if (length == this.capacity){
            resize();
        }
        arr[length] = n;
        length ++ ; 
    }

    public int popback() {
        int popbackValue = this.arr[length -1];
        this.length = this.length -1;
        
        return popbackValue;
    }

    private void resize() {
        this.capacity  = this.capacity*2;
        int[] tempArr  = new int[this.capacity];

        for( int i = 0; i < this.length ;i++){
            tempArr[i]= this.arr[i];
        }
        this.arr = tempArr;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
