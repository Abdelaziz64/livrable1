Feature: Modifier une équipe

  Scenario: Modifier le nom d'une équipe existante
    Given l'utilisateur est authentifié
    And une équipe nommée "Les Étoiles" existe
    When il modifie le nom de l'équipe en "Les Légendes"
    Then le nom de l'équipe est modifié avec succès en "Les Légendes"

