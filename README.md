# Tp_ecole_amani-zoghbi
TP Java : POO - Gestion des personnes d'un établissement
Description

Ce projet Java, réalisé sous Eclipse, modélise les personnes d'un établissement scolaire : des étudiants et des enseignants. Tous ont un nom, un prénom et un email, mais chacun a un comportement propre. L'application affiche les informations de chaque personne selon son rôle.

Objectifs pédagogiques
Définir une classe avec attributs, constructeur, getters et méthodes
Utiliser l'héritage (extends, super)
Redéfinir des méthodes (@Override) et exploiter le polymorphisme
Utiliser une classe abstraite
Créer un projet Java sous Eclipse, l'exécuter et le publier sur GitHub
Structure du projet
TP_Ecole_NomPrenom
└── src
    └── ecole
        ├── Personne.java
        ├── Etudiant.java
        ├── Enseignant.java
        ├── Cours.java
        └── Main.java
Description des classes
Classe	Rôle
Personne (abstraite)	Attributs privés nom, prenom, email, constructeur, getters. Méthode abstraite getRole() et méthode afficheInfos() qui affiche le rôle, le nom, le prénom et l'email.
Etudiant	Hérite de Personne. Ajoute un matricule et un tableau de notes. Méthodes ajouterNote(double) et calculerMoyenne(). Redéfinit getRole() et afficheInfos().
Enseignant	Hérite de Personne. Ajoute une specialite et un nombre d'heures nbHeures. Redéfinit getRole() et afficheInfos().
Cours	(Bonus) Un intitulé, un enseignant responsable et un tableau d'étudiants inscrits. La méthode afficherMeilleurEtudiant() affiche l'étudiant avec la meilleure moyenne.
Main	Crée un tableau Personne[] de 2 étudiants et 2 enseignants, puis appelle afficheInfos() sur chaque élément. Crée aussi un cours et affiche son meilleur étudiant.
Concepts utilisés
Classe abstraite : Personne ne peut pas être instanciée directement.
Héritage : Etudiant et Enseignant étendent Personne avec extends et appellent le constructeur parent avec super(...).
Polymorphisme : dans Main, le tableau est de type Personne[], mais l'appel à afficherInfos() exécute la version de la sous-classe réelle (liaison dynamique).
Redéfinition : @Override sur getRole() et afficheInfos().
Exécution
Ouvrir le projet dans Eclipse (File > Import > Existing Projects into Workspace).
Clic droit sur Main.java > Run As > Java Application.
Exemple de résultat
Rôle : Etudiant
Nom : Diallo
Prénom : Aminata
Email : a.diallo@ecole.fr
Matricule : E001
Moyenne : 15.0

Rôle : Enseignant
Nom : Durand
Prénom : Marie
Email : m.durand@ecole.fr
Spécialité : Java
Heures : 40

...

Cours : Programmation Java
Enseignant : Durand
Meilleur étudiant : Diallo Aminata (moyenne : 15.0)
Outils
Java (JDK)
Eclipse IDE
Git / GitHub
Auteur

Amani zZoghbi - TP Java : POO
