# UserApp_Backend

Aplikacja umożliwiająca dodawanie użytkowników do bazy danych oraz
pobieranie listy zapisanych użytkowników. Wykorzystane technologie:

- Java 8
- Spring Boot
- Hibernate JPA
- RestApi

Aby uruchomić aplikację trzeba zainstalować JDK lub JRE w wersji minimum 1.8. Część backendowa znajduje się na porcie 8080.
Sprawdzenie działania aplikacji może odbyć się na dwa sposoby.
Pierwszym z nich jest uruchomienie części frontendowej projektu. 
Należy zainstalować do tego celu Node.js w wersji 10.9.0 lub nowszej
oraz Angular CLI (w moim przypadku Angular CLI: 8.3.3 oraz Node: 10.16.3).
Część frontendową projektu uruchamiamy wchodząc do katalogu projektu oraz
w wierszu poleceń wpisując polecenie ng serve --open.
Część frontendowa znajduje się na porcie 4200.

Drugim sposobem jest wykorzystanie programu klienckiego REST 
np. Insomnia czy Postman oraz obsłużenie podstawowych metod w programie
(get oraz post).
