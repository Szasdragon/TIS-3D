# Vezérlő

![Nagyvezír](item:tis3d:controller)

A Vezérlő blokk a TIS-3D számítógép szíve. Ez láttja el energiával a többi kapcsolódó [Keretet](casing.md) és gondoskodik a gép központi órájáról is. A Vezérlő vöröskő jellel lehet működtetni. Erősebb jel gyorsabb program végrehajtást tesz lehetővé.  Különleges eset az egyes erőségű jel, a számítógép egy pillanat állj állapotba kerül, azaz nem kapcsol ki, de nem is halad tovább az utasítás végrehalytásal. Ekkor a különböző tárolt értékek nem vesznek el.

Egy Vezérlő maximálisan csak adott mennyiségű (alapértelmezetten nyolc) [Keret](casing.md) blokkot tud kiszolgálni. Ha a megengedetnél több Keret blokk csatlakozik hozzá, a Vezérlő egy vészleállást hajt végre, és addig működés képtelen marad, amíg el nem lesz távolítva a felesleges [Keret](casing.md) blokkok.

Több Vezérlő nem kapcsolódhat egymáshoz sem közvetlenűl, sem közvetve. Ha mégis, akkor az összes vészleállást fog végrehajtani, és működés képtelen maradnak, amíg a kapcsolat fenáll.

Egy kapcsolat akkor érvényes ha blokkok közös oldallal rendelkeznek. Ez lehet Vezérlő-[Keret](casing.md) vagy [Keret](casing.md)-[Keret](casing.md) is.