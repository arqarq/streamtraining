# Stream Training

Zadania w tym repozytorium mają oswoić Was z używaniem Stream API. Jeżeli nie czujecie się jeszcze na siłach, aby rozwiązać zadania z jego użyciem, to postarajcie się rozwiązać zadania za pomocą zwykłych pętli.

1. Klasa TasksLongs
    * Zaimplementuj metodę findMaxElement tak, aby zwracała maksymalną wartość znajdującą się na przekazanej w parametrze liście
    * Zaimplementuj metodę findMinElement tak, aby zwracała minimalną wartość znajdującą się na przekazanej w parametrze liście
    * Zaimplementuj metodę findMedianElement tak, aby zwracała medianę wszystkich wartości (mediana to wartość przeciętna, a nie średnia!)
    * Zaimplementuj metodę countLongsGreaterThen tak, aby zwracała ilość wartości większych od wartości "minimalLongValue"
2. Klasa TasksInts (zwróćcie uwagę na to, że parametrem wejściowym jest tutaj tablica typów int)
    * Zaimplementuj metodę findMaxElement tak, aby zwracała maksymalną wartość znajdującą się na przekazanej w parametrze tablicy
    * Zaimplementuj metodę findMinElement(int[] ints) tak, aby zwracała minimalną wartość znajdującą się na przekazanej w parametrze tablicy
    * Zaimplementuj metodę findMinElement(int[] ints, int skippedAmount) tak, aby zwracała n-tą najmniejszą wartość znajdującej się na przekazanej w parametrze tablicy
    * Zaimplementuj metodę sum tak, aby zwracała sumę wszystkich elementów tablicy
3. Klasa TasksLists
    * Zaimplementuj metodę removeDuplicates tak, aby zwracała nową listę, z której zostały usunięte podwójne wartości (jeżeli jedna wartość występowała 2 lub więcej razy, to w wynikowej liście powinna znajdować się tylko raz)
    * Zaimplementuj metodę concatenateStrings tak, aby zwracała wszystkie wartości String zapisane w postaci jednego długiego ciągu znaków (jeżeli na liście znajdowały się String o wartościach "aaa", "bbb", "ccc", to wynikiem powinien być jeden String "aaabbbccc")
    * Zaimplementuj metodę filterByPrefix tak, aby zwracała tylko te wartości, które zaczynają się od danego tekstu
    * Zaimplementuj metodę filterBySuffix tak, aby zwracała tylko te wartości, które kończą się na dany tekst
    * Zaimplementuj metodę groupByLevelValue tak, aby zwracała mapę, w której kluczem będzie numer zapisany po słowie "Level-", a wartością będzie lista obiektów typu String zaczynająca się od tego levelu. Obiekty, które nie zaczynają się od słowa "Level" powinny zostać pominięte.
4. Klasa TasksMaps
    * Zaimplementuj metodę flattenPreserveDuplicates tak, aby zwracała wszystkie listy będące wartościami mapy jako jedną listę. Lista nie powinna usuwać duplikatów.
    * Zaimplementuj metodę flattenNoDuplicates tak, aby zwracała wszystkie listy będące wartościami mapy jako jedną listę. Lista powinna usunąć duplikaty.
