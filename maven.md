# Build dengan Maven #

## Konsep Build Tools ##

### Apa itu build ###

* proses untuk mengolah source code menjadi aplikasi yang siap pakai

### Fitur build tools ###

* dependency management : mencari library yang kita pakai dalam kode program kita
* compile : mengubah source code menjadi aplikasi yang bisa dijalankan
* minify/obfuscate : membuang/mengurangi jumlah karakter dalam kode program, supaya ukurannya menjadi lebih kecil. Lazim digunakan dalam CSS, JavaScript, PHP, Android, dsb
* package : membundel / membuat paket sesuai dengan target deployment. Contoh : jar, war, apk, deb, dmg, [AMI (amazon machine image)](http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/AMIs.html), [Docker](http://docker.io/)
* run
* run test
* membuat skema database / menjalankan SQL
* memeriksa format penulisan kode program (spasi, indentasi, tanda kurung, dsb)

### Macam-macam build tools ###

* Java

     * Ant
     * Maven
     * Gradle
     * SBT

* C/C++

     * make

* Ruby

    * rake

* JavaScript

    * Grunt
    * Gulp

* PHP

   * Composer

