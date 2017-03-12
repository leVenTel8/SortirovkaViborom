package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArraySelTest {
    /**
     * проверка вставки
     */
    @Test
    public void testInsert() {
        ArraySel arraySel = new ArraySel(10);       // создание объекта массива размером в 10 элементов
        arraySel.insert(8);                        // вставка элементов
        arraySel.insert(7);
        assertEquals(8,arraySel.getFirst());    // сравнение ожидаемого и возвращенного методом числа

    }//end testInsert()

    /**
     * проверка сортировки
     */
    @Test
    public void testSelectionSort() {
        ArraySel arraySel = new ArraySel(10);
        arraySel.insert(8);
        arraySel.insert(7);
        arraySel.insert(15);
        arraySel.insert(1);
        arraySel.selectionSort();                       // сортировка массива
        assertEquals(1,arraySel.getFirst());    // сравнение ожидаемого и возвращенного методом числа

    }//end testSelectionSort()

}//end class ArraySelTest