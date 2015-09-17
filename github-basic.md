1. Registrasi di https://github.com
2. Buat repository (New Repository)
   - beri nama. Misalnya pemrograman-3
   - pilih blank (jangan inisialisasi dengan readme)
   - Klik OK
   - Akan muncul URL repository. Klik yang https, kemudian copy

3. Buat repository di komputer local dengan perintah
   git init nama-repository
   misal : git init pemrograman-3

4. Masuk ke folder yang terbentuk
   cd pemrograman-3

5. Buat/masukkan file (dengan windows explorer) ke dalam folder
6. Edit dan save file
7. Masukkan file ke repository local
   git add .
   git commit -m "commit saya yang pertama"

8. Setup repository kita yang di Github
   git remote add github https://url.yang.tadi.dicopy

9. Upload isi repository local ke github
   git push -u github master

10. Ulangi langkah 5, 6, 7 untuk menambah file baru
11. Untuk upload selanjutnya, cukup dengan perintah
    git push