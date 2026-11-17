# C4_kontekst.md

## C4 Kontekst - SKInstructor Booking Service

**Uporabniki**
* **Smučar (Stranka):** Končni uporabnik, ki želi pregledati urnik zasedenosti učitelja, izbrati prost termin in ustvariti rezervacijo ter izvesti plačilo.

**Sistem**
* **Booking Service (Naš sistem):** Zaledna mikrostoritev (API), ki je odgovorna za celoten življenjski cikel rezervacije. Sistem preveri zasedenost, začasno zadrži termin, sproži plačilo in ob uspehu rezervacijo trajno zapiše v svojo lastno relacijsko bazo podatkov (PostgreSQL - tabela `bookings`).

**Zunanji sistemi**
* **Payment Service (Mock plačila):** Zunanja mikrostoritev, na katero naš sistem izvede sinhronski HTTP POST klic (zahtevek za plačilo). Booking sistem od njega pričakuje potrditev uspešnosti transakcije (`SUCCESS`).
* **Catalog Service (Katalog učiteljev):** Sistem, ki deluje kot glavni vir podatkov o učiteljih (za verifikacijo učiteljevega ID-ja ob ustvarjanju rezervacije).
* **Notification Service (Obvestila):** Mikrostoritev, ki pošilja poizvedbe na naš Booking sistem, da preveri, ali ima specifičen uporabnik resnično potrjeno in zaključeno rezervacijo, preden mu dovoli oddati obvestilo.