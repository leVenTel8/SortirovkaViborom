package ru.leventel8.lessons;

class ArraySel {
    private long[] a;               //Переменная приватного типа, объявление массива
    private int nElems;             //Переменная приватного типа, объявление счетчика элементов массива

    /**
     * Конструктор при инициализации
     * принимает параметр max
     * @param max
     *      размер массива
     */
    public ArraySel(int max) {
        a = new long[max];
        nElems = 0;
    }

    /**
     * вставка в массив
     * @param value
     */
    public void insert(long value)
    {
        a[nElems] = value;                  // вставка value в ячейку nElems
        nElems++;                           // имнкримент nElems
    }// end insert()


    /**
     * вывод содержимого массива
     */
    public void display()
    {
        for(int j=0; j<nElems; j++)          // перебор элементов массива в цикле
            System.out.print(a[j] + " ");    // вывод содержимого массива
        System.out.println("");
    }// end display()

    /**
     * сортировка выбором
     */
    public void selectionSort() {
        int out, in, min;                               // переменные для реализации алгоритма

        for (out = 0; out < nElems - 1; out++) {        // внешний цикл
            min = out;
            for (in = out + 1; in < nElems; in++)       // внутренний цикл, перебор элементов и инкримент
                if (a[in] < a[min])                     // если следующий элемент меньше,
                    min = in;                           // то присвоить min значение меньшего элемента
            swap(out, min);                             // перестановка большего с меньшим элементов массива
        }
    }// end selectionSort()

    /**
     * swap
     * @param one, two
     *      перестановка двух аргументов
     */
    private void swap(int one, int two) {
        long temp = a[one];                         // временная переменная
        a[one] = a[two];                            // swap
        a[two] = temp;
    }// end swap()

    public long getFirst(){
        long first = a[0];
        return first;

    }
}// end class ArraySel

