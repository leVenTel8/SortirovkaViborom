class SelectSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 100000;
        ArraySel arr;
        arr = new ArraySel(maxSize);

        for(int j=0; j<maxSize; j++){
            long n = (long)(java.lang.Math.random()*(maxSize-1));
            arr.insert(n);
        }

        arr.display();

        arr.selectionSort();

        arr.display();
    }
} 