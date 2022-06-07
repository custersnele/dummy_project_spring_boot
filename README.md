## Demoproject voor dependencies
Tijdens het examen is een startproject beschikbaar. Om er zeker van te zijn dat alle 3rd party
libraries correct zijn gedownload voor je naar het examen komt kan je dit project downloaden en starten.

Wanneer je dit project opstart zal een h2 in-memory databank worden
aangemaakt waarin data wordt toegevoegd (bestand data.sql).
Het Rest endpoint GET http://localhost:8080/dependencies/messages
is beschikbaar na het opstarten van de toepassing en geeft de volgende boodschappen
terug.
`
[
 {"id":1,"text":"Het is juni."},
 {"id":2,"text":"Veel succes met de examens!"}
]
`

Met de URL http://localhost:8080/dependencies/messagecount wordt
een Servlet aangesproken.

Het project bevat ook enkele unit testen. Vergewis je ervan dat deze testen slagen als je ze
uitvoert.

Laat zeker iets weten als je problemen ondervindt met het uitvoeren van dit project,
anders ga je waarschijnlijk tijdens het examen ook problemen ondervinden!
Indien je tijdens het examen toch blijvende problemen ondervindt, voeg dan een extra
document bij je examenoplossing met de foutmelding (exception met stacktrace), en een
korte beschrijving van welke aanpassingen je hebt uitgetest om het probleem te verhelpen.


#### Documentatie bij upgrade

[Using data.sql to import data](https://stackoverflow.com/questions/67695069/spring-boot-datasource-initialization-error-with-data-sql-script-after-2-5-0-upg)

[Ignore data.sql for unit testing](https://stackoverflow.com/questions/52092519/spring-boot-ignore-data-sql-when-running-unit-tests)
