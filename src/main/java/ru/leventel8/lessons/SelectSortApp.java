package ru.leventel8.lessons;

class SelectSortApp
{
    public static void main(String[] args)
    {
        int maxSize = 100000;                                        // максимальный размер массива
        ArraySel arr;
        arr = new ArraySel(maxSize);                                 // создание нового массива размера maxSize

        for(int j=0; j<maxSize; j++){                                // вставка рандомныхэлемнтов в массив
            long n = (long)(java.lang.Math.random()*(maxSize-1));
            arr.insert(n);
        }

        arr.display();                                  // вывод содержимого

        arr.selectionSort();                            // сортировка выбором

        arr.display();                                  // вывод содержимого
    }// end main()
} // end class SelectSortApp