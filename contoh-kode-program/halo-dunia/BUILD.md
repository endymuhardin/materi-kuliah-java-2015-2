Cara Compile

1. Cari dulu joda-time.jar
2. Letakkan di suatu tempat, misalnya /home/endy
3. Compile dengan mencantumkan joda-time.jar di CLASSPATH

    ```
    javac -cp /home/endy/joda-time.jar src/* -d bin
    ```

Cara Run

1. Cari dulu joda-time.jar
2. Letakkan di suatu tempat, misalnya /home/endy
3. Compile dengan mencantumkan joda-time.jar dan folder bin di CLASSPATH

    ```
    java -cp /home/endy/joda-time.jar:bin belajar.Halo
    ```