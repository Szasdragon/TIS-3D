# TIS-3D Használati útmutató

"A Mozaik Intelligens Rendszer (Tessellated Intelligence System, TIS) egy masszív, párhuzamos adatfeldolgozásra képes számítógép. Felépítésében egymással összekapcsolt szabványos kommunikációt használó elemekből áll. TIS ideális olyan komplex, töbszálú adatfeldolgozáshoz, mint például automatikus pénzügyi utalások, tömeges adatgyűjtés, civil viselkedés elemzés." - *részlet a TIS-100 Használati útmutatóból*

TIS-3D egy három dimenziós változata a TIS rendszernek. Felhasználható más szerkezetek vezérlésére, ami másként csak nagy méretű, bonyolult vöröskő szerkezetettel lehetne megvalósítani. De akár önmagában is kihívás elé állíthatja önt.

## Számítógép leírása
TIS-3D lehetővé teszi moduláris, nagy teljesítményű számítógépek építését. Egy számítógép áll egy [Vezérlő](block/controller.md) blokkból és akár több (alapértelmezetten nyolc) [Keret](block/casing.md) blokkból. A Vezérlő és a Keret blokkok akkor vannak egymással kapcsolatban, ha oldalaik egymással érintkeznek. A Keret blokkok egymást is ugyan ahhoz a Vezérlőhöz kapcsolják. Ha `C1` kapcsolódik a Vezérlőhöz, akkor `C2` is kapcsolódik hozzá, ha az `C1`-hez kapcsolódik.

Egy számítógép pontosan egy Vezérlőt tartalmazhat. Ha több Vezérlő kapcsolódik egymással közvetve vagy közvetlenűl, a számítógép nem fog beindúlni. A számítógép akkor sem indul be, ha több Keret csatlakozik hozzá mint amennyi maximálisan megengedett.

A számítógép működtetéséhez a Vezérlőt vöröskő jellel kell ellátni bármely oldalán. A számítógép sebessége függ a jel erőségétől. Több különböző jel előre nem meghatározott működés produkálhat. Kérjük forduljon a Vezérlő gyártójához további információkkal kapcsolatban, hogy elkerülje a jótállás elvesztését. A leggyengébb jel megállítja a számítógépen futó programot. A jel megszűnése alaphelyzetbe állítja a számítógépet.

## Modulok leírása
Egy Keret akár hat [modult](item/index.md) is fogathat, mindegyik egy-egy oldalára telepíthető. Egy modul képes kommunikálni négy közvetlen szomszédjával. Az egyes élek nevei az alábbiak: `up` (felső), `right` (jobb oldali), `down` (alsó) and `left` (bal oldali). Ezek a portok lehetővé teszik a szomszédos modulok egymás közötti kommunikációt. Képesek külön-külön ezekről olvasni vagy írni értékeket.

Minden egyes írás-olvasás művelet kizárólagos. Egy modul rendszerint blokkolva lesz amíg tart a művelet. *Egyes gyártók esetenként eltérhetnek a szabványtól*. Ha két szomszédos modul egyszerre próbálnak egymás közös portjáról olvasni, akkor egymást kölcsönösen befagyaszják. Ha egy modul egy olyan portjára ír, aminek nincs szomszédja, önmagát fogja lefagyasztani. Az ilyen fagyásokat a számítógép alaphelyzetbe állítása tudja csak megoldani. Modulok működés közbeni cseréje technikailag megvalósítható, de nagy valószínüséggel nem kívánt eredményeket szűlhet.