# Prérequis
Pour démarrer le projet, il faut disposer d'un jdk 11 et du programme maven.
 - Télécharger le JDK 11 : [https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/windows-info.html](https://docs.aws.amazon.com/corretto/latest/corretto-11-ug/windows-info.html)
 - Télécharger maven : [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

# Configuration des paramètres du serveur SMTP
Il faut modifier les propriétés suivantes du fichier `./src/main/resources/application.yml` :
 - host: adresse-du-serveur-smtp
 - port: port-du-serveur-smtp
 - username: adresse-mail
 - password: mot-de-passe

# Démarrer le projet
```bash
$ mvn spring-boot:run
```

# Déclencher l'envoi de mail
Une fois l'application démarrée, il suffit de se rendre à l'adresse suivante :
[http://localhost:8080/](http://localhost:8080/)
