Feature: Modifier les détails d'une équipe

  Scenario: Modifier la description d'une équipe existante
    Given l'utilisateur est authentifié
    And une équipe nommée "Les Étoiles" existe
    When il modifie la description de l'équipe en "Nouvelle description"
    Then la description de l'équipe est modifiée avec succès

