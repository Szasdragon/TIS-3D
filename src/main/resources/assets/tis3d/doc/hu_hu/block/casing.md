# Keret

![Keretded](item:tis3d:casing)

A Keret blokk képes akár hat modult is fogadni, egyet-egyet minden oldalán. Mivel egy Keretnek kapcsolódnia kell egy [Vezérlőhöz](controller.md), hogy működhessen, csak öt modul használható egyszerre. Szomszédos blokkok közös oldalait szintén nem lehet felhasználni. A modul automatikusan leválik ha egy másik Keret vagy Vezérlő blokk kerül elé.

A Keret négy portot biztosít minden modulnak, ami adatok továbbítását teszi lehetővé az élei mentén. Ha az éllel szomszédos egy másik Keret, akkor az információ aközös oldalon keresztűl a modullal szomszédos oldalra kerül át. Más esetben a Keret blokk éle menti szomszédos oldallal kerül összeköttetésbe.

Ez lehetővé teszi, hogy minden portnak legyen egy szomszédja. Bár ha nincs telepítve szomszéd egy modulnak, akkor a portról való olvasási vagy írási művelet nem tud befejeződni.

Egy Keretet akár le is lehet zárni a [Kúlccsal](../item/key.md). Lezárt Keretre nem lehet telepíteni modulokat, sem meglévőket eltávolítani. Ez hasznos, ha megakarjuk akadályozni, hogy illetéktelen személyek változtassanak a gép konfigurációján. Illetve a véletlen modul eltávolítást.

Továbbá lopakodás közben a Kúlcs segítségével zárhatóak vagy nyithatóak az egyes portok. Egy lezárt portra történő írási művelet meg fog akadni, megakadályozva a kétirányú adatkapcsolatot. Ez lehetővé teszi a még kompaktabb konfigurációkat és megspórolható néhány [Végrehajtó modul](../item/module_execution.md), amik a kommunikáció irányát szabályoznák. Például csak továbbítani egy [infravörös modul](../item/module_infrared.md) jelét egy [Vöröskő modul](../item/module_redstone.md) számára.