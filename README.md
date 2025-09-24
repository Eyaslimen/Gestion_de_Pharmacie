
# Gestion_de_Pharmacie
Plateforme console/Java pour gérer les opérations d’une pharmacie: produits, clients, commandes, factures, conseils et questions, avec rôles (Gérant, Pharmacien, Employé). Le projet est un backend Java 17 (Maven) qui se connecte à MySQL via JDBC.

## Description du projet

Gestion_de_Pharmacie est une application de gestion qui permet:
- De centraliser les données des produits, clients et employés.
- De créer et suivre des commandes et leurs lignes, puis générer des factures.
- D’enregistrer des conseils/FAQ et gérer des questions de clients.
- D’administrer les rôles utilisateurs et leurs accès de base.

### Rôles utilisateurs
- **Gérant**:  gère les employés et le catalogue, consulte les rapports.
- **Pharmacien**: gère les produits, valide les commandes, édite les conseils.
- **Employé**: saisit des clients/commandes, répond aux questions.

## Fonctionnalités

- **Gestion des produits**
  - CRUD produits (via `ProduitDao` et `GestionProduits`)
  - Recherche/consultation du stock
- **Gestion des clients**
  - CRUD clients (`Client`, `GestionClients`)
- **Gestion des commandes et factures**
  - Création de commandes et lignes (`Commande`, `LigneCommande`, `GestionCommandes`)
  - Génération/consultation des factures (`Facture`, `GestionFactures`)
  - Suivi des statuts (`Etat`)
- **Conseils et questions**
  - Ajout/édition de conseils (`GestionConseils`)
  - Gestion des questions clients (`GestionQuestions`)
- **Gestion des employés/utilisateurs**
  - CRUD employés (`GestionEmployes`)
  - Opérations utilisateurs de base (`GestionsUtilisateurs`)

## Prérequis

- Java 17 (JDK 17)
- Maven 3.9+
- MySQL Server 8.x
- Accès à une base `gestion_de_pharmacie` (ou nom équivalent)

## Démarrage rapide

### 1) Configuration de la base de données (MySQL)

1. Créer une base de données (si elle n’existe pas):
```sql
CREATE DATABASE gestion_de_pharmacie;
```
2. Ajuster l’URL, l’utilisateur et le mot de passe dans `src/main/java/pharmacie/Database/DatabaseConnection.java`:
```java
private static final String URL = "jdbc:mysql://localhost:3305/gestion_de_pharmacie";
private static final String USER = "root";
private static final String PASSWORD = "<votre_mot_de_passe>";
```
- Remarque: le port MySQL par défaut est 3306.

### 2) Construire l’application (Maven)

```bash
mvn clean package
```
- Le JAR est généré dans `target/gestion_de_pharmacie-1.0-SNAPSHOT.jar`.

### 3) Lancer l’application

```bash
java -jar target/gestion_de_pharmacie-1.0-SNAPSHOT.jar
```



## Démo

[Voir la vidéo](https://drive.google.com/file/d/10vqDJFZbU3cwFiGbmV9QIvqw2n30bJa0/view?usp=sharing)

