# lab3


Zadanie1

Twoim zadaniem jest przygotowanie zestawu klas, odzwierciedlających zachowanie ułamków. Mechanizm ma pozwolić na:

    odczytywanie współczynników wielomianu
    dodawanie dwóch wielomianów
    wypisanie wielomianu na konsoli terminala
    porównywanie wielomianów

Zadanie2

Twoim zadaniem jest zaimplementowanie mechanizmu, który pozwoli na porównywanie ze sobą obiektów klas Person oraz Address

Dwa obiekty uznajemy za takie same gdy:

    wszystkie wartości pól w obiektach są takie same
    jeżeli pole jest referencją do innego obiektu lub kolekcji obiektów (klasa Person będzie miała referencję do ArrayListy obiektów klasy Address) to
        wartości pól w referencjach także powinny być równe (tj. pola w poszczególnych adresach)

W przeciwnym przypadku obiekty są różne.

Aby rozwiązać to zadanie należy nadpisać metody equals hashCode toString, które klasa dziedziczy po klasie Object

Warto wykorzystać klasę StringBuilder w implementacji metody toString

Zadanie3 

Twoim zadaniem jest zaimplementowanie i przetestowanie hierarchii składającej się z następujących klas: Osoba, Student, Wykładowca oraz Stypendysta. Poszczególne klasy zawierają następujące cechy:

    Osoba: imię, nazwisko, rok urodzenia oraz płeć
    Student: zawiera wszystkie cechy zawarte w klasie Osoba oraz numer indeksu
    Wykładowca: zawiera wszystkie cechy zawarte w klasie Osoba oraz tytuł ( tytuł naukowy lub stopień naukowy)
    Stypendysta: zawiera wszystkie cechy zawarte w klasie Student oraz kwotę stypendium

Każda klasa powinna również zawierać:

    metodę wyświetlającą na ekranie konsoli pełną informację o konkretnej osobie


Zadanie 4 

Filtrowanie kolekcji ofert samochodowych. Klient ma mieć możliwość wyboru kryteriów po jakich będzie wyszukiwał oferty samochodów znajdujących się w naszej bazie. Do takich kryteriów będą należeć:

    Cena od/do
    Słowo kluczowe (tytuł ogłoszenia)
    Data dodania ogłoszenia
    Rocznik auta
    Przebieg auta

Twoje zadaniu polega na zaprojektowaniu architektury klas i interfejsów które zamodelują opisany probelm

Zadanie 5

Napisz zgodnie z zasadami programowania obiektowego program,
który wczytuje z klawiatury imię i nazwisko, zapisuje
te dane do pliku tekstowego dane.txt, a następnie odczytuje je
z tego pliku i wyświetla na ekranie komputera. Klasa powinna
zawierać trzy metody:
 czytaj_dane() — metoda wczytuje z klawiatury imię
i nazwisko.
 zapisz_dane_do_pliku() — metoda zapisuje imię i nazwisko
do pliku tekstowego o nazwie dane.txt.
 czytaj_dane_z_pliku() — metoda odczytuje dane z pliku
dane.txt i wyświetla je na ekranie komputera.

zadanie 6.

Dodaj klasę Employee która będzie podstawą kolejnych klas.
	   Ma posiadać pola name i surname, pusty konstruktor oraz
	   drugi konstruktor przyjmujący name i surname ustawiający te pola.
	   Dodatkowo potrzebna jest metoda printInfo() pokazująca w konsoli dane klasy
	2. Zapisz klasę Administrator która rozszerza Employee i ma pole String
	   o nazwie certificates. Dodaj również konstruktor ustawiający name, surname
	   i certificates oraz metodę printInfo() pokazujące dane instancji w konsoli.
	3. Dodaj klasę Programmer rozszerzającą Employee i mającą pole String languages.
	   Dodatkowo zapisz konstruktor przyjmujący parametry name, surname i languages.
	4. W klasie Main stwórz po jednej instancji Employee, Administrator i Programmer.
       Wywołaj printInfo() na każdej z nich.
	5. Dla testu dodaj final przed Employee aby sprawdzić czy pojawi się błąd
	   kompilacji o braku możliwości rozszerzania klasy.
       
zadanie 7.

1. Dodaj dwie klasy klasy Bike i rozszerzającą ją klasę MotorBike
	2. Klasa Bike ma publiczną zmienną brand typu String
	   Dodatkowo zapisz zmienną name z modyfikatorem protected typu String
	   Następnie dodaj prywatną zmienną String z modyfikatorem private
	3. W Bike musi być też pusty konstruktor
	4. Drugi konstruktor Bike przyjmuje brand, name i zapisuje te
	   wartości w instancji. Dodatkowo wpisz jako type "bike".
	5. Bike musi mieć również metodę setType ustawiającą type
	   z przekazaną wartością type jako parametr
	6. Na koniec klasy Bike dodaj metodę printInfo() prezentującą w konsoli brand, name i type
	7. Klasa MotorBike rozszerza Bike.
	8. MotorBike ma jeden konstruktor przyjmujący parametry brand i name przekazując je do
	   konstrkutora Bike. Dodatkowo wywołaj setType() przekazując wartość "MotorBike"
	9. Klasa Motorbike posiada również metodę printInfo() pokazującą w konsoli tekst "MotorBike".
	   Dodatkowo wywołuje metodę printInfo() klasy Bike.
	10. W klasie Main stwórz instancję Bike oraz MotorBike z dowolnymi danymi i wywołaj printInfo()

zadanie 8.

1. Stwórz klasę Flat z zmiennymi typu String o nazwie city i street. Dodaj do niej pusty
     konstruktor oraz kolejny przyjmujący city, street  i ustawiający te wartości w instancji.
     Dodaj automatycznie gettery i settery oraz toString() z menu Alt + insert.
  2. Napisz klasę House rozszerzającą klasę Flat posiadającą pole float parcelSize.
     Dodaj konstruktor przyjmujący city, street i parcelSize. Pamiętaj aby wywołał nadrzędny
	 konstruktor Flat do ustawienia city i street. Tak samo dodaj gettery, settery i toString.
  3. Dodaj klasę Residence rozszerzającą House i dodatkowo przyjmującą zmienną float garageSize.
     Jej konstruktor przyjmie: city, street, parcelSize i garageSize, wywołaj nadrzędny konstruktor.
	 Podobnie jak z Flat i House dodaj gettery, settery i toString z menu Alt + Insert.
  4. W klasie Main stwórz tablicę homes typu Flat z 10-cioma elementami;
  5. Stwórz pętlę for, która przejdzie po tablicy homes i wylosuje liczbę od 0 do 2. Jeśli wyjdzie
     0 to do tablicy o aktualnym indeksie dodana będzie nowa instancja Flat. Jeśli 1 to dodana
     będzie instancja House, 2 to Residence, dane moga być dowolne dla konstruktorów.
  6. Dodaj kolejną pętle for która ponownie przejdzie po homes, ale tym razem dzięki instanceof
     sprawdzi jakiego typu aktualny element jest w tablicy. Jeśli jest to Residence to zrób konwersje na
	 tą klasę i pokaż w konsoli wartość garageSize z gettera i rezultat toString(). Jeśli to
     House po konwersji pokaż wartość parcelSize z gettera i toString.
	 Na koniec pokaż toString z Flat. Sprawdzając kolejne warianty użyj if else if...
     
 zadanie 9.
 
 1. Stwórz klasę abstrakcyjną Employee posiadającą:
		a) pola protected String name i surname
		b) konsktruktor oraz gettery i settery dla powyższych pól
		c) publiczna abstrakcyjną metodę toString zwracającą łańcuch znaków
	2. Stwórz klasę Programmer rozszerzającą abstrakcyjną klase Employee:
		a) dodaj do tej klasy pole String protected o nazwie languages
		b) dodaj getter i setter
		c) na koniec stwórz metodę toString, która prezentowała by dane z Employee i Programmer
        
 zadanie 10.
 
 1. W Main dodaj strukturę try catch finally w której powstanie błąd w wyniku
	   dzielenia przez zero. Złap ArithmeticException i wywołaj na wyjątku printStackTrace()
	   W finally pokaż informację o wywołaniu tego bloku kodu w konsoli.
	2. Dodaj strukturę try catch i stwórz oraz wywołaj własny wyjątek TestException.
	   Stwórz klasę wyjątku w osobnym pliku. Wywołaj printStackTrace na wyjątku.


Zadanie 11

Utwórz klase Angle zawierajace jedno pole prywatne x typu double przechowujace
miare kata podana w radianach. W klasie zbuduj konstruktor z jednym parametrem
double (miara kata w radianach) i szesc metod zwracajacych wartosci funkcji trygonometrycznych
kata reprezentowanego przez obiekt. Napisz program demonstrujacy
dzialanie konstruktora i utworzonych metod.

Zadanie 12(rozszerzenie zadania 11).

Dolacz do klasy Angle publiczne metody (radian() i degree()) zwracajace liczbe typu
double, miara kata reprezentowanego przez obiekt wyrazona w radianach i stopniach.
Napisz program demonstrujacy dzialanie tych metod.

zadanie 13.

Dane liczbowe ze standardowego wejscia mozemy wczytywac w postaci lancucha
znaków, a nastapnie konwertowac je na liczby odpowiedniego typu. Napisz program,
który w ten sposób wczyta z klawiatury liczbe zmiennoprzecinkowa i zareaguje poprawnie na popenione bledy.

zadanie 14.

Napisz program obliczajacy odwrotnosc liczby cakowitej wprowadzonej z klawiatury.
a) Przechwyc i obsluz wszystkie wyjatki, jakie moga pojawic sie podczas
wczytywania danych i wykonywania obliczen.
b) Zrealizuj zadanie bez obsugi wyjatków.
