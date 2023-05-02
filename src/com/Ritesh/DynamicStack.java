package com.Ritesh;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if (isFull()){
            //double the array size
            int[] temp = new int[data.length * 2];

            //coping the previous items into new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //insert item
        return super.push(item);
    }
}
