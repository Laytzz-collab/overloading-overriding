# Jobsheet 6 - Overriding dan Overloading

Maven project untuk Jobsheet Overriding dan Overloading, berisi dua percobaan:

## Struktur Project

```
src/main/java/
├── overriding/          (Percobaan 1: Overriding)
│   ├── BangunDatar.java
│   ├── SegitigaSamaKaki.java
│   ├── SegiEmpat.java
│   ├── Lingkaran.java
│   └── Main.java
└── overloading/         (Percobaan 2: Overloading)
    ├── BangunDatar.java
    ├── SegitigaSamaKaki.java
    ├── SegiEmpat.java
    ├── Lingkaran.java
    └── Main.java
```

## Cara Build & Menjalankan

Compile project:
```
mvn compile
```

Menjalankan Percobaan 1 (overriding):
```
mvn exec:java -Dexec.mainClass="overriding.Main"
```

Menjalankan Percobaan 2 (overloading):
```
mvn exec:java -Dexec.mainClass="overloading.Main"
```

Atau build jar lalu jalankan manual:
```
mvn package
java -cp target/jobsheet-overriding-overloading.jar overriding.Main
java -cp target/jobsheet-overriding-overloading.jar overloading.Main
```

## Catatan

- Paket **overriding** berisi kelas dengan konstruktor berparameter (sesuai Percobaan 1) dan method `hitungLuas()`, `hitungKeliling()` di-override dari `BangunDatar`.
- Paket **overloading** berisi kelas yang hanya memiliki konstruktor default, dengan method `hitungLuas()`, `hitungKeliling()`, dan `hitungDiagonal()` yang di-overload (dua versi: tanpa parameter dan dengan parameter) sesuai Percobaan 2.
