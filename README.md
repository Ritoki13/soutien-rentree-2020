# <img src="https://raw.githubusercontent.com/IUTInfoAix-M2105/Syllabus/master/assets/logo.png" alt="class logo" class="logo"/> Introduction aux IHM en Java 

### IUT d’Aix-Marseille – Département Informatique Aix-en-Provence

* **Cours:** [M2105](http://cache.media.enseignementsup-recherche.gouv.fr/file/25/09/7/PPN_INFORMATIQUE_256097.pdf)
* **Responsable intérimaire:** [Cyril Pain-Barre](mailto:cyril.pain-barre@univ-amu.fr)
* **Responsable habituel:** [Sébastien NEDJAR](mailto:sebastien.nedjar@univ-amu.fr)
* **Enseignants actuels:** [Sophie Nabitz](mailto:sophie.nabitz@univ-avignon.fr), [Cyril Pain-Barre](mailto:cyril.pain-barre@univ-amu.fr)
* **Besoin d'aide ?**
    * La page [Piazza de ce cours](https://piazza.com/univ-amu.fr/spring2017/m2105/home).
    * Consulter et/ou créér des [issues](https://github.com/IUTInfoAix-M2105/tp1/issues).
    * [Email](mailto:sebastien.nedjar@univ-amu.fr) pour une question d'ordre privée, ou pour convenir d'un rendez-vous physique.

## Soutien Post Covid : une dernière couche de Java / IHM pour préparer l'hiver [![Build Status](https://travis-ci.org/IUTInfoAix-M2105/tp1.svg?branch=master)](https://travis-ci.org/IUTInfoAix-M2105/tp1)

L'objectif de cette séance est de reprendre les notions clés de l'enseignement de Java / IHM et de la Programmation 
Orientée Objet du S2 de l'an dernier afin de consolider les connaissances acquises durant le confinement.

#### Création de votre fork du TP

Comme il a été d'usage en TP, commencez par créer un fork du dépôt de ce TP. Pour ce faire, rendez-vous sur le lien suivant (TODO): 

[https://classroom.github.com/a/sq3xlG3c](https://classroom.github.com/a/sq3xlG3c) 

Rappelons que GitHub va vous créer un dépôt contenant un fork du dépôt 'IUTInfoAix-m2105/soutien-rentree-2020' et s'appellant 'IUTInfoAix-m2105/soutien-rentree-2020-votreUsername'. 

#### Lancement et paramétrages de l'IDE

Puisque vous n'avez probablement jamais encore utilisé IntelliJ IDEA sur les postes de travail du département, il vous 
faut paramétrer cet IDE afin de réaliser ce TP.

Pour ce faire, reportez-vous à la [section du TP1 concernée par ce paramétrage](https://github.com/IUTInfoAix-M2105/tp1#parametrageIDEA) et suivre toutes les instructions qui 
vous étaient données.

#### Première application, en mode texte : Notation d'étudiants

On veut écrire une petite application qui permet de gérer des notes d’étudiants dans différentes matières.
Certains choix dans l'écriture de cette petite application sont discutables mais visent à illustrer plusieurs notions 
clés de la POO.

##### Les classes de base

###### Classe `Matiere`

Écrire la classe `Matiere` qui contient une chaîne de caractères représentant l'intitulé d'une matière, et un décimal 
(type `double`) représentant un coefficient de pondération. 
Ces données doivent être **privées**.
Proposer un constructeur à 2 arguments pour cette classe (**Astuce** : utilisez les facilités d'IntelliJ avec la 
combinaison `Alt+Insert` (raccourci clavier pour le menu *Code* puis *Generate*) pour ouvrir une popup de génération de 
code et laissez-vous guider).

Refuser la construction si l'intitulé est `null` ou vide, en levant une `IllegalArgumentException`.

Redéfinir la méthode `toString()` (héritée de la classe `Object`) pour qu'elle renvoie la chaîne : 
`Matiere : '<intitule>', coeff=<coeff>`, où `<intitule>` et `<coeff>` correspondent aux données membres de `Matiere`.

###### Classe `Main`

Écrire la classe `Main` qui va servir à vérifier le fonctionnement de nos classes et de l'application.
Rendre cette classe exécutable en définissant la méthode publique et statique `main()` (Astuce : rappelez-vous du 
raccourci `psvm`...).

Dans cette méthode `main()` :
- tenter de créer une instance de `Matiere` avec un intitulé vide ou `null`. 
Capturer l'exception qui devrait être levée et afficher un message indiquant que tout est sous contrôle ainsi 
que le message contenu dans l'exception.
(Astuce : rappelez-vous le raccourci `sout` pour l'affichage sur la console...)
- créer une autre instance de `Matiere` avec l'intitulé `IHM` et faire afficher la chaîne correspondant à cet objet.
(Il n'est pas nécessaire de faire appel explicitement à sa méthode `toString()`. 
Java s'en charge si l'instance apparaît là où un objet `String` est attendu).

###### Classe `Note`

Écrire la classe `Note` qui contient une référence sur la matière concernée et un décimal qui représente la valeur de 
la note.
Ces données doivent être **privées**.
Proposer un constructeur à 2 arguments pour cette classe.

Redéfinir la méthode `toString()` pour qu'elle renvoie la chaîne : 
`Note (<intitule>) : <valeur>`, où `<intitule>` est l'intitulé de la matière et `<valeur>` est la valeur de la note.

L'intitulé d'une matière n'étant pas accessible directement, le code précédent n'est pas correct. 
Corriger le problème en ajoutant dans la classe `Matiere` les accesseurs de ses données membre : `getIntitule()` et 
`getCoeff()` (penser au raccourci `Alt+Insert`).

Ajouter aussi à la classe `Note` les accesseurs `getMatiere()` et `getValeur()`. 

Dans la méthode `main()` de `Main`, vérifier que l'on peut bien créer une note et l'afficher.

###### Classe `TableauDeNotes`

Écrire la classe `TableauDeNotes` qui **dérive** (étend) de la collection `ArrayList`.
La doter de la méthode `ajouter()` qui ajoute une note dans le tableau de notes : la méthode n'ajoute que des 
objets `Note` et les insère dans l'`ArrayList` (Rappel : la méthode s'applique à une instance de `TableauDeNotes` qui 
**est aussi** un `ArrayList`).

###### Classe `TableauDeNotes`

Écrire la classe `Etudiant` qui contient un nom (chaîne de caractères) et un objet `TableauDeNotes`. 
Proposer un constructeur à un argument (le nom).

Ajouter à la classe `Etudiant` une méthode `noter()` à deux arguments : 
- le premier précisant la matière (une référence sur un objet de la classe `Matière`)
- l'autre la valeur que l'étudiant a eu dans cette matière. 
Cette méthode met à jour le tableau de notes de l'étudiant.

Ajouter à cette classe une méthode `listerNotes()` qui affiche le nom puis la liste de toutes les notes de l’étudiant.

###### Mise à jour du `main()`

Modifier la méthode `main()` de la classe `Main` afin qu'elle crée deux matières et un étudiant, 
puis ajoute les notes de cet étudiant dans ces 2 matières, et enfin affiche la liste des notes de cet étudiant.

##### Calcul des moyennes

###### Classe `MoyenneArithmetique`

Écrire la classe `MoyenneArithmetique` qui fournit la méthode `calculer()` ayant comme paramètre un objet 
`TableauDeNotes` et qui retourne un décimal.
Cette méthode calculera la moyenne arithmétique (non pondérée) des notes.

###### Classe `MoyennePonderee`

Écrire la classe `MoyennePonderee` qui fournit aussi une méthode `calculer()` ayant comme paramètre un objet 
`TableauDeNotes` et qui retourne un décimal.
Comme son nom l'indique, cette méthode calculera la moyenne pondérée des notes.

###### Évolution de la classe `Etudiant`

Ajouter à la classe `Etudiant` la méthode `moyenne()` qui prend comme seul argument une instance de l'une des classes
de calcul de la moyenne.
Cette méthode doit retourner un décimal, résultat de l'appel de la méthode `calculer()` invoquée sur l'objet passé en 
paramètre.

Remarque : vous pouvez (devez ?) restructurer le code précédemment écrit sans pour autant modifier les méthodes...

Compléter la méthode `main()` pour tester.

##### Gestion des exceptions

###### Classe `NoteException`

Écrire la classe `NoteException`, dérivée de `Exception`, qui représentera toutes les exceptions liées aux notes.

Remarque : cette classe, ayant pour seul objectif la généralisation de ce type d'exception, ne devrait pas pouvoir être 
instanciée directement... 

###### Classe `ValeurNoteIncorrecteException`

Écrire la classe `ValeurNoteIncorrecteException` qui étend la classe précédente (en la concrétisant) pour représenter 
l'exception qui sera levée par la méthode `noter()` si la valeur de la note est incorrecte (voir ci-dessous). 

Dans la classe `Etudiant`, copier la méthode `noter()` en `noterV1()` afin de la sauvegarder.
Modifier `noter()` de façon à ce qu'elle lève une `ValeurNoteIncorrecteException` si la note est inférieure à 0 ou 
supérieure à 20.
Le message de l'exception doit préciser la valeur de la note et qu'elle est incorrecte 
(par exemple : "21 est une valeur incorrecte").

Dans la classe `Main`, copier la méthode `main()` en `mainV1()` afin de la sauvegarder.
Modifier la méthode `main()` de façon à ce qu'elle gère l'exception et affiche le message qu'elle véhicule.

###### Classe `NoteDejaExistanteException`

Écrire la classe `NoteDejaExistanteException` qui étend aussi la classe `NoteException` pour représenter 
l'exception qui sera levée par la méthode `noter()` si l'on tente de noter une seconde fois un étudiant sur une même 
matière.
Cette classe aura un constructeur **sans argument**, mais initialisera le message de sa classe de base avec la chaîne 
`"Cet etudiant a déjà une note dans cette matière"`.
 
Dans la classe `Etudiant`, copier la méthode `noter()` en `noterV2()` afin de la sauvegarder.
Modifier `noter()` de façon à ce qu'elle lève une `NoteDejaExistanteException` si l'étudiant a déjà une note dans la
matière que l'on souhaite noter.
 
Dans la classe `Main`, copier la méthode `main()` en `mainV2()` afin de la sauvegarder.
Modifier la méthode `main()` de façon à ce qu'elle gère cette exception et affiche le message qu'elle véhicule.


### A SUIVRE