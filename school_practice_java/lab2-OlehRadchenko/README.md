Zadanie 1.
W mainie

Zadanie 2.

Gromadzimy wode mineralna. Sa trzy rodzaje butelek: o pojemnosci 2 litry(duze), srednie o pojemnosci 1 litr oraz male o pojemnosci 0,5 litra. 
Stworzyc klase MyWater z metodami:
-void addLarge(int) - dodaje do zapasu wody podana jako argument liczbe duzych butelek
-void addMedium(int) - dodaje do zapasu wody podana jako argument liczbe srednich butelek
-void addSmall(int) - dodaje do zapasu wody podana jako liczbe malych butelek
oraz z metodami umozliwaiajacymi uzyskanie informacji o tym ile jest kazdego rodzaju butelek oraz jaka jest laczna pojemnosc zgromadzonej wody.
Pojemnosci butelek (duzych, srednich, malych) przedstawic jako pola klasy.
Klase przetestowac dodajac do zapasu rozne liczby butelek wody i wyprawadzajac potem komunikat w rodzaju:
```
Mam teraz 6.5 litrow wody
duzych butelek: 2
srednich butelek: 1
malych butelek: 3
```

Zadanie 3.

Zdefiniowac klase Box, ktorej obiekty beda stanowic pudelka o zadanych rozmiarach (szerokosc, wysokosc).
Dostarczyc w tej klasie specjalnych metod laczenia pudelek:
* diagonalnie (zwraca pudelko o rozmiarach rownych sumie szerokosci i wysokosci laczonych pudelek) - nazwa metody joinDiagonal,
* poziomo (zwraca pudelko o rozmiarach rownych sumie szerokosci laczonych pudelek i wysokosci rownej maksimum z wysokosci pudelek) - nazwa metody joinHorizontal
* pionowo (zwraca pudelko o rozmiarach rownych sumie wysokosci laczonych pudelek i szerokosci rownej maksimum z szerokosci pudelek) - nazwa metody joinVertical

Przetestowac klase w nastepujacy sposob
* uzytkownik programu w dialogu wejsciowym wprowadza dowolna liczbe szerokosci pudelek
* wysokosc tych pudelek rowna jest 2*szerokosc
* wyprowadzic na konsole wielkosci (szerokosc, wysokosc) kazdego z pudelek
* polaczyc otrzymane pudelka w kombinacje diagonalne, wertykalne i horyzontalne i wyprowadzic na konsole ich rozmiary

Zadanie 4.
Stwórz klasę Tv opisującą telewizor wraz ze zmiennymi:
producent, model, rok produkcji i dodatkowe, które będą pasowały do tego produktu.
Dodaj jedną metodę printBasicData() prezentującą w konsoli te pierwsze trzy powyższe
wartości przechowywane w instancji klasy. Na koniec dodaj instancję do głownego
programu i wartości podstawowych pól oraz wywołaj metodę printBasicData().

Zadanie 5.
Stwórz Student opisującą ucznia z następującymi zmiennymi:
imię, nazwisko, miasto, wiek.
Dodaj do klasy dwa konstruktory:
-pusty podstawiający domyślne wartości jak np. Jan Kowalski
-przyjmujący wszystkie powyższe dane
Stwórz w klasie Student medotę printBasicData() pokazującą powyższe dane w konsoli.
Na koniec utwórz dwóch studentów, jeden z użyciem pustego konstruktora,
drugi z użyciem konstruktora z przekazaniem danych studenta.

Zadanie 6.
(rozszerzenie zadania 5)
Następnie utwórz pelne menu gdzie użytkownik będzie mógł dodawać nowego Studenta do listy oraz go usuwać (po przekazniu z konsoli jego danych). Dodaj również opcje pokazania pełnej listy studentów.

Zadanie 7.
Stwórz klasę Wallet, która w konstruktorze przyjmie kwotę początkową np. 3000,
wewnątrz zostanie przechowana jako float money.
Portfel ma metodę addMoney() z parametrem amount, która doda tą kwotę do money.
Na podobnej zasadzie zadziała removeMoney() odejmując przekazaną kwotę.
Ostatnią metodą portfela jest printAmount(), która ma pokazać aktualną wartość portfela.

W głównej klasie Main stwórz portfel oraz pętlę dla 6 miesięcy przychodów i wydatków. 
W każdym miesiącu po portfela dodaj 5000, również odejmij 2000 i następnie 1000zł.
Na koniec programu wyświetl podsumowanie portfela po pół roku pracy.

Zadanie 8.
1. Stwórz dwie klasy Car i CarFactory
2.Klasa Car posiada zmienne: model, brand i color oraz konstruktor dla nich.
3.Dodatkowo klasa Car musi posiadać metodę seter i  getter, która zwróci kolor auta,
ponadto musi mieć też metodę printInfo() wyświetlająca w konsoli swoje dane.
4.Klasa CarFactory posiada metodę buildCar() i zwraca Car. Metoda ta wybiera losowy kolor
z trzech (czerwony, czarny, biały) i tworzy nowy samochód wywołując konstruktor Car.
Jako dane wskazane są Ford Mustang i losowy kolor.
Pamiętaj o wykorzystaniu Math.random() do uzyskania wartości od 0 do niemal 1 oraz
Math.floor() do zaokrąglenia do liczby całkowitej, gdyż index tablicy jest liczbą całkowitą.
Ważne są również konwersje liczb z double do int.
W Main dodaj dwie instancje Car i pokaż ich kolor, wywołaj printInfo().

Zadanie 9.
Stwórz klasę Roadster z zmiennymi:
    1. typu float: topSpeed, acceleration, crazyTopSpeed, crazyAcceleration

    Klasa Roadster musi mieć też dwa konstruktory:
    1. Konstruktor pierwszy przyjmuje topSpeed i acceleration i ustawia ich wartości w instancji
    2. Drugi konstruktor przyjmuje powyższe wartości oraz crazyTopSpeed i crazyAcceleration,
        ustawia w instancji wzystkie wartości razem z crazymode jako true.
    3. Metody getTopSpeed() i getAcceleration() zwracają topSpeed i acceleration
    4. Przeciążona metoda getTopSpeed(boolean crazyMode) zwraca crazyTopSpeed jeśli
       przekazano jako argument crazyMode i ma wartość true, w innym wypadku zwraca zwykłą prędkość
    5. Przeciążona metoda getAcceleration(boolean crazyMode) podobnie, jeśli przekazano
       crazyMode jako true to zwraca crazyAcceleration, jak false zwykłe przyśpieszenie
    6. Stwórz dwie instancje Car z różnymi wartościami maksymalnej prędkości
       i przyśpieszenia. Sprawdź czy wywołanie metody z crazyMode jako true daje wyższe
       wartości.

Zadanie 10.

Twoja firma dostała zlecenie na stworzenie oprogramowania dla dużego sklepu
internetowego „JavaMarkt”. Jedną z podstawowych funkcjonalności będzie
oprogramowanie koszyka zakupów, który potrafiłby uwzględniać różne promocje, rabaty
oraz oferty specjalne, takie jak:

* Jeśli wartość zamówienia jest większa niż np. 300 zł klient otrzymuje 5% zniżki na zakupione towary
* "3 w cenie 2" - Jeśli klient kupi conajmniej 3 produkty to 3 najtańszy otrzymuje gratis
* Jeśli wartość zamówienia przekracza wartość 200 zł klient otrzymuje firmowy
kubek gratis

Twoim zadaniem jest zaimplementowanie logiki, operującej na obiektach typu ‘Product’,
która umożliwiałaby: 

1. Sortowanie kolekcji produktów po cenie
2. Wyszukiwanie najtańszego/najdroższego produktu w zadanej kolekcji produktów
3. Wyszukiwanie n najtańszych produktów w zadanej kolekcji
produktów
4. Wyświetlanie w konsoli informacje o wszystkich produktach w zadanej kolekcji
produktów
5. Aplikowanie opisanych powyżej rodzajów promocji na zadanej kolekcji produktów 

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/PJMPR/lab03-intruduction-to-classes/main/UML/diagram3.puml)

Zadanie 11.

System bankowy pozwala na zlecenie operacji bankowych na rachunku klienta.
Do takich operacji należą:
* wpłata środków na konto - możliwe zawsze
* wypłata środków z konta - możliwe gdy na koncie jest wystarczająca ilość środków
* wykonanie przelewu z konta na konto - możliwe gdy na koncie jest wystarczająca ilość środków
    + przelewy wykonywane są 2 razy dziennie

Zaprojektuj zestaw klas, które będą modelowały zachowannie rachunku bankowego podczas ww. operacji

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/PJMPR/lab05-Objects-Modelling/main/UML/diagram1.puml)

Zadanie 12.
(rozszerzenie zadania 11)

System bankowy pozwala na zlecenie operacji bankowych na rachunku klienta.
Do takich operacji należą:
* wpłata środków na konto - możliwe zawsze
* wypłata środków z konta - możliwe gdy na koncie jest wystarczająca ilość środków
* wykonanie przelewu z konta na konto - możliwe gdy na koncie jest wystarczająca ilość środków
    + przelewy wykonywane są 2 razy dziennie

Każda taka operacja jest odkładana w historii rachunku bankowego, bądź rachunków w przypadku transferu środków.
Klient banku może przeglądać historię swojego konta z wybranego przedziału czasowego.

Zaprojektuj zestaw klas, które będą modelowały zachowanie historii rachunku bankowego oraz napisz logikę, dzięki której będzie można wybrać logi historii z dowolnego przedziału czasowego.

Zadanie 13.
1. Stwórz klase Truck
	   z zmiennymi: producent, model, ilość kół, kolor.
	2. Dodatkowo musi posiadać stałe:
	  - TOP_SPEED z wartością 100
	  - ACCELERATION ale uwaga bez wartości początkowej
	3. Dodaj pusty konstruktor, który ustawia:
	  - producenta na Freightliner
	  - model na 9664
	  - ilośc kół na 6
	  - akceleracje na 60
	4. Drugi konstruktor
	  - przyjmuje jako parametr kolor
	  - zapisuje kolor w instancji
	5. Dodaj metodę printInfo która pokaże producenta model i kolor w konsoli
	6. Utwórz instancję Truck przekazując kolor i wywołaj metodę printInfo()

Zadanie 14.
1. Stwórz klasę Item która posiada statyczną zmienną int numItems
	   o wartości  początkowej 0. Dodaj też stałą całkowitą o nazwie ID.
	2. Dodaj konstruktor przyjmujący jeden parametr całkowity id, który
	   przypisze przekazaną wartość do stałej ID.
	3. Zapisz statyczną metodę zwracającą int o nazwie getNextId(). Metoda
	   zwraca kolejny unikalny id na bazie statycznej numItems tylko pamiętaj
	   o inkrementacji tej wartości przy wywołaniu getNextId()
	4. Dodaj statyczną metodę getItem() zwracającą nowy Item, który będzie miał unikalny id
	5. Do item dodaj statyczną metodę printNumItems, która pokaże w konsoli
	   aktualną wartość numItems
	6. Kończąc Item dodaj zwykłą metodę printId() ktra pokaże w konsoli
	   wartość ID.
	7. W Main stwórz trzy elementy item np w pętli i wywołaj na nich printId()
	8. Na koniec programu wywołaj printNumItems() aby uzyskać ilość elementów Item.

Zadanie 15.
1. Stwórz nowy obiekt Date
2. Utwórz instancję SimpleDateFormat dla:
godziny:minut:sekund dnia.miesiąca.roku
3. Sformatuj datę używając SimpleDateFormat
wykorzystując metodę format()

//Podpowiedź:
Formatowanie daty
y - rok jako liczby np 2021                       
M - miesiąc w roku np. Jan czy 01                
d - dzień np. 10                                     
h - godzina (1-12)  np. 6                         
H - godzina (0-23)  np. 15                           
m - minuta np 45
s - sekunda np 56
S - milisekunda np 456
E - dzień tygodnia np pon.
D - dzień roku np 123
w - numer tygodnia w roku np 3
W - numer tygodnia w miesiącu np 2
a - A.M. / P.M.   np PM
z - time zone np Eastern Standard Time

Zadanie 16.
1. Stwórz instancję LocalDateTime i wywołaj now() aby otrzymać aktualną datę i czas
2. Zrób kolejną instancję i wywołaj of() aby przekazać dowolną datę i czas z przyszłości
3. Wywołaj isAfter na drugiej instancji względem aktualnego czasu i jesli zwróci
true pokaż tekst w konsoli opisujący że data jest z przyszłości

Zadanie 17.
1. Stwórz datę w przyszłości korzystając z timestamp,
dodaj do aktualnej daty 3 dni, 10 godzin i 25 minut
2. W date wywołaj getTime() aby uzyskać ilość milisekund
od 1 stycznia 1970r (1000 milisekund = 1 sekunda).
To jest Twój timestamp
3. Oblicz potrzebną ilość milisekund które musisz
dodać do aktualnego timestamp.
Np jedna godzina to 60 * 1000 * 60
4. Stwórz nowy obiekt Date i do jego konstruktora przekaż
powiększony timestamp, wyświetl nową datę.

Zadanie 18.

Należy utworzyć klasę PeselValidator ze statyczną, publiczną metodą ```isValid``` 
```
public class PeselValidator{
    public static boolean isValid(String pesel){
        
        /* Algorytm sprawdzający czy nr pesel jest prawidłowym numerem PESEL 
        (sprawdzić poprzez wyrażenie regularne oraz sumę kontrolną) */
        
        return false;
    }
}
```
Algorytm na wyliczenie sumy kontrolnej dla numeru pesel znajdziesz [tutaj](https://obywatel.gov.pl/pl/dokumenty-i-dane-osobowe/czym-jest-numer-pesel)

2. Należy utworzyć klasę Person w pakiecie
    * konstruktor przyjmujący numer PESEL
    * Właściowści:
        + imię i nazwisko (gettery i settery) 
        + nr pesel (getter) 
        + płeć odczytana z numeru PESEL (getter)
        + data urodzenia odczytana z numeru PESEL (getter)

![Class Diagram](http://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/PJMPR/lab04-introduction-to-properties/main/UML/diagram3.puml)


Zadanie 19. 
Kalkulator BMI:
18,5 <= BMI <= 24,9
Wzór:
Bmi = masa / (wzrost* wzrost)
Wzrost w metrach np. 1.8

Math.pow(a,b) pamiętaj, że zwraca double, potrzebna konwersja a do potęgi b.
Zaprezentuj w konsoli wynik bmi. Na koniec skonwertuj wynik na liczbę całkowitą.

Zadanie 20.
Stworzcie gre, w ktorej komputer bedzie losowal dowolna liczbe z przedzailu 0 do 100, a uzytkownik bedzie ja zgadywal wpisujac liczbe do konsoli. Program wypisze "moja liczba jest wieksza" jezeli jego liczba bedzie wieksza od tej zgadywanej, a w przeciwny wypadku "moja liczba jest mniejsza".Gdy trafimy w wybrana liczbe ma wpisac "Gilbert!". Ponadto program powinnien zliczac ilosc prob uzytkownika i wypisac je na konsoli podczas zakonczenia rozgrywki. 

