# README #

See on esimese praktikumi failide hoidla, mida saab kasutada ainult algseks lugemiseks.
Töötamiseks looge endale isiklik repositoorium, näiteks privaatne 'fork' bitbucket serverisse, millest saate luua klooni oma arvutisse.

## Näidete kasutamine käsurealt ##
#### Kompileerimine: ####

```
#!bash

javac -cp src src/Answer.java
```

#### Käivitamine: ####

```
#!bash

java -cp src Answer
```


### Testide kasutamine ###
#### Testi kompileerimine: ####

```
#!bash

javac -cp 'src:test:test/junit-4.12.jar:test/hamcrest-core-1.3.jar' test/AnswerTest.java

```
Sama Windows aknas (koolonite asemel peavad olema semikoolonid):

```
#!bash

javac -cp 'src;test;test/junit-4.12.jar;test/hamcrest-core-1.3.jar' test/AnswerTest.java


```

#### Testi käivitamine: ####

```
#!bash

java -cp 'src:test:test/junit-4.12.jar:test/hamcrest-core-1.3.jar' org.junit.runner.JUnitCore AnswerTest
```

Sama Windows aknas (koolonite asemel semikoolonid):

```
#!bash

java -cp 'src;test;test/junit-4.12.jar;test/hamcrest-core-1.3.jar' org.junit.runner.JUnitCore AnswerTest
```
